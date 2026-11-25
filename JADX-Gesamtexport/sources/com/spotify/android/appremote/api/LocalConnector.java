package com.spotify.android.appremote.api;

import J2.b;
import android.content.Context;
import com.spotify.android.appremote.api.error.AuthenticationFailedException;
import com.spotify.android.appremote.api.error.CouldNotFindSpotifyApp;
import com.spotify.android.appremote.api.error.NotLoggedInException;
import com.spotify.android.appremote.api.error.OfflineModeException;
import com.spotify.android.appremote.api.error.SpotifyConnectionTerminatedException;
import com.spotify.android.appremote.api.error.SpotifyRemoteServiceException;
import com.spotify.android.appremote.api.error.UnsupportedFeatureVersionException;
import com.spotify.android.appremote.api.error.UserNotAuthorizedException;
import com.spotify.android.appremote.internal.ConnectApiImpl;
import com.spotify.android.appremote.internal.ContentApiImpl;
import com.spotify.android.appremote.internal.ImagesApiImpl;
import com.spotify.android.appremote.internal.PlayerApiImpl;
import com.spotify.android.appremote.internal.SdkRemoteClientConnector;
import com.spotify.android.appremote.internal.SdkRemoteClientConnectorFactory;
import com.spotify.android.appremote.internal.SpotifyAppRemoteIsConnectedRule;
import com.spotify.android.appremote.internal.SpotifyLocator;
import com.spotify.android.appremote.internal.StrictRemoteClient;
import com.spotify.android.appremote.internal.UserApiImpl;
import com.spotify.protocol.AppProtocol;
import com.spotify.protocol.client.Coding;
import com.spotify.protocol.client.Debug;
import com.spotify.protocol.client.RemoteClient;
import com.spotify.protocol.client.RemoteClientConnector;
import com.spotify.protocol.client.Subscription;
import com.spotify.protocol.client.error.RemoteClientException;
import com.spotify.protocol.error.SpotifyAppRemoteException;
import com.spotify.protocol.types.UserStatus;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class LocalConnector implements Connector {
    private final SdkRemoteClientConnectorFactory mSdkRemoteClientConnectorFactory;
    private final SpotifyLocator mSpotifyLocator;

    /* JADX INFO: renamed from: com.spotify.android.appremote.api.LocalConnector$1, reason: invalid class name */
    public class AnonymousClass1 implements RemoteClientConnector.ConnectionCallback {
        final /* synthetic */ Connector.ConnectionListener val$connectionListener;
        final /* synthetic */ SdkRemoteClientConnector val$remoteClientConnector;

        public AnonymousClass1(SdkRemoteClientConnector sdkRemoteClientConnector, Connector.ConnectionListener connectionListener) {
            this.val$remoteClientConnector = sdkRemoteClientConnector;
            this.val$connectionListener = connectionListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onConnected$0(SpotifyAppRemote spotifyAppRemote, Connector.ConnectionListener connectionListener) {
            spotifyAppRemote.disconnectRemoteClient();
            connectionListener.onFailure(new SpotifyConnectionTerminatedException());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onConnected$1(Connector.ConnectionListener connectionListener, SpotifyAppRemote spotifyAppRemote, UserStatus userStatus) {
            Debug.d("LoggedIn:%s", Boolean.valueOf(userStatus.isLoggedIn()));
            if (userStatus.isLoggedIn()) {
                connectionListener.onConnected(spotifyAppRemote);
            } else {
                connectionListener.onFailure(new NotLoggedInException("The user must go to the Spotify and log-in", new Throwable("The user must go to the Spotify and log-in")));
            }
        }

        @Override // com.spotify.protocol.client.RemoteClientConnector.ConnectionCallback
        public void onConnected(RemoteClient remoteClient) {
            StrictRemoteClient strictRemoteClient = new StrictRemoteClient(remoteClient);
            SpotifyAppRemote spotifyAppRemote = new SpotifyAppRemote(strictRemoteClient, new PlayerApiImpl(strictRemoteClient), new ImagesApiImpl(strictRemoteClient), new UserApiImpl(strictRemoteClient), new ContentApiImpl(strictRemoteClient), new ConnectApiImpl(strictRemoteClient), this.val$remoteClientConnector);
            spotifyAppRemote.setConnected(true);
            strictRemoteClient.addRule(new SpotifyAppRemoteIsConnectedRule(spotifyAppRemote));
            this.val$remoteClientConnector.setConnectionTerminatedListener(new a(spotifyAppRemote, this.val$connectionListener));
            Subscription<UserStatus> subscriptionSubscribeToUserStatus = spotifyAppRemote.getUserApi().subscribeToUserStatus();
            subscriptionSubscribeToUserStatus.setEventCallback(new a(this.val$connectionListener, spotifyAppRemote));
            Connector.ConnectionListener connectionListener = this.val$connectionListener;
            connectionListener.getClass();
            subscriptionSubscribeToUserStatus.setErrorCallback(new b(8, connectionListener));
        }

        @Override // com.spotify.protocol.client.RemoteClientConnector.ConnectionCallback
        public void onConnectionFailed(Throwable th) {
            Debug.d(th, "Connection failed.", new Object[0]);
            this.val$remoteClientConnector.disconnect();
            this.val$connectionListener.onFailure(LocalConnector.asAppRemoteException(th));
        }
    }

    public LocalConnector(SpotifyLocator spotifyLocator, SdkRemoteClientConnectorFactory sdkRemoteClientConnectorFactory) {
        this.mSpotifyLocator = spotifyLocator;
        this.mSdkRemoteClientConnectorFactory = sdkRemoteClientConnectorFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Throwable asAppRemoteException(Throwable th) {
        String reasonUri = th instanceof RemoteClientException ? ((RemoteClientException) th).getReasonUri() : null;
        String message = th.getMessage();
        if (th instanceof SpotifyRemoteServiceException) {
            return th;
        }
        if (AppProtocol.ErrorUri.ERROR_AUTHENTICATION_FAILED.equals(reasonUri)) {
            return new AuthenticationFailedException(message, th);
        }
        if (AppProtocol.ErrorUri.ERROR_FEATURE_VERSION_MISMATCH.equals(reasonUri)) {
            return new UnsupportedFeatureVersionException(message, th);
        }
        if (AppProtocol.ErrorUri.ERROR_OFFLINE_MODE_ACTIVE.equals(reasonUri)) {
            return new OfflineModeException(message, th);
        }
        if (AppProtocol.ErrorUri.ERROR_USER_NOT_AUTHORIZED.equals(reasonUri)) {
            return new UserNotAuthorizedException(message, th);
        }
        return AppProtocol.ErrorUri.ERROR_NOT_LOGGED_IN.equals(reasonUri) ? new NotLoggedInException(message, th) : new SpotifyAppRemoteException(message, th);
    }

    @Override // com.spotify.android.appremote.api.Connector
    public void connect(@Nullable Context context, @Nullable ConnectionParams connectionParams, @Nullable Connector.ConnectionListener connectionListener) {
        if (!this.mSpotifyLocator.isSpotifyInstalled(context)) {
            connectionListener.onFailure(new CouldNotFindSpotifyApp());
            return;
        }
        try {
            SdkRemoteClientConnector sdkRemoteClientConnector = (SdkRemoteClientConnector) Coding.checkNotNull(this.mSdkRemoteClientConnectorFactory.newConnector(context, connectionParams, this.mSpotifyLocator.getSpotifyBestPackageName(context)));
            sdkRemoteClientConnector.connect(new AnonymousClass1(sdkRemoteClientConnector, connectionListener));
        } catch (CouldNotFindSpotifyApp e6) {
            connectionListener.onFailure(e6);
        }
    }

    @Override // com.spotify.android.appremote.api.Connector
    public void disconnect(SpotifyAppRemote spotifyAppRemote) {
        if (spotifyAppRemote != null) {
            spotifyAppRemote.disconnectRemoteClient();
        }
    }
}

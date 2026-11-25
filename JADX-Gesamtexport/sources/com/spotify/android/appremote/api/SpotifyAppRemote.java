package com.spotify.android.appremote.api;

import android.content.Context;
import com.spotify.android.appremote.internal.AppRemoteDebugImpl;
import com.spotify.android.appremote.internal.SdkRemoteClientConnectorFactory;
import com.spotify.android.appremote.internal.SpotifyLocator;
import com.spotify.protocol.client.CallResult;
import com.spotify.protocol.client.Debug;
import com.spotify.protocol.client.RemoteClient;
import com.spotify.protocol.client.RemoteClientConnector;
import com.spotify.protocol.client.Subscription;
import com.spotify.protocol.types.Item;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class SpotifyAppRemote implements AppRemote {
    private static final Connector CONNECTOR;
    private static final SpotifyLocator SPOTIFY_LOCATOR;
    private static boolean sIsDebug;
    private final ConnectApi mConnectApi;
    private final ContentApi mContentApi;
    private final ImagesApi mImagesApi;
    private volatile boolean mIsConnected;
    private final PlayerApi mPlayerApi;
    private final RemoteClient mRemoteClient;
    private final RemoteClientConnector mRemoteClientConnector;
    private final UserApi mUserApi;

    static {
        SpotifyLocator spotifyLocator = new SpotifyLocator();
        SPOTIFY_LOCATOR = spotifyLocator;
        CONNECTOR = new LocalConnector(spotifyLocator, new SdkRemoteClientConnectorFactory());
        AppRemoteDebugImpl appRemoteDebugImpl = new AppRemoteDebugImpl();
        Debug.setLogger(appRemoteDebugImpl);
        Debug.setAssertion(appRemoteDebugImpl);
    }

    public SpotifyAppRemote(RemoteClient remoteClient, PlayerApi playerApi, ImagesApi imagesApi, UserApi userApi, ContentApi contentApi, ConnectApi connectApi, RemoteClientConnector remoteClientConnector) {
        this.mRemoteClient = remoteClient;
        this.mPlayerApi = playerApi;
        this.mImagesApi = imagesApi;
        this.mUserApi = userApi;
        this.mContentApi = contentApi;
        this.mConnectApi = connectApi;
        this.mRemoteClientConnector = remoteClientConnector;
    }

    public static void connect(Context context, ConnectionParams connectionParams, Connector.ConnectionListener connectionListener) {
        CONNECTOR.connect(context, connectionParams, connectionListener);
    }

    public static void disconnect(SpotifyAppRemote spotifyAppRemote) {
        if (spotifyAppRemote == null || !spotifyAppRemote.isConnected()) {
            return;
        }
        CONNECTOR.disconnect(spotifyAppRemote);
    }

    public static boolean isDebugMode() {
        return sIsDebug;
    }

    public static boolean isSpotifyInstalled(Context context) {
        return SPOTIFY_LOCATOR.isSpotifyInstalled(context);
    }

    public static void setDebugMode(boolean z5) {
        sIsDebug = z5;
    }

    @Override // com.spotify.android.appremote.api.AppRemote
    @Nonnull
    public <T extends Item, S extends Item> CallResult<T> call(@Nullable String str, @Nullable S s6, @Nullable Class<T> cls) {
        return this.mRemoteClient.call(str, s6, cls);
    }

    public void disconnectRemoteClient() {
        this.mIsConnected = false;
        this.mRemoteClient.goodbye();
        this.mRemoteClientConnector.disconnect();
    }

    @Override // com.spotify.android.appremote.api.AppRemote
    @Nonnull
    public ConnectApi getConnectApi() {
        return this.mConnectApi;
    }

    @Override // com.spotify.android.appremote.api.AppRemote
    @Nonnull
    public ContentApi getContentApi() {
        return this.mContentApi;
    }

    @Override // com.spotify.android.appremote.api.AppRemote
    @Nonnull
    public ImagesApi getImagesApi() {
        return this.mImagesApi;
    }

    @Override // com.spotify.android.appremote.api.AppRemote
    @Nonnull
    public PlayerApi getPlayerApi() {
        return this.mPlayerApi;
    }

    @Override // com.spotify.android.appremote.api.AppRemote
    @Nonnull
    public UserApi getUserApi() {
        return this.mUserApi;
    }

    @Override // com.spotify.android.appremote.api.AppRemote
    public boolean isConnected() {
        return this.mIsConnected;
    }

    public void setConnected(boolean z5) {
        this.mIsConnected = z5;
    }

    @Override // com.spotify.android.appremote.api.AppRemote
    @Nonnull
    public <T extends Item> Subscription<T> subscribe(@Nullable String str, @Nullable Class<T> cls) {
        return this.mRemoteClient.subscribe(str, cls);
    }
}

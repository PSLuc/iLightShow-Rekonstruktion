package com.spotify.android.appremote.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.spotify.android.appremote.api.ImagesApi;
import com.spotify.protocol.AppProtocol;
import com.spotify.protocol.client.CallResult;
import com.spotify.protocol.client.Coding;
import com.spotify.protocol.client.RemoteClient;
import com.spotify.protocol.client.ResultUtils;
import com.spotify.protocol.types.Image;
import com.spotify.protocol.types.ImageIdentifier;
import com.spotify.protocol.types.ImageUri;
import com.spotify.protocol.types.Types;

/* JADX INFO: loaded from: classes.dex */
public class ImagesApiImpl implements ImagesApi {
    private final RemoteClient mRemoteClient;

    public ImagesApiImpl(RemoteClient remoteClient) {
        this.mRemoteClient = (RemoteClient) Coding.checkNotNull(remoteClient);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getImage$0(CallResult callResult, Image image) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            byte[] bArr = image.imageData;
            callResult.deliverResult(ResultUtils.createSuccessfulResult(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options)));
        } catch (Exception e6) {
            callResult.deliverError(e6);
        }
    }

    @Override // com.spotify.android.appremote.api.ImagesApi
    public CallResult<Bitmap> getImage(ImageUri imageUri) {
        return getImage(imageUri, Image.Dimension.LARGE);
    }

    @Override // com.spotify.android.appremote.api.ImagesApi
    public CallResult<Bitmap> getImage(ImageUri imageUri, Image.Dimension dimension) {
        CallResult callResultCall = this.mRemoteClient.call(AppProtocol.CallUri.GET_IMAGE, new ImageIdentifier(imageUri.raw, dimension), Image.class);
        CallResult<Bitmap> callResult = new CallResult<>(Types.RequestId.NONE);
        callResultCall.setResultCallback(new a(callResult));
        callResultCall.setErrorCallback(new a(callResult));
        return callResult;
    }
}

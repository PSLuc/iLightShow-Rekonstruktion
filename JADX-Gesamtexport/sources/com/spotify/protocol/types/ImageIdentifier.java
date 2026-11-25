package com.spotify.protocol.types;

import S1.I;
import S1.InterfaceC0361x;
import com.spotify.sdk.android.auth.AuthorizationClient;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
public class ImageIdentifier implements Item {

    @I("height")
    public final int height;

    @I(AuthorizationClient.PlayStoreParams.ID)
    public final String id;

    @I("width")
    public final int width;

    public ImageIdentifier(String str, Image.Dimension dimension) {
        this.id = str;
        this.width = dimension.getValue();
        this.height = dimension.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageIdentifier)) {
            return false;
        }
        ImageIdentifier imageIdentifier = (ImageIdentifier) obj;
        String str = this.id;
        if (str == null ? imageIdentifier.id == null : str.equals(imageIdentifier.id)) {
            return this.height == imageIdentifier.height && this.width == imageIdentifier.width;
        }
        return false;
    }

    public int hashCode() {
        String str = this.id;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.height) * 31) + this.width;
    }
}

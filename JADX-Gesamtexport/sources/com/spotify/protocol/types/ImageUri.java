package com.spotify.protocol.types;

import com.spotify.protocol.mappers.jackson.ImageUriJson;
import javax.annotation.Nullable;
import p012c.k;
import p020d2.e;
import p020d2.j;

/* JADX INFO: loaded from: classes.dex */
@j(using = ImageUriJson.Serializer.class)
@e(using = ImageUriJson.Deserializer.class)
public class ImageUri implements Item {

    @Nullable
    public final String raw;

    private ImageUri() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageUri)) {
            return false;
        }
        ImageUri imageUri = (ImageUri) obj;
        String str = this.raw;
        return str == null ? imageUri.raw == null : str.equals(imageUri.raw);
    }

    public int hashCode() {
        String str = this.raw;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return k.u(new StringBuilder("ImageId{"), this.raw, "'}");
    }

    public ImageUri(String str) {
        this.raw = str;
    }
}

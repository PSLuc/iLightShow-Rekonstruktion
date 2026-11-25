package com.spotify.protocol.types;

import B.AbstractC0013g0;
import S1.I;
import S1.InterfaceC0361x;
import java.util.Arrays;
import p110u3.c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
public class Image implements Item {

    @c("height")
    @I("height")
    public final int height;

    @c("image_data")
    @I("image_data")
    public final byte[] imageData;

    @c("width")
    @I("width")
    public final int width;

    public enum Dimension {
        LARGE(720),
        MEDIUM(480),
        SMALL(360),
        X_SMALL(240),
        THUMBNAIL(144);

        private final int mValue;

        Dimension(int i) {
            this.mValue = i;
        }

        public int getValue() {
            return this.mValue;
        }
    }

    private Image() {
        this(null, 0, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Image)) {
            return false;
        }
        Image image = (Image) obj;
        if (this.width == image.width && this.height == image.height) {
            return Arrays.equals(this.imageData, image.imageData);
        }
        return false;
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.imageData) * 31) + this.width) * 31) + this.height;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Image{imageData=");
        sb.append(Arrays.toString(this.imageData));
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        return AbstractC0013g0.k(sb, this.height, '}');
    }

    public Image(byte[] bArr, int i, int i3) {
        this.imageData = bArr;
        this.width = i;
        this.height = i3;
    }
}

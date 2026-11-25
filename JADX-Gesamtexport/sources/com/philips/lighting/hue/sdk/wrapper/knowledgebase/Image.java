package com.philips.lighting.hue.sdk.wrapper.knowledgebase;

import com.philips.lighting.hue.sdk.wrapper.SDKSerializable;
import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.Arrays;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class Image extends SDKSerializable {
    private byte[] color;
    private byte[] identifier;
    private byte[] type;
    private byte[] uri;
    private byte[] version;

    private Image(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.identifier = bArr;
        this.type = bArr2;
        this.color = bArr3;
        this.uri = bArr4;
        this.version = bArr5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Image image = (Image) obj;
        return Arrays.equals(this.color, image.color) && Arrays.equals(this.identifier, image.identifier) && Arrays.equals(this.type, image.type) && Arrays.equals(this.uri, image.uri) && Arrays.equals(this.version, image.version);
    }

    public String getColor() {
        return NativeTools.BytesToString(this.color);
    }

    public String getIdentifier() {
        return NativeTools.BytesToString(this.identifier);
    }

    public String getType() {
        return NativeTools.BytesToString(this.type);
    }

    public String getUri() {
        return NativeTools.BytesToString(this.uri);
    }

    public String getVersion() {
        return NativeTools.BytesToString(this.version);
    }

    public int hashCode() {
        return Arrays.hashCode(this.version) + k.n(this.uri, k.n(this.type, k.n(this.identifier, k.n(this.color, 31, 31), 31), 31), 31);
    }
}

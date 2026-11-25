package com.philips.lighting.hue.sdk.wrapper.knowledgebase;

import com.philips.lighting.hue.sdk.wrapper.SDKSerializable;
import com.philips.lighting.hue.sdk.wrapper.domain.clip.GamutType;
import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Gamut extends SDKSerializable {
    private List<GamutColor> colorPoints;
    private GamutType gamutType;

    @Deprecated
    private byte[] identifier;

    @Deprecated
    private Gamut(byte[] bArr, GamutColor[] gamutColorArr) {
        this.identifier = null;
        this.gamutType = GamutType.Other;
        this.identifier = bArr;
        this.colorPoints = new ArrayList(Arrays.asList(gamutColorArr));
        this.gamutType = GamutType.fromDescription(NativeTools.BytesToString(bArr));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Gamut gamut = (Gamut) obj;
        List<GamutColor> list = this.colorPoints;
        if (list == null) {
            if (gamut.colorPoints != null) {
                return false;
            }
        } else if (!list.equals(gamut.colorPoints)) {
            return false;
        }
        return this.gamutType == gamut.gamutType;
    }

    public List<GamutColor> getColorPoints() {
        return this.colorPoints;
    }

    @Deprecated
    public String getIdentifier() {
        return this.gamutType.getDescription();
    }

    public GamutType getType() {
        return this.gamutType;
    }

    public int hashCode() {
        List<GamutColor> list = this.colorPoints;
        return this.gamutType.getDescription().hashCode() + (((list == null ? 0 : list.hashCode()) + 31) * 31);
    }

    private Gamut(GamutType gamutType, GamutColor[] gamutColorArr) {
        this.identifier = null;
        this.gamutType = GamutType.Other;
        this.identifier = NativeTools.StringToBytes(gamutType.getDescription());
        this.colorPoints = new ArrayList(Arrays.asList(gamutColorArr));
        this.gamutType = gamutType;
    }
}

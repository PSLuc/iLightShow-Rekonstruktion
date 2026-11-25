package com.philips.lighting.hue.sdk.wrapper.knowledgebase;

import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class LightInfo extends DeviceInfo {
    private List<Image> images;

    @Deprecated
    private List<ParameterRange> parameterRanges;
    private Gamut gamut = null;
    private byte[] modelIdentifier = null;
    private byte[] swVersion = null;
    private byte[] lightType = null;
    private Integer maxLumen = null;
    private Integer minDimLevel = null;
    private Integer minCTRange = null;
    private Integer maxCTRange = null;

    private LightInfo() {
        this.parameterRanges = null;
        this.images = null;
        this.parameterRanges = new ArrayList();
        this.images = new ArrayList();
    }

    private void setImages(Image[] imageArr) {
        this.images = new ArrayList(Arrays.asList(imageArr));
    }

    private void setMaxCTRange(int i) {
        if (i >= 0) {
            this.maxCTRange = new Integer(i);
        } else {
            this.maxCTRange = null;
        }
    }

    private void setMaxLumen(int i) {
        if (i >= 0) {
            this.maxLumen = new Integer(i);
        } else {
            this.maxLumen = null;
        }
    }

    private void setMinCTRange(int i) {
        if (i >= 0) {
            this.minCTRange = new Integer(i);
        } else {
            this.minCTRange = null;
        }
    }

    private void setMinDimLevel(int i) {
        if (i >= 0) {
            this.minDimLevel = new Integer(i);
        } else {
            this.minDimLevel = null;
        }
    }

    @Deprecated
    private void setParameterRanges(ParameterRange[] parameterRangeArr) {
        this.parameterRanges = new ArrayList(Arrays.asList(parameterRangeArr));
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.knowledgebase.DeviceInfo
    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LightInfo lightInfo = (LightInfo) obj;
        Gamut gamut = this.gamut;
        if (gamut == null) {
            if (lightInfo.gamut != null) {
                return false;
            }
        } else if (!gamut.equals(lightInfo.gamut)) {
            return false;
        }
        List<Image> list = this.images;
        if (list == null) {
            if (lightInfo.images != null) {
                return false;
            }
        } else if (!list.equals(lightInfo.images)) {
            return false;
        }
        if (!Arrays.equals(this.lightType, lightInfo.lightType) || !Arrays.equals(this.modelIdentifier, lightInfo.modelIdentifier)) {
            return false;
        }
        List<ParameterRange> list2 = this.parameterRanges;
        if (list2 == null) {
            if (lightInfo.parameterRanges != null) {
                return false;
            }
        } else if (!list2.equals(lightInfo.parameterRanges)) {
            return false;
        }
        if (!Arrays.equals(this.swVersion, lightInfo.swVersion)) {
            return false;
        }
        Integer num5 = this.maxLumen;
        if ((num5 == null && lightInfo.maxLumen != null) || (num5 != null && lightInfo.maxLumen == null)) {
            return false;
        }
        if (num5 != null && (num4 = lightInfo.maxLumen) != null && !num5.equals(num4)) {
            return false;
        }
        Integer num6 = this.minDimLevel;
        if ((num6 == null && lightInfo.minDimLevel != null) || (num6 != null && lightInfo.minDimLevel == null)) {
            return false;
        }
        if (num6 != null && (num3 = lightInfo.minDimLevel) != null && !num6.equals(num3)) {
            return false;
        }
        Integer num7 = this.minCTRange;
        if ((num7 == null && lightInfo.minCTRange != null) || (num7 != null && lightInfo.minCTRange == null)) {
            return false;
        }
        if (num7 != null && (num2 = lightInfo.minCTRange) != null && !num7.equals(num2)) {
            return false;
        }
        Integer num8 = this.maxCTRange;
        if ((num8 != null || lightInfo.maxCTRange == null) && (num8 == null || lightInfo.maxCTRange != null)) {
            return num8 == null || (num = lightInfo.maxCTRange) == null || num8.equals(num);
        }
        return false;
    }

    public Gamut getGamut() {
        return this.gamut;
    }

    public List<Image> getImages() {
        return this.images;
    }

    public String getLightType() {
        return NativeTools.BytesToString(this.lightType);
    }

    public Integer getMaxCTRange() {
        return this.maxCTRange;
    }

    public Integer getMaxLumen() {
        return this.maxLumen;
    }

    public Integer getMinCTRange() {
        return this.minCTRange;
    }

    public Integer getMinDimLevel() {
        return this.minDimLevel;
    }

    public String getModelIdentifier() {
        return NativeTools.BytesToString(this.modelIdentifier);
    }

    @Deprecated
    public ParameterRange getParameterRange(String str) {
        for (ParameterRange parameterRange : this.parameterRanges) {
            if (parameterRange.getParameterName().equals(str)) {
                return parameterRange;
            }
        }
        return null;
    }

    public List<ParameterRange> getParameterRanges() {
        return this.parameterRanges;
    }

    public String getSwVersion() {
        return NativeTools.BytesToString(this.swVersion);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.knowledgebase.DeviceInfo
    public int hashCode() {
        Gamut gamut = this.gamut;
        int iHashCode = ((gamut == null ? 0 : gamut.hashCode()) + 31) * 31;
        List<Image> list = this.images;
        int iN = k.n(this.modelIdentifier, k.n(this.lightType, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31), 31);
        List<ParameterRange> list2 = this.parameterRanges;
        int iN2 = k.n(this.swVersion, (iN + (list2 == null ? 0 : list2.hashCode())) * 31, 31);
        Integer num = this.maxLumen;
        int iIntValue = (iN2 + (num == null ? 0 : num.intValue())) * 31;
        Integer num2 = this.minDimLevel;
        int iIntValue2 = (iIntValue + (num2 == null ? 0 : num2.intValue())) * 31;
        Integer num3 = this.minCTRange;
        int iIntValue3 = (iIntValue2 + (num3 == null ? 0 : num3.intValue())) * 31;
        Integer num4 = this.maxCTRange;
        return iIntValue3 + (num4 != null ? num4.intValue() : 0);
    }
}

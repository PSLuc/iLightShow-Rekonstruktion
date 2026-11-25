package com.philips.lighting.hue.sdk.wrapper.domain.resource;

import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.Arrays;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class SceneAppData {
    private byte[] data;
    private Integer version;

    public SceneAppData(Integer num, String str) {
        this.data = null;
        this.version = null;
        setData(str);
        this.version = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SceneAppData sceneAppData = (SceneAppData) obj;
        if (!Arrays.equals(this.data, sceneAppData.data)) {
            return false;
        }
        Integer num = this.version;
        if (num == null) {
            if (sceneAppData.version != null) {
                return false;
            }
        } else if (!num.equals(sceneAppData.version)) {
            return false;
        }
        return true;
    }

    public String getData() {
        return NativeTools.BytesToString(this.data);
    }

    public Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iN = k.n(this.data, 31, 31);
        Integer num = this.version;
        return iN + (num == null ? 0 : num.hashCode());
    }

    public void setData(String str) {
        this.data = NativeTools.StringToBytes(str);
    }

    public void setVersion(Integer num) {
        this.version = num;
    }

    public void setVersion(int i) {
        this.version = new Integer(i);
    }

    public SceneAppData() {
        this.data = null;
        this.version = null;
    }
}

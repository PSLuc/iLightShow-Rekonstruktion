package com.philips.lighting.hue.sdk.wrapper.knowledgebase;

import com.philips.lighting.hue.sdk.wrapper.SDKSerializable;
import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ParameterRange extends SDKSerializable {
    private byte[] parameterName;
    private List<String> values = new ArrayList();

    private ParameterRange(byte[] bArr, byte[][] bArr2) {
        this.parameterName = bArr;
        for (byte[] bArr3 : bArr2) {
            this.values.add(NativeTools.BytesToString(bArr3));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ParameterRange parameterRange = (ParameterRange) obj;
        byte[] bArr = this.parameterName;
        if (bArr == null) {
            if (parameterRange.parameterName != null) {
                return false;
            }
        } else if (!bArr.equals(parameterRange.parameterName)) {
            return false;
        }
        List<String> list = this.values;
        if (list == null) {
            if (parameterRange.values != null) {
                return false;
            }
        } else if (!list.equals(parameterRange.values)) {
            return false;
        }
        return true;
    }

    public String getParameterName() {
        return NativeTools.BytesToString(this.parameterName);
    }

    public List<String> getValues() {
        return this.values;
    }

    public List<Integer> getValuesAsInt() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.values.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt(it.next())));
        }
        return arrayList;
    }

    public int hashCode() {
        byte[] bArr = this.parameterName;
        int iHashCode = ((bArr == null ? 0 : bArr.hashCode()) + 31) * 31;
        List<String> list = this.values;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}

package com.philips.lighting.hue.sdk.wrapper.utilities;

import com.philips.lighting.hue.sdk.wrapper.domain.ReturnCode;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class NativeTools {
    public static String BytesToString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public static byte[] StringToBytes(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e6) {
            e6.printStackTrace();
            return null;
        }
    }

    private static <T> List<T> arrayToList(T[] tArr) {
        return new ArrayList(Arrays.asList(tArr));
    }

    private static NetUtil getNetUtil() {
        return new NetUtil();
    }

    private static <T> Object[] listToArray(List<T> list) {
        return list.toArray();
    }

    private static ReturnCode resolveReturnCode(int i) {
        return ReturnCode.fromValue(i);
    }
}

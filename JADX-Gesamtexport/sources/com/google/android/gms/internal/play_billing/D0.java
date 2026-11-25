package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f7817a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f7818b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f7818b = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static int a(int i, byte[] bArr, int i3, int i6) {
        for (int i7 = i3; i7 < i3 + i6; i7++) {
            i = (i * 31) + bArr[i7];
        }
        return i;
    }
}

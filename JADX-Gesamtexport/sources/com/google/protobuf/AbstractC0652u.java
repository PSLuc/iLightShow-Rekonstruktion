package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.protobuf.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0652u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f8224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f8225b;

    static {
        Charset.forName("US-ASCII");
        f8224a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f8225b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            if (length < 0) {
                throw InvalidProtocolBufferException.b();
            }
            int i = (0 - 0) + length;
            if (i < 0) {
                throw InvalidProtocolBufferException.c();
            }
            if (i > Integer.MAX_VALUE) {
                throw InvalidProtocolBufferException.d();
            }
        } catch (InvalidProtocolBufferException e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public static int a(long j4) {
        return (int) (j4 ^ (j4 >>> 32));
    }
}

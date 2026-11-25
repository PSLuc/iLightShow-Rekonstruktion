package com.fasterxml.jackson.databind.deser.std;

import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.HashSet;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0526w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f7675a = new HashSet();

    static {
        Class[] clsArr = {UUID.class, AtomicBoolean.class, AtomicInteger.class, AtomicLong.class, StackTraceElement.class, ByteBuffer.class, Void.class};
        for (int i = 0; i < 7; i++) {
            f7675a.add(clsArr[i].getName());
        }
        int i3 = AbstractC0525v.f7667h;
        Class[] clsArr2 = {File.class, URL.class, URI.class, Class.class, p015c2.h.class, Currency.class, Pattern.class, Locale.class, Charset.class, TimeZone.class, InetAddress.class, InetSocketAddress.class, StringBuilder.class, StringBuffer.class};
        for (int i6 = 0; i6 < 14; i6++) {
            f7675a.add(clsArr2[i6].getName());
        }
    }
}

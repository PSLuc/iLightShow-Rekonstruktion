package com.github.kittinunf.fuel.core;

import E4.k;

/* JADX INFO: loaded from: classes.dex */
public final class HttpException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpException(int i, String str) {
        super("HTTP Exception " + i + ' ' + str);
        k.f("httpMessage", str);
    }
}

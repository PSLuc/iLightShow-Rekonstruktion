package com.fasterxml.jackson.databind.exc;

import T1.i;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public class InvalidFormatException extends MismatchedInputException {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f7687l;

    public InvalidFormatException(i iVar, String str, Object obj) {
        super((Closeable) iVar, str);
        this.f7687l = obj;
    }
}

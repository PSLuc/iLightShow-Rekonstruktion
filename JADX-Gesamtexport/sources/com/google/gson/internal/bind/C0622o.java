package com.google.gson.internal.bind;

import com.google.gson.JsonIOException;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: com.google.gson.internal.bind.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0622o extends AbstractC0621n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p116v3.m f8118b;

    public C0622o(p116v3.m mVar, C0623p c0623p) {
        super(c0623p);
        this.f8118b = mVar;
    }

    @Override // com.google.gson.internal.bind.AbstractC0621n
    public final Object c() {
        return this.f8118b.l();
    }

    @Override // com.google.gson.internal.bind.AbstractC0621n
    public final Object d(Object obj) {
        return obj;
    }

    @Override // com.google.gson.internal.bind.AbstractC0621n
    public final void e(Object obj, p138z3.a aVar, C0620m c0620m) throws IllegalAccessException {
        Object objA = c0620m.f8114f.a(aVar);
        if (objA == null && c0620m.f8115g) {
            return;
        }
        Field field = c0620m.f8110b;
        if (!c0620m.f8116h) {
            field.set(obj, objA);
            return;
        }
        throw new JsonIOException("Cannot set value of 'static final' " + p127x3.c.d(field, false));
    }
}

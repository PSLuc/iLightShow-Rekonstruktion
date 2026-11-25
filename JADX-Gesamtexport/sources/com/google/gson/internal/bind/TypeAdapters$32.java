package com.google.gson.internal.bind;

import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
class TypeAdapters$32 implements p105t3.D {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Class f8048h;
    public final /* synthetic */ Class i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p105t3.C f8049j;

    public TypeAdapters$32(Class cls, Class cls2, p105t3.C c6) {
        this.f8048h = cls;
        this.i = cls2;
        this.f8049j = c6;
    }

    @Override // p105t3.D
    public final p105t3.C a(p105t3.m mVar, p132y3.a aVar) {
        Class rawType = aVar.getRawType();
        if (rawType == this.f8048h || rawType == this.i) {
            return this.f8049j;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.i.getName() + Marker.ANY_NON_NULL_MARKER + this.f8048h.getName() + ",adapter=" + this.f8049j + "]";
    }
}

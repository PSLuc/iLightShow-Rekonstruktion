package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes.dex */
class TypeAdapters$31 implements p105t3.D {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Class f8047h;
    public final /* synthetic */ p105t3.C i;

    public TypeAdapters$31(Class cls, p105t3.C c6) {
        this.f8047h = cls;
        this.i = c6;
    }

    @Override // p105t3.D
    public final p105t3.C a(p105t3.m mVar, p132y3.a aVar) {
        if (aVar.getRawType() == this.f8047h) {
            return this.i;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f8047h.getName() + ",adapter=" + this.i + "]";
    }
}

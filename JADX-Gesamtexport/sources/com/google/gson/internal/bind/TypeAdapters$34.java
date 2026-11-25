package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes.dex */
class TypeAdapters$34 implements p105t3.D {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Class f8051h;
    public final /* synthetic */ p105t3.C i;

    public TypeAdapters$34(Class cls, p105t3.C c6) {
        this.f8051h = cls;
        this.i = c6;
    }

    @Override // p105t3.D
    public final p105t3.C a(p105t3.m mVar, p132y3.a aVar) {
        Class<?> rawType = aVar.getRawType();
        if (this.f8051h.isAssignableFrom(rawType)) {
            return new P(this, rawType);
        }
        return null;
    }

    public final String toString() {
        return "Factory[typeHierarchy=" + this.f8051h.getName() + ",adapter=" + this.i + "]";
    }
}

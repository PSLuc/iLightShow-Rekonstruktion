package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes.dex */
class ObjectTypeAdapter$1 implements p105t3.D {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p105t3.B f8035h;

    public ObjectTypeAdapter$1(p105t3.B b6) {
        this.f8035h = b6;
    }

    @Override // p105t3.D
    public final p105t3.C a(p105t3.m mVar, p132y3.a aVar) {
        if (aVar.getRawType() == Object.class) {
            return new C0618k(mVar, this.f8035h);
        }
        return null;
    }
}

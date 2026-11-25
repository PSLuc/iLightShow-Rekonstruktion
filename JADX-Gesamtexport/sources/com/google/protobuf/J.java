package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class J implements S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f8171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f8172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0644l f8173c;

    public J(U u6, C0644l c0644l, r rVar) {
        this.f8172b = u6;
        c0644l.getClass();
        this.f8173c = c0644l;
        this.f8171a = rVar;
    }

    @Override // com.google.protobuf.S
    public final void a(Object obj, Object obj2) {
        T.a(this.f8172b, obj, obj2);
    }

    @Override // com.google.protobuf.S
    public final void b(Object obj) {
        ((W) this.f8172b).getClass();
        V v6 = ((r) obj).unknownFields;
        if (v6.f8192d) {
            v6.f8192d = false;
        }
        this.f8173c.getClass();
        p012c.k.A(obj);
        throw null;
    }

    @Override // com.google.protobuf.S
    public final boolean c(Object obj) {
        this.f8173c.getClass();
        p012c.k.A(obj);
        throw null;
    }

    @Override // com.google.protobuf.S
    public final r d() {
        r rVar = this.f8171a;
        return rVar != null ? rVar.g() : ((AbstractC0648p) rVar.a(5)).a();
    }

    @Override // com.google.protobuf.S
    public final boolean e(r rVar, r rVar2) {
        W w6 = (W) this.f8172b;
        w6.getClass();
        V v6 = rVar.unknownFields;
        w6.getClass();
        return v6.equals(rVar2.unknownFields);
    }

    @Override // com.google.protobuf.S
    public final void f(Object obj, byte[] bArr, int i, int i3, J2.c cVar) {
        r rVar = (r) obj;
        if (rVar.unknownFields == V.f8188e) {
            rVar.unknownFields = V.b();
        }
        throw p012c.k.p(obj);
    }

    @Override // com.google.protobuf.S
    public final int g(r rVar) {
        ((W) this.f8172b).getClass();
        return rVar.unknownFields.hashCode();
    }
}

package com.fasterxml.jackson.databind.ser.std;

import S1.T;
import p015c2.InterfaceC0472c;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0542m extends p071n2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p071n2.e f7730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7731b;

    public C0542m(p071n2.e eVar, Object obj) {
        this.f7730a = eVar;
        this.f7731b = obj;
    }

    @Override // p071n2.e
    public final p071n2.e a(InterfaceC0472c interfaceC0472c) {
        throw new UnsupportedOperationException();
    }

    @Override // p071n2.e
    public final String b() {
        return this.f7730a.b();
    }

    @Override // p071n2.e
    public final T c() {
        return this.f7730a.c();
    }

    @Override // p071n2.e
    public final p003a2.a e(T1.e eVar, p003a2.a aVar) {
        aVar.f6157a = this.f7731b;
        return this.f7730a.e(eVar, aVar);
    }

    @Override // p071n2.e
    public final p003a2.a f(T1.e eVar, p003a2.a aVar) {
        return this.f7730a.f(eVar, aVar);
    }
}

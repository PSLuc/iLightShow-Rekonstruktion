package com.nanjoran.ilightshow.Services;

import S4.InterfaceC0368e;
import S4.InterfaceC0369f;

/* JADX INFO: renamed from: com.nanjoran.ilightshow.Services.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0675i0 implements InterfaceC0368e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8412h;
    public final /* synthetic */ InterfaceC0368e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0688o0 f8413j;

    public /* synthetic */ C0675i0(InterfaceC0368e interfaceC0368e, C0688o0 c0688o0, int i) {
        this.f8412h = i;
        this.i = interfaceC0368e;
        this.f8413j = c0688o0;
    }

    @Override // S4.InterfaceC0368e
    public final Object a(InterfaceC0369f interfaceC0369f, p111u4.d dVar) {
        switch (this.f8412h) {
            case 0:
                Object objA = this.i.a(new C0673h0(interfaceC0369f, this.f8413j, 0), dVar);
                return objA == v4.a.f13292h ? objA : p084p4.x.f10867a;
            default:
                Object objA2 = this.i.a(new C0673h0(interfaceC0369f, this.f8413j, 1), dVar);
                return objA2 == v4.a.f13292h ? objA2 : p084p4.x.f10867a;
        }
    }
}

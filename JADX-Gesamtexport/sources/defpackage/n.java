package defpackage;

import S4.InterfaceC0368e;
import S4.InterfaceC0369f;
import p084p4.x;
import p111u4.d;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class n implements InterfaceC0368e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10496h;
    public final /* synthetic */ InterfaceC0368e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t f10497j;

    public /* synthetic */ n(InterfaceC0368e interfaceC0368e, t tVar, int i) {
        this.f10496h = i;
        this.i = interfaceC0368e;
        this.f10497j = tVar;
    }

    @Override // S4.InterfaceC0368e
    public final Object a(InterfaceC0369f interfaceC0369f, d dVar) {
        switch (this.f10496h) {
            case 0:
                Object objA = this.i.a(new m(interfaceC0369f, this.f10497j, 0), dVar);
                return objA == a.f13292h ? objA : x.f10867a;
            default:
                Object objA2 = this.i.a(new m(interfaceC0369f, this.f10497j, 1), dVar);
                return objA2 == a.f13292h ? objA2 : x.f10867a;
        }
    }
}

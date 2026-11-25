package p114v1;

import D4.e;
import S4.InterfaceC0368e;
import p092r1.InterfaceC0886g;
import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC0886g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0886g f13209a;

    public d(InterfaceC0886g interfaceC0886g) {
        this.f13209a = interfaceC0886g;
    }

    @Override // p092r1.InterfaceC0886g
    public final Object a(e eVar, c cVar) {
        return this.f13209a.a(new c(eVar, null), cVar);
    }

    @Override // p092r1.InterfaceC0886g
    public final InterfaceC0368e getData() {
        return this.f13209a.getData();
    }
}

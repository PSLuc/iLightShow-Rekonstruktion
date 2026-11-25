package p077o2;

import S1.T;
import p015c2.InterfaceC0472c;

/* JADX INFO: loaded from: classes.dex */
public class h extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10642e;

    public h(o oVar, InterfaceC0472c interfaceC0472c, String str) {
        super(oVar, interfaceC0472c, 1);
        this.f10642e = str;
    }

    @Override // p077o2.q, p071n2.e
    public final String b() {
        return this.f10642e;
    }

    @Override // p077o2.c, p071n2.e
    public T c() {
        return T.f4913h;
    }

    @Override // p077o2.c
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public h g(InterfaceC0472c interfaceC0472c) {
        return this.f10662b == interfaceC0472c ? this : new h(this.f10661a, interfaceC0472c, this.f10642e);
    }
}

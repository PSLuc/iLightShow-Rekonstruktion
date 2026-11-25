package p077o2;

import S1.T;
import p015c2.InterfaceC0472c;
import p071n2.e;

/* JADX INFO: loaded from: classes.dex */
public final class f extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10639c;

    public f(o oVar, InterfaceC0472c interfaceC0472c, String str) {
        super(oVar, interfaceC0472c);
        this.f10639c = str;
    }

    @Override // p071n2.e
    public final e a(InterfaceC0472c interfaceC0472c) {
        return this.f10662b == interfaceC0472c ? this : new f(this.f10661a, interfaceC0472c, this.f10639c);
    }

    @Override // p077o2.q, p071n2.e
    public final String b() {
        return this.f10639c;
    }

    @Override // p071n2.e
    public final T c() {
        return T.f4915k;
    }
}

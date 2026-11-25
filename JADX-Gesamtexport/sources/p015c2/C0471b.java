package p015c2;

import S1.A;
import S1.C0355q;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import p026e2.n;
import p026e2.o;
import p046i2.AbstractC0771g;
import p109u2.InterfaceC0963b;

/* JADX INFO: renamed from: c2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0471b implements InterfaceC0472c, Serializable, InterfaceC0963b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Serializable f7238h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f7239j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f7240k;

    public C0471b(A a6, h hVar, A a7, AbstractC0771g abstractC0771g, z zVar) {
        this.f7238h = a6;
        this.i = hVar;
        this.f7239j = zVar;
        this.f7240k = abstractC0771g;
    }

    @Override // p015c2.InterfaceC0472c
    public A a() {
        return (A) this.f7238h;
    }

    @Override // p015c2.InterfaceC0472c
    public C0355q b(n nVar, Class cls) {
        C0355q c0355qN;
        C0355q c0355qF = nVar.f(cls);
        B bD = nVar.d();
        AbstractC0771g abstractC0771g = (AbstractC0771g) this.f7240k;
        return (abstractC0771g == null || (c0355qN = bD.n(abstractC0771g)) == null) ? c0355qF : c0355qF.e(c0355qN);
    }

    @Override // p015c2.InterfaceC0472c
    public z c() {
        return (z) this.f7239j;
    }

    @Override // p109u2.InterfaceC0963b
    public Annotation d(Class cls) {
        if (((Class) this.f7238h) == cls) {
            return (Annotation) this.f7239j;
        }
        if (((Class) this.i) == cls) {
            return (Annotation) this.f7240k;
        }
        return null;
    }

    @Override // p015c2.InterfaceC0472c
    public AbstractC0771g e() {
        return (AbstractC0771g) this.f7240k;
    }

    @Override // p015c2.InterfaceC0472c
    public A f(n nVar, Class cls) {
        o oVar = (o) nVar;
        oVar.e(((h) this.i).f7281k);
        oVar.e(cls);
        oVar.f8724n.getClass();
        A a6 = A.f4905l;
        B bD = nVar.d();
        AbstractC0771g abstractC0771g = (AbstractC0771g) this.f7240k;
        return abstractC0771g == null ? a6 : a6.a(bD.J(abstractC0771g));
    }

    @Override // p109u2.t
    public String getName() {
        return ((A) this.f7238h).f7195h;
    }

    @Override // p015c2.InterfaceC0472c
    public h getType() {
        return (h) this.i;
    }

    @Override // p109u2.InterfaceC0963b
    public int size() {
        return 2;
    }

    public C0471b(Class cls, Annotation annotation, Class cls2, Annotation annotation2) {
        this.f7238h = cls;
        this.f7239j = annotation;
        this.i = cls2;
        this.f7240k = annotation2;
    }
}

package p112v;

import A2.d;
import B.S0;
import D4.e;
import E4.v;
import P4.AbstractC0336x;
import P4.InterfaceC0335w;
import R4.b;
import S1.V;
import java.util.concurrent.CancellationException;
import p084p4.x;
import p090r.C0870i;
import p091r0.A;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class E extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12796l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f12797m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ M f12798n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ A f12799o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ S0 f12800p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0870i f12801q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ F f12802r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ F f12803s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f12804t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(M m6, A a6, S0 s1, C0870i c0870i, F f6, F f7, d dVar, p111u4.d dVar2) {
        super(2, dVar2);
        this.f12798n = m6;
        this.f12799o = a6;
        this.f12800p = s1;
        this.f12801q = c0870i;
        this.f12802r = f6;
        this.f12803s = f7;
        this.f12804t = dVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        F f6 = this.f12803s;
        d dVar2 = this.f12804t;
        E e6 = new E(this.f12798n, this.f12799o, this.f12800p, this.f12801q, this.f12802r, f6, dVar2, dVar);
        e6.f12797m = obj;
        return e6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((E) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    @Override // p122w4.a
    public final Object o(Object obj) {
        InterfaceC0335w interfaceC0335w;
        b bVar;
        a aVar = a.f13292h;
        int i = this.f12796l;
        x xVar = x.f10867a;
        M m6 = this.f12798n;
        if (i == 0) {
            V.O(obj);
            InterfaceC0335w interfaceC0335w2 = (InterfaceC0335w) this.f12797m;
            try {
                W w6 = m6.f12863w;
                A a6 = this.f12799o;
                S0 s1 = this.f12800p;
                C0870i c0870i = this.f12801q;
                F f6 = this.f12802r;
                F f7 = this.f12803s;
                d dVar = this.f12804t;
                this.f12797m = interfaceC0335w2;
                this.f12796l = 1;
                float f8 = D.f12793a;
                Object objN = p006b.a.n(a6, new A(f7, new v(), w6, s1, dVar, f6, c0870i, null), this);
                if (objN != aVar) {
                    objN = xVar;
                }
                if (objN == aVar) {
                    return aVar;
                }
            } catch (CancellationException e6) {
                e = e6;
                interfaceC0335w = interfaceC0335w2;
                bVar = m6.f12859A;
                if (bVar != null) {
                    bVar.j(C0999q.f13051a);
                }
                if (!AbstractC0336x.m(interfaceC0335w)) {
                    throw e;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0335w = (InterfaceC0335w) this.f12797m;
            try {
                V.O(obj);
            } catch (CancellationException e7) {
                e = e7;
                bVar = m6.f12859A;
                if (bVar != null) {
                    bVar.j(C0999q.f13051a);
                }
                if (!AbstractC0336x.m(interfaceC0335w)) {
                    throw e;
                }
            }
        }
        return xVar;
    }
}

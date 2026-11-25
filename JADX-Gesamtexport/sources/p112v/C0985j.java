package p112v;

import D4.e;
import P4.AbstractC0336x;
import P4.InterfaceC0335w;
import P4.T;
import S1.V;
import java.util.concurrent.CancellationException;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: v.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0985j extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12995l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f12996m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0987k f12997n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b1 f12998o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0973d f12999p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0985j(C0987k c0987k, b1 b1Var, InterfaceC0973d interfaceC0973d, d dVar) {
        super(2, dVar);
        this.f12997n = c0987k;
        this.f12998o = b1Var;
        this.f12999p = interfaceC0973d;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        C0985j c0985j = new C0985j(this.f12997n, this.f12998o, this.f12999p, dVar);
        c0985j.f12996m = obj;
        return c0985j;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0985j) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f12995l;
        C0987k c0987k = this.f12997n;
        try {
            try {
                if (i == 0) {
                    V.O(obj);
                    T tI = AbstractC0336x.i(((InterfaceC0335w) this.f12996m).d());
                    c0987k.f13006C = true;
                    C1017z0 c1017z0 = c0987k.f13008v;
                    C0983i c0983i = new C0983i(this.f12998o, c0987k, this.f12999p, tI, null);
                    this.f12995l = 1;
                    if (c1017z0.e(1, c0983i, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V.O(obj);
                }
                c0987k.f13010x.e();
                c0987k.f13006C = false;
                c0987k.f13010x.b(null);
                c0987k.f13004A = false;
                return x.f10867a;
            } catch (CancellationException e6) {
                throw e6;
            }
        } catch (Throwable th) {
            c0987k.f13006C = false;
            c0987k.f13010x.b(null);
            c0987k.f13004A = false;
            throw th;
        }
    }
}

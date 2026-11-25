package p096s;

import B.C0026n;
import D4.c;
import E4.s;
import K3.e;
import S1.V;
import java.util.concurrent.CancellationException;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: s.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0903a extends i implements c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0919l f11932l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public s f11933m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11934n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0907c f11935o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f11936p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ h0 f11937q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f11938r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0903a(C0907c c0907c, Object obj, h0 h0Var, long j4, d dVar) {
        super(1, dVar);
        this.f11935o = c0907c;
        this.f11936p = obj;
        this.f11937q = h0Var;
        this.f11938r = j4;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        h0 h0Var = this.f11937q;
        return new C0903a(this.f11935o, this.f11936p, h0Var, this.f11938r, (d) obj).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        C0919l c0919l;
        s sVar;
        a aVar = a.f13292h;
        int i = this.f11934n;
        int i3 = 1;
        C0907c c0907c = this.f11935o;
        try {
            if (i == 0) {
                V.O(obj);
                c0907c.f11953c.f12026j = (AbstractC0924q) c0907c.f11951a.f12136a.invoke(this.f11936p);
                h0 h0Var = this.f11937q;
                c0907c.f11955e.setValue(h0Var.f12004c);
                c0907c.f11954d.setValue(Boolean.TRUE);
                C0919l c0919l2 = c0907c.f11953c;
                C0919l c0919l3 = new C0919l(c0919l2.f12025h, c0919l2.i.getValue(), AbstractC0909d.f(c0919l2.f12026j), c0919l2.f12027k, Long.MIN_VALUE, c0919l2.f12029m);
                s sVar2 = new s();
                long j4 = this.f11938r;
                C0026n c0026n = new C0026n(c0907c, c0919l3, sVar2, 12);
                this.f11932l = c0919l3;
                this.f11933m = sVar2;
                this.f11934n = 1;
                if (AbstractC0909d.b(c0919l3, h0Var, j4, c0026n, this) == aVar) {
                    return aVar;
                }
                c0919l = c0919l3;
                sVar = sVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sVar = this.f11933m;
                c0919l = this.f11932l;
                V.O(obj);
            }
            if (!sVar.f1070h) {
                i3 = 2;
            }
            C0919l c0919l4 = c0907c.f11953c;
            c0919l4.f12026j.d();
            c0919l4.f12027k = Long.MIN_VALUE;
            c0907c.f11954d.setValue(Boolean.FALSE);
            return new e(i3, 8, c0919l);
        } catch (CancellationException e6) {
            C0919l c0919l5 = c0907c.f11953c;
            c0919l5.f12026j.d();
            c0919l5.f12027k = Long.MIN_VALUE;
            c0907c.f11954d.setValue(Boolean.FALSE);
            throw e6;
        }
    }
}

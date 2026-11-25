package p112v;

import B.C0031p0;
import D4.e;
import S0.o;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: v.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1013x0 extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f13093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13094m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ long f13095n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1017z0 f13096o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1013x0(C1017z0 c1017z0, d dVar) {
        super(2, dVar);
        this.f13096o = c1017z0;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        C1013x0 c1013x0 = new C1013x0(this.f13096o, dVar);
        c1013x0.f13095n = ((o) obj).f4904a;
        return c1013x0;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        long j4 = ((o) obj).f4904a;
        C1013x0 c1013x0 = new C1013x0(this.f13096o, (d) obj2);
        c1013x0.f13095n = j4;
        return c1013x0.o(x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    @Override // p122w4.a
    public final Object o(Object obj) {
        long j4;
        long j6;
        long j7;
        long j8;
        long j9;
        a aVar = a.f13292h;
        int i = this.f13094m;
        C1017z0 c1017z0 = this.f13096o;
        if (i == 0) {
            V.O(obj);
            j4 = this.f13095n;
            C0031p0 c0031p0 = c1017z0.f13109f;
            this.f13095n = j4;
            this.f13094m = 1;
            obj = c0031p0.e(j4, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i == 1) {
            j4 = this.f13095n;
            V.O(obj);
        } else {
            if (i == 2) {
                j6 = this.f13093l;
                j4 = this.f13095n;
                V.O(obj);
                j7 = ((o) obj).f4904a;
                C0031p0 c0031p1 = c1017z0.f13109f;
                long jD = o.d(j6, j7);
                this.f13095n = j4;
                this.f13093l = j7;
                this.f13094m = 3;
                obj = c0031p1.d(jD, j7, this);
                if (obj != aVar) {
                    j8 = j4;
                    j9 = j7;
                }
                return aVar;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j9 = this.f13093l;
            j8 = this.f13095n;
            V.O(obj);
        }
        return new o(o.d(j8, o.d(j9, ((o) obj).f4904a)));
        long jD2 = o.d(j4, ((o) obj).f4904a);
        this.f13095n = j4;
        this.f13093l = jD2;
        this.f13094m = 2;
        obj = c1017z0.b(jD2, this);
        if (obj != aVar) {
            j6 = jD2;
            j7 = ((o) obj).f4904a;
            C0031p0 c0031p2 = c1017z0.f13109f;
            long jD3 = o.d(j6, j7);
            this.f13095n = j4;
            this.f13093l = j7;
            this.f13094m = 3;
            obj = c0031p2.d(jD3, j7, this);
            if (obj != aVar) {
                j8 = j4;
                j9 = j7;
                return new o(o.d(j8, o.d(j9, ((o) obj).f4904a)));
            }
        }
        return aVar;
    }
}

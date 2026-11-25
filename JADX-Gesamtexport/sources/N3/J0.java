package N3;

import P4.AbstractC0336x;
import p112v.C0968a0;

/* JADX INFO: loaded from: classes.dex */
public final class J0 extends p122w4.i implements D4.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3996l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3997m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f3998n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J0(int i, p111u4.d dVar, int i3) {
        super(i, dVar);
        this.f3996l = i3;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.f3996l) {
            case 0:
                long j4 = ((p030f0.c) obj2).f8837a;
                J0 j6 = new J0(3, (p111u4.d) obj3, 0);
                j6.f3998n = (C0968a0) obj;
                return j6.o(p084p4.x.f10867a);
            case 1:
                return new J0((p092r1.J) this.f3998n, (p111u4.d) obj3).o(p084p4.x.f10867a);
            default:
                ((Boolean) obj2).getClass();
                J0 j7 = new J0(3, (p111u4.d) obj3, 2);
                j7.f3998n = (p103t1.c) obj;
                return j7.o(p084p4.x.f10867a);
        }
    }

    @Override // p122w4.a
    public final Object o(Object obj) throws Throwable {
        switch (this.f3996l) {
            case 0:
                v4.a aVar = v4.a.f13292h;
                int i = this.f3997m;
                try {
                    if (i == 0) {
                        S1.V.O(obj);
                        C0968a0 c0968a0 = (C0968a0) this.f3998n;
                        com.nanjoran.ilightshow.Services.M m6 = com.nanjoran.ilightshow.Services.M.f8305O;
                        P4.i0 i0Var = m6.f8313L;
                        if (i0Var != null) {
                            i0Var.c(null);
                        }
                        m6.f8313L = null;
                        m6.f8313L = AbstractC0336x.o(m6.f8314M, null, new com.nanjoran.ilightshow.Services.J(m6, null), 3);
                        this.f3997m = 1;
                        if (c0968a0.b(this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        S1.V.O(obj);
                    }
                    com.nanjoran.ilightshow.Services.M m7 = com.nanjoran.ilightshow.Services.M.f8305O;
                    P4.i0 i0Var2 = m7.f8313L;
                    if (i0Var2 != null) {
                        i0Var2.c(null);
                    }
                    m7.f8313L = null;
                    return p084p4.x.f10867a;
                } catch (Throwable th) {
                    com.nanjoran.ilightshow.Services.M m8 = com.nanjoran.ilightshow.Services.M.f8305O;
                    P4.i0 i0Var3 = m8.f8313L;
                    if (i0Var3 != null) {
                        i0Var3.c(null);
                    }
                    m8.f8313L = null;
                    throw th;
                }
            case 1:
                v4.a aVar2 = v4.a.f13292h;
                int i3 = this.f3997m;
                if (i3 == 0) {
                    S1.V.O(obj);
                    this.f3997m = 1;
                    if (p092r1.J.b((p092r1.J) this.f3998n, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    S1.V.O(obj);
                }
                return p084p4.x.f10867a;
            default:
                v4.a aVar3 = v4.a.f13292h;
                int i6 = this.f3997m;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    S1.V.O(obj);
                    return obj;
                }
                S1.V.O(obj);
                p103t1.c cVar = (p103t1.c) this.f3998n;
                this.f3997m = 1;
                cVar.getClass();
                Object objA = p103t1.c.a(cVar, this);
                return objA == aVar3 ? aVar3 : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(p092r1.J j4, p111u4.d dVar) {
        super(3, dVar);
        this.f3996l = 1;
        this.f3998n = j4;
    }
}

package B3;

import P4.InterfaceC0335w;
import S1.V;
import com.nanjoran.ilightshow.Services.M;
import com.nanjoran.ilightshow.Services.P0;
import p084p4.x;
import p122w4.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public X4.a f548l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f f549m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f550n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f f551o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, p111u4.d dVar) {
        super(2, dVar);
        this.f551o = fVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new d(this.f551o, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((d) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) throws Throwable {
        f fVar;
        X4.a aVar;
        X4.a aVar2;
        f fVar2;
        X4.a aVar3;
        v4.a aVar4 = v4.a.f13292h;
        int i = this.f550n;
        try {
            if (i == 0) {
                V.O(obj);
                fVar = this.f551o;
                X4.d dVar = fVar.f575u;
                this.f548l = dVar;
                this.f549m = fVar;
                this.f550n = 1;
                Object objC = dVar.c(this);
                aVar = dVar;
                if (objC != aVar4) {
                }
                return aVar4;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fVar2 = this.f549m;
                aVar2 = this.f548l;
                try {
                    V.O(obj);
                    aVar2 = aVar2;
                    fVar2.f574t.setValue(Boolean.FALSE);
                    aVar3 = aVar2;
                    ((X4.d) aVar3).e(null);
                    return x.f10867a;
                } catch (Throwable th) {
                    th = th;
                    ((X4.d) aVar2).e(null);
                    throw th;
                }
            }
            f fVar3 = this.f549m;
            X4.a aVar5 = this.f548l;
            V.O(obj);
            fVar = fVar3;
            aVar = aVar5;
            aVar3 = aVar;
            if (fVar.f572r == null) {
                aVar3 = aVar;
                if (fVar.f570p == null) {
                    try {
                        M.f8305O.l().b();
                        try {
                            fVar.f574t.setValue(Boolean.TRUE);
                            P0 p6 = P0.f8357e;
                            this.f548l = aVar;
                            this.f549m = fVar;
                            this.f550n = 2;
                            if (p6.b(fVar, false, this) != aVar4) {
                                fVar2 = fVar;
                                aVar2 = aVar;
                                fVar2.f574t.setValue(Boolean.FALSE);
                                aVar3 = aVar2;
                            }
                            return aVar4;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            aVar2 = aVar;
                            ((X4.d) aVar2).e(null);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
            ((X4.d) aVar3).e(null);
            return x.f10867a;
        } catch (Throwable th4) {
            th = th4;
        }
    }
}

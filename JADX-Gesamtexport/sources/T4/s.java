package T4;

import B.C0003b0;
import P4.AbstractC0336x;
import S4.InterfaceC0369f;

/* JADX INFO: loaded from: classes.dex */
public final class s extends p122w4.c implements InterfaceC0369f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC0369f f5290k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p111u4.i f5291l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f5292m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p111u4.i f5293n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p111u4.d f5294o;

    public s(InterfaceC0369f interfaceC0369f, p111u4.i iVar) {
        super(p.f5287h, p111u4.j.f12751h);
        this.f5290k = interfaceC0369f;
        this.f5291l = iVar;
        this.f5292m = ((Number) iVar.T(0, r.f5289h)).intValue();
    }

    @Override // p122w4.a, p122w4.d
    public final p122w4.d a() {
        p111u4.d dVar = this.f5294o;
        if (dVar instanceof p122w4.d) {
            return (p122w4.d) dVar;
        }
        return null;
    }

    @Override // p122w4.c, p111u4.d
    public final p111u4.i e() {
        p111u4.i iVar = this.f5293n;
        return iVar == null ? p111u4.j.f12751h : iVar;
    }

    @Override // S4.InterfaceC0369f
    public final Object m(Object obj, p111u4.d dVar) {
        try {
            Object objQ = q(dVar, obj);
            return objQ == v4.a.f13292h ? objQ : p084p4.x.f10867a;
        } catch (Throwable th) {
            this.f5293n = new n(th, dVar.e());
            throw th;
        }
    }

    @Override // p122w4.a
    public final StackTraceElement n() {
        return null;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        Throwable thA = p084p4.k.a(obj);
        if (thA != null) {
            this.f5293n = new n(thA, e());
        }
        p111u4.d dVar = this.f5294o;
        if (dVar != null) {
            dVar.g(obj);
        }
        return v4.a.f13292h;
    }

    public final Object q(p111u4.d dVar, Object obj) {
        p111u4.i iVarE = dVar.e();
        AbstractC0336x.f(iVarE);
        p111u4.i iVar = this.f5293n;
        if (iVar != iVarE) {
            if (iVar instanceof n) {
                throw new IllegalStateException(M4.m.N("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((n) iVar).f5286h + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) iVarE.T(0, new C0003b0(12, this))).intValue() != this.f5292m) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f5291l + ",\n\t\tbut emission happened in " + iVarE + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f5293n = iVarE;
        }
        this.f5294o = dVar;
        t tVar = u.f5296a;
        InterfaceC0369f interfaceC0369f = this.f5290k;
        E4.k.d("null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>", interfaceC0369f);
        tVar.getClass();
        Object objM = interfaceC0369f.m(obj, this);
        if (!E4.k.a(objM, v4.a.f13292h)) {
            this.f5294o = null;
        }
        return objM;
    }
}

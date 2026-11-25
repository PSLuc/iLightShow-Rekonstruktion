package T4;

import L.W;
import P4.AbstractC0336x;
import P4.C0329p;
import S4.InterfaceC0368e;
import S4.InterfaceC0369f;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC0368e f5271k;

    public h(InterfaceC0368e interfaceC0368e, p111u4.i iVar, int i, int i3) {
        super(iVar, i, i3);
        this.f5271k = interfaceC0368e;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:33:0x0083 A[RETURN] */
    @Override // S4.InterfaceC0368e
    public final Object a(InterfaceC0369f interfaceC0369f, p111u4.d dVar) throws Throwable {
        Object objD;
        v4.a aVar;
        p084p4.x xVar = p084p4.x.f10867a;
        if (this.i == -3) {
            p111u4.i iVarE = dVar.e();
            Boolean bool = Boolean.FALSE;
            C0329p c0329p = C0329p.f4667j;
            p111u4.i iVar = this.f5266h;
            p111u4.i iVarO = !((Boolean) iVar.T(bool, c0329p)).booleanValue() ? iVarE.o(iVar) : AbstractC0336x.g(iVarE, iVar, false);
            if (E4.k.a(iVarO, iVarE)) {
                Object objH = h(interfaceC0369f, dVar);
                if (objH == v4.a.f13292h) {
                    return objH;
                }
            } else {
                p111u4.e eVar = p111u4.e.f12750h;
                if (E4.k.a(iVarO.J(eVar), iVarE.J(eVar))) {
                    p111u4.i iVarE2 = dVar.e();
                    if (!(interfaceC0369f instanceof v ? true : interfaceC0369f instanceof q)) {
                        interfaceC0369f = new W(interfaceC0369f, iVarE2);
                    }
                    Object objA = b.a(iVarO, interfaceC0369f, U4.a.k(iVarO), new g(this, null), dVar);
                    v4.a aVar2 = v4.a.f13292h;
                    if (objA != aVar2) {
                        objA = xVar;
                    }
                    if (objA == aVar2) {
                        return objA;
                    }
                } else {
                    objD = AbstractC0336x.d(new d(interfaceC0369f, this, null), dVar);
                    aVar = v4.a.f13292h;
                    if (objD != aVar) {
                        objD = xVar;
                    }
                    if (objD == aVar) {
                        return objD;
                    }
                }
            }
        } else {
            objD = AbstractC0336x.d(new d(interfaceC0369f, this, null), dVar);
            aVar = v4.a.f13292h;
            if (objD != aVar) {
                objD = xVar;
            }
            if (objD == aVar) {
                return objD;
            }
        }
        return xVar;
    }

    @Override // T4.f
    public final Object d(R4.m mVar, e eVar) {
        Object objH = h(new v(mVar), eVar);
        return objH == v4.a.f13292h ? objH : p084p4.x.f10867a;
    }

    public abstract Object h(InterfaceC0369f interfaceC0369f, p111u4.d dVar);

    @Override // T4.f
    public final String toString() {
        return this.f5271k + " -> " + super.toString();
    }
}

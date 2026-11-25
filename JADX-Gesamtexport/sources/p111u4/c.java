package p111u4;

import B.AbstractC0013g0;
import D4.e;
import E4.k;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class c implements i, Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f12749h;
    public final g i;

    public c(g gVar, i iVar) {
        k.f("left", iVar);
        k.f("element", gVar);
        this.f12749h = iVar;
        this.i = gVar;
    }

    @Override // p111u4.i
    public final i D(h hVar) {
        k.f("key", hVar);
        g gVar = this.i;
        g gVarJ = gVar.J(hVar);
        i iVar = this.f12749h;
        if (gVarJ != null) {
            return iVar;
        }
        i iVarD = iVar.D(hVar);
        if (iVarD == iVar) {
            return this;
        }
        return iVarD == j.f12751h ? gVar : new c(gVar, iVarD);
    }

    @Override // p111u4.i
    public final g J(h hVar) {
        k.f("key", hVar);
        while (true) {
            g gVarJ = this.i.J(hVar);
            if (gVarJ != null) {
                return gVarJ;
            }
            i iVar = this.f12749h;
            if (!(iVar instanceof c)) {
                return iVar.J(hVar);
            }
            this = (c) iVar;
        }
    }

    @Override // p111u4.i
    public final Object T(Object obj, e eVar) {
        return eVar.d(this.f12749h.T(obj, eVar), this.i);
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            cVar.getClass();
            int i = 2;
            c cVar2 = cVar;
            int i3 = 2;
            while (true) {
                i iVar = cVar2.f12749h;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i3++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f12749h;
                cVar3 = iVar2 instanceof c ? (c) iVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i++;
            }
            if (i3 == i) {
                while (true) {
                    g gVar = this.i;
                    if (!k.a(cVar.J(gVar.getKey()), gVar)) {
                        zA = false;
                        break;
                    }
                    i iVar3 = this.f12749h;
                    if (!(iVar3 instanceof c)) {
                        k.d("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element", iVar3);
                        g gVar2 = (g) iVar3;
                        zA = k.a(cVar.J(gVar2.getKey()), gVar2);
                        break;
                    }
                    this = (c) iVar3;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode() + this.f12749h.hashCode();
    }

    @Override // p111u4.i
    public final i o(i iVar) {
        k.f("context", iVar);
        return iVar == j.f12751h ? this : (i) iVar.T(this, b.f12747j);
    }

    public final String toString() {
        return AbstractC0013g0.m(new StringBuilder("["), (String) T("", b.i), ']');
    }
}

package T4;

import B.AbstractC0013g0;
import P4.AbstractC0336x;
import P4.D;
import P4.InterfaceC0335w;
import S4.InterfaceC0368e;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p111u4.i f5266h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5267j;

    public f(p111u4.i iVar, int i, int i3) {
        this.f5266h = iVar;
        this.i = i;
        this.f5267j = i3;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    @Override // T4.o
    public final InterfaceC0368e b(p111u4.i iVar, int i, int i3) {
        p111u4.i iVar2 = this.f5266h;
        p111u4.i iVarO = iVar.o(iVar2);
        int i6 = this.f5267j;
        int i7 = this.i;
        if (i3 == 1) {
            if (i7 != -3) {
                if (i == -3) {
                    i = i7;
                } else if (i7 != -2) {
                    if (i == -2) {
                        i = i7;
                    } else {
                        i += i7;
                        if (i < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            i3 = i6;
        }
        return (E4.k.a(iVarO, iVar2) && i == i7 && i3 == i6) ? this : e(iVarO, i, i3);
    }

    public String c() {
        return null;
    }

    public abstract Object d(R4.m mVar, e eVar);

    public abstract f e(p111u4.i iVar, int i, int i3);

    public InterfaceC0368e f() {
        return null;
    }

    public R4.n g(InterfaceC0335w interfaceC0335w) {
        int i = this.i;
        if (i == -3) {
            i = -2;
        }
        D4.e eVar = new e(this, null);
        R4.b bVarA = R4.i.a(i, this.f5267j, 4);
        p111u4.i iVarG = AbstractC0336x.g(interfaceC0335w.d(), this.f5266h, true);
        W4.d dVar = D.f4604a;
        if (iVarG != dVar && iVarG.J(p111u4.e.f12750h) == null) {
            iVarG = iVarG.o(dVar);
        }
        R4.l lVar = new R4.l(iVarG, bVarA);
        lVar.f0(3, lVar, eVar);
        return lVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strC = c();
        if (strC != null) {
            arrayList.add(strC);
        }
        p111u4.j jVar = p111u4.j.f12751h;
        p111u4.i iVar = this.f5266h;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i = this.i;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        int i3 = this.f5267j;
        if (i3 != 1) {
            arrayList.add("onBufferOverflow=".concat(AbstractC0013g0.v(i3)));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return AbstractC0013g0.m(sb, p089q4.l.e0(arrayList, ", ", null, null, null, 62), ']');
    }
}

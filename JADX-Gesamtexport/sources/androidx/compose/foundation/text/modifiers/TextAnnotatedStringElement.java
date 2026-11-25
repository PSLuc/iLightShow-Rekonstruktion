package androidx.compose.foundation.text.modifiers;

import D4.c;
import E.h;
import E4.k;
import G0.C0110f;
import G0.J;
import L0.d;
import Z.n;
import java.util.List;
import p089q4.u;
import p096s.AbstractC0916i;
import p124x0.AbstractC1098f;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
public final class TextAnnotatedStringElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0110f f6662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f6663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f6664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f6665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6669h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f6670j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f6671k;

    public TextAnnotatedStringElement(C0110f c0110f, J j4, d dVar, c cVar, int i, boolean z5, int i3, int i6, List list, c cVar2, c cVar3) {
        this.f6662a = c0110f;
        this.f6663b = j4;
        this.f6664c = dVar;
        this.f6665d = cVar;
        this.f6666e = i;
        this.f6667f = z5;
        this.f6668g = i3;
        this.f6669h = i6;
        this.i = list;
        this.f6670j = cVar2;
        this.f6671k = cVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        textAnnotatedStringElement.getClass();
        return k.a(this.f6662a, textAnnotatedStringElement.f6662a) && k.a(this.f6663b, textAnnotatedStringElement.f6663b) && k.a(this.i, textAnnotatedStringElement.i) && k.a(this.f6664c, textAnnotatedStringElement.f6664c) && this.f6665d == textAnnotatedStringElement.f6665d && this.f6671k == textAnnotatedStringElement.f6671k && this.f6666e == textAnnotatedStringElement.f6666e && this.f6667f == textAnnotatedStringElement.f6667f && this.f6668g == textAnnotatedStringElement.f6668g && this.f6669h == textAnnotatedStringElement.f6669h && this.f6670j == textAnnotatedStringElement.f6670j;
    }

    public final int hashCode() {
        int iHashCode = (this.f6664c.hashCode() + ((this.f6663b.hashCode() + (this.f6662a.hashCode() * 31)) * 31)) * 31;
        c cVar = this.f6665d;
        int iM = (((p012c.k.m(this.f6667f, AbstractC0916i.c(this.f6666e, (iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31, 31), 31) + this.f6668g) * 31) + this.f6669h) * 31;
        List list = this.i;
        int iHashCode2 = (iM + (list != null ? list.hashCode() : 0)) * 31;
        c cVar2 = this.f6670j;
        int iHashCode3 = (iHashCode2 + (cVar2 != null ? cVar2.hashCode() : 0)) * 29791;
        c cVar3 = this.f6671k;
        return iHashCode3 + (cVar3 != null ? cVar3.hashCode() : 0);
    }

    @Override // p124x0.Q
    public final n l() {
        c cVar = this.f6670j;
        c cVar2 = this.f6671k;
        C0110f c0110f = this.f6662a;
        J j4 = this.f6663b;
        d dVar = this.f6664c;
        c cVar3 = this.f6665d;
        int i = this.f6666e;
        boolean z5 = this.f6667f;
        int i3 = this.f6668g;
        int i6 = this.f6669h;
        List list = this.i;
        h hVar = new h();
        hVar.f880u = c0110f;
        hVar.f881v = j4;
        hVar.f882w = dVar;
        hVar.f883x = cVar3;
        hVar.f884y = i;
        hVar.f885z = z5;
        hVar.f874A = i3;
        hVar.f875B = i6;
        hVar.f876C = list;
        hVar.f877D = cVar;
        hVar.f878E = cVar2;
        return hVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    /* JADX WARN: Code duplicated, block: B:34:0x008c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:40:0x009a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:66:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x0110  */
    /* JADX WARN: Code duplicated, block: B:74:0x0119  */
    /* JADX WARN: Code duplicated, block: B:76:0x0121  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    @Override // p124x0.Q
    public final void m(n nVar) {
        boolean z5;
        C0110f c0110f;
        boolean zA;
        List list;
        List list2;
        List list3;
        boolean z6;
        d dVar;
        int i;
        List list4;
        int i3;
        int i6;
        boolean z7;
        boolean z8;
        boolean z9;
        c cVar;
        c cVar2;
        c cVar3;
        boolean z10;
        boolean z11;
        h hVar = (h) nVar;
        J j4 = hVar.f881v;
        J j6 = this.f6663b;
        if (j6 != j4) {
            if (!j6.f1472a.b(j4.f1472a)) {
                z5 = true;
            }
            c0110f = this.f6662a;
            zA = k.a(hVar.f880u.f1494h, c0110f.f1494h);
            boolean zEquals = hVar.f880u.b().equals(c0110f.b());
            list = hVar.f880u.f1495j;
            list2 = u.f11237h;
            if (list == null) {
                list = list2;
            }
            list3 = c0110f.f1495j;
            if (list3 != null) {
                list2 = list3;
            }
            boolean zEquals2 = list.equals(list2);
            boolean zA2 = k.a(hVar.f880u.f1496k, c0110f.f1496k);
            if (!zA && zEquals && zEquals2 && zA2) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (z6) {
                hVar.f880u = c0110f;
            }
            if (!zA) {
                hVar.I = null;
            }
            dVar = this.f6664c;
            i = this.f6666e;
            J j7 = this.f6663b;
            list4 = this.i;
            i3 = this.f6669h;
            i6 = this.f6668g;
            z7 = this.f6667f;
            z8 = true;
            z9 = !hVar.f881v.c(j7);
            hVar.f881v = j7;
            if (!k.a(hVar.f876C, list4)) {
                hVar.f876C = list4;
                z9 = true;
            }
            if (hVar.f875B != i3) {
                hVar.f875B = i3;
                z9 = true;
            }
            if (hVar.f874A != i6) {
                hVar.f874A = i6;
                z9 = true;
            }
            if (hVar.f885z != z7) {
                hVar.f885z = z7;
                z9 = true;
            }
            if (!k.a(hVar.f882w, dVar)) {
                hVar.f882w = dVar;
                z9 = true;
            }
            if (hVar.f884y == i) {
                z8 = z9;
            } else {
                hVar.f884y = i;
            }
            cVar = this.f6665d;
            cVar2 = this.f6670j;
            cVar3 = this.f6671k;
            z10 = true;
            if (hVar.f883x != cVar) {
                hVar.f883x = cVar;
                z11 = true;
            } else {
                z11 = false;
            }
            if (hVar.f877D != cVar2) {
                hVar.f877D = cVar2;
                z11 = true;
            }
            if (hVar.f878E != cVar3) {
                hVar.f878E = cVar3;
            } else {
                z10 = z11;
            }
            if (z6 || z8 || z10) {
                E.d dVarY0 = hVar.y0();
                C0110f c0110f2 = hVar.f880u;
                J j8 = hVar.f881v;
                d dVar2 = hVar.f882w;
                int i7 = hVar.f884y;
                boolean z12 = hVar.f885z;
                int i8 = hVar.f874A;
                int i9 = hVar.f875B;
                List list5 = hVar.f876C;
                dVarY0.f837a = c0110f2;
                dVarY0.f838b = j8;
                dVarY0.f839c = dVar2;
                dVarY0.f840d = i7;
                dVarY0.f841e = z12;
                dVarY0.f842f = i8;
                dVarY0.f843g = i9;
                dVarY0.f844h = list5;
                dVarY0.f847l = null;
                dVarY0.f849n = null;
                dVarY0.f851p = -1;
                dVarY0.f850o = -1;
            }
            if (hVar.f5969t) {
                if (z6 || (z5 && hVar.H != null)) {
                    AbstractC1098f.n(hVar);
                }
                if (z6 || z8 || z10) {
                    AbstractC1098f.m(hVar);
                    AbstractC1098f.l(hVar);
                }
                if (z5) {
                    AbstractC1098f.l(hVar);
                }
            }
            return;
        }
        j6.getClass();
        z5 = false;
        c0110f = this.f6662a;
        zA = k.a(hVar.f880u.f1494h, c0110f.f1494h);
        boolean zEquals3 = hVar.f880u.b().equals(c0110f.b());
        list = hVar.f880u.f1495j;
        list2 = u.f11237h;
        if (list == null) {
            list = list2;
        }
        list3 = c0110f.f1495j;
        if (list3 != null) {
            list2 = list3;
        }
        boolean zEquals4 = list.equals(list2);
        boolean zA3 = k.a(hVar.f880u.f1496k, c0110f.f1496k);
        if (!zA) {
            z6 = true;
        } else {
            z6 = true;
        }
        if (z6) {
            hVar.f880u = c0110f;
        }
        if (!zA) {
            hVar.I = null;
        }
        dVar = this.f6664c;
        i = this.f6666e;
        J j9 = this.f6663b;
        list4 = this.i;
        i3 = this.f6669h;
        i6 = this.f6668g;
        z7 = this.f6667f;
        z8 = true;
        z9 = !hVar.f881v.c(j9);
        hVar.f881v = j9;
        if (!k.a(hVar.f876C, list4)) {
            hVar.f876C = list4;
            z9 = true;
        }
        if (hVar.f875B != i3) {
            hVar.f875B = i3;
            z9 = true;
        }
        if (hVar.f874A != i6) {
            hVar.f874A = i6;
            z9 = true;
        }
        if (hVar.f885z != z7) {
            hVar.f885z = z7;
            z9 = true;
        }
        if (!k.a(hVar.f882w, dVar)) {
            hVar.f882w = dVar;
            z9 = true;
        }
        if (hVar.f884y == i) {
            z8 = z9;
        } else {
            hVar.f884y = i;
        }
        cVar = this.f6665d;
        cVar2 = this.f6670j;
        cVar3 = this.f6671k;
        z10 = true;
        if (hVar.f883x != cVar) {
            hVar.f883x = cVar;
            z11 = true;
        } else {
            z11 = false;
        }
        if (hVar.f877D != cVar2) {
            hVar.f877D = cVar2;
            z11 = true;
        }
        if (hVar.f878E != cVar3) {
            hVar.f878E = cVar3;
        } else {
            z10 = z11;
        }
        if (z6) {
            E.d dVarY1 = hVar.y0();
            C0110f c0110f3 = hVar.f880u;
            J j10 = hVar.f881v;
            d dVar3 = hVar.f882w;
            int i10 = hVar.f884y;
            boolean z13 = hVar.f885z;
            int i11 = hVar.f874A;
            int i12 = hVar.f875B;
            List list6 = hVar.f876C;
            dVarY1.f837a = c0110f3;
            dVarY1.f838b = j10;
            dVarY1.f839c = dVar3;
            dVarY1.f840d = i10;
            dVarY1.f841e = z13;
            dVarY1.f842f = i11;
            dVarY1.f843g = i12;
            dVarY1.f844h = list6;
            dVarY1.f847l = null;
            dVarY1.f849n = null;
            dVarY1.f851p = -1;
            dVarY1.f850o = -1;
        } else {
            E.d dVarY2 = hVar.y0();
            C0110f c0110f4 = hVar.f880u;
            J j11 = hVar.f881v;
            d dVar4 = hVar.f882w;
            int i13 = hVar.f884y;
            boolean z14 = hVar.f885z;
            int i14 = hVar.f874A;
            int i15 = hVar.f875B;
            List list7 = hVar.f876C;
            dVarY2.f837a = c0110f4;
            dVarY2.f838b = j11;
            dVarY2.f839c = dVar4;
            dVarY2.f840d = i13;
            dVarY2.f841e = z14;
            dVarY2.f842f = i14;
            dVarY2.f843g = i15;
            dVarY2.f844h = list7;
            dVarY2.f847l = null;
            dVarY2.f849n = null;
            dVarY2.f851p = -1;
            dVarY2.f850o = -1;
        }
        if (hVar.f5969t) {
            return;
        }
        if (z6) {
            AbstractC1098f.n(hVar);
        } else {
            AbstractC1098f.n(hVar);
        }
        if (z6) {
            AbstractC1098f.m(hVar);
            AbstractC1098f.l(hVar);
        } else {
            AbstractC1098f.m(hVar);
            AbstractC1098f.l(hVar);
        }
        if (z5) {
            AbstractC1098f.l(hVar);
        }
    }
}

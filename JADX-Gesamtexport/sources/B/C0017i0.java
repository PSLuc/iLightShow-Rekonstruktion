package B;

import F1.C0090g;
import F1.C0092i;
import L.AbstractC0151k;
import java.util.ArrayList;
import java.util.List;
import p123x.AbstractC1078k;
import p123x.C1069b;

/* JADX INFO: renamed from: B.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0017i0 extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f332h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f333j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f334k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f335l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0017i0(Y4.a aVar, int i, p089q4.v vVar, String str) {
        super(1);
        this.f332h = 2;
        this.i = aVar;
        this.f334k = i;
        this.f335l = vVar;
        this.f333j = str;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f332h) {
            case 0:
                p113v0.M m6 = (p113v0.M) obj;
                C0019j0 c0019j0 = (C0019j0) this.f335l;
                int i = c0019j0.f341b;
                a1 a1Var = (a1) c0019j0.f343d.invoke();
                G0.G g6 = a1Var != null ? a1Var.f281a : null;
                p113v0.H h6 = (p113v0.H) this.i;
                boolean z5 = h6.getLayoutDirection() == S0.k.i;
                p113v0.N n6 = (p113v0.N) this.f333j;
                p030f0.d dVarJ = AbstractC0029o0.j(h6, i, c0019j0.f342c, g6, z5, n6.f13137h);
                p112v.W w6 = p112v.W.i;
                int i3 = n6.f13137h;
                W0 w7 = c0019j0.f340a;
                w7.a(w6, dVarJ, this.f334k, i3);
                p113v0.M.f(m6, n6, Math.round(-w7.f252a.h()), 0);
                return p084p4.x.f10867a;
            case 1:
                p113v0.M m7 = (p113v0.M) obj;
                l1 l1Var = (l1) this.f335l;
                int i6 = l1Var.f366b;
                a1 a1Var2 = (a1) l1Var.f368d.invoke();
                G0.G g7 = a1Var2 != null ? a1Var2.f281a : null;
                p113v0.N n7 = (p113v0.N) this.f333j;
                p030f0.d dVarJ2 = AbstractC0029o0.j((p113v0.H) this.i, i6, l1Var.f367c, g7, false, n7.f13137h);
                p112v.W w8 = p112v.W.f12920h;
                int i7 = n7.i;
                W0 w9 = l1Var.f365a;
                w9.a(w8, dVarJ2, this.f334k, i7);
                p113v0.M.f(m7, n7, 0, Math.round(-w9.f252a.h()));
                return p084p4.x.f10867a;
            case 2:
                C0092i c0092i = (C0092i) obj;
                E4.k.f("$this$navArgument", c0092i);
                Y4.a aVar = (Y4.a) this.i;
                a5.g descriptor = aVar.getDescriptor();
                int i8 = this.f334k;
                a5.g gVarK = descriptor.k(i8);
                boolean zI = gVarK.i();
                F1.S sA = H1.c.a(gVarK, (p089q4.v) this.f335l);
                if (sA == null) {
                    throw new IllegalArgumentException(H1.c.g((String) this.f333j, gVarK.b(), aVar.getDescriptor().b(), "{}"));
                }
                C0090g c0090g = c0092i.f1348a;
                c0090g.f1341a = sA;
                c0090g.f1342b = zI;
                if (aVar.getDescriptor().l(i8)) {
                    c0090g.f1343c = true;
                }
                return p084p4.x.f10867a;
            case 3:
                p113v0.M m8 = (p113v0.M) obj;
                ArrayList arrayList = (ArrayList) this.f335l;
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    List list = (List) arrayList.get(i9);
                    int size2 = list.size();
                    int[] iArr = new int[size2];
                    int i10 = 0;
                    while (true) {
                        p113v0.H h7 = (p113v0.H) this.i;
                        if (i10 < size2) {
                            iArr[i10] = ((p113v0.N) list.get(i10)).f13137h + (i10 < p089q4.m.L(list) ? h7.H(AbstractC0151k.f2807a) : 0);
                            i10++;
                        } else {
                            C1069b c1069b = AbstractC1078k.f13778b;
                            int[] iArr2 = new int[size2];
                            for (int i11 = 0; i11 < size2; i11++) {
                                iArr2[i11] = 0;
                            }
                            c1069b.b(h7, this.f334k, iArr, h7.getLayoutDirection(), iArr2);
                            int size3 = list.size();
                            for (int i12 = 0; i12 < size3; i12++) {
                                p113v0.M.d(m8, (p113v0.N) list.get(i12), iArr2[i12], ((Number) ((ArrayList) this.f333j).get(i9)).intValue());
                            }
                        }
                    }
                }
                return p084p4.x.f10867a;
            case 4:
                if (obj == ((N.D) this.i)) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof X.B) {
                    int i13 = ((V.c) this.f335l).f5393a - this.f334k;
                    p080p.v vVar = (p080p.v) this.f333j;
                    int iC = vVar.c(obj);
                    int iMin = Math.min(i13, iC >= 0 ? vVar.f10790c[iC] : Integer.MAX_VALUE);
                    int iB = vVar.b(obj);
                    if (iB < 0) {
                        iB = ~iB;
                    }
                    vVar.f10789b[iB] = obj;
                    vVar.f10790c[iB] = iMin;
                }
                return p084p4.x.f10867a;
            default:
                p113v0.M m9 = (p113v0.M) obj;
                p113v0.N[] nArr = (p113v0.N[]) this.i;
                int length = nArr.length;
                int i14 = 0;
                int i15 = 0;
                while (i14 < length) {
                    p113v0.N n8 = nArr[i14];
                    int i16 = i15 + 1;
                    E4.k.c(n8);
                    Object objI = n8.i();
                    p123x.S s6 = objI instanceof p123x.S ? (p123x.S) objI : null;
                    p123x.U u6 = (p123x.U) this.f335l;
                    u6.getClass();
                    p123x.A a6 = s6 != null ? s6.f13715c : null;
                    int i17 = this.f334k;
                    p113v0.M.d(m9, n8, ((int[]) this.f333j)[i15], a6 != null ? a6.f13674a.a(i17 - n8.i, S0.k.f4897h) : Math.round((1 + u6.f13718b.f5949a) * ((i17 - n8.i) / 2.0f)));
                    i14++;
                    i15 = i16;
                }
                return p084p4.x.f10867a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0017i0(Object obj, Object obj2, Object obj3, int i, int i3) {
        super(1);
        this.f332h = i3;
        this.i = obj;
        this.f335l = obj2;
        this.f333j = obj3;
        this.f334k = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0017i0(ArrayList arrayList, p113v0.H h6, int i, ArrayList arrayList2) {
        super(1);
        this.f332h = 3;
        float f6 = AbstractC0151k.f2807a;
        this.f335l = arrayList;
        this.i = h6;
        this.f334k = i;
        this.f333j = arrayList2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0017i0(p113v0.N[] nArr, p123x.U u6, int i, int[] iArr) {
        super(1);
        this.f332h = 5;
        this.i = nArr;
        this.f335l = u6;
        this.f334k = i;
        this.f333j = iArr;
    }
}

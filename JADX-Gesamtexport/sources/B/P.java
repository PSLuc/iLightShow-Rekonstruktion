package B;

import F1.C0096m;
import G0.C0110f;
import M0.C0198a;
import androidx.lifecycle.EnumC0453m;
import androidx.lifecycle.InterfaceC0457q;
import androidx.lifecycle.InterfaceC0458s;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;

/* JADX INFO: loaded from: classes.dex */
public final class P extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f201h = 1;
    public final /* synthetic */ boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f202j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f203k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(C0096m c0096m, X.s sVar, boolean z5) {
        super(1);
        this.f202j = c0096m;
        this.i = z5;
        this.f203k = sVar;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        int i = 2;
        Object obj2 = this.f203k;
        final boolean z5 = this.i;
        Object obj3 = this.f202j;
        switch (this.f201h) {
            case 0:
                C0110f c0110f = (C0110f) obj;
                if (!z5) {
                    return Boolean.FALSE;
                }
                C0036s0 c0036s0 = (C0036s0) obj3;
                M0.B b6 = c0036s0.f420e;
                J j4 = c0036s0.f434t;
                p084p4.x xVar = null;
                if (b6 != null) {
                    M0.w wVarJ = c0036s0.f419d.j(p089q4.m.M(new M0.k(), new C0198a(c0110f, 1)));
                    b6.a(null, wVarJ);
                    j4.invoke(wVarJ);
                    xVar = p084p4.x.f10867a;
                }
                if (xVar == null) {
                    M0.w wVar = (M0.w) obj2;
                    String str = wVar.f3453a.f1494h;
                    int i3 = G0.I.f1469c;
                    long j6 = wVar.f3454b;
                    int i6 = (int) (j6 >> 32);
                    int i7 = (int) (j6 & 4294967295L);
                    E4.k.f("<this>", str);
                    E4.k.f("replacement", c0110f);
                    if (i7 < i6) {
                        throw new IndexOutOfBoundsException("End index (" + i7 + ") is less than start index (" + i6 + ").");
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) str, 0, i6);
                    sb.append((CharSequence) c0110f);
                    sb.append((CharSequence) str, i7, str.length());
                    String string = sb.toString();
                    int length = c0110f.f1494h.length() + i6;
                    j4.invoke(new M0.w(4, string, AbstractC0599v0.d(length, length)));
                }
                return Boolean.TRUE;
            default:
                final C0096m c0096m = (C0096m) obj3;
                final X.s sVar = (X.s) obj2;
                InterfaceC0457q interfaceC0457q = new InterfaceC0457q() { // from class: G1.n
                    @Override // androidx.lifecycle.InterfaceC0457q
                    public final void c(InterfaceC0458s interfaceC0458s, EnumC0453m enumC0453m) {
                        C0096m c0096m2 = c0096m;
                        boolean z6 = z5;
                        X.s sVar2 = sVar;
                        if (z6 && !sVar2.contains(c0096m2)) {
                            sVar2.add(c0096m2);
                        }
                        if (enumC0453m == EnumC0453m.ON_START && !sVar2.contains(c0096m2)) {
                            sVar2.add(c0096m2);
                        }
                        if (enumC0453m == EnumC0453m.ON_STOP) {
                            sVar2.remove(c0096m2);
                        }
                    }
                };
                c0096m.f1359o.a(interfaceC0457q);
                return new N0(c0096m, i, interfaceC0457q);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(boolean z5, C0036s0 c0036s0, E0.h hVar, M0.w wVar) {
        super(1);
        this.i = z5;
        this.f202j = c0036s0;
        this.f203k = wVar;
    }
}

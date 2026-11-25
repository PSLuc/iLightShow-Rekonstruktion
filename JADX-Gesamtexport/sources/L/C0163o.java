package L;

import java.util.List;
import java.util.NoSuchElementException;
import p113v0.AbstractC1020c;
import p113v0.C1029l;
import p123x.InterfaceC1073f;
import p123x.InterfaceC1074g;

/* JADX INFO: renamed from: L.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0163o implements p113v0.F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f2858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1073f f2859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1074g f2860c;

    public C0163o(float f6, InterfaceC1073f interfaceC1073f, InterfaceC1074g interfaceC1074g) {
        this.f2858a = f6;
        this.f2859b = interfaceC1073f;
        this.f2860c = interfaceC1074g;
    }

    @Override // p113v0.F
    public final p113v0.G c(p113v0.H h6, List list, long j4) {
        int iH;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            p113v0.E e6 = (p113v0.E) list.get(i);
            if (E4.k.a(androidx.compose.ui.layout.a.a(e6), "navigationIcon")) {
                p113v0.N nC = e6.c(S0.a.a(j4, 0, 0, 0, 0, 14));
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    p113v0.E e7 = (p113v0.E) list.get(i3);
                    if (E4.k.a(androidx.compose.ui.layout.a.a(e7), "actionIcons")) {
                        p113v0.N nC2 = e7.c(S0.a.a(j4, 0, 0, 0, 0, 14));
                        if (S0.a.h(j4) == Integer.MAX_VALUE) {
                            iH = S0.a.h(j4);
                        } else {
                            iH = (S0.a.h(j4) - nC.f13137h) - nC2.f13137h;
                            if (iH < 0) {
                                iH = 0;
                            }
                        }
                        int i6 = iH;
                        int size3 = list.size();
                        for (int i7 = 0; i7 < size3; i7++) {
                            p113v0.E e8 = (p113v0.E) list.get(i7);
                            if (E4.k.a(androidx.compose.ui.layout.a.a(e8), "title")) {
                                p113v0.N nC3 = e8.c(S0.a.a(j4, 0, i6, 0, 0, 12));
                                C1029l c1029l = AbstractC1020c.f13161b;
                                int iE0 = nC3.e0(c1029l) != Integer.MIN_VALUE ? nC3.e0(c1029l) : 0;
                                float f6 = this.f2858a;
                                int iD = Float.isNaN(f6) ? 0 : G4.a.D(f6);
                                return h6.u(S0.a.h(j4), iD, p089q4.v.f11238h, new C0160n(nC, iD, nC3, this.f2859b, j4, nC2, h6, this.f2860c, iE0));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}

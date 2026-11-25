package p130y0;

import E4.k;
import G0.G;
import R0.h;
import java.text.BreakIterator;
import p037g2.y;

/* JADX INFO: renamed from: y0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1121b extends y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static C1121b f14348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static C1121b f14349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static C1121b f14350g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f14352d;

    @Override // p037g2.y
    public final int[] b(int i) {
        int iE;
        switch (this.f14351c) {
            case 0:
                int length = d().length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f14352d;
                    if (breakIterator == null) {
                        k.m("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f14352d;
                        if (breakIterator2 == null) {
                            k.m("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return c(i, iFollowing);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f14352d;
                    if (breakIterator3 == null) {
                        k.m("impl");
                        throw null;
                    }
                    i = breakIterator3.following(i);
                } while (i != -1);
                return null;
            case 1:
                if (d().length() <= 0 || i >= d().length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!i(i) && (!i(i) || (i != 0 && i(i - 1)))) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f14352d;
                    if (breakIterator4 == null) {
                        k.m("impl");
                        throw null;
                    }
                    i = breakIterator4.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f14352d;
                if (breakIterator5 == null) {
                    k.m("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator5.following(i);
                if (iFollowing2 == -1 || !h(iFollowing2)) {
                    return null;
                }
                return c(i, iFollowing2);
            default:
                if (d().length() <= 0 || i >= d().length()) {
                    return null;
                }
                h hVar = h.i;
                if (i < 0) {
                    G g6 = (G) this.f14352d;
                    if (g6 == null) {
                        k.m("layoutResult");
                        throw null;
                    }
                    iE = g6.e(0);
                } else {
                    G g7 = (G) this.f14352d;
                    if (g7 == null) {
                        k.m("layoutResult");
                        throw null;
                    }
                    int iE2 = g7.e(i);
                    iE = f(iE2, hVar) == i ? iE2 : iE2 + 1;
                }
                G g8 = (G) this.f14352d;
                if (g8 == null) {
                    k.m("layoutResult");
                    throw null;
                }
                if (iE >= g8.f1459b.f1518f) {
                    return null;
                }
                return c(f(iE, hVar), f(iE, h.f4743h) + 1);
        }
    }

    @Override // p037g2.y
    public final int[] e(int i) {
        int iE;
        switch (this.f14351c) {
            case 0:
                int length = d().length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f14352d;
                    if (breakIterator == null) {
                        k.m("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f14352d;
                        if (breakIterator2 == null) {
                            k.m("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return c(iPreceding, i);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f14352d;
                    if (breakIterator3 == null) {
                        k.m("impl");
                        throw null;
                    }
                    i = breakIterator3.preceding(i);
                } while (i != -1);
                return null;
            case 1:
                int length2 = d().length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !i(i - 1) && !h(i)) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f14352d;
                    if (breakIterator4 == null) {
                        k.m("impl");
                        throw null;
                    }
                    i = breakIterator4.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f14352d;
                if (breakIterator5 == null) {
                    k.m("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator5.preceding(i);
                if (iPreceding2 == -1 || !i(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !i(iPreceding2 - 1)) {
                    return c(iPreceding2, i);
                }
                return null;
            default:
                if (d().length() <= 0 || i <= 0) {
                    return null;
                }
                int length3 = d().length();
                h hVar = h.f4743h;
                if (i > length3) {
                    G g6 = (G) this.f14352d;
                    if (g6 == null) {
                        k.m("layoutResult");
                        throw null;
                    }
                    iE = g6.e(d().length());
                } else {
                    G g7 = (G) this.f14352d;
                    if (g7 == null) {
                        k.m("layoutResult");
                        throw null;
                    }
                    int iE2 = g7.e(i);
                    iE = f(iE2, hVar) + 1 == i ? iE2 : iE2 - 1;
                }
                if (iE < 0) {
                    return null;
                }
                return c(f(iE, h.i), f(iE, hVar) + 1);
        }
    }

    public int f(int i, h hVar) {
        G g6 = (G) this.f14352d;
        if (g6 == null) {
            k.m("layoutResult");
            throw null;
        }
        int iH = g6.h(i);
        G g7 = (G) this.f14352d;
        if (g7 == null) {
            k.m("layoutResult");
            throw null;
        }
        if (hVar != g7.i(iH)) {
            G g8 = (G) this.f14352d;
            if (g8 != null) {
                return g8.h(i);
            }
            k.m("layoutResult");
            throw null;
        }
        G g9 = (G) this.f14352d;
        if (g9 != null) {
            return g9.d(i, false) - 1;
        }
        k.m("layoutResult");
        throw null;
    }

    public void g(String str) {
        switch (this.f14351c) {
            case 0:
                this.f9169a = str;
                BreakIterator breakIterator = (BreakIterator) this.f14352d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    k.m("impl");
                    throw null;
                }
            default:
                this.f9169a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.f14352d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    k.m("impl");
                    throw null;
                }
        }
    }

    public boolean h(int i) {
        if (i <= 0 || !i(i - 1)) {
            return false;
        }
        return i == d().length() || !i(i);
    }

    public boolean i(int i) {
        if (i < 0 || i >= d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(d().codePointAt(i));
    }
}

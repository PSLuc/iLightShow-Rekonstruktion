package androidx.compose.ui.draw;

import D4.c;
import Z.o;
import p035g0.C0709j;
import p053k0.b;
import p113v0.C1025h;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final o a(o oVar, c cVar) {
        return oVar.k(new DrawBehindElement(cVar));
    }

    public static final o b(o oVar, c cVar) {
        return oVar.k(new DrawWithCacheElement(cVar));
    }

    public static final o c(o oVar, c cVar) {
        return oVar.k(new DrawWithContentElement(cVar));
    }

    public static o d(o oVar, b bVar, Z.c cVar, C1025h c1025h, float f6, C0709j c0709j, int i) {
        if ((i & 4) != 0) {
            cVar = Z.b.f5936l;
        }
        Z.c cVar2 = cVar;
        if ((i & 16) != 0) {
            f6 = 1.0f;
        }
        return oVar.k(new PainterElement(bVar, cVar2, c1025h, f6, c0709j));
    }
}

package D;

import android.view.inputmethod.CursorAnchorInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, G0.G g6, p030f0.d dVar) {
        int iC;
        G0.n nVar;
        int iC2;
        if (!dVar.e() && (iC = g6.f1459b.c(dVar.f8840b)) <= (iC2 = (nVar = g6.f1459b).c(dVar.f8842d))) {
            while (true) {
                builder.addVisibleLineBounds(g6.f(iC), nVar.d(iC), g6.g(iC), nVar.b(iC));
                if (iC == iC2) {
                    break;
                }
                iC++;
            }
        }
        return builder;
    }
}

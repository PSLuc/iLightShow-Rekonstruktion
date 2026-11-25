package M0;

import android.view.inputmethod.CursorAnchorInfo;
import p035g0.H;

/* JADX INFO: renamed from: M0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0199b {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, p030f0.d dVar) {
        return builder.setEditorBoundsInfo(D.j.j().setEditorBounds(H.u(dVar)).setHandwritingBounds(H.u(dVar)).build());
    }
}

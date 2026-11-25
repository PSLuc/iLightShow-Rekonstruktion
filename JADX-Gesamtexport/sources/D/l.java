package D;

import android.view.inputmethod.CursorAnchorInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, p030f0.d dVar) {
        return builder.setEditorBoundsInfo(j.j().setEditorBounds(p035g0.H.u(dVar)).setHandwritingBounds(p035g0.H.u(dVar)).build());
    }
}

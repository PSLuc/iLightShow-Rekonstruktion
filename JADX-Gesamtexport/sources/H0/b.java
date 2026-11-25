package H0;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f1693a = new b();

    /* JADX WARN: Type inference failed for: r6v2, types: [H0.a] */
    public final int[] a(y yVar, RectF rectF, int i, final D4.e eVar) {
        SegmentFinder segmentFinderH;
        if (i == 1) {
            segmentFinderH = I0.b.f1804a.a(new D.x(yVar.f1734e.getText(), 5, yVar.j()));
        } else {
            D.s.m();
            segmentFinderH = D.s.h(D.s.g(yVar.f1734e.getText(), yVar.f1730a));
        }
        return yVar.f1734e.getRangeForRect(rectF, segmentFinderH, new Layout.TextInclusionStrategy() { // from class: H0.a
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) eVar.d(rectF2, rectF3)).booleanValue();
            }
        });
    }
}

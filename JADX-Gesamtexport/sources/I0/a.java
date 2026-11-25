package I0;

import android.text.SegmentFinder;

/* JADX INFO: loaded from: classes.dex */
public final class a extends SegmentFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f1803a;

    public a(c cVar) {
        this.f1803a = cVar;
    }

    public final int nextEndBoundary(int i) {
        return this.f1803a.b(i);
    }

    public final int nextStartBoundary(int i) {
        return this.f1803a.f(i);
    }

    public final int previousEndBoundary(int i) {
        return this.f1803a.g(i);
    }

    public final int previousStartBoundary(int i) {
        return this.f1803a.a(i);
    }
}

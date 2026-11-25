package p112v;

import D4.f;
import L.C0188w1;
import Z.o;
import androidx.compose.foundation.gestures.DraggableElement;
import p117w.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N f12871a = new N(3, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final N f12872b = new N(3, null, 1);

    public static o a(C0188w1 c0188w1, W w6, boolean z5, m mVar, boolean z6, f fVar, boolean z7, int i) {
        if ((i & 4) != 0) {
            z5 = true;
        }
        boolean z8 = z5;
        if ((i & 8) != 0) {
            mVar = null;
        }
        return new DraggableElement(c0188w1, w6, z8, mVar, (i & 16) != 0 ? false : z6, f12871a, fVar, (i & 128) != 0 ? false : z7);
    }
}

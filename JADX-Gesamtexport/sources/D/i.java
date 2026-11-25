package D;

import B.C0036s0;
import F.P;
import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import p130y0.G0;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f692a = new i();

    public final void a(C0036s0 c0036s0, P p6, HandwritingGesture handwritingGesture, G0 g6, Executor executor, final IntConsumer intConsumer, D4.c cVar) {
        final int i = c0036s0 != null ? v.f704a.i(c0036s0, handwritingGesture, p6, g6, cVar) : 3;
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new Runnable() { // from class: D.h
                @Override // java.lang.Runnable
                public final void run() {
                    intConsumer.accept(i);
                }
            });
        } else {
            intConsumer.accept(i);
        }
    }

    public final boolean b(C0036s0 c0036s0, P p6, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (c0036s0 != null) {
            return v.f704a.A(c0036s0, previewableHandwritingGesture, p6, cancellationSignal);
        }
        return false;
    }
}

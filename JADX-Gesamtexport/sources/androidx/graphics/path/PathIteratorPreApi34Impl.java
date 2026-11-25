package androidx.graphics.path;

import android.graphics.Path;
import dalvik.annotation.optimization.FastNative;

/* JADX INFO: loaded from: classes.dex */
public final class PathIteratorPreApi34Impl {
    static {
        System.loadLibrary("androidx.graphics.path");
    }

    private final native long createInternalPathIterator(Path path, int i, float f6);

    private final native void destroyInternalPathIterator(long j4);

    @FastNative
    private final native boolean internalPathIteratorHasNext(long j4);

    @FastNative
    private final native int internalPathIteratorNext(long j4, float[] fArr, int i);

    @FastNative
    private final native int internalPathIteratorPeek(long j4);

    @FastNative
    private final native int internalPathIteratorRawSize(long j4);

    @FastNative
    private final native int internalPathIteratorSize(long j4);

    public final void finalize() {
        destroyInternalPathIterator(0L);
    }
}

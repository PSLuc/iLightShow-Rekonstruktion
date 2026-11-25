package h5;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H f9328a = new H(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f9329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f9330c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f9329b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f9330c = atomicReferenceArr;
    }

    public static final void a(H h6) {
        E4.k.f("segment", h6);
        if (h6.f9326f != null || h6.f9327g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (h6.f9324d) {
            return;
        }
        AtomicReference atomicReference = f9330c[(int) (Thread.currentThread().getId() & (((long) f9329b) - 1))];
        H h7 = f9328a;
        H h8 = (H) atomicReference.getAndSet(h7);
        if (h8 == h7) {
            return;
        }
        int i = h8 != null ? h8.f9323c : 0;
        if (i >= 65536) {
            atomicReference.set(h8);
            return;
        }
        h6.f9326f = h8;
        h6.f9322b = 0;
        h6.f9323c = i + 8192;
        atomicReference.set(h6);
    }

    public static final H b() {
        AtomicReference atomicReference = f9330c[(int) (Thread.currentThread().getId() & (((long) f9329b) - 1))];
        H h6 = f9328a;
        H h7 = (H) atomicReference.getAndSet(h6);
        if (h7 == h6) {
            return new H();
        }
        if (h7 == null) {
            atomicReference.set(null);
            return new H();
        }
        atomicReference.set(h7.f9326f);
        h7.f9326f = null;
        h7.f9323c = 0;
        return h7;
    }
}

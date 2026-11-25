package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0601w0 implements K0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0601w0 f8013b = new C0601w0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8014a;

    public /* synthetic */ C0601w0(int i) {
        this.f8014a = i;
    }

    public static final I0 c(Object obj, Object obj2) {
        I0 i3 = (I0) obj;
        I0 i6 = (I0) obj2;
        if (!i6.isEmpty()) {
            if (!i3.f7862h) {
                if (i3.isEmpty()) {
                    i3 = new I0();
                } else {
                    I0 i7 = new I0(i3);
                    i7.f7862h = true;
                    i3 = i7;
                }
            }
            i3.b();
            if (!i6.isEmpty()) {
                i3.putAll(i6);
            }
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.play_billing.K0
    public R0 a(Class cls) {
        switch (this.f8014a) {
            case 0:
                if (!AbstractC0605y0.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (R0) AbstractC0605y0.k(cls.asSubclass(AbstractC0605y0.class)).h(3);
                } catch (Exception e6) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e6);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.play_billing.K0
    public boolean b(Class cls) {
        switch (this.f8014a) {
            case 0:
                return AbstractC0605y0.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}

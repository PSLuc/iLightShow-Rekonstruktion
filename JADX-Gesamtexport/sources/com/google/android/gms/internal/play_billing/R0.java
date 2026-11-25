package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class R0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0573i0 f7905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f7907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7908d;

    public R0(AbstractC0573i0 abstractC0573i0, String str, Object[] objArr) {
        this.f7905a = abstractC0573i0;
        this.f7906b = str;
        this.f7907c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f7908d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i3 = 13;
        int i6 = 1;
        while (true) {
            int i7 = i6 + 1;
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 < 55296) {
                this.f7908d = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i6 = i7;
            }
        }
    }

    public final int a() {
        int i = this.f7908d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}

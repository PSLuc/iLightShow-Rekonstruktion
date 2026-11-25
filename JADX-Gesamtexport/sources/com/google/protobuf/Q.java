package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f8181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f8183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8184d;

    public Q(r rVar, String str, Object[] objArr) {
        this.f8181a = rVar;
        this.f8182b = str;
        this.f8183c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f8184d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i3 = 1;
        int i6 = 13;
        while (true) {
            int i7 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f8184d = i | (cCharAt2 << i6);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i6;
                i6 += 13;
                i3 = i7;
            }
        }
    }

    public final int a() {
        int i = this.f8184d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}

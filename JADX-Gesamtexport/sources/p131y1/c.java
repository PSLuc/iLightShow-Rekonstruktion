package p131y1;

import O0.h;
import android.text.InputFilter;
import p057l.A;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f14580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f14581b;

    public c(A a6) {
        this.f14580a = a6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r1 != 3) goto L27;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence filter(java.lang.CharSequence r4, int r5, int r6, android.text.Spanned r7, int r8, int r9) {
        /*
            r3 = this;
            l.A r0 = r3.f14580a
            boolean r1 = r0.isInEditMode()
            if (r1 == 0) goto L9
            goto L48
        L9:
            w1.h r1 = p119w1.h.a()
            int r1 = r1.b()
            if (r1 == 0) goto L49
            r2 = 1
            if (r1 == r2) goto L1a
            r5 = 3
            if (r1 == r5) goto L49
            goto L48
        L1a:
            if (r9 != 0) goto L2b
            if (r8 != 0) goto L2b
            int r3 = r7.length()
            if (r3 != 0) goto L2b
            java.lang.CharSequence r3 = r0.getText()
            if (r4 != r3) goto L2b
            goto L48
        L2b:
            if (r4 == 0) goto L48
            if (r5 != 0) goto L36
            int r3 = r4.length()
            if (r6 != r3) goto L36
            goto L3a
        L36:
            java.lang.CharSequence r4 = r4.subSequence(r5, r6)
        L3a:
            w1.h r3 = p119w1.h.a()
            int r5 = r4.length()
            r6 = 0
            java.lang.CharSequence r3 = r3.f(r6, r5, r6, r4)
            return r3
        L48:
            return r4
        L49:
            w1.h r5 = p119w1.h.a()
            O0.h r6 = r3.f14581b
            if (r6 != 0) goto L58
            O0.h r6 = new O0.h
            r6.<init>(r0, r3)
            r3.f14581b = r6
        L58:
            O0.h r3 = r3.f14581b
            r5.g(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p131y1.c.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }
}

package com.nanjoran.ilightshow.Services;

import P4.InterfaceC0335w;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8465l;

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new q0(2, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        ((q0) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
        return v4.a.f13292h;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:12:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p122w4.a
    public final java.lang.Object o(java.lang.Object r6) {
        /*
            r5 = this;
            v4.a r0 = v4.a.f13292h
            int r1 = r5.f8465l
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            S1.V.O(r6)
            goto L24
        Ld:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L15:
            S1.V.O(r6)
        L18:
            r5.f8465l = r2
            r3 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r6 = P4.AbstractC0336x.e(r3, r5)
            if (r6 != r0) goto L24
            return r0
        L24:
            com.nanjoran.ilightshow.Services.M r6 = com.nanjoran.ilightshow.Services.M.f8305O
            boolean r1 = r6.i()
            if (r1 == 0) goto L18
            H3.f r1 = H3.f.f1787d
            H3.d r1 = r1.a()
            if (r1 == 0) goto L39
            java.lang.String r1 = r1.c()
            goto L3a
        L39:
            r1 = 0
        L3a:
            java.lang.String r3 = "playing"
            boolean r1 = E4.k.a(r1, r3)
            if (r1 == 0) goto L18
            X.s r6 = r6.f8339z
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L18
            com.nanjoran.ilightshow.Services.E0 r6 = com.nanjoran.ilightshow.Services.E0.f8249o
            com.nanjoran.ilightshow.Services.F0 r6 = r6.a()
            com.nanjoran.ilightshow.Services.F0 r1 = com.nanjoran.ilightshow.Services.F0.MEMBERSHIP_V3
            if (r6 != r1) goto L18
            com.nanjoran.ilightshow.Services.r0 r6 = com.nanjoran.ilightshow.Services.r0.f8470a
            r6.getClass()
            K4.e[] r6 = com.nanjoran.ilightshow.Services.r0.f8471b
            r1 = 2
            r3 = r6[r1]
            t r4 = com.nanjoran.ilightshow.Services.r0.f8473d
            java.lang.Object r3 = r4.a(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            int r3 = r3 + r2
            r6 = r6[r1]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r4.b(r6, r1)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nanjoran.ilightshow.Services.q0.o(java.lang.Object):java.lang.Object");
    }
}

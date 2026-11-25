package com.nanjoran.ilightshow.Services;

import P4.InterfaceC0335w;

/* JADX INFO: renamed from: com.nanjoran.ilightshow.Services.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0696w extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8491l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f8492m;

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        C0696w c0696w = new C0696w(2, dVar);
        c0696w.f8492m = obj;
        return c0696w;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0696w) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0030 A[PHI: r1
  0x0030: PHI (r1v3 ??) = (r1v9 ??), (r1v10 ??), (r1v4 ??), (r1v11 ??) binds: [B:28:0x0060, B:26:0x005d, B:16:0x0028, B:7:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0036 A[Catch: Exception -> 0x0016, TRY_ENTER, TryCatch #0 {Exception -> 0x0016, blocks: (B:7:0x0012, B:19:0x0036, B:22:0x0043, B:24:0x0047, B:25:0x0053, B:14:0x0024), top: B:30:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043 A[Catch: Exception -> 0x0016, PHI: r1 r8
  0x0043: PHI (r1v2 ??) = (r1v12 ??), (r1v13 ??) binds: [B:20:0x0040, B:14:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x0043: PHI (r8v2 java.lang.Object) = (r8v8 java.lang.Object), (r8v0 java.lang.Object) binds: [B:20:0x0040, B:14:0x0024] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0016, blocks: (B:7:0x0012, B:19:0x0036, B:22:0x0043, B:24:0x0047, B:25:0x0053, B:14:0x0024), top: B:30:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0047 A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:7:0x0012, B:19:0x0036, B:22:0x0043, B:24:0x0047, B:25:0x0053, B:14:0x0024), top: B:30:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0053 A[Catch: Exception -> 0x0016, TRY_LEAVE, TryCatch #0 {Exception -> 0x0016, blocks: (B:7:0x0012, B:19:0x0036, B:22:0x0043, B:24:0x0047, B:25:0x0053, B:14:0x0024), top: B:30:0x0008 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [P4.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005d -> B:17:0x0030). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0060 -> B:17:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p122w4.a
    public final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            v4.a r0 = v4.a.f13292h
            int r1 = r7.f8491l
            p4.x r2 = p084p4.x.f10867a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L28
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            java.lang.Object r1 = r7.f8492m
            P4.w r1 = (P4.InterfaceC0335w) r1
            S1.V.O(r8)     // Catch: java.lang.Exception -> L16
            goto L30
        L16:
            r8 = move-exception
            goto L60
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L20:
            java.lang.Object r1 = r7.f8492m
            P4.w r1 = (P4.InterfaceC0335w) r1
            S1.V.O(r8)     // Catch: java.lang.Exception -> L16
            goto L43
        L28:
            S1.V.O(r8)
            java.lang.Object r8 = r7.f8492m
            P4.w r8 = (P4.InterfaceC0335w) r8
            r1 = r8
        L30:
            boolean r8 = P4.AbstractC0336x.m(r1)
            if (r8 == 0) goto L64
            com.nanjoran.ilightshow.Services.P0 r8 = com.nanjoran.ilightshow.Services.P0.f8357e     // Catch: java.lang.Exception -> L16
            r7.f8492m = r1     // Catch: java.lang.Exception -> L16
            r7.f8491l = r4     // Catch: java.lang.Exception -> L16
            java.lang.Object r8 = r8.d(r7)     // Catch: java.lang.Exception -> L16
            if (r8 != r0) goto L43
            goto L5f
        L43:
            com.nanjoran.ilightshow.Services.AppConfigWrapper r8 = (com.nanjoran.ilightshow.Services.AppConfigWrapper) r8     // Catch: java.lang.Exception -> L16
            if (r8 == 0) goto L53
            N.h0 r5 = com.nanjoran.ilightshow.Services.AbstractC0697x.f8494a     // Catch: java.lang.Exception -> L16
            r5.setValue(r8)     // Catch: java.lang.Exception -> L16
            P4.j0 r8 = com.nanjoran.ilightshow.Services.AbstractC0697x.f8495b     // Catch: java.lang.Exception -> L16
            r5 = 0
            r8.c(r5)     // Catch: java.lang.Exception -> L16
            goto L64
        L53:
            r7.f8492m = r1     // Catch: java.lang.Exception -> L16
            r7.f8491l = r3     // Catch: java.lang.Exception -> L16
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r8 = P4.AbstractC0336x.e(r5, r7)     // Catch: java.lang.Exception -> L16
            if (r8 != r0) goto L30
        L5f:
            return r0
        L60:
            r8.printStackTrace()
            goto L30
        L64:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nanjoran.ilightshow.Services.C0696w.o(java.lang.Object):java.lang.Object");
    }
}

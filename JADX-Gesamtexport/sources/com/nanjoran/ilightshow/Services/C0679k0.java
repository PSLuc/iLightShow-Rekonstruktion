package com.nanjoran.ilightshow.Services;

import P4.InterfaceC0335w;

/* JADX INFO: renamed from: com.nanjoran.ilightshow.Services.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0679k0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8418l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f8419m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0688o0 f8420n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0679k0(C0688o0 c0688o0, p111u4.d dVar) {
        super(2, dVar);
        this.f8420n = c0688o0;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        C0679k0 c0679k0 = new C0679k0(this.f8420n, dVar);
        c0679k0.f8419m = obj;
        return c0679k0;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0679k0) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0034 A[Catch: Exception -> 0x0014, TRY_ENTER, TryCatch #0 {Exception -> 0x0014, blocks: (B:7:0x0010, B:19:0x0034, B:22:0x0041, B:14:0x0022), top: B:28:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:22:0x0041 A[Catch: Exception -> 0x0014, PHI: r1
  0x0041: PHI (r1v2 java.lang.Object) = (r1v12 java.lang.Object), (r1v13 java.lang.Object) binds: [B:20:0x003e, B:14:0x0022] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x0014, blocks: (B:7:0x0010, B:19:0x0034, B:22:0x0041, B:14:0x0022), top: B:28:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3, types: [P4.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x004b -> B:17:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x004e -> B:17:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:19:0x0034
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p122w4.a
    public final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            v4.a r0 = v4.a.f13292h
            int r1 = r6.f8418l
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r1 = r6.f8419m
            P4.w r1 = (P4.InterfaceC0335w) r1
            S1.V.O(r7)     // Catch: java.lang.Exception -> L14
            goto L2e
        L14:
            r7 = move-exception
            goto L4e
        L16:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L1e:
            java.lang.Object r1 = r6.f8419m
            P4.w r1 = (P4.InterfaceC0335w) r1
            S1.V.O(r7)     // Catch: java.lang.Exception -> L14
            goto L41
        L26:
            S1.V.O(r7)
            java.lang.Object r7 = r6.f8419m
            P4.w r7 = (P4.InterfaceC0335w) r7
            r1 = r7
        L2e:
            boolean r7 = P4.AbstractC0336x.m(r1)
            if (r7 == 0) goto L52
            r6.f8419m = r1     // Catch: java.lang.Exception -> L14
            r6.f8418l = r3     // Catch: java.lang.Exception -> L14
            r4 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r7 = P4.AbstractC0336x.e(r4, r6)     // Catch: java.lang.Exception -> L14
            if (r7 != r0) goto L41
            goto L4d
        L41:
            com.nanjoran.ilightshow.Services.o0 r7 = r6.f8420n     // Catch: java.lang.Exception -> L14
            r6.f8419m = r1     // Catch: java.lang.Exception -> L14
            r6.f8418l = r2     // Catch: java.lang.Exception -> L14
            java.lang.Object r7 = r7.e(r3, r6)     // Catch: java.lang.Exception -> L14
            if (r7 != r0) goto L2e
        L4d:
            return r0
        L4e:
            r7.printStackTrace()
            goto L2e
        L52:
            p4.x r6 = p084p4.x.f10867a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nanjoran.ilightshow.Services.C0679k0.o(java.lang.Object):java.lang.Object");
    }
}

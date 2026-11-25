package com.nanjoran.ilightshow.Services;

import P4.InterfaceC0335w;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class r extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8466l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f8467m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0693t f8468n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f8469o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C0693t c0693t, Context context, p111u4.d dVar) {
        super(2, dVar);
        this.f8468n = c0693t;
        this.f8469o = context;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        r rVar = new r(this.f8468n, this.f8469o, dVar);
        rVar.f8467m = obj;
        return rVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((r) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002c A[Catch: Exception -> 0x0013, TRY_ENTER, TryCatch #0 {Exception -> 0x0013, blocks: (B:6:0x000f, B:18:0x0039, B:20:0x0042, B:22:0x004a, B:24:0x0050, B:26:0x0056, B:28:0x005c, B:30:0x0068, B:15:0x002c, B:33:0x0070, B:35:0x0076, B:37:0x007e, B:39:0x0084, B:41:0x008a, B:43:0x0090, B:45:0x009c, B:47:0x00a4, B:48:0x00a7), top: B:53:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0038 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0042 A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:6:0x000f, B:18:0x0039, B:20:0x0042, B:22:0x004a, B:24:0x0050, B:26:0x0056, B:28:0x005c, B:30:0x0068, B:15:0x002c, B:33:0x0070, B:35:0x0076, B:37:0x007e, B:39:0x0084, B:41:0x008a, B:43:0x0090, B:45:0x009c, B:47:0x00a4, B:48:0x00a7), top: B:53:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:22:0x004a A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:6:0x000f, B:18:0x0039, B:20:0x0042, B:22:0x004a, B:24:0x0050, B:26:0x0056, B:28:0x005c, B:30:0x0068, B:15:0x002c, B:33:0x0070, B:35:0x0076, B:37:0x007e, B:39:0x0084, B:41:0x008a, B:43:0x0090, B:45:0x009c, B:47:0x00a4, B:48:0x00a7), top: B:53:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0076 A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:6:0x000f, B:18:0x0039, B:20:0x0042, B:22:0x004a, B:24:0x0050, B:26:0x0056, B:28:0x005c, B:30:0x0068, B:15:0x002c, B:33:0x0070, B:35:0x0076, B:37:0x007e, B:39:0x0084, B:41:0x008a, B:43:0x0090, B:45:0x009c, B:47:0x00a4, B:48:0x00a7), top: B:53:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:37:0x007e A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:6:0x000f, B:18:0x0039, B:20:0x0042, B:22:0x004a, B:24:0x0050, B:26:0x0056, B:28:0x005c, B:30:0x0068, B:15:0x002c, B:33:0x0070, B:35:0x0076, B:37:0x007e, B:39:0x0084, B:41:0x008a, B:43:0x0090, B:45:0x009c, B:47:0x00a4, B:48:0x00a7), top: B:53:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:45:0x009c A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:6:0x000f, B:18:0x0039, B:20:0x0042, B:22:0x004a, B:24:0x0050, B:26:0x0056, B:28:0x005c, B:30:0x0068, B:15:0x002c, B:33:0x0070, B:35:0x0076, B:37:0x007e, B:39:0x0084, B:41:0x008a, B:43:0x0090, B:45:0x009c, B:47:0x00a4, B:48:0x00a7), top: B:53:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4 A[Catch: Exception -> 0x0013, TryCatch #0 {Exception -> 0x0013, blocks: (B:6:0x000f, B:18:0x0039, B:20:0x0042, B:22:0x004a, B:24:0x0050, B:26:0x0056, B:28:0x005c, B:30:0x0068, B:15:0x002c, B:33:0x0070, B:35:0x0076, B:37:0x007e, B:39:0x0084, B:41:0x008a, B:43:0x0090, B:45:0x009c, B:47:0x00a4, B:48:0x00a7), top: B:53:0x000f }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0036 -> B:18:0x0039). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:37:0x007e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p122w4.a
    public final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            com.nanjoran.ilightshow.Services.t r0 = r7.f8468n
            v4.a r1 = v4.a.f13292h
            int r2 = r7.f8466l
            r3 = 1
            if (r2 == 0) goto L1e
            if (r2 != r3) goto L16
            java.lang.Object r2 = r7.f8467m
            P4.w r2 = (P4.InterfaceC0335w) r2
            S1.V.O(r8)     // Catch: java.lang.Exception -> L13
            goto L39
        L13:
            r8 = move-exception
            goto Lab
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L1e:
            S1.V.O(r8)
            java.lang.Object r8 = r7.f8467m
            P4.w r8 = (P4.InterfaceC0335w) r8
            r2 = r8
        L26:
            boolean r8 = P4.AbstractC0336x.m(r2)
            if (r8 == 0) goto Lb0
            r7.f8467m = r2     // Catch: java.lang.Exception -> L13
            r7.f8466l = r3     // Catch: java.lang.Exception -> L13
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r8 = P4.AbstractC0336x.e(r4, r7)     // Catch: java.lang.Exception -> L13
            if (r8 != r1) goto L39
            return r1
        L39:
            java.util.concurrent.atomic.AtomicBoolean r8 = r0.f8483b     // Catch: java.lang.Exception -> L13
            boolean r8 = r8.get()     // Catch: java.lang.Exception -> L13
            r4 = 0
            if (r8 != 0) goto L6e
            com.nanjoran.ilightshow.Services.M r8 = com.nanjoran.ilightshow.Services.M.f8305O     // Catch: java.lang.Exception -> L13
            boolean r5 = r8.i()     // Catch: java.lang.Exception -> L13
            if (r5 == 0) goto L6e
            boolean r5 = r0.b()     // Catch: java.lang.Exception -> L13
            if (r5 == 0) goto L6e
            com.nanjoran.ilightshow.Model.Presets.UMPreset r8 = r8.g()     // Catch: java.lang.Exception -> L13
            if (r8 == 0) goto L5b
            java.lang.String r8 = r8.getEngineMode()     // Catch: java.lang.Exception -> L13
            goto L5c
        L5b:
            r8 = r4
        L5c:
            com.nanjoran.ilightshow.Model.Presets.FXOpt r5 = com.nanjoran.ilightshow.Model.Presets.FXOpt.INSTANCE     // Catch: java.lang.Exception -> L13
            java.lang.String r5 = r5.getEngineAdvanced()     // Catch: java.lang.Exception -> L13
            boolean r8 = E4.k.a(r8, r5)     // Catch: java.lang.Exception -> L13
            if (r8 == 0) goto L6e
            android.content.Context r8 = r7.f8469o     // Catch: java.lang.Exception -> L13
            com.nanjoran.ilightshow.Services.C0693t.a(r0, r8)     // Catch: java.lang.Exception -> L13
            goto L26
        L6e:
            java.util.concurrent.atomic.AtomicBoolean r8 = r0.f8483b
            boolean r5 = r8.get()     // Catch: java.lang.Exception -> L13
            if (r5 == 0) goto L26
            com.nanjoran.ilightshow.Services.M r5 = com.nanjoran.ilightshow.Services.M.f8305O     // Catch: java.lang.Exception -> L13
            boolean r6 = r5.i()     // Catch: java.lang.Exception -> L13
            if (r6 == 0) goto L9c
            boolean r6 = r0.b()     // Catch: java.lang.Exception -> L13
            if (r6 == 0) goto L9c
            com.nanjoran.ilightshow.Model.Presets.UMPreset r5 = r5.g()     // Catch: java.lang.Exception -> L13
            if (r5 == 0) goto L8f
            java.lang.String r5 = r5.getEngineMode()     // Catch: java.lang.Exception -> L13
            goto L90
        L8f:
            r5 = r4
        L90:
            com.nanjoran.ilightshow.Model.Presets.FXOpt r6 = com.nanjoran.ilightshow.Model.Presets.FXOpt.INSTANCE     // Catch: java.lang.Exception -> L13
            java.lang.String r6 = r6.getEngineAdvanced()     // Catch: java.lang.Exception -> L13
            boolean r5 = E4.k.a(r5, r6)     // Catch: java.lang.Exception -> L13
            if (r5 != 0) goto L26
        L9c:
            r5 = 0
            r8.set(r5)     // Catch: java.lang.Exception -> L13
            P4.i0 r8 = r0.f8484c     // Catch: java.lang.Exception -> L13
            if (r8 == 0) goto La7
            r8.c(r4)     // Catch: java.lang.Exception -> L13
        La7:
            r0.f8484c = r4     // Catch: java.lang.Exception -> L13
            goto L26
        Lab:
            r8.printStackTrace()
            goto L26
        Lb0:
            p4.x r7 = p084p4.x.f10867a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nanjoran.ilightshow.Services.r.o(java.lang.Object):java.lang.Object");
    }
}

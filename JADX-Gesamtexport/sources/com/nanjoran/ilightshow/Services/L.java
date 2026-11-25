package com.nanjoran.ilightshow.Services;

import P4.InterfaceC0335w;

/* JADX INFO: loaded from: classes.dex */
public final class L extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8294l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f8295m;

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        L l6 = new L(2, dVar);
        l6.f8295m = obj;
        return l6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((L) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0029 A[Catch: Exception -> 0x0011, TRY_ENTER, TryCatch #0 {Exception -> 0x0011, blocks: (B:6:0x000d, B:18:0x0036, B:15:0x0029, B:20:0x003e, B:22:0x0044), top: B:27:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x003e A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:6:0x000d, B:18:0x0036, B:15:0x0029, B:20:0x003e, B:22:0x0044), top: B:27:0x000d }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0033 -> B:18:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p122w4.a
    public final java.lang.Object o(java.lang.Object r6) {
        /*
            r5 = this;
            v4.a r0 = v4.a.f13292h
            int r1 = r5.f8294l
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r1 = r5.f8295m
            P4.w r1 = (P4.InterfaceC0335w) r1
            S1.V.O(r6)     // Catch: java.lang.Exception -> L11
            goto L36
        L11:
            r6 = move-exception
            goto L48
        L13:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L1b:
            S1.V.O(r6)
            java.lang.Object r6 = r5.f8295m
            P4.w r6 = (P4.InterfaceC0335w) r6
            r1 = r6
        L23:
            boolean r6 = P4.AbstractC0336x.m(r1)
            if (r6 == 0) goto L4c
            r5.f8295m = r1     // Catch: java.lang.Exception -> L11
            r5.f8294l = r2     // Catch: java.lang.Exception -> L11
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r6 = P4.AbstractC0336x.e(r3, r5)     // Catch: java.lang.Exception -> L11
            if (r6 != r0) goto L36
            return r0
        L36:
            H3.f r6 = H3.f.f1787d     // Catch: java.lang.Exception -> L11
            H3.d r6 = r6.a()     // Catch: java.lang.Exception -> L11
            if (r6 == 0) goto L23
            B3.f r6 = r6.a()     // Catch: java.lang.Exception -> L11
            if (r6 == 0) goto L23
            r6.f()     // Catch: java.lang.Exception -> L11
            goto L23
        L48:
            r6.printStackTrace()
            goto L23
        L4c:
            p4.x r5 = p084p4.x.f10867a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nanjoran.ilightshow.Services.L.o(java.lang.Object):java.lang.Object");
    }
}

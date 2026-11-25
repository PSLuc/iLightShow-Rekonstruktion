package D;

import P4.InterfaceC0335w;
import P4.T;

/* JADX INFO: loaded from: classes.dex */
public final class o extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f694l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T f695m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q f696n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(T t6, q qVar, p111u4.d dVar) {
        super(2, dVar);
        this.f695m = t6;
        this.f696n = qVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new o(this.f695m, this.f696n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        ((o) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
        return v4.a.f13292h;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0043 A[Catch: all -> 0x0018, TRY_ENTER, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0014, B:24:0x0043, B:27:0x0053, B:13:0x0022), top: B:32:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053 A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0014, B:24:0x0043, B:27:0x0053, B:13:0x0022), top: B:32:0x000c }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x005e -> B:24:0x0043). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p122w4.a
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            v4.a r0 = v4.a.f13292h
            int r1 = r9.f694l
            r2 = 0
            r3 = 500(0x1f4, double:2.47E-321)
            r5 = 3
            r6 = 2
            r7 = 1
            D.q r8 = r9.f696n
            if (r1 == 0) goto L2a
            if (r1 == r7) goto L26
            if (r1 == r6) goto L22
            if (r1 != r5) goto L1a
            S1.V.O(r10)     // Catch: java.lang.Throwable -> L18
            goto L43
        L18:
            r9 = move-exception
            goto L61
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L22:
            S1.V.O(r10)     // Catch: java.lang.Throwable -> L18
            goto L53
        L26:
            S1.V.O(r10)
            goto L43
        L2a:
            S1.V.O(r10)
            P4.T r10 = r9.f695m
            if (r10 == 0) goto L43
            r9.f694l = r7
            r1 = 0
            r10.c(r1)
            java.lang.Object r10 = r10.M(r9)
            if (r10 != r0) goto L3e
            goto L40
        L3e:
            p4.x r10 = p084p4.x.f10867a
        L40:
            if (r10 != r0) goto L43
            goto L60
        L43:
            N.d0 r10 = r8.f700b     // Catch: java.lang.Throwable -> L18
            r1 = 1065353216(0x3f800000, float:1.0)
            r10.j(r1)     // Catch: java.lang.Throwable -> L18
            r9.f694l = r6     // Catch: java.lang.Throwable -> L18
            java.lang.Object r10 = P4.AbstractC0336x.e(r3, r9)     // Catch: java.lang.Throwable -> L18
            if (r10 != r0) goto L53
            goto L60
        L53:
            N.d0 r10 = r8.f700b     // Catch: java.lang.Throwable -> L18
            r10.j(r2)     // Catch: java.lang.Throwable -> L18
            r9.f694l = r5     // Catch: java.lang.Throwable -> L18
            java.lang.Object r10 = P4.AbstractC0336x.e(r3, r9)     // Catch: java.lang.Throwable -> L18
            if (r10 != r0) goto L43
        L60:
            return r0
        L61:
            N.d0 r10 = r8.f700b
            r10.j(r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: D.o.o(java.lang.Object):java.lang.Object");
    }
}

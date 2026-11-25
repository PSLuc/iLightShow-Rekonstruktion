package p130y0;

import D4.e;
import P4.InterfaceC0335w;
import R4.a;
import R4.b;
import R4.n;
import p084p4.x;
import p111u4.d;
import p122w4.i;

/* JADX INFO: renamed from: y0.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1138j0 extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n f14398l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f14399m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14400n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b f14401o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1138j0(b bVar, d dVar) {
        super(2, dVar);
        this.f14401o = bVar;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new C1138j0(this.f14401o, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C1138j0) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x003c A[Catch: all -> 0x0012, TryCatch #1 {all -> 0x0012, blocks: (B:6:0x000e, B:17:0x0034, B:19:0x003c, B:20:0x004a, B:28:0x0061, B:14:0x0027, B:30:0x0064, B:31:0x0068, B:32:0x0069, B:13:0x0021, B:21:0x004b, B:23:0x0057), top: B:46:0x0006, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0057 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #2 {, blocks: (B:21:0x004b, B:23:0x0057), top: B:48:0x004b, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0064 A[Catch: all -> 0x0012, TryCatch #1 {all -> 0x0012, blocks: (B:6:0x000e, B:17:0x0034, B:19:0x003c, B:20:0x004a, B:28:0x0061, B:14:0x0027, B:30:0x0064, B:31:0x0068, B:32:0x0069, B:13:0x0021, B:21:0x004b, B:23:0x0057), top: B:46:0x0006, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0031 -> B:17:0x0034). Please report as a decompilation issue!!! */
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
            int r1 = r7.f14400n
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 != r3) goto L14
            R4.a r1 = r7.f14399m
            R4.n r4 = r7.f14398l
            S1.V.O(r8)     // Catch: java.lang.Throwable -> L12
            goto L34
        L12:
            r7 = move-exception
            goto L70
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L1c:
            S1.V.O(r8)
            R4.b r4 = r7.f14401o
            R4.a r8 = new R4.a     // Catch: java.lang.Throwable -> L12
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L12
            r1 = r8
        L27:
            r7.f14398l = r4     // Catch: java.lang.Throwable -> L12
            r7.f14399m = r1     // Catch: java.lang.Throwable -> L12
            r7.f14400n = r3     // Catch: java.lang.Throwable -> L12
            java.lang.Object r8 = r1.a(r7)     // Catch: java.lang.Throwable -> L12
            if (r8 != r0) goto L34
            return r0
        L34:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L12
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L12
            if (r8 == 0) goto L6a
            java.lang.Object r8 = r1.c()     // Catch: java.lang.Throwable -> L12
            p4.x r8 = (p084p4.x) r8     // Catch: java.lang.Throwable -> L12
            java.util.concurrent.atomic.AtomicBoolean r8 = p130y0.AbstractC1140k0.f14405b     // Catch: java.lang.Throwable -> L12
            r5 = 0
            r8.set(r5)     // Catch: java.lang.Throwable -> L12
            java.lang.Object r8 = X.o.f5709b     // Catch: java.lang.Throwable -> L12
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L12
            java.util.concurrent.atomic.AtomicReference r6 = X.o.i     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L5f
            X.c r6 = (X.C0386c) r6     // Catch: java.lang.Throwable -> L5f
            p.A r6 = r6.f5674h     // Catch: java.lang.Throwable -> L5f
            if (r6 == 0) goto L61
            boolean r6 = r6.h()     // Catch: java.lang.Throwable -> L5f
            if (r6 != r3) goto L61
            r5 = r3
            goto L61
        L5f:
            r7 = move-exception
            goto L68
        L61:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L12
            if (r5 == 0) goto L27
            X.o.a()     // Catch: java.lang.Throwable -> L12
            goto L27
        L68:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L12
            throw r7     // Catch: java.lang.Throwable -> L12
        L6a:
            r4.c(r2)
            p4.x r7 = p084p4.x.f10867a
            return r7
        L70:
            throw r7     // Catch: java.lang.Throwable -> L71
        L71:
            r8 = move-exception
            boolean r0 = r7 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L79
            r2 = r7
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L79:
            if (r2 != 0) goto L85
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Channel was consumed, consumer had failed"
            r2.<init>(r0)
            r2.initCause(r7)
        L85:
            r4.c(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p130y0.C1138j0.o(java.lang.Object):java.lang.Object");
    }
}

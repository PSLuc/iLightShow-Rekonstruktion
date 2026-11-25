package p092r1;

import D4.e;
import H1.d;
import P4.InterfaceC0335w;
import p084p4.x;
import p122w4.i;

/* JADX INFO: loaded from: classes.dex */
public final class O extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public G f11616l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11617m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d f11618n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(d dVar, p111u4.d dVar2) {
        super(2, dVar2);
        this.f11618n = dVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new O(this.f11618n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((O) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0050 A[PHI: r1 r7
  0x0050: PHI (r1v1 r1.G) = (r1v3 r1.G), (r1v4 r1.G) binds: [B:13:0x004d, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0050: PHI (r7v7 java.lang.Object) = (r7v15 java.lang.Object), (r7v0 java.lang.Object) binds: [B:13:0x004d, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r1.d(r7, r6) == r0) goto L17;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0059 -> B:18:0x005c). Please report as a decompilation issue!!! */
    @Override // p122w4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            v4.a r0 = v4.a.f13292h
            int r1 = r6.f11617m
            r2 = 2
            r3 = 1
            H1.d r4 = r6.f11618n
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            S1.V.O(r7)
            goto L5c
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L1a:
            r1.G r1 = r6.f11616l
            S1.V.O(r7)
            goto L50
        L20:
            S1.V.O(r7)
            java.lang.Object r7 = r4.f1759k
            g0.p r7 = (p035g0.C0715p) r7
            java.lang.Object r7 = r7.i
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.get()
            if (r7 <= 0) goto L6d
        L31:
            java.lang.Object r7 = r4.i
            P4.w r7 = (P4.InterfaceC0335w) r7
            u4.i r7 = r7.d()
            P4.AbstractC0336x.f(r7)
            java.lang.Object r7 = r4.f1757h
            r1 = r7
            r1.G r1 = (p092r1.G) r1
            java.lang.Object r7 = r4.f1758j
            R4.b r7 = (R4.b) r7
            r6.f11616l = r1
            r6.f11617m = r3
            java.lang.Object r7 = r7.l(r6)
            if (r7 != r0) goto L50
            goto L5b
        L50:
            r5 = 0
            r6.f11616l = r5
            r6.f11617m = r2
            java.lang.Object r7 = r1.d(r7, r6)
            if (r7 != r0) goto L5c
        L5b:
            return r0
        L5c:
            java.lang.Object r7 = r4.f1759k
            g0.p r7 = (p035g0.C0715p) r7
            java.lang.Object r7 = r7.i
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L31
            p4.x r6 = p084p4.x.f10867a
            return r6
        L6d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Check failed."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p092r1.O.o(java.lang.Object):java.lang.Object");
    }
}

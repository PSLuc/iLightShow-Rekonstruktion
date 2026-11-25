package p092r1;

import D4.e;
import P4.InterfaceC0335w;
import p084p4.x;
import p111u4.d;
import p122w4.i;

/* JADX INFO: loaded from: classes.dex */
public final class D extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11571l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ J f11572m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(J j4, d dVar) {
        super(2, dVar);
        this.f11572m = j4;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new D(this.f11572m, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((D) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r6 == r0) goto L20;
     */
    @Override // p122w4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.Object r6) {
        /*
            r5 = this;
            v4.a r0 = v4.a.f13292h
            int r1 = r5.f11571l
            r2 = 2
            r3 = 1
            r1.J r4 = r5.f11572m
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            S1.V.O(r6)
            goto L45
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L1a:
            S1.V.O(r6)     // Catch: java.lang.Throwable -> L48
            goto L3b
        L1e:
            S1.V.O(r6)
            g0.p r6 = r4.f11601h
            r1.U r6 = r6.q()
            boolean r6 = r6 instanceof p092r1.K
            if (r6 == 0) goto L32
            g0.p r5 = r4.f11601h
            r1.U r5 = r5.q()
            return r5
        L32:
            r5.f11571l = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r6 = r4.h(r5)     // Catch: java.lang.Throwable -> L48
            if (r6 != r0) goto L3b
            goto L44
        L3b:
            r5.f11571l = r2
            r6 = 0
            java.lang.Object r6 = p092r1.J.e(r4, r6, r5)
            if (r6 != r0) goto L45
        L44:
            return r0
        L45:
            r1.U r6 = (p092r1.U) r6
            return r6
        L48:
            r5 = move-exception
            r1.M r6 = new r1.M
            r0 = -1
            r6.<init>(r5, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p092r1.D.o(java.lang.Object):java.lang.Object");
    }
}

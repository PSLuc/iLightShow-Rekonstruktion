package p092r1;

import D4.e;
import E4.u;
import p084p4.x;
import p103t1.k;
import p111u4.d;
import p122w4.i;

/* JADX INFO: loaded from: classes.dex */
public final class I extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public u f11587l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11588m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f11589n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u f11590o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ J f11591p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f11592q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f11593r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(u uVar, J j4, Object obj, boolean z5, d dVar) {
        super(2, dVar);
        this.f11590o = uVar;
        this.f11591p = j4;
        this.f11592q = obj;
        this.f11593r = z5;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        I i = new I(this.f11590o, this.f11591p, this.f11592q, this.f11593r, dVar);
        i.f11589n = obj;
        return i;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((I) b((k) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if (r6.b(r3, r7) == r0) goto L16;
     */
    @Override // p122w4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            v4.a r0 = v4.a.f13292h
            int r1 = r7.f11588m
            E4.u r2 = r7.f11590o
            java.lang.Object r3 = r7.f11592q
            r1.J r4 = r7.f11591p
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L28
            if (r1 == r6) goto L1e
            if (r1 != r5) goto L16
            S1.V.O(r8)
            goto L65
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L1e:
            E4.u r1 = r7.f11587l
            java.lang.Object r6 = r7.f11589n
            t1.k r6 = (p103t1.k) r6
            S1.V.O(r8)
            goto L4f
        L28:
            S1.V.O(r8)
            java.lang.Object r8 = r7.f11589n
            t1.k r8 = (p103t1.k) r8
            r1.T r1 = r4.g()
            r7.f11589n = r8
            r7.f11587l = r2
            r7.f11588m = r6
            g0.p r1 = r1.f11630b
            java.lang.Object r1 = r1.i
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            int r1 = r1.incrementAndGet()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r1)
            if (r6 != r0) goto L4b
            goto L64
        L4b:
            r1 = r6
            r6 = r8
            r8 = r1
            r1 = r2
        L4f:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r1.f1072h = r8
            r8 = 0
            r7.f11589n = r8
            r7.f11587l = r8
            r7.f11588m = r5
            java.lang.Object r8 = r6.b(r3, r7)
            if (r8 != r0) goto L65
        L64:
            return r0
        L65:
            boolean r7 = r7.f11593r
            if (r7 == 0) goto L7d
            g0.p r7 = r4.f11601h
            r1.b r8 = new r1.b
            if (r3 == 0) goto L74
            int r0 = r3.hashCode()
            goto L75
        L74:
            r0 = 0
        L75:
            int r1 = r2.f1072h
            r8.<init>(r0, r1, r3)
            r7.C(r8)
        L7d:
            p4.x r7 = p084p4.x.f10867a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p092r1.I.o(java.lang.Object):java.lang.Object");
    }
}

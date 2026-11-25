package F;

import B.C0025m0;
import B.D0;

/* JADX INFO: renamed from: F.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0079v extends p122w4.h implements D4.e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1219j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ p111u4.d f1220k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0025m0 f1221l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0068j f1222m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ D0 f1223n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0079v(C0025m0 c0025m0, C0068j c0068j, D0 d1, p111u4.d dVar) {
        super(2, dVar);
        this.f1221l = c0025m0;
        this.f1222m = c0068j;
        this.f1223n = d1;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        C0079v c0079v = new C0079v(this.f1221l, this.f1222m, this.f1223n, dVar);
        c0079v.f1220k = (p111u4.d) obj;
        return c0079v;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0079v) b((p091r0.y) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (p015c2.AbstractC0473d.f(r1, r9.f1221l, r9.f1222m, r10, r9) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        if (p015c2.AbstractC0473d.j(r1, r9.f1223n, r10, r9) == r0) goto L32;
     */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
    @Override // p122w4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            v4.a r0 = v4.a.f13292h
            int r1 = r9.f1219j
            r2 = 1
            r3 = 3
            r4 = 2
            if (r1 == 0) goto L24
            if (r1 == r2) goto L1c
            if (r1 == r4) goto L18
            if (r1 != r3) goto L10
            goto L18
        L10:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L18:
            S1.V.O(r10)
            goto L81
        L1c:
            u4.d r1 = r9.f1220k
            r0.y r1 = (p091r0.y) r1
            S1.V.O(r10)
            goto L37
        L24:
            S1.V.O(r10)
            u4.d r10 = r9.f1220k
            r1 = r10
            r0.y r1 = (p091r0.y) r1
            r9.f1220k = r1
            r9.f1219j = r2
            java.lang.Object r10 = p015c2.AbstractC0473d.e(r1, r9)
            if (r10 != r0) goto L37
            goto L80
        L37:
            r0.i r10 = (p091r0.i) r10
            boolean r2 = p015c2.AbstractC0473d.G(r10)
            r5 = 0
            if (r2 == 0) goto L6e
            int r2 = r10.f11495b
            r2 = r2 & 33
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r10.f11494a
            int r6 = r2.size()
            r7 = 0
        L4d:
            if (r7 >= r6) goto L5f
            java.lang.Object r8 = r2.get(r7)
            r0.q r8 = (p091r0.q) r8
            boolean r8 = r8.b()
            if (r8 == 0) goto L5c
            goto L6e
        L5c:
            int r7 = r7 + 1
            goto L4d
        L5f:
            r9.f1220k = r5
            r9.f1219j = r4
            F.j r2 = r9.f1222m
            B.m0 r3 = r9.f1221l
            java.lang.Object r9 = p015c2.AbstractC0473d.f(r1, r3, r2, r10, r9)
            if (r9 != r0) goto L81
            goto L80
        L6e:
            boolean r2 = p015c2.AbstractC0473d.G(r10)
            if (r2 != 0) goto L81
            r9.f1220k = r5
            r9.f1219j = r3
            B.D0 r2 = r9.f1223n
            java.lang.Object r9 = p015c2.AbstractC0473d.j(r1, r2, r10, r9)
            if (r9 != r0) goto L81
        L80:
            return r0
        L81:
            p4.x r9 = p084p4.x.f10867a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: F.C0079v.o(java.lang.Object):java.lang.Object");
    }
}

package S4;

/* JADX INFO: renamed from: S4.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0379p extends p122w4.i implements D4.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5109l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ InterfaceC0369f f5110m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f5111n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f5112o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0379p(v vVar, p111u4.d dVar) {
        super(3, dVar);
        this.f5112o = vVar;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        C0379p c0379p = new C0379p(this.f5112o, (p111u4.d) obj3);
        c0379p.f5110m = (InterfaceC0369f) obj;
        c0379p.f5111n = obj2;
        return c0379p.o(p084p4.x.f10867a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r1.m(r5, r4) == r0) goto L15;
     */
    @Override // p122w4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.Object r5) {
        /*
            r4 = this;
            v4.a r0 = v4.a.f13292h
            int r1 = r4.f5109l
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            S1.V.O(r5)
            goto L3e
        L10:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L18:
            S4.f r1 = r4.f5110m
            S1.V.O(r5)
            goto L32
        L1e:
            S1.V.O(r5)
            S4.f r1 = r4.f5110m
            java.lang.Object r5 = r4.f5111n
            r4.f5110m = r1
            r4.f5109l = r3
            S4.v r3 = r4.f5112o
            java.lang.Object r5 = r3.d(r5, r4)
            if (r5 != r0) goto L32
            goto L3d
        L32:
            r3 = 0
            r4.f5110m = r3
            r4.f5109l = r2
            java.lang.Object r4 = r1.m(r5, r4)
            if (r4 != r0) goto L3e
        L3d:
            return r0
        L3e:
            p4.x r4 = p084p4.x.f10867a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: S4.C0379p.o(java.lang.Object):java.lang.Object");
    }
}

package S4;

/* JADX INFO: loaded from: classes.dex */
public final class K extends p122w4.i implements D4.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5044l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ InterfaceC0369f f5045m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ int f5046n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ M f5047o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(M m6, p111u4.d dVar) {
        super(3, dVar);
        this.f5047o = m6;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        K k3 = new K(this.f5047o, (p111u4.d) obj3);
        k3.f5045m = (InterfaceC0369f) obj;
        k3.f5046n = iIntValue;
        return k3.o(p084p4.x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006a A[PHI: r1
  0x006a: PHI (r1v3 S4.f) = (r1v2 S4.f), (r1v6 S4.f) binds: [B:25:0x0067, B:13:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r1.m(r9, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r1.m(r9, r8) == r0) goto L32;
     */
    @Override // p122w4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            v4.a r0 = v4.a.f13292h
            int r1 = r8.f5044l
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            S4.M r7 = r8.f5047o
            if (r1 == 0) goto L36
            if (r1 == r6) goto L32
            if (r1 == r5) goto L2c
            if (r1 == r4) goto L26
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            goto L32
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L20:
            S4.f r1 = r8.f5045m
            S1.V.O(r9)
            goto L7d
        L26:
            S4.f r1 = r8.f5045m
            S1.V.O(r9)
            goto L6a
        L2c:
            S4.f r1 = r8.f5045m
            S1.V.O(r9)
            goto L5a
        L32:
            S1.V.O(r9)
            goto L8b
        L36:
            S1.V.O(r9)
            S4.f r1 = r8.f5045m
            int r9 = r8.f5046n
            if (r9 <= 0) goto L4a
            S4.H r9 = S4.H.f5038h
            r8.f5044l = r6
            java.lang.Object r8 = r1.m(r9, r8)
            if (r8 != r0) goto L8b
            goto L8a
        L4a:
            r7.getClass()
            r8.f5045m = r1
            r8.f5044l = r5
            r5 = 0
            java.lang.Object r9 = P4.AbstractC0336x.e(r5, r8)
            if (r9 != r0) goto L5a
            goto L8a
        L5a:
            r7.getClass()
            S4.H r9 = S4.H.i
            r8.f5045m = r1
            r8.f5044l = r4
            java.lang.Object r9 = r1.m(r9, r8)
            if (r9 != r0) goto L6a
            goto L8a
        L6a:
            r7.getClass()
            r8.f5045m = r1
            r8.f5044l = r3
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r9 = P4.AbstractC0336x.e(r3, r8)
            if (r9 != r0) goto L7d
            goto L8a
        L7d:
            S4.H r9 = S4.H.f5039j
            r3 = 0
            r8.f5045m = r3
            r8.f5044l = r2
            java.lang.Object r8 = r1.m(r9, r8)
            if (r8 != r0) goto L8b
        L8a:
            return r0
        L8b:
            p4.x r8 = p084p4.x.f10867a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: S4.K.o(java.lang.Object):java.lang.Object");
    }
}

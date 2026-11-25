package N;

import S4.InterfaceC0368e;

/* JADX INFO: loaded from: classes.dex */
public final class R0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3656l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f3657m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p111u4.i f3658n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0368e f3659o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(p111u4.i iVar, InterfaceC0368e interfaceC0368e, p111u4.d dVar) {
        super(2, dVar);
        this.f3658n = iVar;
        this.f3659o = interfaceC0368e;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        R0 r6 = new R0(this.f3658n, this.f3659o, dVar);
        r6.f3657m = obj;
        return r6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((R0) b((C0229n0) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r5.a(r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (P4.AbstractC0336x.v(r4, r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        return r0;
     */
    @Override // p122w4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            v4.a r0 = v4.a.f13292h
            int r1 = r6.f3656l
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L15:
            S1.V.O(r7)
            goto L4a
        L19:
            S1.V.O(r7)
            java.lang.Object r7 = r6.f3657m
            N.n0 r7 = (N.C0229n0) r7
            u4.j r1 = p111u4.j.f12751h
            u4.i r4 = r6.f3658n
            boolean r1 = E4.k.a(r4, r1)
            S4.e r5 = r6.f3659o
            if (r1 == 0) goto L3b
            N.P0 r1 = new N.P0
            r2 = 0
            r1.<init>(r7, r2)
            r6.f3656l = r3
            java.lang.Object r6 = r5.a(r1, r6)
            if (r6 != r0) goto L4a
            goto L49
        L3b:
            N.Q0 r1 = new N.Q0
            r3 = 0
            r1.<init>(r5, r7, r3)
            r6.f3656l = r2
            java.lang.Object r6 = P4.AbstractC0336x.v(r4, r1, r6)
            if (r6 != r0) goto L4a
        L49:
            return r0
        L4a:
            p4.x r6 = p084p4.x.f10867a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: N.R0.o(java.lang.Object):java.lang.Object");
    }
}

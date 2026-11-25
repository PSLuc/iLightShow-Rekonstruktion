package L;

import P4.InterfaceC0335w;
import p096s.C0907c;

/* JADX INFO: renamed from: L.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0183v extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0907c f2932m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f2933n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f2934o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0186w f2935p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p117w.l f2936q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0183v(C0907c c0907c, float f6, boolean z5, C0186w c0186w, p117w.l lVar, p111u4.d dVar) {
        super(2, dVar);
        this.f2932m = c0907c;
        this.f2933n = f6;
        this.f2934o = z5;
        this.f2935p = c0186w;
        this.f2936q = lVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        C0186w c0186w = this.f2935p;
        return new C0183v(this.f2932m, this.f2933n, this.f2934o, c0186w, this.f2936q, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0183v) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r8.d(r1, r7) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if (L.S.a(r8, r4, r1, r7.f2936q, r7) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
    
        return r0;
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
            int r1 = r7.f2931l
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L15:
            S1.V.O(r8)
            goto L86
        L19:
            S1.V.O(r8)
            s.c r8 = r7.f2932m
            N.h0 r1 = r8.f11955e
            java.lang.Object r1 = r1.getValue()
            S0.e r1 = (S0.e) r1
            float r1 = r1.f4887h
            float r4 = r7.f2933n
            boolean r1 = S0.e.a(r1, r4)
            if (r1 != 0) goto L86
            boolean r1 = r7.f2934o
            if (r1 != 0) goto L42
            S0.e r1 = new S0.e
            r1.<init>(r4)
            r7.f2931l = r3
            java.lang.Object r7 = r8.d(r1, r7)
            if (r7 != r0) goto L86
            goto L85
        L42:
            N.h0 r1 = r8.f11955e
            java.lang.Object r1 = r1.getValue()
            S0.e r1 = (S0.e) r1
            float r1 = r1.f4887h
            L.w r3 = r7.f2935p
            float r5 = r3.f2943b
            boolean r5 = S0.e.a(r1, r5)
            if (r5 == 0) goto L5e
            w.o r1 = new w.o
            r5 = 0
            r1.<init>(r5)
            goto L7b
        L5e:
            float r5 = r3.f2945d
            boolean r5 = S0.e.a(r1, r5)
            if (r5 == 0) goto L6c
            w.i r1 = new w.i
            r1.<init>()
            goto L7b
        L6c:
            float r3 = r3.f2944c
            boolean r1 = S0.e.a(r1, r3)
            if (r1 == 0) goto L7a
            w.e r1 = new w.e
            r1.<init>()
            goto L7b
        L7a:
            r1 = 0
        L7b:
            r7.f2931l = r2
            w.l r2 = r7.f2936q
            java.lang.Object r7 = L.S.a(r8, r4, r1, r2, r7)
            if (r7 != r0) goto L86
        L85:
            return r0
        L86:
            p4.x r7 = p084p4.x.f10867a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: L.C0183v.o(java.lang.Object):java.lang.Object");
    }
}

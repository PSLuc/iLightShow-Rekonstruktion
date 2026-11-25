package B;

/* JADX INFO: renamed from: B.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0050z0 extends p122w4.h implements D4.e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p091r0.q f480j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f481k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ p111u4.d f482l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ D0 f483m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0050z0(D0 d1, p111u4.d dVar) {
        super(2, dVar);
        this.f483m = d1;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        C0050z0 c0050z0 = new C0050z0(this.f483m, dVar);
        c0050z0.f482l = (p111u4.d) obj;
        return c0050z0;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0050z0) b((p091r0.y) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r13 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r13 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0050 -> B:17:0x0053). Please report as a decompilation issue!!! */
    @Override // p122w4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.Object r13) {
        /*
            r12 = this;
            v4.a r0 = v4.a.f13292h
            int r1 = r12.f481k
            r2 = 1
            r3 = 2
            B.D0 r4 = r12.f483m
            if (r1 == 0) goto L28
            if (r1 == r2) goto L20
            if (r1 != r3) goto L18
            r0.q r1 = r12.f480j
            u4.d r2 = r12.f482l
            r0.y r2 = (p091r0.y) r2
            S1.V.O(r13)
            goto L53
        L18:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L20:
            u4.d r1 = r12.f482l
            r0.y r1 = (p091r0.y) r1
            S1.V.O(r13)
            goto L3b
        L28:
            S1.V.O(r13)
            u4.d r13 = r12.f482l
            r1 = r13
            r0.y r1 = (p091r0.y) r1
            r12.f482l = r1
            r12.f481k = r2
            java.lang.Object r13 = p112v.Y0.c(r1, r12, r3)
            if (r13 != r0) goto L3b
            goto L52
        L3b:
            r0.q r13 = (p091r0.q) r13
            long r5 = r13.f11510c
            r4.c()
            r2 = r1
            r1 = r13
        L44:
            r12.f482l = r2
            r12.f480j = r1
            r12.f481k = r3
            r0.j r13 = p091r0.j.i
            java.lang.Object r13 = r2.b(r13, r12)
            if (r13 != r0) goto L53
        L52:
            return r0
        L53:
            r0.i r13 = (p091r0.i) r13
            java.lang.Object r13 = r13.f11494a
            int r5 = r13.size()
            r6 = 0
        L5c:
            if (r6 >= r5) goto L76
            java.lang.Object r7 = r13.get(r6)
            r0.q r7 = (p091r0.q) r7
            long r8 = r7.f11508a
            long r10 = r1.f11508a
            boolean r8 = p091r0.p.a(r8, r10)
            if (r8 == 0) goto L73
            boolean r7 = r7.f11511d
            if (r7 == 0) goto L73
            goto L44
        L73:
            int r6 = r6 + 1
            goto L5c
        L76:
            r4.a()
            p4.x r12 = p084p4.x.f10867a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: B.C0050z0.o(java.lang.Object):java.lang.Object");
    }
}

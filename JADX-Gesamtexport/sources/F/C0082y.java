package F;

/* JADX INFO: renamed from: F.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0082y extends p122w4.h implements D4.e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1233j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ p111u4.d f1234k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ D4.c f1235l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0082y(D4.c cVar, p111u4.d dVar) {
        super(2, dVar);
        this.f1235l = cVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        C0082y c0082y = new C0082y(this.f1235l, dVar);
        c0082y.f1234k = (p111u4.d) obj;
        return c0082y;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        ((C0082y) b((p091r0.y) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
        return v4.a.f13292h;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:12:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x002d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p122w4.a
    public final java.lang.Object o(java.lang.Object r5) {
        /*
            r4 = this;
            v4.a r0 = v4.a.f13292h
            int r1 = r4.f1233j
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            u4.d r1 = r4.f1234k
            r0.y r1 = (p091r0.y) r1
            S1.V.O(r5)
            goto L2e
        L11:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L19:
            S1.V.O(r5)
            u4.d r5 = r4.f1234k
            r0.y r5 = (p091r0.y) r5
            r1 = r5
        L21:
            r0.j r5 = p091r0.j.f11497h
            r4.f1234k = r1
            r4.f1233j = r2
            java.lang.Object r5 = r1.b(r5, r4)
            if (r5 != r0) goto L2e
            return r0
        L2e:
            r0.i r5 = (p091r0.i) r5
            boolean r5 = p015c2.AbstractC0473d.G(r5)
            r5 = r5 ^ r2
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            D4.c r3 = r4.f1235l
            r3.invoke(r5)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: F.C0082y.o(java.lang.Object):java.lang.Object");
    }
}

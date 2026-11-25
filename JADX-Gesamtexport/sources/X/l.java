package X;

/* JADX INFO: loaded from: classes.dex */
public final class l extends p122w4.h implements D4.e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f5696j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5697k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5698l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5699m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ p111u4.d f5700n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f5701o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, p111u4.d dVar) {
        super(2, dVar);
        this.f5701o = mVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        l lVar = new l(this.f5701o, dVar);
        lVar.f5700n = (p111u4.d) obj;
        return lVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((l) b((L4.k) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0086  */
    /* JADX WARN: Code duplicated, block: B:27:0x009c  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0084 -> B:26:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00aa -> B:36:0x00c1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:27:0x009c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p122w4.a
    public final java.lang.Object o(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = 64
            v4.a r2 = v4.a.f13292h
            int r3 = r0.f5699m
            X.m r4 = r0.f5701o
            r5 = 0
            r8 = 3
            r9 = 2
            long r13 = r4.f5703h
            int r15 = r4.f5704j
            r16 = 1
            long r6 = r4.i
            r10 = 1
            if (r3 == 0) goto L50
            if (r3 == r10) goto L3f
            if (r3 == r9) goto L33
            if (r3 != r8) goto L2b
            int r3 = r0.f5697k
            u4.d r4 = r0.f5700n
            L4.k r4 = (L4.k) r4
            S1.V.O(r21)
            r18 = 0
            goto Lc1
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L33:
            int r3 = r0.f5697k
            u4.d r4 = r0.f5700n
            L4.k r4 = (L4.k) r4
            S1.V.O(r21)
            r18 = 0
            goto L9a
        L3f:
            int r3 = r0.f5698l
            int r4 = r0.f5697k
            r18 = 0
            int[] r11 = r0.f5696j
            u4.d r12 = r0.f5700n
            L4.k r12 = (L4.k) r12
            S1.V.O(r21)
            int r4 = r4 + r10
            goto L60
        L50:
            r18 = 0
            S1.V.O(r21)
            u4.d r3 = r0.f5700n
            r12 = r3
            L4.k r12 = (L4.k) r12
            int[] r11 = r4.f5705k
            if (r11 == 0) goto L77
            int r3 = r11.length
            r4 = 0
        L60:
            if (r4 >= r3) goto L77
            r1 = r11[r4]
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r1)
            r0.f5700n = r12
            r0.f5696j = r11
            r0.f5697k = r4
            r0.f5698l = r3
            r0.f5699m = r10
            r12.b(r5, r0)
            return r2
        L77:
            int r3 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r3 == 0) goto L9d
            r4 = r12
            r3 = 0
        L7d:
            if (r3 >= r1) goto L9c
            long r11 = r16 << r3
            long r11 = r11 & r6
            int r11 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r11 == 0) goto L9a
            int r15 = r15 + r3
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r15)
            r0.f5700n = r4
            r0.f5696j = r5
            r0.f5697k = r3
            r0.f5699m = r9
            r4.b(r1, r0)
            v4.a r0 = v4.a.f13292h
            return r2
        L9a:
            int r3 = r3 + r10
            goto L7d
        L9c:
            r12 = r4
        L9d:
            int r3 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r3 == 0) goto Lc3
            r4 = r12
            r3 = 0
        La3:
            if (r3 >= r1) goto Lc3
            long r6 = r16 << r3
            long r6 = r6 & r13
            int r6 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r6 == 0) goto Lc1
            int r1 = r1 + r3
            int r1 = r1 + r15
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r1)
            r0.f5700n = r4
            r0.f5696j = r5
            r0.f5697k = r3
            r0.f5699m = r8
            r4.b(r6, r0)
            v4.a r0 = v4.a.f13292h
            return r2
        Lc1:
            int r3 = r3 + r10
            goto La3
        Lc3:
            p4.x r0 = p084p4.x.f10867a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.l.o(java.lang.Object):java.lang.Object");
    }
}

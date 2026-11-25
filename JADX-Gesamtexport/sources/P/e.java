package P;

import L4.k;
import p084p4.x;
import p122w4.h;

/* JADX INFO: loaded from: classes.dex */
public final class e extends h implements D4.e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object[] f4584j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f4585k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4586l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4587m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4588n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4589o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f4590p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4591q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ p111u4.d f4592r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f4593s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, p111u4.d dVar) {
        super(2, dVar);
        this.f4593s = fVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        e eVar = new e(this.f4593s, dVar);
        eVar.f4592r = (p111u4.d) obj;
        return eVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((e) b((k) obj, (p111u4.d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x008f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0095  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006b -> B:19:0x008a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p122w4.a
    public final java.lang.Object o(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = 1
            v4.a r2 = v4.a.f13292h
            int r3 = r0.f4591q
            r4 = 0
            r5 = 8
            if (r3 == 0) goto L2c
            if (r3 != r1) goto L24
            int r3 = r0.f4589o
            int r6 = r0.f4588n
            long r7 = r0.f4590p
            int r9 = r0.f4587m
            int r10 = r0.f4586l
            long[] r11 = r0.f4585k
            java.lang.Object[] r12 = r0.f4584j
            u4.d r13 = r0.f4592r
            L4.k r13 = (L4.k) r13
            S1.V.O(r21)
            goto L8a
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            S1.V.O(r21)
            u4.d r3 = r0.f4592r
            L4.k r3 = (L4.k) r3
            P.f r6 = r0.f4593s
            p.A r6 = r6.f4594h
            java.lang.Object[] r7 = r6.f10709b
            long[] r6 = r6.f10708a
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L97
            r9 = r4
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L93
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r3
            r3 = r4
            r18 = r10
            r11 = r6
            r10 = r8
            r6 = r12
            r12 = r7
            r7 = r18
        L62:
            if (r3 >= r6) goto L8d
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L8a
            int r4 = r9 << 3
            int r4 = r4 + r3
            r4 = r12[r4]
            r0.f4592r = r13
            r0.f4584j = r12
            r0.f4585k = r11
            r0.f4586l = r10
            r0.f4587m = r9
            r0.f4590p = r7
            r0.f4588n = r6
            r0.f4589o = r3
            r0.f4591q = r1
            r13.b(r4, r0)
            v4.a r0 = v4.a.f13292h
            return r2
        L8a:
            long r7 = r7 >> r5
            int r3 = r3 + r1
            goto L62
        L8d:
            if (r6 != r5) goto L97
            r8 = r10
            r6 = r11
            r7 = r12
            r3 = r13
        L93:
            if (r9 == r8) goto L97
            int r9 = r9 + r1
            goto L41
        L97:
            p4.x r0 = p084p4.x.f10867a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P.e.o(java.lang.Object):java.lang.Object");
    }
}

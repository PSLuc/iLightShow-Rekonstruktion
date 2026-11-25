package p080p;

import D4.e;
import L4.k;
import p084p4.x;
import p111u4.d;
import p122w4.h;

/* JADX INFO: loaded from: classes.dex */
public final class y extends h implements e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public L4.h f10802j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public A f10803k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long[] f10804l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10805m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10806n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10807o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10808p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f10809q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10810r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ d f10811s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ A f10812t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ L4.h f10813u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(A a6, L4.h hVar, d dVar) {
        super(2, dVar);
        this.f10812t = a6;
        this.f10813u = hVar;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        y yVar = new y(this.f10812t, this.f10813u, dVar);
        yVar.f10811s = (d) obj;
        return yVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((y) b((k) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0098  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:22:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:14:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006e -> B:19:0x0093). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p122w4.a
    public final java.lang.Object o(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = 1
            v4.a r2 = v4.a.f13292h
            int r3 = r0.f10810r
            r4 = 0
            r5 = 8
            if (r3 == 0) goto L2f
            if (r3 != r1) goto L27
            int r3 = r0.f10808p
            int r6 = r0.f10807o
            long r7 = r0.f10809q
            int r9 = r0.f10806n
            int r10 = r0.f10805m
            long[] r11 = r0.f10804l
            p.A r12 = r0.f10803k
            L4.h r13 = r0.f10802j
            u4.d r14 = r0.f10811s
            L4.k r14 = (L4.k) r14
            S1.V.O(r22)
            goto L93
        L27:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2f:
            S1.V.O(r22)
            u4.d r3 = r0.f10811s
            L4.k r3 = (L4.k) r3
            p.A r6 = r0.f10812t
            long[] r7 = r6.f10708a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La2
            L4.h r9 = r0.f10813u
            r10 = r4
        L42:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L9e
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r3
            r3 = r4
            r19 = r11
            r12 = r6
            r11 = r7
            r6 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            r7 = r19
        L65:
            if (r3 >= r6) goto L96
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L93
            int r4 = r9 << 3
            int r4 = r4 + r3
            r13.f3110j = r4
            java.lang.Object[] r5 = r12.f10709b
            r4 = r5[r4]
            r0.f10811s = r14
            r0.f10802j = r13
            r0.f10803k = r12
            r0.f10804l = r11
            r0.f10805m = r10
            r0.f10806n = r9
            r0.f10809q = r7
            r0.f10807o = r6
            r0.f10808p = r3
            r0.f10810r = r1
            r14.b(r4, r0)
            v4.a r0 = v4.a.f13292h
            return r2
        L93:
            long r7 = r7 >> r5
            int r3 = r3 + r1
            goto L65
        L96:
            if (r6 != r5) goto La2
            r8 = r10
            r7 = r11
            r6 = r12
            r3 = r14
            r10 = r9
            r9 = r13
        L9e:
            if (r10 == r8) goto La2
            int r10 = r10 + r1
            goto L42
        La2:
            p4.x r0 = p084p4.x.f10867a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p080p.y.o(java.lang.Object):java.lang.Object");
    }
}

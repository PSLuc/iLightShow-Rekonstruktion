package p096s;

import D4.e;
import E4.t;
import N.InterfaceC0203a0;
import P4.InterfaceC0335w;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class G extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public t f11843l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11844m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f11845n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f11846o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ H f11847p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(InterfaceC0203a0 interfaceC0203a0, H h6, d dVar) {
        super(2, dVar);
        this.f11846o = interfaceC0203a0;
        this.f11847p = h6;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        G g6 = new G(this.f11846o, this.f11847p, dVar);
        g6.f11845n = obj;
        return g6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        ((G) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
        return a.f13292h;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003e A[PHI: r8 r9
  0x003e: PHI (r8v2 E4.t) = (r8v0 E4.t), (r8v1 E4.t), (r8v1 E4.t), (r8v4 E4.t) binds: [B:10:0x002c, B:17:0x006e, B:19:0x0090, B:6:0x000c] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r9v2 P4.w) = (r9v0 P4.w), (r9v1 P4.w), (r9v1 P4.w), (r9v4 P4.w) binds: [B:10:0x002c, B:17:0x006e, B:19:0x0090, B:6:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0069 A[PHI: r8 r9
  0x0069: PHI (r8v1 E4.t) = (r8v2 E4.t), (r8v3 E4.t) binds: [B:14:0x0066, B:9:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r9v1 P4.w) = (r9v2 P4.w), (r9v3 P4.w) binds: [B:14:0x0066, B:9:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    /* JADX WARN: Code duplicated, block: B:21:0x0093  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006e -> B:11:0x003e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0090 -> B:11:0x003e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p122w4.a
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            v4.a r0 = v4.a.f13292h
            int r1 = r11.f11844m
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L2c
            if (r1 == r2) goto L20
            if (r1 != r3) goto L18
            E4.t r1 = r11.f11843l
            java.lang.Object r4 = r11.f11845n
            P4.w r4 = (P4.InterfaceC0335w) r4
            S1.V.O(r12)
            r8 = r1
            r9 = r4
            goto L3e
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L20:
            E4.t r1 = r11.f11843l
            java.lang.Object r4 = r11.f11845n
            P4.w r4 = (P4.InterfaceC0335w) r4
            S1.V.O(r12)
            r8 = r1
            r9 = r4
            goto L69
        L2c:
            S1.V.O(r12)
            java.lang.Object r12 = r11.f11845n
            P4.w r12 = (P4.InterfaceC0335w) r12
            E4.t r1 = new E4.t
            r1.<init>()
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.f1071h = r4
            r9 = r12
            r8 = r1
        L3e:
            B.D r5 = new B.D
            N.a0 r6 = r11.f11846o
            s.H r7 = r11.f11847p
            r10 = 4
            r5.<init>(r6, r7, r8, r9, r10)
            r11.f11845n = r9
            r11.f11843l = r8
            r11.f11844m = r2
            u4.i r12 = r11.e()
            y0.m0 r1 = p130y0.C1144m0.f14429h
            u4.g r12 = r12.J(r1)
            if (r12 != 0) goto L93
            u4.i r12 = r11.e()
            N.V r12 = N.C0208d.F(r12)
            java.lang.Object r12 = r12.C(r5, r11)
            if (r12 != r0) goto L69
            goto L92
        L69:
            float r12 = r8.f1071h
            r1 = 0
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 != 0) goto L3e
            l0.I r12 = new l0.I
            r1 = 4
            r12.<init>(r1, r9)
            N.T0 r1 = new N.T0
            r4 = 0
            r1.<init>(r12, r4)
            S4.A r12 = new S4.A
            r12.<init>(r1)
            s.F r1 = new s.F
            r1.<init>(r3, r4)
            r11.f11845n = r9
            r11.f11843l = r8
            r11.f11844m = r3
            java.lang.Object r12 = S4.F.h(r12, r1, r11)
            if (r12 != r0) goto L3e
        L92:
            return r0
        L93:
            java.lang.ClassCastException r11 = new java.lang.ClassCastException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p096s.G.o(java.lang.Object):java.lang.Object");
    }
}

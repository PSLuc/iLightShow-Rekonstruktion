package p086q0;

import B.C0031p0;
import O1.B;
import P4.InterfaceC0335w;
import S0.o;
import S1.V;
import Z.n;
import p030f0.c;
import p058l0.I;
import p112v.C1017z0;
import p124x0.AbstractC1098f;
import p124x0.p0;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class e extends n implements p0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final B f11207u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0031p0 f11208v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f11209w = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public e(B b6, C0031p0 c0031p0) {
        this.f11207u = b6;
        this.f11208v = c0031p0;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002c  */
    public final long A0(long j4, long j6, int i) {
        long jG;
        B b6 = this.f11207u;
        if (b6.f4438a) {
            C1017z0 c1017z0 = (C1017z0) b6.f4439b;
            if (c1017z0.f13104a.c()) {
                jG = 0;
            } else {
                jG = c1017z0.g(c1017z0.c(c1017z0.f13104a.e(c1017z0.c(c1017z0.f(j6)))));
            }
        } else {
            jG = 0;
        }
        boolean z5 = this.f5969t;
        e eVar = null;
        if (z5 && z5) {
            eVar = (e) AbstractC1098f.j(this);
        }
        e eVar2 = eVar;
        return c.h(jG, eVar2 != null ? eVar2.A0(c.h(j4, jG), c.g(j6, jG), i) : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r14 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if (r14 == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object B0(long r12, p111u4.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof p086q0.d
            if (r0 == 0) goto L13
            r0 = r14
            q0.d r0 = (p086q0.d) r0
            int r1 = r0.f11206o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11206o = r1
            goto L1a
        L13:
            q0.d r0 = new q0.d
            w4.c r14 = (p122w4.c) r14
            r0.<init>(r11, r14)
        L1a:
            java.lang.Object r14 = r0.f11204m
            v4.a r1 = v4.a.f13292h
            int r2 = r0.f11206o
            r3 = 0
            r5 = 0
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L41
            if (r2 == r7) goto L39
            if (r2 != r6) goto L31
            long r11 = r0.f11203l
            S1.V.O(r14)
            goto L80
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            long r12 = r0.f11203l
            q0.e r11 = r0.f11202k
            S1.V.O(r14)
            goto L61
        L41:
            S1.V.O(r14)
            boolean r14 = r11.f5969t
            if (r14 == 0) goto L51
            if (r14 == 0) goto L51
            x0.p0 r14 = p124x0.AbstractC1098f.j(r11)
            q0.e r14 = (p086q0.e) r14
            goto L52
        L51:
            r14 = r5
        L52:
            if (r14 == 0) goto L6a
            r0.f11202k = r11
            r0.f11203l = r12
            r0.f11206o = r7
            java.lang.Object r14 = r14.B0(r12, r0)
            if (r14 != r1) goto L61
            goto L7f
        L61:
            S0.o r14 = (S0.o) r14
            long r7 = r14.f4904a
            r9 = r12
            r13 = r11
            r11 = r7
            r7 = r9
            goto L6d
        L6a:
            r7 = r12
            r13 = r11
            r11 = r3
        L6d:
            O1.B r13 = r13.f11207u
            S0.o.d(r7, r11)
            r0.f11202k = r5
            r0.f11203l = r11
            r0.f11206o = r6
            S0.o r14 = new S0.o
            r14.<init>(r3)
            if (r14 != r1) goto L80
        L7f:
            return r1
        L80:
            S0.o r14 = (S0.o) r14
            long r13 = r14.f4904a
            long r11 = S0.o.e(r11, r13)
            S0.o r13 = new S0.o
            r13.<init>(r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p086q0.e.B0(long, u4.d):java.lang.Object");
    }

    public final long C0(int i, long j4) {
        boolean z5 = this.f5969t;
        e eVar = null;
        if (z5 && z5) {
            eVar = (e) AbstractC1098f.j(this);
        }
        long jC0 = eVar != null ? eVar.C0(i, j4) : 0L;
        c.g(j4, jC0);
        return c.h(jC0, 0L);
    }

    @Override // p124x0.p0
    public final Object o() {
        return this.f11209w;
    }

    @Override // Z.n
    public final void r0() {
        C0031p0 c0031p0 = this.f11208v;
        c0031p0.i = this;
        c0031p0.f394j = new I(2, this);
        c0031p0.f395k = n0();
    }

    @Override // Z.n
    public final void s0() {
        C0031p0 c0031p0 = this.f11208v;
        if (((e) c0031p0.i) == this) {
            c0031p0.i = null;
        }
    }

    public final InterfaceC0335w y0() {
        e eVar = this.f5969t ? (e) AbstractC1098f.j(this) : null;
        if (eVar != null) {
            return eVar.y0();
        }
        InterfaceC0335w interfaceC0335w = (InterfaceC0335w) this.f11208v.f395k;
        if (interfaceC0335w != null) {
            return interfaceC0335w;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object z0(long j4, long j6, p122w4.c cVar) {
        c cVar2;
        long j7;
        long j8;
        long j9;
        long j10;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i = cVar2.f11201p;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar2.f11201p = i - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        c cVar3 = cVar2;
        Object objB = cVar3.f11199n;
        a aVar = a.f13292h;
        int i3 = cVar3.f11201p;
        if (i3 == 0) {
            V.O(objB);
            cVar3.f11196k = this;
            cVar3.f11197l = j4;
            cVar3.f11198m = j6;
            cVar3.f11201p = 1;
            objB = this.f11207u.b(j4, j6, cVar3);
            if (objB != aVar) {
                j7 = j6;
            }
            return aVar;
        }
        if (i3 == 1) {
            long j11 = cVar3.f11198m;
            long j12 = cVar3.f11197l;
            e eVar = cVar3.f11196k;
            V.O(objB);
            this = eVar;
            j4 = j12;
            j7 = j11;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = cVar3.f11197l;
            V.O(objB);
        }
        j9 = ((o) objB).f4904a;
        j8 = j10;
        return new o(o.e(j8, j9));
        j8 = ((o) objB).f4904a;
        boolean z5 = this.f5969t;
        e eVar2 = (z5 && z5) ? (e) AbstractC1098f.j(this) : null;
        if (eVar2 != null) {
            long jE = o.e(j4, j8);
            long jD = o.d(j7, j8);
            cVar3.f11196k = null;
            cVar3.f11197l = j8;
            cVar3.f11201p = 2;
            objB = eVar2.z0(jE, jD, cVar3);
            if (objB != aVar) {
                j10 = j8;
                j9 = ((o) objB).f4904a;
                j8 = j10;
            }
            return aVar;
        }
        j9 = 0;
        return new o(o.e(j8, j9));
    }
}

package p112v;

import D4.c;
import D4.e;
import D4.f;
import E4.l;
import P4.InterfaceC0335w;
import p084p4.x;
import p091r0.y;
import p111u4.d;
import p122w4.h;
import p122w4.i;

/* JADX INFO: loaded from: classes.dex */
public final class H0 extends h implements e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12819j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ d f12820k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0335w f12821l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f12822m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l f12823n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0968a0 f12824o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H0(InterfaceC0335w interfaceC0335w, f fVar, c cVar, C0968a0 c0968a0, d dVar) {
        super(2, dVar);
        this.f12821l = interfaceC0335w;
        this.f12822m = (i) fVar;
        this.f12823n = (l) cVar;
        this.f12824o = c0968a0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [D4.f, w4.i] */
    /* JADX WARN: Type inference failed for: r3v0, types: [D4.c, E4.l] */
    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        ?? r6 = this.f12823n;
        C0968a0 c0968a0 = this.f12824o;
        H0 h1 = new H0(this.f12821l, this.f12822m, r6, c0968a0, dVar);
        h1.f12820k = (d) obj;
        return h1;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((H0) b((y) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r10 == r0) goto L18;
     */
    /* JADX WARN: Type inference failed for: r8v0, types: [D4.f, w4.i] */
    /* JADX WARN: Type inference failed for: r9v1, types: [D4.c, E4.l] */
    @Override // p122w4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            v4.a r0 = v4.a.f13292h
            int r1 = r9.f12819j
            v.a0 r2 = r9.f12824o
            P4.w r3 = r9.f12821l
            r4 = 3
            r5 = 0
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L26
            if (r1 == r7) goto L1e
            if (r1 != r6) goto L16
            S1.V.O(r10)
            goto L61
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L1e:
            u4.d r1 = r9.f12820k
            r0.y r1 = (p091r0.y) r1
            S1.V.O(r10)
            goto L41
        L26:
            S1.V.O(r10)
            u4.d r10 = r9.f12820k
            r1 = r10
            r0.y r1 = (p091r0.y) r1
            v.D0 r10 = new v.D0
            r10.<init>(r2, r5)
            P4.AbstractC0336x.o(r3, r5, r10, r4)
            r9.f12820k = r1
            r9.f12819j = r7
            java.lang.Object r10 = p112v.Y0.c(r1, r9, r4)
            if (r10 != r0) goto L41
            goto L60
        L41:
            r0.q r10 = (p091r0.q) r10
            r10.a()
            v.N r7 = p112v.Y0.f12938a
            w4.i r8 = r9.f12822m
            if (r8 == r7) goto L54
            v.E0 r7 = new v.E0
            r7.<init>(r8, r2, r10, r5)
            P4.AbstractC0336x.o(r3, r5, r7, r4)
        L54:
            r9.f12820k = r5
            r9.f12819j = r6
            r0.j r10 = p091r0.j.i
            java.lang.Object r10 = p112v.Y0.e(r1, r10, r9)
            if (r10 != r0) goto L61
        L60:
            return r0
        L61:
            r0.q r10 = (p091r0.q) r10
            if (r10 != 0) goto L6e
            v.F0 r9 = new v.F0
            r9.<init>(r2, r5)
            P4.AbstractC0336x.o(r3, r5, r9, r4)
            goto L85
        L6e:
            r10.a()
            v.G0 r0 = new v.G0
            r0.<init>(r2, r5)
            P4.AbstractC0336x.o(r3, r5, r0, r4)
            E4.l r9 = r9.f12823n
            f0.c r0 = new f0.c
            long r1 = r10.f11510c
            r0.<init>(r1)
            r9.invoke(r0)
        L85:
            p4.x r9 = p084p4.x.f10867a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p112v.H0.o(java.lang.Object):java.lang.Object");
    }
}

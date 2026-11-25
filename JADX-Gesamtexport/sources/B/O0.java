package B;

import N.InterfaceC0203a0;
import P4.InterfaceC0335w;

/* JADX INFO: loaded from: classes.dex */
public final class O0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f196l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f197m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f198n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f199o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p117w.m f200p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(InterfaceC0203a0 interfaceC0203a0, long j4, p117w.m mVar, p111u4.d dVar) {
        super(2, dVar);
        this.f198n = interfaceC0203a0;
        this.f199o = j4;
        this.f200p = mVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new O0(this.f198n, this.f199o, this.f200p, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((O0) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r2.a(r1, r8) == r0) goto L23;
     */
    @Override // p122w4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            v4.a r0 = v4.a.f13292h
            int r1 = r8.f197m
            w.m r2 = r8.f200p
            r3 = 2
            r4 = 1
            N.a0 r5 = r8.f198n
            if (r1 == 0) goto L28
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            java.lang.Object r8 = r8.f196l
            w.o r8 = (p117w.o) r8
            S1.V.O(r9)
            goto L5f
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L20:
            java.lang.Object r1 = r8.f196l
            N.a0 r1 = (N.InterfaceC0203a0) r1
            S1.V.O(r9)
            goto L46
        L28:
            S1.V.O(r9)
            java.lang.Object r9 = r5.getValue()
            w.o r9 = (p117w.o) r9
            if (r9 == 0) goto L4a
            w.n r1 = new w.n
            r1.<init>(r9)
            if (r2 == 0) goto L45
            r8.f196l = r5
            r8.f197m = r4
            java.lang.Object r9 = r2.a(r1, r8)
            if (r9 != r0) goto L45
            goto L5d
        L45:
            r1 = r5
        L46:
            r9 = 0
            r1.setValue(r9)
        L4a:
            w.o r9 = new w.o
            long r6 = r8.f199o
            r9.<init>(r6)
            if (r2 == 0) goto L60
            r8.f196l = r9
            r8.f197m = r3
            java.lang.Object r8 = r2.a(r9, r8)
            if (r8 != r0) goto L5e
        L5d:
            return r0
        L5e:
            r8 = r9
        L5f:
            r9 = r8
        L60:
            r5.setValue(r9)
            p4.x r8 = p084p4.x.f10867a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: B.O0.o(java.lang.Object):java.lang.Object");
    }
}

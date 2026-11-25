package B3;

import P4.InterfaceC0335w;
import p084p4.x;
import p122w4.i;

/* JADX INFO: loaded from: classes.dex */
public final class e extends i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public X4.a f552l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f f553m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f554n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f f555o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, p111u4.d dVar) {
        super(2, dVar);
        this.f555o = fVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new e(this.f555o, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((e) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008a, code lost:
    
        if (r7.f559d != null) goto L66;
     */
    @Override // p122w4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            v4.a r0 = v4.a.f13292h
            int r1 = r6.f554n
            r2 = 1
            r3 = 2
            r4 = 0
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L21
            if (r1 != r3) goto L19
            B3.f r0 = r6.f553m
            X4.a r6 = r6.f552l
            S1.V.O(r7)     // Catch: java.lang.Throwable -> L16
            goto La5
        L16:
            r7 = move-exception
            goto Lbc
        L19:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L21:
            B3.f r1 = r6.f553m
            X4.a r5 = r6.f552l
            S1.V.O(r7)
            r7 = r1
            r1 = r5
            goto L40
        L2b:
            S1.V.O(r7)
            B3.f r7 = r6.f555o
            X4.d r1 = r7.f577w
            r6.f552l = r1
            r6.f553m = r7
            r6.f554n = r2
            java.lang.Object r5 = r1.c(r6)
            if (r5 != r0) goto L40
            goto La2
        L40:
            c r5 = r7.f573s     // Catch: java.lang.Throwable -> L6f
            if (r5 != 0) goto Lb4
            B3.a r5 = r7.f571q     // Catch: java.lang.Throwable -> L6f
            if (r5 != 0) goto Lb4
            com.nanjoran.ilightshow.Services.M r5 = com.nanjoran.ilightshow.Services.M.f8305O     // Catch: java.lang.Throwable -> Lb2
            com.nanjoran.ilightshow.Services.o0 r5 = r5.l()     // Catch: java.lang.Throwable -> Lb2
            int r5 = r5.b()     // Catch: java.lang.Throwable -> Lb2
            if (r5 <= 0) goto L55
            goto L56
        L55:
            r2 = 0
        L56:
            if (r2 == 0) goto Lb4
            java.lang.String r2 = r7.f563h     // Catch: java.lang.Throwable -> L6f
            if (r2 != 0) goto L8d
            java.lang.String r2 = r7.f567m     // Catch: java.lang.Throwable -> L6f
            if (r2 != 0) goto L8d
            java.lang.String r2 = r7.i     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L72
            java.lang.String r2 = r7.f564j     // Catch: java.lang.Throwable -> L6f
            java.lang.String r5 = "com.apple.android.music"
            boolean r2 = E4.k.a(r2, r5)     // Catch: java.lang.Throwable -> L6f
            if (r2 != 0) goto L8d
            goto L72
        L6f:
            r7 = move-exception
        L70:
            r6 = r1
            goto Lbc
        L72:
            java.lang.String r2 = r7.f557b     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto Lb4
            boolean r2 = M4.l.i0(r2)     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L7d
            goto Lb4
        L7d:
            java.lang.String r2 = r7.f558c     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto Lb4
            boolean r2 = M4.l.i0(r2)     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L88
            goto Lb4
        L88:
            java.lang.Double r2 = r7.f559d     // Catch: java.lang.Throwable -> L6f
            if (r2 != 0) goto L8d
            goto Lb4
        L8d:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lb0
            N.h0 r5 = r7.f576v     // Catch: java.lang.Throwable -> Lb0
            r5.setValue(r2)     // Catch: java.lang.Throwable -> Lb0
            com.nanjoran.ilightshow.Services.P0 r2 = com.nanjoran.ilightshow.Services.P0.f8357e     // Catch: java.lang.Throwable -> L6f
            r6.f552l = r1     // Catch: java.lang.Throwable -> L6f
            r6.f553m = r7     // Catch: java.lang.Throwable -> L6f
            r6.f554n = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r6 = r2.c(r7, r6)     // Catch: java.lang.Throwable -> L6f
            if (r6 != r0) goto La3
        La2:
            return r0
        La3:
            r0 = r7
            r6 = r1
        La5:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L16
            N.h0 r0 = r0.f576v     // Catch: java.lang.Throwable -> L16
            r0.setValue(r7)     // Catch: java.lang.Throwable -> L16
            r1 = r6
            goto Lb4
        Lae:
            r7 = r6
            goto L70
        Lb0:
            r6 = move-exception
            goto Lae
        Lb2:
            r6 = move-exception
            goto Lae
        Lb4:
            X4.d r1 = (X4.d) r1
            r1.e(r4)
            p4.x r6 = p084p4.x.f10867a
            return r6
        Lbc:
            X4.d r6 = (X4.d) r6
            r6.e(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.e.o(java.lang.Object):java.lang.Object");
    }
}

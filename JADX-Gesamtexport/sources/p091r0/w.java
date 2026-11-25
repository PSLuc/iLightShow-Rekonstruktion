package p091r0;

import D4.e;
import P4.InterfaceC0335w;
import p084p4.x;
import p111u4.d;
import p122w4.i;

/* JADX INFO: loaded from: classes.dex */
public final class w extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11539l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f11540m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y f11541n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(long j4, y yVar, d dVar) {
        super(2, dVar);
        this.f11540m = j4;
        this.f11541n = yVar;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new w(this.f11540m, this.f11541n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((w) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (P4.AbstractC0336x.e(1, r10) == r0) goto L15;
     */
    @Override // p122w4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            v4.a r0 = v4.a.f13292h
            int r1 = r10.f11539l
            r2 = 1
            long r4 = r10.f11540m
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L20
            if (r1 == r7) goto L1c
            if (r1 != r6) goto L14
            S1.V.O(r11)
            goto L37
        L14:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L1c:
            S1.V.O(r11)
            goto L2e
        L20:
            S1.V.O(r11)
            long r8 = r4 - r2
            r10.f11539l = r7
            java.lang.Object r11 = P4.AbstractC0336x.e(r8, r10)
            if (r11 != r0) goto L2e
            goto L36
        L2e:
            r10.f11539l = r6
            java.lang.Object r11 = P4.AbstractC0336x.e(r2, r10)
            if (r11 != r0) goto L37
        L36:
            return r0
        L37:
            r0.y r10 = r10.f11541n
            P4.f r10 = r10.f11546j
            if (r10 == 0) goto L49
            androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r11 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
            r11.<init>(r4)
            p4.j r11 = S1.V.v(r11)
            r10.g(r11)
        L49:
            p4.x r10 = p084p4.x.f10867a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p091r0.w.o(java.lang.Object):java.lang.Object");
    }
}

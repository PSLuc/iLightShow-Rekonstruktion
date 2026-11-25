package p107u;

import D4.e;
import p084p4.x;
import p090r.v;
import p091r0.y;
import p122w4.h;

/* JADX INFO: loaded from: classes.dex */
public final class d extends h implements e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ p111u4.d f12619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f12620l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(v vVar, p111u4.d dVar) {
        super(2, dVar);
        this.f12620l = vVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        d dVar2 = new d(this.f12620l, dVar);
        dVar2.f12619k = (p111u4.d) obj;
        return dVar2;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((d) b((y) obj, (p111u4.d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (r8 == r0) goto L15;
     */
    @Override // p122w4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            v4.a r0 = v4.a.f13292h
            int r1 = r7.f12618j
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            S1.V.O(r8)
            goto L58
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L18:
            u4.d r1 = r7.f12619k
            r0.y r1 = (p091r0.y) r1
            S1.V.O(r8)
            goto L33
        L20:
            S1.V.O(r8)
            u4.d r8 = r7.f12619k
            r1 = r8
            r0.y r1 = (p091r0.y) r1
            r7.f12619k = r1
            r7.f12618j = r3
            java.lang.Object r8 = com.google.android.gms.internal.play_billing.AbstractC0599v0.f(r1, r7)
            if (r8 != r0) goto L33
            goto L57
        L33:
            r0.q r8 = (p091r0.q) r8
            r8.a()
            r.v r3 = r7.f12620l
            u.j r4 = new u.j
            long r5 = r8.f11510c
            r4.<init>(r5)
            java.lang.Object r8 = r3.i
            u.l r8 = (p107u.l) r8
            N.h0 r8 = r8.f12638a
            r8.setValue(r4)
            r8 = 0
            r7.f12619k = r8
            r7.f12618j = r2
            r0.j r8 = p091r0.j.i
            java.lang.Object r8 = p112v.Y0.e(r1, r8, r7)
            if (r8 != r0) goto L58
        L57:
            return r0
        L58:
            r0.q r8 = (p091r0.q) r8
            if (r8 == 0) goto L5f
            r8.a()
        L5f:
            p4.x r7 = p084p4.x.f10867a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p107u.d.o(java.lang.Object):java.lang.Object");
    }
}

package V0;

import P4.InterfaceC0335w;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5427l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f5428m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y f5429n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(y yVar, p111u4.d dVar) {
        super(2, dVar);
        this.f5429n = yVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        i iVar = new i(this.f5429n, dVar);
        iVar.f5428m = obj;
        return iVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((i) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0047 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x005a  */
    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0045 -> B:16:0x0048). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p122w4.a
    public final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            v4.a r0 = v4.a.f13292h
            int r1 = r8.f5427l
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r8.f5428m
            P4.w r1 = (P4.InterfaceC0335w) r1
            S1.V.O(r9)
            goto L48
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L19:
            S1.V.O(r9)
            java.lang.Object r9 = r8.f5428m
            P4.w r9 = (P4.InterfaceC0335w) r9
            r1 = r9
        L21:
            boolean r9 = P4.AbstractC0336x.m(r1)
            if (r9 == 0) goto L68
            V0.c r9 = V0.c.f5410j
            r8.f5428m = r1
            r8.f5427l = r2
            u4.i r3 = r8.i
            E4.k.c(r3)
            y0.m0 r4 = p130y0.C1144m0.f14429h
            u4.g r4 = r3.J(r4)
            if (r4 != 0) goto L62
            E4.k.c(r3)
            N.V r3 = N.C0208d.F(r3)
            java.lang.Object r9 = r3.C(r9, r8)
            if (r9 != r0) goto L48
            return r0
        L48:
            V0.y r9 = r8.f5429n
            int[] r3 = r9.H
            r4 = 0
            r5 = r3[r4]
            r6 = r3[r2]
            android.view.View r7 = r9.f5474s
            r7.getLocationOnScreen(r3)
            r4 = r3[r4]
            if (r5 != r4) goto L5e
            r3 = r3[r2]
            if (r6 == r3) goto L21
        L5e:
            r9.j()
            goto L21
        L62:
            java.lang.ClassCastException r8 = new java.lang.ClassCastException
            r8.<init>()
            throw r8
        L68:
            p4.x r8 = p084p4.x.f10867a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.i.o(java.lang.Object):java.lang.Object");
    }
}

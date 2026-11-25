package p012c;

import D4.c;
import E4.l;

/* JADX INFO: loaded from: classes.dex */
public final class v extends l implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7182h;
    public final /* synthetic */ D i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(D d6, int i) {
        super(1);
        this.f7182h = i;
        this.i = d6;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v5 java.lang.Object, still in use, count: 2, list:
          (r1v5 java.lang.Object) from 0x005f: PHI (r1 I:??) = (r1v2 java.lang.Object), (r1v5 java.lang.Object) binds: [B:24:0x005e, B:37:0x005f] A[DONT_GENERATE, DONT_INLINE]
          (r1v5 java.lang.Object) from 0x0057: CHECK_CAST (c.u) (r1v5 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // D4.c
    public final java.lang.Object invoke(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f7182h
            switch(r0) {
                case 0: goto L39;
                default: goto L5;
            }
        L5:
            c.b r4 = (p012c.C0464b) r4
            java.lang.String r0 = "backEvent"
            E4.k.f(r0, r4)
            c.D r3 = r3.i
            c.u r0 = r3.f7122c
            if (r0 != 0) goto L31
            q4.j r3 = r3.f7121b
            int r0 = r3.c()
            java.util.ListIterator r3 = r3.listIterator(r0)
        L1c:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r3.previous()
            r1 = r0
            c.u r1 = (p012c.u) r1
            boolean r1 = r1.f7179a
            if (r1 == 0) goto L1c
            goto L2f
        L2e:
            r0 = 0
        L2f:
            c.u r0 = (p012c.u) r0
        L31:
            if (r0 == 0) goto L36
            r0.c(r4)
        L36:
            p4.x r3 = p084p4.x.f10867a
            return r3
        L39:
            c.b r4 = (p012c.C0464b) r4
            java.lang.String r0 = "backEvent"
            E4.k.f(r0, r4)
            c.D r3 = r3.i
            q4.j r0 = r3.f7121b
            int r1 = r0.c()
            java.util.ListIterator r0 = r0.listIterator(r1)
        L4c:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r0.previous()
            r2 = r1
            c.u r2 = (p012c.u) r2
            boolean r2 = r2.f7179a
            if (r2 == 0) goto L4c
            goto L5f
        L5e:
            r1 = 0
        L5f:
            c.u r1 = (p012c.u) r1
            c.u r0 = r3.f7122c
            if (r0 == 0) goto L68
            r3.b()
        L68:
            r3.f7122c = r1
            if (r1 == 0) goto L6f
            r1.d(r4)
        L6f:
            p4.x r3 = p084p4.x.f10867a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p012c.v.invoke(java.lang.Object):java.lang.Object");
    }
}

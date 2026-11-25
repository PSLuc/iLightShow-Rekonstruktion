package p101t;

import D4.e;
import P4.InterfaceC0335w;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12308l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e0 f12309m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, d dVar) {
        super(2, dVar);
        this.f12309m = e0Var;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new d0(this.f12309m, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        ((d0) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
        return a.f13292h;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:16:0x002e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0030 -> B:11:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0049 -> B:21:0x004c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p122w4.a
    public final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            v4.a r0 = v4.a.f13292h
            int r1 = r7.f12308l
            r2 = 2
            r3 = 1
            t.e0 r4 = r7.f12309m
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            S1.V.O(r8)
            goto L4c
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L1a:
            S1.V.O(r8)
            goto L2e
        L1e:
            S1.V.O(r8)
        L21:
            R4.b r8 = r4.f12317E
            if (r8 == 0) goto L2e
            r7.f12308l = r3
            java.lang.Object r8 = r8.l(r7)
            if (r8 != r0) goto L2e
            goto L4b
        L2e:
            g0.p r8 = r4.f12323z
            if (r8 == 0) goto L21
            t.r r8 = p101t.r.f12405k
            r7.f12308l = r2
            u4.i r1 = r7.i
            E4.k.c(r1)
            N.V r1 = N.C0208d.F(r1)
            N.W r5 = new N.W
            r6 = 0
            r5.<init>(r8, r6)
            java.lang.Object r8 = r1.C(r5, r7)
            if (r8 != r0) goto L4c
        L4b:
            return r0
        L4c:
            g0.p r8 = r4.f12323z
            if (r8 == 0) goto L21
            java.lang.Object r8 = r8.i
            android.widget.Magnifier r8 = (android.widget.Magnifier) r8
            r8.update()
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: p101t.d0.o(java.lang.Object):java.lang.Object");
    }
}

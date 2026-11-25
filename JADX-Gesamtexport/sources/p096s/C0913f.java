package p096s;

import D4.e;
import N.InterfaceC0203a0;
import P4.InterfaceC0335w;
import R4.a;
import R4.f;
import p084p4.x;
import p111u4.d;
import p122w4.i;

/* JADX INFO: renamed from: s.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0913f extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f11984l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11985m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f11986n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f f11987o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0907c f11988p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f11989q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f11990r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0913f(f fVar, C0907c c0907c, InterfaceC0203a0 interfaceC0203a0, InterfaceC0203a0 interfaceC0203a1, d dVar) {
        super(2, dVar);
        this.f11987o = fVar;
        this.f11988p = c0907c;
        this.f11989q = interfaceC0203a0;
        this.f11990r = interfaceC0203a1;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        C0913f c0913f = new C0913f(this.f11987o, this.f11988p, this.f11989q, this.f11990r, dVar);
        c0913f.f11986n = obj;
        return c0913f;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0913f) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:12:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:14:0x003e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p122w4.a
    public final java.lang.Object o(java.lang.Object r15) {
        /*
            r14 = this;
            v4.a r0 = v4.a.f13292h
            int r1 = r14.f11985m
            R4.f r2 = r14.f11987o
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 != r3) goto L15
            R4.a r1 = r14.f11984l
            java.lang.Object r4 = r14.f11986n
            P4.w r4 = (P4.InterfaceC0335w) r4
            S1.V.O(r15)
            goto L36
        L15:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L1d:
            S1.V.O(r15)
            java.lang.Object r15 = r14.f11986n
            P4.w r15 = (P4.InterfaceC0335w) r15
            R4.a r1 = r2.iterator()
            r4 = r15
        L29:
            r14.f11986n = r4
            r14.f11984l = r1
            r14.f11985m = r3
            java.lang.Object r15 = r1.a(r14)
            if (r15 != r0) goto L36
            return r0
        L36:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L63
            java.lang.Object r15 = r1.c()
            java.lang.Object r5 = r2.f()
            boolean r6 = r5 instanceof R4.h
            r7 = 0
            if (r6 != 0) goto L4c
            goto L4d
        L4c:
            r5 = r7
        L4d:
            if (r5 != 0) goto L51
            r9 = r15
            goto L52
        L51:
            r9 = r5
        L52:
            s.e r8 = new s.e
            N.a0 r12 = r14.f11990r
            N.a0 r11 = r14.f11989q
            s.c r10 = r14.f11988p
            r13 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r15 = 3
            P4.AbstractC0336x.o(r4, r7, r8, r15)
            goto L29
        L63:
            p4.x r14 = p084p4.x.f10867a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p096s.C0913f.o(java.lang.Object):java.lang.Object");
    }
}

package p112v;

import D4.e;
import p084p4.x;
import p091r0.q;
import p091r0.y;
import p111u4.d;
import p122w4.h;

/* JADX INFO: loaded from: classes.dex */
public final class B0 extends h implements e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f12779j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12780k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ d f12781l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f12782m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(q qVar, d dVar) {
        super(2, dVar);
        this.f12782m = qVar;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        B0 b6 = new B0(this.f12782m, dVar);
        b6.f12781l = (d) obj;
        return b6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((B0) b((y) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0048 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003d -> B:12:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p122w4.a
    public final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            v4.a r0 = v4.a.f13292h
            int r1 = r7.f12780k
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            long r3 = r7.f12779j
            u4.d r1 = r7.f12781l
            r0.y r1 = (p091r0.y) r1
            S1.V.O(r8)
            goto L40
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L1b:
            S1.V.O(r8)
            u4.d r8 = r7.f12781l
            r0.y r8 = (p091r0.y) r8
            r0.q r1 = r7.f12782m
            long r3 = r1.f11509b
            y0.G0 r1 = r8.d()
            r1.getClass()
            r5 = 40
            long r5 = r5 + r3
            r1 = r8
            r3 = r5
        L32:
            r7.f12781l = r1
            r7.f12779j = r3
            r7.f12780k = r2
            r8 = 3
            java.lang.Object r8 = p112v.Y0.c(r1, r7, r8)
            if (r8 != r0) goto L40
            return r0
        L40:
            r0.q r8 = (p091r0.q) r8
            long r5 = r8.f11509b
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L32
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p112v.B0.o(java.lang.Object):java.lang.Object");
    }
}

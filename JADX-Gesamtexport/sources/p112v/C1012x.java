package p112v;

import D4.e;
import E4.w;
import p084p4.x;
import p091r0.i;
import p091r0.y;
import p111u4.d;
import p122w4.h;

/* JADX INFO: renamed from: v.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1012x extends h implements e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i f13087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13089l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ d f13090m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w f13091n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ w f13092o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1012x(w wVar, w wVar2, d dVar) {
        super(2, dVar);
        this.f13091n = wVar;
        this.f13092o = wVar2;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        C1012x c1012x = new C1012x(this.f13091n, this.f13092o, dVar);
        c1012x.f13090m = (d) obj;
        return c1012x;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C1012x) b((y) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[LOOP:2: B:16:0x0057->B:20:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x006a A[EDGE_INSN: B:71:0x006a->B:22:0x006a BREAK  A[LOOP:2: B:16:0x0057->B:20:0x0066], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a4 -> B:35:0x00a7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p122w4.a
    public final java.lang.Object o(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p112v.C1012x.o(java.lang.Object):java.lang.Object");
    }
}

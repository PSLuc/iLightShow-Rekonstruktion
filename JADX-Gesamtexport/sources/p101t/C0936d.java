package p101t;

import D4.e;
import P4.InterfaceC0335w;
import p084p4.x;
import p111u4.d;
import p112v.C0968a0;
import p117w.m;
import p122w4.i;

/* JADX INFO: renamed from: t.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0936d extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f12301l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12302m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f12303n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0968a0 f12304o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f12305p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ m f12306q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC0942j f12307r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0936d(C0968a0 c0968a0, long j4, m mVar, AbstractC0942j abstractC0942j, d dVar) {
        super(2, dVar);
        this.f12304o = c0968a0;
        this.f12305p = j4;
        this.f12306q = mVar;
        this.f12307r = abstractC0942j;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        C0936d c0936d = new C0936d(this.f12304o, this.f12305p, this.f12306q, this.f12307r, dVar);
        c0936d.f12303n = obj;
        return c0936d;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0936d) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00af, code lost:
    
        if (r11.a(r2, r18) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cc, code lost:
    
        if (r11.a(r4, r18) == r1) goto L43;
     */
    @Override // p122w4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p101t.C0936d.o(java.lang.Object):java.lang.Object");
    }
}

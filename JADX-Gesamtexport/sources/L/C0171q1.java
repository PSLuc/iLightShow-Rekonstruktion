package L;

/* JADX INFO: renamed from: L.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0171q1 extends p122w4.i implements D4.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ long f2888l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0188w1 f2889m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0171q1(C0188w1 c0188w1, p111u4.d dVar) {
        super(3, dVar);
        this.f2889m = c0188w1;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        long j4 = ((p030f0.c) obj2).f8837a;
        C0171q1 c0171q1 = new C0171q1(this.f2889m, (p111u4.d) obj3);
        c0171q1.f2888l = j4;
        p084p4.x xVar = p084p4.x.f10867a;
        c0171q1.o(xVar);
        return xVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        S1.V.O(obj);
        long j4 = this.f2888l;
        C0188w1 c0188w1 = this.f2889m;
        c0188w1.f2964m.j((c0188w1.f2960h ? c0188w1.f2959g.h() - p030f0.c.d(j4) : p030f0.c.d(j4)) - c0188w1.f2963l.h());
        return p084p4.x.f10867a;
    }
}

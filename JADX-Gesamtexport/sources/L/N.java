package L;

/* JADX INFO: loaded from: classes.dex */
public final class N extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f2414h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(float f6, long j4) {
        super(1);
        this.f2414h = f6;
        this.i = j4;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        p044i0.d dVar = (p044i0.d) obj;
        float f6 = this.f2414h;
        float f7 = 2;
        dVar.L(this.i, p081p0.c.y(0.0f, dVar.y(f6) / f7), p081p0.c.y(p030f0.f.d(dVar.f()), dVar.y(f6) / f7), dVar.y(f6), (480 & 16) != 0 ? 0 : 1);
        return p084p4.x.f10867a;
    }
}

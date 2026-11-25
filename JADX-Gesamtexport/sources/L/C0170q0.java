package L;

/* JADX INFO: renamed from: L.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0170q0 extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f2881h;
    public final /* synthetic */ p044i0.h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p096s.E f2882j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p096s.E f2883k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p096s.E f2884l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p096s.E f2885m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f2886n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f2887o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0170q0(long j4, p044i0.h hVar, p096s.E e6, p096s.E e7, p096s.E e8, p096s.E e9, float f6, long j6) {
        super(1);
        this.f2881h = j4;
        this.i = hVar;
        this.f2882j = e6;
        this.f2883k = e7;
        this.f2884l = e8;
        this.f2885m = e9;
        this.f2886n = f6;
        this.f2887o = j6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        float f6;
        p044i0.d dVar = (p044i0.d) obj;
        p044i0.h hVar = this.i;
        AbstractC0178t0.b(dVar, 0.0f, 360.0f, this.f2881h, hVar);
        float fFloatValue = (((Number) this.f2882j.f11835k.getValue()).floatValue() * 216.0f) % 360.0f;
        float fFloatValue2 = ((Number) this.f2883k.f11835k.getValue()).floatValue();
        p096s.E e6 = this.f2884l;
        float fAbs = Math.abs(fFloatValue2 - ((Number) e6.f11835k.getValue()).floatValue());
        float fFloatValue3 = ((Number) e6.f11835k.getValue()).floatValue() + ((Number) this.f2885m.f11835k.getValue()).floatValue() + (fFloatValue - 90.0f);
        if (hVar.f9392c == 0) {
            f6 = 0.0f;
        } else {
            f6 = ((this.f2886n / (AbstractC0178t0.f2916b / 2)) * 57.29578f) / 2.0f;
        }
        AbstractC0178t0.b(dVar, fFloatValue3 + f6, Math.max(fAbs, 0.1f), this.f2887o, hVar);
        return p084p4.x.f10867a;
    }
}

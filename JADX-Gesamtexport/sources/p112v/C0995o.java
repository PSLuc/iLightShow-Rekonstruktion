package p112v;

/* JADX INFO: renamed from: v.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0995o implements InterfaceC0970b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0997p f13037a;

    public C0995o(C0997p c0997p) {
        this.f13037a = c0997p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [D4.c, E4.l] */
    @Override // p112v.InterfaceC0970b0
    public final float a(float f6) {
        if (Float.isNaN(f6)) {
            return 0.0f;
        }
        C0997p c0997p = this.f13037a;
        float fFloatValue = ((Number) c0997p.f13041a.invoke(Float.valueOf(f6))).floatValue();
        c0997p.f13045e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        c0997p.f13046f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}

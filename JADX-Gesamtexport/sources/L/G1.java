package L;

/* JADX INFO: loaded from: classes.dex */
public final class G1 extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f2298h;
    public final /* synthetic */ float i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G1(float f6, float f7) {
        super(1);
        this.f2298h = f6;
        this.i = f7;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        return Float.valueOf(((Boolean) obj).booleanValue() ? this.f2298h : this.i);
    }
}

package w5;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class F implements InterfaceC1067z {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C1043a f13474h = new C1043a(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f13475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f13476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1063v f13477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f13479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public short f13480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n0 f13481g;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f13475a);
        byteBuffer.put(this.f13476b);
        this.f13477c.a(byteBuffer);
        byteBuffer.putInt(this.f13478d);
        byteBuffer.putFloat(this.f13479e);
        byteBuffer.putShort(this.f13480f);
        byteBuffer.put(this.f13481g.f13646h);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 21;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 103;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof F) {
            F f6 = (F) obj;
            if (this.f13475a == f6.f13475a && this.f13476b == f6.f13476b && E4.k.a(this.f13477c, f6.f13477c) && this.f13478d == f6.f13478d && this.f13479e == f6.f13479e && this.f13480f == f6.f13480f && this.f13481g == f6.f13481g) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "LightSetWaveform : reserved:" + ((int) this.f13475a) + ", transient:" + ((int) this.f13476b) + ", color:" + this.f13477c + ", period:" + this.f13478d + ", cycles:" + this.f13479e + ", skew_ratio:" + ((int) this.f13480f) + ", waveform:" + this.f13481g + ", ";
    }
}

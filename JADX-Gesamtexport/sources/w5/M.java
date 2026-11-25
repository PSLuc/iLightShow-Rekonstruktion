package w5;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class M implements InterfaceC1067z {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1043a f13511f = new C1043a(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f13512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f13513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1063v f13514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EnumC1045c f13516e;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f13512a);
        byteBuffer.put(this.f13513b);
        this.f13514c.a(byteBuffer);
        byteBuffer.putInt(this.f13515d);
        byteBuffer.put(this.f13516e.f13573h);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 15;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 501;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof M) {
            M m6 = (M) obj;
            if (this.f13512a == m6.f13512a && this.f13513b == m6.f13513b && E4.k.a(this.f13514c, m6.f13514c) && this.f13515d == m6.f13515d && this.f13516e == m6.f13516e) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "SetColorZones : start_index:" + ((int) this.f13512a) + ", end_index:" + ((int) this.f13513b) + ", color:" + this.f13514c + ", duration:" + this.f13515d + ", apply:" + this.f13516e + ", ";
    }
}

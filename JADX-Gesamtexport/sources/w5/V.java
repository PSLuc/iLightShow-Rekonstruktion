package w5;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class V implements InterfaceC1067z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Q f13540e = new Q(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f13541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public short f13542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f13543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f13544d;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f13541a);
        byteBuffer.putShort(this.f13542b);
        byteBuffer.putFloat(this.f13543c);
        byteBuffer.putFloat(this.f13544d);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 11;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 703;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof V) {
            V v6 = (V) obj;
            if (this.f13541a == v6.f13541a && this.f13542b == v6.f13542b && this.f13543c == v6.f13543c && this.f13544d == v6.f13544d) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "SetUserPosition : tile_index:" + ((int) this.f13541a) + ", reserved:" + ((int) this.f13542b) + ", user_x:" + this.f13543c + ", user_y:" + this.f13544d + ", ";
    }
}

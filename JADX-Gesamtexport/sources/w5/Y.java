package w5;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements InterfaceC1067z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Q f13553d = new Q(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f13554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13556c;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.f13554a);
        byteBuffer.putLong(this.f13555b);
        byteBuffer.putInt(this.f13556c);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 20;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 15;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Y) {
            Y y2 = (Y) obj;
            if (this.f13554a == y2.f13554a && this.f13555b == y2.f13555b && this.f13556c == y2.f13556c) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "StateHostFirmware : build:" + this.f13554a + ", reserved:" + this.f13555b + ", version:" + this.f13556c + ", ";
    }
}

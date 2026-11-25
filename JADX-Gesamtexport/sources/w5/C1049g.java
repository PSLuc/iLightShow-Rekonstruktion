package w5;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: w5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1049g implements InterfaceC1067z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1043a f13591c = new C1043a(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f13592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f13593b;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f13592a);
        byteBuffer.put(this.f13593b);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 2;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 502;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1049g) {
            C1049g c1049g = (C1049g) obj;
            if (this.f13592a == c1049g.f13592a && this.f13593b == c1049g.f13593b) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "GetColorZones : start_index:" + ((int) this.f13592a) + ", end_index:" + ((int) this.f13593b) + ", ";
    }
}

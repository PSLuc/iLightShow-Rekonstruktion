package w5;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements InterfaceC1067z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Q f13557e = new Q(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f13558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public short f13561d;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.putFloat(this.f13558a);
        byteBuffer.putInt(this.f13559b);
        byteBuffer.putInt(this.f13560c);
        byteBuffer.putShort(this.f13561d);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 14;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Z) {
            Z z5 = (Z) obj;
            if (this.f13558a == z5.f13558a && this.f13559b == z5.f13559b && this.f13560c == z5.f13560c && this.f13561d == z5.f13561d) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "StateHostInfo : signal:" + this.f13558a + ", tx:" + this.f13559b + ", rx:" + this.f13560c + ", reserved:" + ((int) this.f13561d) + ", ";
    }
}

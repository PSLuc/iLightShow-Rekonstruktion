package w5;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class E implements InterfaceC1067z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1043a f13471c = new C1043a(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short f13472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13473b;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.f13472a);
        byteBuffer.putInt(this.f13473b);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 6;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 117;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof E) {
            E e6 = (E) obj;
            if (this.f13472a == e6.f13472a && this.f13473b == e6.f13473b) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "LightSetPower : level:" + ((int) this.f13472a) + ", duration:" + this.f13473b + ", ";
    }
}

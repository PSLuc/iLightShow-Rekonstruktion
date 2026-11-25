package w5;

import B.AbstractC0013g0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class I implements InterfaceC1067z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1043a f13499b = new C1043a(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short f13500a;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.f13500a);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 2;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 118;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof I) {
            if (this.f13500a == ((I) obj).f13500a) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return AbstractC0013g0.l(new StringBuilder("LightStatePower : level:"), this.f13500a, ", ");
    }
}

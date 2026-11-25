package w5;

import B.AbstractC0013g0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class O implements InterfaceC1067z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1043a f13521b = new C1043a(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short f13522a;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.f13522a);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 2;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 122;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof O) {
            if (this.f13522a == ((O) obj).f13522a) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return AbstractC0013g0.l(new StringBuilder("SetInfrared : brightness:"), this.f13522a, ", ");
    }
}

package w5;

import B.AbstractC0013g0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class T implements InterfaceC1067z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Q f13530b = new Q(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short f13531a;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.f13531a);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 2;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 21;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof T) {
            if (this.f13531a == ((T) obj).f13531a) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return AbstractC0013g0.l(new StringBuilder("SetPower : level:"), this.f13531a, ", ");
    }
}

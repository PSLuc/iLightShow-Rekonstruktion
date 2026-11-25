package w5;

import B.AbstractC0013g0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements InterfaceC1067z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Q f13589b = new Q(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short f13590a;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.f13590a);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 2;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 22;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f0) {
            if (this.f13590a == ((f0) obj).f13590a) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return AbstractC0013g0.l(new StringBuilder("StatePower : level:"), this.f13590a, ", ");
    }
}

package w5;

import B.AbstractC0013g0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements InterfaceC1067z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Q f13606d = new Q(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13609c;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.f13607a);
        byteBuffer.putInt(this.f13608b);
        byteBuffer.putInt(this.f13609c);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 12;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 33;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            if (this.f13607a == i0Var.f13607a && this.f13608b == i0Var.f13608b && this.f13609c == i0Var.f13609c) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StateVersion : vendor:");
        sb.append(this.f13607a);
        sb.append(", product:");
        sb.append(this.f13608b);
        sb.append(", version:");
        return AbstractC0013g0.l(sb, this.f13609c, ", ");
    }
}

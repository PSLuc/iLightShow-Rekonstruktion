package w5;

import B.AbstractC0013g0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class W implements InterfaceC1067z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Q f13545d = new Q(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f13546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m0[] f13547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f13548c;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f13546a);
        m0[] m0VarArr = this.f13547b;
        int length = m0VarArr.length;
        for (m0 m0Var : m0VarArr) {
            m0Var.a(byteBuffer);
        }
        byteBuffer.put(this.f13548c);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 882;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 702;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof W) {
            W w6 = (W) obj;
            if (this.f13546a == w6.f13546a && E4.k.a(this.f13547b, w6.f13547b) && this.f13548c == w6.f13548c) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StateDeviceChain : start_index:");
        sb.append((int) this.f13546a);
        sb.append(", tile_devices:");
        sb.append(this.f13547b);
        sb.append(", total_count:");
        return AbstractC0013g0.l(sb, this.f13548c, ", ");
    }
}

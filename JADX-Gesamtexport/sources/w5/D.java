package w5;

import B.AbstractC0013g0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class D implements InterfaceC1067z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1043a f13467d = new C1043a(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f13468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1063v f13469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13470c;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f13468a);
        this.f13469b.a(byteBuffer);
        byteBuffer.putInt(this.f13470c);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 13;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 102;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof D) {
            D d6 = (D) obj;
            if (this.f13468a == d6.f13468a && E4.k.a(this.f13469b, d6.f13469b) && this.f13470c == d6.f13470c) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LightSetColor : reserved:");
        sb.append((int) this.f13468a);
        sb.append(", color:");
        sb.append(this.f13469b);
        sb.append(", duration:");
        return AbstractC0013g0.l(sb, this.f13470c, ", ");
    }
}

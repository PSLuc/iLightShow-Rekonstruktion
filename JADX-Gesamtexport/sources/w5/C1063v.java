package w5;

import B.AbstractC0013g0;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: w5.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1063v implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f13660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final short f13661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f13662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short f13663d;

    public C1063v(short s6, short s7, short s8, short s9) {
        this.f13660a = s6;
        this.f13661b = s7;
        this.f13662c = s8;
        this.f13663d = s9;
    }

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.f13660a);
        byteBuffer.putShort(this.f13661b);
        byteBuffer.putShort(this.f13662c);
        byteBuffer.putShort(this.f13663d);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1063v) {
            C1063v c1063v = (C1063v) obj;
            if (this.f13660a == c1063v.f13660a && this.f13661b == c1063v.f13661b && this.f13662c == c1063v.f13662c && this.f13663d == c1063v.f13663d) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HSBK : hue:");
        sb.append((int) this.f13660a);
        sb.append(", saturation:");
        sb.append((int) this.f13661b);
        sb.append(", brightness:");
        sb.append((int) this.f13662c);
        sb.append(", kelvin:");
        return AbstractC0013g0.l(sb, this.f13663d, ", ");
    }

    public C1063v(ByteBuffer byteBuffer) {
        this.f13660a = byteBuffer.getShort();
        this.f13661b = byteBuffer.getShort();
        this.f13662c = byteBuffer.getShort();
        this.f13663d = byteBuffer.getShort();
    }
}

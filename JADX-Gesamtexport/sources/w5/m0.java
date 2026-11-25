package w5;

import B.AbstractC0013g0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short f13627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public short f13628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public short f13629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public short f13630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f13631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f13632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f13633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f13634h;
    public byte i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13635j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13636k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13637l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f13638m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f13639n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13640o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f13641p;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.f13627a);
        byteBuffer.putShort(this.f13628b);
        byteBuffer.putShort(this.f13629c);
        byteBuffer.putShort(this.f13630d);
        byteBuffer.putFloat(this.f13631e);
        byteBuffer.putFloat(this.f13632f);
        byteBuffer.put(this.f13633g);
        byteBuffer.put(this.f13634h);
        byteBuffer.put(this.i);
        byteBuffer.putInt(this.f13635j);
        byteBuffer.putInt(this.f13636k);
        byteBuffer.putInt(this.f13637l);
        byteBuffer.putLong(this.f13638m);
        byteBuffer.putLong(this.f13639n);
        byteBuffer.putInt(this.f13640o);
        byteBuffer.putInt(this.f13641p);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m0) {
            m0 m0Var = (m0) obj;
            if (this.f13627a == m0Var.f13627a && this.f13628b == m0Var.f13628b && this.f13629c == m0Var.f13629c && this.f13630d == m0Var.f13630d && this.f13631e == m0Var.f13631e && this.f13632f == m0Var.f13632f && this.f13633g == m0Var.f13633g && this.f13634h == m0Var.f13634h && this.i == m0Var.i && this.f13635j == m0Var.f13635j && this.f13636k == m0Var.f13636k && this.f13637l == m0Var.f13637l && this.f13638m == m0Var.f13638m && this.f13639n == m0Var.f13639n && this.f13640o == m0Var.f13640o && this.f13641p == m0Var.f13641p) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tile : reserved0:");
        sb.append((int) this.f13627a);
        sb.append(", reserved1:");
        sb.append((int) this.f13628b);
        sb.append(", reserved2:");
        sb.append((int) this.f13629c);
        sb.append(", reserved3:");
        sb.append((int) this.f13630d);
        sb.append(", user_x:");
        sb.append(this.f13631e);
        sb.append(", user_y:");
        sb.append(this.f13632f);
        sb.append(", width:");
        sb.append((int) this.f13633g);
        sb.append(", height:");
        sb.append((int) this.f13634h);
        sb.append(", reserved4:");
        sb.append((int) this.i);
        sb.append(", device_version_vendor:");
        sb.append(this.f13635j);
        sb.append(", device_version_product:");
        sb.append(this.f13636k);
        sb.append(", device_version_version:");
        sb.append(this.f13637l);
        sb.append(", firmware_build:");
        sb.append(this.f13638m);
        sb.append(", reserved5:");
        sb.append(this.f13639n);
        sb.append(", firmware_version:");
        sb.append(this.f13640o);
        sb.append(", reserved6:");
        return AbstractC0013g0.l(sb, this.f13641p, ", ");
    }
}

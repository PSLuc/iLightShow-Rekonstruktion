package w5;

import B.AbstractC0013g0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class G implements InterfaceC1067z {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C1043a f13482l = new C1043a(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f13483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f13484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1063v f13485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f13487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public short f13488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n0 f13489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f13490h;
    public byte i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f13491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte f13492k;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f13483a);
        byteBuffer.put(this.f13484b);
        this.f13485c.a(byteBuffer);
        byteBuffer.putInt(this.f13486d);
        byteBuffer.putFloat(this.f13487e);
        byteBuffer.putShort(this.f13488f);
        byteBuffer.put(this.f13489g.f13646h);
        byteBuffer.put(this.f13490h);
        byteBuffer.put(this.i);
        byteBuffer.put(this.f13491j);
        byteBuffer.put(this.f13492k);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 25;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 119;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof G) {
            G g6 = (G) obj;
            if (this.f13483a == g6.f13483a && this.f13484b == g6.f13484b && E4.k.a(this.f13485c, g6.f13485c) && this.f13486d == g6.f13486d && this.f13487e == g6.f13487e && this.f13488f == g6.f13488f && this.f13489g == g6.f13489g && this.f13490h == g6.f13490h && this.i == g6.i && this.f13491j == g6.f13491j && this.f13492k == g6.f13492k) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LightSetWaveformOptional : reserved:");
        sb.append((int) this.f13483a);
        sb.append(", transient:");
        sb.append((int) this.f13484b);
        sb.append(", color:");
        sb.append(this.f13485c);
        sb.append(", period:");
        sb.append(this.f13486d);
        sb.append(", cycles:");
        sb.append(this.f13487e);
        sb.append(", skew_ratio:");
        sb.append((int) this.f13488f);
        sb.append(", waveform:");
        sb.append(this.f13489g);
        sb.append(", set_hue:");
        sb.append((int) this.f13490h);
        sb.append(", set_saturation:");
        sb.append((int) this.i);
        sb.append(", set_brightness:");
        sb.append((int) this.f13491j);
        sb.append(", set_kelvin:");
        return AbstractC0013g0.l(sb, this.f13492k, ", ");
    }
}

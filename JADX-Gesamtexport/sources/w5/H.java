package w5;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class H implements InterfaceC1067z {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1043a f13493f = new C1043a(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1063v f13494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public short f13495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public short f13496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f13497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13498e;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        this.f13494a.a(byteBuffer);
        byteBuffer.putShort(this.f13495b);
        byteBuffer.putShort(this.f13496c);
        Iterator it = p081p0.c.D0(0, 32).iterator();
        while (((J4.c) it).f1944j) {
            byteBuffer.put(this.f13497d[((p089q4.y) it).a()]);
        }
        byteBuffer.putLong(this.f13498e);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 52;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 107;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof H) {
            H h6 = (H) obj;
            if (E4.k.a(this.f13494a, h6.f13494a) && this.f13495b == h6.f13495b && this.f13496c == h6.f13496c && Arrays.equals(this.f13497d, h6.f13497d) && this.f13498e == h6.f13498e) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "LightState : color:" + this.f13494a + ", reserved:" + ((int) this.f13495b) + ", power:" + ((int) this.f13496c) + ", label:" + this.f13497d + ", reserved1:" + this.f13498e + ", ";
    }
}

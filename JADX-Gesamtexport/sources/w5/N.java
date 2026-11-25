package w5;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class N implements InterfaceC1067z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1043a f13517d = new C1043a(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Byte[] f13518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f13519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13520c;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        Byte[] bArr = this.f13518a;
        int length = bArr.length;
        for (Byte b6 : bArr) {
            byteBuffer.put(b6.byteValue());
        }
        Iterator it = p081p0.c.D0(0, 32).iterator();
        while (((J4.c) it).f1944j) {
            byteBuffer.put(this.f13519b[((p089q4.y) it).a()]);
        }
        byteBuffer.putLong(this.f13520c);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 56;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 52;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof N) {
            N n6 = (N) obj;
            if (E4.k.a(this.f13518a, n6.f13518a) && Arrays.equals(this.f13519b, n6.f13519b) && this.f13520c == n6.f13520c) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "SetGroup : group:" + this.f13518a + ", label:" + this.f13519b + ", updated_at:" + this.f13520c + ", ";
    }
}

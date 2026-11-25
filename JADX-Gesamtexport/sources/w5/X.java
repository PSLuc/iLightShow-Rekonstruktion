package w5;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class X implements InterfaceC1067z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Q f13549d = new Q(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Byte[] f13550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f13551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13552c;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        Byte[] bArr = this.f13550a;
        int length = bArr.length;
        for (Byte b6 : bArr) {
            byteBuffer.put(b6.byteValue());
        }
        Iterator it = p081p0.c.D0(0, 32).iterator();
        while (((J4.c) it).f1944j) {
            byteBuffer.put(this.f13551b[((p089q4.y) it).a()]);
        }
        byteBuffer.putLong(this.f13552c);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 56;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 53;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof X) {
            X x6 = (X) obj;
            if (E4.k.a(this.f13550a, x6.f13550a) && Arrays.equals(this.f13551b, x6.f13551b) && this.f13552c == x6.f13552c) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "StateGroup : group:" + this.f13550a + ", label:" + this.f13551b + ", updated_at:" + this.f13552c + ", ";
    }
}

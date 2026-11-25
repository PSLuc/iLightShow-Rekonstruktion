package w5;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class S implements InterfaceC1067z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Q f13526d = new Q(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Byte[] f13527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f13528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13529c;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        Byte[] bArr = this.f13527a;
        int length = bArr.length;
        for (Byte b6 : bArr) {
            byteBuffer.put(b6.byteValue());
        }
        Iterator it = p081p0.c.D0(0, 32).iterator();
        while (((J4.c) it).f1944j) {
            byteBuffer.put(this.f13528b[((p089q4.y) it).a()]);
        }
        byteBuffer.putLong(this.f13529c);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 56;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 49;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof S) {
            S s6 = (S) obj;
            if (E4.k.a(this.f13527a, s6.f13527a) && Arrays.equals(this.f13528b, s6.f13528b) && this.f13529c == s6.f13529c) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "SetLocation : location:" + this.f13527a + ", label:" + this.f13528b + ", updated_at:" + this.f13529c + ", ";
    }
}

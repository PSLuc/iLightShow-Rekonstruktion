package w5;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements InterfaceC1067z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Q f13577d = new Q(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Byte[] f13578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f13579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13580c;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        Byte[] bArr = this.f13578a;
        int length = bArr.length;
        for (Byte b6 : bArr) {
            byteBuffer.put(b6.byteValue());
        }
        Iterator it = p081p0.c.D0(0, 32).iterator();
        while (((J4.c) it).f1944j) {
            byteBuffer.put(this.f13579b[((p089q4.y) it).a()]);
        }
        byteBuffer.putLong(this.f13580c);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 56;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 50;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            if (E4.k.a(this.f13578a, d0Var.f13578a) && Arrays.equals(this.f13579b, d0Var.f13579b) && this.f13580c == d0Var.f13580c) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "StateLocation : location:" + this.f13578a + ", label:" + this.f13579b + ", updated_at:" + this.f13580c + ", ";
    }
}

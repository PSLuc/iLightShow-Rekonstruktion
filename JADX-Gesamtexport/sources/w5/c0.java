package w5;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements InterfaceC1067z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Q f13574b = new Q(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f13575a;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        Iterator it = p081p0.c.D0(0, 32).iterator();
        while (((J4.c) it).f1944j) {
            byteBuffer.put(this.f13575a[((p089q4.y) it).a()]);
        }
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 32;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 25;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        return Arrays.equals(this.f13575a, ((c0) obj).f13575a);
    }

    public final String toString() {
        return "StateLabel : label:" + this.f13575a + ", ";
    }
}

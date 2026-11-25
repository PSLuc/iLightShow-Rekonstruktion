package w5;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class P implements InterfaceC1067z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1043a f13523b = new C1043a(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f13524a;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        Iterator it = p081p0.c.D0(0, 32).iterator();
        while (((J4.c) it).f1944j) {
            byteBuffer.put(this.f13524a[((p089q4.y) it).a()]);
        }
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 32;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 24;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof P)) {
            return false;
        }
        return Arrays.equals(this.f13524a, ((P) obj).f13524a);
    }

    public final String toString() {
        return "SetLabel : label:" + this.f13524a + ", ";
    }
}

package w5;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: w5.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1060s implements InterfaceC1067z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1043a f13657a = new C1043a(15);

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 0;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 32;
    }

    public final boolean equals(Object obj) {
        return obj instanceof C1060s;
    }

    public final String toString() {
        return "GetVersion : ";
    }
}

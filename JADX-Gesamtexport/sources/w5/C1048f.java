package w5;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: w5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1048f implements InterfaceC1067z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1043a f13587b = new C1043a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Byte[] f13588a;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        Byte[] bArr = this.f13588a;
        int length = bArr.length;
        for (Byte b6 : bArr) {
            byteBuffer.put(b6.byteValue());
        }
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 64;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 59;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1048f)) {
            return false;
        }
        return E4.k.a(this.f13588a, ((C1048f) obj).f13588a);
    }

    public final String toString() {
        return "EchoResponse : payload:" + this.f13588a + ", ";
    }
}

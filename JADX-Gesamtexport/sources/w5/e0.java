package w5;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements InterfaceC1067z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Q f13583d = new Q(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f13584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f13585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1063v[] f13586c;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f13584a);
        byteBuffer.put(this.f13585b);
        C1063v[] c1063vArr = this.f13586c;
        int length = c1063vArr.length;
        for (C1063v c1063v : c1063vArr) {
            c1063v.a(byteBuffer);
        }
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 66;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 506;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            if (this.f13584a == e0Var.f13584a && this.f13585b == e0Var.f13585b && E4.k.a(this.f13586c, e0Var.f13586c)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "StateMultiZone : count:" + ((int) this.f13584a) + ", index:" + ((int) this.f13585b) + ", color:" + this.f13586c + ", ";
    }
}

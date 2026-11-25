package w5;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements InterfaceC1067z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Q f13598g = new Q(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f13599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f13600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f13601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f13602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f13603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C1063v[] f13604f;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f13599a);
        byteBuffer.put(this.f13600b);
        byteBuffer.put(this.f13601c);
        byteBuffer.put(this.f13602d);
        byteBuffer.put(this.f13603e);
        C1063v[] c1063vArr = this.f13604f;
        int length = c1063vArr.length;
        for (C1063v c1063v : c1063vArr) {
            c1063v.a(byteBuffer);
        }
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 517;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 711;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            if (this.f13599a == h0Var.f13599a && this.f13600b == h0Var.f13600b && this.f13601c == h0Var.f13601c && this.f13602d == h0Var.f13602d && this.f13603e == h0Var.f13603e && E4.k.a(this.f13604f, h0Var.f13604f)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "StateTileState64 : tile_index:" + ((int) this.f13599a) + ", reserved:" + ((int) this.f13600b) + ", x:" + ((int) this.f13601c) + ", y:" + ((int) this.f13602d) + ", width:" + ((int) this.f13603e) + ", colors:" + this.f13604f + ", ";
    }
}

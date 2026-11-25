package w5;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class U implements InterfaceC1067z {
    public static final Q i = new Q(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f13532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f13533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f13534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f13535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f13536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f13537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C1063v[] f13539h;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f13532a);
        byteBuffer.put(this.f13533b);
        byteBuffer.put(this.f13534c);
        byteBuffer.put(this.f13535d);
        byteBuffer.put(this.f13536e);
        byteBuffer.put(this.f13537f);
        byteBuffer.putInt(this.f13538g);
        C1063v[] c1063vArr = this.f13539h;
        int length = c1063vArr.length;
        for (C1063v c1063v : c1063vArr) {
            c1063v.a(byteBuffer);
        }
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 522;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 715;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof U) {
            U u6 = (U) obj;
            if (this.f13532a == u6.f13532a && this.f13533b == u6.f13533b && this.f13534c == u6.f13534c && this.f13535d == u6.f13535d && this.f13536e == u6.f13536e && this.f13537f == u6.f13537f && this.f13538g == u6.f13538g && E4.k.a(this.f13539h, u6.f13539h)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "SetTileState64 : tile_index:" + ((int) this.f13532a) + ", length:" + ((int) this.f13533b) + ", reserved:" + ((int) this.f13534c) + ", x:" + ((int) this.f13535d) + ", y:" + ((int) this.f13536e) + ", width:" + ((int) this.f13537f) + ", duration:" + this.f13538g + ", colors:" + this.f13539h + ", ";
    }
}

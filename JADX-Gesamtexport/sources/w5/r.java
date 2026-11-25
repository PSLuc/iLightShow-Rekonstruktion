package w5;

import B.AbstractC0013g0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class r implements InterfaceC1067z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1043a f13650g = new C1043a(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f13651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f13652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f13653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f13654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f13655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f13656f;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f13651a);
        byteBuffer.put(this.f13652b);
        byteBuffer.put(this.f13653c);
        byteBuffer.put(this.f13654d);
        byteBuffer.put(this.f13655e);
        byteBuffer.put(this.f13656f);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        return 6;
    }

    @Override // w5.InterfaceC1067z
    public final int c() {
        return 707;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f13651a == rVar.f13651a && this.f13652b == rVar.f13652b && this.f13653c == rVar.f13653c && this.f13654d == rVar.f13654d && this.f13655e == rVar.f13655e && this.f13656f == rVar.f13656f) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetTileState64 : tile_index:");
        sb.append((int) this.f13651a);
        sb.append(", length:");
        sb.append((int) this.f13652b);
        sb.append(", reserved:");
        sb.append((int) this.f13653c);
        sb.append(", x:");
        sb.append((int) this.f13654d);
        sb.append(", y:");
        sb.append((int) this.f13655e);
        sb.append(", width:");
        return AbstractC0013g0.l(sb, this.f13656f, ", ");
    }
}

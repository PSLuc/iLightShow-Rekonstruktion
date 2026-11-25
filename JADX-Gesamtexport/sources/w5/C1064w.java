package w5;

import B.AbstractC0013g0;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: w5.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1064w implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short f13664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public short f13665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Byte[] f13668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f13669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f13670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f13671h;
    public short i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public short f13672j;

    @Override // w5.A
    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.f13664a);
        byteBuffer.putShort(this.f13665b);
        byteBuffer.putInt(this.f13666c);
        byteBuffer.putLong(this.f13667d);
        Byte[] bArr = this.f13668e;
        int length = bArr.length;
        for (Byte b6 : bArr) {
            byteBuffer.put(b6.byteValue());
        }
        byteBuffer.put(this.f13669f);
        byteBuffer.put(this.f13670g);
        byteBuffer.putLong(this.f13671h);
        byteBuffer.putShort(this.i);
        byteBuffer.putShort(this.f13672j);
        return byteBuffer;
    }

    @Override // w5.A
    public final int b() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1064w) {
            C1064w c1064w = (C1064w) obj;
            if (this.f13664a == c1064w.f13664a && this.f13665b == c1064w.f13665b && this.f13666c == c1064w.f13666c && this.f13667d == c1064w.f13667d && E4.k.a(this.f13668e, c1064w.f13668e) && this.f13669f == c1064w.f13669f && this.f13670g == c1064w.f13670g && this.f13671h == c1064w.f13671h && this.i == c1064w.i && this.f13672j == c1064w.f13672j) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        short s6 = this.f13665b;
        long j4 = this.f13667d;
        StringBuilder sb = new StringBuilder("Header : size:");
        sb.append((int) this.f13664a);
        sb.append(", protocolOriginTagged:");
        sb.append((int) s6);
        sb.append(", source:");
        sb.append(this.f13666c);
        sb.append(", target:");
        sb.append(j4);
        sb.append(", reserved:");
        sb.append(this.f13668e);
        sb.append(", flags:");
        sb.append((int) this.f13669f);
        sb.append(", sequence:");
        sb.append((int) this.f13670g);
        sb.append(", reserved1:");
        sb.append(this.f13671h);
        sb.append(", type:");
        sb.append((int) this.i);
        sb.append(", reserved2:");
        return AbstractC0013g0.l(sb, this.f13672j, ", ");
    }
}

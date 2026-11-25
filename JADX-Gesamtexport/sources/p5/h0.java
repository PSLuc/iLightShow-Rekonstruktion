package p5;

import B.AbstractC0013g0;
import java.net.InetSocketAddress;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends M {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte[] f11066o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final P f11067p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f11068q;

    /* JADX WARN: Illegal instructions before constructor call */
    public h0(L l6) {
        InetSocketAddress inetSocketAddress = (InetSocketAddress) l6.f603h;
        P p6 = l6.f10927o;
        super(p6, inetSocketAddress);
        ArrayList arrayList = new ArrayList();
        this.f11068q = arrayList;
        v(l6.i);
        this.f11067p = p6;
        byte[] bArr = new byte[l6.f10928p];
        this.f11066o = bArr;
        byte[] bArr2 = l6.f10926n;
        g0 g0Var = new g0(l6.f10929q, bArr2.length);
        arrayList.add(0, g0Var);
        System.arraycopy(bArr2, 0, bArr, g0Var.f11059a, g0Var.f11060b);
    }

    @Override // p5.M, p5.O
    public final byte[] p() {
        return this.f11066o;
    }

    @Override // p5.M, p5.O
    public final int t() {
        return this.f11066o.length;
    }

    @Override // p5.O
    public final String toString() {
        StringBuilder sb = new StringBuilder("\tReassembled Handshake Protocol");
        String str = m5.s.f10493b;
        sb.append(str);
        sb.append("\tType: ");
        sb.append(this.f11067p);
        sb.append(str);
        sb.append("\tPeer: ");
        sb.append((InetSocketAddress) this.f603h);
        sb.append(str);
        sb.append("\tMessage Sequence No: ");
        AbstractC0013g0.s(sb, this.i, str, "\tFragment Offset: 0", str);
        sb.append("\tFragment Length: ");
        sb.append(t());
        sb.append(str);
        sb.append("\tLength: ");
        return AbstractC0013g0.l(sb, this.f11066o.length, str);
    }

    @Override // p5.M, p5.O
    public final P u() {
        return this.f11067p;
    }

    public final void x(L l6) {
        int i;
        P p6 = l6.f10927o;
        P p7 = this.f11067p;
        if (p7 != p6) {
            throw new IllegalArgumentException("Fragment message type " + p6 + " differs from " + p7 + "!");
        }
        if (this.i != l6.i) {
            StringBuilder sb = new StringBuilder("Fragment message sequence number ");
            sb.append(l6.i);
            sb.append(" differs from ");
            throw new IllegalArgumentException(AbstractC0013g0.l(sb, this.i, "!"));
        }
        byte[] bArr = this.f11066o;
        int length = bArr.length;
        int i3 = l6.f10928p;
        if (length != i3) {
            throw new IllegalArgumentException(AbstractC0013g0.l(p012c.k.v(i3, "Fragment message length ", " differs from "), bArr.length, "!"));
        }
        InetSocketAddress inetSocketAddress = (InetSocketAddress) this.f603h;
        InetSocketAddress inetSocketAddress2 = (InetSocketAddress) l6.f603h;
        if (!inetSocketAddress.equals(inetSocketAddress2)) {
            throw new IllegalArgumentException("Fragment message peer " + inetSocketAddress2 + " differs from " + inetSocketAddress + "!");
        }
        ArrayList arrayList = this.f11068q;
        g0 g0Var = (g0) arrayList.get(0);
        if (g0Var.f11059a != 0 || bArr.length > g0Var.f11061c) {
            byte[] bArr2 = l6.f10926n;
            g0 g0Var2 = new g0(l6.f10929q, bArr2.length);
            if (bArr.length < g0Var2.f11061c) {
                StringBuilder sb2 = new StringBuilder("Fragment message ");
                sb2.append(g0Var2.f11061c);
                sb2.append(" bytes exceeds message ");
                throw new IllegalArgumentException(AbstractC0013g0.l(sb2, bArr.length, " bytes!"));
            }
            int i6 = 0;
            int i7 = 0;
            while (i6 < arrayList.size()) {
                g0 g0Var3 = (g0) arrayList.get(i6);
                int i8 = g0Var2.f11059a;
                int i9 = g0Var3.f11059a;
                if (i8 < i9) {
                    int i10 = g0Var2.f11061c;
                    if (i9 >= i10 || i10 > g0Var3.f11061c || i10 <= i9) {
                        break;
                        break;
                        break;
                    } else {
                        if (i9 < i8) {
                            throw new IllegalArgumentException("adjusted end before offset!");
                        }
                        g0Var2.f11061c = i9;
                        g0Var2.f11060b = i9 - i8;
                        break;
                    }
                }
                int i11 = g0Var2.f11061c;
                int i12 = g0Var3.f11061c;
                if (i11 <= i12) {
                    return;
                }
                if (i8 == i9) {
                    i6++;
                    break;
                } else {
                    i6++;
                    i7 = i12;
                }
            }
            int i13 = g0Var2.f11059a;
            if (i13 >= i7) {
                i = 0;
            } else {
                int i14 = g0Var2.f11061c;
                if (i14 <= i7) {
                    g0Var2.f11060b = 0;
                    g0Var2.f11059a = i7;
                    g0Var2.f11061c = i7;
                    i = 0;
                } else {
                    i = i7 - i13;
                    g0Var2.f11059a = i7;
                    g0Var2.f11060b = i14 - i7;
                }
            }
            if (g0Var2.f11060b == 0) {
                return;
            }
            arrayList.add(i6, g0Var2);
            System.arraycopy(bArr2, i, bArr, g0Var2.f11059a, g0Var2.f11060b);
            g0 g0Var4 = (g0) arrayList.get(0);
            int i15 = 1;
            while (i15 < arrayList.size()) {
                g0 g0Var5 = (g0) arrayList.get(i15);
                int i16 = g0Var5.f11059a;
                int i17 = g0Var4.f11061c;
                if (i16 <= i17) {
                    int i18 = g0Var5.f11061c;
                    if (i17 < i18) {
                        g0Var4.f11061c = i18;
                        g0Var4.f11060b = i18 - g0Var4.f11059a;
                    }
                    arrayList.remove(i15);
                    i15--;
                } else {
                    g0Var4 = g0Var5;
                }
                i15++;
            }
        }
    }
}

package p5;

import B.AbstractC0013g0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f11166b;

    public w0(List list) {
        super(14);
        this.f11166b = list;
    }

    @Override // p5.S
    public final void a(m5.j jVar) {
        List<x0> list = this.f11166b;
        int size = list.size() * 2;
        jVar.b(size + 2, 16);
        jVar.b(size, 16);
        for (x0 x0Var : list) {
            jVar.b(p012c.k.d(x0Var.f11170b), 8);
            jVar.b(p012c.k.e(x0Var.f11171c), 8);
        }
    }

    @Override // p5.S
    public final int c() {
        return (this.f11166b.size() * 2) + 6;
    }

    @Override // p5.S
    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\t\t\t\tLength: ");
        sb.append(c() - 4);
        String str = m5.s.f10493b;
        sb.append(str);
        sb.append("\t\t\t\tSignature Algorithms Length: ");
        sb.append(c() - 6);
        sb.append(str);
        sb.append("\t\t\t\tSignature Algorithms (");
        List<x0> list = this.f11166b;
        sb.append(list.size());
        sb.append(" algorithm):");
        for (x0 x0Var : list) {
            String str2 = m5.s.f10493b;
            AbstractC0013g0.t(sb, str2, "\t\t\t\t\tSignature Algorithm: ", str2, "\t\t\t\t\t\tSignature Hash Algorithm Hash: ");
            int i = x0Var.f11170b;
            if (i != 0) {
                sb.append(p012c.k.D(i));
            } else {
                sb.append("unknown");
            }
            sb.append(str2);
            sb.append("\t\t\t\t\t\tSignature Hash Algorithm Signature: ");
            int i3 = x0Var.f11171c;
            if (i3 != 0) {
                sb.append(p012c.k.E(i3));
            } else {
                sb.append("unknown");
            }
        }
        sb.append(m5.s.f10493b);
        return sb.toString();
    }
}

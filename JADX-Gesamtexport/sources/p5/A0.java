package p5;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class A0 extends S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final A0 f10885c = new A0(Collections.singletonList(z0.UNCOMPRESSED));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f10886b;

    public A0(List list) {
        super(12);
        this.f10886b = list;
    }

    @Override // p5.S
    public final void a(m5.j jVar) {
        List list = this.f10886b;
        int size = list.size();
        jVar.b(size + 1, 16);
        jVar.b(size, 8);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jVar.b(((z0) it.next()).f11182h, 8);
        }
    }

    @Override // p5.S
    public final int c() {
        return this.f10886b.size() + 5;
    }

    @Override // p5.S
    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\t\t\t\tLength: ");
        sb.append(c() - 4);
        String str = m5.s.f10493b;
        sb.append(str);
        sb.append("\t\t\t\tEC point formats length: ");
        sb.append(c() - 5);
        sb.append(str);
        sb.append("\t\t\t\tElliptic Curves Point Formats (");
        List<z0> list = this.f10886b;
        sb.append(list.size());
        sb.append("):");
        for (z0 z0Var : list) {
            sb.append(m5.s.f10493b);
            sb.append("\t\t\t\t\tEC point format: ");
            sb.append(z0Var.toString());
        }
        return sb.toString();
    }
}

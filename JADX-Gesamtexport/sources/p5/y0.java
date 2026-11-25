package p5;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f11176b;

    public y0(List list) {
        super(11);
        this.f11176b = list;
    }

    @Override // p5.S
    public final void a(m5.j jVar) {
        List list = this.f11176b;
        int size = list.size() * 2;
        jVar.b(size + 2, 16);
        jVar.b(size, 16);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jVar.b(((q5.w) it.next()).f11327h, 16);
        }
    }

    @Override // p5.S
    public final int c() {
        return (this.f11176b.size() * 2) + 6;
    }

    @Override // p5.S
    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\t\t\t\tLength: ");
        sb.append(c() - 4);
        String str = m5.s.f10493b;
        sb.append(str);
        sb.append("\t\t\t\tElliptic Curves Length: ");
        sb.append(c() - 6);
        sb.append(str);
        sb.append("\t\t\t\tElliptic Curves (");
        List<q5.w> list = this.f11176b;
        sb.append(list.size());
        sb.append(" curves):");
        for (q5.w wVar : list) {
            sb.append(m5.s.f10493b);
            sb.append("\t\t\t\t\tElliptic Curve: ");
            sb.append(wVar.name());
            sb.append(" (");
            sb.append(wVar.f11327h);
            sb.append(")");
        }
        return sb.toString();
    }
}

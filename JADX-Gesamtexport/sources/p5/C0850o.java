package p5;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: p5.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0850o extends O {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c0 f11121n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public f0 f11122o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public t0 f11123p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte[] f11124q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f11125r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f11126s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public T f11127t;

    public C0850o(InetSocketAddress inetSocketAddress) {
        super(inetSocketAddress);
        this.f11125r = new ArrayList();
        this.f11126s = new ArrayList();
        this.f11127t = new T();
    }

    @Override // p5.O
    public final byte[] p() {
        m5.j jVar = new m5.j(false);
        jVar.b(this.f11121n.i, 8);
        jVar.b(this.f11121n.f11036h, 8);
        jVar.c(this.f11122o.f10440a);
        jVar.b(this.f11123p.f10440a.length, 8);
        jVar.c(this.f11123p.f10440a);
        jVar.b(this.f11124q.length, 8);
        jVar.c(this.f11124q);
        jVar.b(this.f11125r.size() * 2, 16);
        jVar.c(q5.i.h(this.f11125r));
        jVar.b(this.f11126s.size(), 8);
        jVar.c(EnumC0852q.a(this.f11126s));
        T t6 = this.f11127t;
        if (t6 != null) {
            jVar.c(t6.e());
        }
        return jVar.a();
    }

    @Override // p5.O
    public final int t() {
        T t6 = this.f11127t;
        return this.f11126s.size() + (this.f11125r.size() * 2) + this.f11123p.f10440a.length + 39 + this.f11124q.length + ((t6 == null || t6.f11002a.isEmpty()) ? 0 : this.f11127t.d() + 2);
    }

    @Override // p5.O
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\t\tVersion: ");
        sb.append(this.f11121n.i);
        sb.append(", ");
        sb.append(this.f11121n.f11036h);
        String str = m5.s.f10493b;
        sb.append(str);
        sb.append("\t\tRandom:");
        sb.append(str);
        sb.append(this.f11122o);
        sb.append("\t\tSession ID Length: ");
        sb.append(this.f11123p.f10440a.length);
        if (this.f11123p.f10440a.length > 0) {
            sb.append(str);
            sb.append("\t\tSession ID: ");
            sb.append(this.f11123p);
        }
        sb.append(str);
        sb.append("\t\tCookie Length: ");
        sb.append(this.f11124q.length);
        int i = 0;
        if (this.f11124q.length > 0) {
            sb.append(str);
            sb.append("\t\tCookie: ");
            sb.append(m5.s.b(0, this.f11124q));
        }
        sb.append(str);
        sb.append("\t\tCipher Suites Length: ");
        sb.append(this.f11125r.size() * 2);
        sb.append(str);
        sb.append("\t\tCipher Suites (");
        sb.append(this.f11125r.size());
        sb.append(" suites)");
        ArrayList arrayList = this.f11125r;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            sb.append(m5.s.f10493b);
            sb.append("\t\t\tCipher Suite: ");
            sb.append((q5.i) obj);
        }
        String str2 = m5.s.f10493b;
        sb.append(str2);
        sb.append("\t\tCompression Methods Length: ");
        sb.append(this.f11126s.size());
        sb.append(str2);
        sb.append("\t\tCompression Methods (");
        sb.append(this.f11126s.size());
        sb.append(" method)");
        ArrayList arrayList2 = this.f11126s;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            sb.append(m5.s.f10493b);
            sb.append("\t\t\tCompression Method: ");
            sb.append((EnumC0852q) obj2);
        }
        if (this.f11127t != null) {
            sb.append(m5.s.f10493b);
            sb.append(this.f11127t);
        }
        return sb.toString();
    }

    @Override // p5.O
    public final P u() {
        return P.CLIENT_HELLO;
    }

    public final void x(EnumC0852q enumC0852q) {
        if (this.f11126s == null) {
            this.f11126s = new ArrayList();
        }
        this.f11126s.add(enumC0852q);
    }

    public C0850o(c0 c0Var, t0 t0Var, List list, List list2, List list3, List list4, List list5, InetSocketAddress inetSocketAddress) {
        this(inetSocketAddress);
        this.f11121n = c0Var;
        this.f11122o = new f0();
        this.f11124q = m5.d.f10439d;
        if (t0Var != null) {
            this.f11123p = t0Var;
        } else {
            this.f11123p = t0.f11151e;
        }
        if (list != null) {
            this.f11125r.addAll(list);
        }
        q5.i iVar = q5.i.f11284p;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((q5.i) it.next()).f()) {
                    this.f11127t.a(new y0(list5));
                    this.f11127t.a(A0.f10885c);
                    break;
                }
            }
        }
        boolean z5 = false;
        if (!list2.isEmpty()) {
            EnumC0843h enumC0843h = EnumC0843h.RAW_PUBLIC_KEY;
            if ((list3 == null || list3.size() != 1) ? false : list3.contains(enumC0843h)) {
                if ((list4 == null || list4.size() != 1) ? false : list4.contains(enumC0843h)) {
                    list2 = x0.b(list2);
                }
            }
            this.f11127t.a(new w0(list2));
        }
        EnumC0843h enumC0843h2 = EnumC0843h.X_509;
        if ((list3 == null || list3.isEmpty() || (list3.size() <= 1 && list3.contains(enumC0843h2))) ? false : true) {
            this.f11127t.a(new C0848m(20, list3));
        }
        if (list4 != null && !list4.isEmpty() && (list4.size() > 1 || !list4.contains(enumC0843h2))) {
            z5 = true;
        }
        if (z5) {
            this.f11127t.a(new m0(21, list4));
        }
    }
}

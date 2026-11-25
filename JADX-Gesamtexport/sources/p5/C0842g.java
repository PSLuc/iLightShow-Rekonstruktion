package p5;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Iterator;
import javax.security.auth.x500.X500Principal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: renamed from: p5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0842g extends O {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Logger f11054r = LoggerFactory.getLogger((Class<?>) C0842g.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f11055n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f11056o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f11057p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11058q;

    public C0842g(InetSocketAddress inetSocketAddress) {
        super(inetSocketAddress);
        this.f11055n = new ArrayList();
        this.f11056o = new ArrayList();
        this.f11057p = new ArrayList();
        this.f11058q = 0;
    }

    @Override // p5.O
    public final byte[] p() {
        int i = 0;
        m5.j jVar = new m5.j(false);
        ArrayList arrayList = this.f11055n;
        jVar.b(arrayList.size(), 8);
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            jVar.b(((EnumC0841f) obj).f11052h, 8);
        }
        ArrayList arrayList2 = this.f11056o;
        jVar.b(arrayList2.size() * 2, 16);
        int size2 = arrayList2.size();
        int i6 = 0;
        while (i6 < size2) {
            Object obj2 = arrayList2.get(i6);
            i6++;
            x0 x0Var = (x0) obj2;
            jVar.b(p012c.k.d(x0Var.f11170b), 8);
            jVar.b(p012c.k.e(x0Var.f11171c), 8);
        }
        jVar.b(this.f11058q, 16);
        ArrayList arrayList3 = this.f11057p;
        int size3 = arrayList3.size();
        while (i < size3) {
            Object obj3 = arrayList3.get(i);
            i++;
            byte[] encoded = ((X500Principal) obj3).getEncoded();
            jVar.b(encoded.length, 16);
            jVar.c(encoded);
        }
        return jVar.a();
    }

    @Override // p5.O
    public final int t() {
        return (this.f11056o.size() * 2) + this.f11055n.size() + 3 + 2 + this.f11058q;
    }

    @Override // p5.O
    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        ArrayList arrayList = this.f11055n;
        int i = 0;
        if (!arrayList.isEmpty()) {
            sb.append("\t\tClient certificate type:");
            sb.append(m5.s.f10493b);
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                sb.append("\t\t\t");
                sb.append((EnumC0841f) obj);
                sb.append(m5.s.f10493b);
            }
        }
        ArrayList arrayList2 = this.f11056o;
        if (!arrayList2.isEmpty()) {
            sb.append("\t\tSignature and hash algorithm:");
            sb.append(m5.s.f10493b);
            int size2 = arrayList2.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj2 = arrayList2.get(i6);
                i6++;
                sb.append("\t\t\t");
                sb.append((x0) obj2);
                sb.append(m5.s.f10493b);
            }
        }
        ArrayList arrayList3 = this.f11057p;
        if (!arrayList3.isEmpty()) {
            sb.append("\t\tCertificate authorities:");
            sb.append(m5.s.f10493b);
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj3 = arrayList3.get(i);
                i++;
                sb.append("\t\t\t");
                sb.append(((X500Principal) obj3).getName());
                sb.append(m5.s.f10493b);
            }
        }
        return sb.toString();
    }

    @Override // p5.O
    public final P u() {
        return P.CERTIFICATE_REQUEST;
    }

    public C0842g(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, InetSocketAddress inetSocketAddress) {
        super(inetSocketAddress);
        ArrayList arrayList4 = new ArrayList();
        this.f11055n = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        this.f11056o = arrayList5;
        this.f11057p = new ArrayList();
        this.f11058q = 0;
        arrayList4.addAll(arrayList);
        if (!arrayList2.isEmpty()) {
            arrayList5.addAll(arrayList2);
        }
        Iterator it = arrayList3.iterator();
        int i = 0;
        while (it.hasNext()) {
            X500Principal x500Principal = (X500Principal) it.next();
            if (x500Principal != null) {
                int length = x500Principal.getEncoded().length + 2;
                if (this.f11058q + length <= 65535) {
                    this.f11057p.add(x500Principal);
                    this.f11058q += length;
                    i++;
                } else {
                    f11054r.debug("could add only {} of {} certificate authorities, max length exceeded", Integer.valueOf(i), Integer.valueOf(arrayList3.size()));
                    return;
                }
            } else {
                throw new NullPointerException("authority must not be null");
            }
        }
    }
}

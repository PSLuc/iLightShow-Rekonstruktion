package p126x2;

import B2.e;
import B2.g;
import E4.k;
import M4.u;
import java.net.URL;
import p089q4.l;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final URL f14134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f14137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f14138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f14139f;

    public z(URL url, int i, String str, t tVar, long j4, e eVar) {
        k.f("url", url);
        this.f14134a = url;
        this.f14135b = i;
        this.f14136c = str;
        this.f14137d = tVar;
        this.f14138e = j4;
        this.f14139f = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return k.a(this.f14134a, zVar.f14134a) && this.f14135b == zVar.f14135b && k.a(this.f14136c, zVar.f14136c) && k.a(this.f14137d, zVar.f14137d) && this.f14138e == zVar.f14138e && k.a(this.f14139f, zVar.f14139f);
    }

    public final int hashCode() {
        URL url = this.f14134a;
        int iHashCode = (((url != null ? url.hashCode() : 0) * 31) + this.f14135b) * 31;
        String str = this.f14136c;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        t tVar = this.f14137d;
        int iHashCode3 = (iHashCode2 + (tVar != null ? tVar.hashCode() : 0)) * 31;
        long j4 = this.f14138e;
        int i = (iHashCode3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        e eVar = this.f14139f;
        return i + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<-- " + this.f14135b + ' ' + this.f14134a);
        String str = u.f3549a;
        sb.append(str);
        sb.append("Response : " + this.f14136c);
        sb.append(str);
        sb.append("Length : " + this.f14138e);
        sb.append(str);
        StringBuilder sb2 = new StringBuilder("Body : ");
        e eVar = this.f14139f;
        t tVar = this.f14137d;
        sb2.append(eVar.d((String) l.g0((Iterable) tVar.get("Content-Type"))));
        sb.append(sb2.toString());
        sb.append(str);
        sb.append("Headers : (" + tVar.f14112h.size() + ')');
        sb.append(str);
        g gVar = new g(1, sb);
        tVar.b(gVar, gVar);
        String string = sb.toString();
        k.e("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }

    public /* synthetic */ z(URL url) {
        this(url, -1, "", new t(), 0L, new e());
    }
}

package B2;

import N3.M0;
import S1.V;
import com.fasterxml.jackson.databind.deser.std.d0;
import com.github.kittinunf.fuel.core.FuelError;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.Model.Data.AuthRequest;
import java.io.ByteArrayInputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p126x2.InterfaceC1118a;
import p126x2.t;
import p126x2.u;
import p126x2.v;
import p126x2.w;
import p126x2.x;
import p126x2.z;
import p130y0.C1136i0;

/* JADX INFO: loaded from: classes.dex */
public final class h implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public URL f506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC1118a f509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f511h;

    public h(u uVar, URL url, t tVar, List list) {
        e eVar = new e();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        E4.k.f("method", uVar);
        this.f505b = uVar;
        this.f506c = url;
        this.f507d = tVar;
        this.f508e = list;
        this.f509f = eVar;
        this.f510g = linkedHashMap;
        this.f511h = linkedHashMap2;
    }

    @Override // p126x2.w
    public final w a(v vVar) {
        E4.k.f("handler", vVar);
        v vVar2 = f().f14121b;
        vVar2.getClass();
        vVar2.f14119h.add(vVar);
        return this;
    }

    @Override // p126x2.w
    public final void b(x xVar) {
        this.f504a = xVar;
    }

    @Override // p126x2.w
    public final w c() {
        f().f14124e = Boolean.TRUE;
        return this;
    }

    @Override // p126x2.w
    public final w d(String str, String str2) {
        E4.k.f("value", str2);
        p(str, str2);
        return this;
    }

    @Override // p126x2.w
    public final void e(URL url) {
        E4.k.f("<set-?>", url);
        this.f506c = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return E4.k.a(this.f505b, hVar.f505b) && E4.k.a(this.f506c, hVar.f506c) && E4.k.a(this.f507d, hVar.f507d) && E4.k.a(this.f508e, hVar.f508e) && E4.k.a(this.f509f, hVar.f509f) && E4.k.a(this.f510g, hVar.f510g) && E4.k.a(this.f511h, hVar.f511h);
    }

    @Override // p126x2.w
    public final x f() {
        x xVar = this.f504a;
        if (xVar != null) {
            return xVar;
        }
        E4.k.m("executionOptions");
        throw null;
    }

    @Override // p126x2.w
    public final b g(M0 m6) {
        return p137z2.a.d(this, new p085q.b(13), m6);
    }

    @Override // p126x2.w, java.util.concurrent.Future
    public final Collection get() {
        return (Collection) this.f507d.get("Content-Type");
    }

    @Override // p126x2.w
    public final w h(String str, Charset charset) {
        E4.k.f("body", str);
        E4.k.f("charset", charset);
        byte[] bytes = str.getBytes(charset);
        E4.k.e("(this as java.lang.String).getBytes(charset)", bytes);
        this.f509f = new j(new e(new f(new ByteArrayInputStream(bytes), 0), new d(bytes, 2), charset));
        CharSequence charSequence = (CharSequence) p089q4.l.g0(get());
        if (charSequence != null && !M4.l.i0(charSequence)) {
            return this;
        }
        String str2 = "text/plain; charset=" + charset.name();
        E4.k.f("value", str2);
        p("Content-Type", str2);
        return this;
    }

    public final int hashCode() {
        u uVar = this.f505b;
        int iHashCode = (uVar != null ? uVar.hashCode() : 0) * 31;
        URL url = this.f506c;
        int iHashCode2 = (iHashCode + (url != null ? url.hashCode() : 0)) * 31;
        t tVar = this.f507d;
        int iHashCode3 = (iHashCode2 + (tVar != null ? tVar.hashCode() : 0)) * 31;
        List list = this.f508e;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        InterfaceC1118a interfaceC1118a = this.f509f;
        int iHashCode5 = (iHashCode4 + (interfaceC1118a != null ? interfaceC1118a.hashCode() : 0)) * 31;
        Map map = this.f510g;
        int iHashCode6 = (iHashCode5 + (map != null ? map.hashCode() : 0)) * 31;
        Map map2 = this.f511h;
        return iHashCode6 + (map2 != null ? map2.hashCode() : 0);
    }

    @Override // p126x2.w
    public final b i(p000a.a aVar) {
        Charset charset = M4.a.f3520a;
        E4.k.f("charset", charset);
        return p137z2.a.e(this, new C1136i0(charset), aVar);
    }

    @Override // p126x2.w
    public final InterfaceC1118a j() {
        return this.f509f;
    }

    @Override // p126x2.w
    public final w k(v vVar) {
        E4.k.f("handler", vVar);
        v vVar2 = f().f14120a;
        vVar2.getClass();
        vVar2.f14119h.add(vVar);
        return this;
    }

    @Override // p126x2.w
    public final t l() {
        return this.f507d;
    }

    @Override // p126x2.w
    public final b m(defpackage.d dVar) {
        Charset charset = M4.a.f3520a;
        E4.k.f("charset", charset);
        return p137z2.a.d(this, new C1136i0(charset), dVar);
    }

    @Override // p126x2.w
    public final void n() {
        this.f508e = p089q4.u.f11237h;
    }

    @Override // p126x2.w
    public final w o(t tVar) {
        Map map = t.i;
        this.f507d.putAll(AbstractC0599v0.w(tVar));
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p126x2.w
    public final w p(String str, String str2) {
        E4.k.f("value", str2);
        boolean z5 = str2 instanceof Collection;
        t tVar = this.f507d;
        if (!z5) {
            String string = str2.toString();
            tVar.getClass();
            E4.k.f("value", string);
            tVar.put(str, d0.v(string));
            return this;
        }
        Collection collection = (Collection) str2;
        ArrayList arrayList = new ArrayList(p089q4.n.P(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next()));
        }
        tVar.put(str, arrayList);
        return this;
    }

    @Override // p126x2.w
    public final URL q() {
        return this.f506c;
    }

    @Override // p126x2.w
    public final b r(AuthRequest.Deserializer deserializer, D4.f fVar) {
        return p137z2.a.e(this, deserializer, fVar);
    }

    @Override // p126x2.w
    public final w s(p084p4.h... hVarArr) {
        Map map = t.i;
        p084p4.h[] hVarArr2 = (p084p4.h[]) Arrays.copyOf(hVarArr, hVarArr.length);
        E4.k.f("pairs", hVarArr2);
        this.f507d.putAll(AbstractC0599v0.v(p089q4.k.t0(hVarArr2)));
        return this;
    }

    @Override // p126x2.w
    public final List t() {
        return this.f508e;
    }

    @Override // p126x2.w
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--> " + this.f505b + ' ' + this.f506c);
        String str = M4.u.f3549a;
        sb.append(str);
        sb.append("Body : " + this.f509f.d((String) p089q4.l.g0(get())));
        sb.append(str);
        StringBuilder sb2 = new StringBuilder("Headers : (");
        t tVar = this.f507d;
        sb2.append(tVar.f14112h.size());
        sb2.append(')');
        sb.append(sb2.toString());
        sb.append(str);
        g gVar = new g(0, sb);
        tVar.b(gVar, gVar);
        String string = sb.toString();
        E4.k.e("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }

    @Override // p126x2.y
    public final w u() {
        return this;
    }

    @Override // p126x2.w
    public final w v(InterfaceC1118a interfaceC1118a) {
        E4.k.f("body", interfaceC1118a);
        this.f509f = interfaceC1118a;
        return this;
    }

    @Override // p126x2.w
    public final Map w() {
        return this.f510g;
    }

    @Override // p126x2.w
    public final u x() {
        return this.f505b;
    }

    @Override // p126x2.w
    public final p084p4.n y() {
        Object objV;
        Object objV2;
        try {
            objV = (z) new l(this).call();
        } catch (Throwable th) {
            objV = V.v(th);
        }
        Throwable thA = p084p4.k.a(objV);
        if (thA != null) {
            int i = FuelError.i;
            URL url = this.f506c;
            E4.k.f("url", url);
            FuelError fuelErrorA = p126x2.g.a(thA, new z(url));
            return new p084p4.n(this, fuelErrorA.f7771h, new F2.a(fuelErrorA));
        }
        V.O(objV);
        z zVar = (z) objV;
        try {
            E4.k.e("rawResponse", zVar);
            objV2 = new p084p4.n(this, zVar, new F2.b(zVar.f14139f.e()));
        } catch (Throwable th2) {
            objV2 = V.v(th2);
        }
        Throwable thA2 = p084p4.k.a(objV2);
        if (thA2 != null) {
            int i3 = FuelError.i;
            E4.k.e("rawResponse", zVar);
            objV2 = new p084p4.n(this, zVar, new F2.a(p126x2.g.a(thA2, zVar)));
        }
        V.O(objV2);
        return (p084p4.n) objV2;
    }
}

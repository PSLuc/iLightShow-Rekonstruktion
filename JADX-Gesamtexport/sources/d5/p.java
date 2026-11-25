package d5;

import E4.x;
import c5.g0;
import c5.h0;
import c5.z0;
import kotlinx.serialization.json.JsonElement;
import p015c2.AbstractC0473d;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f8623a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f8624b;

    static {
        a5.e eVar = a5.e.f6360r;
        if (M4.l.i0("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object it = ((S.j) h0.f7455a.values()).iterator();
        while (((p095r4.e) it).hasNext()) {
            Y4.a aVar = (Y4.a) ((p095r4.c) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(aVar.getDescriptor().b())) {
                throw new IllegalArgumentException(M4.m.N("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + x.a(aVar.getClass()).b() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        f8624b = new g0("kotlinx.serialization.json.JsonLiteral", eVar);
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        JsonElement jsonElementF0 = G4.a.l(cVar).F0();
        if (jsonElementF0 instanceof o) {
            return (o) jsonElementF0;
        }
        throw e5.h.b(-1, "Unexpected JSON element, expected JsonLiteral, had " + x.a(jsonElementF0.getClass()), jsonElementF0.toString());
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return f8624b;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        Double dValueOf;
        o oVar = (o) obj;
        E4.k.f("value", oVar);
        G4.a.k(dVar);
        boolean z5 = oVar.f8622h;
        String str = oVar.i;
        if (z5) {
            dVar.q(str);
            return;
        }
        Long lY = M4.s.Y(str);
        if (lY != null) {
            dVar.m(lY.longValue());
            return;
        }
        p084p4.s sVarX = AbstractC0473d.X(str);
        if (sVarX != null) {
            dVar.k(z0.f7516b).m(sVarX.f10862h);
            return;
        }
        Boolean bool = null;
        try {
            M4.j jVar = M4.k.f3546a;
            jVar.getClass();
            dValueOf = jVar.f3545h.matcher(str).matches() ? Double.valueOf(Double.parseDouble(str)) : null;
        } catch (NumberFormatException unused) {
        }
        if (dValueOf != null) {
            dVar.f(dValueOf.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else if (str.equals("false")) {
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            dVar.i(bool.booleanValue());
        } else {
            dVar.q(str);
        }
    }
}

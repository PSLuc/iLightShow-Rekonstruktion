package d5;

import B.C0025m0;
import O1.B;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f8594d = new b(new i(false, false, true, "    ", "type", true, a.i), f5.a.f9006a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f8595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z2.f f8596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0025m0 f8597c = new C0025m0(28);

    public c(i iVar, Z2.f fVar) {
        this.f8595a = iVar;
        this.f8596b = fVar;
    }

    public final Object a(Y4.a aVar, String str) {
        E4.k.f("deserializer", aVar);
        E4.k.f("string", str);
        e5.o oVar = new e5.o(str);
        Object objA = new e5.l(this, e5.q.OBJ, oVar, aVar.getDescriptor()).A(aVar);
        if (oVar.e() == 10) {
            return objA;
        }
        e5.o.m(oVar, "Expected EOF after parsing, but had " + str.charAt(oVar.f8792a - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final String b(Y4.a aVar, Object obj) {
        char[] cArr;
        E4.k.f("serializer", aVar);
        K3.e eVar = new K3.e(5);
        e5.b bVar = e5.b.f8756c;
        synchronized (bVar) {
            p089q4.j jVar = (p089q4.j) bVar.f6882b;
            cArr = null;
            char[] cArr2 = (char[]) (jVar.isEmpty() ? null : jVar.removeLast());
            if (cArr2 != null) {
                bVar.f6881a -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        eVar.f2139c = cArr;
        try {
            new e5.m(new B(eVar), this, e5.q.OBJ, new e5.m[e5.q.f8804o.c()]).r(aVar, obj);
            return eVar.toString();
        } finally {
            eVar.k();
        }
    }
}

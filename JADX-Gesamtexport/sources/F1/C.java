package F1;

import B.C0017i0;
import B.C0043w;
import B.Z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U f1250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f1254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1255f;

    public C(U u6, E4.f fVar, p089q4.v vVar) {
        String str;
        E4.k.f("typeMap", vVar);
        int iC = fVar != null ? H1.c.c(p006b.a.B(fVar)) : -1;
        int i = 0;
        if (fVar != null) {
            Y4.a aVarB = p006b.a.B(fVar);
            H1.g gVar = new H1.g(aVarB, 1);
            if (aVarB instanceof Y4.c) {
                gVar.invoke();
                throw null;
            }
            H1.d dVar = new H1.d(aVarB);
            Z0 z5 = new Z0(3, dVar);
            int iE = aVarB.getDescriptor().e();
            for (int i3 = 0; i3 < iE; i3++) {
                String strF = aVarB.getDescriptor().f(i3);
                S sA = H1.c.a(aVarB.getDescriptor().k(i3), vVar);
                if (sA == null) {
                    throw new IllegalArgumentException(H1.c.g(strF, aVarB.getDescriptor().k(i3).b(), aVarB.getDescriptor().b(), "{}"));
                }
                z5.c(Integer.valueOf(i3), strF, sA);
            }
            str = ((String) dVar.f1757h) + ((String) dVar.f1758j) + ((String) dVar.f1759k);
        } else {
            str = null;
        }
        this.f1250a = u6;
        this.f1251b = iC;
        this.f1252c = str;
        this.f1253d = new LinkedHashMap();
        this.f1254e = new ArrayList();
        this.f1255f = new LinkedHashMap();
        if (fVar != null) {
            Y4.a aVarB2 = p006b.a.B(fVar);
            H1.g gVar2 = new H1.g(aVarB2, 0);
            if (aVarB2 instanceof Y4.c) {
                gVar2.invoke();
                throw null;
            }
            int iE2 = aVarB2.getDescriptor().e();
            ArrayList arrayList = new ArrayList(iE2);
            for (int i6 = 0; i6 < iE2; i6++) {
                String strF2 = aVarB2.getDescriptor().f(i6);
                C0017i0 c0017i0 = new C0017i0(aVarB2, i6, vVar, strF2);
                E4.k.f("name", strF2);
                C0092i c0092i = new C0092i();
                c0017i0.invoke(c0092i);
                C0090g c0090g = c0092i.f1348a;
                S s6 = c0090g.f1341a;
                if (s6 == null) {
                    s6 = S.f1323n;
                }
                arrayList.add(new C0089f(strF2, new C0091h(s6, c0090g.f1342b, c0090g.f1343c)));
            }
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C0089f c0089f = (C0089f) obj;
                this.f1253d.put(c0089f.f1339a, c0089f.f1340b);
            }
        }
    }

    public B a() {
        LinkedHashMap linkedHashMap;
        B b6 = b();
        b6.getClass();
        Iterator it = this.f1253d.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashMap = b6.f1246l;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            C0091h c0091h = (C0091h) entry.getValue();
            E4.k.f("argumentName", str);
            E4.k.f("argument", c0091h);
            linkedHashMap.put(str, c0091h);
        }
        ArrayList arrayList = this.f1254e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            y yVar = (y) obj;
            E4.k.f("navDeepLink", yVar);
            ArrayList arrayListV0 = p081p0.c.v0(linkedHashMap, new A(yVar, 0));
            if (!arrayListV0.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + yVar.f1388a + " can't be used to open destination " + b6 + ".\nFollowing required arguments are missing: " + arrayListV0).toString());
            }
            b6.f1244j.add(yVar);
        }
        Iterator it2 = this.f1255f.entrySet().iterator();
        if (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            ((Number) entry2.getKey()).intValue();
            if (entry2.getValue() != null) {
                throw new ClassCastException();
            }
            E4.k.f("action", null);
            throw null;
        }
        String str2 = this.f1252c;
        if (str2 != null) {
            if (M4.l.i0(str2)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String strConcat = "android-app://androidx.navigation/".concat(str2);
            E4.k.f("uriPattern", strConcat);
            ArrayList arrayListV1 = p081p0.c.v0(linkedHashMap, new A(new y(strConcat), 1));
            if (!arrayListV1.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str2 + "\" for destination " + b6 + ". Following required arguments are missing: " + arrayListV1).toString());
            }
            b6.f1249o = G4.a.z(new C0043w(14, strConcat));
            b6.f1247m = strConcat.hashCode();
            b6.f1248n = str2;
        }
        int i3 = this.f1251b;
        if (i3 != -1) {
            b6.f1247m = i3;
        }
        return b6;
    }

    public B b() {
        return this.f1250a.a();
    }
}

package H1;

import B.AbstractC0013g0;
import B.S0;
import E4.k;
import E4.x;
import F1.O;
import F1.P;
import F1.Q;
import F1.S;
import M4.l;
import M4.s;
import a5.i;
import android.os.Bundle;
import android.os.Parcelable;
import c5.K;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import p089q4.z;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f1749a = new h(true, 5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f1750b = new h(true, 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f1751c = new h(false, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f1752d = new h(true, 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f1753e = new h(true, 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f1754f = new h(true, 6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f1755g = new h(false, 7);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f1756h = new a(true);

    public static final S a(a5.g gVar, Map map) {
        Object next;
        S s6;
        boolean zEquals;
        Iterator it = map.keySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            K k3 = (K) next;
            k.f("<this>", gVar);
            k.f("kType", k3);
            if (gVar.i() != k3.f7402a.f7402a.c()) {
                zEquals = false;
            } else {
                Y4.a aVarD = p006b.a.D(f5.a.f9006a, k3);
                if (aVarD == null) {
                    throw new IllegalStateException("Custom serializers declared directly on a class field via @Serializable(with = ...) is currently not supported by safe args for both custom types and third-party types. Please use @Serializable or @Serializable(with = ...) on the class or object declaration.");
                }
                zEquals = gVar.equals(aVarD.getDescriptor());
            }
        } while (!zEquals);
        K k6 = (K) next;
        S q6 = k6 != null ? (S) map.get(k6) : null;
        if (q6 == null) {
            q6 = null;
        }
        h hVar = h.f1768r;
        if (q6 == null) {
            k.f("<this>", gVar);
            switch (AbstractC0916i.d(f(gVar))) {
                case 0:
                    s6 = S.f1312b;
                    q6 = s6;
                    break;
                case 1:
                    s6 = f1749a;
                    q6 = s6;
                    break;
                case 2:
                    s6 = S.f1320k;
                    q6 = s6;
                    break;
                case 3:
                    s6 = f1750b;
                    q6 = s6;
                    break;
                case 4:
                    s6 = f1751c;
                    q6 = s6;
                    break;
                case 5:
                    s6 = f1752d;
                    q6 = s6;
                    break;
                case 6:
                    s6 = S.f1318h;
                    q6 = s6;
                    break;
                case 7:
                    s6 = f1753e;
                    q6 = s6;
                    break;
                case 8:
                    s6 = S.f1315e;
                    q6 = s6;
                    break;
                case 9:
                    s6 = f1754f;
                    q6 = s6;
                    break;
                case 10:
                    s6 = f1755g;
                    q6 = s6;
                    break;
                case 11:
                    s6 = S.f1323n;
                    q6 = s6;
                    break;
                case 12:
                    s6 = S.f1313c;
                    q6 = s6;
                    break;
                case 13:
                    s6 = S.f1321l;
                    q6 = s6;
                    break;
                case 14:
                    s6 = f1756h;
                    q6 = s6;
                    break;
                case 15:
                    s6 = S.i;
                    q6 = s6;
                    break;
                case 16:
                    s6 = S.f1316f;
                    q6 = s6;
                    break;
                case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                    if (f(gVar.k(0)) != 11) {
                        q6 = hVar;
                    } else {
                        s6 = S.f1324o;
                        q6 = s6;
                    }
                    break;
                case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                    int iD = AbstractC0916i.d(f(gVar.k(0)));
                    if (iD == 0) {
                        s6 = S.f1314d;
                    } else if (iD == 2) {
                        s6 = S.f1322m;
                    } else if (iD == 6) {
                        s6 = S.f1319j;
                    } else if (iD == 8) {
                        s6 = S.f1317g;
                    } else if (iD != 10) {
                        q6 = hVar;
                    } else {
                        s6 = S.f1325p;
                    }
                    q6 = s6;
                    break;
                case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                    Class clsE = e(gVar);
                    if (Parcelable.class.isAssignableFrom(clsE)) {
                        q6 = new P(clsE);
                    } else if (Enum.class.isAssignableFrom(clsE)) {
                        q6 = new O(clsE);
                    } else {
                        q6 = Serializable.class.isAssignableFrom(clsE) ? new Q(clsE) : null;
                    }
                    if (q6 == null) {
                        q6 = hVar;
                    }
                    break;
                case 20:
                    Class clsE2 = e(gVar);
                    q6 = !Enum.class.isAssignableFrom(clsE2) ? hVar : new b(clsE2);
                    break;
                default:
                    q6 = hVar;
                    break;
            }
        }
        if (q6.equals(hVar)) {
            return null;
        }
        return q6;
    }

    public static final Object b(Y4.a aVar, Bundle bundle, LinkedHashMap linkedHashMap) {
        k.f("<this>", aVar);
        return aVar.deserialize(new e(bundle, linkedHashMap));
    }

    public static final int c(Y4.a aVar) {
        int iHashCode = aVar.getDescriptor().b().hashCode();
        int iE = aVar.getDescriptor().e();
        for (int i = 0; i < iE; i++) {
            iHashCode = (iHashCode * 31) + aVar.getDescriptor().f(i).hashCode();
        }
        return iHashCode;
    }

    public static final String d(Object obj, LinkedHashMap linkedHashMap) {
        k.f("route", obj);
        Y4.a aVarB = p006b.a.B(x.a(obj.getClass()));
        f fVar = new f(aVarB, linkedHashMap);
        aVarB.serialize(fVar, obj);
        Map mapX = z.X(fVar.f1766h);
        d dVar = new d(aVarB);
        S0 s1 = new S0(mapX, 2, dVar);
        int iE = aVarB.getDescriptor().e();
        for (int i = 0; i < iE; i++) {
            String strF = aVarB.getDescriptor().f(i);
            S s6 = (S) linkedHashMap.get(strF);
            if (s6 == null) {
                throw new IllegalStateException(("Cannot locate NavType for argument [" + strF + ']').toString());
            }
            s1.c(Integer.valueOf(i), strF, s6);
        }
        return ((String) dVar.f1757h) + ((String) dVar.f1758j) + ((String) dVar.f1759k);
    }

    public static final Class e(a5.g gVar) {
        String strU = s.U(gVar.b(), "?", "");
        try {
            return Class.forName(strU);
        } catch (ClassNotFoundException unused) {
            if (!l.a0(strU, ".")) {
                throw new IllegalArgumentException("Cannot find class with name \"" + gVar.b() + "\". Ensure that the serialName for this argument is the default fully qualified name");
            }
            Pattern patternCompile = Pattern.compile("(\\.+)(?!.*\\.)");
            k.e("compile(...)", patternCompile);
            String strReplaceAll = patternCompile.matcher(strU).replaceAll("\\$");
            k.e("replaceAll(...)", strReplaceAll);
            return Class.forName(strReplaceAll);
        }
    }

    public static final int f(a5.g gVar) {
        String strU = s.U(gVar.b(), "?", "");
        if (k.a(gVar.c(), i.f6373k)) {
            return gVar.i() ? 21 : 20;
        }
        if (strU.equals("kotlin.Int")) {
            return gVar.i() ? 2 : 1;
        }
        if (strU.equals("kotlin.Boolean")) {
            return gVar.i() ? 4 : 3;
        }
        if (strU.equals("kotlin.Double")) {
            return gVar.i() ? 6 : 5;
        }
        if (strU.equals("kotlin.Double")) {
            return 5;
        }
        if (strU.equals("kotlin.Float")) {
            return gVar.i() ? 8 : 7;
        }
        if (strU.equals("kotlin.Long")) {
            return gVar.i() ? 10 : 9;
        }
        if (strU.equals("kotlin.String")) {
            return gVar.i() ? 12 : 11;
        }
        if (strU.equals("kotlin.IntArray")) {
            return 13;
        }
        if (strU.equals("kotlin.DoubleArray")) {
            return 15;
        }
        if (strU.equals("kotlin.BooleanArray")) {
            return 14;
        }
        if (strU.equals("kotlin.FloatArray")) {
            return 16;
        }
        if (strU.equals("kotlin.LongArray")) {
            return 17;
        }
        if (strU.equals("kotlin.Array")) {
            return 18;
        }
        return s.W(strU, "kotlin.collections.ArrayList", false) ? 19 : 22;
    }

    public static final String g(String str, String str2, String str3, String str4) {
        StringBuilder sbO = AbstractC0013g0.o("Route ", str3, " could not find any NavType for argument ", str, " of type ");
        sbO.append(str2);
        sbO.append(" - typeMap received was ");
        sbO.append(str4);
        return sbO.toString();
    }
}

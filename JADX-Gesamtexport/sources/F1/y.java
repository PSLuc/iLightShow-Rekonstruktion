package F1;

import android.net.Uri;
import android.os.Bundle;
import com.fasterxml.jackson.databind.deser.std.d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f1386m = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f1387n = Pattern.compile("\\{(.+?)\\}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p084p4.m f1391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p084p4.m f1392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f1393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f1395h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f1396j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p084p4.m f1397k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f1398l;

    public y(String str) {
        this.f1388a = str;
        ArrayList arrayList = new ArrayList();
        this.f1389b = arrayList;
        this.f1391d = G4.a.z(new w(this, 6));
        this.f1392e = G4.a.z(new w(this, 4));
        p084p4.g gVar = p084p4.g.i;
        this.f1393f = G4.a.y(gVar, new w(this, 7));
        this.f1395h = G4.a.y(gVar, new w(this, 1));
        this.i = G4.a.y(gVar, new w(this, 0));
        this.f1396j = G4.a.y(gVar, new w(this, 3));
        this.f1397k = G4.a.z(new w(this, 2));
        G4.a.z(new w(this, 5));
        StringBuilder sb = new StringBuilder("^");
        if (!f1386m.matcher(str).find()) {
            sb.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
        matcher.find();
        boolean z5 = false;
        String strSubstring = str.substring(0, matcher.start());
        E4.k.e("substring(...)", strSubstring);
        a(strSubstring, arrayList, sb);
        if (!M4.l.a0(sb, ".*") && !M4.l.a0(sb, "([^/]+?)")) {
            z5 = true;
        }
        this.f1398l = z5;
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        String string = sb.toString();
        E4.k.e("uriRegex.toString()", string);
        this.f1390c = M4.s.U(string, ".*", "\\E.*\\Q");
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        Matcher matcher = f1387n.matcher(str);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            E4.k.d("null cannot be cast to non-null type kotlin.String", strGroup);
            arrayList.add(strGroup);
            if (matcher.start() > iEnd) {
                String strSubstring = str.substring(iEnd, matcher.start());
                E4.k.e("substring(...)", strSubstring);
                sb.append(Pattern.quote(strSubstring));
            }
            sb.append("([^/]*?|)");
            iEnd = matcher.end();
        }
        if (iEnd < str.length()) {
            String strSubstring2 = str.substring(iEnd);
            E4.k.e("substring(...)", strSubstring2);
            sb.append(Pattern.quote(strSubstring2));
        }
    }

    public static void g(Bundle bundle, String str, String str2, C0091h c0091h) {
        if (c0091h == null) {
            bundle.putString(str, str2);
            return;
        }
        S s6 = c0091h.f1344a;
        E4.k.f("key", str);
        s6.e(bundle, str, s6.c(str2));
    }

    public final int b(Uri uri) {
        if (uri == null) {
            return 0;
        }
        String str = this.f1388a;
        List<String> pathSegments = uri.getPathSegments();
        List<String> pathSegments2 = Uri.parse(str).getPathSegments();
        E4.k.e("requestedPathSegments", pathSegments);
        E4.k.e("uriPathSegments", pathSegments2);
        Set setW0 = p089q4.l.w0(pathSegments);
        setW0.retainAll(pathSegments2);
        return setW0.size();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, p4.f] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, p4.f] */
    public final ArrayList c() {
        ArrayList arrayList = this.f1389b;
        Collection collectionValues = ((Map) this.f1393f.getValue()).values();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            p089q4.r.R(arrayList2, ((C0104v) it.next()).f1383b);
        }
        return p089q4.l.j0(p089q4.l.j0(arrayList, arrayList2), (List) this.i.getValue());
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, p4.f] */
    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        E4.k.f("deepLink", uri);
        E4.k.f("arguments", linkedHashMap);
        Pattern pattern = (Pattern) this.f1391d.getValue();
        Matcher matcher = pattern != null ? pattern.matcher(uri.toString()) : null;
        if (matcher != null && matcher.matches()) {
            Bundle bundle = new Bundle();
            if (e(matcher, bundle, linkedHashMap) && (!((Boolean) this.f1392e.getValue()).booleanValue() || f(uri, bundle, linkedHashMap))) {
                String fragment = uri.getFragment();
                Pattern pattern2 = (Pattern) this.f1397k.getValue();
                Matcher matcher2 = pattern2 != null ? pattern2.matcher(String.valueOf(fragment)) : null;
                if (matcher2 != null && matcher2.matches()) {
                    List list = (List) this.i.getValue();
                    ArrayList arrayList = new ArrayList(p089q4.n.P(list, 10));
                    int i = 0;
                    for (Object obj : list) {
                        int i3 = i + 1;
                        if (i < 0) {
                            p089q4.m.O();
                            throw null;
                        }
                        String str = (String) obj;
                        String strDecode = Uri.decode(matcher2.group(i3));
                        C0091h c0091h = (C0091h) linkedHashMap.get(str);
                        try {
                            E4.k.e("value", strDecode);
                            g(bundle, str, strDecode, c0091h);
                            arrayList.add(p084p4.x.f10867a);
                            i = i3;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (p081p0.c.v0(linkedHashMap, new x(0, bundle)).isEmpty()) {
                    return bundle;
                }
            }
        }
        return null;
    }

    public final boolean e(Matcher matcher, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.f1389b;
        ArrayList arrayList2 = new ArrayList(p089q4.n.P(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            int i6 = i + 1;
            if (i < 0) {
                p089q4.m.O();
                throw null;
            }
            String str = (String) obj;
            String strDecode = Uri.decode(matcher.group(i6));
            C0091h c0091h = (C0091h) linkedHashMap.get(str);
            try {
                E4.k.e("value", strDecode);
                g(bundle, str, strDecode, c0091h);
                arrayList2.add(p084p4.x.f10867a);
                i = i6;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof y)) {
            return false;
        }
        return this.f1388a.equals(((y) obj).f1388a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, p4.f] */
    public final boolean f(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        Iterator it;
        Object objValueOf;
        boolean z5;
        String query;
        y yVar = this;
        Iterator it2 = ((Map) yVar.f1393f.getValue()).entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            String str = (String) entry.getKey();
            C0104v c0104v = (C0104v) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (yVar.f1394g && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = d0.v(query);
            }
            E4.k.e("inputParams", queryParameters);
            p084p4.x xVar = p084p4.x.f10867a;
            int i = 0;
            Bundle bundleO = p006b.a.o(new p084p4.h[0]);
            ArrayList arrayList = c0104v.f1383b;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                String str2 = (String) obj;
                C0091h c0091h = (C0091h) linkedHashMap.get(str2);
                S s6 = c0091h != null ? c0091h.f1344a : null;
                if ((s6 instanceof AbstractC0087d) && !c0091h.f1346c) {
                    s6.e(bundleO, str2, ((AbstractC0087d) s6).g());
                }
            }
            for (String str3 : queryParameters) {
                String str4 = c0104v.f1382a;
                Matcher matcher = str4 != null ? Pattern.compile(str4, 32).matcher(str3) : null;
                if (matcher == null || !matcher.matches()) {
                    return i;
                }
                ArrayList arrayList2 = c0104v.f1383b;
                ArrayList arrayList3 = new ArrayList(p089q4.n.P(arrayList2, 10));
                int size2 = arrayList2.size();
                int i6 = i;
                int i7 = i6;
                while (i7 < size2) {
                    Object obj2 = arrayList2.get(i7);
                    i7++;
                    int i8 = i;
                    int i9 = i6 + 1;
                    if (i6 < 0) {
                        p089q4.m.O();
                        throw null;
                    }
                    String str5 = (String) obj2;
                    String strGroup = matcher.group(i9);
                    if (strGroup == null) {
                        strGroup = "";
                    }
                    String str6 = strGroup;
                    C0091h c0091h2 = (C0091h) linkedHashMap.get(str5);
                    try {
                        if (bundleO.containsKey(str5)) {
                            if (bundleO.containsKey(str5)) {
                                if (c0091h2 != null) {
                                    S s7 = c0091h2.f1344a;
                                    Object objA = s7.a(str5, bundleO);
                                    it = it2;
                                    E4.k.f("key", str5);
                                    if (!bundleO.containsKey(str5)) {
                                        throw new IllegalArgumentException("There is no previous value in this bundle.");
                                    }
                                    s7.e(bundleO, str5, s7.d(str6, objA));
                                    objValueOf = xVar;
                                } else {
                                    it = it2;
                                }
                                z5 = i8;
                            } else {
                                it = it2;
                                z5 = 1;
                            }
                            try {
                                objValueOf = Boolean.valueOf(z5);
                            } catch (IllegalArgumentException unused) {
                                objValueOf = xVar;
                            }
                        } else {
                            g(bundleO, str5, str6, c0091h2);
                            it = it2;
                            objValueOf = xVar;
                        }
                    } catch (IllegalArgumentException unused2) {
                    }
                    arrayList3.add(objValueOf);
                    linkedHashMap = linkedHashMap;
                    i6 = i9;
                    it2 = it;
                    i = i8;
                }
                linkedHashMap = linkedHashMap;
            }
            bundle.putAll(bundleO);
            yVar = this;
            it2 = it2;
        }
        return true;
    }

    public final int hashCode() {
        return this.f1388a.hashCode() * 961;
    }
}

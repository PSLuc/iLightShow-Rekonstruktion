package F1;

import B.AbstractC0013g0;
import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class w extends E4.l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1384h;
    public final /* synthetic */ y i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(y yVar, int i) {
        super(0);
        this.f1384h = i;
        this.i = yVar;
    }

    /* JADX WARN: Type inference failed for: r14v16, types: [java.lang.Object, p4.f] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, p4.f] */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.lang.Object, p4.f] */
    @Override // D4.a
    public final Object invoke() {
        List list;
        switch (this.f1384h) {
            case 0:
                p084p4.h hVar = (p084p4.h) this.i.f1395h.getValue();
                return (hVar == null || (list = (List) hVar.f10849h) == null) ? new ArrayList() : list;
            case 1:
                String str = this.i.f1388a;
                if (Uri.parse(str).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String fragment = Uri.parse(str).getFragment();
                StringBuilder sb = new StringBuilder();
                E4.k.c(fragment);
                y.a(fragment, arrayList, sb);
                String string = sb.toString();
                E4.k.e("fragRegex.toString()", string);
                return new p084p4.h(arrayList, string);
            case 2:
                String str2 = (String) this.i.f1396j.getValue();
                if (str2 != null) {
                    return Pattern.compile(str2, 2);
                }
                return null;
            case 3:
                p084p4.h hVar2 = (p084p4.h) this.i.f1395h.getValue();
                if (hVar2 != null) {
                    return (String) hVar2.i;
                }
                return null;
            case 4:
                String str3 = this.i.f1388a;
                return Boolean.valueOf((str3 == null || Uri.parse(str3).getQuery() == null) ? false : true);
            case 5:
                this.i.getClass();
                return null;
            case 6:
                String str4 = this.i.f1390c;
                if (str4 != null) {
                    return Pattern.compile(str4, 2);
                }
                return null;
            default:
                y yVar = this.i;
                yVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) yVar.f1392e.getValue()).booleanValue()) {
                    String str5 = yVar.f1388a;
                    Uri uri = Uri.parse(str5);
                    for (String str6 : uri.getQueryParameterNames()) {
                        StringBuilder sb2 = new StringBuilder();
                        List<String> queryParameters = uri.getQueryParameters(str6);
                        if (queryParameters.size() > 1) {
                            throw new IllegalArgumentException(AbstractC0013g0.j("Query parameter ", str6, " must only be present once in ", str5, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                        }
                        String str7 = (String) p089q4.l.Z(queryParameters);
                        if (str7 == null) {
                            yVar.f1394g = true;
                            str7 = str6;
                        }
                        Matcher matcher = y.f1387n.matcher(str7);
                        C0104v c0104v = new C0104v();
                        int iEnd = 0;
                        while (matcher.find()) {
                            String strGroup = matcher.group(1);
                            E4.k.d("null cannot be cast to non-null type kotlin.String", strGroup);
                            c0104v.f1383b.add(strGroup);
                            E4.k.e("queryParam", str7);
                            String strSubstring = str7.substring(iEnd, matcher.start());
                            E4.k.e("substring(...)", strSubstring);
                            sb2.append(Pattern.quote(strSubstring));
                            sb2.append("(.+?)?");
                            iEnd = matcher.end();
                        }
                        if (iEnd < str7.length()) {
                            String strSubstring2 = str7.substring(iEnd);
                            E4.k.e("substring(...)", strSubstring2);
                            sb2.append(Pattern.quote(strSubstring2));
                        }
                        String string2 = sb2.toString();
                        E4.k.e("argRegex.toString()", string2);
                        c0104v.f1382a = M4.s.U(string2, ".*", "\\E.*\\Q");
                        E4.k.e("paramName", str6);
                        linkedHashMap.put(str6, c0104v);
                    }
                }
                return linkedHashMap;
        }
    }
}

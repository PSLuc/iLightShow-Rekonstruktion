package A2;

import com.fasterxml.jackson.databind.deser.std.d0;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import p084p4.h;
import p089q4.k;
import p089q4.l;
import p089q4.n;
import p089q4.r;

/* JADX INFO: loaded from: classes.dex */
public final class c implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f19h = new c();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    public static String a(List list) {
        ?? V4;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((h) obj).i != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            h hVar = (h) obj2;
            String str = (String) hVar.f10849h;
            Object obj3 = hVar.i;
            List listT0 = null;
            Iterable iterable = (Iterable) (!(obj3 instanceof Iterable) ? null : obj3);
            if (iterable != null) {
                listT0 = l.s0(iterable);
            } else {
                Object[] objArr = (Object[]) (!(obj3 instanceof Object[]) ? null : obj3);
                if (objArr != null) {
                    listT0 = k.t0(objArr);
                }
            }
            if (listT0 != null) {
                String str2 = URLEncoder.encode(str, "UTF-8") + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                V4 = new ArrayList(n.P(listT0, 10));
                Iterator it = listT0.iterator();
                while (it.hasNext()) {
                    V4.add(new h(str2, URLEncoder.encode(String.valueOf(it.next()), "UTF-8")));
                }
            } else {
                V4 = d0.v(new h(URLEncoder.encode(str, "UTF-8"), URLEncoder.encode(String.valueOf(obj3), "UTF-8")));
            }
            r.R(arrayList2, V4);
        }
        return l.e0(arrayList2, "&", null, null, a.f17h, 30);
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        D4.c cVar = (D4.c) obj;
        E4.k.f("next", cVar);
        return new b(cVar, 0);
    }
}

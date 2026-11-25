package F1;

import B.AbstractC0013g0;
import android.os.Bundle;
import com.fasterxml.jackson.databind.deser.std.d0;
import com.spotify.android.appremote.api.ContentApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@T(ContentApi.ContentType.NAVIGATION)
public class H extends U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V f1266c;

    public H(V v6) {
        E4.k.f("navigatorProvider", v6);
        this.f1266c = v6;
    }

    @Override // F1.U
    public final void d(List list, K k3) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0096m c0096m = (C0096m) it.next();
            B b6 = c0096m.i;
            E4.k.d("null cannot be cast to non-null type androidx.navigation.NavGraph", b6);
            E e6 = (E) b6;
            E4.w wVar = new E4.w();
            wVar.f1074h = c0096m.g();
            int i = e6.f1260r;
            String str = e6.f1262t;
            if (i == 0 && str == null) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i3 = e6.f1247m;
                sb.append(i3 != 0 ? String.valueOf(i3) : "the root navigation");
                throw new IllegalStateException(sb.toString().toString());
            }
            B bJ = str != null ? e6.j(str, false) : (B) e6.f1259q.c(i);
            if (bJ == null) {
                if (e6.f1261s == null) {
                    String strValueOf = e6.f1262t;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(e6.f1260r);
                    }
                    e6.f1261s = strValueOf;
                }
                String str2 = e6.f1261s;
                E4.k.c(str2);
                throw new IllegalArgumentException(AbstractC0013g0.i("navigation destination ", str2, " is not a direct child of this NavGraph"));
            }
            if (str != null) {
                if (!str.equals(bJ.f1248n)) {
                    z zVarI = bJ.i(str);
                    Bundle bundle = zVarI != null ? zVarI.i : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putAll(bundle);
                        Bundle bundle3 = (Bundle) wVar.f1074h;
                        if (bundle3 != null) {
                            bundle2.putAll(bundle3);
                        }
                        wVar.f1074h = bundle2;
                    }
                }
                LinkedHashMap linkedHashMap = bJ.f1246l;
                if (p089q4.z.X(linkedHashMap).isEmpty()) {
                    continue;
                } else {
                    ArrayList arrayListV0 = p081p0.c.v0(p089q4.z.X(linkedHashMap), new G(wVar, 0, (byte) 0));
                    if (!arrayListV0.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + bJ + ". Missing required arguments [" + arrayListV0 + ']').toString());
                    }
                }
            }
            U uB = this.f1266c.b(bJ.f1243h);
            C0100q c0100qB = b();
            Bundle bundleC = bJ.c((Bundle) wVar.f1074h);
            I i6 = c0100qB.f1376h;
            uB.d(d0.v(W2.g.h(i6.f1270a, bJ, bundleC, i6.g(), i6.f1284p)), k3);
        }
    }

    @Override // F1.U
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public E a() {
        return new E(this);
    }
}

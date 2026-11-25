package F1;

import S1.h0;
import com.nanjoran.ilightshow.Views.HomeScreenRoute;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class F extends C {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final V f1263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HomeScreenRoute f1264h;
    public final ArrayList i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(V v6, HomeScreenRoute homeScreenRoute, p089q4.v vVar) {
        super(v6.b(h0.p(H.class)), null, vVar);
        E4.k.f("provider", v6);
        E4.k.f("startDestination", homeScreenRoute);
        E4.k.f("typeMap", vVar);
        this.i = new ArrayList();
        this.f1263g = v6;
        this.f1264h = homeScreenRoute;
    }

    public final E c() {
        int iHashCode;
        E e6 = (E) super.a();
        ArrayList arrayList = this.i;
        E4.k.f("nodes", arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            B b6 = (B) obj;
            if (b6 != null) {
                int i3 = b6.f1247m;
                String str = b6.f1248n;
                if (i3 == 0 && str == null) {
                    throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                }
                String str2 = e6.f1248n;
                if (str2 != null && E4.k.a(str, str2)) {
                    throw new IllegalArgumentException(("Destination " + b6 + " cannot have the same route as graph " + e6).toString());
                }
                if (i3 == e6.f1247m) {
                    throw new IllegalArgumentException(("Destination " + b6 + " cannot have the same id as graph " + e6).toString());
                }
                p080p.F f6 = e6.f1259q;
                B b7 = (B) f6.c(i3);
                if (b7 == b6) {
                    continue;
                } else {
                    if (b6.i != null) {
                        throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                    }
                    if (b7 != null) {
                        b7.i = null;
                    }
                    b6.i = e6;
                    f6.e(b6.f1247m, b6);
                }
            }
        }
        HomeScreenRoute homeScreenRoute = this.f1264h;
        if (homeScreenRoute == null) {
            if (this.f1252c != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        Y4.a aVarB = p006b.a.B(E4.x.a(HomeScreenRoute.class));
        A2.e eVar = new A2.e(8, homeScreenRoute);
        int iC = H1.c.c(aVarB);
        B bK = e6.k(iC, e6, false);
        if (bK == null) {
            throw new IllegalStateException(("Cannot find startDestination " + aVarB.getDescriptor().b() + " from NavGraph. Ensure the starting NavDestination was added with route from KClass.").toString());
        }
        String str3 = (String) eVar.invoke(bK);
        if (str3 == null) {
            iHashCode = 0;
        } else {
            if (str3.equals(e6.f1248n)) {
                throw new IllegalArgumentException(("Start destination " + str3 + " cannot use the same route as the graph " + e6).toString());
            }
            if (M4.l.i0(str3)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            iHashCode = "android-app://androidx.navigation/".concat(str3).hashCode();
        }
        e6.f1260r = iHashCode;
        e6.f1262t = str3;
        e6.f1260r = iC;
        return e6;
    }

    public final void d(G1.j jVar) {
        this.i.add(jVar.a());
    }
}

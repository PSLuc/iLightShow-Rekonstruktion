package okhttp3.internal.connection;

import E4.k;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.Route;

/* JADX INFO: loaded from: classes.dex */
public final class RouteDatabase {
    private final Set<Route> failedRoutes = new LinkedHashSet();

    public final synchronized void connected(Route route) {
        k.f("route", route);
        this.failedRoutes.remove(route);
    }

    public final synchronized void failed(Route route) {
        k.f("failedRoute", route);
        this.failedRoutes.add(route);
    }

    public final synchronized boolean shouldPostpone(Route route) {
        k.f("route", route);
        return this.failedRoutes.contains(route);
    }
}

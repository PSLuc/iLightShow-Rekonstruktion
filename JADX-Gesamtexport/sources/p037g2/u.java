package p037g2;

import java.util.HashMap;
import java.util.Locale;
import p032f2.r;

/* JADX INFO: loaded from: classes.dex */
public final class u extends HashMap {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Locale f9164h;

    public u(Locale locale) {
        this.f9164h = locale;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        return (r) super.get(((String) obj).toLowerCase(this.f9164h));
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        return (r) super.put(((String) obj).toLowerCase(this.f9164h), (r) obj2);
    }
}

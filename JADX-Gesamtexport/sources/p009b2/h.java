package p009b2;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h extends ConcurrentHashMap {
    public static final h i = new h();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f7075h;

    public h() {
        super(180, 0.8f, 4);
        this.f7075h = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a(String str) {
        String str2 = (String) get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= 180) {
            synchronized (this.f7075h) {
                try {
                    if (size() >= 180) {
                        clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        String strIntern = str.intern();
        put(strIntern, strIntern);
        return strIntern;
    }
}

package K1;

import S1.h0;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.startup.StartupException;
import com.nanjoran.ilightshow.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f2048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f2049e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f2052c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f2051b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f2050a = new HashMap();

    public a(Context context) {
        this.f2052c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f2048d == null) {
            synchronized (f2049e) {
                try {
                    if (f2048d == null) {
                        f2048d = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f2048d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f2052c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f2051b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e6) {
                throw new StartupException(e6);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objB;
        if (h0.s()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.f2050a;
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = bVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objB = bVar.b(this.f2052c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        Trace.endSection();
        return objB;
    }
}

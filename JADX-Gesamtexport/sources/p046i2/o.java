package p046i2;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p015c2.C0471b;
import p035g0.C0715p;
import p109u2.InterfaceC0963b;

/* JADX INFO: loaded from: classes.dex */
public final class o extends q {
    public final HashMap i;

    public o(Class cls, Annotation annotation, Class cls2, Annotation annotation2) {
        HashMap map = new HashMap();
        this.i = map;
        map.put(cls, annotation);
        map.put(cls2, annotation2);
    }

    @Override // p046i2.q
    public final q a(Annotation annotation) {
        this.i.put(annotation.annotationType(), annotation);
        return this;
    }

    @Override // p046i2.q
    public final C0715p b() {
        C0715p c0715p = new C0715p(6, false);
        for (Annotation annotation : this.i.values()) {
            if (((HashMap) c0715p.i) == null) {
                c0715p.i = new HashMap();
            }
            Annotation annotation2 = (Annotation) ((HashMap) c0715p.i).put(annotation.annotationType(), annotation);
            if (annotation2 != null) {
                annotation2.equals(annotation);
            }
        }
        return c0715p;
    }

    @Override // p046i2.q
    public final InterfaceC0963b d() {
        HashMap map = this.i;
        if (map.size() != 2) {
            return new C0715p(6, map);
        }
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        Map.Entry entry2 = (Map.Entry) it.next();
        return new C0471b((Class) entry.getKey(), (Annotation) entry.getValue(), (Class) entry2.getKey(), (Annotation) entry2.getValue());
    }

    @Override // p046i2.q
    public final boolean i(Annotation annotation) {
        return this.i.containsKey(annotation.annotationType());
    }
}

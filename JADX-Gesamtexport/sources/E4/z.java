package E4;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static Collection a(Object obj) {
        if ((obj instanceof F4.a) && !(obj instanceof F4.b)) {
            f("kotlin.collections.MutableCollection", obj);
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e6) {
            k.k(e6, z.class.getName());
            throw e6;
        }
    }

    public static List b(Object obj) {
        if ((obj instanceof F4.a) && !(obj instanceof F4.c)) {
            f("kotlin.collections.MutableList", obj);
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e6) {
            k.k(e6, z.class.getName());
            throw e6;
        }
    }

    public static Map c(Object obj) {
        if ((obj instanceof F4.a) && !(obj instanceof F4.e)) {
            f("kotlin.collections.MutableMap", obj);
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e6) {
            k.k(e6, z.class.getName());
            throw e6;
        }
    }

    public static void d(int i, Object obj) {
        if (obj == null || e(i, obj)) {
            return;
        }
        f("kotlin.jvm.functions.Function" + i, obj);
        throw null;
    }

    public static boolean e(int i, Object obj) {
        int arity;
        if (obj instanceof p084p4.e) {
            if (obj instanceof h) {
                arity = ((h) obj).getArity();
            } else if (obj instanceof D4.a) {
                arity = 0;
            } else if (obj instanceof D4.c) {
                arity = 1;
            } else if (obj instanceof D4.e) {
                arity = 2;
            } else if (obj instanceof D4.f) {
                arity = 3;
            } else if (obj instanceof D4.g) {
                arity = 4;
            } else {
                boolean z5 = obj instanceof V.a;
                if (z5) {
                    arity = 5;
                } else if (z5) {
                    arity = 6;
                } else if (obj instanceof D4.h) {
                    arity = 7;
                } else if (z5) {
                    arity = 8;
                } else if (z5) {
                    arity = 9;
                } else if (z5) {
                    arity = 10;
                } else if (z5) {
                    arity = 11;
                } else if (z5) {
                    arity = 13;
                } else if (z5) {
                    arity = 14;
                } else if (z5) {
                    arity = 15;
                } else if (z5) {
                    arity = 16;
                } else if (z5) {
                    arity = 17;
                } else if (z5) {
                    arity = 18;
                } else if (z5) {
                    arity = 19;
                } else if (z5) {
                    arity = 20;
                } else {
                    arity = z5 ? 21 : -1;
                }
            }
            if (arity == i) {
                return true;
            }
        }
        return false;
    }

    public static void f(String str, Object obj) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        k.k(classCastException, z.class.getName());
        throw classCastException;
    }
}

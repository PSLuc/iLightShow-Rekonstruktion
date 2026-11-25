package p130y0;

import L0.c;
import java.lang.reflect.Method;
import p111u4.h;

/* JADX INFO: renamed from: y0.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1144m0 implements h, c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ C1144m0 f14429h = new C1144m0();
    public static final O0 i = new O0();

    public static final boolean a() {
        Class cls = r.f14451F0;
        try {
            if (r.f14451F0 == null) {
                Class<?> cls2 = Class.forName("android.os.SystemProperties");
                r.f14451F0 = cls2;
                r.f14452G0 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            }
            Method method = r.f14452G0;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}

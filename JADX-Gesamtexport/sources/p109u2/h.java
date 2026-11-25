package p109u2;

import B.AbstractC0013g0;
import java.lang.reflect.Field;
import java.util.EnumMap;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f12692e = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f12693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f12694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12696d;

    public h() {
        String string;
        Field fieldA;
        String string2;
        Field fieldA2 = null;
        try {
            fieldA = a("elementType", EnumSet.class);
            string = null;
        } catch (Exception e6) {
            string = e6.toString();
            fieldA = null;
        }
        this.f12693a = fieldA;
        this.f12695c = string;
        try {
            string2 = null;
            fieldA2 = a("keyType", EnumMap.class);
        } catch (Exception e7) {
            string2 = e7.toString();
        }
        this.f12694b = fieldA2;
        this.f12696d = string2;
    }

    public static Field a(String str, Class cls) {
        for (Field field : cls.getDeclaredFields()) {
            if (str.equals(field.getName()) && field.getType() == Class.class) {
                field.setAccessible(true);
                return field;
            }
        }
        throw new IllegalStateException(AbstractC0013g0.j("No field named '", str, "' in class '", cls.getName(), "'"));
    }
}

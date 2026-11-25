package p045i1;

import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Field f9416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Field f9417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f9418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f9419d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f9416a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f9417b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f9418c = declaredField3;
            declaredField3.setAccessible(true);
            f9419d = true;
        } catch (ReflectiveOperationException e6) {
            e6.getMessage();
        }
    }
}

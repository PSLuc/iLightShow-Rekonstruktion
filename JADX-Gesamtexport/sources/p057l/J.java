package p057l;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f9986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f9987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f9988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f9989d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f9986a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f9987b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f9988c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f9989d = true;
        } catch (NoSuchMethodException e6) {
            e6.printStackTrace();
        }
    }
}

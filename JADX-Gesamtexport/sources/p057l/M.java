package p057l;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Field f10005a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e6) {
            e6.printStackTrace();
        }
        f10005a = declaredField;
    }
}

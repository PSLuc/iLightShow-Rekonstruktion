package p057l;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes.dex */
public abstract class A0 extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f9964a = null;

    public static void a(Context context) {
        if (context.getResources() instanceof C0) {
            return;
        }
        context.getResources();
        int i = N0.f10017a;
    }
}

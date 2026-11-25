package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements K1.b {
    @Override // K1.b
    public final List a() {
        return p089q4.u.f11237h;
    }

    @Override // K1.b
    public final Object b(Context context) {
        E4.k.f("context", context);
        K1.a aVarC = K1.a.c(context);
        E4.k.e("getInstance(context)", aVarC);
        if (!aVarC.f2051b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0456p.f6996a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            E4.k.d("null cannot be cast to non-null type android.app.Application", applicationContext);
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0455o());
        }
        B b6 = B.f6939o;
        b6.getClass();
        b6.f6943l = new Handler();
        b6.f6944m.d(EnumC0453m.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        E4.k.d("null cannot be cast to non-null type android.app.Application", applicationContext2);
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new A(b6));
        return b6;
    }
}

package androidx.emoji2.text;

import K1.a;
import K1.b;
import L2.j;
import android.content.Context;
import androidx.lifecycle.C0460u;
import androidx.lifecycle.InterfaceC0458s;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p119w1.h;
import p119w1.i;
import p119w1.o;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // K1.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // K1.b
    public final Object b(Context context) {
        Object objB;
        o oVar = new o(new j(context, 2));
        oVar.f13440b = 1;
        if (h.f13416k == null) {
            synchronized (h.f13415j) {
                try {
                    if (h.f13416k == null) {
                        h.f13416k = new h(oVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        a aVarC = a.c(context);
        aVarC.getClass();
        synchronized (a.f2049e) {
            try {
                objB = aVarC.f2050a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C0460u c0460uF = ((InterfaceC0458s) objB).f();
        c0460uF.a(new i(this, c0460uF));
        return Boolean.TRUE;
    }
}

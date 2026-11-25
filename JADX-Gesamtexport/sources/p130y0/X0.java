package p130y0;

import N.AbstractC0234q;
import P4.AbstractC0336x;
import P4.D;
import P4.j0;
import R4.b;
import R4.i;
import S1.h0;
import S4.A;
import S4.F;
import S4.M;
import S4.N;
import U4.m;
import W4.d;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.nanjoran.ilightshow.R;
import java.util.LinkedHashMap;
import p076o1.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f14330a = new LinkedHashMap();

    public static final N a(Context context) {
        N n6;
        LinkedHashMap linkedHashMap = f14330a;
        synchronized (linkedHashMap) {
            try {
                Object objK = linkedHashMap.get(context);
                if (objK == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    b bVarA = i.a(-1, 0, 6);
                    A a6 = new A(new W0(contentResolver, uriFor, new a(bVarA, Handler.createAsync(Looper.getMainLooper())), bVarA, context, null));
                    j0 j0VarB = AbstractC0336x.b();
                    d dVar = D.f4604a;
                    objK = F.k(a6, new U4.d(h0.u(j0VarB, m.f5373a)), new M(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objK);
                }
                n6 = (N) objK;
            } catch (Throwable th) {
                throw th;
            }
        }
        return n6;
    }

    public static final AbstractC0234q b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC0234q) {
            return (AbstractC0234q) tag;
        }
        return null;
    }
}

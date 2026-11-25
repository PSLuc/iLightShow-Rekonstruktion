package defpackage;

import E4.f;
import E4.k;
import E4.x;
import P4.AbstractC0336x;
import P4.D;
import P4.j0;
import S1.h0;
import U4.d;
import W4.c;
import android.content.Context;
import java.lang.ref.WeakReference;
import p111u4.j;
import p114v1.e;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f12218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f12219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f12220d;

    public t(String str, f fVar, Object obj) {
        Context context;
        this.f12217a = obj;
        if (!fVar.equals(x.a(Integer.TYPE)) && !fVar.equals(x.a(Boolean.TYPE)) && !fVar.equals(x.a(String.class)) && !fVar.equals(x.a(Float.TYPE)) && !fVar.equals(x.a(Long.TYPE))) {
            throw new IllegalArgumentException("Unsupported type: " + fVar);
        }
        e eVar = new e(str);
        this.f12218b = eVar;
        c cVar = D.f4606c;
        j0 j0VarB = AbstractC0336x.b();
        cVar.getClass();
        d dVarA = AbstractC0336x.a(h0.u(cVar, j0VarB));
        this.f12220d = dVarA;
        WeakReference weakReference = u.f12606c;
        if (weakReference == null || (context = (Context) weakReference.get()) == null) {
            return;
        }
        AbstractC0336x.o(dVarA, null, new o(context, this, null), 3);
    }

    public final Object a(K4.e eVar) {
        k.f("property", eVar);
        Object obj = this.f12219c;
        if (obj != null) {
            return obj;
        }
        return AbstractC0336x.r(j.f12751h, new q(this, null));
    }

    public final void b(K4.e eVar, Object obj) {
        k.f("property", eVar);
        this.f12219c = obj;
        AbstractC0336x.o(this.f12220d, null, new s(this, obj, null), 3);
    }
}

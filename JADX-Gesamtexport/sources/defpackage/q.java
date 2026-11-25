package defpackage;

import D4.e;
import P4.InterfaceC0335w;
import S1.V;
import S4.F;
import android.content.Context;
import java.lang.ref.WeakReference;
import p084p4.x;
import p092r1.InterfaceC0886g;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class q extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11183l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f11184m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t tVar, d dVar) {
        super(2, dVar);
        this.f11184m = tVar;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new q(this.f11184m, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((q) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        Context context;
        a aVar = a.f13292h;
        int i = this.f11183l;
        if (i == 0) {
            V.O(obj);
            this.f11184m.getClass();
            WeakReference weakReference = u.f12606c;
            if (weakReference == null || (context = (Context) weakReference.get()) == null) {
                throw new IllegalStateException("Call initializeSavedState() first!");
            }
            n nVar = new n(((InterfaceC0886g) u.f12605b.a(u.f12604a[0], context)).getData(), this.f11184m, 1);
            this.f11183l = 1;
            obj = F.i(nVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
        }
        this.f11184m.f12219c = obj;
        return obj;
    }
}

package defpackage;

import D4.e;
import P4.InterfaceC0335w;
import S1.V;
import android.content.Context;
import java.lang.ref.WeakReference;
import p084p4.x;
import p092r1.InterfaceC0886g;
import p111u4.d;
import p114v1.g;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class s extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11805l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f11806m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f11807n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, Object obj, d dVar) {
        super(2, dVar);
        this.f11806m = tVar;
        this.f11807n = obj;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new s(this.f11806m, this.f11807n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((s) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        Context context;
        a aVar = a.f13292h;
        int i = this.f11805l;
        if (i == 0) {
            V.O(obj);
            t tVar = this.f11806m;
            tVar.getClass();
            WeakReference weakReference = u.f12606c;
            if (weakReference == null || (context = (Context) weakReference.get()) == null) {
                throw new IllegalStateException("Call initializeSavedState() first!");
            }
            InterfaceC0886g interfaceC0886g = (InterfaceC0886g) u.f12605b.a(u.f12604a[0], context);
            r rVar = new r(tVar, this.f11807n, null);
            this.f11805l = 1;
            if (interfaceC0886g.a(new g(rVar, null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
        }
        return x.f10867a;
    }
}

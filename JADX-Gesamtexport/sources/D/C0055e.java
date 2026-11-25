package D;

import B.F0;
import P4.AbstractC0336x;
import P4.InterfaceC0335w;
import S1.V;
import android.view.View;
import kotlin.KotlinNothingValueException;
import p130y0.N;

/* JADX INFO: renamed from: D.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0055e extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f676l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f677m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N f678n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ F0 f679o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0057g f680p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ z f681q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0055e(N n6, F0 f6, C0057g c0057g, z zVar, p111u4.d dVar) {
        super(2, dVar);
        this.f678n = n6;
        this.f679o = f6;
        this.f680p = c0057g;
        this.f681q = zVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        C0055e c0055e = new C0055e(this.f678n, this.f679o, this.f680p, this.f681q, dVar);
        c0055e.f677m = obj;
        return c0055e;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        ((C0055e) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
        return v4.a.f13292h;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f676l;
        C0057g c0057g = this.f680p;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V.O(obj);
                throw new KotlinNothingValueException();
            }
            V.O(obj);
            InterfaceC0335w interfaceC0335w = (InterfaceC0335w) this.f677m;
            B b6 = C.f644a;
            N n6 = this.f678n;
            View view = n6.f14274h;
            b6.getClass();
            x xVar = new x(view);
            D d6 = new D(n6.f14274h, new C0054d(this.f681q), xVar);
            if (C.e.f596a) {
                AbstractC0336x.o(interfaceC0335w, null, new C0053c(c0057g, xVar, null), 3);
            }
            F0 f6 = this.f679o;
            if (f6 != null) {
                f6.invoke(d6);
            }
            c0057g.f689c = d6;
            this.f676l = 1;
            n6.a(d6, this);
            return aVar;
        } catch (Throwable th) {
            c0057g.f689c = null;
            throw th;
        }
    }
}

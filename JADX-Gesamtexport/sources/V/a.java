package V;

import B.C0018j;
import B.d1;
import D4.g;
import D4.h;
import E4.k;
import E4.z;
import L.G0;
import N.C0230o;
import N.C0235q0;
import N.C0239t;
import java.util.ArrayList;
import p035g0.r;

/* JADX INFO: loaded from: classes.dex */
public final class a implements D4.e, D4.f, g, h, p084p4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5387h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f5388j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0235q0 f5389k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f5390l;

    public a(int i, Object obj, boolean z5) {
        this.f5387h = i;
        this.i = z5;
        this.f5388j = obj;
    }

    public final Object a(Float f6, r rVar, r rVar2, Float f7, Float f8, C0230o c0230o, int i) {
        c0230o.X(this.f5387h);
        g(c0230o);
        int iA = c0230o.f(this) ? b.a(2, 5) : b.a(1, 5);
        Object obj = this.f5388j;
        k.d("null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>", obj);
        z.d(7, obj);
        Object objF = ((h) obj).f(f6, rVar, rVar2, f7, f8, c0230o, Integer.valueOf(i | iA));
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new G0(this, f6, rVar, rVar2, f7, f8, i);
        }
        return objF;
    }

    public final Object b(Object obj, C0230o c0230o, int i) {
        c0230o.X(this.f5387h);
        g(c0230o);
        int iA = c0230o.f(this) ? b.a(2, 1) : b.a(1, 1);
        Object obj2 = this.f5388j;
        k.d("null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>", obj2);
        z.d(3, obj2);
        Object objC = ((D4.f) obj2).c(obj, c0230o, Integer.valueOf(iA | i));
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0018j(i, 5, this, obj);
        }
        return objC;
    }

    @Override // D4.f
    public final /* bridge */ /* synthetic */ Object c(Object obj, Object obj2, Object obj3) {
        return b(obj, (C0230o) obj2, ((Number) obj3).intValue());
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        C0230o c0230o = (C0230o) obj;
        int iIntValue = ((Number) obj2).intValue();
        c0230o.X(this.f5387h);
        g(c0230o);
        int iA = iIntValue | (c0230o.f(this) ? b.a(2, 0) : b.a(1, 0));
        Object obj3 = this.f5388j;
        k.d("null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>", obj3);
        z.d(2, obj3);
        Object objD = ((D4.e) obj3).d(c0230o, Integer.valueOf(iA));
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            z.d(2, this);
            c0235q0T.f3780d = this;
        }
        return objD;
    }

    public final Object e(Object obj, Object obj2, C0230o c0230o, int i) {
        c0230o.X(this.f5387h);
        g(c0230o);
        int iA = c0230o.f(this) ? b.a(2, 2) : b.a(1, 2);
        Object obj3 = this.f5388j;
        k.d("null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>", obj3);
        z.d(4, obj3);
        Object objK = ((g) obj3).k(obj, obj2, c0230o, Integer.valueOf(iA | i));
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new d1(this, obj, obj2, i, 3);
        }
        return objK;
    }

    @Override // D4.h
    public final /* bridge */ /* synthetic */ Object f(Float f6, r rVar, r rVar2, Float f7, Float f8, C0230o c0230o, Integer num) {
        return a(f6, rVar, rVar2, f7, f8, c0230o, num.intValue());
    }

    public final void g(C0230o c0230o) {
        C0235q0 c0235q0Y;
        if (!this.i || (c0235q0Y = c0230o.y()) == null) {
            return;
        }
        c0230o.getClass();
        c0235q0Y.f3777a |= 1;
        if (b.d(this.f5389k, c0235q0Y)) {
            this.f5389k = c0235q0Y;
            return;
        }
        ArrayList arrayList = this.f5390l;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f5390l = arrayList2;
            arrayList2.add(c0235q0Y);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (b.d((C0235q0) arrayList.get(i), c0235q0Y)) {
                arrayList.set(i, c0235q0Y);
                return;
            }
        }
        arrayList.add(c0235q0Y);
    }

    public final void h(p084p4.e eVar) {
        if (k.a(this.f5388j, eVar)) {
            return;
        }
        boolean z5 = this.f5388j == null;
        this.f5388j = eVar;
        if (z5 || !this.i) {
            return;
        }
        C0235q0 c0235q0 = this.f5389k;
        if (c0235q0 != null) {
            C0239t c0239t = c0235q0.f3778b;
            if (c0239t != null) {
                c0239t.p(c0235q0, null);
            }
            this.f5389k = null;
        }
        ArrayList arrayList = this.f5390l;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0235q0 c0235q1 = (C0235q0) arrayList.get(i);
                C0239t c0239t2 = c0235q1.f3778b;
                if (c0239t2 != null) {
                    c0239t2.p(c0235q1, null);
                }
            }
            arrayList.clear();
        }
    }

    @Override // D4.g
    public final /* bridge */ /* synthetic */ Object k(Object obj, Object obj2, Object obj3, Object obj4) {
        return e(obj, obj2, (C0230o) obj3, ((Number) obj4).intValue());
    }
}

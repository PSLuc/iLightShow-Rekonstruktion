package B;

import F1.C0096m;
import N.InterfaceC0203a0;
import P4.InterfaceC0335w;
import android.os.Bundle;
import c5.C0495p;
import com.spotify.sdk.android.auth.LoginActivity;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import p096s.AbstractC0909d;
import p096s.C0917j;
import p112v.C1007u0;

/* JADX INFO: loaded from: classes.dex */
public final class D extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f64h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f65j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f66k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f67l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(1);
        this.f64h = i;
        this.i = obj;
        this.f65j = obj2;
        this.f66k = obj3;
        this.f67l = obj4;
    }

    /* JADX WARN: Type inference failed for: r13v23, types: [D4.a, E4.l] */
    @Override // D4.c
    public final Object invoke(Object obj) {
        boolean z5;
        Object aVar;
        switch (this.f64h) {
            case 0:
                C0036s0 c0036s0 = (C0036s0) this.i;
                if (c0036s0.b()) {
                    E4.w wVar = new E4.w();
                    C0026n c0026n = new C0026n(c0036s0.f419d, c0036s0.f434t, wVar, 2);
                    M0.x xVar = (M0.x) this.f65j;
                    M0.r rVar = xVar.f3456a;
                    rVar.g((M0.w) this.f66k, (M0.m) this.f67l, c0026n, c0036s0.f435u);
                    M0.B b6 = new M0.B(xVar, rVar);
                    xVar.f3457b.set(b6);
                    wVar.f1074h = b6;
                    c0036s0.f420e = b6;
                }
                return new C();
            case 1:
                long jLongValue = ((Number) obj).longValue();
                p126x2.w wVar2 = (p126x2.w) this.f65j;
                p126x2.v vVar = wVar2.f().f14121b;
                Long l6 = (Long) ((E4.w) this.f66k).f1074h;
                vVar.a(jLongValue, l6 != null ? l6.longValue() : jLongValue);
                HttpURLConnection httpURLConnection = (HttpURLConnection) ((WeakReference) this.f67l).get();
                ((D2.b) this.i).getClass();
                D2.b.c(wVar2, httpURLConnection);
                return p084p4.x.f10867a;
            case 2:
                long jLongValue2 = ((Number) obj).longValue();
                p126x2.w wVar3 = (p126x2.w) this.f65j;
                p126x2.v vVar2 = wVar3.f().f14120a;
                Long l7 = (Long) this.f66k;
                vVar2.a(jLongValue2, l7 != null ? l7.longValue() : jLongValue2);
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) this.f67l;
                ((D2.b) this.i).getClass();
                D2.b.c(wVar3, httpURLConnection2);
                return p084p4.x.f10867a;
            case 3:
                C0096m c0096m = (C0096m) obj;
                E4.k.f("it", c0096m);
                ((E4.s) this.i).f1070h = true;
                ((F1.I) this.f65j).a((F1.B) this.f66k, (Bundle) this.f67l, c0096m, p089q4.u.f11237h);
                return p084p4.x.f10867a;
            case 4:
                long jLongValue3 = ((Number) obj).longValue();
                N.V0 v6 = (N.V0) ((InterfaceC0203a0) this.i).getValue();
                long jLongValue4 = v6 != null ? ((Number) v6.getValue()).longValue() : jLongValue3;
                p096s.H h6 = (p096s.H) this.f65j;
                long j4 = h6.f11850c;
                P.d dVar = h6.f11848a;
                InterfaceC0335w interfaceC0335w = (InterfaceC0335w) this.f67l;
                int i = 0;
                E4.t tVar = (E4.t) this.f66k;
                if (j4 == Long.MIN_VALUE || tVar.f1071h != AbstractC0909d.h(interfaceC0335w.d())) {
                    h6.f11850c = jLongValue3;
                    int i3 = dVar.f4583j;
                    if (i3 > 0) {
                        Object[] objArr = dVar.f4582h;
                        int i6 = 0;
                        do {
                            ((p096s.E) objArr[i6]).f11838n = true;
                            i6++;
                        } while (i6 < i3);
                    }
                    tVar.f1071h = AbstractC0909d.h(interfaceC0335w.d());
                }
                float f6 = tVar.f1071h;
                if (f6 == 0.0f) {
                    int i7 = dVar.f4583j;
                    if (i7 > 0) {
                        Object[] objArr2 = dVar.f4582h;
                        do {
                            p096s.E e6 = (p096s.E) objArr2[i];
                            e6.f11835k.setValue(e6.f11836l.f12004c);
                            e6.f11838n = true;
                            i++;
                        } while (i < i7);
                    }
                } else {
                    long j6 = (long) ((jLongValue4 - h6.f11850c) / f6);
                    int i8 = dVar.f4583j;
                    if (i8 > 0) {
                        Object[] objArr3 = dVar.f4582h;
                        z5 = true;
                        int i9 = 0;
                        do {
                            p096s.E e7 = (p096s.E) objArr3[i9];
                            if (!e7.f11837m) {
                                e7.f11840p.f11849b.setValue(Boolean.FALSE);
                                if (e7.f11838n) {
                                    e7.f11838n = false;
                                    e7.f11839o = j6;
                                }
                                long j7 = j6 - e7.f11839o;
                                e7.f11835k.setValue(e7.f11836l.b(j7));
                                e7.f11837m = e7.f11836l.g(j7);
                            }
                            if (!e7.f11837m) {
                                z5 = false;
                            }
                            i9++;
                        } while (i9 < i8);
                    } else {
                        z5 = true;
                    }
                    h6.f11851d.setValue(Boolean.valueOf(!z5));
                }
                return p084p4.x.f10867a;
            case 5:
                C0917j c0917j = (C0917j) obj;
                float fFloatValue = ((Number) c0917j.f12018e.getValue()).floatValue();
                E4.t tVar2 = (E4.t) this.i;
                float f7 = fFloatValue - tVar2.f1071h;
                float fA = ((C1007u0) this.f65j).a(f7);
                tVar2.f1071h = ((Number) c0917j.f12018e.getValue()).floatValue();
                ((E4.t) this.f66k).f1071h = ((Number) c0917j.f12014a.f12137b.invoke(c0917j.f12019f)).floatValue();
                if (Math.abs(f7 - fA) > 0.5f) {
                    c0917j.i.setValue(Boolean.FALSE);
                    c0917j.f12017d.invoke();
                }
                ((C0495p) this.f67l).getClass();
                return p084p4.x.f10867a;
            default:
                p126x2.z zVar = (p126x2.z) obj;
                E4.k.f(LoginActivity.RESPONSE_KEY, zVar);
                try {
                    aVar = new F2.b(new C0024m(this, 16, zVar).invoke());
                    break;
                } catch (Exception e8) {
                    aVar = new F2.a(e8);
                }
                p126x2.x xVarF = ((p126x2.w) this.i).f();
                c1 c1Var = new c1(this, aVar, zVar, 5);
                xVarF.getClass();
                xVarF.f14131m.execute(new L2.o(c1Var));
                return p084p4.x.f10867a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public D(p126x2.w wVar, p126x2.h hVar, D4.f fVar, D4.f fVar2) {
        super(1);
        this.f64h = 6;
        this.i = wVar;
        this.f65j = hVar;
        this.f66k = (E4.l) fVar;
        this.f67l = (E4.l) fVar2;
    }
}

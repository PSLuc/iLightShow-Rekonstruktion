package C1;

import B.C0031p0;
import K.p;
import K.y;
import N.C0208d;
import N.InterfaceC0203a0;
import N.U;
import P4.InterfaceC0335w;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.RecurringDays;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p030f0.f;
import p035g0.C0715p;
import p035g0.r;
import p044i0.d;
import p096s.AbstractC0909d;
import p096s.C0907c;
import p096s.o0;
import p101t.Y;
import p117w.o;
import p124x0.F;
import p5.B;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Y, B {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f603h;

    public b(int i) {
        switch (i) {
            case 3:
                this.f603h = C0208d.K(Boolean.FALSE, U.f3673m);
                break;
            default:
                this.f603h = new LinkedHashMap();
                break;
        }
    }

    @Override // p5.B
    public InetSocketAddress c() {
        return (InetSocketAddress) this.f603h;
    }

    public abstract void h(o oVar, InterfaceC0335w interfaceC0335w);

    public void i(F f6, float f7, long j4) {
        y yVar = (y) this.f603h;
        yVar.getClass();
        boolean zIsNaN = Float.isNaN(f7);
        boolean z5 = yVar.f2031b;
        float fA = zIsNaN ? p.a(f6, z5, f6.f13862h.f()) : f6.y(f7);
        float fFloatValue = ((Number) ((C0907c) yVar.f2033d).c()).floatValue();
        if (fFloatValue > 0.0f) {
            long jB = r.b(fFloatValue, j4);
            if (!z5) {
                d.c0(f6, jB, fA, 0L, null, RecurringDays.RECURRING_WEEKDAYS);
                return;
            }
            p044i0.b bVar = f6.f13862h;
            float fD = f.d(bVar.f());
            float fB = f.b(bVar.f());
            C0031p0 c0031p0 = bVar.i;
            long jL = c0031p0.l();
            c0031p0.f().l();
            ((C0031p0) ((C0715p) c0031p0.i).i).f().f(0.0f, 0.0f, fD, fB, 1);
            d.c0(f6, jB, fA, 0L, null, RecurringDays.RECURRING_WEEKDAYS);
            c0031p0.f().i();
            c0031p0.x(jL);
        }
    }

    public abstract Object j();

    public abstract Object k();

    public abstract void l(o oVar);

    public abstract void m(Object obj);

    public abstract void n(o0 o0Var);

    public abstract void o();

    public b(InetSocketAddress inetSocketAddress) {
        if (inetSocketAddress != null) {
            this.f603h = inetSocketAddress;
            return;
        }
        throw new NullPointerException("Peer address must not be null");
    }

    public b(boolean z5, InterfaceC0203a0 interfaceC0203a0) {
        y yVar = new y();
        yVar.f2031b = z5;
        yVar.f2032c = interfaceC0203a0;
        yVar.f2033d = AbstractC0909d.a(0.0f);
        yVar.f2030a = new ArrayList();
        this.f603h = yVar;
    }
}

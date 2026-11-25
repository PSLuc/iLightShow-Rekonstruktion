package H3;

import N.C0208d;
import N.C0217h0;
import N.U;
import android.content.Context;
import com.nanjoran.ilightshow.Services.C0674i;
import java.util.Observable;
import java.util.Timer;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0217h0 f1780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0217h0 f1781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0217h0 f1782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0217h0 f1783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Timer f1784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f1785g;

    public d() {
        U u6 = U.f3673m;
        this.f1780b = C0208d.K(null, u6);
        this.f1781c = C0208d.K("", u6);
        a aVar = a.f1775h;
        this.f1782d = C0208d.K(aVar, u6);
        this.f1783e = C0208d.K(aVar, u6);
        this.f1785g = 4000L;
    }

    public final B3.f a() {
        return (B3.f) this.f1780b.getValue();
    }

    public long b() {
        return this.f1785g;
    }

    public final String c() {
        return (String) this.f1781c.getValue();
    }

    public abstract void d();

    public final void e() {
        C0674i c0674i = C0674i.f8401h;
        C0674i.g();
        setChanged();
        notifyObservers(this);
    }

    public final void f(B3.f fVar) {
        this.f1780b.setValue(fVar);
    }
}

package H3;

import B.C0025m0;
import android.os.Handler;
import android.os.Looper;
import com.nanjoran.ilightshow.Services.A0;
import com.nanjoran.ilightshow.Services.C0;
import com.nanjoran.ilightshow.Services.C0674i;
import com.nanjoran.ilightshow.Services.D;
import com.nanjoran.ilightshow.Services.M;
import java.util.List;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import p089q4.l;

/* JADX INFO: loaded from: classes.dex */
public final class k extends d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f1799j = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1800h;
    public OkHttpClient i;

    @Override // H3.d
    public final void d() {
        try {
            h();
        } catch (Exception e6) {
            e6.toString();
        }
    }

    public final void g(C3.b bVar) {
        B3.f fVarA;
        List listA;
        C3.c cVar;
        String str;
        C3.d dVarA = bVar.a();
        Boolean boolC = bVar.c();
        if (boolC != null ? boolC.booleanValue() : false) {
            this.f1800h = 0;
        } else {
            int i = this.f1800h + 1;
            this.f1800h = i;
            if (i > 100) {
                this.f1800h = 0;
                M.f8305O.M(false);
            }
        }
        String strC = c();
        this.f1781c.setValue(E4.k.a(bVar.c(), Boolean.TRUE) ? "playing" : "stopped");
        if (dVarA != null) {
            String strE = dVarA.e();
            B3.f fVarA2 = a();
            if (fVarA2 == null || (((str = fVarA2.f556a) != null && !str.equals(strE)) || (!E4.k.a(strC, c()) && E4.k.a(c(), "playing")))) {
                if (E4.k.a(strC, c()) || !E4.k.a(c(), "playing")) {
                    D[] dArr = D.f8246h;
                } else {
                    D[] dArr2 = D.f8246h;
                }
                B3.f fVar = new B3.f();
                if (fVar.f557b != null) {
                    fVar.f557b = dVarA.d();
                } else {
                    fVar.f557b = "-";
                }
                fVar.f563h = dVarA.c();
                fVar.f557b = dVarA.d();
                Integer numB = bVar.b();
                fVar.j(numB != null ? Double.valueOf(((double) numB.intValue()) / 1000.0d) : null);
                fVar.f556a = strE;
                Integer numB2 = dVarA.b();
                fVar.f559d = numB2 != null ? Double.valueOf(((double) numB2.intValue()) / 1000.0d) : null;
                C3.a aVarA = dVarA.a();
                fVar.f562g.setValue((aVarA == null || (listA = aVarA.a()) == null || (cVar = (C3.c) l.Z(listA)) == null) ? null : cVar.a());
                f(fVar);
                M.f8305O.x();
                this.f1782d.setValue(a.i);
                this.f1783e.setValue(a.f1775h);
                fVar.f();
                e();
            }
        }
        if (a() != null && (fVarA = a()) != null) {
            Integer numB3 = bVar.b();
            fVarA.j(numB3 != null ? Double.valueOf(((double) numB3.intValue()) / 1000.0d) : null);
        }
        if (E4.k.a(c(), "playing") || E4.k.a(c(), strC)) {
            return;
        }
        D[] dArr3 = D.f8246h;
        M.f8305O.f8333t = false;
        C0674i c0674i = C0674i.f8401h;
        C0674i.g();
        setChanged();
        notifyObservers(this);
    }

    public final void h() {
        C0 c6 = C0.i;
        String str = c6.f8239b;
        if (str == null) {
            new Handler(Looper.getMainLooper()).post(new A0(c6, 0));
            return;
        }
        if (M.f8305O.i()) {
            this.i.newCall(new Request.Builder().url("https://api.spotify.com/v1/me/player").addHeader("Accept", "application/json").addHeader("Authorization", "Bearer ".concat(str)).get().build()).enqueue(new C0025m0(5, this));
            return;
        }
        f(null);
        this.f1781c.setValue("stopped");
        C0674i c0674i = C0674i.f8401h;
        C0674i.g();
        setChanged();
        notifyObservers(this);
    }
}

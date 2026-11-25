package A2;

import E4.k;
import E4.l;
import L.C0179t1;
import M4.s;
import S0.j;
import X.C0390g;
import X.m;
import X.o;
import com.spotify.sdk.android.auth.LoginActivity;
import java.net.URL;
import p015c2.AbstractC0473d;
import p084p4.x;
import p126x2.w;

/* JADX INFO: loaded from: classes.dex */
public final class b extends l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f18h;
    public final /* synthetic */ D4.c i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(D4.c cVar, int i) {
        super(1);
        this.f18h = i;
        this.i = cVar;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        String str;
        int iOrdinal;
        int i;
        switch (this.f18h) {
            case 0:
                w wVar = (w) obj;
                k.f(LoginActivity.REQUEST_KEY, wVar);
                String str2 = (String) p089q4.l.g0(wVar.get());
                D4.c cVar = this.i;
                if (str2 != null && s.W(str2, "multipart/form-data", false)) {
                    return (w) cVar.invoke(wVar);
                }
                if (wVar.j().isEmpty() && (((iOrdinal = wVar.x().ordinal()) == 2 || iOrdinal == 3 || iOrdinal == 7) && (str2 == null || M4.l.i0(str2) || s.W(str2, "application/x-www-form-urlencoded", false)))) {
                    w wVarH = wVar.d("Content-Type", "application/x-www-form-urlencoded").h(c.a(wVar.t()), M4.a.f3520a);
                    wVarH.n();
                    return (w) cVar.invoke(wVarH);
                }
                URL urlQ = wVar.q();
                String strA = c.a(wVar.t());
                if (strA.length() != 0) {
                    String externalForm = urlQ.toExternalForm();
                    k.e("toExternalForm()", externalForm);
                    if (M4.l.Z(externalForm, '?')) {
                        String query = urlQ.getQuery();
                        k.e("query", query);
                        str = query.length() > 0 ? "&" : "";
                    } else {
                        str = "?";
                    }
                    urlQ = new URL(urlQ.toExternalForm() + str + strA);
                }
                wVar.e(urlQ);
                wVar.n();
                return (w) cVar.invoke(wVar);
            case 1:
                long j4 = ((C0179t1) obj).f2920a;
                this.i.invoke(new J4.a(C0179t1.b(j4), C0179t1.a(j4)));
                return x.f10867a;
            case 2:
                m mVar = (m) obj;
                synchronized (o.f5709b) {
                    i = o.f5711d;
                    o.f5711d = i + 1;
                }
                return new C0390g(i, mVar, this.i);
            case 3:
                long j6 = ((j) obj).f4896a;
                return new j(AbstractC0473d.b(((Number) this.i.invoke(Integer.valueOf((int) (j6 >> 32)))).intValue(), (int) (j6 & 4294967295L)));
            default:
                long j7 = ((j) obj).f4896a;
                return new j(AbstractC0473d.b(((Number) this.i.invoke(Integer.valueOf((int) (j7 >> 32)))).intValue(), (int) (j7 & 4294967295L)));
        }
    }
}

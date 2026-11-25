package E3;

import M4.s;
import com.spotify.sdk.android.auth.AccountsQueryParameters;
import java.util.Iterator;
import java.util.List;
import p089q4.m;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f1027h = m.M("NL71", "NL72", "NL73", "NL75");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p110u3.c("name")
    @p110u3.a
    private String f1028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p110u3.c("serialNo")
    @p110u3.a
    private String f1029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p110u3.c("manufacturer")
    @p110u3.a
    private String f1030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p110u3.c("firmwareVersion")
    @p110u3.a
    private String f1031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p110u3.c("model")
    @p110u3.a
    private String f1032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p110u3.c(AccountsQueryParameters.STATE)
    @p110u3.a
    private l f1033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p110u3.c("panelLayout")
    @p110u3.a
    private i f1034g;

    public final String a() {
        return this.f1032e;
    }

    public final String b() {
        return this.f1028a;
    }

    public final i c() {
        return this.f1034g;
    }

    public final boolean d() {
        List list;
        String str = this.f1032e;
        if (str != null && ((list = f1027h) == null || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (s.W(str, (String) it.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }
}

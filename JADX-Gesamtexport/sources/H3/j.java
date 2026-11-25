package H3;

import B.C0025m0;
import B.C0031p0;
import com.nanjoran.ilightshow.Services.M;
import com.nanjoran.ilightshow.Services.z0;
import java.util.Date;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes.dex */
public final class j extends d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f1793n = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f1794h = 1000;
    public final OkHttpClient i = new OkHttpClient();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f1795j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1796k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f1797l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f1798m;

    public j() {
        new Date();
    }

    public static final void g(j jVar) {
        C0031p0 c0031p0;
        String str;
        C0031p0 c0031p1;
        jVar.getClass();
        if (M.f8305O.i()) {
            F3.a aVar = z0.f8505f.f8509c;
            String str2 = null;
            if ((aVar != null ? aVar.f1406b : null) != null) {
                if (aVar != null && (c0031p1 = aVar.f1406b) != null) {
                    str2 = (String) c0031p1.i;
                }
                if (str2 == null || aVar == null || (c0031p0 = aVar.f1406b) == null || (str = (String) c0031p0.i) == null) {
                    return;
                }
                jVar.i.newCall(new Request.Builder().url("http://" + str + ":1400/MediaRenderer/AVTransport/Control").addHeader("Content-Type", "text/html").addHeader("SOAPAction", "urn:schemas-upnp-org:service:AVTransport:1#GetPositionInfo").post(RequestBody.Companion.create(z0.f8506g, "<s:Envelope xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\" s:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\"><s:Body><u:GetPositionInfo xmlns:u=\"urn:schemas-upnp-org:service:AVTransport:1\"><InstanceID>0</InstanceID></u:GetPositionInfo></s:Body></s:Envelope>")).build()).enqueue(new C0025m0(4, jVar));
            }
        }
    }

    @Override // H3.d
    public final long b() {
        return this.f1794h;
    }

    @Override // H3.d
    public final void d() {
        C0031p0 c0031p0;
        String str;
        C0031p0 c0031p1;
        z0 z0Var = z0.f8505f;
        if (z0Var.f8509c == null || !M.f8305O.i()) {
            return;
        }
        String strC = c();
        F3.a aVar = z0Var.f8509c;
        String str2 = null;
        if ((aVar != null ? aVar.f1406b : null) != null) {
            if (aVar != null && (c0031p1 = aVar.f1406b) != null) {
                str2 = (String) c0031p1.i;
            }
            if (str2 == null || aVar == null || (c0031p0 = aVar.f1406b) == null || (str = (String) c0031p0.i) == null) {
                return;
            }
            this.i.newCall(new Request.Builder().url("http://" + str + ":1400/MediaRenderer/AVTransport/Control").addHeader("Content-Type", "text/html").addHeader("SOAPAction", "urn:schemas-upnp-org:service:AVTransport:1#GetTransportInfo").post(RequestBody.Companion.create(z0.f8506g, "<s:Envelope xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\" s:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\"><s:Body><u:GetTransportInfo xmlns:u=\"urn:schemas-upnp-org:service:AVTransport:1\"><InstanceID>0</InstanceID></u:GetTransportInfo></s:Body></s:Envelope>")).build()).enqueue(new C0031p0(this, strC, this, 4));
        }
    }
}

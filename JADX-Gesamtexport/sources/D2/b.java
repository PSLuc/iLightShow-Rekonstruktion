package D2;

import B.C0043w;
import B.D;
import B2.e;
import B2.q;
import E2.c;
import E4.k;
import M4.l;
import S1.V;
import com.github.kittinunf.fuel.core.FuelError;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.spotify.sdk.android.auth.LoginActivity;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.NoWhenBranchMatchedException;
import p015c2.AbstractC0473d;
import p089q4.m;
import p089q4.n;
import p126x2.InterfaceC1118a;
import p126x2.d;
import p126x2.g;
import p126x2.r;
import p126x2.s;
import p126x2.t;
import p126x2.u;
import p126x2.w;
import p126x2.z;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f759b = m.M("gzip", "deflate; q=0.5");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f760a;

    public static void c(w wVar, HttpURLConnection httpURLConnection) {
        k.f("$this$isCancelled", wVar);
        String str = B2.b.f490e;
        w wVarU = wVar.u();
        k.f(LoginActivity.REQUEST_KEY, wVarU);
        Object obj = wVarU.w().get(B2.b.f490e);
        if (!(obj instanceof B2.b)) {
            obj = null;
        }
        B2.b bVar = (B2.b) obj;
        boolean zIsCancelled = bVar != null ? bVar.f494d.isCancelled() : false;
        if (!zIsCancelled) {
            Thread threadCurrentThread = Thread.currentThread();
            k.e("Thread.currentThread()", threadCurrentThread);
            if (!threadCurrentThread.isInterrupted()) {
                return;
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        throw new InterruptedException("[HttpClient] could not ensure Request was active: cancelled=" + zIsCancelled);
    }

    public final Object a(w wVar, q qVar) throws Throwable {
        p111u4.k kVar = new p111u4.k(AbstractC0473d.F(qVar), v4.a.i);
        try {
            kVar.g(b(wVar));
        } catch (IOException e6) {
            this.f760a.getClass();
            k.f(LoginActivity.REQUEST_KEY, wVar);
            int i = FuelError.i;
            kVar.g(V.v(g.a(e6, new z(wVar.q()))));
        } catch (InterruptedException e7) {
            int i3 = FuelError.i;
            kVar.g(V.v(g.a(e7, new z(wVar.q()))));
        }
        Object objB = kVar.b();
        v4.a aVar = v4.a.f13292h;
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:98:0x029b  */
    public final z b(w wVar) throws IOException {
        Long l6;
        OutputStream bufferedOutputStream;
        int i = 1;
        URLConnection uRLConnectionOpenConnection = wVar.q().openConnection();
        if (uRLConnectionOpenConnection == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        c(wVar, httpURLConnection);
        httpURLConnection.setConnectTimeout(Math.max(wVar.f().f14122c, 0));
        httpURLConnection.setReadTimeout(Math.max(wVar.f().f14123d, 0));
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            httpsURLConnection.setSSLSocketFactory(wVar.f().f14128j);
            httpsURLConnection.setHostnameVerifier(wVar.f().f14129k);
        }
        wVar.f().getClass();
        u uVarX = wVar.x();
        if (uVarX == u.PATCH) {
            uVarX = u.POST;
        }
        httpURLConnection.setRequestMethod(uVarX.f14118h);
        if (wVar.x().f14118h.equals("PATCH")) {
            httpURLConnection.setRequestProperty("X-HTTP-Method-Override", wVar.x().f14118h);
        }
        httpURLConnection.setDoInput(true);
        wVar.f().getClass();
        httpURLConnection.setUseCaches(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        wVar.l().b(new a(httpURLConnection, 0), new a(httpURLConnection, 1));
        Map map = t.i;
        httpURLConnection.setRequestProperty("TE", AbstractC0599v0.i(new s("TE"), f759b));
        this.f760a.getClass();
        switch (wVar.x()) {
            case GET:
            case HEAD:
            case OPTIONS:
            case TRACE:
                httpURLConnection.setDoOutput(false);
                break;
            case POST:
            case PUT:
            case DELETE:
            case PATCH:
                httpURLConnection.setDoOutput(true);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        InterfaceC1118a interfaceC1118aJ = wVar.j();
        InputStream bufferedInputStream = null;
        if (!httpURLConnection.getDoOutput()) {
            httpURLConnection = httpURLConnection;
        } else if (interfaceC1118aJ.isEmpty()) {
            httpURLConnection.setFixedLengthStreamingMode(0L);
            httpURLConnection = httpURLConnection;
        } else {
            Long lC = interfaceC1118aJ.c();
            if (lC == null || lC.longValue() == -1) {
                httpURLConnection.setChunkedStreamingMode(4096);
            } else {
                httpURLConnection.setFixedLengthStreamingMode(lC.longValue());
            }
            if (wVar.f().f14120a.f14119h.isEmpty()) {
                bufferedOutputStream = httpURLConnection.getOutputStream();
            } else {
                if ((lC != null ? lC.longValue() : -1L) > 0) {
                    k.c(lC);
                    l6 = lC;
                } else {
                    l6 = null;
                }
                OutputStream outputStream = httpURLConnection.getOutputStream();
                k.e("connection.outputStream", outputStream);
                c cVar = new c(outputStream, new D(this, wVar, l6, httpURLConnection, 2));
                p126x2.m mVar = r.f14095p;
                mVar.getClass();
                mVar.getClass();
                bufferedOutputStream = new BufferedOutputStream(cVar, ((r) r.f14094o.n(p126x2.m.f14087a[0], mVar)).f14099d);
            }
            k.e("outputStream", bufferedOutputStream);
            interfaceC1118aJ.b(bufferedOutputStream);
            httpURLConnection.getOutputStream().flush();
        }
        httpURLConnection.connect();
        c(wVar, httpURLConnection);
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        k.e("connection.headerFields", headerFields);
        t tVarW = AbstractC0599v0.w(headerFields);
        Iterable iterable = (Iterable) tVarW.get("Transfer-Encoding");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            p089q4.r.R(arrayList, l.u0((String) it.next(), new char[]{','}));
        }
        ArrayList arrayList2 = new ArrayList(n.P(arrayList, 10));
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            String str = (String) obj;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            arrayList2.add(l.B0(str).toString());
        }
        String str2 = (String) p089q4.l.g0((Iterable) tVarW.get("Content-Encoding"));
        E4.w wVar2 = new E4.w();
        String str3 = (String) p089q4.l.g0((Iterable) tVarW.get("Content-Length"));
        wVar2.f1074h = str3 != null ? Long.valueOf(Long.parseLong(str3)) : null;
        wVar.f().getClass();
        boolean z5 = (str2 == null || str2.equals("identity")) ? false : true;
        if (z5) {
            tVarW.remove("Content-Encoding");
            tVarW.remove("Content-Length");
            wVar2.f1074h = null;
        }
        tVarW.remove("Transfer-Encoding");
        if (!arrayList2.isEmpty()) {
            int size2 = arrayList2.size();
            int i6 = 0;
            while (true) {
                if (i6 < size2) {
                    Object obj2 = arrayList2.get(i6);
                    i6 += i;
                    int i7 = i;
                    String str4 = (String) obj2;
                    if (l.i0(str4) || str4.equals("identity")) {
                        i = i7;
                    } else {
                        tVarW.remove("Content-Length");
                        wVar2.f1074h = -1L;
                    }
                }
            }
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (inputStream != null) {
                bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192);
            }
        } catch (IOException unused) {
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                bufferedInputStream = errorStream instanceof BufferedInputStream ? (BufferedInputStream) errorStream : new BufferedInputStream(errorStream, 8192);
            }
        }
        E2.a aVar = E2.a.f1007h;
        if (bufferedInputStream != null) {
            int size3 = arrayList2.size();
            int i8 = 0;
            while (i8 < size3) {
                Object obj3 = arrayList2.get(i8);
                i8++;
                bufferedInputStream = p081p0.c.X(bufferedInputStream, (String) obj3, aVar);
            }
            if (bufferedInputStream == null) {
                bufferedInputStream = new ByteArrayInputStream(new byte[0]);
            }
        } else {
            bufferedInputStream = new ByteArrayInputStream(new byte[0]);
        }
        if (z5 && str2 != null) {
            bufferedInputStream = p081p0.c.X(bufferedInputStream, str2, aVar);
        }
        E2.b bVar = new E2.b(bufferedInputStream, new D(this, wVar, wVar2, new WeakReference(httpURLConnection), 1));
        URL urlQ = wVar.q();
        Long l7 = (Long) wVar2.f1074h;
        long jLongValue = l7 != null ? l7.longValue() : -1L;
        int responseCode = httpURLConnection.getResponseCode();
        String responseMessage = httpURLConnection.getResponseMessage();
        if (responseMessage == null) {
            responseMessage = "";
        }
        String str5 = responseMessage;
        C0043w c0043w = new C0043w(8, bVar);
        C0043w c0043w2 = new C0043w(9, wVar2);
        Charset charset = M4.a.f3520a;
        k.f("charset", charset);
        return new z(urlQ, responseCode, str5, tVarW, jLongValue, new e(c0043w, c0043w2, charset));
    }

    public final z d(w wVar) throws FuelError {
        k.f(LoginActivity.REQUEST_KEY, wVar);
        try {
            return b(wVar);
        } catch (IOException e6) {
            this.f760a.getClass();
            int i = FuelError.i;
            throw g.a(e6, new z(wVar.q()));
        } catch (InterruptedException e7) {
            int i3 = FuelError.i;
            throw g.a(e7, new z(wVar.q()));
        }
    }
}

package J2;

import B.C0031p0;
import E4.k;
import E4.l;
import K2.i;
import K2.n;
import N.InterfaceC0203a0;
import N3.C0263f;
import O1.g;
import R2.m;
import S1.h0;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.google.firebase.encoders.EncodingException;
import com.spotify.android.appremote.api.Connector;
import com.spotify.protocol.client.ErrorCallback;
import defpackage.f;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.ref.WeakReference;
import java.net.ConnectException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal.Util;
import p005a4.AbstractC0394b;
import p034f4.x;
import p035g0.C0715p;
import p084p4.h;
import p089q4.z;
import p094r3.e;
import v5.o;
import v5.p;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements U3.a, T2.a, ErrorCallback, p029f.b, EventListener.Factory, U3.b, U3.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1911h;
    public final /* synthetic */ Object i;

    public /* synthetic */ b(int i, Object obj) {
        this.f1911h = i;
        this.i = obj;
    }

    @Override // p029f.b
    public void a(Object obj) {
        ((D4.c) ((InterfaceC0203a0) this.i).getValue()).invoke(obj);
    }

    @Override // U3.b
    public Object apply(Object obj) {
        switch (this.f1911h) {
            case 13:
                o oVar = (o) this.i;
                k.f("p0", obj);
                return (Long) oVar.invoke(obj);
            case 14:
            case 15:
            default:
                o oVar2 = (o) this.i;
                k.f("p0", obj);
                return (u5.a) oVar2.invoke(obj);
            case 16:
                o oVar3 = (o) this.i;
                k.f("p0", obj);
                return (u5.a) oVar3.invoke(obj);
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                o oVar4 = (o) this.i;
                k.f("p0", obj);
                return (u5.a) oVar4.invoke(obj);
        }
    }

    public c b(C0031p0 c0031p0) throws IOException {
        d dVar = (d) this.i;
        boolean zIsLoggable = Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 4);
        URL url = (URL) c0031p0.i;
        if (zIsLoggable) {
            String.format("Making request to: %s", url);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(dVar.f1921g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.8 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) c0031p0.f395k;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    C0715p c0715p = dVar.f1915a;
                    i iVar = (i) c0031p0.f394j;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    p094r3.d dVar2 = (p094r3.d) c0715p.i;
                    e eVar = new e(bufferedWriter, dVar2.f11767a, dVar2.f11768b, dVar2.f11769c, dVar2.f11770d);
                    eVar.e(iVar);
                    eVar.g();
                    eVar.f11772b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 4)) {
                        String.format("Status Code: %d", numValueOf);
                    }
                    h0.j("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    h0.j("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new c(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new c(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            c cVar = new c(responseCode, null, n.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f2121a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return cVar;
                        } catch (Throwable th) {
                            if (gZIPInputStream == null) {
                                throw th;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        if (inputStream == null) {
                            throw th3;
                        }
                        try {
                            inputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (outputStream == null) {
                    throw th7;
                }
                try {
                    outputStream.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (EncodingException | IOException unused) {
            Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 6);
            return new c(400, null, 0L);
        } catch (ConnectException | UnknownHostException unused2) {
            Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 6);
            return new c(500, null, 0L);
        }
    }

    public void c() {
        l lVar = (l) this.i;
        synchronized (X.o.f5709b) {
            try {
                List list = (List) X.o.f5714g;
                k.f("<this>", list);
                ArrayList arrayList = new ArrayList(p089q4.n.P(list, 10));
                boolean z5 = false;
                for (Object obj : list) {
                    boolean z6 = true;
                    if (!z5 && k.a(obj, lVar)) {
                        z5 = true;
                        z6 = false;
                    }
                    if (z6) {
                        arrayList.add(obj);
                    }
                }
                X.o.f5714g = arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        return Util.m145asFactory$lambda8((EventListener) this.i, call);
    }

    public void d(g gVar) {
        Purchase purchase = (Purchase) this.i;
        k.f("billingResult", gVar);
        if (gVar.f4493a == 0) {
            ArrayList arrayListA = purchase.a();
            int size = arrayListA.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListA.get(i);
                i++;
                String str = (String) obj;
                WeakReference weakReference = f.f8806a;
                String strOptString = purchase.f7529c.optString("orderId");
                if (TextUtils.isEmpty(strOptString)) {
                    strOptString = null;
                }
                if (strOptString == null) {
                    strOptString = "";
                }
                f.c("iap", str, z.T(new h("orderId", strOptString)), 20);
            }
        }
    }

    @Override // U3.a
    public void e(Object obj) {
        switch (this.f1911h) {
            case 1:
                ((defpackage.d) this.i).invoke(obj);
                break;
            case 11:
                ((v5.i) this.i).invoke(obj);
                break;
            case 12:
                ((v5.i) this.i).invoke(obj);
                break;
            case 14:
                ((p) this.i).invoke(obj);
                break;
            case 15:
                ((p) this.i).invoke(obj);
                break;
            default:
                ((C0263f) this.i).invoke(obj);
                break;
        }
    }

    @Override // T2.a
    public Object execute() {
        int i = 3;
        Object obj = this.i;
        switch (this.f1911h) {
            case 2:
                S2.h hVar = (S2.h) ((S2.c) obj);
                hVar.getClass();
                int i3 = O2.a.f4544e;
                H1.d dVar = new H1.d();
                dVar.i = null;
                dVar.f1758j = new ArrayList();
                dVar.f1759k = null;
                dVar.f1757h = "";
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseB = hVar.b();
                sQLiteDatabaseB.beginTransaction();
                try {
                    O2.a aVar = (O2.a) S2.h.D(sQLiteDatabaseB.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new Q2.a(hVar, map, dVar, i));
                    sQLiteDatabaseB.setTransactionSuccessful();
                    return aVar;
                } finally {
                    sQLiteDatabaseB.endTransaction();
                }
            case 3:
                S2.h hVar2 = (S2.h) ((S2.d) obj);
                Integer num = (Integer) hVar2.k(new S2.e(hVar2, hVar2.i.d() - hVar2.f5004k.f4992d));
                num.getClass();
                return num;
            case 4:
                S2.h hVar3 = (S2.h) ((R2.l) obj).i;
                SQLiteDatabase sQLiteDatabaseB2 = hVar3.b();
                sQLiteDatabaseB2.beginTransaction();
                try {
                    sQLiteDatabaseB2.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseB2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar3.i.d()).execute();
                    sQLiteDatabaseB2.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseB2.endTransaction();
                }
            default:
                m mVar = (m) obj;
                SQLiteDatabase sQLiteDatabaseB3 = ((S2.h) mVar.f4798b).b();
                sQLiteDatabaseB3.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseB3.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                    try {
                        ArrayList arrayList = new ArrayList();
                        while (cursorRawQuery.moveToNext()) {
                            C0031p0 c0031p0A = L2.i.a();
                            c0031p0A.t(cursorRawQuery.getString(1));
                            c0031p0A.f395k = V2.a.b(cursorRawQuery.getInt(2));
                            String string = cursorRawQuery.getString(3);
                            c0031p0A.f394j = string == null ? null : Base64.decode(string, 0);
                            arrayList.add(c0031p0A.b());
                            break;
                        }
                        cursorRawQuery.close();
                        sQLiteDatabaseB3.setTransactionSuccessful();
                        sQLiteDatabaseB3.endTransaction();
                        int size = arrayList.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj2 = arrayList.get(i6);
                            i6++;
                            mVar.f4799c.a((L2.i) obj2, 1, false);
                        }
                        return null;
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    sQLiteDatabaseB3.endTransaction();
                    throw th2;
                }
        }
    }

    public void f(AbstractC0394b abstractC0394b) throws SocketException {
        S3.c cVar;
        v5.h hVarA;
        y5.e eVar = (y5.e) this.i;
        k.f("this$0", eVar);
        DatagramSocket datagramSocket = new DatagramSocket((SocketAddress) null);
        datagramSocket.setReuseAddress(true);
        datagramSocket.bind(new InetSocketAddress(eVar.f14600a));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1024);
        byteBufferAllocate.clear();
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        DatagramPacket datagramPacket = new DatagramPacket(byteBufferAllocate.array(), 1024);
        R3.l lVar = p061l4.f.f10387c;
        p067m4.b bVar = eVar.f14602c;
        bVar.getClass();
        int i = R3.a.f4801h;
        W3.b.a("scheduler is null", lVar);
        W3.b.b(i, "bufferSize");
        Y3.b bVar2 = new Y3.b(new b(21, new C0263f(eVar, 4, datagramSocket)));
        try {
            if (lVar instanceof x) {
                bVar.e(bVar2);
            } else {
                bVar.e(new p017c4.c(bVar2, lVar.a(), i));
            }
            eVar.f14603d = true;
            S3.c cVar2 = new S3.c(1, new y5.d(eVar, datagramSocket));
            loop0: while (true) {
                cVar = abstractC0394b.i;
                S3.b bVar3 = (S3.b) cVar.get();
                if (bVar3 == V3.a.f5508h) {
                    cVar2.a();
                    break;
                }
                do {
                    if (cVar.compareAndSet(bVar3, cVar2)) {
                        if (bVar3 == null) {
                            break loop0;
                        }
                        bVar3.a();
                        break loop0;
                    }
                } while (cVar.get() == bVar3);
            }
            while (!cVar.b()) {
                try {
                    try {
                        int iPosition = byteBufferAllocate.position();
                        byteBufferAllocate.mark();
                        datagramSocket.receive(datagramPacket);
                        int length = datagramPacket.getLength();
                        while (length >= 36) {
                            byteBufferAllocate.mark();
                            short s6 = byteBufferAllocate.getShort(byteBufferAllocate.position());
                            short s7 = byteBufferAllocate.getShort(byteBufferAllocate.position() + 32);
                            if (length >= s6 && (hVarA = eVar.f14601b.a(byteBufferAllocate, s7)) != null) {
                                InetAddress address = datagramPacket.getAddress();
                                k.e("getAddress(...)", address);
                                abstractC0394b.c(new y5.b(hVarA, address));
                            }
                            if (byteBufferAllocate.position() == length + iPosition) {
                                byteBufferAllocate.clear();
                            }
                            length -= s6;
                        }
                    } catch (IOException e6) {
                        if (!cVar.b()) {
                            abstractC0394b.d(e6);
                        }
                        eVar.f14603d = false;
                        V3.a.b(bVar2);
                        datagramSocket.disconnect();
                        return;
                    } catch (Exception e7) {
                        if (!cVar.b()) {
                            abstractC0394b.d(e7);
                        }
                        eVar.f14603d = false;
                        V3.a.b(bVar2);
                        datagramSocket.disconnect();
                        return;
                    }
                } catch (Throwable th) {
                    eVar.f14603d = false;
                    V3.a.b(bVar2);
                    datagramSocket.disconnect();
                    throw th;
                }
            }
            eVar.f14603d = false;
            V3.a.b(bVar2);
            datagramSocket.disconnect();
        } catch (NullPointerException e8) {
            throw e8;
        } catch (Throwable th2) {
            p027e3.a.w0(th2);
            G4.a.A(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    @Override // com.spotify.protocol.client.ErrorCallback
    public void onError(Throwable th) {
        ((Connector.ConnectionListener) this.i).onFailure(th);
    }

    @Override // U3.c
    public boolean test(Object obj) {
        o oVar = (o) this.i;
        k.f("p0", obj);
        return ((Boolean) oVar.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(D4.e eVar) {
        this.f1911h = 6;
        this.i = (l) eVar;
    }
}

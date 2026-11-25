package I1;

import B.C0025m0;
import B.C0031p0;
import E4.u;
import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Looper;
import android.util.LongSparseArray;
import android.widget.Toast;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.nanjoran.ilightshow.Services.AbstractC0698y;
import com.nanjoran.ilightshow.Services.C0;
import com.nanjoran.ilightshow.Services.C0691q;
import com.nanjoran.ilightshow.Services.U;
import com.nanjoran.ilightshow.Services.z0;
import com.nanjoran.outpost.outpost.Client;
import com.nanjoran.outpost.outpost.Outpost;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import okhttp3.Request;
import okhttp3.RequestBody;
import p012c.C0469g;
import p012c.D;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1838h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1839j;

    public /* synthetic */ g(Context context, u uVar) {
        this.f1838h = 5;
        this.f1839j = context;
        this.i = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List listS0;
        int i = 0;
        switch (this.f1838h) {
            case 0:
                ((ProfileInstallerInitializer) this.i).getClass();
                k.a(Looper.getMainLooper()).postDelayed(new h((Context) this.f1839j, i), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 1:
                int i3 = JobInfoSchedulerService.f7773h;
                ((JobInfoSchedulerService) this.i).jobFinished((JobParameters) this.f1839j, false);
                return;
            case 2:
                ((I0.d) this.i).h((Typeface) this.f1839j);
                return;
            case 3:
                p007b0.a.a((p007b0.c) this.i, (LongSparseArray) this.f1839j);
                return;
            case 4:
                p012c.n nVar = (p012c.n) this.i;
                E4.k.f("this$0", nVar);
                D d6 = (D) this.f1839j;
                int i6 = p012c.n.f7155A;
                nVar.f7156h.a(new C0469g(d6, nVar));
                return;
            case 5:
                Context context = (Context) this.f1839j;
                u uVar = (u) this.i;
                try {
                    E4.k.c(context);
                    Client clientNewClient = Outpost.newClient(AbstractC0698y.b(context));
                    clientNewClient.setListener(C0691q.i);
                    clientNewClient.start();
                    synchronized (U.f8367b) {
                        try {
                            if (U.f8368c && uVar.f1072h == U.f8372g) {
                                U.f8369d = clientNewClient;
                                ArrayList arrayList = U.f8373h;
                                listS0 = p089q4.l.s0(arrayList);
                                arrayList.clear();
                            } else {
                                clientNewClient.stop();
                                ArrayList arrayList2 = U.f8373h;
                                listS0 = p089q4.l.s0(arrayList2);
                                arrayList2.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Iterator it = listS0.iterator();
                    while (it.hasNext()) {
                        ((p111u4.d) it.next()).g(Boolean.valueOf(U.f8369d == clientNewClient));
                    }
                    return;
                } catch (Exception unused) {
                    U.f8370e = Outpost.StateFailed;
                    U.f8371f = null;
                    synchronized (U.f8367b) {
                        U.f8368c = false;
                        ArrayList arrayList3 = U.f8373h;
                        List listS1 = p089q4.l.s0(arrayList3);
                        arrayList3.clear();
                        Iterator it2 = listS1.iterator();
                        while (it2.hasNext()) {
                            ((p111u4.d) it2.next()).g(Boolean.FALSE);
                        }
                        return;
                    }
                }
            case 6:
                CountDownLatch countDownLatch = (CountDownLatch) this.f1839j;
                E4.k.f("$latch", countDownLatch);
                Client client = (Client) this.i;
                if (client != null) {
                    try {
                        client.stop();
                    } finally {
                        countDownLatch.countDown();
                    }
                    break;
                }
                return;
            case 7:
                z0 z0Var = (z0) this.i;
                E4.k.f("this$0", z0Var);
                C0031p0 c0031p0 = (C0031p0) this.f1839j;
                z0Var.f8507a.newCall(new Request.Builder().url("http://" + ((String) c0031p0.i) + ":1400/ZoneGroupTopology/Control").addHeader("Content-Type", "text/html").addHeader("SOAPAction", "urn:schemas-upnp-org:service:ZoneGroupTopology:1#GetZoneGroupState").post(RequestBody.Companion.create(z0.f8506g, "<s:Envelope xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\" s:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\"><s:Body><u:GetZoneGroupState xmlns:u=\"urn:schemas-upnp-org:service:AVTransport:1\"><InstanceID>0</InstanceID></u:GetZoneGroupState></s:Body></s:Envelope>")).build()).enqueue(new C0025m0(26, z0Var));
                return;
            default:
                C0 c6 = (C0) this.i;
                E4.k.f("this$0", c6);
                Toast.makeText(c6.f8238a, ((String) this.f1839j).equals("access_denied") ? "Spotify login was cancelled." : "Spotify replied with an error.", 0).show();
                return;
        }
    }

    public /* synthetic */ g(Object obj, int i, Object obj2) {
        this.f1838h = i;
        this.i = obj;
        this.f1839j = obj2;
    }
}

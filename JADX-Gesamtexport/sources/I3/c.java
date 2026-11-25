package I3;

import E4.k;
import M4.l;
import M4.s;
import P4.AbstractC0314a;
import P4.AbstractC0336x;
import P4.D;
import P4.c0;
import P4.i0;
import com.fasterxml.jackson.databind.deser.std.d0;
import com.nanjoran.ilightshow.Services.z0;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p111u4.i;
import p111u4.j;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f1859f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DatagramSocket f1860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Thread f1861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f1862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f1863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f1864e;

    static {
        c cVar = new c();
        cVar.f1863d = new ArrayList();
        cVar.f1864e = "M-SEARCH * HTTP/1.1\r\nHOST: 239.255.255.250:reservedSSDPport\r\nMAN: \"ssdp:discover\"\r\nMX: 1\r\nST: ssdp:all\r\n";
        f1859f = cVar;
    }

    public final void a(d dVar) {
        if (!this.f1863d.contains(dVar)) {
            this.f1863d.add(dVar);
        }
        if (this.f1860a == null) {
            try {
                DatagramSocket datagramSocket = new DatagramSocket((SocketAddress) null);
                this.f1860a = datagramSocket;
                datagramSocket.setReuseAddress(true);
                DatagramSocket datagramSocket2 = this.f1860a;
                if (datagramSocket2 != null) {
                    datagramSocket2.setBroadcast(true);
                }
                DatagramSocket datagramSocket3 = this.f1860a;
                if (datagramSocket3 != null) {
                    datagramSocket3.bind(new InetSocketAddress(1905));
                }
            } catch (Exception e6) {
                DatagramSocket datagramSocket4 = this.f1860a;
                if (datagramSocket4 != null) {
                    datagramSocket4.close();
                }
                this.f1860a = null;
                this.f1861b = null;
                z0 z0Var = z0.f8505f;
                e6.toString();
                e6.printStackTrace();
            }
        }
        if (this.f1861b == null) {
            this.f1862c = true;
            Thread thread = new Thread(new a(0, this));
            this.f1861b = thread;
            thread.start();
        }
        b bVar = new b(this, null);
        int i = 3 & 1;
        j jVar = j.f12751h;
        j jVar2 = i != 0 ? jVar : null;
        int i3 = (3 & 2) != 0 ? 1 : 4;
        i iVarG = AbstractC0336x.g(jVar, jVar2, true);
        W4.d dVar2 = D.f4604a;
        if (iVarG != dVar2 && iVarG.J(p111u4.e.f12750h) == null) {
            iVarG = iVarG.o(dVar2);
        }
        if (i3 == 0) {
            throw null;
        }
        AbstractC0314a c0Var = i3 == 2 ? new c0(iVarG, bVar) : new i0(iVarG, true);
        c0Var.f0(i3, c0Var, bVar);
    }

    public final void b(String str) {
        List<String> listV;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pattern patternCompile = Pattern.compile("\r\n");
            k.e("compile(...)", patternCompile);
            int i = 0;
            l.r0(0);
            Matcher matcher = patternCompile.matcher(str);
            if (matcher.find()) {
                ArrayList arrayList = new ArrayList(10);
                int iEnd = 0;
                do {
                    arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
                    iEnd = matcher.end();
                } while (matcher.find());
                arrayList.add(str.subSequence(iEnd, str.length()).toString());
                listV = arrayList;
            } else {
                listV = d0.v(str.toString());
            }
            for (String str2 : listV) {
                String str3 = (String) p089q4.l.Z(l.s0(str2, new String[]{": "}, true, 2));
                if (str3 != null) {
                    linkedHashMap.put(str3, s.U(str2, str3 + ": ", ""));
                }
            }
            String str4 = (String) linkedHashMap.get("LOCATION");
            if (str4 != null) {
                try {
                    String host = new URI(str4).getHost();
                    if (host != null) {
                        e eVar = new e();
                        eVar.f1865a = host;
                        eVar.f1866b = linkedHashMap;
                        ArrayList arrayList2 = this.f1863d;
                        int size = arrayList2.size();
                        while (i < size) {
                            Object obj = arrayList2.get(i);
                            i++;
                            ((d) obj).ssdpDidDiscover(eVar);
                        }
                    }
                } catch (Exception e6) {
                    e6.toString();
                }
            }
        } catch (Exception e7) {
            e7.toString();
        }
    }
}

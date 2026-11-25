package p000a;

import B.AbstractC0013g0;
import B.C0031p0;
import D4.f;
import E4.k;
import F2.c;
import J4.b;
import M4.l;
import N3.M0;
import N3.R0;
import c5.C0495p;
import com.fasterxml.jackson.databind.deser.std.d0;
import com.nanjoran.ilightshow.Services.M;
import com.nanjoran.ilightshow.Services.PaletteColorSource;
import com.nanjoran.ilightshow.Services.lights.hue.DeviceHueBridgeKt;
import com.nanjoran.ilightshow.Services.lights.hue.huestream.HueJsonGroup;
import com.nanjoran.ilightshow.Services.lights.hue.huestream.HueJsonStream;
import com.spotify.sdk.android.auth.AuthorizationClient;
import java.net.InetSocketAddress;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;
import m5.e;
import m5.s;
import n5.g;
import p015c2.AbstractC0473d;
import p035g0.C0715p;
import p084p4.q;
import p084p4.x;
import p089q4.n;
import p089q4.w;
import p096s.AbstractC0916i;
import p105t3.m;
import p106t4.a;
import p126x2.r;
import p126x2.u;
import p126x2.z;
import p5.EnumC0843h;
import p5.e0;
import p5.x0;
import q5.i;
import q5.v;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f6098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Thread f6099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f6100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f6101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f6102h;
    public Set i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Set f6103j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f6104k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Semaphore f6105l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashMap f6106m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HashMap f6107n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0031p0 f6108o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final W2.g f6109p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f6110q;

    public j(String str, String str2, String str3) {
        k.f("ip", str);
        k.f("username", str2);
        this.f6095a = str;
        this.f6096b = str2;
        this.f6097c = str3;
        this.f6102h = true;
        w wVar = w.f11239h;
        this.i = wVar;
        this.f6103j = wVar;
        this.f6105l = new Semaphore(1, true);
        this.f6106m = new HashMap();
        this.f6107n = new HashMap();
        this.f6109p = new W2.g(19);
        a aVar = new a(new R0(3, this));
        aVar.start();
        this.f6100f = aVar;
        this.f6110q = 20;
    }

    public static boolean a(Semaphore semaphore) {
        try {
            semaphore.acquire();
            return true;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public static boolean c(String str, String str2, String str3) {
        Semaphore semaphore = new Semaphore(0, true);
        r unsafeFuel = DeviceHueBridgeKt.getUnsafeFuel();
        u uVar = u.DELETE;
        StringBuilder sbO = AbstractC0013g0.o("https://", str, "/api/", str2, "/groups/");
        sbO.append(str3);
        unsafeFuel.b(uVar, sbO.toString(), null).g(new M0(3, semaphore));
        return a(semaphore);
    }

    public static HueJsonGroup[] e(String str, String str2) {
        Semaphore semaphore = new Semaphore(0, true);
        E4.w wVar = new E4.w();
        p137z2.a.e(DeviceHueBridgeKt.getUnsafeFuel().b(u.GET, AbstractC0013g0.j("https://", str, "/api/", str2, "/groups"), null), new h(new m(), 1), new com.nanjoran.ilightshow.Services.lights.hue.a(wVar, semaphore, 3));
        if (a(semaphore)) {
            return (HueJsonGroup[]) wVar.f1074h;
        }
        return null;
    }

    public static List f(int i, int i3) {
        byte[] bArrCopyOf;
        boolean zA = k.a(ByteOrder.nativeOrder(), ByteOrder.LITTLE_ENDIAN);
        byte[] bArrCopyOf2 = new byte[0];
        if (i == 0) {
            bArrCopyOf2 = Arrays.copyOf(bArrCopyOf2, 1);
            bArrCopyOf2[0] = (byte) i;
        } else {
            while (i != 0) {
                int length = bArrCopyOf2.length;
                bArrCopyOf2 = Arrays.copyOf(bArrCopyOf2, length + 1);
                bArrCopyOf2[length] = (byte) i;
                i >>>= 8;
            }
        }
        byte b6 = (byte) 0;
        byte[] bArrCopyOf3 = new byte[0];
        int length2 = 4 - bArrCopyOf2.length;
        for (int i6 = 0; i6 < length2; i6++) {
            int length3 = bArrCopyOf3.length;
            bArrCopyOf3 = Arrays.copyOf(bArrCopyOf3, length3 + 1);
            bArrCopyOf3[length3] = b6;
        }
        if (zA) {
            if (bArrCopyOf2.length != 0) {
                byte[] bArr = new byte[bArrCopyOf2.length];
                int length4 = bArrCopyOf2.length - 1;
                if (length4 >= 0) {
                    int i7 = 0;
                    while (true) {
                        bArr[length4 - i7] = bArrCopyOf2[i7];
                        if (i7 == length4) {
                            break;
                        }
                        i7++;
                    }
                }
                bArrCopyOf2 = bArr;
            }
            int length5 = bArrCopyOf3.length;
            int length6 = bArrCopyOf2.length;
            bArrCopyOf = Arrays.copyOf(bArrCopyOf3, length5 + length6);
            System.arraycopy(bArrCopyOf2, 0, bArrCopyOf, length5, length6);
            k.c(bArrCopyOf);
        } else {
            int length7 = bArrCopyOf3.length;
            int length8 = bArrCopyOf2.length;
            bArrCopyOf = Arrays.copyOf(bArrCopyOf3, length7 + length8);
            System.arraycopy(bArrCopyOf2, 0, bArrCopyOf, length7, length8);
            k.c(bArrCopyOf);
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(AbstractC0013g0.f(i3, "Requested element count ", " is less than zero.").toString());
        }
        p089q4.u uVar = p089q4.u.f11237h;
        if (i3 == 0) {
            return uVar;
        }
        int length9 = bArrCopyOf.length;
        if (i3 < length9) {
            if (i3 == 1) {
                return d0.v(Byte.valueOf(bArrCopyOf[length9 - 1]));
            }
            ArrayList arrayList = new ArrayList(i3);
            for (int i8 = length9 - i3; i8 < length9; i8++) {
                arrayList.add(Byte.valueOf(bArrCopyOf[i8]));
            }
            return arrayList;
        }
        int length10 = bArrCopyOf.length;
        if (length10 == 0) {
            return uVar;
        }
        if (length10 == 1) {
            return d0.v(Byte.valueOf(bArrCopyOf[0]));
        }
        ArrayList arrayList2 = new ArrayList(bArrCopyOf.length);
        for (byte b7 : bArrCopyOf) {
            arrayList2.add(Byte.valueOf(b7));
        }
        return arrayList2;
    }

    public static boolean i(long j4) {
        try {
            Thread.sleep(j4);
            return true;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public final void b() {
        String str;
        HueJsonGroup hueJsonGroup;
        HueJsonGroup hueJsonGroup2;
        String strD;
        Set setX0;
        if (j()) {
            return;
        }
        boolean zN = M.f8305O.n();
        HueJsonGroup[] hueJsonGroupArrE = e(this.f6095a, this.f6096b);
        if (hueJsonGroupArrE == null || j()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (HueJsonGroup hueJsonGroup3 : hueJsonGroupArrE) {
            String name = hueJsonGroup3.getName();
            if (name != null && l.a0(name, "iLightShow#")) {
                arrayList.add(hueJsonGroup3);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            HueJsonGroup hueJsonGroup4 = (HueJsonGroup) obj;
            if (j() || !c(this.f6095a, this.f6096b, hueJsonGroup4.getId())) {
                return;
            }
        }
        if (!this.i.isEmpty() && zN && M.f8305O.i()) {
            int length = hueJsonGroupArrE.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    hueJsonGroup2 = null;
                    break;
                }
                hueJsonGroup2 = hueJsonGroupArrE[i3];
                if (k.a(hueJsonGroup2.getName(), "iLightShow") && k.a(hueJsonGroup2.getType(), "Entertainment")) {
                    break;
                } else {
                    i3++;
                }
            }
            if (hueJsonGroup2 != null) {
                strD = hueJsonGroup2.getId();
                Set set = this.i;
                String[] lights = hueJsonGroup2.getLights();
                if (lights != null) {
                    ArrayList arrayList2 = new ArrayList(lights.length);
                    for (String str2 : lights) {
                        arrayList2.add(new q(AbstractC0473d.V(str2)));
                    }
                    setX0 = p089q4.l.x0(arrayList2);
                } else {
                    setX0 = null;
                }
                if (set.equals(setX0)) {
                    this.f6103j = this.i;
                } else {
                    String str3 = this.f6095a;
                    String str4 = this.f6096b;
                    Set set2 = this.i;
                    ArrayList arrayList3 = new ArrayList(n.P(set2, 10));
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(Integer.toUnsignedString(((q) it.next()).f10860h));
                    }
                    strD = d(str3, str4, arrayList3, strD);
                    if (j()) {
                        return;
                    }
                }
            } else {
                String str5 = this.f6095a;
                String str6 = this.f6096b;
                Set set3 = this.i;
                ArrayList arrayList4 = new ArrayList(n.P(set3, 10));
                Iterator it2 = set3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(Integer.toUnsignedString(((q) it2.next()).f10860h));
                }
                strD = d(str5, str6, arrayList4, null);
                if (j()) {
                    return;
                }
            }
            str = strD;
        } else {
            str = null;
        }
        if (j()) {
            return;
        }
        int length2 = hueJsonGroupArrE.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length2) {
                hueJsonGroup = null;
                break;
            }
            hueJsonGroup = hueJsonGroupArrE[i6];
            HueJsonStream stream = hueJsonGroup.getStream();
            if (stream != null ? k.a(stream.getActive(), Boolean.TRUE) : false) {
                break;
            } else {
                i6++;
            }
        }
        HueJsonStream stream2 = hueJsonGroup != null ? hueJsonGroup.getStream() : null;
        if (stream2 != null) {
            if (k.a(stream2.getOwner(), this.f6096b)) {
                return;
            }
            hueJsonGroup.getName();
            if (!h(false, this.f6095a, this.f6096b, hueJsonGroup.getId(), true) || !i(300L)) {
                return;
            }
        }
        if (str == null) {
            this.f6101g = false;
            Thread thread = this.f6099e;
            if (thread != null) {
                thread.interrupt();
            }
            this.f6099e = null;
            return;
        }
        if (h(true, this.f6095a, this.f6096b, str, true) && i(300L)) {
            Thread thread2 = this.f6099e;
            if (thread2 == null || !thread2.isAlive()) {
                this.f6101g = true;
                Thread thread3 = new Thread(new I3.a(5, this));
                this.f6099e = thread3;
                thread3.start();
            }
        }
    }

    public final String d(String str, String str2, final ArrayList arrayList, final String str3) {
        final E4.w wVar = new E4.w();
        wVar.f1074h = str3;
        HashMap map = new HashMap();
        map.put("name", "iLightShow");
        map.put("lights", arrayList);
        String strJ = AbstractC0013g0.j("https://", str, "/api/", str2, "/groups");
        if (str3 != null) {
            strJ = strJ + "/" + str3;
        } else {
            map.put("type", "Entertainment");
            map.put("class", "Free");
        }
        p126x2.w wVarB = DeviceHueBridgeKt.getUnsafeFuel().b(str3 == null ? u.POST : u.PUT, strJ, null);
        String strK = new m().k(map, new e().getType());
        p120w2.a.f13456b.getClass();
        if (strK == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        p126x2.w wVarC = p137z2.a.c(wVarB, strK);
        final Semaphore semaphore = new Semaphore(0, true);
        String strK2 = new m().k(map, new f().getType());
        if (strK2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        p137z2.a.c(wVarC, strK2);
        p137z2.a.e(wVarC, new h(new m(), 0), new f() { // from class: a.b
            /* JADX WARN: Code duplicated, block: B:10:0x003a  */
            @Override // D4.f
            public final Object c(Object obj, Object obj2, Object obj3) {
                Object obj4;
                c cVar = (c) obj3;
                E4.w wVar2 = wVar;
                j jVar = this;
                k.f("this$0", jVar);
                ArrayList arrayList2 = arrayList;
                Semaphore semaphore2 = semaphore;
                k.f("<unused var>", (p126x2.w) obj);
                k.f("<unused var>", (z) obj2);
                k.f("result", cVar);
                HashMap[] mapArr = (HashMap[]) cVar.a();
                int i = 0;
                if (mapArr == null) {
                    obj4 = null;
                } else {
                    HashMap map2 = mapArr.length == 0 ? null : mapArr[0];
                    if (map2 != null) {
                        obj4 = map2.get("success");
                    } else {
                        obj4 = null;
                    }
                }
                Map map3 = obj4 instanceof Map ? (Map) obj4 : null;
                String str4 = map3 != null ? (String) map3.get(AuthorizationClient.PlayStoreParams.ID) : null;
                if (str4 == null) {
                    str4 = str3;
                }
                wVar2.f1074h = str4;
                ArrayList arrayList3 = new ArrayList(n.P(arrayList2, 10));
                int size = arrayList2.size();
                while (i < size) {
                    Object obj5 = arrayList2.get(i);
                    i++;
                    arrayList3.add(new q(AbstractC0473d.V((String) obj5)));
                }
                jVar.f6103j = p089q4.l.x0(arrayList3);
                semaphore2.release();
                return x.f10867a;
            }
        });
        return !a(semaphore) ? str3 : (String) wVar.f1074h;
    }

    public final void g(String str, int i, int i3, int i6, double d6) {
        Semaphore semaphore = this.f6105l;
        k.f("lightId", str);
        try {
            try {
                semaphore.acquire();
                int iV = AbstractC0473d.V(str);
                if (d6 == 0.0d) {
                    this.f6106m.put(new q(iV), new c(i, i3, i6));
                    this.f6107n.remove(new q(iV));
                } else {
                    q qVar = new q(iV);
                    HashMap map = this.f6107n;
                    d dVar = new d();
                    dVar.f6090a = i;
                    dVar.f6091b = i3;
                    dVar.f6092c = i6;
                    dVar.f6093d = d6;
                    map.put(qVar, dVar);
                }
                semaphore.release();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                if (0 != 0) {
                    semaphore.release();
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                semaphore.release();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [a.a] */
    public final boolean h(boolean z5, String str, String str2, String str3, final boolean z6) {
        AbstractC0916i abstractC0916i;
        int i;
        String str4;
        Class cls;
        q5.w wVarA;
        ArrayList arrayList;
        List list;
        x0 x0Var;
        int i3;
        int i6;
        int i7 = 6;
        final Semaphore semaphore = new Semaphore(0, true);
        r unsafeFuel = DeviceHueBridgeKt.getUnsafeFuel();
        u uVar = u.PUT;
        int i8 = 4;
        int i9 = 1;
        StringBuilder sbO = AbstractC0013g0.o("https://", str, "/api/", str2, "/groups/");
        sbO.append(str3);
        p137z2.a.c(unsafeFuel.b(uVar, sbO.toString(), null), "{\"stream\":{\"active\":" + z5 + "}}").i(new f() { // from class: a.a
            @Override // D4.f
            public final Object c(Object obj, Object obj2, Object obj3) {
                Semaphore semaphore2 = semaphore;
                k.f("<unused var>", (p126x2.w) obj);
                k.f("<unused var>", (z) obj2);
                k.f("<unused var>", (c) obj3);
                if (z6) {
                    semaphore2.release();
                }
                return x.f10867a;
            }
        });
        if (z6 && !a(semaphore)) {
            return false;
        }
        if (!z5) {
            return true;
        }
        this.f6098d = str3;
        g gVar = this.f6104k;
        this.f6104k = null;
        if (gVar != null) {
            gVar.v();
        }
        String str5 = this.f6097c;
        byte[] bArr = new byte[str5.length() / 2];
        b bVarC0 = p081p0.c.C0(p081p0.c.D0(0, str5.length()), 2);
        int i10 = bVarC0.f1941h;
        int i11 = bVarC0.i;
        int i12 = bVarC0.f1942j;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (true) {
                bArr[i10 >> 1] = (byte) ((l.f0("0123456789ABCDEF", str5.charAt(i10), 0, 6) << 4) | l.f0("0123456789ABCDEF", str5.charAt(i10 + 1), 0, 6));
                if (i10 == i11) {
                    break;
                }
                i10 += i12;
            }
        }
        C0715p c0715p = new C0715p(15, false);
        o5.a aVar = new o5.a();
        c0715p.i = aVar;
        e0 e0Var = new e0(this.f6096b, bArr);
        aVar.f10693p = new r5.a(e0Var);
        aVar.f10692o = e0Var;
        List<i> listAsList = Arrays.asList(i.f11284p);
        if (listAsList == null) {
            throw new NullPointerException("Connector must support at least one cipher suite");
        }
        if (listAsList.isEmpty()) {
            throw new IllegalArgumentException("Connector must support at least one cipher suite");
        }
        if (listAsList.contains(i.f11286r)) {
            throw new IllegalArgumentException("NULL Cipher Suite is not supported by connector");
        }
        Boolean bool = aVar.f10677O;
        if (bool == null || bool.booleanValue()) {
            StringBuilder sb = new StringBuilder();
            for (i iVar : listAsList) {
                if (!iVar.f11295n) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(iVar.name());
                }
            }
            if (sb.length() > 0) {
                throw new IllegalStateException("Not recommended cipher suites " + ((Object) sb) + " used! (Requires to set recommendedCipherSuitesOnly to false.)");
            }
        }
        for (i iVar2 : listAsList) {
            if (!iVar2.g()) {
                throw new IllegalArgumentException("cipher-suites " + iVar2 + " is not supported by JVM!");
            }
        }
        aVar.f10696s = listAsList;
        o5.a aVar2 = (o5.a) c0715p.i;
        Boolean bool2 = aVar2.f10688k;
        if (bool2 != null && bool2.booleanValue()) {
            throw new IllegalStateException("client only is in contradiction to server only!");
        }
        if (aVar2.f10687j != null || aVar2.i != null) {
            throw new IllegalStateException("client only is in contradiction to server side client authentication!");
        }
        Boolean bool3 = aVar2.f10671E;
        if (bool3 != null && bool3.booleanValue()) {
            throw new IllegalStateException("client only is in contradiction to server side 'no server session id'!");
        }
        Boolean bool4 = Boolean.TRUE;
        aVar2.f10676N = bool4;
        o5.a aVar3 = (o5.a) c0715p.i;
        aVar3.I = s.c(aVar3.I);
        if (aVar3.f10679a == null) {
            aVar3.f10679a = new InetSocketAddress(0);
        }
        if (aVar3.f10681c == null) {
            aVar3.f10681c = Boolean.FALSE;
        }
        if (aVar3.J == null) {
            aVar3.J = bool4;
        }
        if (aVar3.f10674L == null) {
            aVar3.f10674L = bool4;
        }
        if (aVar3.f10675M == null) {
            aVar3.f10675M = bool4;
        }
        if (aVar3.f10673K == null) {
            aVar3.f10673K = bool4;
        }
        if (aVar3.f10680b == null) {
            aVar3.f10680b = bool4;
        }
        if (aVar3.f10683e == null) {
            aVar3.f10683e = 1000;
        }
        if (aVar3.f10685g == null) {
            aVar3.f10685g = 4;
        }
        if (aVar3.f10684f == null) {
            aVar3.f10684f = Integer.valueOf(aVar3.f10685g.intValue() / 2);
        }
        if (aVar3.f10682d == null) {
            aVar3.f10682d = 8192;
        }
        if (aVar3.i == null) {
            aVar3.i = Boolean.FALSE;
        }
        if (aVar3.f10676N == null) {
            aVar3.f10676N = Boolean.FALSE;
        }
        if (aVar3.f10677O == null) {
            aVar3.f10677O = bool4;
        }
        if (aVar3.f10678P == null) {
            aVar3.f10678P = bool4;
        }
        if (aVar3.f10687j == null) {
            if (aVar3.f10676N.booleanValue()) {
                aVar3.f10687j = Boolean.FALSE;
            } else {
                aVar3.f10687j = Boolean.valueOf(!aVar3.i.booleanValue());
            }
        }
        if (aVar3.f10688k == null) {
            aVar3.f10688k = Boolean.FALSE;
        }
        if (aVar3.f10689l == null) {
            if (aVar3.f10688k.booleanValue()) {
                aVar3.f10689l = "none";
            } else {
                aVar3.f10689l = PaletteColorSource.TYPE_AUTO;
            }
        }
        if (aVar3.f10671E == null) {
            aVar3.f10671E = Boolean.FALSE;
        }
        if (aVar3.f10699v == null) {
            aVar3.f10699v = 100000;
        }
        if (aVar3.f10700w == null) {
            aVar3.f10700w = 10;
        }
        if (aVar3.f10701x == null) {
            aVar3.f10701x = 8192;
        }
        if (aVar3.f10702y == null) {
            aVar3.f10702y = 150000;
        }
        if (aVar3.f10667A == null) {
            aVar3.f10667A = Integer.valueOf(o5.a.f10665Q);
        }
        if (aVar3.f10668B == null) {
            aVar3.f10668B = Integer.valueOf(o5.a.f10666R);
        }
        if (aVar3.f10703z == null) {
            aVar3.f10703z = 1800L;
        }
        if (aVar3.f10686h == null) {
            aVar3.f10686h = 1500;
        }
        if (aVar3.f10669C == null) {
            aVar3.f10669C = Boolean.FALSE;
        }
        if (aVar3.G == null) {
            aVar3.G = 0;
        }
        if (aVar3.f10672F == null) {
            aVar3.f10672F = Boolean.valueOf(aVar3.G.intValue() == 0);
        }
        if (aVar3.H == null) {
            aVar3.H = bool4;
        }
        if (aVar3.f10670D == null) {
            aVar3.f10670D = 30;
        }
        EnumC0843h enumC0843h = EnumC0843h.X_509;
        if (aVar3.f10688k.booleanValue() && !aVar3.f10687j.booleanValue() && !aVar3.i.booleanValue() && aVar3.f10691n != null) {
            throw new IllegalStateException("configured trusted certificates or certificate verifier are not used for disabled client authentication!");
        }
        List list2 = aVar3.f10696s;
        q5.f fVar = q5.f.i;
        q5.f fVar2 = q5.f.f11267j;
        if (list2 == null || list2.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            if (aVar3.f10691n != null) {
                boolean zBooleanValue = aVar3.f10677O.booleanValue();
                i iVar3 = i.f11284p;
                ArrayList arrayList3 = new ArrayList();
                i[] iVarArrValues = i.values();
                int length = iVarArrValues.length;
                abstractC0916i = null;
                int i13 = 0;
                while (i13 < length) {
                    i iVar4 = iVarArrValues[i13];
                    if (iVar4.g()) {
                        int i14 = iVar4.f11296o;
                        i = i13;
                        if (i14 == i9) {
                            str4 = "NONE";
                        } else if (i14 == 2) {
                            str4 = "DSA";
                        } else if (i14 == 3) {
                            str4 = "RSA";
                        } else {
                            if (i14 != i8) {
                                throw null;
                            }
                            str4 = "EC";
                        }
                        if (str4.equals("EC") && (!zBooleanValue || iVar4.f11295n)) {
                            arrayList3.add(iVar4);
                        }
                    } else {
                        i = i13;
                    }
                    i13 = i + 1;
                    i8 = 4;
                    i9 = 1;
                }
                arrayList2.addAll(arrayList3);
            } else {
                abstractC0916i = null;
            }
            if (aVar3.f10693p != null) {
                arrayList2.addAll(i.a(aVar3.f10677O.booleanValue(), fVar2));
                arrayList2.addAll(i.a(aVar3.f10677O.booleanValue(), fVar));
            }
            aVar3.f10696s = arrayList2;
        } else {
            abstractC0916i = null;
            i7 = 6;
        }
        if (aVar3.f10698u == null) {
            aVar3.f10698u = Collections.EMPTY_LIST;
        }
        if (aVar3.f10697t == null) {
            aVar3.f10697t = Collections.EMPTY_LIST;
        }
        if (aVar3.f10695r == null && !aVar3.f10676N.booleanValue()) {
            q5.k kVar = new q5.k();
            kVar.f11306a = true;
            aVar3.f10695r = kVar;
        }
        List list3 = aVar3.f10696s;
        if (list3 == null || list3.isEmpty()) {
            throw new IllegalStateException("Supported cipher suites must be set either explicitly or implicitly by means of setting the identity or PSK store");
        }
        for (i iVar5 : aVar3.f10696s) {
            if (!iVar5.g()) {
                throw new IllegalStateException("cipher-suites " + iVar5 + " is not supported by JVM!");
            }
        }
        List list4 = aVar3.f10691n;
        EnumC0843h enumC0843h2 = EnumC0843h.RAW_PUBLIC_KEY;
        if (list4 != null) {
            if (list4.contains(enumC0843h2)) {
                throw new IllegalStateException("rpk trust must be set for trust certificate type RAW_PUBLIC_KEY");
            }
            if (aVar3.f10691n.contains(enumC0843h)) {
                throw new IllegalStateException("trusted certificates or certificate verifier must be set for trust certificate type X_509");
            }
        }
        boolean z7 = false;
        boolean z8 = false;
        for (i iVar6 : aVar3.f10696s) {
            q5.f fVar3 = iVar6.i;
            if (fVar.equals(fVar3) || fVar2.equals(fVar3)) {
                if (aVar3.f10693p == null) {
                    throw new IllegalStateException("PSK store must be set for configured " + iVar6.name());
                }
                z7 = true;
            } else if (iVar6.i()) {
                if (!aVar3.f10676N.booleanValue()) {
                    throw new IllegalStateException("Identity must be set for configured " + iVar6.name());
                }
                if (aVar3.f10676N.booleanValue() || aVar3.f10687j.booleanValue() || aVar3.i.booleanValue()) {
                    List list5 = aVar3.f10691n;
                    if (list5 == null) {
                        throw new IllegalStateException("trust must be set for configured " + iVar6.name());
                    }
                    if (list5.contains(enumC0843h2)) {
                        throw new IllegalStateException("Raw public key trust must be set for configured " + iVar6.name());
                    }
                    if (aVar3.f10691n.contains(enumC0843h)) {
                        throw new IllegalStateException("X509 certficate trust must be set for configured " + iVar6.name());
                    }
                }
            }
            if (iVar6.f()) {
                z8 = true;
            }
        }
        if (!z7 && aVar3.f10692o != null) {
            throw new IllegalStateException("PSK store set, but no PSK cipher suite!");
        }
        if (!z7 && aVar3.f10693p != null) {
            throw new IllegalStateException("Advanced PSK store set, but no PSK cipher suite!");
        }
        if (z8) {
            if (aVar3.f10697t.isEmpty()) {
                List list6 = aVar3.f10694q;
                C0495p c0495p = x0.f11167f;
                if (list6 == null || list6.size() <= 0) {
                    arrayList = new ArrayList(x0.f11168g);
                } else {
                    PublicKey publicKey = ((X509Certificate) list6.get(0)).getPublicKey();
                    arrayList = new ArrayList(x0.f11168g);
                    if (publicKey == null || x0.c(arrayList, publicKey) != null) {
                        list = list6;
                        break;
                    }
                    int[] iArrE = AbstractC0916i.e(8);
                    int length2 = iArrE.length;
                    int i15 = 0;
                    loop4: while (true) {
                        if (i15 >= length2) {
                            list = list6;
                            break;
                        }
                        int i16 = iArrE[i15];
                        if (!AbstractC0916i.b(i16, 1)) {
                            int[] iArrE2 = AbstractC0916i.e(i7);
                            int length3 = iArrE2.length;
                            int i17 = 0;
                            while (i17 < length3) {
                                list = list6;
                                x0 x0Var2 = new x0(i16, iArrE2[i17], abstractC0916i);
                                Signature signature = (Signature) x0.d(x0Var2.f11169a).a();
                                if (signature != null) {
                                    try {
                                        signature.initVerify(publicKey);
                                        if (!arrayList.contains(x0Var2)) {
                                            arrayList.add(x0Var2);
                                            break loop4;
                                        }
                                        break loop4;
                                    } catch (InvalidKeyException unused) {
                                        continue;
                                        i17++;
                                        list6 = list;
                                        abstractC0916i = null;
                                    }
                                }
                                i17++;
                                list6 = list;
                                abstractC0916i = null;
                            }
                        }
                        i15++;
                        list6 = list6;
                        abstractC0916i = null;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String sigAlgName = ((X509Certificate) it.next()).getSigAlgName();
                        int iIndexOf = sigAlgName.indexOf("with");
                        if (iIndexOf < 0) {
                            iIndexOf = sigAlgName.indexOf("WITH");
                        }
                        if (iIndexOf > 0) {
                            String strSubstring = sigAlgName.substring(0, iIndexOf);
                            String strSubstring2 = sigAlgName.substring(iIndexOf + 4, sigAlgName.length());
                            if (strSubstring == null) {
                                throw new NullPointerException("Name is null");
                            }
                            if (strSubstring.equals("NONE")) {
                                i3 = 1;
                            } else if (strSubstring.equals("MD5")) {
                                i3 = 2;
                            } else if (strSubstring.equals("SHA1")) {
                                i3 = 3;
                            } else if (strSubstring.equals("SHA224")) {
                                i3 = 4;
                            } else if (strSubstring.equals("SHA256")) {
                                i3 = 5;
                            } else if (strSubstring.equals("SHA384")) {
                                i3 = i7;
                            } else if (strSubstring.equals("SHA512")) {
                                i3 = 7;
                            } else {
                                if (!strSubstring.equals("INTRINSIC")) {
                                    throw new IllegalArgumentException("No enum constant org.eclipse.californium.scandium.dtls.SignatureAndHashAlgorithm.HashAlgorithm.".concat(strSubstring));
                                }
                                i3 = 8;
                            }
                            if (strSubstring2 == null) {
                                throw new NullPointerException("Name is null");
                            }
                            if (strSubstring2.equals("ANONYMOUS")) {
                                i6 = 1;
                            } else if (strSubstring2.equals("RSA")) {
                                i6 = 2;
                            } else if (strSubstring2.equals("DSA")) {
                                i6 = 3;
                            } else if (strSubstring2.equals("ECDSA")) {
                                i6 = 4;
                            } else if (strSubstring2.equals("ED25519")) {
                                i6 = 5;
                            } else {
                                if (!strSubstring2.equals("ED448")) {
                                    throw new IllegalArgumentException("No enum constant org.eclipse.californium.scandium.dtls.SignatureAndHashAlgorithm.SignatureAlgorithm.".concat(strSubstring2));
                                }
                                i6 = i7;
                            }
                            if (i3 != 0 && i6 != 0) {
                                x0Var = new x0(i3, i6, null);
                            }
                            if (x0Var == null && !arrayList.contains(x0Var)) {
                                arrayList.add(x0Var);
                            }
                        }
                        x0Var = null;
                        if (x0Var == null) {
                        }
                    }
                }
                aVar3.f10697t = arrayList;
            }
            if (aVar3.f10698u.isEmpty()) {
                q5.w wVar = q5.w.secp256r1;
                ArrayList arrayList4 = new ArrayList(v.f11321b);
                List list7 = aVar3.f10694q;
                if (list7 != null) {
                    Iterator it2 = list7.iterator();
                    while (it2.hasNext()) {
                        PublicKey publicKey2 = ((X509Certificate) it2.next()).getPublicKey();
                        if (publicKey2 != null && (wVarA = q5.w.a(publicKey2)) != null && wVarA.f11329k && !arrayList4.contains(wVarA) && (!((o5.a) c0715p.i).f10678P.booleanValue() || wVarA.f11330l)) {
                            arrayList4.add(wVarA);
                        }
                    }
                }
                aVar3.f10698u = arrayList4;
            }
        } else {
            if (!aVar3.f10697t.isEmpty()) {
                throw new IllegalStateException("supported signature and hash algorithms set, but no ecdhe based cipher suite!");
            }
            if (!aVar3.f10698u.isEmpty()) {
                throw new IllegalStateException("supported groups set, but no ecdhe based cipher suite!");
            }
        }
        List list8 = aVar3.f10694q;
        if (list8 != null) {
            X509Certificate x509Certificate = (X509Certificate) list8.get(0);
            if (aVar3.f10676N.booleanValue()) {
                if (!e.a(x509Certificate, true)) {
                    throw new IllegalStateException("certificate has no proper key usage for clients!");
                }
            } else if (!aVar3.f10688k.booleanValue()) {
                if (!e.a(x509Certificate, true)) {
                    throw new IllegalStateException("certificate has no proper key usage as clients!");
                }
                if (!e.a(x509Certificate, false)) {
                    throw new IllegalStateException("certificate has no proper key usage as servers!");
                }
            } else if (!e.a(x509Certificate, false)) {
                throw new IllegalStateException("certificate has no proper key usage for servers!");
            }
        }
        List list9 = aVar3.f10698u;
        List list10 = aVar3.f10694q;
        if (list10 != null) {
            Iterator it3 = list10.iterator();
            while (it3.hasNext()) {
                PublicKey publicKey3 = ((X509Certificate) it3.next()).getPublicKey();
                q5.w wVar2 = q5.w.secp256r1;
                if ((publicKey3 instanceof ECPublicKey) || ((cls = q5.x.f11338r) != null && cls.isInstance(publicKey3))) {
                    if (publicKey3 == null) {
                        continue;
                    } else {
                        q5.w wVarA2 = q5.w.a(publicKey3);
                        if (wVarA2 == null) {
                            throw new IllegalStateException("public key used with unknown group (curve)!");
                        }
                        if (!wVarA2.f11329k) {
                            throw new IllegalStateException("public key used with unsupported group (curve) " + wVarA2.name() + "!");
                        }
                        if (!list9.contains(wVarA2)) {
                            throw new IllegalStateException("public key used with not configured group (curve) " + wVarA2.name() + "!");
                        }
                        if (((o5.a) c0715p.i).f10678P.booleanValue() && !wVarA2.f11330l) {
                            throw new IllegalStateException("public key used with unrecommended group (curve) " + wVarA2.name() + "!");
                        }
                    }
                }
            }
        }
        aVar3.f10691n = AbstractC0473d.E(aVar3.f10691n);
        aVar3.f10690m = AbstractC0473d.E(aVar3.f10690m);
        aVar3.f10696s = AbstractC0473d.E(aVar3.f10696s);
        aVar3.f10698u = AbstractC0473d.E(aVar3.f10698u);
        aVar3.f10694q = AbstractC0473d.E(aVar3.f10694q);
        aVar3.f10697t = AbstractC0473d.E(aVar3.f10697t);
        g gVar2 = new g(aVar3);
        synchronized (gVar2) {
            gVar2.t(gVar2.f10588a.f10679a);
        }
        this.f6104k = gVar2;
        this.f6108o = new C0031p0(new InetSocketAddress(this.f6095a, 2100), (String) null, new String[]{"PLAIN", ""});
        return true;
    }

    public final boolean j() {
        return !this.f6102h || Thread.currentThread().isInterrupted();
    }

    public final void k() {
        j jVar;
        String str = this.f6098d;
        if (str != null) {
            jVar = this;
            jVar.h(false, this.f6095a, this.f6096b, str, false);
        } else {
            jVar = this;
        }
        jVar.f6098d = null;
        jVar.f6101g = false;
        Thread thread = jVar.f6099e;
        if (thread != null) {
            thread.interrupt();
        }
        jVar.f6099e = null;
        g gVar = jVar.f6104k;
        jVar.f6104k = null;
        if (gVar != null) {
            gVar.v();
        }
    }
}

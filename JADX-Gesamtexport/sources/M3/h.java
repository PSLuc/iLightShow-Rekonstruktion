package M3;

import D3.j;
import E4.k;
import android.graphics.Color;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.internal.http2.Settings;
import p089q4.l;
import p089q4.n;
import p089q4.w;

/* JADX INFO: loaded from: classes.dex */
public final class h extends j {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final OkHttpClient f3510u;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f3511l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Integer f3512m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Integer f3513n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f3514o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public c f3516q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public E3.g f3517r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public DatagramSocket f3518s;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public K3.b f3515p = K3.b.i;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f3519t = new ArrayList();

    static {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f3510u = builder.connectTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).readTimeout(30L, timeUnit).build();
    }

    public static final void j(ArrayList arrayList, boolean z5, int i, int i3, int i6, int i7, int i8) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        byte[] bArrArray = byteBufferAllocate.order(byteOrder).putShort((short) i3).array();
        arrayList.add(Byte.valueOf(bArrArray[0]));
        arrayList.add(Byte.valueOf(bArrArray[1]));
        double d6 = z5 ? 0.15d : 0.0d;
        double d7 = z5 ? 0.4d : 0.0d;
        arrayList.add(Byte.valueOf((byte) G4.a.I(i6, d6, 255)));
        arrayList.add(Byte.valueOf((byte) G4.a.I(i7, d6, 255)));
        arrayList.add(Byte.valueOf((byte) G4.a.I(i8, d6, 255)));
        arrayList.add(Byte.valueOf((byte) 0));
        byte[] bArrArray2 = ByteBuffer.allocate(2).order(byteOrder).putShort((short) G4.a.I(i, d7, Settings.DEFAULT_INITIAL_WINDOW_SIZE)).array();
        arrayList.add(Byte.valueOf(bArrArray2[0]));
        arrayList.add(Byte.valueOf(bArrArray2[1]));
    }

    @Override // D3.j
    public final void a(D3.d dVar) {
        Set setX0;
        boolean z5;
        Integer numA;
        Integer numA2;
        Integer numA3;
        int i = 2;
        int i3 = dVar.f768b;
        D3.h hVar = this.f806h;
        double d6 = hVar != null ? hVar.f791f : 1.0d;
        double dMin = Math.min(((double) dVar.f771e) / 255.0d, d6);
        D3.a aVar = dVar.f767a;
        k.c(aVar);
        int iHSVToColor = Color.HSVToColor(new float[]{aVar.f761a / 182.04166f, aVar.f762b / 255.0f, aVar.f763c / 255.0f});
        float fRed = Color.red(iHSVToColor);
        float fGreen = Color.green(iHSVToColor);
        float fBlue = Color.blue(iHSVToColor);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f3519t);
        ArrayList arrayList3 = dVar.f770d ? new ArrayList((Collection) G4.a.F(arrayList2, d6).f10849h) : new ArrayList((Collection) G4.a.F(arrayList2, dMin).f10849h);
        if (arrayList3.isEmpty() && !this.f3519t.isEmpty()) {
            arrayList3.add(l.X(this.f3519t));
        }
        ArrayList arrayList4 = this.f3519t;
        ArrayList arrayList5 = new ArrayList(n.P(arrayList4, 10));
        int size = arrayList4.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList4.get(i6);
            i6++;
            E3.j jVar = (E3.j) obj;
            int i7 = i;
            arrayList5.add(Integer.valueOf((jVar == null || (numA3 = jVar.a()) == null) ? 0 : numA3.intValue()));
            i = i7;
        }
        int i8 = i;
        Set setX1 = l.x0(arrayList5);
        ArrayList arrayList6 = new ArrayList(n.P(arrayList3, 10));
        int size2 = arrayList3.size();
        int i9 = 0;
        while (i9 < size2) {
            Object obj2 = arrayList3.get(i9);
            i9++;
            E3.j jVar2 = (E3.j) obj2;
            arrayList6.add(Integer.valueOf((jVar2 == null || (numA2 = jVar2.a()) == null) ? 0 : numA2.intValue()));
        }
        Set setX2 = l.x0(arrayList6);
        boolean z6 = dVar.f774h;
        if (z6) {
            Set set = setX2;
            Set setW0 = l.w0(setX1);
            setW0.removeAll(set instanceof Collection ? set : l.s0(set));
            setX0 = l.x0(setW0);
        } else {
            setX0 = w.f11239h;
        }
        Set set2 = setX0;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i8);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        byte[] bArrArray = byteBufferAllocate.order(byteOrder).putShort((short) arrayList3.size()).array();
        if (z6) {
            bArrArray = ByteBuffer.allocate(i8).order(byteOrder).putShort((short) setX1.size()).array();
        }
        arrayList.add(Byte.valueOf(bArrArray[0]));
        arrayList.add(Byte.valueOf(bArrArray[1]));
        Iterator it = arrayList3.iterator();
        k.e("iterator(...)", it);
        while (true) {
            boolean zHasNext = it.hasNext();
            z5 = dVar.i;
            if (!zHasNext) {
                break;
            }
            E3.j jVar3 = (E3.j) it.next();
            int iIntValue = (jVar3 == null || (numA = jVar3.a()) == null) ? 0 : numA.intValue();
            ArrayList arrayList7 = arrayList;
            j(arrayList7, z5, i3, iIntValue, (int) fRed, (int) fGreen, (int) fBlue);
            arrayList = arrayList7;
        }
        ArrayList arrayList8 = arrayList;
        if (z6) {
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                j(arrayList8, z5, i3, ((Number) it2.next()).intValue(), 0, 0, 0);
            }
        }
        if (this.f3518s == null) {
            try {
                this.f3518s = new DatagramSocket((SocketAddress) null);
            } catch (SocketException e6) {
                e6.printStackTrace();
                this.f3518s = null;
            }
        }
        if (this.f3518s != null) {
            try {
                int size3 = arrayList8.size();
                byte[] bArr = new byte[size3];
                for (int i10 = 0; i10 < size3; i10++) {
                    Object obj3 = arrayList8.get(i10);
                    k.e("get(...)", obj3);
                    bArr[i10] = ((Number) obj3).byteValue();
                }
                InetAddress byName = InetAddress.getByName(this.f3511l);
                Integer num = this.f3513n;
                k.c(num);
                DatagramPacket datagramPacket = new DatagramPacket(bArr, size3, byName, num.intValue());
                DatagramSocket datagramSocket = this.f3518s;
                k.c(datagramSocket);
                datagramSocket.send(datagramPacket);
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
    }

    public final void i() {
        c cVar = this.f3516q;
        if (cVar != null) {
            h hVar = cVar.f3491a;
            if (hVar != null) {
                cVar.token = hVar.f3514o;
                k.c(hVar);
                Integer num = hVar.f3513n;
                if (num != null) {
                    cVar.customInfo.put("streamControlPort", String.valueOf(num.intValue()));
                }
                h hVar2 = cVar.f3491a;
                k.c(hVar2);
                E3.g gVar = hVar2.f3517r;
                if (gVar != null && gVar.d()) {
                    String strA = gVar.a();
                    cVar.type = K3.d.f2135l;
                    if (strA != null) {
                        cVar.customInfo.put("model", strA);
                    }
                    cVar.f3491a = null;
                    if (cVar.f3492b == null) {
                        f fVar = new f();
                        cVar.f3492b = fVar;
                        fVar.f799a = cVar.id;
                        fVar.f3500l = cVar.ip;
                        fVar.f3501m = cVar.port;
                        fVar.f3503o = cVar.token;
                    }
                    f fVar2 = cVar.f3492b;
                    k.c(fVar2);
                    fVar2.f3505q = cVar;
                    f fVar3 = cVar.f3492b;
                    k.c(fVar3);
                    fVar3.l();
                    return;
                }
            }
            K3.c cVar2 = cVar.delegate;
            if (cVar2 != null) {
                ((J3.e) cVar2).b();
            }
        }
    }

    public final void k() {
        String str = this.f3511l;
        Integer num = this.f3512m;
        String str2 = this.f3514o;
        if (str == null || num == null || str2 == null) {
            return;
        }
        try {
            f3510u.newCall(new Request.Builder().url("http://" + str + ":" + num + "/api/v1/" + str2).get().build()).enqueue(new g(this, 0));
        } catch (Exception e6) {
            e6.toString();
        }
    }

    public final void l() {
        String str = this.f3511l;
        Integer num = this.f3512m;
        String str2 = this.f3514o;
        if (str == null || num == null || str2 == null) {
            return;
        }
        f3510u.newCall(new Request.Builder().url("http://" + str + ":" + num + "/api/v1/" + this.f3514o + "/effects").put(RequestBody.Companion.create("{\"write\" : {\"command\" : \"display\", \"animType\" : \"extControl\", \"extControlVersion\" : \"v2\"}}", MediaType.Companion.parse("application/json"))).build()).enqueue(new g(this, 2));
    }
}

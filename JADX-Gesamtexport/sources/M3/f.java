package M3;

import D3.j;
import E4.k;
import android.graphics.Color;
import com.fasterxml.jackson.databind.deser.std.d0;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.internal.http2.Settings;
import p089q4.l;
import p089q4.r;
import p089q4.u;
import p089q4.y;

/* JADX INFO: loaded from: classes.dex */
public final class f extends j {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final OkHttpClient f3499u;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f3500l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Integer f3501m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Integer f3502n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f3503o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public c f3505q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public E3.g f3506r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public DatagramSocket f3507s;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public K3.b f3504p = K3.b.i;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3508t = 1;

    static {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f3499u = builder.connectTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).readTimeout(30L, timeUnit).build();
    }

    public static final void i(f fVar) {
        String str = fVar.f3500l;
        Integer num = fVar.f3501m;
        String str2 = fVar.f3503o;
        if (str == null || num == null || str2 == null) {
            fVar.m();
            fVar.k();
            return;
        }
        try {
            f3499u.newCall(new Request.Builder().url("http://" + str + ":" + num + "/api/v1/" + str2 + "/length").get().build()).enqueue(new e(fVar, 0));
        } catch (Exception e6) {
            e6.getMessage();
            fVar.f3508t = 1;
            fVar.m();
            fVar.k();
        }
    }

    public static void j(ArrayList arrayList, int i, int i3, int i6, int i7, int i8) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        byte[] bArrArray = byteBufferAllocate.order(byteOrder).putShort((short) i).array();
        arrayList.add(Byte.valueOf(bArrArray[0]));
        arrayList.add(Byte.valueOf(bArrArray[1]));
        arrayList.add(Byte.valueOf((byte) i3));
        arrayList.add(Byte.valueOf((byte) i6));
        arrayList.add(Byte.valueOf((byte) i7));
        arrayList.add((byte) 0);
        byte[] bArrArray2 = ByteBuffer.allocate(2).order(byteOrder).putShort((short) i8).array();
        arrayList.add(Byte.valueOf(bArrArray2[0]));
        arrayList.add(Byte.valueOf(bArrArray2[1]));
    }

    @Override // D3.j
    public final void a(D3.d dVar) {
        Integer num;
        int i;
        int i3;
        List listV;
        int i6;
        List list;
        int i7;
        int i8 = dVar.f768b;
        D3.a aVar = dVar.f767a;
        if (aVar == null || (num = this.f3502n) == null) {
            return;
        }
        int iIntValue = num.intValue();
        String str = this.f3500l;
        if (str == null) {
            return;
        }
        int iHSVToColor = Color.HSVToColor(new float[]{aVar.f761a / 182.04166f, aVar.f762b / 255.0f, aVar.f763c / 255.0f});
        float fRed = Color.red(iHSVToColor);
        float fGreen = Color.green(iHSVToColor);
        float fBlue = Color.blue(iHSVToColor);
        int iO = p081p0.c.O(i8, 0, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        D3.h hVar = this.f806h;
        int i9 = hVar != null ? hVar.f794j : 0;
        if (i9 <= 0 || i9 > (i7 = this.f3508t) || i7 % i9 != 0) {
            i9 = this.f3508t;
        }
        int i10 = this.f3508t / i9;
        List listS0 = l.s0(p081p0.c.D0(0, i9));
        D3.h hVar2 = this.f806h;
        double d6 = hVar2 != null ? hVar2.f791f : 1.0d;
        if (dVar.f770d || i9 == 1) {
            i = 1;
            i3 = iO;
            listV = (List) G4.a.F(listS0, d6).f10849h;
        } else {
            i = 1;
            i3 = iO;
            listV = (List) G4.a.F(listS0, Math.min(((double) dVar.f771e) / 255.0d, d6)).f10849h;
            if (listV.isEmpty()) {
                Integer num2 = (Integer) l.Z(listS0);
                listV = d0.v(Integer.valueOf(num2 != null ? num2.intValue() : 0));
            }
        }
        int size = listV.size() * i10;
        ArrayList arrayList = new ArrayList();
        Iterator it = listV.iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((Number) it.next()).intValue();
            r.R(arrayList, p081p0.c.D0(iIntValue2 * i10, (iIntValue2 + i) * i10));
        }
        Set setX0 = l.x0(arrayList);
        if (dVar.f774h) {
            J4.d dVarD0 = p081p0.c.D0(0, this.f3508t);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = dVarD0.iterator();
            while (((J4.c) it2).f1944j) {
                Object next = ((y) it2).next();
                int i11 = i;
                if (!setX0.contains(Integer.valueOf(((Number) next).intValue()))) {
                    arrayList2.add(next);
                }
                i = i11;
            }
            i6 = i;
            list = arrayList2;
        } else {
            i6 = i;
            list = u.f11237h;
        }
        int size2 = list.size() + size;
        ArrayList arrayList3 = new ArrayList();
        byte[] bArrArray = ByteBuffer.allocate(2).order(ByteOrder.BIG_ENDIAN).putShort((short) size2).array();
        arrayList3.add(Byte.valueOf(bArrArray[0]));
        arrayList3.add(Byte.valueOf(bArrArray[i6]));
        boolean z5 = dVar.i;
        double d7 = 0.0d;
        double d8 = z5 ? 0.15d : 0.0d;
        if (z5 && i3 > 0) {
            d7 = 0.4d;
        }
        Iterator it3 = listV.iterator();
        while (it3.hasNext()) {
            int iIntValue3 = ((Number) it3.next()).intValue();
            Iterator it4 = it3;
            int I = G4.a.I((int) fRed, d8, 255);
            int I5 = G4.a.I((int) fGreen, d8, 255);
            int I6 = G4.a.I((int) fBlue, d8, 255);
            int i12 = i3;
            int I7 = G4.a.I(i12, d7, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            int i13 = iIntValue3 * i10;
            int i14 = (iIntValue3 + 1) * i10;
            int i15 = i13;
            while (i15 < i14) {
                int i16 = i15;
                j(arrayList3, i16, I, I5, I6, I7);
                i15 = i16 + 1;
            }
            it3 = it4;
            i3 = i12;
        }
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            j(arrayList3, ((Number) it5.next()).intValue(), 0, 0, 0, 0);
        }
        if (this.f3507s == null) {
            try {
                this.f3507s = new DatagramSocket((SocketAddress) null);
            } catch (SocketException e6) {
                e6.printStackTrace();
                this.f3507s = null;
            }
        }
        DatagramSocket datagramSocket = this.f3507s;
        if (datagramSocket == null) {
            return;
        }
        try {
            int size3 = arrayList3.size();
            byte[] bArr = new byte[size3];
            int size4 = arrayList3.size();
            for (int i17 = 0; i17 < size4; i17++) {
                Object obj = arrayList3.get(i17);
                k.e("get(...)", obj);
                bArr[i17] = ((Number) obj).byteValue();
            }
            datagramSocket.send(new DatagramPacket(bArr, size3, InetAddress.getByName(str), iIntValue));
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    public final void k() {
        c cVar = this.f3505q;
        if (cVar != null) {
            cVar.token = this.f3503o;
            Integer num = this.f3502n;
            if (num != null) {
                cVar.customInfo.put("streamControlPort", String.valueOf(num.intValue()));
            }
            E3.g gVar = this.f3506r;
            if ((gVar != null ? gVar.a() : null) != null) {
                Map<String, String> map = cVar.customInfo;
                E3.g gVar2 = this.f3506r;
                k.c(gVar2);
                String strA = gVar2.a();
                k.c(strA);
                map.put("model", strA);
            }
            K3.c cVar2 = cVar.delegate;
            if (cVar2 != null) {
                ((J3.e) cVar2).b();
            }
        }
    }

    public final void l() {
        String str = this.f3500l;
        Integer num = this.f3501m;
        String str2 = this.f3503o;
        if (str == null || num == null || str2 == null) {
            return;
        }
        try {
            f3499u.newCall(new Request.Builder().url("http://" + str + ":" + num + "/api/v1/" + str2).get().build()).enqueue(new e(this, 1));
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    public final void m() {
        String str = this.f3500l;
        Integer num = this.f3501m;
        String str2 = this.f3503o;
        if (str == null || num == null || str2 == null) {
            return;
        }
        f3499u.newCall(new Request.Builder().url("http://" + str + ":" + num + "/api/v1/" + str2 + "/effects").put(RequestBody.Companion.create("{\"write\" : {\"command\" : \"display\", \"animType\" : \"extControl\", \"extControlVersion\" : \"v2\"}}", MediaType.Companion.parse("application/json"))).build()).enqueue(new e(this, 3));
    }
}

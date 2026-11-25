package I3;

import B.C0031p0;
import E0.l;
import E0.o;
import E4.k;
import G0.C0110f;
import M0.y;
import M0.z;
import R2.m;
import S2.h;
import V0.v;
import X.s;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import android.view.MotionEvent;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.B;
import androidx.lifecycle.C0460u;
import androidx.lifecycle.EnumC0453m;
import com.nanjoran.ilightshow.Services.M;
import com.nanjoran.outpost.outpost.Client;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;
import n5.g;
import p000a.j;
import p008b1.f;
import p035g0.C0715p;
import p084p4.q;
import p119w1.n;
import p130y0.A0;
import p130y0.B0;
import p130y0.r;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1857h;
    public final /* synthetic */ Object i;

    public /* synthetic */ a(int i, Object obj) {
        this.f1857h = i;
        this.i = obj;
    }

    /* JADX WARN: Code duplicated, block: B:260:0x04f7 A[Catch: all -> 0x0515, InterruptedException -> 0x0519, TryCatch #17 {all -> 0x0515, blocks: (B:257:0x04df, B:258:0x04f1, B:260:0x04f7, B:262:0x0509, B:266:0x051b, B:267:0x0523, B:269:0x0529, B:270:0x056c, B:271:0x0575, B:273:0x0579, B:276:0x057e), top: B:383:0x04df }] */
    /* JADX WARN: Code duplicated, block: B:269:0x0529 A[Catch: all -> 0x0515, InterruptedException -> 0x0519, LOOP:10: B:267:0x0523->B:269:0x0529, LOOP_END, TryCatch #17 {all -> 0x0515, blocks: (B:257:0x04df, B:258:0x04f1, B:260:0x04f7, B:262:0x0509, B:266:0x051b, B:267:0x0523, B:269:0x0529, B:270:0x056c, B:271:0x0575, B:273:0x0579, B:276:0x057e), top: B:383:0x04df }] */
    /* JADX WARN: Code duplicated, block: B:273:0x0579 A[Catch: all -> 0x0515, Exception -> 0x057d, TRY_LEAVE, TryCatch #15 {Exception -> 0x057d, blocks: (B:271:0x0575, B:273:0x0579), top: B:381:0x0575 }] */
    /* JADX WARN: Code duplicated, block: B:291:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:296:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:423:0x05ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:0x059c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x0509 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:443:0x04f1 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, p4.f] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, p4.f] */
    @Override // java.lang.Runnable
    public final void run() {
        Boolean bool;
        Boolean boolValueOf;
        boolean z5;
        boolean z6;
        HashMap map;
        Semaphore semaphore;
        boolean z7;
        boolean z8;
        byte[] bArrO0;
        LinkedHashMap linkedHashMap;
        k5.a aVar;
        g gVar;
        boolean z9;
        r rVar;
        long j4;
        long j6;
        char c6;
        boolean z10;
        int i;
        long j7;
        char c7;
        boolean z11;
        r rVar2;
        char c8 = 2;
        boolean z12 = true;
        int i3 = 0;
        switch (this.f1857h) {
            case 0:
                c cVar = (c) this.i;
                k.f("this$0", cVar);
                while (cVar.f1862c) {
                    try {
                        byte[] bArr = new byte[1500];
                        DatagramPacket datagramPacket = new DatagramPacket(bArr, 1500);
                        DatagramSocket datagramSocket = cVar.f1860a;
                        if (datagramSocket != null) {
                            datagramSocket.receive(datagramPacket);
                        }
                        try {
                            cVar.b(new String(bArr, 0, datagramPacket.getLength(), M4.a.f3520a));
                        } catch (Exception e6) {
                            e = e6;
                            e.getMessage();
                        }
                    } catch (Exception e7) {
                        e = e7;
                    }
                }
                return;
            case 1:
                J3.e eVar = (J3.e) this.i;
                k.f("this$0", eVar);
                s sVar = eVar.f1932b;
                eVar.e(sVar);
                eVar.c();
                M m6 = eVar.f1936f;
                if (m6 != null) {
                    m6.t(sVar, eVar.f1933c, eVar);
                    return;
                }
                return;
            case 2:
                K.r.setRippleState$lambda$2((K.r) this.i);
                return;
            case 3:
                z zVar = (z) this.i;
                Boolean bool2 = null;
                zVar.f3474n = null;
                P.d dVar = zVar.f3473m;
                int i6 = dVar.f4583j;
                if (i6 > 0) {
                    Object[] objArr = dVar.f4582h;
                    boolValueOf = null;
                    int i7 = 0;
                    do {
                        y yVar = (y) objArr[i7];
                        int iOrdinal = yVar.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                boolValueOf = Boolean.FALSE;
                            } else if ((iOrdinal == 2 || iOrdinal == 3) && !k.a(bool2, Boolean.FALSE)) {
                                boolValueOf = Boolean.valueOf(yVar == y.f3459j);
                            }
                            i7++;
                        } else {
                            boolValueOf = Boolean.TRUE;
                        }
                        bool2 = boolValueOf;
                        i7++;
                    } while (i7 < i6);
                    bool = bool2;
                } else {
                    bool = null;
                    boolValueOf = null;
                }
                dVar.i();
                boolean zA = k.a(bool, Boolean.TRUE);
                C0031p0 c0031p0 = zVar.f3463b;
                if (zA) {
                    ((InputMethodManager) c0031p0.f394j.getValue()).restartInput((View) c0031p0.i);
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((C0715p) ((C0715p) c0031p0.f395k).i).A();
                    } else {
                        ((C0715p) ((C0715p) c0031p0.f395k).i).s();
                    }
                }
                if (k.a(bool, Boolean.FALSE)) {
                    ((InputMethodManager) c0031p0.f394j.getValue()).restartInput((View) c0031p0.i);
                    return;
                }
                return;
            case 4:
                m mVar = (m) this.i;
                mVar.getClass();
                ((h) mVar.f4800d).v(new J2.b(5, mVar));
                return;
            case 5:
                int i8 = 2;
                int i9 = 3;
                j jVar = (j) this.i;
                k.f("this$0", jVar);
                while (jVar.f6101g) {
                    M m7 = M.f8305O;
                    if (m7.n() && m7.i()) {
                        Semaphore semaphore2 = jVar.f6105l;
                        try {
                            semaphore2.acquire();
                            try {
                                for (Object obj : jVar.f6107n.keySet()) {
                                    k.e("next(...)", obj);
                                    int i10 = ((q) obj).f10860h;
                                    HashMap map2 = jVar.f6106m;
                                    if (map2.get(new q(i10)) == null) {
                                        map2.put(new q(i10), new p000a.c(0, 0, 0));
                                    }
                                    p000a.c cVar2 = (p000a.c) map2.get(new q(i10));
                                    p000a.d dVar2 = (p000a.d) jVar.f6107n.get(new q(i10));
                                    if (cVar2 != null && dVar2 != null) {
                                        double d6 = 50;
                                        double d7 = dVar2.f6093d * d6;
                                        int i11 = dVar2.f6092c;
                                        int i12 = dVar2.f6091b;
                                        int i13 = dVar2.f6090a;
                                        if (d7 < 1.0d) {
                                            cVar2.f6087a = i13;
                                            cVar2.f6088b = i12;
                                            cVar2.f6089c = i11;
                                        } else {
                                            int i14 = cVar2.f6087a;
                                            double d8 = (((double) i13) - ((double) i14)) / d7;
                                            double d9 = (((double) i12) - ((double) cVar2.f6088b)) / d7;
                                            double d10 = (((double) i11) - ((double) cVar2.f6089c)) / d7;
                                            cVar2.f6087a = Math.max(0, i14 + ((int) d8));
                                            cVar2.f6088b = Math.max(0, cVar2.f6088b + ((int) d9));
                                            cVar2.f6089c = Math.max(0, cVar2.f6089c + ((int) d10));
                                        }
                                        dVar2.f6093d -= ((double) 1) / d6;
                                    }
                                }
                                HashMap map3 = jVar.f6107n;
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                for (Map.Entry entry : map3.entrySet()) {
                                    if (((p000a.d) entry.getValue()).f6093d > 0.0d) {
                                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                                    }
                                }
                                jVar.f6107n = new HashMap(linkedHashMap2);
                            } catch (InterruptedException unused) {
                                z6 = true;
                                try {
                                    Thread.currentThread().interrupt();
                                    if (z6) {
                                    }
                                    map = jVar.f6106m;
                                    semaphore = jVar.f6105l;
                                    semaphore.acquire();
                                    try {
                                        bArrO0 = new byte[]{72, 117, 101, 83, 116, 114, 101, 97, 109, 1, 0, 7, 0, 0, 0, 0};
                                        linkedHashMap = new LinkedHashMap();
                                        for (Map.Entry entry2 : map.entrySet()) {
                                            if (jVar.f6103j.contains(entry2.getKey())) {
                                                linkedHashMap.put(entry2.getKey(), entry2.getValue());
                                            }
                                        }
                                        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                                            int i15 = ((q) entry3.getKey()).f10860h;
                                            p000a.c cVar3 = (p000a.c) entry3.getValue();
                                            int i16 = i8;
                                            bArrO0 = p089q4.k.o0(p089q4.k.o0(p089q4.k.o0(p089q4.k.o0(bArrO0, j.f(i15, i9)), j.f(cVar3.f6087a, i16)), j.f(cVar3.f6088b, i16)), j.f(cVar3.f6089c, i16));
                                            i9 = 3;
                                            i8 = 2;
                                        }
                                        aVar = new k5.a(bArrO0, jVar.f6108o, jVar.f6109p);
                                        gVar = jVar.f6104k;
                                        if (gVar != null) {
                                            gVar.n(aVar);
                                        }
                                        break;
                                    } catch (InterruptedException unused2) {
                                        z8 = true;
                                        try {
                                            Thread.currentThread().interrupt();
                                            if (z8) {
                                            }
                                            if (!j.i(jVar.f6110q)) {
                                                return;
                                            }
                                            i9 = 3;
                                            i8 = 2;
                                        } catch (Throwable th) {
                                            th = th;
                                            z7 = z8;
                                            if (z7) {
                                                semaphore.release();
                                            }
                                            throw th;
                                        }
                                    }
                                    semaphore.release();
                                    if (!j.i(jVar.f6110q)) {
                                        return;
                                    }
                                    i9 = 3;
                                    i8 = 2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z5 = z6;
                                    if (z5) {
                                        semaphore2.release();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused3) {
                            } catch (Throwable th3) {
                                th = th3;
                                z5 = true;
                                if (z5) {
                                    semaphore2.release();
                                }
                                throw th;
                            }
                        } catch (InterruptedException unused4) {
                            z6 = false;
                        } catch (Exception unused5) {
                        } catch (Throwable th4) {
                            th = th4;
                            z5 = false;
                        }
                        semaphore2.release();
                        map = jVar.f6106m;
                        semaphore = jVar.f6105l;
                        try {
                            semaphore.acquire();
                            try {
                                bArrO0 = new byte[]{72, 117, 101, 83, 116, 114, 101, 97, 109, 1, 0, 7, 0, 0, 0, 0};
                                linkedHashMap = new LinkedHashMap();
                                while (r0.hasNext()) {
                                    if (jVar.f6103j.contains(entry2.getKey())) {
                                        linkedHashMap.put(entry2.getKey(), entry2.getValue());
                                    }
                                }
                                while (r0.hasNext()) {
                                    int i17 = ((q) entry3.getKey()).f10860h;
                                    p000a.c cVar4 = (p000a.c) entry3.getValue();
                                    int i18 = i8;
                                    bArrO0 = p089q4.k.o0(p089q4.k.o0(p089q4.k.o0(p089q4.k.o0(bArrO0, j.f(i17, i9)), j.f(cVar4.f6087a, i18)), j.f(cVar4.f6088b, i18)), j.f(cVar4.f6089c, i18));
                                    i9 = 3;
                                    i8 = 2;
                                }
                                aVar = new k5.a(bArrO0, jVar.f6108o, jVar.f6109p);
                                try {
                                    gVar = jVar.f6104k;
                                    if (gVar != null) {
                                        gVar.n(aVar);
                                    }
                                } catch (Exception e8) {
                                    e8.toString();
                                }
                                semaphore.release();
                                if (!j.i(jVar.f6110q)) {
                                    return;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                z7 = true;
                                if (z7) {
                                    semaphore.release();
                                }
                                throw th;
                            }
                        } catch (InterruptedException unused6) {
                            z8 = false;
                        } catch (Throwable th6) {
                            th = th6;
                            z7 = false;
                        }
                    } else if (!j.i(1000L)) {
                        return;
                    }
                    i9 = 3;
                    i8 = 2;
                    break;
                }
                return;
            case 6:
                ((I0.d) this.i).getClass();
                return;
            case 7:
                B b6 = (B) this.i;
                k.f("this$0", b6);
                int i19 = b6.i;
                C0460u c0460u = b6.f6944m;
                if (i19 == 0) {
                    z9 = true;
                    b6.f6941j = true;
                    c0460u.d(EnumC0453m.ON_PAUSE);
                } else {
                    z9 = true;
                }
                if (b6.f6940h == 0 && b6.f6941j) {
                    c0460u.d(EnumC0453m.ON_STOP);
                    b6.f6942k = z9;
                    return;
                }
                return;
            case 8:
                p007b0.c cVar5 = (p007b0.c) this.i;
                if (cVar5.e()) {
                    r rVar3 = cVar5.f7029h;
                    rVar3.q(true);
                    cVar5.h(rVar3.getSemanticsOwner().a(), cVar5.f7042v);
                    cVar5.g(rVar3.getSemanticsOwner().a(), cVar5.f7042v);
                    p080p.q qVarD = cVar5.d();
                    int[] iArr = qVarD.f10761b;
                    long[] jArr = qVarD.f10760a;
                    int length = jArr.length - 2;
                    p080p.q qVar = cVar5.f7041u;
                    int i20 = 8;
                    if (length >= 0) {
                        Throwable th7 = null;
                        int i21 = 0;
                        j4 = 128;
                        while (true) {
                            long j8 = jArr[i21];
                            Throwable th8 = th7;
                            j6 = 255;
                            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i22 = 8 - ((~(i21 - length)) >>> 31);
                                int i23 = i3;
                                while (i23 < i22) {
                                    if ((j8 & 255) < 128) {
                                        c7 = c8;
                                        int i24 = iArr[(i21 << 3) + i23];
                                        z11 = z12;
                                        A0 a6 = (A0) qVar.f(i24);
                                        B0 b7 = (B0) qVarD.f(i24);
                                        l lVar = b7 != null ? b7.f14210a : th8;
                                        if (lVar == 0) {
                                            p027e3.a.z0("no value for specified key");
                                            throw th8;
                                        }
                                        E0.h hVar = lVar.f947d;
                                        int i25 = lVar.f950g;
                                        i = i20;
                                        LinkedHashMap linkedHashMap3 = hVar.f939h;
                                        if (a6 == null) {
                                            Iterator it = hVar.iterator();
                                            while (it.hasNext()) {
                                                Object key = ((Map.Entry) it.next()).getKey();
                                                j8 = j8;
                                                E0.r rVar4 = o.f990u;
                                                if (k.a(key, rVar4)) {
                                                    Object obj2 = linkedHashMap3.get(rVar4);
                                                    if (obj2 == null) {
                                                        obj2 = th8;
                                                    }
                                                    List list = (List) obj2;
                                                    String strValueOf = String.valueOf(list != null ? (C0110f) p089q4.l.Z(list) : th8);
                                                    B0.d dVar3 = cVar5.f7030j;
                                                    if (dVar3 != null) {
                                                        ContentCaptureSession contentCaptureSession = dVar3.f484a;
                                                        AutofillId autofillIdA = B0.b.a(contentCaptureSession, B0.e.a(dVar3.f485b), i25);
                                                        if (autofillIdA == null) {
                                                            p027e3.a.z0("Invalid content capture ID");
                                                            throw th8;
                                                        }
                                                        B0.b.e(contentCaptureSession, autofillIdA, strValueOf);
                                                    }
                                                    it = it;
                                                    rVar3 = rVar3;
                                                }
                                            }
                                            j7 = j8;
                                        } else {
                                            j7 = j8;
                                            rVar2 = rVar3;
                                            Iterator it2 = hVar.iterator();
                                            while (it2.hasNext()) {
                                                E0.r rVar5 = (E0.r) ((Map.Entry) it2.next()).getKey();
                                                E0.r rVar6 = o.f990u;
                                                if (k.a(rVar5, rVar6)) {
                                                    Object obj3 = a6.f14176a.f939h.get(rVar6);
                                                    if (obj3 == null) {
                                                        obj3 = th8;
                                                    }
                                                    List list2 = (List) obj3;
                                                    Object obj4 = list2 != null ? (C0110f) p089q4.l.Z(list2) : th8;
                                                    Object obj5 = linkedHashMap3.get(rVar6);
                                                    if (obj5 == null) {
                                                        obj5 = th8;
                                                    }
                                                    List list3 = (List) obj5;
                                                    Object obj6 = list3 != null ? (C0110f) p089q4.l.Z(list3) : th8;
                                                    if (k.a(obj4, obj6)) {
                                                        continue;
                                                    } else {
                                                        String strValueOf2 = String.valueOf(obj6);
                                                        B0.d dVar4 = cVar5.f7030j;
                                                        if (dVar4 != null) {
                                                            long j9 = i25;
                                                            ContentCaptureSession contentCaptureSession2 = dVar4.f484a;
                                                            AutofillId autofillIdA2 = B0.b.a(contentCaptureSession2, B0.e.a(dVar4.f485b), j9);
                                                            if (autofillIdA2 == null) {
                                                                p027e3.a.z0("Invalid content capture ID");
                                                                throw th8;
                                                            }
                                                            B0.b.e(contentCaptureSession2, autofillIdA2, strValueOf2);
                                                        }
                                                        linkedHashMap3 = linkedHashMap3;
                                                        it2 = it2;
                                                        i25 = i25;
                                                    }
                                                }
                                            }
                                        }
                                        j8 = j7 >> i;
                                        i23++;
                                        i20 = i;
                                        c8 = c7;
                                        z12 = z11;
                                        rVar3 = rVar2;
                                    } else {
                                        i = i20;
                                        j7 = j8;
                                        c7 = c8;
                                        z11 = z12;
                                    }
                                    rVar2 = rVar3;
                                    j8 = j7 >> i;
                                    i23++;
                                    i20 = i;
                                    c8 = c7;
                                    z12 = z11;
                                    rVar3 = rVar2;
                                }
                                c6 = c8;
                                z10 = z12;
                                rVar = rVar3;
                                if (i22 == i20) {
                                }
                            } else {
                                c6 = c8;
                                z10 = z12;
                                rVar = rVar3;
                            }
                            if (i21 != length) {
                                i21++;
                                th7 = th8;
                                c8 = c6;
                                z12 = z10;
                                rVar3 = rVar;
                                i20 = 8;
                                i3 = 0;
                            }
                        }
                    } else {
                        rVar = rVar3;
                        j4 = 128;
                        j6 = 255;
                    }
                    qVar.a();
                    p080p.q qVarD2 = cVar5.d();
                    int[] iArr2 = qVarD2.f10761b;
                    Object[] objArr2 = qVarD2.f10762c;
                    long[] jArr2 = qVarD2.f10760a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i26 = 0;
                        while (true) {
                            long j10 = jArr2[i26];
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i27 = 8 - ((~(i26 - length2)) >>> 31);
                                for (int i28 = 0; i28 < i27; i28++) {
                                    if ((j10 & j6) < j4) {
                                        int i29 = (i26 << 3) + i28;
                                        qVar.i(iArr2[i29], new A0(((B0) objArr2[i29]).f14210a, cVar5.d()));
                                    }
                                    j10 >>= 8;
                                }
                                if (i27 == 8) {
                                }
                            }
                            if (i26 != length2) {
                                i26++;
                            }
                        }
                    }
                    cVar5.f7042v = new A0(rVar.getSemanticsOwner().a(), cVar5.d());
                    cVar5.f7043w = false;
                    return;
                }
                return;
            case 9:
                p012c.j jVar2 = (p012c.j) this.i;
                k.f("this$0", jVar2);
                Runnable runnable = jVar2.i;
                if (runnable != null) {
                    runnable.run();
                    jVar2.i = null;
                    return;
                }
                return;
            case 10:
                v.c((v) this.i);
                return;
            case 11:
                Client client = (Client) this.i;
                if (client != null) {
                    client.stop();
                    return;
                }
                return;
            case 12:
                View view = (View) this.i;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 13:
                n nVar = (n) this.i;
                synchronized (nVar.f13433d) {
                    try {
                        if (nVar.f13437h == null) {
                            return;
                        }
                        try {
                            p031f1.e eVarC = nVar.c();
                            int i30 = eVarC.f8867e;
                            if (i30 == 2) {
                                synchronized (nVar.f13433d) {
                                }
                            }
                            if (i30 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i30 + ")");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                q5.n nVar2 = nVar.f13432c;
                                Context context = nVar.f13430a;
                                nVar2.getClass();
                                Typeface typefaceA = f.a(context, new p031f1.e[]{eVarC}, 0);
                                MappedByteBuffer mappedByteBufferE = p020d2.n.E(nVar.f13430a, eVarC.f8863a);
                                if (mappedByteBufferE == null || typefaceA == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    H1.d dVar5 = new H1.d(typefaceA, p135z0.a.b(mappedByteBufferE));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (nVar.f13433d) {
                                        try {
                                            p131y1.f fVar = nVar.f13437h;
                                            if (fVar != null) {
                                                fVar.c(dVar5);
                                            }
                                        } catch (Throwable th9) {
                                            throw th9;
                                        }
                                        break;
                                    }
                                    nVar.b();
                                    return;
                                } catch (Throwable th10) {
                                    Trace.endSection();
                                    throw th10;
                                }
                            } catch (Throwable th11) {
                                Trace.endSection();
                                throw th11;
                            }
                            break;
                        } catch (Throwable th12) {
                            synchronized (nVar.f13433d) {
                                try {
                                    p131y1.f fVar2 = nVar.f13437h;
                                    if (fVar2 != null) {
                                        fVar2.b(th12);
                                    }
                                    nVar.b();
                                    return;
                                } catch (Throwable th13) {
                                    throw th13;
                                }
                            }
                        }
                    } catch (Throwable th14) {
                        throw th14;
                    }
                }
            case 14:
                r rVar7 = (r) this.i;
                rVar7.f14519z0 = false;
                MotionEvent motionEvent = rVar7.f14508t0;
                k.c(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                rVar7.C(motionEvent);
                return;
            default:
                p130y0.B b8 = (p130y0.B) this.i;
                Trace.beginSection("measureAndLayout");
                try {
                    b8.f14188d.q(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        b8.i();
                        Trace.endSection();
                        b8.J = false;
                        return;
                    } catch (Throwable th15) {
                        Trace.endSection();
                        throw th15;
                    }
                } catch (Throwable th16) {
                    Trace.endSection();
                    throw th16;
                }
        }
    }

    public /* synthetic */ a(I0.d dVar, int i) {
        this.f1857h = 6;
        this.i = dVar;
    }
}

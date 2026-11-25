package O1;

import B.AbstractC0013g0;
import B.C0025m0;
import P4.AbstractC0336x;
import P4.C0319f;
import android.animation.ValueAnimator;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import c5.C0495p;
import com.google.android.gms.internal.play_billing.AbstractC0594t;
import com.google.android.gms.internal.play_billing.AbstractC0602x;
import com.google.android.gms.internal.play_billing.C0600w;
import com.nanjoran.ilightshow.Services.D0;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetSocketAddress;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import org.eclipse.californium.scandium.dtls.ConnectionEvictedException;
import org.eclipse.californium.scandium.dtls.DtlsException;
import org.eclipse.californium.scandium.dtls.DtlsHandshakeTimeoutException;
import org.eclipse.californium.scandium.dtls.HandshakeException;
import org.slf4j.Logger;
import org.slf4j.MDC;
import p035g0.C0715p;
import p045i1.K;
import p045i1.O;
import p057l.B0;
import p057l.C0787f;
import p057l.C0793i;
import p057l.E0;
import p5.C0850o;
import p5.C0854t;
import p5.EnumC0835a;
import p5.EnumC0837b;
import p5.Q;
import p5.W;
import p5.X;
import p5.f0;
import p5.i0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4518h;
    public Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4519j;

    public /* synthetic */ n(int i, Object obj, Object obj2, boolean z5) {
        this.f4518h = i;
        this.f4519j = obj;
        this.i = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:125:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:167:0x03a5 A[Catch: all -> 0x03a0, DONT_GENERATE, PHI: r0
  0x03a5: PHI (r0v75 p5.t) = (r0v74 p5.t), (r0v83 p5.t) binds: [B:153:0x037a, B:159:0x039b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {, blocks: (B:136:0x034e, B:138:0x0356, B:140:0x035a, B:142:0x0362, B:145:0x0369, B:151:0x0377, B:154:0x037c, B:155:0x0380, B:157:0x0383, B:158:0x0384, B:160:0x039d, B:166:0x03a4, B:167:0x03a5, B:156:0x0381), top: B:317:0x034e, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x03a8 A[Catch: RuntimeException -> 0x03ac, GeneralSecurityException -> 0x03ae, HandshakeException -> 0x03b0, TRY_ENTER, TryCatch #10 {RuntimeException -> 0x03ac, blocks: (B:132:0x0336, B:134:0x034b, B:135:0x034d, B:169:0x03a8, B:176:0x03b2, B:183:0x03c4, B:184:0x03dd, B:187:0x03ec), top: B:328:0x0336 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x03b2 A[Catch: RuntimeException -> 0x03ac, GeneralSecurityException -> 0x03ae, HandshakeException -> 0x03b0, TRY_LEAVE, TryCatch #10 {RuntimeException -> 0x03ac, blocks: (B:132:0x0336, B:134:0x034b, B:135:0x034d, B:169:0x03a8, B:176:0x03b2, B:183:0x03c4, B:184:0x03dd, B:187:0x03ec), top: B:328:0x0336 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:124:0x02a4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:125:0x02c1, please report this as an issue */
    @Override // java.lang.Runnable
    public final void run() {
        U4.g gVar;
        Z2.d dVar;
        C0715p c0715p;
        E0 e6;
        C0787f c0787f;
        ExecutorService executorService;
        f0 f0Var;
        Q qB;
        InetSocketAddress inetSocketAddress;
        String str;
        String str2;
        String str3;
        String strL;
        int i = 0;
        Throwable th = null;
        switch (this.f4518h) {
            case 0:
                g gVar2 = A.f4430k;
                ((C0310c) this.i).z(24, 3, gVar2);
                ((J2.b) this.f4519j).d(gVar2);
                return;
            case 1:
                C0310c c0310c = (C0310c) this.i;
                g gVar3 = (g) this.f4519j;
                if (((D0) c0310c.f4468f.f4446c) != null) {
                    ((D0) c0310c.f4468f.f4446c).b(gVar3, null);
                    return;
                } else {
                    int i3 = AbstractC0602x.f8015a;
                    Log.isLoggable("BillingClient", 5);
                    return;
                }
            case 2:
                Future future = (Future) this.i;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                future.cancel(true);
                int i6 = AbstractC0602x.f8015a;
                Log.isLoggable("BillingClient", 5);
                Runnable runnable = (Runnable) this.f4519j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                g gVar4 = A.f4430k;
                ((C0310c) this.i).z(24, 7, gVar4);
                com.google.android.gms.internal.play_billing.r rVar = AbstractC0594t.i;
                ((D0) this.f4519j).a(gVar4, new C0025m0(C0600w.f8010l));
                return;
            case 4:
                g gVar5 = A.f4430k;
                ((C0310c) this.i).z(24, 9, gVar5);
                com.google.android.gms.internal.play_billing.r rVar2 = AbstractC0594t.i;
                ((D0) this.f4519j).c(gVar5, C0600w.f8010l);
                return;
            case 5:
                try {
                    ((C0310c) ((D.x) this.i).f707j).f4459A.c((g) this.f4519j);
                    return;
                } catch (Throwable unused) {
                    AbstractC0602x.h("BillingClient");
                    return;
                }
            case 6:
                ((C0319f) this.i).E((Q4.c) this.f4519j);
                return;
            case 7:
                break;
            case 8:
                E e7 = (E) this.f4519j;
                Y2.h hVar = (Y2.h) ((Y2.c) e7.f4449f).f5883j.get((Y2.a) e7.f4446c);
                if (hVar == null) {
                    return;
                }
                W2.a aVar = (W2.a) this.i;
                if ((aVar.i == 0 ? 1 : 0) == 0) {
                    hVar.o(aVar, null);
                    return;
                }
                e7.f4444a = true;
                X2.a aVar2 = (X2.a) e7.f4445b;
                if (aVar2.j()) {
                    if (!e7.f4444a || (dVar = (Z2.d) e7.f4447d) == null) {
                        return;
                    }
                    aVar2.i(dVar, (Set) e7.f4448e);
                    return;
                }
                try {
                    aVar2.i(null, aVar2.a());
                    return;
                } catch (SecurityException unused2) {
                    aVar2.c("Failed to get service from broker.");
                    hVar.o(new W2.a(10, null, null), null);
                    return;
                }
            case 9:
                I0.d dVar2 = (I0.d) ((C0025m0) this.i).i;
                if (dVar2 != null) {
                    dVar2.h((Typeface) this.f4519j);
                    return;
                }
                return;
            case 10:
                ((s) this.i).a(this.f4519j);
                return;
            case 11:
                ((p034f4.v) this.i).f9001k = true;
                ((p034f4.w) this.f4519j).f9002h.remove((p034f4.v) this.i);
                return;
            case 12:
                K.g((View) this.i);
                ((ValueAnimator) this.f4519j).start();
                return;
            case 13:
                C0793i c0793i = (C0793i) this.f4519j;
                p052k.j jVar = c0793i.f10085j;
                if (jVar != null && (c0715p = jVar.f9852e) != null && (e6 = ((ActionMenuView) c0715p.i).f6449A) != null) {
                    Toolbar toolbar = e6.f9978a;
                    C0793i c0793i2 = toolbar.f6528h.f6458z;
                    if (c0793i2 == null || (c0787f = c0793i2.f10100y) == null || !c0787f.b()) {
                        Iterator it = ((CopyOnWriteArrayList) toolbar.f6518N.i).iterator();
                        if (it.hasNext()) {
                            throw p138z3.b.a(it);
                        }
                    }
                }
                ActionMenuView actionMenuView = c0793i.f10089n;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    C0787f c0787f2 = (C0787f) this.i;
                    if (c0787f2.b()) {
                        c0793i.f10100y = c0787f2;
                    } else if (c0787f2.f9900e != null) {
                        c0787f2.d(0, 0, false, false);
                        c0793i.f10100y = c0787f2;
                    }
                }
                c0793i.f10081A = null;
                return;
            case 14:
                synchronized (((p060l3.d) this.f4519j).f10378b) {
                    ((p060l3.d) this.f4519j).f10379c.h((K.y) this.i);
                    break;
                }
                return;
            case 15:
                m5.q qVar = (m5.q) this.f4519j;
                try {
                    m5.q.b(qVar);
                    try {
                        ((Runnable) this.i).run();
                        break;
                    } catch (Throwable th2) {
                        try {
                            m5.q.f10482p.error("unexpected error occurred:", th2);
                        } catch (Throwable th3) {
                            m5.q.c(qVar);
                            throw th3;
                        }
                        break;
                    }
                    m5.q.c(qVar);
                    qVar.o();
                    return;
                } catch (Throwable th4) {
                    qVar.o();
                    throw th4;
                }
            case 16:
                MDC.put("PEER", m5.s.d(((i0) this.i).d()));
                n5.g gVar6 = (n5.g) this.f4519j;
                i0 i0Var = (i0) this.i;
                gVar6.getClass();
                InetSocketAddress inetSocketAddressD = i0Var.d();
                Logger logger = n5.g.f10586y;
                if (logger.isTraceEnabled()) {
                    logger.trace("Processing new CLIENT_HELLO from peer [" + inetSocketAddressD + "]:" + m5.s.f10493b + i0Var);
                }
                try {
                    try {
                        i0Var.a(null);
                        C0850o c0850o = (C0850o) i0Var.c();
                        B0 b6 = new B0();
                        if (gVar6.g(c0850o, i0Var, b6)) {
                            synchronized (gVar6.f10589b) {
                                C0854t c0854tC = gVar6.f10589b.c(inetSocketAddressD);
                                if (c0854tC != null && ((f0Var = c0854tC.f11144c) == null || !f0Var.equals(c0850o.f11122o) || c0854tC.f11145d < c0850o.i)) {
                                    C0854t c0854t = (C0854t) b6.f9968d;
                                    if (c0854t == null || c0854t == c0854tC) {
                                        if (c0854t != null && c0854t == c0854tC) {
                                            b6.f9966b = true;
                                        }
                                        c0854tC = null;
                                    } else {
                                        i = 1;
                                    }
                                }
                                if (c0854tC != null) {
                                    if (i == 0) {
                                        b6.f9967c = c0854tC;
                                        c0854tC.f11147f.execute(new p052k.e(gVar6, c0850o, i0Var, b6, 1));
                                    } else {
                                        gVar6.p(c0850o, i0Var, null);
                                    }
                                    break;
                                } else {
                                    synchronized (gVar6) {
                                        executorService = gVar6.f10609w;
                                    }
                                    c0854tC = new C0854t(inetSocketAddressD, new m5.q(executorService));
                                    c0854tC.f();
                                    c0854tC.f11145d = c0850o.i;
                                    c0854tC.f11144c = c0850o.f11122o;
                                    if (gVar6.f10589b.e(c0854tC)) {
                                        if (i == 0) {
                                            gVar6.p(c0850o, i0Var, null);
                                        } else {
                                            b6.f9967c = c0854tC;
                                            try {
                                                c0854tC.f11147f.execute(new p052k.e(gVar6, c0850o, i0Var, b6, 1));
                                            } catch (RejectedExecutionException e8) {
                                                n5.g.f10586y.debug("Execution rejected while processing record [type: {}, peer: {}]", i0Var.f11073a, inetSocketAddressD, e8);
                                            } catch (RuntimeException e9) {
                                                n5.g.f10586y.warn("Unexpected error occurred while processing record [type: {}, peer: {}]", i0Var.f11073a, inetSocketAddressD, e9);
                                                gVar6.w((C0854t) b6.f9967c, EnumC0837b.FATAL, EnumC0835a.INTERNAL_ERROR);
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    } catch (GeneralSecurityException e10) {
                        n5.g.f10587z.debug("Processing new CLIENT_HELLO from peer [{}] failed!", i0Var.d(), e10);
                    } catch (HandshakeException e11) {
                        n5.g.f10586y.debug("Processing new CLIENT_HELLO from peer [{}] failed!", i0Var.d(), e11);
                    }
                } catch (RuntimeException e12) {
                    n5.g.f10586y.warn("Processing new CLIENT_HELLO from peer [{}] failed!", i0Var.d(), e12);
                }
                MDC.clear();
                return;
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                Q q6 = (Q) this.f4519j;
                q6.f10956N.l((i0) this.i, q6.f10957O);
                return;
            case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                Q q7 = (Q) this.i;
                p5.A a6 = (p5.A) this.f4519j;
                q7.getClass();
                if (a6.f10883p || (qB = q7.f10957O.b()) == null) {
                    return;
                }
                if (qB.o() || !q7.f10957O.d()) {
                    InetSocketAddress inetSocketAddress2 = q7.f10995v.f10894h;
                    if (q7.f10957O.e() && q7.f10956N.f10607u.get()) {
                        int i7 = a6.f10873e;
                        if (i7 >= q7.f10970b0 || !qB.n()) {
                            int i8 = q7.f10970b0;
                            if (i7 < i8) {
                                int i9 = 60000;
                                if (q7.f10966X && a6.f10882o) {
                                    while (i7 < q7.f10970b0) {
                                        i7++;
                                        a6.f10873e++;
                                        int i10 = a6.f10874f;
                                        if (i10 < 60000 && (i10 = i10 * 2) > 60000) {
                                            i10 = 60000;
                                        }
                                        a6.f10874f = i10;
                                    }
                                    a6.f10873e++;
                                    q7.f10976h.trace("schedule handshake timeout {}ms after flight {}", Integer.valueOf(a6.f10874f), Integer.valueOf(a6.f10872d));
                                    n nVar = q7.f10954L;
                                    if (nVar != null) {
                                        a6.c(q7.f10955M, nVar);
                                        return;
                                    }
                                    return;
                                }
                                q7.f10976h.trace("Re-transmitting flight for [{}], [{}] retransmissions left", q7.f10995v.f10894h, Integer.valueOf((q7.f10970b0 - i7) - 1));
                                try {
                                    a6.f10873e++;
                                    int i11 = a6.f10874f;
                                    if (i11 >= 60000 || (i11 = i11 * 2) <= 60000) {
                                        i9 = i11;
                                    }
                                    a6.f10874f = i9;
                                    int iD = q7.f10956N.d(q7.f10994u);
                                    p5.C c6 = q7.f10995v;
                                    Integer num = c6.f10896k;
                                    int iIntValue = num != null ? num.intValue() : c6.f10897l;
                                    int i12 = q7.f10969a0;
                                    ArrayList arrayListB = a6.b(iD, iIntValue, q7.f10968Z, q7.f10967Y, i12 > 0 && i7 + 1 > i12);
                                    try {
                                        inetSocketAddress = inetSocketAddress2;
                                        try {
                                            q7.f10976h.debug("Resending flight {} of {} message(s) to peer [{}] using {} datagram(s) of max. {} bytes. Retransmission {} of {}.", Integer.valueOf(a6.f10872d), Integer.valueOf(a6.f10870b.size()), inetSocketAddress2, Integer.valueOf(arrayListB.size()), Integer.valueOf(iD), Integer.valueOf(i7 + 1), Integer.valueOf(q7.f10970b0));
                                            n5.g gVar7 = q7.f10956N;
                                            gVar7.getClass();
                                            int size = arrayListB.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj = arrayListB.get(i13);
                                                i13++;
                                                gVar7.r((DatagramPacket) obj);
                                            }
                                            n nVar2 = q7.f10954L;
                                            if (nVar2 != null) {
                                                a6.c(q7.f10955M, nVar2);
                                            }
                                            qB.l(a6.f10872d);
                                            return;
                                        } catch (IOException e13) {
                                            e = e13;
                                            th = e;
                                            str = " " + th.getMessage();
                                            q7.f10976h.warn("Cannot retransmit flight to peer [{}]", inetSocketAddress, th);
                                            str2 = str;
                                            Logger logger2 = q7.f10976h;
                                            Object[] objArr = {Integer.valueOf(a6.f10872d), Integer.valueOf(a6.f10870b.size()), inetSocketAddress, str2, Integer.valueOf(a6.f10873e), Integer.valueOf(q7.f10970b0)};
                                            str3 = str2;
                                            logger2.debug("Flight {} of {} message(s) to peer [{}] failed, {}. Retransmission {} of {}.", objArr);
                                            if (i != 0) {
                                                qB.k(new DtlsHandshakeTimeoutException("Handshake flight " + a6.f10872d + " failed!" + str3));
                                                return;
                                            }
                                            qB.k(new DtlsException("Handshake flight " + a6.f10872d + " failed!" + str3, th));
                                            return;
                                        } catch (HandshakeException e14) {
                                            e = e14;
                                            th = e;
                                            q7.f10976h.warn("Cannot retransmit flight to peer [{}]", inetSocketAddress, th);
                                            str = " " + th.getMessage();
                                            str2 = str;
                                            Logger logger3 = q7.f10976h;
                                            Object[] objArr2 = {Integer.valueOf(a6.f10872d), Integer.valueOf(a6.f10870b.size()), inetSocketAddress, str2, Integer.valueOf(a6.f10873e), Integer.valueOf(q7.f10970b0)};
                                            str3 = str2;
                                            logger3.debug("Flight {} of {} message(s) to peer [{}] failed, {}. Retransmission {} of {}.", objArr2);
                                            if (i != 0) {
                                                qB.k(new DtlsHandshakeTimeoutException("Handshake flight " + a6.f10872d + " failed!" + str3));
                                                return;
                                            }
                                            qB.k(new DtlsException("Handshake flight " + a6.f10872d + " failed!" + str3, th));
                                            return;
                                        }
                                    } catch (IOException e15) {
                                        e = e15;
                                        inetSocketAddress = inetSocketAddress2;
                                    } catch (HandshakeException e16) {
                                        e = e16;
                                        inetSocketAddress = inetSocketAddress2;
                                    }
                                } catch (IOException e17) {
                                    e = e17;
                                    inetSocketAddress = inetSocketAddress2;
                                } catch (HandshakeException e18) {
                                    e = e18;
                                    inetSocketAddress = inetSocketAddress2;
                                }
                            } else {
                                inetSocketAddress = inetSocketAddress2;
                                if (i7 > i8) {
                                    q7.f10976h.debug("Flight for [{}] has reached timeout, discarding ...", inetSocketAddress);
                                    strL = " Stopped by timeout!";
                                } else {
                                    q7.f10976h.debug("Flight for [{}] has reached maximum no. [{}] of retransmissions, discarding ...", inetSocketAddress, Integer.valueOf(i8));
                                    strL = AbstractC0013g0.l(new StringBuilder(" Stopped by timeout after "), q7.f10970b0, " retransmissions!");
                                }
                                str2 = strL;
                                i = 1;
                            }
                        } else {
                            str2 = " Stopped by expired realtime!";
                            i = 1;
                            inetSocketAddress = inetSocketAddress2;
                        }
                        Logger logger4 = q7.f10976h;
                        Object[] objArr3 = {Integer.valueOf(a6.f10872d), Integer.valueOf(a6.f10870b.size()), inetSocketAddress, str2, Integer.valueOf(a6.f10873e), Integer.valueOf(q7.f10970b0)};
                        str3 = str2;
                        logger4.debug("Flight {} of {} message(s) to peer [{}] failed, {}. Retransmission {} of {}.", objArr3);
                        if (i != 0) {
                            qB.k(new DtlsHandshakeTimeoutException("Handshake flight " + a6.f10872d + " failed!" + str3));
                            return;
                        }
                        qB.k(new DtlsException("Handshake flight " + a6.f10872d + " failed!" + str3, th));
                        return;
                    }
                    inetSocketAddress = inetSocketAddress2;
                    str = " Stopped by shutdown!";
                    str2 = str;
                    Logger logger5 = q7.f10976h;
                    Object[] objArr4 = {Integer.valueOf(a6.f10872d), Integer.valueOf(a6.f10870b.size()), inetSocketAddress, str2, Integer.valueOf(a6.f10873e), Integer.valueOf(q7.f10970b0)};
                    str3 = str2;
                    logger5.debug("Flight {} of {} message(s) to peer [{}] failed, {}. Retransmission {} of {}.", objArr4);
                    if (i != 0) {
                        qB.k(new DtlsHandshakeTimeoutException("Handshake flight " + a6.f10872d + " failed!" + str3));
                        return;
                    }
                    qB.k(new DtlsException("Handshake flight " + a6.f10872d + " failed!" + str3, th));
                    return;
                }
                return;
            case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                n nVar3 = (n) this.i;
                Q q8 = (Q) this.f4519j;
                try {
                    q8.f10957O.f11147f.execute(nVar3);
                    return;
                } catch (RejectedExecutionException e19) {
                    q8.f10976h.debug("Execution rejected while execute task of peer: {}", q8.f10957O.f11148g, e19);
                    nVar3.run();
                    return;
                }
            case 20:
                Q qB2 = ((C0854t) this.i).b();
                if (qB2 != null) {
                    InetSocketAddress inetSocketAddress3 = ((C0854t) this.i).f11148g;
                    qB2.k(new ConnectionEvictedException("Evicted!"));
                }
                synchronized (((W) this.f4519j).f11005a) {
                    X x6 = ((W) this.f4519j).f11005a;
                    C0854t c0854t2 = (C0854t) this.i;
                    Logger logger6 = X.f11006f;
                    x6.getClass();
                    InetSocketAddress inetSocketAddress4 = c0854t2.f11148g;
                    if (inetSocketAddress4 != null) {
                        x6.f11008b.remove(inetSocketAddress4, c0854t2);
                        c0854t2.g(null);
                    }
                    X x7 = ((W) this.f4519j).f11005a;
                    C0854t c0854t3 = (C0854t) this.i;
                    x7.getClass();
                    p5.C c7 = c0854t3.i;
                    if (c7 != null) {
                        x7.f11009c.remove(c7.i, c0854t3);
                        t5.c.c(c7);
                    }
                    ((W) this.f4519j).f11005a.getClass();
                    break;
                }
                return;
            case 21:
                ((X) this.f4519j).g((C0854t) this.i, false);
                return;
            default:
                InetSocketAddress inetSocketAddress5 = (InetSocketAddress) this.f4519j;
                C0854t c0854t4 = (C0854t) this.i;
                if (c0854t4.a(inetSocketAddress5)) {
                    c0854t4.g(null);
                    return;
                }
                return;
        }
        do {
            try {
                ((Runnable) this.i).run();
            } catch (Throwable th5) {
                AbstractC0336x.k(th5, p111u4.j.f12751h);
            }
            gVar = (U4.g) this.f4519j;
            Runnable runnableZ = gVar.Z();
            if (runnableZ == null) {
                return;
            }
            this.i = runnableZ;
            i++;
        } while (i < 16);
        W4.l lVar = gVar.f5357j;
        lVar.getClass();
        lVar.X(gVar, this);
    }

    public /* synthetic */ n(Object obj, int i, Object obj2) {
        this.f4518h = i;
        this.i = obj;
        this.f4519j = obj2;
    }

    public n(View view, O o6, C0495p c0495p, ValueAnimator valueAnimator) {
        this.f4518h = 12;
        this.i = view;
        this.f4519j = valueAnimator;
    }

    public n(Q q6, p5.A a6) {
        this.f4518h = 19;
        n nVar = new n(q6, 18, a6);
        this.f4519j = q6;
        this.i = nVar;
    }
}

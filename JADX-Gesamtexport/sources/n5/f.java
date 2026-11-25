package n5;

import O1.n;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import m5.q;
import m5.s;
import org.slf4j.Logger;
import org.slf4j.MDC;
import p5.C0854t;
import p5.C0855u;
import p5.EnumC0835a;
import p5.EnumC0837b;
import p5.EnumC0857w;
import p5.c0;
import p5.i0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Thread {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g f10582h;
    public final DatagramPacket i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f10583j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, String str) {
        super(m5.f.f10445l, str);
        this.f10583j = gVar;
        this.f10582h = gVar;
        this.i = new DatagramPacket(new byte[gVar.f10602p], gVar.f10602p);
    }

    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0191  */
    /* JADX WARN: Code duplicated, block: B:63:0x0199  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x01da  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f5  */
    public final void a() throws IOException {
        g gVar;
        int i;
        g gVar2;
        Logger logger;
        i0 i0Var;
        C0855u c0855u;
        C0854t c0854tC;
        q qVar;
        int size;
        int i3;
        i0 i0Var2;
        Logger logger2;
        EnumC0857w enumC0857w;
        ArrayList arrayList;
        int i6 = 8;
        MDC.clear();
        this.i.setLength(this.f10583j.f10602p);
        g gVar3 = this.f10583j;
        DatagramPacket datagramPacket = this.i;
        DatagramSocket datagramSocket = gVar3.f10605s;
        if (datagramSocket == null) {
            return;
        }
        datagramSocket.receive(datagramPacket);
        if (datagramPacket.getLength() == 0) {
            return;
        }
        InetSocketAddress inetSocketAddress = new InetSocketAddress(datagramPacket.getAddress(), datagramPacket.getPort());
        MDC.put("PEER", s.d(inetSocketAddress));
        long jNanoTime = System.nanoTime();
        m5.h hVar = new m5.h(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength());
        Logger logger3 = i0.f11072k;
        int iA = hVar.a() / 8;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            if (hVar.b()) {
                int iA2 = hVar.a();
                Logger logger4 = i0.f11072k;
                if (iA2 < 104) {
                    logger4.debug("Received truncated DTLS record(s). Discarding ...");
                } else {
                    int iE = hVar.e(i6);
                    c0 c0VarA = c0.a(hVar.e(i6), hVar.e(i6));
                    int iE2 = hVar.e(16);
                    int i7 = i6;
                    long j4 = 0;
                    if (hVar.f10450c < 0) {
                        int i8 = 0;
                        i = 1;
                        while (i8 < 48) {
                            long j6 = j4 << i7;
                            int i9 = hVar.f10448a.read();
                            if (i9 < 0) {
                                throw new IllegalArgumentException("requested byte exceeds available bytes!");
                            }
                            j4 = j6 | ((long) i9);
                            i8 += 8;
                            gVar3 = gVar3;
                        }
                        gVar = gVar3;
                    } else {
                        gVar = gVar3;
                        i = 1;
                        for (int i10 = 47; i10 >= 0; i10--) {
                            if (hVar.f10450c < 0) {
                                int i11 = hVar.f10448a.read();
                                if (i11 < 0) {
                                    throw new IllegalArgumentException("requested byte exceeds available bytes!");
                                }
                                hVar.f10449b = (byte) i11;
                                hVar.f10450c = 7;
                            }
                            byte b6 = hVar.f10449b;
                            int i12 = hVar.f10450c;
                            if (((b6 >> i12) & 1) != 0) {
                                j4 |= 1 << i10;
                            }
                            hVar.f10450c = i12 - 1;
                        }
                    }
                    if (iE == 25) {
                        logger4.debug("Received TLS_CID record, but cid is not supported. Discarding ...");
                    } else {
                        int iE3 = hVar.e(16);
                        int iA3 = hVar.a() / 8;
                        if (iA3 < iE3) {
                            logger4.debug("Received truncated DTLS record(s) ({} bytes, but only {} available). {} records, {} bytes. Discarding ...", Integer.valueOf(iE3), Integer.valueOf(iA3), Integer.valueOf(arrayList2.size()), Integer.valueOf(iA));
                        } else {
                            byte[] bArrF = hVar.f(iE3);
                            switch (iE) {
                                case 20:
                                    enumC0857w = EnumC0857w.CHANGE_CIPHER_SPEC;
                                    break;
                                case 21:
                                    enumC0857w = EnumC0857w.ALERT;
                                    break;
                                case 22:
                                    enumC0857w = EnumC0857w.HANDSHAKE;
                                    break;
                                case 23:
                                    enumC0857w = EnumC0857w.APPLICATION_DATA;
                                    break;
                                case 24:
                                default:
                                    enumC0857w = null;
                                    break;
                                case 25:
                                    enumC0857w = EnumC0857w.TLS12_CID;
                                    break;
                            }
                            if (enumC0857w == null) {
                                logger4.debug("Received DTLS record of unsupported type [{}]. Discarding ...", Integer.valueOf(iE));
                                arrayList = arrayList2;
                            } else {
                                arrayList = arrayList2;
                                i0 i0Var3 = new i0(c0VarA, iE2, j4, jNanoTime, inetSocketAddress, !arrayList.isEmpty());
                                i0Var3.f11073a = enumC0857w;
                                i0Var3.i = null;
                                i0Var3.f11080h = bArrF;
                                arrayList.add(i0Var3);
                            }
                            arrayList2 = arrayList;
                            i6 = i7;
                            gVar3 = gVar;
                        }
                    }
                }
                gVar2 = gVar;
                Object[] objArr = {Integer.valueOf(arrayList2.size()), inetSocketAddress, Integer.valueOf(gVar2.f10602p)};
                logger = g.f10586y;
                logger.trace("Received {} DTLS records from {} using a {} byte datagram buffer", objArr);
                if (arrayList2.isEmpty()) {
                    return;
                }
                if (!gVar2.f10607u.get()) {
                    logger.debug("Execution shutdown while processing incoming records from peer: {}", inetSocketAddress);
                    return;
                }
                i0Var = (i0) arrayList2.get(0);
                if (arrayList2.size() != i && i0Var.e()) {
                    gVar2.f10609w.execute(new n(16, (Object) gVar2, (Object) i0Var, false));
                    return;
                }
                c0855u = i0Var.i;
                c0854tC = gVar2.c(inetSocketAddress, c0855u, false);
                if (c0854tC == null) {
                    logger2 = g.f10587z;
                    if (c0855u == null) {
                        logger2.trace("Discarding {} records from [{}] received without existing connection", Integer.valueOf(arrayList2.size()), inetSocketAddress);
                        return;
                    } else {
                        logger2.trace("Discarding {} records from [{},{}] received without existing connection", Integer.valueOf(arrayList2.size()), inetSocketAddress, c0855u);
                        return;
                    }
                }
                qVar = c0854tC.f11147f;
                size = arrayList2.size();
                i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    i0Var2 = (i0) obj;
                    try {
                        qVar.execute(new b(gVar2, i0Var2, c0854tC, 0));
                    } catch (RejectedExecutionException e6) {
                        logger.debug("Execution rejected while processing record [type: {}, peer: {}]", i0Var2.f11073a, inetSocketAddress, e6);
                        return;
                    } catch (RuntimeException e7) {
                        logger.warn("Unexpected error occurred while processing record [type: {}, peer: {}]", i0Var2.f11073a, inetSocketAddress, e7);
                        gVar2.w(c0854tC, EnumC0837b.FATAL, EnumC0835a.INTERNAL_ERROR);
                        return;
                    }
                }
                return;
            }
            gVar = gVar3;
            i = 1;
            gVar2 = gVar;
            Object[] objArr2 = {Integer.valueOf(arrayList2.size()), inetSocketAddress, Integer.valueOf(gVar2.f10602p)};
            logger = g.f10586y;
            logger.trace("Received {} DTLS records from {} using a {} byte datagram buffer", objArr2);
            if (arrayList2.isEmpty()) {
                return;
            }
            if (!gVar2.f10607u.get()) {
                logger.debug("Execution shutdown while processing incoming records from peer: {}", inetSocketAddress);
                return;
            }
            i0Var = (i0) arrayList2.get(0);
            if (arrayList2.size() != i) {
            }
            c0855u = i0Var.i;
            c0854tC = gVar2.c(inetSocketAddress, c0855u, false);
            if (c0854tC == null) {
                logger2 = g.f10587z;
                if (c0855u == null) {
                    logger2.trace("Discarding {} records from [{}] received without existing connection", Integer.valueOf(arrayList2.size()), inetSocketAddress);
                    return;
                } else {
                    logger2.trace("Discarding {} records from [{},{}] received without existing connection", Integer.valueOf(arrayList2.size()), inetSocketAddress, c0855u);
                    return;
                }
            }
            qVar = c0854tC.f11147f;
            size = arrayList2.size();
            i3 = 0;
            while (i3 < size) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                i0Var2 = (i0) obj2;
                qVar.execute(new b(gVar2, i0Var2, c0854tC, 0));
            }
            return;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        g gVar = this.f10582h;
        try {
            g.f10586y.info("Starting worker thread [{}]", getName());
            while (gVar.f10607u.get()) {
                try {
                    a();
                } catch (InterruptedIOException unused) {
                    if (gVar.f10607u.get()) {
                        g.f10586y.info("Worker thread [{}] has been interrupted", getName());
                    }
                } catch (InterruptedException unused2) {
                    if (gVar.f10607u.get()) {
                        g.f10586y.info("Worker thread [{}] has been interrupted", getName());
                    }
                } catch (Exception e6) {
                    if (gVar.f10607u.get()) {
                        g.f10586y.debug("Exception thrown by worker thread [{}]", getName(), e6);
                    }
                }
            }
            g.f10586y.info("Worker thread [{}] has terminated", getName());
        } catch (Throwable th) {
            g.f10586y.info("Worker thread [{}] has terminated", getName());
            throw th;
        }
    }
}

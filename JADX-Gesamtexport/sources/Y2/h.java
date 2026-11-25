package Y2;

import B.C0025m0;
import B.C0031p0;
import D.x;
import O1.E;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import p080p.C0833e;
import p080p.C0834f;

/* JADX INFO: loaded from: classes.dex */
public final class h implements X2.c, X2.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X2.a f5893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f5894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f5895d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5899h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c f5901k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f5892a = new LinkedList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f5896e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f5897f = new HashMap();
    public final ArrayList i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public W2.a f5900j = null;

    public h(c cVar, p010b3.c cVar2) {
        this.f5901k = cVar;
        Looper looper = cVar.f5886m.getLooper();
        cVar2.getClass();
        C0031p0 c0031p0 = new C0031p0(19, false);
        Set set = Collections.EMPTY_SET;
        if (((C0834f) c0031p0.i) == null) {
            c0031p0.i = new C0834f(null);
        }
        ((C0834f) c0031p0.i).addAll(set);
        Context context = cVar2.f7096a;
        c0031p0.f395k = context.getClass().getName();
        c0031p0.f394j = context.getPackageName();
        C0031p0 c0031p1 = new C0031p0((C0834f) c0031p0.i, (String) c0031p0.f394j, (String) c0031p0.f395k);
        p010b3.b bVar = (p010b3.b) cVar2.f7098c.i;
        Z2.n.b(bVar);
        Z2.i iVar = cVar2.f7099d;
        Context context2 = cVar2.f7096a;
        bVar.getClass();
        p010b3.d dVar = new p010b3.d(context2, looper, c0031p1, iVar, this, this);
        String str = cVar2.f7097b;
        if (str != null) {
            dVar.f7798r = str;
        }
        this.f5893b = dVar;
        this.f5894c = cVar2.f7100e;
        this.f5895d = new x(23);
        this.f5898g = cVar2.f7101f;
    }

    @Override // X2.d
    public final void a(W2.a aVar) {
        o(aVar, null);
    }

    @Override // X2.c
    public final void b(int i) {
        Looper looperMyLooper = Looper.myLooper();
        c cVar = this.f5901k;
        if (looperMyLooper == cVar.f5886m.getLooper()) {
            i(i);
        } else {
            cVar.f5886m.post(new g(this, i));
        }
    }

    @Override // X2.c
    public final void c() {
        Looper looperMyLooper = Looper.myLooper();
        c cVar = this.f5901k;
        if (looperMyLooper == cVar.f5886m.getLooper()) {
            h();
        } else {
            cVar.f5886m.post(new L2.o(3, this));
        }
    }

    public final void d(W2.a aVar) {
        HashSet hashSet = this.f5896e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (Z2.n.d(aVar, W2.a.f5568m)) {
                this.f5893b.g();
            }
            throw null;
        }
    }

    public final void e(Status status) {
        Z2.n.a(this.f5901k.f5886m);
        f(status, null, false);
    }

    public final void f(Status status, RuntimeException runtimeException, boolean z5) {
        Z2.n.a(this.f5901k.f5886m);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f5892a.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            if (!z5 || lVar.f5906a == 2) {
                if (status != null) {
                    lVar.c(status);
                } else {
                    lVar.d(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void g() {
        LinkedList linkedList = this.f5892a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            l lVar = (l) arrayList.get(i);
            if (!this.f5893b.isConnected()) {
                return;
            }
            if (k(lVar)) {
                linkedList.remove(lVar);
            }
        }
    }

    public final void h() {
        c cVar = this.f5901k;
        Z2.n.a(cVar.f5886m);
        this.f5900j = null;
        d(W2.a.f5568m);
        if (this.f5899h) {
            p038g3.d dVar = cVar.f5886m;
            a aVar = this.f5894c;
            dVar.removeMessages(11, aVar);
            cVar.f5886m.removeMessages(9, aVar);
            this.f5899h = false;
        }
        Iterator it = this.f5897f.values().iterator();
        if (it.hasNext()) {
            throw p138z3.b.a(it);
        }
        g();
        j();
    }

    public final void i(int i) {
        c cVar = this.f5901k;
        Z2.n.a(cVar.f5886m);
        this.f5900j = null;
        this.f5899h = true;
        String strH = this.f5893b.h();
        x xVar = this.f5895d;
        xVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strH != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strH);
        }
        xVar.p(true, new Status(20, sb.toString(), null, null));
        p038g3.d dVar = cVar.f5886m;
        a aVar = this.f5894c;
        dVar.sendMessageDelayed(Message.obtain(dVar, 9, aVar), 5000L);
        p038g3.d dVar2 = cVar.f5886m;
        dVar2.sendMessageDelayed(Message.obtain(dVar2, 11, aVar), 120000L);
        ((SparseIntArray) cVar.f5881g.i).clear();
        Iterator it = this.f5897f.values().iterator();
        if (it.hasNext()) {
            throw p138z3.b.a(it);
        }
    }

    public final void j() {
        c cVar = this.f5901k;
        p038g3.d dVar = cVar.f5886m;
        a aVar = this.f5894c;
        dVar.removeMessages(12, aVar);
        p038g3.d dVar2 = cVar.f5886m;
        dVar2.sendMessageDelayed(dVar2.obtainMessage(12, aVar), cVar.f5875a);
    }

    public final boolean k(l lVar) {
        W2.c cVar;
        if (lVar == null) {
            X2.a aVar = this.f5893b;
            lVar.f(this.f5895d, aVar.j());
            try {
                lVar.e(this);
                return true;
            } catch (DeadObjectException unused) {
                b(1);
                aVar.c("DeadObjectException thrown while running ApiCallRunner.");
            }
        } else {
            W2.c[] cVarArrB = lVar.b(this);
            if (cVarArrB == null || cVarArrB.length == 0) {
                cVar = null;
                break;
            }
            W2.c[] cVarArrF = this.f5893b.f();
            if (cVarArrF == null) {
                cVarArrF = new W2.c[0];
            }
            C0833e c0833e = new C0833e(cVarArrF.length);
            for (W2.c cVar2 : cVarArrF) {
                c0833e.put(cVar2.f5575h, Long.valueOf(cVar2.a()));
            }
            int length = cVarArrB.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    cVar = null;
                    break;
                }
                cVar = cVarArrB[i];
                Long l6 = (Long) c0833e.get(cVar.f5575h);
                if (l6 == null || l6.longValue() < cVar.a()) {
                    break;
                }
                i++;
            }
            if (cVar != null) {
                this.f5893b.getClass();
                if (!this.f5901k.f5887n || !lVar.a(this)) {
                    lVar.d(new UnsupportedApiCallException(cVar));
                    return true;
                }
                i iVar = new i(this.f5894c, cVar);
                int iIndexOf = this.i.indexOf(iVar);
                if (iIndexOf >= 0) {
                    i iVar2 = (i) this.i.get(iIndexOf);
                    this.f5901k.f5886m.removeMessages(15, iVar2);
                    p038g3.d dVar = this.f5901k.f5886m;
                    dVar.sendMessageDelayed(Message.obtain(dVar, 15, iVar2), 5000L);
                } else {
                    this.i.add(iVar);
                    p038g3.d dVar2 = this.f5901k.f5886m;
                    dVar2.sendMessageDelayed(Message.obtain(dVar2, 15, iVar), 5000L);
                    p038g3.d dVar3 = this.f5901k.f5886m;
                    dVar3.sendMessageDelayed(Message.obtain(dVar3, 16, iVar), 120000L);
                    W2.a aVar2 = new W2.a(2, null, null);
                    if (!l(aVar2)) {
                        this.f5901k.a(aVar2, this.f5898g);
                    }
                }
                return false;
            }
            X2.a aVar3 = this.f5893b;
            lVar.f(this.f5895d, aVar3.j());
            try {
                lVar.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                b(1);
                aVar3.c("DeadObjectException thrown while running ApiCallRunner.");
            }
        }
        return true;
    }

    public final boolean l(W2.a aVar) {
        synchronized (c.f5873q) {
            this.f5901k.getClass();
        }
        return false;
    }

    public final void m() {
        c cVar = this.f5901k;
        Z2.n.a(cVar.f5886m);
        X2.a aVar = this.f5893b;
        if (aVar.isConnected() || aVar.isConnecting()) {
            return;
        }
        try {
            x xVar = cVar.f5881g;
            Context context = cVar.f5879e;
            xVar.getClass();
            Z2.n.b(context);
            int iE = aVar.e();
            SparseIntArray sparseIntArray = (SparseIntArray) xVar.i;
            int iB = sparseIntArray.get(iE, -1);
            if (iB == -1) {
                iB = 0;
                int i = 0;
                while (true) {
                    if (i >= sparseIntArray.size()) {
                        iB = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i);
                    if (iKeyAt > iE && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (iB == -1) {
                    iB = ((W2.d) xVar.f707j).b(context, iE);
                }
                sparseIntArray.put(iE, iB);
            }
            if (iB != 0) {
                W2.a aVar2 = new W2.a(iB, null, null);
                aVar2.toString();
                o(aVar2, null);
                return;
            }
            E e6 = new E(cVar, aVar, this.f5894c);
            if (aVar.j()) {
                Z2.n.b(null);
                throw null;
            }
            try {
                aVar.b(e6);
            } catch (SecurityException e7) {
                o(new W2.a(10, null, null), e7);
            }
        } catch (IllegalStateException e8) {
            o(new W2.a(10, null, null), e8);
        }
    }

    public final void n(l lVar) {
        Z2.n.a(this.f5901k.f5886m);
        boolean zIsConnected = this.f5893b.isConnected();
        LinkedList linkedList = this.f5892a;
        if (zIsConnected) {
            if (k(lVar)) {
                j();
                return;
            } else {
                linkedList.add(lVar);
                return;
            }
        }
        linkedList.add(lVar);
        W2.a aVar = this.f5900j;
        if (aVar == null || aVar.i == 0 || aVar.f5570j == null) {
            m();
        } else {
            o(aVar, null);
        }
    }

    public final void o(W2.a aVar, RuntimeException runtimeException) {
        Z2.n.a(this.f5901k.f5886m);
        Z2.n.a(this.f5901k.f5886m);
        this.f5900j = null;
        ((SparseIntArray) this.f5901k.f5881g.i).clear();
        d(aVar);
        if ((this.f5893b instanceof p010b3.d) && aVar.i != 24) {
            c cVar = this.f5901k;
            cVar.f5876b = true;
            p038g3.d dVar = cVar.f5886m;
            dVar.sendMessageDelayed(dVar.obtainMessage(19), 300000L);
        }
        if (aVar.i == 4) {
            e(c.f5872p);
            return;
        }
        if (this.f5892a.isEmpty()) {
            this.f5900j = aVar;
            return;
        }
        if (runtimeException != null) {
            Z2.n.a(this.f5901k.f5886m);
            f(null, runtimeException, false);
            return;
        }
        if (!this.f5901k.f5887n) {
            e(c.b(this.f5894c, aVar));
            return;
        }
        f(c.b(this.f5894c, aVar), null, true);
        if (this.f5892a.isEmpty() || l(aVar) || this.f5901k.a(aVar, this.f5898g)) {
            return;
        }
        if (aVar.i == 18) {
            this.f5899h = true;
        }
        if (!this.f5899h) {
            e(c.b(this.f5894c, aVar));
            return;
        }
        c cVar2 = this.f5901k;
        a aVar2 = this.f5894c;
        p038g3.d dVar2 = cVar2.f5886m;
        dVar2.sendMessageDelayed(Message.obtain(dVar2, 9, aVar2), 5000L);
    }

    public final void p() {
        Z2.n.a(this.f5901k.f5886m);
        Status status = c.f5871o;
        e(status);
        this.f5895d.p(false, status);
        for (d dVar : (d[]) this.f5897f.keySet().toArray(new d[0])) {
            n(new q(new p060l3.b()));
        }
        d(new W2.a(4, null, null));
        X2.a aVar = this.f5893b;
        if (aVar.isConnected()) {
            aVar.d(new C0025m0(14, this));
        }
    }
}

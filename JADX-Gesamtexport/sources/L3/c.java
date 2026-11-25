package L3;

import K4.e;
import M4.s;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Timer;
import v5.g;
import v5.k;
import v5.n;
import v5.q;
import w5.X;

/* JADX INFO: loaded from: classes.dex */
public final class c implements g, J3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f3090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f3091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f3092c;

    public c() {
        q qVar = new q(this);
        this.f3090a = qVar;
        this.f3091b = new ArrayList();
        this.f3092c = true;
        qVar.b();
        G4.a.f1691d = new J2.b(1, new defpackage.d(1));
    }

    @Override // v5.g
    public final void a(k kVar, n nVar, Object obj, Object obj2) {
        E4.k.f("light", kVar);
        E4.k.f("property", nVar);
        ArrayList arrayList = this.f3091b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            D3.c cVar = (D3.c) obj3;
            if (E4.k.a(cVar.f799a, String.valueOf(kVar.f13331k))) {
                e[] eVarArr = k.f13326E;
                cVar.f800b = (String) kVar.f13340t.h(kVar, eVarArr[1]);
                cVar.f801c = s.U(new String(((X) kVar.f13343w.h(kVar, eVarArr[4])).f13551b, M4.a.f3520a), "\u0000", "");
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final void b(d dVar, int i) {
        Object obj;
        if (this.f3092c) {
            ArrayList arrayList = this.f3091b;
            int size = arrayList.size();
            int i3 = 0;
            do {
                if (i3 >= size) {
                    obj = null;
                    break;
                } else {
                    obj = arrayList.get(i3);
                    i3++;
                }
            } while (!E4.k.a(dVar.id, ((D3.c) obj).f799a));
            D3.c cVar = (D3.c) obj;
            if (cVar == null) {
                if (i >= 0) {
                    new Handler(Looper.getMainLooper()).postDelayed(new I1.a(this, dVar, i), 2000L);
                    return;
                } else {
                    dVar.a(null);
                    return;
                }
            }
            cVar.i();
            String strI = cVar.i();
            if (strI != null) {
                dVar.ip = strI;
            }
            String str = cVar.f800b;
            if (str != null) {
                dVar.name = str;
            }
            dVar.a(cVar);
        }
    }

    @Override // J3.a
    public final boolean checkOrConnect(K3.a aVar) {
        if (!(aVar instanceof d)) {
            return false;
        }
        d dVar = (d) aVar;
        dVar.f3093a = K3.b.f2129j;
        K3.c cVar = dVar.delegate;
        if (cVar != null) {
            ((J3.e) cVar).b();
        }
        b(dVar, 20);
        return true;
    }

    @Override // J3.a
    public final void restart() {
        this.f3092c = true;
        this.f3090a.c();
        this.f3090a.b();
    }

    @Override // J3.a
    public final void scan(D4.c cVar) {
        new Timer().schedule(new b(this, (J3.b) cVar, 0), 10000L);
    }

    @Override // J3.a
    public final void stop() {
        this.f3092c = false;
        this.f3090a.c();
    }
}

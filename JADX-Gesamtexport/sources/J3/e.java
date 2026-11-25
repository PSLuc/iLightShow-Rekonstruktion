package J3;

import B.C0031p0;
import D.x;
import D3.j;
import E4.k;
import M4.l;
import N.C0208d;
import P4.AbstractC0314a;
import P4.AbstractC0336x;
import P4.D;
import P4.c0;
import P4.i0;
import X.s;
import X.y;
import android.os.Handler;
import android.os.Looper;
import com.nanjoran.ilightshow.Services.M;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p089q4.r;
import p111u4.i;

/* JADX INFO: loaded from: classes.dex */
public final class e implements K3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0031p0 f1931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f1932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f1933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f1934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a[] f1935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public M f1936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1937g;

    public final void a() {
        a[] aVarArr = this.f1935e;
        for (a aVar : aVarArr) {
            aVar.restart();
        }
        ArrayList arrayList = new ArrayList(this.f1932b);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            K3.a aVar2 = (K3.a) obj;
            aVar2.delegate = this;
            if (aVar2.getState() != K3.b.f2128h) {
                int length = aVarArr.length;
                for (int i3 = 0; i3 < length && !aVarArr[i3].checkOrConnect(aVar2); i3++) {
                }
            }
        }
    }

    public final void b() {
        new Handler(Looper.getMainLooper()).post(new I3.a(1, this));
    }

    public final void c() {
        K3.a aVar;
        K3.d dVar;
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ListIterator listIterator = this.f1932b.listIterator();
        while (true) {
            y yVar = (y) listIterator;
            if (!yVar.hasNext()) {
                break;
            } else {
                r.R(arrayList2, ((K3.a) yVar.next()).getLights());
            }
        }
        arrayList.addAll(arrayList2);
        x xVar = M.f8305O.f8324k;
        if (xVar != null) {
            Iterator it = arrayList.iterator();
            k.e("iterator(...)", it);
            while (it.hasNext()) {
                Object next = it.next();
                k.e("next(...)", next);
                j jVar = (j) next;
                if (jVar.f806h == null) {
                    D3.h hVar = (D3.h) ((HashMap) xVar.f707j).get(jVar.b());
                    if (hVar == null) {
                        hVar = new D3.h(jVar.b());
                        ((HashMap) xVar.f707j).put(jVar.b(), hVar);
                    }
                    jVar.f806h = hVar;
                    WeakReference weakReference = jVar.f805g;
                    if (weakReference != null && (aVar = (K3.a) weakReference.get()) != null && (dVar = aVar.type) != null && dVar.a() && (str = hVar.f793h) != null && !l.i0(str)) {
                        jVar.f801c = hVar.f793h;
                    }
                }
            }
        }
        this.f1933c = C0208d.U(arrayList);
        M.f8305O.b();
    }

    public final void d(boolean z5) {
        if (!z5) {
            this.f1937g = false;
        }
        int i = this.f1934d + 1;
        this.f1934d = i;
        d dVar = new d(this, i, this, null);
        int i3 = 3 & 1;
        p111u4.j jVar = p111u4.j.f12751h;
        p111u4.j jVar2 = i3 != 0 ? jVar : null;
        int i6 = (3 & 2) != 0 ? 1 : 4;
        i iVarG = AbstractC0336x.g(jVar, jVar2, true);
        W4.d dVar2 = D.f4604a;
        if (iVarG != dVar2 && iVarG.J(p111u4.e.f12750h) == null) {
            iVarG = iVarG.o(dVar2);
        }
        if (i6 == 0) {
            throw null;
        }
        AbstractC0314a c0Var = i6 == 2 ? new c0(iVarG, dVar) : new i0(iVarG, true);
        c0Var.f0(i6, c0Var, dVar);
    }

    public final void e(List list) {
        k.f("devices", list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            K3.a aVar = (K3.a) obj;
            k.c(aVar);
            if (aVar.getState() == K3.b.f2128h) {
                arrayList.add(aVar);
            }
        }
        C0031p0 c0031p0 = this.f1931a;
        if (c0031p0 != null) {
            Iterator it = arrayList.iterator();
            k.e("iterator(...)", it);
            while (it.hasNext()) {
                Object next = it.next();
                k.e("next(...)", next);
                K3.a aVar2 = (K3.a) next;
                Iterator it2 = ((ArrayList) c0031p0.f394j).iterator();
                k.e("iterator(...)", it2);
                K3.a aVar3 = null;
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    k.e("next(...)", next2);
                    K3.a aVar4 = (K3.a) next2;
                    String str = aVar4.id;
                    if (str != null && str.equals(aVar2.id)) {
                        aVar3 = aVar4;
                    }
                }
                if (aVar3 != null) {
                    aVar3.ip = aVar2.ip;
                } else {
                    ((ArrayList) c0031p0.f394j).add(aVar2);
                }
            }
            c0031p0.q();
        }
    }
}

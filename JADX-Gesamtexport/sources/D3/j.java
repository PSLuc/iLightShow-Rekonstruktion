package D3;

import P4.AbstractC0336x;
import P4.D;
import P4.c0;
import P4.i0;
import X.s;
import X.y;
import com.nanjoran.ilightshow.Services.M;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f802d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WeakReference f805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h f806h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f807j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i0 f808k;

    public static /* synthetic */ void h(j jVar, d dVar, Double d6, boolean z5, int i) {
        if ((i & 2) != 0) {
            d6 = null;
        }
        if ((i & 4) != 0) {
            z5 = false;
        }
        jVar.g(dVar, d6, z5, true);
    }

    public abstract void a(d dVar);

    public final String b() {
        String str;
        K3.a aVar;
        String str2 = this.f799a;
        WeakReference weakReference = this.f805g;
        if (weakReference == null || (aVar = (K3.a) weakReference.get()) == null || (str = aVar.id) == null) {
            str = this.f799a;
        }
        return str2 + "#" + str;
    }

    public final ArrayList c() {
        s sVar = M.f8305O.f8334u;
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = sVar.listIterator();
        while (true) {
            y yVar = (y) listIterator;
            if (!yVar.hasNext()) {
                return arrayList;
            }
            Object next = yVar.next();
            h hVar = ((j) next).f806h;
            if (E4.k.a(hVar != null ? hVar.i : null, this.f799a)) {
                arrayList.add(next);
            }
        }
    }

    public boolean d() {
        return true;
    }

    public void e() {
    }

    public final void f(d dVar) {
        E4.k.f("lightCommand", dVar);
        d dVarA = d.a(dVar);
        dVarA.f768b = Math.max(0, dVarA.f768b);
        h hVar = this.f806h;
        a aVar = dVarA.f767a;
        if (hVar != null && aVar != null) {
            double d6 = aVar.f763c;
            double d7 = hVar.f786a;
            aVar.f763c = (int) ((((((double) hVar.f787b) - d7) * (d6 - 0.0d)) / 255.0d) + d7);
        }
        if (hVar == null || !hVar.f792g) {
            a aVar2 = this.f807j;
            boolean z5 = dVarA.f772f;
            if (aVar2 != null && !z5) {
                if (aVar != null) {
                    aVar.f761a = aVar2.f761a;
                }
                if (aVar != null) {
                    aVar.f762b = aVar2.f762b;
                }
            }
            if (z5 && dVarA.f773g) {
                this.f807j = aVar;
            }
        }
        a(dVarA);
    }

    public final void g(d dVar, Double d6, boolean z5, boolean z6) {
        if (z5 || this.f808k == null) {
            if (d6 == null) {
                this.f808k = null;
                f(dVar);
                return;
            }
            p111u4.i iVar = D.f4605b;
            D4.e iVar2 = new i(d6, this, dVar, null);
            int i = 2 & 1;
            p111u4.j jVar = p111u4.j.f12751h;
            if (i != 0) {
                iVar = jVar;
            }
            int i3 = (2 & 2) != 0 ? 1 : 4;
            p111u4.i iVarG = AbstractC0336x.g(jVar, iVar, true);
            W4.d dVar2 = D.f4604a;
            if (iVarG != dVar2 && iVarG.J(p111u4.e.f12750h) == null) {
                iVarG = iVarG.o(dVar2);
            }
            if (i3 == 0) {
                throw null;
            }
            i0 c0Var = i3 == 2 ? new c0(iVarG, iVar2) : new i0(iVarG, true);
            c0Var.f0(i3, c0Var, iVar2);
            if (z6) {
                this.f808k = c0Var;
            }
        }
    }
}

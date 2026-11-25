package S;

import E4.z;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class f extends d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f4865k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f4866l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4867m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4868n;

    public f(e eVar, o[] oVarArr) {
        super(eVar.f4861j, oVarArr);
        this.f4865k = eVar;
        this.f4868n = eVar.f4863l;
    }

    public final void c(int i, n nVar, Object obj, int i3) {
        int i6 = i3 * 5;
        o[] oVarArr = this.f4858h;
        if (i6 <= 30) {
            int iA = 1 << p020d2.n.A(i, i6);
            if (nVar.h(iA)) {
                oVarArr[i3].a(Integer.bitCount(nVar.f4875a) * 2, nVar.f(iA), nVar.f4878d);
                this.i = i3;
                return;
            }
            int iT = nVar.t(iA);
            n nVarS = nVar.s(iT);
            oVarArr[i3].a(Integer.bitCount(nVar.f4875a) * 2, iT, nVar.f4878d);
            c(i, nVarS, obj, i3 + 1);
            return;
        }
        o oVar = oVarArr[i3];
        Object[] objArr = nVar.f4878d;
        oVar.a(objArr.length, 0, objArr);
        while (true) {
            o oVar2 = oVarArr[i3];
            if (E4.k.a(oVar2.f4879h[oVar2.f4880j], obj)) {
                this.i = i3;
                return;
            } else {
                oVarArr[i3].f4880j += 2;
            }
        }
    }

    @Override // S.d, java.util.Iterator
    public final Object next() {
        if (this.f4865k.f4863l != this.f4868n) {
            throw new ConcurrentModificationException();
        }
        if (!this.f4859j) {
            throw new NoSuchElementException();
        }
        o oVar = this.f4858h[this.i];
        this.f4866l = oVar.f4879h[oVar.f4880j];
        this.f4867m = true;
        return super.next();
    }

    @Override // S.d, java.util.Iterator
    public final void remove() {
        if (!this.f4867m) {
            throw new IllegalStateException();
        }
        boolean z5 = this.f4859j;
        e eVar = this.f4865k;
        if (!z5) {
            z.c(eVar).remove(this.f4866l);
        } else {
            if (!z5) {
                throw new NoSuchElementException();
            }
            o oVar = this.f4858h[this.i];
            Object obj = oVar.f4879h[oVar.f4880j];
            z.c(eVar).remove(this.f4866l);
            c(obj != null ? obj.hashCode() : 0, eVar.f4861j, obj, 0);
        }
        this.f4866l = null;
        this.f4867m = false;
        this.f4868n = eVar.f4863l;
    }
}

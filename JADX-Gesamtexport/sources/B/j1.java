package B;

import G0.C0110f;

/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public D.x f344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public D.x f345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f348e;

    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    public final void a(M0.w wVar) {
        D.x xVar;
        this.f348e = false;
        D.x xVar2 = this.f344a;
        if (wVar.equals(xVar2 != null ? (M0.w) xVar2.f707j : null)) {
            return;
        }
        C0110f c0110f = wVar.f3453a;
        String str = c0110f.f1494h;
        D.x xVar3 = this.f344a;
        if (E4.k.a(str, xVar3 != null ? ((M0.w) xVar3.f707j).f3453a.f1494h : null)) {
            D.x xVar4 = this.f344a;
            if (xVar4 == null) {
                return;
            }
            xVar4.f707j = wVar;
            return;
        }
        this.f344a = new D.x(this.f344a, 1, wVar);
        this.f345b = null;
        int length = c0110f.f1494h.length() + this.f346c;
        this.f346c = length;
        if (length > 100000) {
            D.x xVar5 = this.f344a;
            if ((xVar5 != null ? (D.x) xVar5.i : null) == null) {
                return;
            }
            while (true) {
                if (xVar5 == null) {
                    xVar = null;
                } else {
                    D.x xVar6 = (D.x) xVar5.i;
                    if (xVar6 != null) {
                        xVar = (D.x) xVar6.i;
                    } else {
                        xVar = null;
                    }
                }
                if (xVar == null) {
                    break;
                } else {
                    xVar5 = (D.x) xVar5.i;
                }
            }
            if (xVar5 == null) {
                return;
            }
            xVar5.i = null;
        }
    }
}

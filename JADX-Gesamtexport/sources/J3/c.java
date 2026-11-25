package J3;

import E4.k;
import S1.V;
import X.s;
import X.y;
import a5.j;
import c5.C0502x;
import com.nanjoran.ilightshow.Services.M;
import java.util.ListIterator;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1925h;
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1926j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1927k;

    public /* synthetic */ c(int i, int i3, Object obj, Object obj2) {
        this.f1925h = i3;
        this.i = i;
        this.f1926j = obj;
        this.f1927k = obj2;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f1925h) {
            case 0:
                int i = this.i;
                e eVar = (e) this.f1926j;
                e eVar2 = (e) this.f1927k;
                if (i == eVar.f1934d) {
                    eVar.c();
                    s sVar = eVar.f1932b;
                    k.c(sVar);
                    ListIterator listIterator = sVar.listIterator();
                    while (true) {
                        y yVar = (y) listIterator;
                        if (yVar.hasNext()) {
                            K3.a aVar = (K3.a) yVar.next();
                            k.c(aVar);
                            aVar.delegate = eVar2;
                        } else {
                            eVar.e(eVar.f1932b);
                            M m6 = eVar.f1936f;
                            if (m6 != null) {
                                m6.t(eVar.f1932b, eVar.f1933c, eVar2);
                            }
                            eVar.a();
                        }
                    }
                }
                return x.f10867a;
            default:
                int i3 = this.i;
                a5.g[] gVarArr = new a5.g[i3];
                for (int i6 = 0; i6 < i3; i6++) {
                    gVarArr[i6] = V.s(((String) this.f1926j) + '.' + ((C0502x) this.f1927k).f7437e[i6], j.f6377m, new a5.g[0]);
                }
                return gVarArr;
        }
    }
}

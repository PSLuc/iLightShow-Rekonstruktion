package O1;

import B.C0025m0;
import c5.C0495p;
import com.nanjoran.ilightshow.Services.D0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4529b;

    public /* synthetic */ s(int i, Object obj) {
        this.f4528a = i;
        this.f4529b = obj;
    }

    public final void a(Object obj) {
        switch (this.f4528a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                C0025m0 c0025m0 = new C0025m0(arrayList);
                ((D0) this.f4529b).a((g) obj, c0025m0);
                return;
            case 1:
                ((J2.b) this.f4529b).d((g) obj);
                return;
            case 2:
                p031f1.c cVar = (p031f1.c) obj;
                if (cVar == null) {
                    cVar = new p031f1.c(-3);
                }
                ((C0495p) this.f4529b).v(cVar);
                return;
            default:
                p031f1.c cVar2 = (p031f1.c) obj;
                synchronized (p031f1.d.f8861c) {
                    try {
                        p080p.E e6 = p031f1.d.f8862d;
                        ArrayList arrayList2 = (ArrayList) e6.get((String) this.f4529b);
                        if (arrayList2 == null) {
                            return;
                        }
                        e6.remove((String) this.f4529b);
                        for (int i = 0; i < arrayList2.size(); i++) {
                            ((s) arrayList2.get(i)).a(cVar2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}

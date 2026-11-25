package Y2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5890h = 0;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f5891j;

    public g(h hVar, int i) {
        this.f5891j = hVar;
        this.i = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5890h) {
            case 0:
                ((h) this.f5891j).i(this.i);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f5891j;
                int size = arrayList.size();
                int i = 0;
                if (this.i == 1) {
                    while (i < size) {
                        ((p119w1.f) arrayList.get(i)).b();
                        i++;
                    }
                } else {
                    while (i < size) {
                        ((p119w1.f) arrayList.get(i)).a();
                        i++;
                    }
                }
                break;
        }
    }

    public g(List list, int i, Throwable th) {
        G4.a.n("initCallbacks cannot be null", list);
        this.f5891j = new ArrayList(list);
        this.i = i;
    }
}

package H3;

import O1.C0310c;
import com.nanjoran.ilightshow.Services.E0;
import com.nanjoran.ilightshow.Services.M;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public final class c extends TimerTask {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1778h;
    public final /* synthetic */ Object i;

    public /* synthetic */ c(int i, Object obj) {
        this.f1778h = i;
        this.i = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        Object obj = this.i;
        switch (this.f1778h) {
            case 0:
                if (M.f8305O.i()) {
                    ((d) obj).d();
                }
                break;
            case 1:
                if (M.f8305O.i()) {
                    int i = j.f1793n;
                    j.g((j) obj);
                    break;
                }
                break;
            default:
                E0 e6 = (E0) obj;
                C0310c c0310c = e6.f8251j;
                if (c0310c != null) {
                    if (!(c0310c.f4486y ? true : c0310c.o())) {
                        e6.f();
                        break;
                    }
                }
                break;
        }
    }
}

package O1;

import android.os.Handler;
import com.nanjoran.ilightshow.Services.D0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4530h;
    public Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f4531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f4532k;

    public /* synthetic */ t() {
        this.f4530h = 2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        switch (this.f4530h) {
            case 0:
                super/*O1.c*/.c((j) this.f4531j, (D0) this.f4532k);
                break;
            case 1:
                super/*O1.c*/.a((C0308a) this.f4531j, (J2.b) this.f4532k);
                break;
            default:
                try {
                    objCall = ((p031f1.b) this.i).call();
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.f4532k).post(new n((s) this.f4531j, 10, objCall));
                break;
        }
    }

    public /* synthetic */ t(x xVar, Object obj, Object obj2, int i) {
        this.f4530h = i;
        this.i = xVar;
        this.f4531j = obj;
        this.f4532k = obj2;
    }
}

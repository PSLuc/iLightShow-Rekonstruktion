package p012c;

import D4.a;
import E4.k;
import E4.l;
import I1.g;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.M;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class m extends l implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7154h;
    public final /* synthetic */ n i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, int i) {
        super(0);
        this.f7154h = i;
        this.i = nVar;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f7154h) {
            case 0:
                n nVar = this.i;
                return new M(nVar.getApplication(), nVar, nVar.getIntent() != null ? nVar.getIntent().getExtras() : null);
            case 1:
                this.i.reportFullyDrawn();
                return x.f10867a;
            case 2:
                n nVar2 = this.i;
                return new t(nVar2.f7160m, new m(nVar2, 1));
            default:
                n nVar3 = this.i;
                D d6 = new D(new RunnableC0466d(nVar3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (k.a(Looper.myLooper(), Looper.getMainLooper())) {
                        nVar3.getClass();
                        nVar3.f7156h.a(new C0469g(d6, nVar3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new g(nVar3, 4, d6));
                    }
                }
                return d6;
        }
    }
}

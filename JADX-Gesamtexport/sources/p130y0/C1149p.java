package p130y0;

import D4.a;
import E4.l;
import android.os.SystemClock;
import android.view.MotionEvent;
import p084p4.x;

/* JADX INFO: renamed from: y0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1149p extends l implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14438h;
    public final /* synthetic */ r i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1149p(r rVar, int i) {
        super(0);
        this.f14438h = i;
        this.i = rVar;
    }

    @Override // D4.a
    public final Object invoke() {
        int actionMasked;
        switch (this.f14438h) {
            case 0:
                r rVar = this.i;
                MotionEvent motionEvent = rVar.f14508t0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    rVar.u0 = SystemClock.uptimeMillis();
                    rVar.post(rVar.f14515x0);
                }
                return x.f10867a;
            default:
                return this.i.get_viewTreeOwners();
        }
    }
}

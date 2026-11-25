package p130y0;

import B.C0024m;
import D4.c;
import E4.l;
import android.view.accessibility.AccessibilityEvent;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class A extends l implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14175h;
    public final /* synthetic */ B i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(B b6, int i) {
        super(1);
        this.f14175h = i;
        this.i = b6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f14175h) {
            case 0:
                B b6 = this.i;
                return Boolean.valueOf(b6.f14188d.getParent().requestSendAccessibilityEvent(b6.f14188d, (AccessibilityEvent) obj));
            default:
                C1169z0 c1169z0 = (C1169z0) obj;
                B b7 = this.i;
                b7.getClass();
                if (c1169z0.i.contains(c1169z0)) {
                    b7.f14188d.getSnapshotObserver().a(c1169z0, b7.f14187M, new C0024m(c1169z0, 19, b7));
                }
                return x.f10867a;
        }
    }
}

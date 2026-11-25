package p130y0;

import D4.e;
import E4.l;
import N.C0230o;
import android.graphics.Matrix;
import android.view.View;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends l implements e {
    public static final Z i = new Z(2, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Z f14333j = new Z(2, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Z f14334k = new Z(2, 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14335h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(int i3, int i6) {
        super(i3);
        this.f14335h = i6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f14335h) {
            case 0:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o.B()) {
                    c0230o.P();
                }
                break;
            case 1:
                ((C1163w0) obj).f14540a.getMatrix((Matrix) obj2);
                break;
            default:
                ((Matrix) obj2).set(((View) obj).getMatrix());
                break;
        }
        return x.f10867a;
    }
}

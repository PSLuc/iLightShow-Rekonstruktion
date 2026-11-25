package p112v;

import D4.c;
import E4.l;
import N.C0208d;
import N.InterfaceC0225l0;
import N.W0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p091r0.q;

/* JADX INFO: renamed from: v.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0975e extends l implements c {
    public static final C0975e i = new C0975e(1, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0975e f12968j = new C0975e(1, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0975e f12969k = new C0975e(1, 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12970h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0975e(int i3, int i6) {
        super(i3);
        this.f12970h = i6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f12970h) {
            case 0:
                InterfaceC0225l0 interfaceC0225l0 = (InterfaceC0225l0) obj;
                W0 w6 = AndroidCompositionLocals_androidKt.f6730b;
                interfaceC0225l0.getClass();
                if (((Context) C0208d.L(interfaceC0225l0, w6)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return AbstractC0979g.f12973b;
                }
                InterfaceC0973d.f12967a.getClass();
                return C0971c.f12964c;
            case 1:
                return Boolean.TRUE;
            default:
                return Boolean.valueOf(!(((q) obj).i == 2));
        }
    }
}

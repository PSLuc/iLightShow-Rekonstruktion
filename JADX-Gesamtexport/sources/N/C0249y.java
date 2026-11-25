package N;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p112v.AbstractC0979g;
import p112v.C0971c;
import p112v.C0975e;
import p112v.InterfaceC0973d;

/* JADX INFO: renamed from: N.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0249y implements Y0 {
    @Override // N.Y0
    public final Object a(InterfaceC0225l0 interfaceC0225l0) {
        W0 w6 = AndroidCompositionLocals_androidKt.f6730b;
        interfaceC0225l0.getClass();
        if (((Context) C0208d.L(interfaceC0225l0, w6)).getPackageManager().hasSystemFeature("android.software.leanback")) {
            return AbstractC0979g.f12973b;
        }
        InterfaceC0973d.f12967a.getClass();
        return C0971c.f12964c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0249y)) {
            return false;
        }
        Object obj2 = C0975e.i;
        ((C0249y) obj).getClass();
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return C0975e.i.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + C0975e.i + ')';
    }
}

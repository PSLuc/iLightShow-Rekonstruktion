package p045i1;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class W extends V {
    public W(c0 c0Var, WindowInsets windowInsets) {
        super(c0Var, windowInsets);
    }

    @Override // p045i1.Z
    public c0 a() {
        return c0.b(null, this.f9427c.consumeDisplayCutout());
    }

    @Override // p045i1.Z
    public C0745f e() {
        DisplayCutout displayCutout = this.f9427c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0745f(displayCutout);
    }

    @Override // p045i1.Z
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w6 = (W) obj;
        return Objects.equals(this.f9427c, w6.f9427c) && Objects.equals(this.f9431g, w6.f9431g);
    }

    @Override // p045i1.Z
    public int hashCode() {
        return this.f9427c.hashCode();
    }
}

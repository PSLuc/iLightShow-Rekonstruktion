package V0;

import N.C0247x;
import com.philips.lighting.hue.sdk.wrapper.HueLog;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5403e;

    public B(int i, boolean z5, boolean z6) {
        C0247x c0247x = l.f5436a;
        int i3 = !z5 ? 262152 : 262144;
        i3 = i == 2 ? i3 | 8192 : i3;
        i3 = z6 ? i3 : i3 | HueLog.LogComponent.APPCORE;
        boolean z7 = i == 1;
        this.f5399a = i3;
        this.f5400b = z7;
        this.f5401c = true;
        this.f5402d = true;
        this.f5403e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b6 = (B) obj;
        return this.f5399a == b6.f5399a && this.f5400b == b6.f5400b && this.f5401c == b6.f5401c && this.f5402d == b6.f5402d && this.f5403e == b6.f5403e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + p012c.k.m(this.f5403e, p012c.k.m(this.f5402d, p012c.k.m(this.f5401c, p012c.k.m(this.f5400b, this.f5399a * 31, 31), 31), 31), 31);
    }
}

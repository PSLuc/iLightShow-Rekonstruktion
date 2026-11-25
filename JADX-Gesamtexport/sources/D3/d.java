package D3;

import com.philips.lighting.hue.sdk.wrapper.HueLog;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f774h;
    public final boolean i;

    public /* synthetic */ d(a aVar, int i, boolean z5, int i3, boolean z6, int i6) {
        this(aVar, i, true, z5, i3, (i6 & 32) != 0 ? true : z6, (i6 & 64) != 0, (i6 & 128) == 0, (i6 & HueLog.LogComponent.STREAMDTLS) != 0);
    }

    public static d a(d dVar) {
        a aVar = dVar.f767a;
        int i = dVar.f768b;
        boolean z5 = dVar.f769c;
        boolean z6 = dVar.f770d;
        int i3 = dVar.f771e;
        boolean z7 = dVar.f772f;
        boolean z8 = dVar.f773g;
        boolean z9 = dVar.f774h;
        boolean z10 = dVar.i;
        dVar.getClass();
        return new d(aVar, i, z5, z6, i3, z7, z8, z9, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return E4.k.a(this.f767a, dVar.f767a) && this.f768b == dVar.f768b && this.f769c == dVar.f769c && this.f770d == dVar.f770d && this.f771e == dVar.f771e && this.f772f == dVar.f772f && this.f773g == dVar.f773g && this.f774h == dVar.f774h && this.i == dVar.i;
    }

    public final int hashCode() {
        a aVar = this.f767a;
        return Boolean.hashCode(this.i) + p012c.k.m(this.f774h, p012c.k.m(this.f773g, p012c.k.m(this.f772f, AbstractC0916i.c(this.f771e, p012c.k.m(this.f770d, p012c.k.m(this.f769c, AbstractC0916i.c(this.f768b, (aVar == null ? 0 : aVar.hashCode()) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "LightCommand(color=" + this.f767a + ", time=" + this.f768b + ", on=" + this.f769c + ", flash=" + this.f770d + ", power=" + this.f771e + ", changeHue=" + this.f772f + ", saveColor=" + this.f773g + ", nanoleafTurnOffOthers=" + this.f774h + ", nanoleafColorVariations=" + this.i + ")";
    }

    public d(a aVar, int i, boolean z5, boolean z6, int i3, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.f767a = aVar;
        this.f768b = i;
        this.f769c = z5;
        this.f770d = z6;
        this.f771e = i3;
        this.f772f = z7;
        this.f773g = z8;
        this.f774h = z9;
        this.i = z10;
    }
}

package p101t;

import S0.j;
import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12234c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EdgeEffect f12235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EdgeEffect f12236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EdgeEffect f12237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EdgeEffect f12238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public EdgeEffect f12239h;
    public EdgeEffect i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public EdgeEffect f12240j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EdgeEffect f12241k;

    public F(Context context, int i) {
        this.f12232a = context;
        this.f12233b = i;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? C0947o.f12387a.b(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a() {
        int i = Build.VERSION.SDK_INT;
        Context context = this.f12232a;
        EdgeEffect edgeEffectA = i >= 31 ? C0947o.f12387a.a(context, null) : new O(context);
        edgeEffectA.setColor(this.f12233b);
        if (!j.a(this.f12234c, 0L)) {
            long j4 = this.f12234c;
            edgeEffectA.setSize((int) (j4 >> 32), (int) (j4 & 4294967295L));
        }
        return edgeEffectA;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f12236e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a();
        this.f12236e = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f12237f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a();
        this.f12237f = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f12238g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a();
        this.f12238g = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f12235d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a();
        this.f12235d = edgeEffectA;
        return edgeEffectA;
    }
}

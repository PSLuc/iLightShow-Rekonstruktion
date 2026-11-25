package p098s2;

import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import p015c2.o;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC0599v0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Class f12176k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Class f12177l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o f12178m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o f12179n;

    public h(k kVar, Class cls, o oVar, Class cls2, o oVar2) {
        this.f12176k = cls;
        this.f12178m = oVar;
        this.f12177l = cls2;
        this.f12179n = oVar2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0599v0
    public final AbstractC0599v0 G(Class cls, o oVar) {
        return new j(this, new l[]{new l(this.f12176k, this.f12178m), new l(this.f12177l, this.f12179n), new l(cls, oVar)});
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0599v0
    public final o I(Class cls) {
        if (cls == this.f12176k) {
            return this.f12178m;
        }
        if (cls == this.f12177l) {
            return this.f12179n;
        }
        return null;
    }
}

package p098s2;

import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import p015c2.o;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractC0599v0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Class f12182k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o f12183l;

    public k(AbstractC0599v0 abstractC0599v0, Class cls, o oVar) {
        this.f12182k = cls;
        this.f12183l = oVar;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0599v0
    public final AbstractC0599v0 G(Class cls, o oVar) {
        return new h(this, this.f12182k, this.f12183l, cls, oVar);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0599v0
    public final o I(Class cls) {
        if (cls == this.f12182k) {
            return this.f12183l;
        }
        return null;
    }
}

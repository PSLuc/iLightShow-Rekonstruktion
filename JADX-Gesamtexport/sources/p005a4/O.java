package p005a4;

import R3.a;
import R3.m;
import X3.b;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;

/* JADX INFO: loaded from: classes.dex */
public final class O extends AbstractC0599v0 implements b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f6213k;

    public O(a aVar) {
        this.f6213k = aVar;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0599v0
    public final void M(m mVar) {
        this.f6213k.e(new M(mVar));
    }

    @Override // X3.b
    public final L a() {
        return new L(this.f6213k, true);
    }
}

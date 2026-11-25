package Z2;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class t extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f6057g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.google.android.gms.common.internal.a aVar, int i, Bundle bundle) {
        super(aVar, i, bundle);
        Objects.requireNonNull(aVar);
        this.f6057g = aVar;
    }

    @Override // Z2.l
    public final boolean a() {
        this.f6057g.i.g(W2.a.f5568m);
        return true;
    }

    @Override // Z2.l
    public final void b(W2.a aVar) {
        com.google.android.gms.common.internal.a aVar2 = this.f6057g;
        aVar2.getClass();
        aVar2.i.g(aVar);
        System.currentTimeMillis();
    }
}

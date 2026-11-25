package com.google.android.gms.internal.play_billing;

import B.AbstractC0013g0;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class G1 extends E1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ H1 f7851h;

    public G1(H1 h1) {
        Objects.requireNonNull(h1);
        this.f7851h = h1;
    }

    @Override // com.google.android.gms.internal.play_billing.E1
    public final String a() {
        F1 f6 = (F1) this.f7851h.f7856a.get();
        return f6 == null ? "Completer object has been garbage collected, future will fail soon" : AbstractC0013g0.i("tag=[", String.valueOf(f6.f7845a), "]");
    }
}

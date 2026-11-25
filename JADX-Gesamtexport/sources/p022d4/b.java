package p022d4;

import R3.m;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import p027e3.a;
import v5.c;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0599v0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f8588k;

    public b(c cVar) {
        this.f8588k = cVar;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0599v0
    public final void M(m mVar) {
        a aVar = new a(mVar);
        mVar.d(aVar);
        try {
            this.f8588k.a(aVar);
        } catch (Throwable th) {
            a.w0(th);
            aVar.b(th);
        }
    }
}

package p001a0;

import android.view.autofill.AutofillManager;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AutofillManager.AutofillCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f6116a = new e();

    public final void a(a aVar) {
        aVar.f6113c.registerCallback(this);
    }

    public final void b(a aVar) {
        aVar.f6113c.unregisterCallback(this);
    }
}

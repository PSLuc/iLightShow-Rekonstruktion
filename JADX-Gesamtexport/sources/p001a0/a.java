package p001a0;

import android.view.autofill.AutofillManager;
import p130y0.r;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f6111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f6112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AutofillManager f6113c;

    public a(r rVar, f fVar) {
        this.f6111a = rVar;
        this.f6112b = fVar;
        AutofillManager autofillManager = (AutofillManager) rVar.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f6113c = autofillManager;
        rVar.setImportantForAutofill(1);
    }
}

package O0;

import G0.AbstractC0116l;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class g extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0116l f4413a;

    public g(AbstractC0116l abstractC0116l) {
        this.f4413a = abstractC0116l;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f4413a.getClass();
    }
}

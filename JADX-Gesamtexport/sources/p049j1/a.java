package p049j1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f9697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9698c;

    public a(int i, h hVar, int i3) {
        this.f9696a = i;
        this.f9697b = hVar;
        this.f9698c = i3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f9696a);
        this.f9697b.f9708a.performAction(this.f9698c, bundle);
    }
}

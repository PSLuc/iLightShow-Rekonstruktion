package H2;

import E4.k;
import android.view.View;
import android.view.Window;
import p035g0.C0715p;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Window f1770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0715p f1771b;

    public a(View view, Window window) {
        k.f("view", view);
        this.f1770a = window;
        this.f1771b = window != null ? new C0715p(view, window) : null;
    }
}

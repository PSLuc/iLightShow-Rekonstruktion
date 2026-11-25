package p012c;

import D4.a;
import D4.c;
import E4.k;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: loaded from: classes.dex */
public final class y implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f7185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f7186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f7187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f7188d;

    public y(c cVar, c cVar2, a aVar, a aVar2) {
        this.f7185a = cVar;
        this.f7186b = cVar2;
        this.f7187c = aVar;
        this.f7188d = aVar2;
    }

    public final void onBackCancelled() {
        this.f7188d.invoke();
    }

    public final void onBackInvoked() {
        this.f7187c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        k.f("backEvent", backEvent);
        this.f7186b.invoke(new C0464b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        k.f("backEvent", backEvent);
        this.f7185a.invoke(new C0464b(backEvent));
    }
}

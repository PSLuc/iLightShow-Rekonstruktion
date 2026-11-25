package p012c;

import D4.a;
import D4.c;
import E4.k;
import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f7189a = new z();

    public final OnBackInvokedCallback a(c cVar, c cVar2, a aVar, a aVar2) {
        k.f("onBackStarted", cVar);
        k.f("onBackProgressed", cVar2);
        k.f("onBackInvoked", aVar);
        k.f("onBackCancelled", aVar2);
        return new y(cVar, cVar2, aVar, aVar2);
    }
}

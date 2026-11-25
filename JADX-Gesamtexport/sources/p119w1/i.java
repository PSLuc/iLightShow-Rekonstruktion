package p119w1;

import W3.a;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.C0460u;
import androidx.lifecycle.InterfaceC0445e;
import androidx.lifecycle.InterfaceC0458s;

/* JADX INFO: loaded from: classes.dex */
public final class i implements InterfaceC0445e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0460u f13425h;

    public i(EmojiCompatInitializer emojiCompatInitializer, C0460u c0460u) {
        this.f13425h = c0460u;
    }

    @Override // androidx.lifecycle.InterfaceC0445e
    public final void b(InterfaceC0458s interfaceC0458s) {
        b.a(Looper.getMainLooper()).postDelayed(new a(5), 500L);
        this.f13425h.f(this);
    }
}

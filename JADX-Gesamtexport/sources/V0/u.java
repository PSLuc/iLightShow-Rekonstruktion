package V0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import p130y0.I0;

/* JADX INFO: loaded from: classes.dex */
public final class u extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5452a;

    public /* synthetic */ u(int i) {
        this.f5452a = i;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f5452a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            default:
                E4.k.d("null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer", view);
                Outline outlineB = ((I0) view).f14253l.b();
                E4.k.c(outlineB);
                outline.set(outlineB);
                break;
        }
    }
}

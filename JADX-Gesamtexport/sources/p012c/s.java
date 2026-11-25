package p012c;

import E4.k;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class s extends r {
    @Override // p012c.q
    public void b(Window window) {
        k.f("window", window);
        window.getAttributes().layoutInDisplayCutoutMode = 3;
    }
}

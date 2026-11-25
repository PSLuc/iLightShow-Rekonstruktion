package p012c;

import E4.k;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends p {
    public void b(Window window) {
        k.f("window", window);
        window.getAttributes().layoutInDisplayCutoutMode = 1;
    }
}

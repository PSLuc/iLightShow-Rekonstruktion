package p038g3;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class d extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Looper looper, int i) {
        super(looper);
        switch (i) {
            case 1:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }
}

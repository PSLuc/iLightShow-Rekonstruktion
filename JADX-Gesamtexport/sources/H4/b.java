package H4;

import S1.h0;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.security.SecureRandom;
import java.util.Random;
import p130y0.S;
import q5.m;

/* JADX INFO: loaded from: classes.dex */
public final class b extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1801a;

    public /* synthetic */ b(int i) {
        this.f1801a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f1801a) {
            case 0:
                return new Random();
            case 1:
                return new SecureRandom();
            case 2:
                return new Random(Thread.currentThread().getId() + m.f11313a);
            default:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                S s6 = new S(choreographer, Handler.createAsync(looperMyLooper));
                return h0.u(s6, s6.f14300s);
        }
    }
}

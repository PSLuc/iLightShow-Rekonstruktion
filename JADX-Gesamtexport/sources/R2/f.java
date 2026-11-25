package R2;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f4775h;
    public final /* synthetic */ L2.i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f4776j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Runnable f4777k;

    public /* synthetic */ f(l lVar, L2.i iVar, int i, Runnable runnable) {
        this.f4775h = lVar;
        this.i = iVar;
        this.f4776j = i;
        this.f4777k = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final L2.i iVar = this.i;
        final int i = this.f4776j;
        Runnable runnable = this.f4777k;
        final l lVar = this.f4775h;
        T2.b bVar = lVar.f4794f;
        try {
            S2.d dVar = lVar.f4791c;
            Objects.requireNonNull(dVar);
            ((S2.h) bVar).v(new J2.b(3, dVar));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) lVar.f4789a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                ((S2.h) bVar).v(new T2.a() { // from class: R2.g
                    @Override // T2.a
                    public final Object execute() {
                        lVar.f4792d.a(iVar, i + 1, false);
                        return null;
                    }
                });
            } else {
                lVar.a(iVar, i);
            }
        } catch (SynchronizationException unused) {
            lVar.f4792d.a(iVar, i + 1, false);
        } finally {
            runnable.run();
        }
    }
}

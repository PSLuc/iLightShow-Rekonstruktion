package W4;

import P4.AbstractC0331s;
import P4.M;
import U4.t;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c extends M implements Executor {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f5622j = new c();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AbstractC0331s f5623k;

    static {
        l lVar = l.f5638j;
        int i = t.f5379a;
        if (64 >= i) {
            i = 64;
        }
        int iJ = U4.a.j(i, "kotlinx.coroutines.io.parallelism", 12);
        lVar.getClass();
        if (iJ < 1) {
            throw new IllegalArgumentException(p012c.k.r(iJ, "Expected positive parallelism level, but got ").toString());
        }
        AbstractC0331s gVar = lVar;
        if (iJ < k.f5633d) {
            if (iJ < 1) {
                throw new IllegalArgumentException(p012c.k.r(iJ, "Expected positive parallelism level, but got ").toString());
            }
            gVar = new U4.g(lVar, iJ);
        }
        f5623k = gVar;
    }

    @Override // P4.AbstractC0331s
    public final void X(p111u4.i iVar, Runnable runnable) {
        f5623k.X(iVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        X(p111u4.j.f12751h, runnable);
    }

    @Override // P4.AbstractC0331s
    public final String toString() {
        return "Dispatchers.IO";
    }
}

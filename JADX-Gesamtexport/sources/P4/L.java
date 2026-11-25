package P4;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class L extends AbstractC0331s {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f4616m = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f4617j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4618k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p089q4.j f4619l;

    public final void Z(boolean z5) {
        long j4 = this.f4617j - (z5 ? 4294967296L : 1L);
        this.f4617j = j4;
        if (j4 <= 0 && this.f4618k) {
            shutdown();
        }
    }

    public final void a0(C c6) {
        p089q4.j jVar = this.f4619l;
        if (jVar == null) {
            jVar = new p089q4.j();
            this.f4619l = jVar;
        }
        jVar.addLast(c6);
    }

    public abstract Thread b0();

    public final void c0(boolean z5) {
        this.f4617j = (z5 ? 4294967296L : 1L) + this.f4617j;
        if (z5) {
            return;
        }
        this.f4618k = true;
    }

    public abstract long d0();

    public final boolean e0() throws IllegalAccessException, InvocationTargetException {
        p089q4.j jVar = this.f4619l;
        if (jVar == null) {
            return false;
        }
        C c6 = (C) (jVar.isEmpty() ? null : jVar.removeFirst());
        if (c6 == null) {
            return false;
        }
        c6.run();
        return true;
    }

    public void f0(long j4, I i) {
        RunnableC0337y.f4681q.j0(j4, i);
    }

    public abstract void shutdown();
}

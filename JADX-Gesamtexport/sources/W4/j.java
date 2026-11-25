package W4;

import P4.AbstractC0336x;

/* JADX INFO: loaded from: classes.dex */
public final class j extends h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Runnable f5629j;

    public j(Runnable runnable, long j4, i iVar) {
        super(j4, iVar);
        this.f5629j = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f5629j.run();
        } finally {
            this.i.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f5629j;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0336x.h(runnable));
        sb.append(", ");
        sb.append(this.f5627h);
        sb.append(", ");
        sb.append(this.i);
        sb.append(']');
        return sb.toString();
    }
}

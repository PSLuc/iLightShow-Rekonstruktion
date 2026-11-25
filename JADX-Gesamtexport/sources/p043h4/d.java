package p043h4;

import X3.e;
import u5.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d implements e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f9305h;
    public static final /* synthetic */ d[] i;

    static {
        d dVar = new d("INSTANCE", 0);
        f9305h = dVar;
        i = new d[]{dVar};
    }

    public static void a(Throwable th, b bVar) {
        bVar.h(f9305h);
        bVar.onError(th);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) i.clone();
    }

    @Override // u5.c
    public final void cancel() {
    }

    @Override // X3.h
    public final void clear() {
    }

    @Override // u5.c
    public final void e(long j4) {
        f.f(j4);
    }

    @Override // X3.d
    public final int i(int i3) {
        return 2;
    }

    @Override // X3.h
    public final boolean isEmpty() {
        return true;
    }

    @Override // X3.h
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // X3.h
    public final Object poll() {
        return null;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }
}

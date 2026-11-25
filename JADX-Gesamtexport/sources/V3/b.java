package V3;

import X3.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f5509h;
    public static final /* synthetic */ b[] i;

    static {
        b bVar = new b("INSTANCE", 0);
        f5509h = bVar;
        i = new b[]{bVar, new b("NEVER", 1)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) i.clone();
    }

    @Override // S3.b
    public final void a() {
    }

    @Override // X3.h
    public final void clear() {
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
}

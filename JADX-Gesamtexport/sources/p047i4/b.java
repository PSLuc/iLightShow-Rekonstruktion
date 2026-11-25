package p047i4;

import G4.a;
import R3.c;
import R3.e;
import R3.g;
import R3.m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b implements c, g, e, m, u5.c, S3.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f9588h;
    public static final /* synthetic */ b[] i;

    static {
        b bVar = new b("INSTANCE", 0);
        f9588h = bVar;
        i = new b[]{bVar};
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

    @Override // u5.b
    public final void b() {
    }

    @Override // u5.b
    public final void c(Object obj) {
    }

    @Override // u5.c
    public final void cancel() {
    }

    @Override // R3.g
    public final void d(S3.b bVar) {
        bVar.a();
    }

    @Override // u5.c
    public final void e(long j4) {
    }

    @Override // R3.e, R3.m
    public final void f(Object obj) {
    }

    @Override // u5.b
    public final void h(u5.c cVar) {
        cVar.cancel();
    }

    @Override // u5.b
    public final void onError(Throwable th) {
        a.A(th);
    }
}

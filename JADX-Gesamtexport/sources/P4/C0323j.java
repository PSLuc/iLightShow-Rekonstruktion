package P4;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: P4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0323j extends U implements InterfaceC0322i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b0 f4655l;

    public C0323j(b0 b0Var) {
        this.f4655l = b0Var;
    }

    @Override // P4.InterfaceC0322i
    public final boolean e(Throwable th) {
        return p().x(th);
    }

    @Override // D4.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        q((Throwable) obj);
        return p084p4.x.f10867a;
    }

    @Override // P4.W
    public final void q(Throwable th) throws IllegalAccessException, InvocationTargetException {
        this.f4655l.t(p());
    }
}

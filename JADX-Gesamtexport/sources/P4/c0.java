package P4;

import java.lang.reflect.InvocationTargetException;
import p015c2.AbstractC0473d;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends i0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p111u4.d f4645k;

    public c0(p111u4.i iVar, D4.e eVar) {
        super(iVar, false);
        this.f4645k = AbstractC0473d.o(eVar, this, this);
    }

    @Override // P4.b0
    public final void Y() throws IllegalAccessException, InvocationTargetException {
        try {
            U4.a.g(p084p4.x.f10867a, AbstractC0473d.F(this.f4645k));
        } catch (Throwable th) {
            g(S1.V.v(th));
            throw th;
        }
    }
}

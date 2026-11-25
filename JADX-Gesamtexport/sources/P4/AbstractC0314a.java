package P4;

import java.lang.reflect.InvocationTargetException;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.CompletionHandlerException;
import p015c2.AbstractC0473d;
import p096s.AbstractC0916i;

/* JADX INFO: renamed from: P4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0314a extends b0 implements p111u4.d, InterfaceC0335w {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p111u4.i f4636j;

    public AbstractC0314a(p111u4.i iVar, boolean z5) {
        super(z5);
        O((T) iVar.J(C0332t.i));
        this.f4636j = iVar.o(this);
    }

    @Override // P4.b0
    public final void N(CompletionHandlerException completionHandlerException) throws IllegalAccessException, InvocationTargetException {
        AbstractC0336x.k(completionHandlerException, this.f4636j);
    }

    @Override // P4.b0
    public final void X(Object obj) {
        if (!(obj instanceof C0327n)) {
            e0(obj);
        } else {
            C0327n c0327n = (C0327n) obj;
            d0(c0327n.f4664a, C0327n.f4663b.get(c0327n) != 0);
        }
    }

    @Override // P4.InterfaceC0335w
    public final p111u4.i d() {
        return this.f4636j;
    }

    public void d0(Throwable th, boolean z5) {
    }

    @Override // p111u4.d
    public final p111u4.i e() {
        return this.f4636j;
    }

    public void e0(Object obj) {
    }

    public final void f0(int i, AbstractC0314a abstractC0314a, D4.e eVar) {
        int iD = AbstractC0916i.d(i);
        if (iD == 0) {
            com.fasterxml.jackson.databind.deser.std.d0.D(eVar, abstractC0314a, this);
            return;
        }
        if (iD != 1) {
            if (iD == 2) {
                E4.k.f("<this>", eVar);
                AbstractC0473d.F(AbstractC0473d.o(eVar, abstractC0314a, this)).g(p084p4.x.f10867a);
                return;
            }
            if (iD != 3) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                p111u4.i iVar = this.f4636j;
                Object objL = U4.a.l(iVar, null);
                try {
                    E4.z.d(2, eVar);
                    Object objD = eVar.d(abstractC0314a, this);
                    U4.a.f(iVar, objL);
                    if (objD != v4.a.f13292h) {
                        g(objD);
                    }
                } catch (Throwable th) {
                    U4.a.f(iVar, objL);
                    throw th;
                }
            } catch (Throwable th2) {
                g(S1.V.v(th2));
            }
        }
    }

    @Override // p111u4.d
    public final void g(Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thA = p084p4.k.a(obj);
        if (thA != null) {
            obj = new C0327n(thA, false);
        }
        Object objS = S(obj);
        if (objS == AbstractC0336x.f4676e) {
            return;
        }
        q(objS);
    }

    @Override // P4.b0
    public final String w() {
        return getClass().getSimpleName().concat(" was cancelled");
    }
}

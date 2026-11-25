package p098s2;

import S1.c0;
import S1.d0;
import S1.f0;
import java.lang.reflect.Method;
import p093r2.b;

/* JADX INFO: loaded from: classes.dex */
public final class g extends f0 {
    public final b i;

    public g(Class cls, b bVar) {
        super(cls);
        this.i = bVar;
    }

    @Override // S1.f0, S1.d0
    public final boolean a(d0 d0Var) {
        if (d0Var.getClass() == g.class) {
            g gVar = (g) d0Var;
            if (gVar.f4935h == this.f4935h && gVar.i == this.i) {
                return true;
            }
        }
        return false;
    }

    @Override // S1.d0
    public final d0 b(Class cls) {
        return cls == this.f4935h ? this : new g(cls, this.i);
    }

    @Override // S1.d0
    public final Object c(Object obj) {
        b bVar = this.i;
        try {
            Method method = bVar.f11738p;
            return method == null ? bVar.f11739q.get(obj) : method.invoke(obj, null);
        } catch (RuntimeException e6) {
            throw e6;
        } catch (Exception e7) {
            throw new IllegalStateException("Problem accessing property '" + bVar.f11732j.f5505h + "': " + e7.getMessage(), e7);
        }
    }

    @Override // S1.d0
    public final c0 d(Object obj) {
        if (obj == null) {
            return null;
        }
        return new c0(g.class, this.f4935h, obj);
    }

    @Override // S1.d0
    public final d0 e() {
        return this;
    }
}

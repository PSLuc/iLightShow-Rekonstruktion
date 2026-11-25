package R4;

import B.AbstractC0013g0;
import E4.x;
import P4.p0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f4850r;

    public k(int i, int i3) {
        super(i);
        this.f4850r = i3;
        if (i3 != 1) {
            if (i < 1) {
                throw new IllegalArgumentException(AbstractC0013g0.f(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + x.a(b.class).b() + " instead").toString());
        }
    }

    public final Object F(Object obj, boolean z5) {
        p084p4.x xVar = p084p4.x.f10867a;
        if (this.f4850r == 3) {
            Object objJ = super.j(obj);
            return (!(objJ instanceof h) || (objJ instanceof g)) ? objJ : xVar;
        }
        q5.p pVar = d.f4828d;
        j jVar = (j) b.f4818m.get(this);
        while (true) {
            long andIncrement = b.i.getAndIncrement(this);
            long j4 = 1152921504606846975L & andIncrement;
            boolean zU = u(andIncrement, false);
            int i = d.f4826b;
            long j6 = i;
            long j7 = j4 / j6;
            int i3 = (int) (j4 % j6);
            if (jVar.f5377j != j7) {
                j jVarA = b.a(this, j7, jVar);
                if (jVarA != null) {
                    jVar = jVarA;
                } else if (zU) {
                    return new g(r());
                }
            }
            int iD = b.d(this, jVar, i3, obj, j4, pVar, zU);
            if (iD == 0) {
                jVar.a();
                return xVar;
            }
            if (iD != 1) {
                if (iD != 2) {
                    if (iD == 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iD == 4) {
                        if (j4 < b.f4815j.get(this)) {
                            jVar.a();
                        }
                        return new g(r());
                    }
                    if (iD == 5) {
                        jVar.a();
                    }
                } else {
                    if (zU) {
                        jVar.h();
                        return new g(r());
                    }
                    p0 p0Var = pVar instanceof p0 ? (p0) pVar : null;
                    if (p0Var != null) {
                        p0Var.b(jVar, i3 + i);
                    }
                    k((jVar.f5377j * j6) + ((long) i3));
                }
            }
            return xVar;
        }
    }

    @Override // R4.b, R4.o
    public final Object j(Object obj) {
        return F(obj, false);
    }

    @Override // R4.b, R4.o
    public final Object m(Object obj, p111u4.d dVar) throws Throwable {
        if (F(obj, true) instanceof g) {
            throw r();
        }
        return p084p4.x.f10867a;
    }

    @Override // R4.b
    public final boolean v() {
        return this.f4850r == 2;
    }
}

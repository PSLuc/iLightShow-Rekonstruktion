package W0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends p081p0.c {
    @Override // p081p0.c
    public final void A0(f fVar, Thread thread) {
        fVar.f5549a = thread;
    }

    @Override // p081p0.c
    public final boolean G(g gVar, c cVar) {
        c cVar2 = c.f5542b;
        synchronized (gVar) {
            try {
                if (gVar.f5556b != cVar) {
                    return false;
                }
                gVar.f5556b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p081p0.c
    public final boolean H(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f5555a != obj) {
                    return false;
                }
                gVar.f5555a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p081p0.c
    public final boolean I(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f5557c != fVar) {
                    return false;
                }
                gVar.f5557c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p081p0.c
    public final void z0(f fVar, f fVar2) {
        fVar.f5550b = fVar2;
    }
}

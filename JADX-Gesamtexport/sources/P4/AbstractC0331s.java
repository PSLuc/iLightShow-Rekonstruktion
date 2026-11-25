package P4;

/* JADX INFO: renamed from: P4.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0331s extends p111u4.a implements p111u4.f {
    public static final r i = new r(p111u4.e.f12750h, C0330q.f4669h);

    public AbstractC0331s() {
        super(p111u4.e.f12750h);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0027 A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v2, types: [D4.c, E4.l] */
    @Override // p111u4.a, p111u4.i
    public final p111u4.i D(p111u4.h hVar) {
        E4.k.f("key", hVar);
        boolean z5 = hVar instanceof r;
        p111u4.j jVar = p111u4.j.f12751h;
        if (!z5) {
            if (p111u4.e.f12750h == hVar) {
                return jVar;
            }
            return this;
        }
        r rVar = (r) hVar;
        p111u4.h hVar2 = this.f12746h;
        if ((hVar2 == rVar || rVar.i == hVar2) && ((p111u4.g) rVar.f4670h.invoke(this)) != null) {
            return jVar;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [D4.c, E4.l] */
    @Override // p111u4.a, p111u4.i
    public final p111u4.g J(p111u4.h hVar) {
        p111u4.g gVar;
        E4.k.f("key", hVar);
        if (!(hVar instanceof r)) {
            if (p111u4.e.f12750h == hVar) {
                return this;
            }
            return null;
        }
        r rVar = (r) hVar;
        p111u4.h hVar2 = this.f12746h;
        if ((hVar2 == rVar || rVar.i == hVar2) && (gVar = (p111u4.g) rVar.f4670h.invoke(this)) != null) {
            return gVar;
        }
        return null;
    }

    public abstract void X(p111u4.i iVar, Runnable runnable);

    public boolean Y() {
        return !(this instanceof m0);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0336x.h(this);
    }
}

package T4;

/* JADX INFO: loaded from: classes.dex */
public final class w implements p111u4.d, p122w4.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p111u4.d f5298h;
    public final p111u4.i i;

    public w(p111u4.d dVar, p111u4.i iVar) {
        this.f5298h = dVar;
        this.i = iVar;
    }

    @Override // p122w4.d
    public final p122w4.d a() {
        p111u4.d dVar = this.f5298h;
        if (dVar instanceof p122w4.d) {
            return (p122w4.d) dVar;
        }
        return null;
    }

    @Override // p111u4.d
    public final p111u4.i e() {
        return this.i;
    }

    @Override // p111u4.d
    public final void g(Object obj) {
        this.f5298h.g(obj);
    }
}

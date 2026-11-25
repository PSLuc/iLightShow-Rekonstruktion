package c5;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0484e0 f7449b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Y4.a aVar) {
        super(aVar);
        E4.k.f("primitiveSerializer", aVar);
        this.f7449b = new C0484e0(aVar.getDescriptor());
    }

    @Override // c5.AbstractC0475a
    public final Object a() {
        return (AbstractC0482d0) g(j());
    }

    @Override // c5.AbstractC0475a
    public final int b(Object obj) {
        AbstractC0482d0 abstractC0482d0 = (AbstractC0482d0) obj;
        E4.k.f("<this>", abstractC0482d0);
        return abstractC0482d0.d();
    }

    @Override // c5.AbstractC0475a
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // c5.AbstractC0475a, Y4.a
    public final Object deserialize(b5.c cVar) {
        return e(cVar);
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return this.f7449b;
    }

    @Override // c5.AbstractC0475a
    public final Object h(Object obj) {
        AbstractC0482d0 abstractC0482d0 = (AbstractC0482d0) obj;
        E4.k.f("<this>", abstractC0482d0);
        return abstractC0482d0.a();
    }

    @Override // c5.r
    public final void i(Object obj, int i, Object obj2) {
        E4.k.f("<this>", (AbstractC0482d0) obj);
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object j();

    public abstract void k(b5.b bVar, Object obj, int i);

    @Override // c5.r, Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        int iD = d(obj);
        C0484e0 c0484e0 = this.f7449b;
        E4.k.f("descriptor", c0484e0);
        b5.b bVarA = ((p081p0.c) dVar).a(c0484e0);
        k(bVarA, obj, iD);
        bVarA.b(c0484e0);
    }
}

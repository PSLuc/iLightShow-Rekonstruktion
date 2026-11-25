package c5;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends AbstractC0475a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4.a f7483a;

    public r(Y4.a aVar) {
        this.f7483a = aVar;
    }

    @Override // c5.AbstractC0475a
    public void f(b5.a aVar, int i, Object obj) {
        i(obj, i, aVar.B(getDescriptor(), i, this.f7483a, null));
    }

    public abstract void i(Object obj, int i, Object obj2);

    @Override // Y4.a
    public void serialize(b5.d dVar, Object obj) {
        int iD = d(obj);
        a5.g descriptor = getDescriptor();
        E4.k.f("descriptor", descriptor);
        b5.b bVarA = ((p081p0.c) dVar).a(descriptor);
        Iterator itC = c(obj);
        for (int i = 0; i < iD; i++) {
            ((p081p0.c) bVarA).f0(getDescriptor(), i, this.f7483a, itC.next());
        }
        bVarA.b(descriptor);
    }
}

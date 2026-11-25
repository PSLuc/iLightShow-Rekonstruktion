package T4;

import P4.AbstractC0336x;
import S4.InterfaceC0368e;
import S4.InterfaceC0369f;

/* JADX INFO: loaded from: classes.dex */
public final class m extends h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p122w4.i f5285l;

    /* JADX WARN: Multi-variable type inference failed */
    public m(D4.f fVar, InterfaceC0368e interfaceC0368e, p111u4.i iVar, int i, int i3) {
        super(interfaceC0368e, iVar, i, i3);
        this.f5285l = (p122w4.i) fVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [D4.f, w4.i] */
    @Override // T4.f
    public final f e(p111u4.i iVar, int i, int i3) {
        return new m(this.f5285l, this.f5271k, iVar, i, i3);
    }

    @Override // T4.h
    public final Object h(InterfaceC0369f interfaceC0369f, p111u4.d dVar) throws Throwable {
        Object objD = AbstractC0336x.d(new l(this, interfaceC0369f, null), dVar);
        return objD == v4.a.f13292h ? objD : p084p4.x.f10867a;
    }
}

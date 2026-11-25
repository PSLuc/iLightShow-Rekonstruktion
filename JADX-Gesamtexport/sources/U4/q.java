package U4;

import P4.AbstractC0314a;
import P4.AbstractC0336x;
import p015c2.AbstractC0473d;

/* JADX INFO: loaded from: classes.dex */
public class q extends AbstractC0314a implements p122w4.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p111u4.d f5375k;

    public q(p111u4.d dVar, p111u4.i iVar) {
        super(iVar, true);
        this.f5375k = dVar;
    }

    @Override // P4.b0
    public final boolean P() {
        return true;
    }

    @Override // p122w4.d
    public final p122w4.d a() {
        p111u4.d dVar = this.f5375k;
        if (dVar instanceof p122w4.d) {
            return (p122w4.d) dVar;
        }
        return null;
    }

    @Override // P4.b0
    public void p(Object obj) {
        a.g(AbstractC0336x.p(obj), AbstractC0473d.F(this.f5375k));
    }

    @Override // P4.b0
    public void q(Object obj) {
        this.f5375k.g(AbstractC0336x.p(obj));
    }
}

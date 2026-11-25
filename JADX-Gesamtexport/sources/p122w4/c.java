package p122w4;

import E4.k;
import P4.C0319f;
import U4.a;
import U4.f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p111u4.d;
import p111u4.e;
import p111u4.g;
import p111u4.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {
    public final i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public transient d f13461j;

    public c(d dVar, i iVar) {
        super(dVar);
        this.i = iVar;
    }

    @Override // p111u4.d
    public i e() {
        i iVar = this.i;
        k.c(iVar);
        return iVar;
    }

    @Override // p122w4.a
    public void p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        d dVar = this.f13461j;
        if (dVar != null && dVar != this) {
            g gVarJ = e().J(e.f12750h);
            k.c(gVarJ);
            f fVar = (f) dVar;
            do {
                atomicReferenceFieldUpdater = f.f5351o;
            } while (atomicReferenceFieldUpdater.get(fVar) == a.f5344d);
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            C0319f c0319f = obj instanceof C0319f ? (C0319f) obj : null;
            if (c0319f != null) {
                c0319f.p();
            }
        }
        this.f13461j = b.f13460h;
    }

    public c(d dVar) {
        this(dVar, dVar != null ? dVar.e() : null);
    }
}

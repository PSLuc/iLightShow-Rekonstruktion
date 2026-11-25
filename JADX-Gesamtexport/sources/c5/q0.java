package c5;

import N3.M0;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4.a f7479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y4.a f7480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Y4.a f7481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a5.h f7482d = S1.V.q("kotlin.Triple", new a5.g[0], new M0(7, this));

    public q0(Y4.a aVar, Y4.a aVar2, Y4.a aVar3) {
        this.f7479a = aVar;
        this.f7480b = aVar2;
        this.f7481c = aVar3;
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        a5.h hVar = this.f7482d;
        b5.a aVarA = cVar.a(hVar);
        Object obj = AbstractC0476a0.f7428c;
        Object objB = obj;
        Object objB2 = objB;
        Object objB3 = objB2;
        while (true) {
            int iK = aVarA.k(hVar);
            if (iK == -1) {
                aVarA.b(hVar);
                if (objB == obj) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objB2 == obj) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objB3 != obj) {
                    return new p084p4.n(objB, objB2, objB3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iK == 0) {
                objB = aVarA.B(hVar, 0, this.f7479a, null);
            } else if (iK == 1) {
                objB2 = aVarA.B(hVar, 1, this.f7480b, null);
            } else {
                if (iK != 2) {
                    throw new SerializationException(p012c.k.r(iK, "Unexpected index "));
                }
                objB3 = aVarA.B(hVar, 2, this.f7481c, null);
            }
        }
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return this.f7482d;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        p084p4.n nVar = (p084p4.n) obj;
        E4.k.f("value", nVar);
        a5.h hVar = this.f7482d;
        p081p0.c cVar = (p081p0.c) dVar.a(hVar);
        cVar.f0(hVar, 0, this.f7479a, nVar.f10856h);
        cVar.f0(hVar, 1, this.f7480b, nVar.i);
        cVar.f0(hVar, 2, this.f7481c, nVar.f10857j);
        cVar.b(hVar);
    }
}

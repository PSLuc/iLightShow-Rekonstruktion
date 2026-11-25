package p098s2;

import T1.e;
import java.io.Serializable;
import p015c2.E;
import p015c2.o;
import p093r2.b;
import p109u2.s;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final b f12162A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Serializable f12163B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f12164z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, Serializable serializable, int i) {
        super(bVar, bVar.f11732j);
        this.f12164z = i;
        this.f12162A = bVar;
        this.f12163B = serializable;
    }

    @Override // p093r2.b
    public final void j(o oVar) {
        switch (this.f12164z) {
            case 0:
                this.f12162A.j(oVar);
                break;
            default:
                this.f12162A.j(oVar);
                break;
        }
    }

    @Override // p093r2.b
    public final void k(o oVar) {
        switch (this.f12164z) {
            case 0:
                this.f12162A.k(oVar);
                break;
            default:
                this.f12162A.k(oVar);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Serializable, java.lang.Class[]] */
    @Override // p093r2.b
    public final b l(s sVar) {
        switch (this.f12164z) {
            case 0:
                return new d(this.f12162A.l(sVar), (Class[]) this.f12163B, 0);
            default:
                return new d(this.f12162A.l(sVar), (Class) this.f12163B, 1);
        }
    }

    @Override // p093r2.b
    public final void m(Object obj, e eVar, E e6) {
        switch (this.f12164z) {
            case 0:
                e6.getClass();
                this.f12162A.m(obj, eVar, e6);
                break;
            default:
                e6.getClass();
                this.f12162A.m(obj, eVar, e6);
                break;
        }
    }

    @Override // p093r2.b
    public final void n(Object obj, e eVar, E e6) {
        switch (this.f12164z) {
            case 0:
                e6.getClass();
                this.f12162A.n(obj, eVar, e6);
                break;
            default:
                e6.getClass();
                this.f12162A.n(obj, eVar, e6);
                break;
        }
    }
}

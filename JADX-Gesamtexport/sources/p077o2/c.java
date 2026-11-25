package p077o2;

import S1.T;
import com.fasterxml.jackson.core.JsonGenerationException;
import p003a2.a;
import p015c2.InterfaceC0472c;
import p071n2.e;

/* JADX INFO: loaded from: classes.dex */
public class c extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f10637d = new c(null, 0 == true ? 1 : 0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10638c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(o oVar, InterfaceC0472c interfaceC0472c, int i) {
        super(oVar, interfaceC0472c);
        this.f10638c = i;
    }

    @Override // p071n2.e
    public e a(InterfaceC0472c interfaceC0472c) {
        switch (this.f10638c) {
            case 0:
                return this;
            case 1:
                return g(interfaceC0472c);
            default:
                return this.f10662b == interfaceC0472c ? this : new c(this.f10661a, interfaceC0472c, 2);
        }
    }

    @Override // p071n2.e
    public T c() {
        switch (this.f10638c) {
            case 0:
                return T.f4916l;
            case 1:
                return T.f4914j;
            default:
                return T.i;
        }
    }

    @Override // p077o2.q, p071n2.e
    public a e(T1.e eVar, a aVar) throws JsonGenerationException {
        switch (this.f10638c) {
            case 0:
                if (!aVar.f6162f.f5234l || eVar.o()) {
                    return null;
                }
                eVar.v0(aVar);
                return aVar;
            default:
                return super.e(eVar, aVar);
        }
    }

    @Override // p077o2.q, p071n2.e
    public a f(T1.e eVar, a aVar) {
        switch (this.f10638c) {
            case 0:
                if (aVar == null) {
                    return null;
                }
                eVar.w0(aVar);
                return aVar;
            default:
                return super.f(eVar, aVar);
        }
    }

    public c g(InterfaceC0472c interfaceC0472c) {
        return this.f10662b == interfaceC0472c ? this : new c(this.f10661a, interfaceC0472c, 1);
    }
}

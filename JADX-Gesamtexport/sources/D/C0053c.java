package D;

import N.C0208d;
import N.W;
import P4.InterfaceC0335w;
import S1.V;
import kotlin.KotlinNothingValueException;

/* JADX INFO: renamed from: D.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0053c extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0057g f673m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x f674n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0053c(C0057g c0057g, x xVar, p111u4.d dVar) {
        super(2, dVar);
        this.f673m = c0057g;
        this.f674n = xVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new C0053c(this.f673m, this.f674n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0053c) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) throws Throwable {
        v4.a aVar = v4.a.f13292h;
        int i = this.f672l;
        if (i == 0) {
            V.O(obj);
            C0051a c0051a = C0051a.i;
            this.f672l = 1;
            p111u4.i iVar = this.i;
            E4.k.c(iVar);
            if (C0208d.F(iVar).C(new W(c0051a, 0), this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V.O(obj);
                throw new KotlinNothingValueException();
            }
            V.O(obj);
        }
        S4.x xVarI = this.f673m.i();
        if (xVarI == null) {
            return p084p4.x.f10867a;
        }
        C0052b c0052b = new C0052b(0, this.f674n);
        this.f672l = 2;
        S4.E.j((S4.E) xVarI, c0052b, this);
        return aVar;
    }
}

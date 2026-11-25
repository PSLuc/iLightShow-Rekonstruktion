package D3;

import P4.AbstractC0336x;
import P4.InterfaceC0335w;
import S1.V;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f795l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Double f796m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f797n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d f798o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Double d6, j jVar, d dVar, p111u4.d dVar2) {
        super(2, dVar2);
        this.f796m = d6;
        this.f797n = jVar;
        this.f798o = dVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new i(this.f796m, this.f797n, this.f798o, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((i) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        j jVar = this.f797n;
        v4.a aVar = v4.a.f13292h;
        int i = this.f795l;
        try {
            if (i == 0) {
                V.O(obj);
                long jDoubleValue = (long) (this.f796m.doubleValue() * ((double) 1000));
                this.f795l = 1;
                if (AbstractC0336x.e(jDoubleValue, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V.O(obj);
            }
            jVar.f(this.f798o);
            jVar.f808k = null;
        } catch (Exception unused) {
        }
        return x.f10867a;
    }
}

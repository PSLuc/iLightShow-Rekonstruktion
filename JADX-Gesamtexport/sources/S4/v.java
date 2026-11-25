package S4;

import O1.C0308a;
import S1.V;

/* JADX INFO: loaded from: classes.dex */
public final class v extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5129l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f5130m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0368e f5131n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ P f5132o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Float f5133p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(InterfaceC0368e interfaceC0368e, P p6, Float f6, p111u4.d dVar) {
        super(2, dVar);
        this.f5131n = interfaceC0368e;
        this.f5132o = p6;
        this.f5133p = f6;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        v vVar = new v(this.f5131n, this.f5132o, this.f5133p, dVar);
        vVar.f5130m = obj;
        return vVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((v) b((H) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f5129l;
        if (i == 0) {
            V.O(obj);
            int iOrdinal = ((H) this.f5130m).ordinal();
            P p6 = this.f5132o;
            if (iOrdinal == 0) {
                this.f5129l = 1;
                if (this.f5131n.a(p6, this) == aVar) {
                    return aVar;
                }
            } else if (iOrdinal == 2) {
                C0308a c0308a = F.f5033a;
                Float f6 = this.f5133p;
                if (f6 == c0308a) {
                    p6.getClass();
                    throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                }
                p6.i(null, f6);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
        }
        return p084p4.x.f10867a;
    }
}

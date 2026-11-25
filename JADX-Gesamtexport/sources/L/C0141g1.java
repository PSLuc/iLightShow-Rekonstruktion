package L;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: L.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0141g1 extends p122w4.i implements D4.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2744l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2745m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0141g1(Object obj, p111u4.d dVar, int i) {
        super(3, dVar);
        this.f2744l = i;
        this.f2745m = obj;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) throws IllegalAccessException, IOException, InvocationTargetException {
        switch (this.f2744l) {
            case 0:
                ((Number) obj2).floatValue();
                C0141g1 c0141g1 = new C0141g1((C0188w1) this.f2745m, (p111u4.d) obj3, 0);
                p084p4.x xVar = p084p4.x.f10867a;
                c0141g1.o(xVar);
                return xVar;
            default:
                C0141g1 c0141g2 = new C0141g1((E4.s) this.f2745m, (p111u4.d) obj3, 1);
                p084p4.x xVar2 = p084p4.x.f10867a;
                c0141g2.o(xVar2);
                return xVar2;
        }
    }

    @Override // p122w4.a
    public final Object o(Object obj) throws IllegalAccessException, IOException, InvocationTargetException {
        p084p4.x xVar = p084p4.x.f10867a;
        Object obj2 = this.f2745m;
        switch (this.f2744l) {
            case 0:
                v4.a aVar = v4.a.f13292h;
                S1.V.O(obj);
                ((C0188w1) obj2).f2962k.invoke();
                break;
            default:
                v4.a aVar2 = v4.a.f13292h;
                S1.V.O(obj);
                ((E4.s) obj2).f1070h = true;
                break;
        }
        return xVar;
    }
}

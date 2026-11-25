package B;

import F.InterfaceC0070l;
import L.g2;
import N.C0208d;
import N.C0230o;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f302h;
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f303j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f304k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f305l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(L.D d6, L.M0 m6, g2 g2Var, int i) {
        super(2);
        this.f302h = 2;
        V.a aVar = N3.M.f4035a;
        this.f303j = d6;
        this.f304k = m6;
        this.f305l = g2Var;
        this.i = i;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        p084p4.x xVar = p084p4.x.f10867a;
        Object obj3 = this.f304k;
        Object obj4 = this.f303j;
        Object obj5 = this.f305l;
        int i = this.i;
        switch (this.f302h) {
            case 0:
                ((Number) obj2).intValue();
                Object[] objArr = (Object[]) obj3;
                f1 f1Var = (f1) obj4;
                f1Var.b(Arrays.copyOf(objArr, objArr.length), (D4.c) obj5, (C0230o) obj, C0208d.V(i | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                InterfaceC0070l interfaceC0070l = (InterfaceC0070l) obj4;
                S1.V.c(interfaceC0070l, (Z.c) obj3, (V.a) obj5, (C0230o) obj, C0208d.V(i | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                int iV = C0208d.V(i | 1);
                V.a aVar = N3.M.f4035a;
                L.L.e((L.D) obj4, (L.M0) obj3, (g2) obj5, (C0230o) obj, iV);
                break;
            case 3:
                ((Number) obj2).intValue();
                ((V.a) obj4).e(obj3, obj5, (C0230o) obj, C0208d.V(i) | 1);
                break;
            case 4:
                ((Number) obj2).intValue();
                W.g gVar = (W.g) obj4;
                UUID uuid = (UUID) obj3;
                gVar.a(uuid, (V.a) obj5, (C0230o) obj, C0208d.V(i | 1));
                break;
            case 5:
                ((Number) obj2).intValue();
                int iV2 = C0208d.V(i | 1);
                p107u.l lVar = (p107u.l) obj4;
                D4.a aVar2 = (D4.a) obj3;
                com.fasterxml.jackson.databind.deser.std.d0.f(lVar, aVar2, Z.l.f5957a, (C0005c0) obj5, (C0230o) obj, iV2);
                break;
            case 6:
                ((Number) obj2).intValue();
                p107u.f fVar = (p107u.f) obj4;
                D4.a aVar3 = (D4.a) obj3;
                p107u.o.c(fVar, aVar3, (C0005c0) obj5, (C0230o) obj, C0208d.V(i | 1));
                break;
            default:
                ((Number) obj2).intValue();
                p113v0.X x6 = (p113v0.X) obj4;
                Z.o oVar = (Z.o) obj3;
                p113v0.U.c(x6, oVar, (D4.e) obj5, (C0230o) obj, C0208d.V(i | 1));
                break;
        }
        return xVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(Object obj, Object obj2, Object obj3, int i, int i3) {
        super(2);
        this.f302h = i3;
        this.f303j = obj;
        this.f304k = obj2;
        this.f305l = obj3;
        this.i = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(p107u.f fVar, D4.a aVar, C0005c0 c0005c0, int i) {
        super(2);
        this.f302h = 6;
        this.f303j = fVar;
        this.f304k = aVar;
        this.f305l = c0005c0;
        this.i = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(p107u.l lVar, D4.a aVar, C0005c0 c0005c0, int i) {
        super(2);
        this.f302h = 5;
        this.f303j = lVar;
        this.f304k = aVar;
        this.f305l = c0005c0;
        this.i = i;
    }
}

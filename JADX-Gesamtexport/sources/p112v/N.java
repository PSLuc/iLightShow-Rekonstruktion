package p112v;

import D4.f;
import S1.V;
import p030f0.c;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class N extends i implements f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f12869l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N(int i, d dVar, int i3) {
        super(i, dVar);
        this.f12869l = i3;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.f12869l) {
            case 0:
                long j4 = ((c) obj2).f8837a;
                N n6 = new N(3, (d) obj3, 0);
                x xVar = x.f10867a;
                n6.o(xVar);
                return xVar;
            case 1:
                ((Number) obj2).floatValue();
                N n7 = new N(3, (d) obj3, 1);
                x xVar2 = x.f10867a;
                n7.o(xVar2);
                return xVar2;
            default:
                long j6 = ((c) obj2).f8837a;
                N n8 = new N(3, (d) obj3, 2);
                x xVar3 = x.f10867a;
                n8.o(xVar3);
                return xVar3;
        }
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        x xVar = x.f10867a;
        switch (this.f12869l) {
            case 0:
                a aVar = a.f13292h;
                V.O(obj);
                break;
            case 1:
                a aVar2 = a.f13292h;
                V.O(obj);
                break;
            default:
                a aVar3 = a.f13292h;
                V.O(obj);
                break;
        }
        return xVar;
    }
}

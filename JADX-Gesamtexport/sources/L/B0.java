package L;

import N.C0230o;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class B0 extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2165h;
    public final /* synthetic */ p123x.a0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p113v0.Y f2166j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2167k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2168l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2169m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Integer f2170n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ V.a f2171o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B0(p123x.a0 a0Var, p113v0.Y y2, ArrayList arrayList, int i, ArrayList arrayList2, Integer num, V.a aVar, int i3) {
        super(2);
        this.f2165h = i3;
        this.i = a0Var;
        this.f2166j = y2;
        this.f2167k = arrayList;
        this.f2168l = i;
        this.f2169m = arrayList2;
        this.f2170n = num;
        this.f2171o = aVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        Integer num;
        Integer num2;
        switch (this.f2165h) {
            case 0:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o.B()) {
                    c0230o.P();
                } else {
                    boolean zIsEmpty = this.f2167k.isEmpty();
                    p123x.a0 a0Var = this.i;
                    p113v0.Y y2 = this.f2166j;
                    float fI0 = zIsEmpty ? y2.i0(a0Var.c(y2)) : y2.i0(this.f2168l);
                    float fI1 = (this.f2169m.isEmpty() || (num = this.f2170n) == null) ? y2.i0(a0Var.d(y2)) : y2.i0(num.intValue());
                    S0.k layoutDirection = y2.getLayoutDirection();
                    S0.k kVar = S0.k.f4897h;
                    float fI2 = layoutDirection == kVar ? y2.i0(a0Var.a(y2, layoutDirection)) : y2.i0(a0Var.b(y2, layoutDirection));
                    S0.k layoutDirection2 = y2.getLayoutDirection();
                    this.f2171o.c(new p123x.O(fI2, fI0, layoutDirection2 == kVar ? y2.i0(a0Var.b(y2, layoutDirection2)) : y2.i0(a0Var.a(y2, layoutDirection2)), fI1), c0230o, 0);
                }
                break;
            default:
                C0230o c0230o2 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    boolean zIsEmpty2 = this.f2167k.isEmpty();
                    p123x.a0 a0Var2 = this.i;
                    p113v0.Y y6 = this.f2166j;
                    float fI3 = zIsEmpty2 ? y6.i0(a0Var2.c(y6)) : y6.i0(this.f2168l);
                    float fI4 = (this.f2169m.isEmpty() || (num2 = this.f2170n) == null) ? y6.i0(a0Var2.d(y6)) : y6.i0(num2.intValue());
                    S0.k layoutDirection3 = y6.getLayoutDirection();
                    S0.k kVar2 = S0.k.f4897h;
                    float fI5 = layoutDirection3 == kVar2 ? y6.i0(a0Var2.a(y6, layoutDirection3)) : y6.i0(a0Var2.b(y6, layoutDirection3));
                    S0.k layoutDirection4 = y6.getLayoutDirection();
                    this.f2171o.c(new p123x.O(fI5, fI3, layoutDirection4 == kVar2 ? y6.i0(a0Var2.b(y6, layoutDirection4)) : y6.i0(a0Var2.a(y6, layoutDirection4)), fI4), c0230o2, 0);
                }
                break;
        }
        return p084p4.x.f10867a;
    }
}

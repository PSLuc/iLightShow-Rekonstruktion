package p129y;

import D4.a;
import E4.i;
import E4.j;
import E4.l;
import p124x0.Y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e extends i implements a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f14156p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y f14157q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f14158r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(i iVar, Y y2, a aVar) {
        super(0, j.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
        this.f14156p = iVar;
        this.f14157q = y2;
        this.f14158r = (l) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [D4.a, E4.l] */
    @Override // D4.a
    public final Object invoke() {
        ?? r6 = this.f14158r;
        return i.y0(this.f14156p, this.f14157q, r6);
    }
}

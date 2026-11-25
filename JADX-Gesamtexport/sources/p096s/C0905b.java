package p096s;

import D4.c;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: s.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0905b extends i implements c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0907c f11946l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f11947m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0905b(C0907c c0907c, Object obj, d dVar) {
        super(1, dVar);
        this.f11946l = c0907c;
        this.f11947m = obj;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        C0905b c0905b = new C0905b(this.f11946l, this.f11947m, (d) obj);
        x xVar = x.f10867a;
        c0905b.o(xVar);
        return xVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        V.O(obj);
        C0907c c0907c = this.f11946l;
        C0919l c0919l = c0907c.f11953c;
        c0919l.f12026j.d();
        c0919l.f12027k = Long.MIN_VALUE;
        c0907c.f11954d.setValue(Boolean.FALSE);
        Object objB = c0907c.b(this.f11947m);
        c0907c.f11953c.i.setValue(objB);
        c0907c.f11955e.setValue(objB);
        return x.f10867a;
    }
}

package K;

import P4.InterfaceC0335w;
import S1.V;
import p096s.C0907c;
import p096s.v0;

/* JADX INFO: loaded from: classes.dex */
public final class w extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f2024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f2025n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v0 f2026o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, float f6, v0 v0Var, p111u4.d dVar) {
        super(2, dVar);
        this.f2024m = yVar;
        this.f2025n = f6;
        this.f2026o = v0Var;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new w(this.f2024m, this.f2025n, this.f2026o, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((w) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f2023l;
        if (i == 0) {
            V.O(obj);
            C0907c c0907c = (C0907c) this.f2024m.f2033d;
            Float f6 = new Float(this.f2025n);
            this.f2023l = 1;
            if (C0907c.a(c0907c, f6, this.f2026o, this) == aVar) {
                return aVar;
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

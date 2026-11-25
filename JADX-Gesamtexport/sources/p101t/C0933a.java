package p101t;

import D4.e;
import P4.InterfaceC0335w;
import S1.V;
import p084p4.x;
import p111u4.d;
import p117w.m;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: t.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0933a extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12287l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f12288m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p117w.i f12289n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0933a(m mVar, p117w.i iVar, d dVar) {
        super(2, dVar);
        this.f12288m = mVar;
        this.f12289n = iVar;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new C0933a(this.f12288m, this.f12289n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0933a) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f12287l;
        if (i == 0) {
            V.O(obj);
            this.f12287l = 1;
            if (this.f12288m.a(this.f12289n, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
        }
        return x.f10867a;
    }
}

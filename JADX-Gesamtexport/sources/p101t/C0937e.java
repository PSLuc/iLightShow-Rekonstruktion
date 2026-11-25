package p101t;

import D4.e;
import P4.InterfaceC0335w;
import S1.V;
import p084p4.x;
import p111u4.d;
import p117w.m;
import p117w.o;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: t.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0937e extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12310l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC0942j f12311m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o f12312n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0937e(AbstractC0942j abstractC0942j, o oVar, d dVar) {
        super(2, dVar);
        this.f12311m = abstractC0942j;
        this.f12312n = oVar;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new C0937e(this.f12311m, this.f12312n, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0937e) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f12310l;
        if (i == 0) {
            V.O(obj);
            m mVar = this.f12311m.f12357w;
            if (mVar != null) {
                this.f12310l = 1;
                if (mVar.a(this.f12312n, this) == aVar) {
                    return aVar;
                }
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

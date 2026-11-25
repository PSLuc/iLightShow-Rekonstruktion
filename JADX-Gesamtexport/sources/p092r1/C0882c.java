package p092r1;

import D4.e;
import S1.V;
import java.util.List;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: r1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0882c extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11638l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f11639m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List f11640n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0882c(List list, d dVar) {
        super(2, dVar);
        this.f11640n = list;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        C0882c c0882c = new C0882c(this.f11640n, dVar);
        c0882c.f11639m = obj;
        return c0882c;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0882c) b((C0889j) obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        a aVar = a.f13292h;
        int i = this.f11638l;
        if (i == 0) {
            V.O(obj);
            C0889j c0889j = (C0889j) this.f11639m;
            this.f11638l = 1;
            if (V.o(this.f11640n, c0889j, this) == aVar) {
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

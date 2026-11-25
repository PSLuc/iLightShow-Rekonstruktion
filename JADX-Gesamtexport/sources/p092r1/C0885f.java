package p092r1;

import D4.e;
import S1.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: r1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0885f extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Iterator f11646l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f11647m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11648n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f11649o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ List f11650p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ArrayList f11651q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0885f(List list, ArrayList arrayList, d dVar) {
        super(2, dVar);
        this.f11650p = list;
        this.f11651q = arrayList;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        C0885f c0885f = new C0885f(this.f11650p, this.f11651q, dVar);
        c0885f.f11649o = obj;
        return c0885f;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0885f) b(obj, (d) obj2)).o(x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        Iterator it;
        List list;
        a aVar = a.f13292h;
        int i = this.f11648n;
        if (i == 0) {
            V.O(obj);
            obj = this.f11649o;
            it = this.f11650p.iterator();
            list = this.f11651q;
        } else if (i == 1) {
            Object obj2 = this.f11647m;
            Iterator it2 = this.f11646l;
            List list2 = (List) this.f11649o;
            V.O(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0884e(1, null));
                this.f11649o = list2;
                this.f11646l = it2;
                this.f11647m = null;
                this.f11648n = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f11646l;
            list = (List) this.f11649o;
            V.O(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f11649o = list;
        this.f11646l = it;
        this.f11647m = obj;
        this.f11648n = 1;
        throw null;
    }
}

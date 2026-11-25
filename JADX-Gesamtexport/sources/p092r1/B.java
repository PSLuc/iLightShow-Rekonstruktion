package p092r1;

import D4.e;
import S1.V;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class B extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f11560l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11561m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ boolean f11562n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ J f11563o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f11564p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(J j4, int i, d dVar) {
        super(2, dVar);
        this.f11563o = j4;
        this.f11564p = i;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        B b6 = new B(this.f11563o, this.f11564p, dVar);
        b6.f11562n = ((Boolean) obj).booleanValue();
        return b6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((B) b(bool, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    @Override // p122w4.a
    public final Object o(Object obj) {
        boolean z5;
        int iIntValue;
        Object obj2;
        int iHashCode;
        a aVar = a.f13292h;
        int i = this.f11561m;
        J j4 = this.f11563o;
        if (i == 0) {
            V.O(obj);
            z5 = this.f11562n;
            this.f11562n = z5;
            this.f11561m = 1;
            obj = j4.i(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i == 1) {
            z5 = this.f11562n;
            V.O(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.f11560l;
            V.O(obj);
        }
        iIntValue = ((Number) obj).intValue();
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        return new C0881b(iHashCode, iIntValue, obj2);
        if (z5) {
            T tG = j4.g();
            this.f11560l = obj;
            this.f11561m = 2;
            Integer numA = tG.a();
            if (numA != aVar) {
                Object obj3 = obj;
                obj = numA;
                obj2 = obj3;
                iIntValue = ((Number) obj).intValue();
            }
            return aVar;
        }
        Object obj4 = obj;
        iIntValue = this.f11564p;
        obj2 = obj4;
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        return new C0881b(iHashCode, iIntValue, obj2);
    }
}

package p092r1;

import D4.c;
import D4.e;
import E4.k;
import E4.u;
import E4.w;
import P4.AbstractC0336x;
import S1.V;
import androidx.datastore.core.CorruptionException;
import java.io.Serializable;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class C extends i implements c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11565l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11566m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ J f11567n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f11568o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f11569p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Serializable f11570q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(w wVar, J j4, u uVar, d dVar) {
        super(1, dVar);
        this.f11569p = wVar;
        this.f11567n = j4;
        this.f11570q = uVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [D4.e, w4.i] */
    @Override // D4.c
    public final Object invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f11565l) {
            case 0:
                return new C((w) this.f11569p, this.f11567n, (u) this.f11570q, dVar).o(x.f10867a);
            default:
                return new C(this.f11567n, (p111u4.i) this.f11569p, (e) this.f11570q, dVar).o(x.f10867a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v2, types: [D4.e, w4.i] */
    @Override // p122w4.a
    public final Object o(Object obj) throws Throwable {
        w wVar;
        u uVar;
        C0881b c0881b;
        Object obj2;
        int iHashCode;
        switch (this.f11565l) {
            case 0:
                a aVar = a.f13292h;
                int i = this.f11566m;
                u uVar2 = (u) this.f11570q;
                w wVar2 = (w) this.f11569p;
                J j4 = this.f11567n;
                try {
                    if (i != 0) {
                        if (i == 1) {
                            wVar = (w) ((Serializable) this.f11568o);
                            V.O(obj);
                        } else {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                uVar2 = (u) ((Serializable) this.f11568o);
                                V.O(obj);
                                uVar2.f1072h = ((Number) obj).intValue();
                                return x.f10867a;
                            }
                            uVar = (u) ((Serializable) this.f11568o);
                            V.O(obj);
                        }
                        uVar.f1072h = ((Number) obj).intValue();
                        return x.f10867a;
                    }
                    V.O(obj);
                    this.f11568o = wVar2;
                    this.f11566m = 1;
                    obj = j4.i(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    wVar = wVar2;
                    wVar.f1074h = obj;
                    T tG = j4.g();
                    this.f11568o = uVar2;
                    this.f11566m = 2;
                    obj = tG.a();
                    if (obj == aVar) {
                        return aVar;
                    }
                    uVar = uVar2;
                    uVar.f1072h = ((Number) obj).intValue();
                    return x.f10867a;
                } catch (CorruptionException unused) {
                    Object obj3 = wVar2.f1074h;
                    this.f11568o = uVar2;
                    this.f11566m = 3;
                    obj = j4.j(obj3, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
            default:
                a aVar2 = a.f13292h;
                int i3 = this.f11566m;
                J j6 = this.f11567n;
                if (i3 != 0) {
                    if (i3 == 1) {
                        V.O(obj);
                    } else {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj4 = this.f11568o;
                            V.O(obj);
                            return obj4;
                        }
                        c0881b = (C0881b) this.f11568o;
                        V.O(obj);
                    }
                    obj2 = c0881b.f11636b;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    if (iHashCode == c0881b.f11637c) {
                        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    }
                    if (!k.a(c0881b.f11636b, obj)) {
                        this.f11568o = obj;
                        this.f11566m = 3;
                        if (j6.j(obj, true, this) == aVar2) {
                            return aVar2;
                        }
                    }
                    return obj;
                }
                V.O(obj);
                this.f11566m = 1;
                obj = J.f(j6, true, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                c0881b = (C0881b) obj;
                E e6 = new E((i) this.f11570q, c0881b, null);
                this.f11568o = c0881b;
                this.f11566m = 2;
                obj = AbstractC0336x.v((p111u4.i) this.f11569p, e6, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                obj2 = c0881b.f11636b;
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                if (iHashCode == c0881b.f11637c) {
                    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                }
                if (!k.a(c0881b.f11636b, obj)) {
                    this.f11568o = obj;
                    this.f11566m = 3;
                    if (j6.j(obj, true, this) == aVar2) {
                        return aVar2;
                    }
                }
                return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C(J j4, p111u4.i iVar, e eVar, d dVar) {
        super(1, dVar);
        this.f11567n = j4;
        this.f11569p = iVar;
        this.f11570q = (i) eVar;
    }
}

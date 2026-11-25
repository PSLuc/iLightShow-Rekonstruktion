package p092r1;

import D4.c;
import D4.e;
import E4.s;
import E4.w;
import H1.d;
import S1.V;
import X4.a;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import p084p4.x;
import p122w4.i;

/* JADX INFO: renamed from: r1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0890k extends i implements c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f11668l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Serializable f11669m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f11670n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f11671o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Iterator f11672p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11673q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11674r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ J f11675s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f11676t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0890k(J j4, d dVar, p111u4.d dVar2) {
        super(1, dVar2);
        this.f11675s = j4;
        this.f11676t = dVar;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        return new C0890k(this.f11675s, this.f11676t, (p111u4.d) obj).o(x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00db  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:39:0x0103  */
    /* JADX WARN: Code duplicated, block: B:48:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:0: B:21:0x00a1->B:50:?, LOOP_END, SYNTHETIC] */
    @Override // p122w4.a
    public final Object o(Object obj) {
        a dVar;
        s sVar;
        w wVar;
        w wVar2;
        Iterator it;
        a aVar;
        s sVar2;
        w wVar3;
        C0889j c0889j;
        X4.d dVar2;
        w wVar4;
        s sVar3;
        e eVar;
        a aVar2;
        Object obj2;
        int iHashCode;
        Integer numA;
        Object obj3;
        int i;
        v4.a aVar3 = v4.a.f13292h;
        int i3 = this.f11674r;
        d dVar3 = this.f11676t;
        J j4 = this.f11675s;
        if (i3 == 0) {
            V.O(obj);
            dVar = new X4.d();
            sVar = new s();
            wVar = new w();
            this.f11668l = dVar;
            this.f11669m = sVar;
            this.f11670n = wVar;
            this.f11671o = wVar;
            this.f11674r = 1;
            obj = J.f(j4, true, this);
            if (obj != aVar3) {
                wVar2 = wVar;
            }
            return aVar3;
        }
        if (i3 == 1) {
            wVar = (w) this.f11671o;
            wVar2 = (w) this.f11670n;
            sVar = (s) this.f11669m;
            dVar = (a) this.f11668l;
            V.O(obj);
        } else {
            if (i3 == 2) {
                it = this.f11672p;
                c0889j = (C0889j) this.f11671o;
                wVar3 = (w) this.f11670n;
                sVar2 = (s) this.f11669m;
                aVar = (a) this.f11668l;
                V.O(obj);
                while (it.hasNext()) {
                    eVar = (e) it.next();
                    this.f11668l = aVar;
                    this.f11669m = sVar2;
                    this.f11670n = wVar3;
                    this.f11671o = c0889j;
                    this.f11672p = it;
                    this.f11674r = 2;
                    if (eVar.d(c0889j, this) == aVar3) {
                        return aVar3;
                    }
                }
                wVar2 = wVar3;
                sVar = sVar2;
                dVar = aVar;
                dVar3.f1758j = null;
                this.f11668l = sVar;
                this.f11669m = wVar2;
                this.f11670n = dVar;
                this.f11671o = null;
                this.f11672p = null;
                this.f11674r = 3;
                dVar2 = (X4.d) dVar;
                if (dVar2.c(this) != aVar3) {
                    wVar4 = wVar2;
                    sVar3 = sVar;
                    aVar2 = dVar2;
                    sVar3.f1070h = true;
                    ((X4.d) aVar2).e(null);
                    obj2 = wVar4.f1074h;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    T tG = j4.g();
                    this.f11668l = obj2;
                    this.f11669m = null;
                    this.f11670n = null;
                    this.f11673q = iHashCode;
                    this.f11674r = 4;
                    numA = tG.a();
                    if (numA != aVar3) {
                        obj = numA;
                        obj3 = obj2;
                        i = iHashCode;
                    }
                }
                return aVar3;
            }
            if (i3 == 3) {
                a aVar4 = (a) this.f11670n;
                wVar4 = (w) this.f11669m;
                sVar3 = (s) this.f11668l;
                V.O(obj);
                aVar2 = aVar4;
                try {
                    sVar3.f1070h = true;
                    ((X4.d) aVar2).e(null);
                    obj2 = wVar4.f1074h;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    T tG2 = j4.g();
                    this.f11668l = obj2;
                    this.f11669m = null;
                    this.f11670n = null;
                    this.f11673q = iHashCode;
                    this.f11674r = 4;
                    numA = tG2.a();
                    if (numA != aVar3) {
                        obj = numA;
                        obj3 = obj2;
                        i = iHashCode;
                    }
                    return aVar3;
                } catch (Throwable th) {
                    ((X4.d) aVar2).e(null);
                    throw th;
                }
            }
            if (i3 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.f11673q;
            obj3 = this.f11668l;
            V.O(obj);
        }
        return new C0881b(i, ((Number) obj).intValue(), obj3);
        wVar.f1074h = ((C0881b) obj).f11636b;
        C0889j c0889j2 = new C0889j(dVar, sVar, wVar2, j4);
        List list = (List) dVar3.f1758j;
        if (list != null) {
            it = list.iterator();
            aVar = dVar;
            sVar2 = sVar;
            wVar3 = wVar2;
            c0889j = c0889j2;
            while (it.hasNext()) {
                eVar = (e) it.next();
                this.f11668l = aVar;
                this.f11669m = sVar2;
                this.f11670n = wVar3;
                this.f11671o = c0889j;
                this.f11672p = it;
                this.f11674r = 2;
                if (eVar.d(c0889j, this) == aVar3) {
                }
            }
            wVar2 = wVar3;
            sVar = sVar2;
            dVar = aVar;
            dVar3.f1758j = null;
            this.f11668l = sVar;
            this.f11669m = wVar2;
            this.f11670n = dVar;
            this.f11671o = null;
            this.f11672p = null;
            this.f11674r = 3;
            dVar2 = (X4.d) dVar;
            if (dVar2.c(this) != aVar3) {
                wVar4 = wVar2;
                sVar3 = sVar;
                aVar2 = dVar2;
                sVar3.f1070h = true;
                ((X4.d) aVar2).e(null);
                obj2 = wVar4.f1074h;
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                T tG3 = j4.g();
                this.f11668l = obj2;
                this.f11669m = null;
                this.f11670n = null;
                this.f11673q = iHashCode;
                this.f11674r = 4;
                numA = tG3.a();
                if (numA != aVar3) {
                    obj = numA;
                    obj3 = obj2;
                    i = iHashCode;
                    return new C0881b(i, ((Number) obj).intValue(), obj3);
                }
            }
        } else {
            dVar3.f1758j = null;
            this.f11668l = sVar;
            this.f11669m = wVar2;
            this.f11670n = dVar;
            this.f11671o = null;
            this.f11672p = null;
            this.f11674r = 3;
            dVar2 = (X4.d) dVar;
            if (dVar2.c(this) != aVar3) {
                wVar4 = wVar2;
                sVar3 = sVar;
                aVar2 = dVar2;
                sVar3.f1070h = true;
                ((X4.d) aVar2).e(null);
                obj2 = wVar4.f1074h;
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                T tG4 = j4.g();
                this.f11668l = obj2;
                this.f11669m = null;
                this.f11670n = null;
                this.f11673q = iHashCode;
                this.f11674r = 4;
                numA = tG4.a();
                if (numA != aVar3) {
                    obj = numA;
                    obj3 = obj2;
                    i = iHashCode;
                    return new C0881b(i, ((Number) obj).intValue(), obj3);
                }
            }
        }
        return aVar3;
    }
}

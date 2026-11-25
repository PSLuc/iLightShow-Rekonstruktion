package p092r1;

import D4.e;
import E4.k;
import E4.s;
import E4.w;
import S1.V;
import X4.a;
import X4.d;
import p122w4.c;

/* JADX INFO: renamed from: r1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0889j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f11664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f11665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f11666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ J f11667d;

    public C0889j(a aVar, s sVar, w wVar, J j4) {
        this.f11664a = aVar;
        this.f11665b = sVar;
        this.f11666c = wVar;
        this.f11667d = j4;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b4 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:21:0x0050, B:35:0x00ac, B:37:0x00b4), top: B:53:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(C0885f c0885f, c cVar) throws Throwable {
        C0888i c0888i;
        s sVar;
        w wVar;
        J j4;
        a aVar;
        e eVar;
        a aVar2;
        a aVar3;
        w wVar2;
        Object obj;
        a aVar4;
        if (cVar instanceof C0888i) {
            c0888i = (C0888i) cVar;
            int i = c0888i.f11663r;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0888i.f11663r = i - Integer.MIN_VALUE;
            } else {
                c0888i = new C0888i(this, cVar);
            }
        } else {
            c0888i = new C0888i(this, cVar);
        }
        Object obj2 = c0888i.f11661p;
        v4.a aVar5 = v4.a.f13292h;
        int i3 = c0888i.f11663r;
        try {
            if (i3 == 0) {
                V.O(obj2);
                c0888i.f11656k = c0885f;
                a aVar6 = this.f11664a;
                c0888i.f11657l = aVar6;
                sVar = this.f11665b;
                c0888i.f11658m = sVar;
                wVar = this.f11666c;
                c0888i.f11659n = wVar;
                j4 = this.f11667d;
                c0888i.f11660o = j4;
                c0888i.f11663r = 1;
                d dVar = (d) aVar6;
                Object objC = dVar.c(c0888i);
                eVar = c0885f;
                aVar = dVar;
                if (objC != aVar5) {
                }
                return aVar5;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = c0888i.f11658m;
                    wVar2 = (w) c0888i.f11657l;
                    aVar2 = (a) c0888i.f11656k;
                    try {
                        V.O(obj2);
                        aVar4 = aVar2;
                        wVar2.f1074h = obj;
                        aVar2 = aVar4;
                        Object obj3 = wVar2.f1074h;
                        ((d) aVar2).e(null);
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        ((d) aVar2).e(null);
                        throw th;
                    }
                }
                j4 = (J) c0888i.f11658m;
                wVar2 = (w) c0888i.f11657l;
                aVar3 = (a) c0888i.f11656k;
                try {
                    V.O(obj2);
                    aVar3 = aVar3;
                    if (!k.a(obj2, wVar2.f1074h)) {
                        c0888i.f11656k = aVar3;
                        c0888i.f11657l = wVar2;
                        c0888i.f11658m = obj2;
                        c0888i.f11663r = 3;
                        if (j4.j(obj2, false, c0888i) != aVar5) {
                            obj = obj2;
                            aVar4 = aVar3;
                            wVar2.f1074h = obj;
                            aVar2 = aVar4;
                        }
                        return aVar5;
                    }
                    aVar2 = aVar3;
                    Object obj4 = wVar2.f1074h;
                    ((d) aVar2).e(null);
                    return obj4;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2 = aVar3;
                    ((d) aVar2).e(null);
                    throw th;
                }
            }
            j4 = c0888i.f11660o;
            w wVar3 = c0888i.f11659n;
            sVar = (s) c0888i.f11658m;
            a aVar7 = (a) c0888i.f11657l;
            e eVar2 = (e) c0888i.f11656k;
            V.O(obj2);
            wVar = wVar3;
            eVar = eVar2;
            aVar = aVar7;
            if (sVar.f1070h) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = wVar.f1074h;
            c0888i.f11656k = aVar;
            c0888i.f11657l = wVar;
            c0888i.f11658m = j4;
            c0888i.f11659n = null;
            c0888i.f11660o = null;
            c0888i.f11663r = 2;
            Object objD = eVar.d(obj5, c0888i);
            if (objD != aVar5) {
                aVar3 = aVar;
                obj2 = objD;
                wVar2 = wVar;
                if (!k.a(obj2, wVar2.f1074h)) {
                    c0888i.f11656k = aVar3;
                    c0888i.f11657l = wVar2;
                    c0888i.f11658m = obj2;
                    c0888i.f11663r = 3;
                    if (j4.j(obj2, false, c0888i) != aVar5) {
                        obj = obj2;
                        aVar4 = aVar3;
                        wVar2.f1074h = obj;
                        aVar2 = aVar4;
                    }
                } else {
                    aVar2 = aVar3;
                }
                Object obj6 = wVar2.f1074h;
                ((d) aVar2).e(null);
                return obj6;
            }
            return aVar5;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            ((d) aVar2).e(null);
            throw th;
        }
    }
}

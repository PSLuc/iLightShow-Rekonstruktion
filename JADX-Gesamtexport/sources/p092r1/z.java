package p092r1;

import D4.e;
import S1.V;
import p084p4.h;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class z extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Throwable f11724l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11725m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ boolean f11726n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ J f11727o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f11728p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(J j4, int i, d dVar) {
        super(2, dVar);
        this.f11727o = j4;
        this.f11728p = i;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        z zVar = new z(this.f11727o, this.f11728p, dVar);
        zVar.f11726n = ((Boolean) obj).booleanValue();
        return zVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((z) b(bool, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // p122w4.a
    public final Object o(Object obj) {
        int iIntValue;
        Throwable th;
        boolean z5;
        U m6;
        ?? r6;
        ?? r7;
        a aVar = a.f13292h;
        ?? r8 = this.f11725m;
        J j4 = this.f11727o;
        try {
            if (r8 == 0) {
                V.O(obj);
                boolean z6 = this.f11726n;
                this.f11726n = z6;
                this.f11725m = 1;
                obj = J.f(j4, z6, this);
                r8 = z6;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (r8 != 1) {
                    if (r8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z5 = this.f11726n;
                    th = this.f11724l;
                    V.O(obj);
                    iIntValue = ((Number) obj).intValue();
                    r7 = z5;
                    m6 = new M(th, iIntValue);
                    r6 = r7;
                    return new h(m6, Boolean.valueOf((boolean) r6));
                }
                boolean z7 = this.f11726n;
                V.O(obj);
                r8 = z7;
            }
            m6 = (U) obj;
            r6 = r8;
        } catch (Throwable th2) {
            if (r8 != 0) {
                T tG = j4.g();
                this.f11724l = th2;
                this.f11726n = r8;
                this.f11725m = 2;
                Integer numA = tG.a();
                if (numA != aVar) {
                    obj = numA;
                    th = th2;
                    z5 = r8 == true ? 1 : 0;
                }
                return aVar;
            }
            iIntValue = this.f11728p;
            th = th2;
            r7 = r8;
        }
        return new h(m6, Boolean.valueOf((boolean) r6));
    }
}

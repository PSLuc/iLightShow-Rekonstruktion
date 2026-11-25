package com.nanjoran.ilightshow.Services;

import P4.InterfaceC0335w;
import com.nanjoran.ilightshow.Model.JSON.UsageJSON;

/* JADX INFO: renamed from: com.nanjoran.ilightshow.Services.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0669f0 extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0688o0 f8389l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8390m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8391n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0688o0 f8392o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ UsageJSON f8393p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0669f0(C0688o0 c0688o0, UsageJSON usageJSON, p111u4.d dVar) {
        super(2, dVar);
        this.f8392o = c0688o0;
        this.f8393p = usageJSON;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new C0669f0(this.f8392o, this.f8393p, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0669f0) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    @Override // p122w4.a
    public final Object o(Object obj) {
        C0688o0 c0688o0;
        int iIntValue;
        Object objI;
        int i;
        C0688o0 c0688o1;
        v4.a aVar = v4.a.f13292h;
        int i3 = this.f8391n;
        p084p4.x xVar = p084p4.x.f10867a;
        UsageJSON usageJSON = this.f8393p;
        C0688o0 c0688o2 = this.f8392o;
        if (i3 == 0) {
            S1.V.O(obj);
            c0688o2.f8455f.setValue(Boolean.TRUE);
            int standard = (int) usageJSON.getStandard();
            this.f8391n = 1;
            Object objA = c0688o2.f8450a.a(new p114v1.g(new C0684m0(c0688o2, standard, null), null), this);
            if (objA != aVar) {
                objA = xVar;
            }
            if (objA != aVar) {
            }
            return aVar;
        }
        if (i3 == 1) {
            S1.V.O(obj);
        } else {
            if (i3 == 2) {
                S1.V.O(obj);
                C0675i0 c0675i0 = c0688o2.f8459k;
                this.f8389l = c0688o2;
                this.f8391n = 3;
                obj = S4.F.i(c0675i0, this);
                if (obj != aVar) {
                    c0688o0 = c0688o2;
                    iIntValue = ((Number) obj).intValue();
                    C0675i0 c0675i1 = c0688o2.f8458j;
                    this.f8389l = c0688o0;
                    this.f8390m = iIntValue;
                    this.f8391n = 4;
                    objI = S4.F.i(c0675i1, this);
                    if (objI != aVar) {
                        i = iIntValue;
                        obj = objI;
                        c0688o1 = c0688o0;
                    }
                }
                return aVar;
            }
            if (i3 == 3) {
                c0688o0 = this.f8389l;
                S1.V.O(obj);
                iIntValue = ((Number) obj).intValue();
                C0675i0 c0675i2 = c0688o2.f8458j;
                this.f8389l = c0688o0;
                this.f8390m = iIntValue;
                this.f8391n = 4;
                objI = S4.F.i(c0675i2, this);
                if (objI != aVar) {
                    i = iIntValue;
                    obj = objI;
                    c0688o1 = c0688o0;
                }
                return aVar;
            }
            if (i3 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.f8390m;
            c0688o1 = this.f8389l;
            S1.V.O(obj);
        }
        c0688o1.f8460l.setValue(new Integer(((Number) obj).intValue() + i));
        return xVar;
        int advanced = (int) usageJSON.getAdvanced();
        this.f8391n = 2;
        c0688o2.getClass();
        Object objA2 = c0688o2.f8450a.a(new p114v1.g(new C0681l0(c0688o2, advanced, null), null), this);
        if (objA2 != aVar) {
            objA2 = xVar;
        }
        if (objA2 != aVar) {
            C0675i0 c0675i3 = c0688o2.f8459k;
            this.f8389l = c0688o2;
            this.f8391n = 3;
            obj = S4.F.i(c0675i3, this);
            if (obj != aVar) {
                c0688o0 = c0688o2;
                iIntValue = ((Number) obj).intValue();
                C0675i0 c0675i4 = c0688o2.f8458j;
                this.f8389l = c0688o0;
                this.f8390m = iIntValue;
                this.f8391n = 4;
                objI = S4.F.i(c0675i4, this);
                if (objI != aVar) {
                    i = iIntValue;
                    obj = objI;
                    c0688o1 = c0688o0;
                    c0688o1.f8460l.setValue(new Integer(((Number) obj).intValue() + i));
                    return xVar;
                }
            }
        }
        return aVar;
    }
}

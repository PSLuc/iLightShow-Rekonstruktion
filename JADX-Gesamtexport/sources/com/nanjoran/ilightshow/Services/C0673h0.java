package com.nanjoran.ilightshow.Services;

import S4.InterfaceC0369f;

/* JADX INFO: renamed from: com.nanjoran.ilightshow.Services.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0673h0 implements InterfaceC0369f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8399h;
    public final /* synthetic */ InterfaceC0369f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0688o0 f8400j;

    public /* synthetic */ C0673h0(InterfaceC0369f interfaceC0369f, C0688o0 c0688o0, int i) {
        this.f8399h = i;
        this.i = interfaceC0369f;
        this.f8400j = c0688o0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // S4.InterfaceC0369f
    public final Object m(Object obj, p111u4.d dVar) {
        C0671g0 c0671g0;
        C0677j0 c0677j0;
        switch (this.f8399h) {
            case 0:
                if (dVar instanceof C0671g0) {
                    c0671g0 = (C0671g0) dVar;
                    int i = c0671g0.f8395l;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0671g0.f8395l = i - Integer.MIN_VALUE;
                    } else {
                        c0671g0 = new C0671g0(this, dVar);
                    }
                } else {
                    c0671g0 = new C0671g0(this, dVar);
                }
                Object obj2 = c0671g0.f8394k;
                v4.a aVar = v4.a.f13292h;
                int i3 = c0671g0.f8395l;
                if (i3 == 0) {
                    S1.V.O(obj2);
                    Integer num = (Integer) ((p114v1.b) obj).c(this.f8400j.f8451b);
                    Integer num2 = new Integer(num != null ? num.intValue() : 0);
                    c0671g0.f8395l = 1;
                    if (this.i.m(num2, c0671g0) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    S1.V.O(obj2);
                }
                return p084p4.x.f10867a;
            default:
                if (dVar instanceof C0677j0) {
                    c0677j0 = (C0677j0) dVar;
                    int i6 = c0677j0.f8416l;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0677j0.f8416l = i6 - Integer.MIN_VALUE;
                    } else {
                        c0677j0 = new C0677j0(this, dVar);
                    }
                } else {
                    c0677j0 = new C0677j0(this, dVar);
                }
                Object obj3 = c0677j0.f8415k;
                v4.a aVar2 = v4.a.f13292h;
                int i7 = c0677j0.f8416l;
                if (i7 == 0) {
                    S1.V.O(obj3);
                    Integer num3 = (Integer) ((p114v1.b) obj).c(this.f8400j.f8452c);
                    Integer num4 = new Integer(num3 != null ? num3.intValue() : 0);
                    c0677j0.f8416l = 1;
                    if (this.i.m(num4, c0677j0) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    S1.V.O(obj3);
                }
                return p084p4.x.f10867a;
        }
    }
}

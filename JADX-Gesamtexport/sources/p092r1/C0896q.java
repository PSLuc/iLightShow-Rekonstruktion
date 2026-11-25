package p092r1;

import D4.e;
import N3.J0;
import P4.AbstractC0336x;
import S1.V;
import S4.A;
import S4.C0373j;
import S4.C0375l;
import S4.InterfaceC0369f;
import S4.P;
import S4.S;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: renamed from: r1.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0896q extends i implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0881b f11686l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11687m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f11688n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ J f11689o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0896q(J j4, d dVar) {
        super(2, dVar);
        this.f11689o = j4;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        C0896q c0896q = new C0896q(this.f11689o, dVar);
        c0896q.f11688n = obj;
        return c0896q;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((C0896q) b((InterfaceC0369f) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c7  */
    @Override // p122w4.a
    public final Object o(Object obj) throws Throwable {
        InterfaceC0369f interfaceC0369f;
        U u6;
        C0373j c0373j;
        Object objA;
        a aVar = a.f13292h;
        int i = this.f11687m;
        x xVar = x.f10867a;
        J j4 = this.f11689o;
        if (i == 0) {
            V.O(obj);
            InterfaceC0369f interfaceC0369f2 = (InterfaceC0369f) this.f11688n;
            this.f11688n = interfaceC0369f2;
            this.f11687m = 1;
            Object objV = AbstractC0336x.v(j4.f11596c.d(), new D(j4, null), this);
            if (objV != aVar) {
                interfaceC0369f = interfaceC0369f2;
                obj = objV;
            }
            return aVar;
        }
        if (i == 1) {
            InterfaceC0369f interfaceC0369f3 = (InterfaceC0369f) this.f11688n;
            V.O(obj);
            interfaceC0369f = interfaceC0369f3;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V.O(obj);
                return xVar;
            }
            u6 = this.f11686l;
            interfaceC0369f = (InterfaceC0369f) this.f11688n;
            V.O(obj);
        }
        c0373j = new C0373j(new A(new C0375l(new C0375l(new C0375l(new C0892m(j4, null), 0, (P) j4.f11601h.i), 2, new C0893n(2, null)), new C0894o(u6, null))), new J0(j4, null));
        this.f11688n = null;
        this.f11686l = null;
        this.f11687m = 3;
        if (!(interfaceC0369f instanceof S)) {
            throw ((S) interfaceC0369f).f5060h;
        }
        objA = c0373j.a(interfaceC0369f, this);
        if (objA != aVar) {
            objA = xVar;
        }
        if (objA == aVar) {
            return aVar;
        }
        return xVar;
        u6 = (U) obj;
        if (u6 instanceof C0881b) {
            Object obj2 = ((C0881b) u6).f11636b;
            this.f11688n = interfaceC0369f;
            this.f11686l = (C0881b) u6;
            this.f11687m = 2;
            if (interfaceC0369f.m(obj2, this) != aVar) {
            }
            return aVar;
        }
        if (u6 instanceof V) {
            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
        }
        if (u6 instanceof M) {
            throw ((M) u6).f11610b;
        }
        if (!(u6 instanceof K)) {
        }
        return xVar;
        c0373j = new C0373j(new A(new C0375l(new C0375l(new C0375l(new C0892m(j4, null), 0, (P) j4.f11601h.i), 2, new C0893n(2, null)), new C0894o(u6, null))), new J0(j4, null));
        this.f11688n = null;
        this.f11686l = null;
        this.f11687m = 3;
        if (!(interfaceC0369f instanceof S)) {
            throw ((S) interfaceC0369f).f5060h;
        }
        objA = c0373j.a(interfaceC0369f, this);
        if (objA != aVar) {
            objA = xVar;
        }
        if (objA == aVar) {
            return aVar;
        }
        return xVar;
    }
}

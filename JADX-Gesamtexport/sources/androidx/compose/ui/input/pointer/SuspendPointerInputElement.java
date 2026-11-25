package androidx.compose.ui.input.pointer;

import D4.e;
import E4.k;
import Z.n;
import java.util.Arrays;
import p091r0.A;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
public final class SuspendPointerInputElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f6723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f6724d;

    public SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, e eVar, int i) {
        obj = (i & 1) != 0 ? null : obj;
        obj2 = (i & 2) != 0 ? null : obj2;
        objArr = (i & 4) != 0 ? null : objArr;
        this.f6721a = obj;
        this.f6722b = obj2;
        this.f6723c = objArr;
        this.f6724d = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!k.a(this.f6721a, suspendPointerInputElement.f6721a) || !k.a(this.f6722b, suspendPointerInputElement.f6722b)) {
            return false;
        }
        Object[] objArr = this.f6723c;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.f6723c;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.f6723c != null) {
            return false;
        }
        return this.f6724d == suspendPointerInputElement.f6724d;
    }

    public final int hashCode() {
        Object obj = this.f6721a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f6722b;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f6723c;
        return this.f6724d.hashCode() + ((iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }

    @Override // p124x0.Q
    public final n l() {
        return new A(this.f6721a, this.f6722b, this.f6723c, this.f6724d);
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        A a6 = (A) nVar;
        Object obj = a6.f11463u;
        Object obj2 = this.f6721a;
        boolean z5 = !k.a(obj, obj2);
        a6.f11463u = obj2;
        Object obj3 = a6.f11464v;
        Object obj4 = this.f6722b;
        if (!k.a(obj3, obj4)) {
            z5 = true;
        }
        a6.f11464v = obj4;
        Object[] objArr = a6.f11465w;
        Object[] objArr2 = this.f6723c;
        if (objArr != null && objArr2 == null) {
            z5 = true;
        }
        if (objArr == null && objArr2 != null) {
            z5 = true;
        }
        boolean z6 = (objArr == null || objArr2 == null || Arrays.equals(objArr2, objArr)) ? z5 : true;
        a6.f11465w = objArr2;
        if (z6) {
            a6.A0();
        }
        a6.f11466x = this.f6724d;
    }
}

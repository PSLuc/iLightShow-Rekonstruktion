package N;

import X.AbstractC0391h;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0217h0 extends X.C implements Parcelable, X.q {
    public static final Parcelable.Creator<C0217h0> CREATOR = new C0215g0();
    public final L0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public K0 f3704j;

    public C0217h0(Object obj, L0 l6) {
        this.i = l6;
        K0 k3 = new K0(obj);
        if (X.o.f5708a.get() != null) {
            K0 k6 = new K0(obj);
            k6.f5650a = 1;
            k3.f5651b = k6;
        }
        this.f3704j = k3;
    }

    @Override // N.InterfaceC0203a0
    public final D4.c a() {
        return new A2.e(20, this);
    }

    @Override // N.InterfaceC0203a0
    public final Object b() {
        return getValue();
    }

    @Override // X.B
    public final X.D c() {
        return this.f3704j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.q
    public final L0 e() {
        return this.i;
    }

    @Override // X.B
    public final X.D g(X.D d6, X.D d7, X.D d8) {
        if (this.i.a(((K0) d7).f3624c, ((K0) d8).f3624c)) {
            return d7;
        }
        return null;
    }

    @Override // N.V0
    public final Object getValue() {
        return ((K0) X.o.t(this.f3704j, this)).f3624c;
    }

    @Override // X.B
    public final void i(X.D d6) {
        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>", d6);
        this.f3704j = (K0) d6;
    }

    @Override // N.InterfaceC0203a0
    public final void setValue(Object obj) {
        AbstractC0391h abstractC0391hK;
        K0 k3 = (K0) X.o.i(this.f3704j);
        if (this.i.a(k3.f3624c, obj)) {
            return;
        }
        K0 k6 = this.f3704j;
        synchronized (X.o.f5709b) {
            abstractC0391hK = X.o.k();
            ((K0) X.o.o(k6, this, abstractC0391hK, k3)).f3624c = obj;
        }
        X.o.n(abstractC0391hK, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((K0) X.o.i(this.f3704j)).f3624c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i3;
        parcel.writeValue(getValue());
        U u6 = U.f3670j;
        L0 l6 = this.i;
        if (E4.k.a(l6, u6)) {
            i3 = 0;
        } else if (E4.k.a(l6, U.f3673m)) {
            i3 = 1;
        } else {
            if (!E4.k.a(l6, U.f3671k)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i3 = 2;
        }
        parcel.writeInt(i3);
    }
}

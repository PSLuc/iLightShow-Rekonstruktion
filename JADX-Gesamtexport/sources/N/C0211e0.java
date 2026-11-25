package N;

import X.AbstractC0391h;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0211e0 extends X.C implements Parcelable, X.q, InterfaceC0203a0, V0 {
    public static final Parcelable.Creator<C0211e0> CREATOR = new C0207c0(1);
    public I0 i;

    public C0211e0(int i) {
        I0 i3 = new I0(i);
        if (X.o.f5708a.get() != null) {
            I0 i6 = new I0(i);
            i6.f5650a = 1;
            i3.f5651b = i6;
        }
        this.i = i3;
    }

    @Override // N.InterfaceC0203a0
    public final D4.c a() {
        return new A2.e(18, this);
    }

    @Override // N.InterfaceC0203a0
    public final Object b() {
        return Integer.valueOf(h());
    }

    @Override // X.B
    public final X.D c() {
        return this.i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.q
    public final L0 e() {
        return U.f3673m;
    }

    @Override // X.B
    public final X.D g(X.D d6, X.D d7, X.D d8) {
        if (((I0) d7).f3617c == ((I0) d8).f3617c) {
            return d7;
        }
        return null;
    }

    @Override // N.V0
    public Object getValue() {
        return Integer.valueOf(h());
    }

    public final int h() {
        return ((I0) X.o.t(this.i, this)).f3617c;
    }

    @Override // X.B
    public final void i(X.D d6) {
        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord", d6);
        this.i = (I0) d6;
    }

    public final void j(int i) {
        AbstractC0391h abstractC0391hK;
        I0 i3 = (I0) X.o.i(this.i);
        if (i3.f3617c != i) {
            I0 i6 = this.i;
            synchronized (X.o.f5709b) {
                abstractC0391hK = X.o.k();
                ((I0) X.o.o(i6, this, abstractC0391hK, i3)).f3617c = i;
            }
            X.o.n(abstractC0391hK, this);
        }
    }

    @Override // N.InterfaceC0203a0
    public void setValue(Object obj) {
        j(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((I0) X.o.i(this.i)).f3617c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(h());
    }
}

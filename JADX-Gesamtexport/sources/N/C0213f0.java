package N;

import X.AbstractC0391h;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0213f0 extends X.C implements Parcelable, X.q, InterfaceC0203a0, V0 {
    public static final Parcelable.Creator<C0213f0> CREATOR = new C0207c0(2);
    public J0 i;

    public C0213f0(long j4) {
        J0 j6 = new J0(j4);
        if (X.o.f5708a.get() != null) {
            J0 j7 = new J0(j4);
            j7.f5650a = 1;
            j6.f5651b = j7;
        }
        this.i = j6;
    }

    @Override // N.InterfaceC0203a0
    public final D4.c a() {
        return new A2.e(19, this);
    }

    @Override // N.InterfaceC0203a0
    public final Object b() {
        return Long.valueOf(h());
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
        if (((J0) d7).f3622c == ((J0) d8).f3622c) {
            return d7;
        }
        return null;
    }

    @Override // N.V0
    public Object getValue() {
        return Long.valueOf(h());
    }

    public final long h() {
        return ((J0) X.o.t(this.i, this)).f3622c;
    }

    @Override // X.B
    public final void i(X.D d6) {
        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord", d6);
        this.i = (J0) d6;
    }

    public final void j(long j4) {
        AbstractC0391h abstractC0391hK;
        J0 j6 = (J0) X.o.i(this.i);
        if (j6.f3622c != j4) {
            J0 j7 = this.i;
            synchronized (X.o.f5709b) {
                abstractC0391hK = X.o.k();
                ((J0) X.o.o(j7, this, abstractC0391hK, j6)).f3622c = j4;
            }
            X.o.n(abstractC0391hK, this);
        }
    }

    @Override // N.InterfaceC0203a0
    public void setValue(Object obj) {
        j(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((J0) X.o.i(this.i)).f3622c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(h());
    }
}

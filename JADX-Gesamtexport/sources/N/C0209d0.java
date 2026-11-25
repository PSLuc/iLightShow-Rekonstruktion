package N;

import X.AbstractC0391h;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0209d0 extends X.C implements Parcelable, X.q, InterfaceC0203a0, V0 {
    public static final Parcelable.Creator<C0209d0> CREATOR = new C0207c0(0);
    public H0 i;

    public C0209d0(float f6) {
        H0 h1 = new H0(f6);
        if (X.o.f5708a.get() != null) {
            H0 h6 = new H0(f6);
            h6.f5650a = 1;
            h1.f5651b = h6;
        }
        this.i = h1;
    }

    @Override // N.InterfaceC0203a0
    public final D4.c a() {
        return new A2.e(17, this);
    }

    @Override // N.InterfaceC0203a0
    public final Object b() {
        return Float.valueOf(h());
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
        if (((H0) d7).f3613c == ((H0) d8).f3613c) {
            return d7;
        }
        return null;
    }

    @Override // N.V0
    public Object getValue() {
        return Float.valueOf(h());
    }

    public final float h() {
        return ((H0) X.o.t(this.i, this)).f3613c;
    }

    @Override // X.B
    public final void i(X.D d6) {
        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord", d6);
        this.i = (H0) d6;
    }

    public final void j(float f6) {
        AbstractC0391h abstractC0391hK;
        H0 h1 = (H0) X.o.i(this.i);
        if (h1.f3613c == f6) {
            return;
        }
        H0 h6 = this.i;
        synchronized (X.o.f5709b) {
            abstractC0391hK = X.o.k();
            ((H0) X.o.o(h6, this, abstractC0391hK, h1)).f3613c = f6;
        }
        X.o.n(abstractC0391hK, this);
    }

    @Override // N.InterfaceC0203a0
    public void setValue(Object obj) {
        j(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((H0) X.o.i(this.i)).f3613c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(h());
    }
}

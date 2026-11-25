package W2;

import D.x;
import F1.C0097n;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p004a3.a {
    public static final Parcelable.Creator<c> CREATOR = new C0097n(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5575h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f5576j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f5577k;

    public c(String str, int i, long j4, boolean z5) {
        this.f5575h = str;
        this.i = i;
        this.f5576j = j4;
        this.f5577k = z5;
    }

    public final long a() {
        long j4 = this.f5576j;
        return j4 == -1 ? this.i : j4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (Z2.n.d(this.f5575h, cVar.f5575h) && a() == cVar.a() && this.f5577k == cVar.f5577k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5575h, Long.valueOf(a()), Boolean.valueOf(this.f5577k)});
    }

    public final String toString() {
        x xVar = new x(this);
        xVar.i("name", this.f5575h);
        xVar.i("version", Long.valueOf(a()));
        xVar.i("is_fully_rolled_out", Boolean.valueOf(this.f5577k));
        return xVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ0 = p081p0.c.J0(parcel, 20293);
        p081p0.c.F0(parcel, 1, this.f5575h);
        p081p0.c.H0(parcel, 2, 4);
        parcel.writeInt(this.i);
        long jA = a();
        p081p0.c.H0(parcel, 3, 8);
        parcel.writeLong(jA);
        p081p0.c.H0(parcel, 4, 4);
        parcel.writeInt(this.f5577k ? 1 : 0);
        p081p0.c.L0(parcel, iJ0);
    }
}

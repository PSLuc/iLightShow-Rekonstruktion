package N1;

import android.os.Parcel;
import android.util.SparseIntArray;
import p012c.k;
import p080p.C0833e;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f3883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f3884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f3887h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3888j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3889k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0833e(0), new C0833e(0), new C0833e(0));
    }

    @Override // N1.a
    public final b a() {
        Parcel parcel = this.f3884e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f3888j;
        if (i == this.f3885f) {
            i = this.f3886g;
        }
        return new b(parcel, iDataPosition, i, k.u(new StringBuilder(), this.f3887h, "  "), this.f3880a, this.f3881b, this.f3882c);
    }

    @Override // N1.a
    public final boolean e(int i) {
        while (this.f3888j < this.f3886g) {
            int i3 = this.f3889k;
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i6 = this.f3888j;
            Parcel parcel = this.f3884e;
            parcel.setDataPosition(i6);
            int i7 = parcel.readInt();
            this.f3889k = parcel.readInt();
            this.f3888j += i7;
        }
        return this.f3889k == i;
    }

    @Override // N1.a
    public final void h(int i) {
        int i3 = this.i;
        SparseIntArray sparseIntArray = this.f3883d;
        Parcel parcel = this.f3884e;
        if (i3 >= 0) {
            int i6 = sparseIntArray.get(i3);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i6);
            parcel.writeInt(iDataPosition - i6);
            parcel.setDataPosition(iDataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public b(Parcel parcel, int i, int i3, String str, C0833e c0833e, C0833e c0833e2, C0833e c0833e3) {
        super(c0833e, c0833e2, c0833e3);
        this.f3883d = new SparseIntArray();
        this.i = -1;
        this.f3889k = -1;
        this.f3884e = parcel;
        this.f3885f = i;
        this.f3886g = i3;
        this.f3888j = i;
        this.f3887h = str;
    }
}

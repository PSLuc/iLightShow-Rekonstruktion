package p070n1;

import B.AbstractC0013g0;
import F1.C0097n;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class i extends View.BaseSavedState {
    public static final Parcelable.Creator<i> CREATOR = new C0097n(15);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10535h;

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        return AbstractC0013g0.l(sb, this.f10535h, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f10535h);
    }
}

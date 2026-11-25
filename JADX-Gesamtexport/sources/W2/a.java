package W2;

import D.x;
import F1.C0097n;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.protocol.types.MotionState;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p004a3.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5569h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PendingIntent f5570j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f5571k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f5572l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f5568m = new a(0, null, null);
    public static final Parcelable.Creator<a> CREATOR = new C0097n(2);

    public a(int i, int i3, PendingIntent pendingIntent, String str, Integer num) {
        this.f5569h = i;
        this.i = i3;
        this.f5570j = pendingIntent;
        this.f5571k = str;
        this.f5572l = num;
    }

    public static String a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case MotionState.UNKNOWN /* -1 */:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                        return "SIGN_IN_FAILED";
                    case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                        return "SERVICE_UPDATING";
                    case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.i == aVar.i && Z2.n.d(this.f5570j, aVar.f5570j) && Z2.n.d(this.f5571k, aVar.f5571k) && Z2.n.d(this.f5572l, aVar.f5572l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.i), this.f5570j, this.f5571k, this.f5572l});
    }

    public final String toString() {
        x xVar = new x(this);
        xVar.i("statusCode", a(this.i));
        xVar.i("resolution", this.f5570j);
        xVar.i("message", this.f5571k);
        xVar.i("clientMethodKey", this.f5572l);
        return xVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ0 = p081p0.c.J0(parcel, 20293);
        p081p0.c.H0(parcel, 1, 4);
        parcel.writeInt(this.f5569h);
        p081p0.c.H0(parcel, 2, 4);
        parcel.writeInt(this.i);
        p081p0.c.E0(parcel, 3, this.f5570j, i);
        p081p0.c.F0(parcel, 4, this.f5571k);
        Integer num = this.f5572l;
        if (num != null) {
            p081p0.c.H0(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        p081p0.c.L0(parcel, iJ0);
    }

    public a(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}

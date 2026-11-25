package com.google.android.gms.common.api;

import D.x;
import F1.C0097n;
import Z2.n;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.spotify.protocol.types.MotionState;
import defpackage.b;
import java.util.Arrays;
import p004a3.a;
import p081p0.c;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new C0097n(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7777h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PendingIntent f7778j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final W2.a f7779k;

    public Status(int i, String str, PendingIntent pendingIntent, W2.a aVar) {
        this.f7777h = i;
        this.i = str;
        this.f7778j = pendingIntent;
        this.f7779k = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f7777h == status.f7777h && n.d(this.i, status.i) && n.d(this.f7778j, status.f7778j) && n.d(this.f7779k, status.f7779k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7777h), this.i, this.f7778j, this.f7779k});
    }

    public final String toString() {
        x xVar = new x(this);
        String string = this.i;
        if (string == null) {
            int i = this.f7777h;
            switch (i) {
                case MotionState.UNKNOWN /* -1 */:
                    string = "SUCCESS_CACHE";
                    break;
                case 0:
                    string = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
                    sb.append("unknown status code: ");
                    sb.append(i);
                    string = sb.toString();
                    break;
                case 2:
                    string = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    string = "SERVICE_DISABLED";
                    break;
                case 4:
                    string = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    string = "INVALID_ACCOUNT";
                    break;
                case 6:
                    string = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    string = "NETWORK_ERROR";
                    break;
                case 8:
                    string = "INTERNAL_ERROR";
                    break;
                case 10:
                    string = "DEVELOPER_ERROR";
                    break;
                case 13:
                    string = "ERROR";
                    break;
                case 14:
                    string = "INTERRUPTED";
                    break;
                case 15:
                    string = "TIMEOUT";
                    break;
                case 16:
                    string = "CANCELED";
                    break;
                case b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                    string = "API_NOT_CONNECTED";
                    break;
                case b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                    string = "DEAD_CLIENT";
                    break;
                case b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                    string = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    string = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    string = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    string = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        xVar.i("statusCode", string);
        xVar.i("resolution", this.f7778j);
        return xVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ0 = c.J0(parcel, 20293);
        c.H0(parcel, 1, 4);
        parcel.writeInt(this.f7777h);
        c.F0(parcel, 2, this.i);
        c.E0(parcel, 3, this.f7778j, i);
        c.E0(parcel, 4, this.f7779k, i);
        c.L0(parcel, iJ0);
    }
}

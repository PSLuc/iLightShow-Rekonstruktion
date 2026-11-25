package androidx.core.app;

import N1.a;
import N1.b;
import N1.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVarG = remoteActionCompat.f6739a;
        boolean z5 = true;
        if (aVar.e(1)) {
            cVarG = aVar.g();
        }
        remoteActionCompat.f6739a = (IconCompat) cVarG;
        CharSequence charSequence = remoteActionCompat.f6740b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f3884e);
        }
        remoteActionCompat.f6740b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f6741c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f3884e);
        }
        remoteActionCompat.f6741c = charSequence2;
        remoteActionCompat.f6742d = (PendingIntent) aVar.f(remoteActionCompat.f6742d, 4);
        boolean z6 = remoteActionCompat.f6743e;
        if (aVar.e(5)) {
            z6 = ((b) aVar).f3884e.readInt() != 0;
        }
        remoteActionCompat.f6743e = z6;
        boolean z7 = remoteActionCompat.f6744f;
        if (!aVar.e(6)) {
            z5 = z7;
        } else if (((b) aVar).f3884e.readInt() == 0) {
            z5 = false;
        }
        remoteActionCompat.f6744f = z5;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f6739a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f6740b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f3884e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f6741c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f6742d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z5 = remoteActionCompat.f6743e;
        aVar.h(5);
        parcel.writeInt(z5 ? 1 : 0);
        boolean z6 = remoteActionCompat.f6744f;
        aVar.h(6);
        parcel.writeInt(z6 ? 1 : 0);
    }
}

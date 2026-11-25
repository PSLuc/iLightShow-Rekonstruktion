package androidx.core.graphics.drawable;

import N1.a;
import N1.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.protocol.types.MotionState;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f6751a;
        if (aVar.e(1)) {
            i = ((b) aVar).f3884e.readInt();
        }
        iconCompat.f6751a = i;
        byte[] bArr = iconCompat.f6753c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f3884e;
            int i3 = parcel.readInt();
            if (i3 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i3];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f6753c = bArr;
        iconCompat.f6754d = aVar.f(iconCompat.f6754d, 3);
        int i6 = iconCompat.f6755e;
        if (aVar.e(4)) {
            i6 = ((b) aVar).f3884e.readInt();
        }
        iconCompat.f6755e = i6;
        int i7 = iconCompat.f6756f;
        if (aVar.e(5)) {
            i7 = ((b) aVar).f3884e.readInt();
        }
        iconCompat.f6756f = i7;
        iconCompat.f6757g = (ColorStateList) aVar.f(iconCompat.f6757g, 6);
        String string = iconCompat.i;
        if (aVar.e(7)) {
            string = ((b) aVar).f3884e.readString();
        }
        iconCompat.i = string;
        String string2 = iconCompat.f6759j;
        if (aVar.e(8)) {
            string2 = ((b) aVar).f3884e.readString();
        }
        iconCompat.f6759j = string2;
        iconCompat.f6758h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f6751a) {
            case MotionState.UNKNOWN /* -1 */:
                Parcelable parcelable = iconCompat.f6754d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f6752b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f6754d;
                if (parcelable2 != null) {
                    iconCompat.f6752b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f6753c;
                iconCompat.f6752b = bArr3;
                iconCompat.f6751a = 3;
                iconCompat.f6755e = 0;
                iconCompat.f6756f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f6753c, Charset.forName("UTF-16"));
                iconCompat.f6752b = str;
                if (iconCompat.f6751a == 2 && iconCompat.f6759j == null) {
                    iconCompat.f6759j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f6752b = iconCompat.f6753c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.i = iconCompat.f6758h.name();
        switch (iconCompat.f6751a) {
            case MotionState.UNKNOWN /* -1 */:
                iconCompat.f6754d = (Parcelable) iconCompat.f6752b;
                break;
            case 1:
            case 5:
                iconCompat.f6754d = (Parcelable) iconCompat.f6752b;
                break;
            case 2:
                iconCompat.f6753c = ((String) iconCompat.f6752b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f6753c = (byte[]) iconCompat.f6752b;
                break;
            case 4:
            case 6:
                iconCompat.f6753c = iconCompat.f6752b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f6751a;
        if (-1 != i) {
            aVar.h(1);
            ((b) aVar).f3884e.writeInt(i);
        }
        byte[] bArr = iconCompat.f6753c;
        if (bArr != null) {
            aVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f3884e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f6754d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f3884e.writeParcelable(parcelable, 0);
        }
        int i3 = iconCompat.f6755e;
        if (i3 != 0) {
            aVar.h(4);
            ((b) aVar).f3884e.writeInt(i3);
        }
        int i6 = iconCompat.f6756f;
        if (i6 != 0) {
            aVar.h(5);
            ((b) aVar).f3884e.writeInt(i6);
        }
        ColorStateList colorStateList = iconCompat.f6757g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f3884e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f3884e.writeString(str);
        }
        String str2 = iconCompat.f6759j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f3884e.writeString(str2);
        }
    }
}

package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.play_billing.AbstractC0599v0;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0599v0 f6895a;

    static {
        f6895a = (i0.f6878e && i0.f6877d && !AbstractC0418c.a()) ? new j0(1) : new j0(0);
    }

    public static int a(String str) {
        int length = str.length();
        int i = 0;
        int i3 = 0;
        while (i3 < length && str.charAt(i3) < 128) {
            i3++;
        }
        int i6 = length;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                while (i3 < length2) {
                    char cCharAt2 = str.charAt(i3);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i3) < 65536) {
                                throw new k0(i3, length2);
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i6 += i;
                break;
            }
            i6 += (127 - cCharAt) >>> 31;
            i3++;
        }
        if (i6 >= length) {
            return i6;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i6) + 4294967296L));
    }
}

package p096s;

import com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.RecurringDays;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: renamed from: s.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0916i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12010a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, RecurringDays.RECURRING_WEEKDAYS, 125, WebSocketProtocol.PAYLOAD_SHORT, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139};

    public static /* synthetic */ int a(int i, int i3) {
        if (i == 0 || i3 == 0) {
            throw null;
        }
        return i - i3;
    }

    public static /* synthetic */ boolean b(int i, int i3) {
        if (i != 0) {
            return i == i3;
        }
        throw null;
    }

    public static int c(int i, int i3, int i6) {
        return (Integer.hashCode(i) + i3) * i6;
    }

    public static /* synthetic */ int d(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] e(int i) {
        int[] iArr = new int[i];
        System.arraycopy(f12010a, 0, iArr, 0, i);
        return iArr;
    }
}

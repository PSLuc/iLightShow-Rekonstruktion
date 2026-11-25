package p081p0;

import com.philips.lighting.hue.sdk.wrapper.HueLog;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.RecurringDays;
import okhttp3.internal.ws.WebSocketProtocol;
import p012c.k;
import p020d2.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f10815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f10816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f10817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f10818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f10819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f10820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f10821h;
    public static final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f10822j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f10823k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f10824l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f10825m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f10826n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10827a;

    static {
        n.b(0);
        n.b(1);
        n.b(2);
        n.b(3);
        f10815b = n.b(4);
        k.x(259, 260, 261, 262, 263);
        k.x(280, 281, 282, 283, 5);
        n.b(6);
        f10816c = n.b(19);
        f10817d = n.b(20);
        f10818e = n.b(21);
        f10819f = n.b(22);
        f10820g = n.b(23);
        k.x(268, 269, 270, 271, 24);
        k.x(25, 26, 27, 28, 7);
        k.x(8, 9, 10, 11, 12);
        k.x(13, 14, 15, 16, 81);
        k.x(69, 17, 70, 18, 29);
        k.x(30, 31, 32, 33, 34);
        k.x(35, 36, 37, 38, 39);
        k.x(40, 41, 42, 43, 44);
        k.x(45, 46, 47, 48, 49);
        k.x(50, 51, 52, 53, 54);
        k.x(55, 56, 57, 58, 59);
        n.b(60);
        f10821h = n.b(61);
        n.b(62);
        n.b(63);
        n.b(64);
        n.b(65);
        i = n.b(66);
        n.b(67);
        n.b(112);
        f10822j = n.b(111);
        k.x(113, 114, 115, 116, 117);
        k.x(118, 119, 120, 121, 122);
        k.x(123, RecurringDays.RECURRING_WEEKDAYS, 277, 278, 279);
        k.x(68, 71, 72, 76, 73);
        k.x(74, 75, 77, 78, 79);
        n.b(80);
        n.b(82);
        n.b(83);
        n.b(84);
        f10823k = n.b(92);
        f10824l = n.b(93);
        k.x(94, 95, 96, 97, 98);
        k.x(99, 100, 101, 102, 103);
        k.x(104, 105, 106, 107, 108);
        k.x(109, 110, 188, 189, 190);
        k.x(191, 192, 193, 194, 195);
        k.x(196, 197, 198, 199, 200);
        k.x(201, 202, 203, 125, 131);
        k.x(132, 133, 134, 135, 136);
        k.x(137, 138, 139, 140, 141);
        k.x(142, 143, 144, 145, 146);
        k.x(147, 148, 149, 150, 151);
        k.x(152, 153, 154, 155, 156);
        n.b(157);
        n.b(158);
        n.b(159);
        f10825m = n.b(160);
        k.x(161, 162, 163, WebSocketProtocol.PAYLOAD_SHORT, 127);
        k.x(85, 86, 130, 87, 88);
        k.x(89, 90, 128, 222, 129);
        k.x(226, 272, 273, 274, 275);
        k.x(91, 164, 165, 166, 167);
        k.x(168, 169, 170, 171, 172);
        k.x(173, 174, 175, 176, 177);
        k.x(178, 179, 180, 181, 182);
        k.x(183, 184, 185, 186, 187);
        k.x(204, 205, 206, 207, 208);
        k.x(209, 210, 211, 212, 213);
        k.x(214, 215, 216, 217, 218);
        k.x(219, 220, 221, 223, 224);
        k.x(276, 225, 229, 230, 231);
        k.x(232, 233, 234, 235, 236);
        k.x(237, 238, 239, 240, 241);
        k.x(242, 243, 244, 245, 246);
        k.x(247, 248, 249, 250, 251);
        k.x(252, 253, 254, 255, HueLog.LogComponent.STREAMDTLS);
        k.x(257, 258, 264, 265, 266);
        k.x(267, 284, 285, 286, 287);
        n.b(288);
    }

    public /* synthetic */ a(long j4) {
        this.f10827a = j4;
    }

    public static final boolean a(long j4, long j6) {
        return j4 == j6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f10827a == ((a) obj).f10827a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10827a);
    }

    public final String toString() {
        return "Key code: " + this.f10827a;
    }
}

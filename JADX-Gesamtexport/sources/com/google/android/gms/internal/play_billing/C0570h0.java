package com.google.android.gms.internal.play_billing;

import com.spotify.protocol.WampClient;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0570h0 implements A0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0570h0 f7944b = new C0570h0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0570h0 f7945c = new C0570h0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0570h0 f7946d = new C0570h0(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0570h0 f7947e = new C0570h0(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0570h0 f7948f = new C0570h0(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0570h0 f7949g = new C0570h0(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0570h0 f7950h = new C0570h0(6);
    public static final C0570h0 i = new C0570h0(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7951a;

    public /* synthetic */ C0570h0(int i3) {
        this.f7951a = i3;
    }

    @Override // com.google.android.gms.internal.play_billing.A0
    public final boolean a(int i3) {
        k1 k1Var;
        switch (this.f7951a) {
            case 0:
                switch (i3) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        return true;
                    default:
                        return false;
                }
            case 1:
                switch (i3) {
                    default:
                        switch (i3) {
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case WampClient.RequestType.SUBSCRIBED /* 33 */:
                            case WampClient.RequestType.UNSUBSCRIBE /* 34 */:
                            case WampClient.RequestType.UNSUBSCRIBED /* 35 */:
                            case WampClient.RequestType.EVENT /* 36 */:
                                break;
                            default:
                                return false;
                        }
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        return true;
                }
                break;
            case 2:
                return p012c.k.a(i3) != 0;
            case 3:
                if (i3 == 0) {
                    k1Var = k1.BROADCAST_ACTION_UNSPECIFIED;
                } else if (i3 == 1) {
                    k1Var = k1.PURCHASES_UPDATED_ACTION;
                } else if (i3 != 2) {
                    k1Var = i3 != 3 ? null : k1.ALTERNATIVE_BILLING_ACTION;
                } else {
                    k1Var = k1.LOCAL_PURCHASES_UPDATED_ACTION;
                }
                return k1Var != null;
            case 4:
                return i3 == 0 || i3 == 1 || i3 == 2 || i3 == 3;
            case 5:
                switch (i3) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                    case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                    case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                    case 20:
                        return true;
                    case 14:
                    case 15:
                    case 16:
                    default:
                        return false;
                }
            case 6:
                switch (i3) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            default:
                return i3 == 0 || i3 == 1;
        }
    }
}

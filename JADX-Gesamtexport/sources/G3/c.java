package G3;

import E4.k;
import a5.g;
import c5.AbstractC0476a0;
import c5.B;
import c5.C;
import c5.C0480c0;
import c5.J;
import c5.O;
import c5.k0;
import c5.p0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.Services.Analytics.SimpleAnalyticsEvent;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import com.spotify.protocol.types.MotionState;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.UnknownFieldException;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f1687a;
    private static final g descriptor;

    static {
        c cVar = new c();
        f1687a = cVar;
        C0480c0 c0480c0 = new C0480c0("com.nanjoran.ilightshow.Services.Analytics.SimpleAnalyticsEvent", cVar, 23);
        c0480c0.m("timestamp", false);
        c0480c0.m("user_id", false);
        c0480c0.m("device_id", false);
        c0480c0.m("session_id", false);
        c0480c0.m("os_name", false);
        c0480c0.m("os_version", false);
        c0480c0.m("os_version_major", false);
        c0480c0.m("os_version_minor", false);
        c0480c0.m("os_version_patch", false);
        c0480c0.m("locale", false);
        c0480c0.m("app_version", false);
        c0480c0.m("app_version_major", false);
        c0480c0.m("app_version_minor", false);
        c0480c0.m("app_version_patch", false);
        c0480c0.m("app_build_number", false);
        c0480c0.m("country_code", false);
        c0480c0.m("timezone", false);
        c0480c0.m("user_tags", false);
        c0480c0.m("event_name", false);
        c0480c0.m("event_float_value", true);
        c0480c0.m("event_string_value", true);
        c0480c0.m("string_props", true);
        c0480c0.m("float_props", true);
        descriptor = c0480c0;
    }

    @Override // c5.C
    public final Y4.a[] childSerializers() {
        Y4.a[] aVarArr = SimpleAnalyticsEvent.$childSerializers;
        p0 p0Var = p0.f7477a;
        Y4.a aVar = aVarArr[17];
        Y4.a aVarB = AbstractC0599v0.B(B.f7379a);
        Y4.a aVarB2 = AbstractC0599v0.B(p0Var);
        Y4.a aVar2 = aVarArr[21];
        Y4.a aVar3 = aVarArr[22];
        J j4 = J.f7400a;
        return new Y4.a[]{O.f7407a, p0Var, p0Var, p0Var, p0Var, p0Var, j4, j4, j4, p0Var, p0Var, j4, j4, j4, p0Var, p0Var, p0Var, aVar, p0Var, aVarB, aVarB2, aVar2, aVar3};
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        Y4.a[] aVarArr;
        int i;
        g gVar = descriptor;
        b5.a aVarA = cVar.a(gVar);
        Y4.a[] aVarArr2 = SimpleAnalyticsEvent.$childSerializers;
        Set set = null;
        Map map = null;
        Map map2 = null;
        String strM = null;
        String strM2 = null;
        String strM3 = null;
        String strM4 = null;
        String strM5 = null;
        String strM6 = null;
        String strM7 = null;
        String strM8 = null;
        String strM9 = null;
        String strM10 = null;
        String strM11 = null;
        long jE = 0;
        int i3 = 0;
        boolean z5 = true;
        int iN = 0;
        int iN2 = 0;
        int iN3 = 0;
        int iN4 = 0;
        int iN5 = 0;
        int iN6 = 0;
        Float f6 = null;
        String str = null;
        while (z5) {
            int iK = aVarA.k(gVar);
            switch (iK) {
                case MotionState.UNKNOWN /* -1 */:
                    z5 = false;
                    break;
                case 0:
                    aVarArr = aVarArr2;
                    jE = aVarA.e(gVar, 0);
                    i3 |= 1;
                    aVarArr2 = aVarArr;
                    break;
                case 1:
                    aVarArr = aVarArr2;
                    strM = aVarA.m(gVar, 1);
                    i3 |= 2;
                    aVarArr2 = aVarArr;
                    break;
                case 2:
                    aVarArr = aVarArr2;
                    strM2 = aVarA.m(gVar, 2);
                    i3 |= 4;
                    aVarArr2 = aVarArr;
                    break;
                case 3:
                    aVarArr = aVarArr2;
                    strM3 = aVarA.m(gVar, 3);
                    i3 |= 8;
                    aVarArr2 = aVarArr;
                    break;
                case 4:
                    aVarArr = aVarArr2;
                    strM4 = aVarA.m(gVar, 4);
                    i3 |= 16;
                    aVarArr2 = aVarArr;
                    break;
                case 5:
                    aVarArr = aVarArr2;
                    strM5 = aVarA.m(gVar, 5);
                    i3 |= 32;
                    aVarArr2 = aVarArr;
                    break;
                case 6:
                    aVarArr = aVarArr2;
                    iN = aVarA.n(gVar, 6);
                    i3 |= 64;
                    aVarArr2 = aVarArr;
                    break;
                case 7:
                    aVarArr = aVarArr2;
                    iN2 = aVarA.n(gVar, 7);
                    i3 |= 128;
                    aVarArr2 = aVarArr;
                    break;
                case 8:
                    aVarArr = aVarArr2;
                    iN3 = aVarA.n(gVar, 8);
                    i3 |= HueLog.LogComponent.STREAMDTLS;
                    aVarArr2 = aVarArr;
                    break;
                case 9:
                    aVarArr = aVarArr2;
                    strM6 = aVarA.m(gVar, 9);
                    i3 |= HueLog.LogComponent.APPCORE;
                    aVarArr2 = aVarArr;
                    break;
                case 10:
                    aVarArr = aVarArr2;
                    strM7 = aVarA.m(gVar, 10);
                    i3 |= 1024;
                    aVarArr2 = aVarArr;
                    break;
                case 11:
                    aVarArr = aVarArr2;
                    iN4 = aVarA.n(gVar, 11);
                    i3 |= 2048;
                    aVarArr2 = aVarArr;
                    break;
                case 12:
                    aVarArr = aVarArr2;
                    iN5 = aVarA.n(gVar, 12);
                    i3 |= 4096;
                    aVarArr2 = aVarArr;
                    break;
                case 13:
                    aVarArr = aVarArr2;
                    iN6 = aVarA.n(gVar, 13);
                    i3 |= 8192;
                    aVarArr2 = aVarArr;
                    break;
                case 14:
                    aVarArr = aVarArr2;
                    strM8 = aVarA.m(gVar, 14);
                    i3 |= Http2.INITIAL_MAX_FRAME_SIZE;
                    aVarArr2 = aVarArr;
                    break;
                case 15:
                    aVarArr = aVarArr2;
                    strM9 = aVarA.m(gVar, 15);
                    i = 32768;
                    i3 |= i;
                    aVarArr2 = aVarArr;
                    break;
                case 16:
                    aVarArr = aVarArr2;
                    strM10 = aVarA.m(gVar, 16);
                    i = 65536;
                    i3 |= i;
                    aVarArr2 = aVarArr;
                    break;
                case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                    aVarArr = aVarArr2;
                    set = (Set) aVarA.B(gVar, 17, aVarArr[17], set);
                    i = 131072;
                    i3 |= i;
                    aVarArr2 = aVarArr;
                    break;
                case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                    aVarArr = aVarArr2;
                    strM11 = aVarA.m(gVar, 18);
                    i = 262144;
                    i3 |= i;
                    aVarArr2 = aVarArr;
                    break;
                case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                    aVarArr = aVarArr2;
                    f6 = (Float) aVarA.j(gVar, 19, B.f7379a, f6);
                    i = 524288;
                    i3 |= i;
                    aVarArr2 = aVarArr;
                    break;
                case 20:
                    aVarArr = aVarArr2;
                    str = (String) aVarA.j(gVar, 20, p0.f7477a, str);
                    i = 1048576;
                    i3 |= i;
                    aVarArr2 = aVarArr;
                    break;
                case 21:
                    aVarArr = aVarArr2;
                    map = (Map) aVarA.B(gVar, 21, aVarArr[21], map);
                    i = 2097152;
                    i3 |= i;
                    aVarArr2 = aVarArr;
                    break;
                case 22:
                    aVarArr = aVarArr2;
                    map2 = (Map) aVarA.B(gVar, 22, aVarArr[22], map2);
                    i = 4194304;
                    i3 |= i;
                    aVarArr2 = aVarArr;
                    break;
                default:
                    throw new UnknownFieldException(iK);
            }
        }
        aVarA.b(gVar);
        return new SimpleAnalyticsEvent(i3, jE, strM, strM2, strM3, strM4, strM5, iN, iN2, iN3, strM6, strM7, iN4, iN5, iN6, strM8, strM9, strM10, set, strM11, f6, str, map, map2, (k0) null);
    }

    @Override // Y4.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        SimpleAnalyticsEvent simpleAnalyticsEvent = (SimpleAnalyticsEvent) obj;
        k.f("value", simpleAnalyticsEvent);
        g gVar = descriptor;
        b5.b bVarA = dVar.a(gVar);
        SimpleAnalyticsEvent.write$Self$app_release(simpleAnalyticsEvent, bVarA, gVar);
        bVarA.b(gVar);
    }

    @Override // c5.C
    public final Y4.a[] typeParametersSerializers() {
        return AbstractC0476a0.f7427b;
    }
}

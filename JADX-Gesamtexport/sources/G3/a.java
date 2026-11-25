package G3;

import E4.k;
import a5.g;
import c5.AbstractC0476a0;
import c5.C;
import c5.C0480c0;
import c5.J;
import c5.p0;
import com.nanjoran.ilightshow.Services.Analytics.AppContext;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import com.spotify.protocol.types.MotionState;
import java.util.Set;
import kotlinx.serialization.UnknownFieldException;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1686a;
    private static final g descriptor;

    static {
        a aVar = new a();
        f1686a = aVar;
        C0480c0 c0480c0 = new C0480c0("com.nanjoran.ilightshow.Services.Analytics.AppContext", aVar, 17);
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
        descriptor = c0480c0;
    }

    @Override // c5.C
    public final Y4.a[] childSerializers() {
        Y4.a aVar = AppContext.$childSerializers[16];
        p0 p0Var = p0.f7477a;
        J j4 = J.f7400a;
        return new Y4.a[]{p0Var, p0Var, p0Var, p0Var, p0Var, j4, j4, j4, p0Var, p0Var, j4, j4, j4, p0Var, p0Var, p0Var, aVar};
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        int i;
        g gVar = descriptor;
        b5.a aVarA = cVar.a(gVar);
        Y4.a[] aVarArr = AppContext.$childSerializers;
        Set set = null;
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
        boolean z5 = true;
        int i3 = 0;
        int iN = 0;
        int iN2 = 0;
        int iN3 = 0;
        int iN4 = 0;
        int iN5 = 0;
        int iN6 = 0;
        while (z5) {
            int iK = aVarA.k(gVar);
            switch (iK) {
                case MotionState.UNKNOWN /* -1 */:
                    z5 = false;
                    continue;
                case 0:
                    strM = aVarA.m(gVar, 0);
                    i3 |= 1;
                    continue;
                case 1:
                    strM2 = aVarA.m(gVar, 1);
                    i3 |= 2;
                    continue;
                case 2:
                    strM3 = aVarA.m(gVar, 2);
                    i3 |= 4;
                    continue;
                case 3:
                    strM4 = aVarA.m(gVar, 3);
                    i3 |= 8;
                    continue;
                case 4:
                    strM5 = aVarA.m(gVar, 4);
                    i3 |= 16;
                    continue;
                case 5:
                    iN = aVarA.n(gVar, 5);
                    i3 |= 32;
                    continue;
                case 6:
                    iN2 = aVarA.n(gVar, 6);
                    i3 |= 64;
                    continue;
                case 7:
                    iN3 = aVarA.n(gVar, 7);
                    i3 |= 128;
                    continue;
                case 8:
                    strM6 = aVarA.m(gVar, 8);
                    i3 |= HueLog.LogComponent.STREAMDTLS;
                    continue;
                case 9:
                    strM7 = aVarA.m(gVar, 9);
                    i3 |= HueLog.LogComponent.APPCORE;
                    continue;
                case 10:
                    iN4 = aVarA.n(gVar, 10);
                    i3 |= 1024;
                    continue;
                case 11:
                    iN5 = aVarA.n(gVar, 11);
                    i3 |= 2048;
                    continue;
                case 12:
                    iN6 = aVarA.n(gVar, 12);
                    i3 |= 4096;
                    continue;
                case 13:
                    strM8 = aVarA.m(gVar, 13);
                    i3 |= 8192;
                    continue;
                case 14:
                    strM9 = aVarA.m(gVar, 14);
                    i3 |= Http2.INITIAL_MAX_FRAME_SIZE;
                    continue;
                case 15:
                    strM10 = aVarA.m(gVar, 15);
                    i = 32768;
                    break;
                case 16:
                    set = (Set) aVarA.B(gVar, 16, aVarArr[16], set);
                    i = 65536;
                    break;
                default:
                    throw new UnknownFieldException(iK);
            }
            i3 |= i;
        }
        aVarA.b(gVar);
        return new AppContext(i3, strM, strM2, strM3, strM4, strM5, iN, iN2, iN3, strM6, strM7, iN4, iN5, iN6, strM8, strM9, strM10, set, null);
    }

    @Override // Y4.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        AppContext appContext = (AppContext) obj;
        k.f("value", appContext);
        g gVar = descriptor;
        b5.b bVarA = dVar.a(gVar);
        AppContext.write$Self$app_release(appContext, bVarA, gVar);
        bVarA.b(gVar);
    }

    @Override // c5.C
    public final Y4.a[] typeParametersSerializers() {
        return AbstractC0476a0.f7427b;
    }
}

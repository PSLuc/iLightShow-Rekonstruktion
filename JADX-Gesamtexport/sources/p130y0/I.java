package p130y0;

import D4.a;
import E4.l;
import P4.AbstractC0336x;
import P4.D;
import S1.h0;
import U4.m;
import W4.d;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.b;

/* JADX INFO: loaded from: classes.dex */
public final class I extends l implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14244h;
    public static final I i = new I(0, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final I f14227j = new I(0, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final I f14228k = new I(0, 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final I f14229l = new I(0, 3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final I f14230m = new I(0, 4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final I f14231n = new I(0, 5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final I f14232o = new I(0, 6);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final I f14233p = new I(0, 7);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final I f14234q = new I(0, 8);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final I f14235r = new I(0, 9);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final I f14236s = new I(0, 10);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final I f14237t = new I(0, 11);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final I f14238u = new I(0, 12);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final I f14239v = new I(0, 13);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final I f14240w = new I(0, 14);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final I f14241x = new I(0, 15);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final I f14242y = new I(0, 16);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final I f14243z = new I(0, 17);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final I f14220A = new I(0, 18);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final I f14221B = new I(0, 19);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final I f14222C = new I(0, 20);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final I f14223D = new I(0, 21);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final I f14224E = new I(0, 22);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final I f14225F = new I(0, 23);
    public static final I G = new I(0, 24);
    public static final I H = new I(0, 25);
    public static final I I = new I(0, 26);
    public static final I J = new I(0, 27);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final I f14226K = new I(0, 28);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(int i3, int i6) {
        super(i3);
        this.f14244h = i6;
    }

    @Override // D4.a
    public final Object invoke() {
        Choreographer choreographer;
        switch (this.f14244h) {
            case 0:
                AndroidCompositionLocals_androidKt.b("LocalConfiguration");
                throw null;
            case 1:
                AndroidCompositionLocals_androidKt.b("LocalContext");
                throw null;
            case 2:
                AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.b("LocalSavedStateRegistryOwner");
                throw null;
            case 5:
                AndroidCompositionLocals_androidKt.b("LocalView");
                throw null;
            case 6:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    d dVar = D.f4604a;
                    choreographer = (Choreographer) AbstractC0336x.r(m.f5373a, new P(2, null));
                }
                S s6 = new S(choreographer, Handler.createAsync(Looper.getMainLooper()));
                return h0.u(s6, s6.f14300s);
            case 7:
            case 8:
                return null;
            case 9:
                AbstractC1124c0.b("LocalAutofillTree");
                throw null;
            case 10:
                AbstractC1124c0.b("LocalClipboardManager");
                throw null;
            case 11:
                AbstractC1124c0.b("LocalDensity");
                throw null;
            case 12:
                AbstractC1124c0.b("LocalFocusManager");
                throw null;
            case 13:
                AbstractC1124c0.b("LocalFontFamilyResolver");
                throw null;
            case 14:
                AbstractC1124c0.b("LocalFontLoader");
                throw null;
            case 15:
                AbstractC1124c0.b("LocalGraphicsContext");
                throw null;
            case 16:
                AbstractC1124c0.b("LocalHapticFeedback");
                throw null;
            case b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                AbstractC1124c0.b("LocalInputManager");
                throw null;
            case b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                AbstractC1124c0.b("LocalLayoutDirection");
                throw null;
            case b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                return null;
            case 20:
                return Boolean.FALSE;
            case 21:
            case 22:
                return null;
            case 23:
                AbstractC1124c0.b("LocalTextToolbar");
                throw null;
            case 24:
                AbstractC1124c0.b("LocalUriHandler");
                throw null;
            case 25:
                AbstractC1124c0.b("LocalViewConfiguration");
                throw null;
            case 26:
                AbstractC1124c0.b("LocalWindowInfo");
                throw null;
            case 27:
                return Boolean.FALSE;
            default:
                return null;
        }
    }
}

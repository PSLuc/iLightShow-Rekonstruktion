package p130y0;

import B.U;
import N.C0208d;
import N.C0230o;
import N.C0233p0;
import N.C0235q0;
import N.C0247x;
import N.W0;
import V.a;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import p124x0.f0;

/* JADX INFO: renamed from: y0.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1124c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W0 f14362a = new W0(I.f14233p);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final W0 f14363b = new W0(I.f14234q);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final W0 f14364c = new W0(I.f14235r);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final W0 f14365d = new W0(I.f14236s);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final W0 f14366e = new W0(I.f14241x);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final W0 f14367f = new W0(I.f14237t);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final W0 f14368g = new W0(I.f14238u);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final W0 f14369h = new W0(I.f14240w);
    public static final W0 i = new W0(I.f14239v);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final W0 f14370j = new W0(I.f14242y);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final W0 f14371k = new W0(I.f14243z);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final W0 f14372l = new W0(I.f14220A);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final W0 f14373m = new W0(I.f14224E);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final W0 f14374n = new W0(I.f14223D);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final W0 f14375o = new W0(I.f14225F);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final W0 f14376p = new W0(I.G);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final W0 f14377q = new W0(I.H);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final W0 f14378r = new W0(I.I);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final W0 f14379s = new W0(I.f14221B);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0247x f14380t = new C0247x(I.f14222C);

    public static final void a(f0 f0Var, T t6, a aVar, C0230o c0230o, int i3) {
        c0230o.X(874662829);
        int i6 = i3 | (c0230o.f(f0Var) ? 4 : 2) | (c0230o.f(t6) ? 32 : 16) | (c0230o.h(aVar) ? HueLog.LogComponent.STREAMDTLS : 128);
        if ((i6 & 147) == 146 && c0230o.B()) {
            c0230o.P();
        } else {
            r rVar = (r) f0Var;
            C0233p0 c0233p0A = f14362a.a(rVar.getAccessibilityManager());
            C0233p0 c0233p0A2 = f14363b.a(rVar.getAutofill());
            C0233p0 c0233p0A3 = f14364c.a(rVar.getAutofillTree());
            C0233p0 c0233p0A4 = f14365d.a(rVar.getClipboardManager());
            C0233p0 c0233p0A5 = f14367f.a(rVar.getDensity());
            C0233p0 c0233p0A6 = f14368g.a(rVar.getFocusOwner());
            C0233p0 c0233p0A7 = f14369h.a(rVar.getFontLoader());
            c0233p0A7.f3776f = false;
            C0233p0 c0233p0A8 = i.a(rVar.getFontFamilyResolver());
            c0233p0A8.f3776f = false;
            C0208d.b(new C0233p0[]{c0233p0A, c0233p0A2, c0233p0A3, c0233p0A4, c0233p0A5, c0233p0A6, c0233p0A7, c0233p0A8, f14370j.a(rVar.getHapticFeedBack()), f14371k.a(rVar.getInputModeManager()), f14372l.a(rVar.getLayoutDirection()), f14373m.a(rVar.getTextInputService()), f14374n.a(rVar.getSoftwareKeyboardController()), f14375o.a(rVar.getTextToolbar()), f14376p.a(t6), f14377q.a(rVar.getViewConfiguration()), f14378r.a(rVar.getWindowInfo()), f14379s.a(rVar.getPointerIconService()), f14366e.a(rVar.getGraphicsContext())}, aVar, c0230o, ((i6 >> 3) & 112) | 8);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new U(f0Var, t6, aVar, i3, 5);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}

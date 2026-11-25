package N3;

import c5.C0480c0;
import com.nanjoran.ilightshow.Services.Palette;
import com.nanjoran.ilightshow.Views.BrightnessRoute;
import com.nanjoran.ilightshow.Views.DevicesViewRoute;
import com.nanjoran.ilightshow.Views.FXModeSelectionRoute;
import com.nanjoran.ilightshow.Views.FXSizeSelectionRoute;
import com.nanjoran.ilightshow.Views.HomeScreenRoute;
import com.nanjoran.ilightshow.Views.IntensitySelectionRoute;
import com.nanjoran.ilightshow.Views.LightDetailsRoute;
import com.nanjoran.ilightshow.Views.LightsScreenRoute;
import com.nanjoran.ilightshow.Views.ManualDelayRoute;
import com.nanjoran.ilightshow.Views.MicrophoneRoute;
import com.nanjoran.ilightshow.Views.MusicServicesRoute;
import com.nanjoran.ilightshow.Views.PaletteEditorRoute;
import com.nanjoran.ilightshow.Views.PalettesListRoute;
import com.nanjoran.ilightshow.Views.PaywallViewRoute;
import com.nanjoran.ilightshow.Views.SettingsScreenRoute;
import java.util.List;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class M0 implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4060h;
    public final /* synthetic */ Object i;

    public /* synthetic */ M0(int i, Object obj) {
        this.f4060h = i;
        this.i = obj;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f4060h) {
            case 0:
                F1.F f6 = (F1.F) obj;
                p123x.O o6 = (p123x.O) this.i;
                E4.k.f("$contentPadding", o6);
                E4.k.f("$this$NavHost", f6);
                V.a aVar = new V.a(1160236594, new N0(o6), true);
                F1.V v6 = f6.f1263g;
                v6.getClass();
                f6.d(new G1.j((G1.i) v6.b(S1.h0.p(G1.i.class)), E4.x.a(HomeScreenRoute.class), aVar));
                f6.d(new G1.j((G1.i) v6.b(S1.h0.p(G1.i.class)), E4.x.a(LightsScreenRoute.class), M.f4042h));
                f6.d(new G1.j((G1.i) v6.b(S1.h0.p(G1.i.class)), E4.x.a(DevicesViewRoute.class), M.i));
                f6.d(new G1.j((G1.i) v6.b(S1.h0.p(G1.i.class)), E4.x.a(PalettesListRoute.class), M.f4043j));
                f6.d(new G1.j((G1.i) v6.b(S1.h0.p(G1.i.class)), E4.x.a(PaletteEditorRoute.class), M.f4044k));
                f6.d(new G1.j((G1.i) v6.b(S1.h0.p(G1.i.class)), E4.x.a(LightDetailsRoute.class), M.f4045l));
                f6.d(new G1.j((G1.i) v6.b(S1.h0.p(G1.i.class)), E4.x.a(FXModeSelectionRoute.class), M.f4046m));
                f6.d(new G1.j((G1.i) v6.b(S1.h0.p(G1.i.class)), E4.x.a(IntensitySelectionRoute.class), M.f4047n));
                f6.d(new G1.j((G1.i) v6.b(S1.h0.p(G1.i.class)), E4.x.a(FXSizeSelectionRoute.class), M.f4048o));
                f6.d(new G1.j((G1.i) v6.b(S1.h0.p(G1.i.class)), E4.x.a(BrightnessRoute.class), M.f4049p));
                f6.d(new G1.j((G1.i) v6.b(S1.h0.p(G1.i.class)), E4.x.a(MusicServicesRoute.class), M.f4050q));
                f6.d(new G1.j((G1.i) v6.b(S1.h0.p(G1.i.class)), E4.x.a(SettingsScreenRoute.class), M.f4051r));
                f6.d(new G1.j((G1.i) v6.b(S1.h0.p(G1.i.class)), E4.x.a(PaywallViewRoute.class), M.f4052s));
                f6.d(new G1.j((G1.i) v6.b(S1.h0.p(G1.i.class)), E4.x.a(MicrophoneRoute.class), M.f4053t));
                f6.d(new G1.j((G1.i) v6.b(S1.h0.p(G1.i.class)), E4.x.a(ManualDelayRoute.class), M.f4054u));
                return p084p4.x.f10867a;
            case 1:
                Palette palette = (Palette) this.i;
                E4.k.f("$palette", palette);
                E4.k.f("$this$DisposableEffect", (N.G) obj);
                return new B.A(2, palette);
            case 2:
                a5.a aVar2 = (a5.a) obj;
                E4.k.f("$this$buildSerialDescriptor", aVar2);
                a5.a.a(aVar2, "type", c5.p0.f7478b);
                a5.a.a(aVar2, "value", S1.V.s("kotlinx.serialization.Polymorphic<" + ((E4.f) ((Y4.c) this.i).f5923a).b() + '>', a5.i.f6372j, new a5.g[0]));
                aVar2.f6341b = p089q4.u.f11237h;
                return p084p4.x.f10867a;
            case 3:
                Semaphore semaphore = (Semaphore) this.i;
                E4.k.f("$semaphore", semaphore);
                E4.k.f("<unused var>", (F2.c) obj);
                semaphore.release();
                return p084p4.x.f10867a;
            case 4:
                int iIntValue = ((Integer) obj).intValue();
                StringBuilder sb = new StringBuilder();
                a5.h hVar = (a5.h) this.i;
                sb.append(hVar.f6366f[iIntValue]);
                sb.append(": ");
                sb.append(hVar.f6367g[iIntValue].b());
                return sb.toString();
            case 5:
                a5.a aVar3 = (a5.a) obj;
                E4.k.f("$this$buildSerialDescriptor", aVar3);
                List list = ((c5.Y) this.i).f7423b;
                E4.k.f("<set-?>", list);
                aVar3.f6341b = list;
                return p084p4.x.f10867a;
            case 6:
                int iIntValue2 = ((Integer) obj).intValue();
                StringBuilder sb2 = new StringBuilder();
                C0480c0 c0480c0 = (C0480c0) this.i;
                sb2.append(c0480c0.f7437e[iIntValue2]);
                sb2.append(": ");
                sb2.append(c0480c0.k(iIntValue2).b());
                return sb2.toString();
            default:
                a5.a aVar4 = (a5.a) obj;
                E4.k.f("$this$buildClassSerialDescriptor", aVar4);
                c5.q0 q0Var = (c5.q0) this.i;
                a5.a.a(aVar4, "first", q0Var.f7479a.getDescriptor());
                a5.a.a(aVar4, "second", q0Var.f7480b.getDescriptor());
                a5.a.a(aVar4, "third", q0Var.f7481c.getDescriptor());
                return p084p4.x.f10867a;
        }
    }
}

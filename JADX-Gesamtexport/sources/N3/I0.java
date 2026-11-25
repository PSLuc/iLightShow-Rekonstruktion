package N3;

import L.AbstractC0149j0;
import L.e2;
import L.g2;
import L.h2;
import N.C0208d;
import N.C0227m0;
import N.C0230o;
import N.InterfaceC0225l0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.Model.Presets.UMPreset;
import com.nanjoran.ilightshow.R;
import com.nanjoran.ilightshow.Services.C0688o0;
import com.nanjoran.ilightshow.Services.PlayerServices.MusicServiceType;
import p015c2.AbstractC0473d;
import p058l0.C0822e;
import p058l0.C0823f;
import p123x.AbstractC1070c;
import p123x.AbstractC1078k;
import p123x.AbstractC1088v;
import p123x.C1069b;
import p123x.C1075h;
import p123x.C1090x;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: loaded from: classes.dex */
public final class I0 implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ MusicServiceType f3967h;
    public final /* synthetic */ boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ N.V0 f3968j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ E4.w f3969k;

    public I0(MusicServiceType musicServiceType, boolean z5, N.V0 v6, E4.w wVar) {
        this.f3967h = musicServiceType;
        this.i = z5;
        this.f3968j = v6;
        this.f3969k = wVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        boolean z5;
        C0230o c0230o;
        boolean z6;
        C0230o c0230o2 = (C0230o) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (c0230o2.f3743O) {
            int i = c0230o2.H.f3609v;
        } else {
            int i3 = c0230o2.f3738F.i;
        }
        if ((iIntValue & 11) == 2 && c0230o2.B()) {
            c0230o2.P();
        } else {
            Z.l lVar = Z.l.f5957a;
            float f6 = 16;
            Z.o oVarK = com.fasterxml.jackson.databind.deser.std.d0.k(androidx.compose.foundation.layout.c.f6634a, A.e.a(f6));
            long j4 = m1.f4224a;
            Z.o oVarB = androidx.compose.foundation.a.b(oVarK, j4, p035g0.H.f9016a);
            float f7 = 2;
            int i6 = p035g0.r.f9086m;
            long jV = p020d2.n.v();
            boolean z7 = this.i;
            MusicServiceType musicServiceType = this.f3967h;
            Z.o oVarG = androidx.compose.foundation.layout.a.g(p081p0.c.F(oVarB, f7, p035g0.r.b((musicServiceType == null || z7) ? ((Number) this.f3968j.getValue()).floatValue() : 0.0f, jV), A.e.a(20)), f6);
            C1069b c1069b = AbstractC1078k.f13777a;
            p123x.U uA = p123x.T.a(new C1075h(12), Z.b.f5942r, c0230o2, 54);
            int i7 = c0230o2.f3744P;
            InterfaceC0225l0 interfaceC0225l0M = c0230o2.m();
            Z.o oVarC = Z.a.c(c0230o2, oVarG);
            InterfaceC1102j.f14043g.getClass();
            C1106n c1106n = C1101i.f14038b;
            c0230o2.Z();
            if (c0230o2.f3743O) {
                c0230o2.l(c1106n);
            } else {
                c0230o2.i0();
            }
            C1100h c1100h = C1101i.f14041e;
            C0208d.R(c1100h, c0230o2, uA);
            C1100h c1100h2 = C1101i.f14040d;
            C0208d.R(c1100h2, c0230o2, interfaceC0225l0M);
            C1100h c1100h3 = C1101i.f14042f;
            if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i7))) {
                p012c.k.y(i7, c0230o2, i7, c1100h3);
            }
            C1100h c1100h4 = C1101i.f14039c;
            C0208d.R(c1100h4, c0230o2, oVarC);
            c0230o2.V(-1045186939);
            MusicServiceType musicServiceTypeB = H3.f.f1787d.b();
            float f8 = 30;
            S1.V.d(com.fasterxml.jackson.databind.deser.std.d0.z(musicServiceTypeB != null ? musicServiceTypeB.getIcon() : R.drawable.ic_music_note_black_24dp, c0230o2), AbstractC0599v0.K(R.string.main_select_music_service, c0230o2), androidx.compose.foundation.layout.c.k(androidx.compose.foundation.layout.c.c(lVar, f8), f8), null, null, 0.0f, null, c0230o2, 392, 120);
            if (z7) {
                c0230o2.V(-1044771478);
                e2.b(AbstractC0599v0.K(R.string.main_sign_in_to_spotify, c0230o2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((g2) c0230o2.k(h2.f2777a)).f2755k, c0230o2, 0, 0, 65534);
                c0230o = c0230o2;
                AbstractC1070c.b(c0230o, p123x.V.a(lVar, 1.0f));
                AbstractC0149j0.b(S1.V.A(), AbstractC0599v0.K(R.string.action_more, c0230o), null, p035g0.r.f9080f, c0230o, 3072, 4);
                z6 = false;
                c0230o.p(false);
            } else if (musicServiceType == null) {
                c0230o2.V(-1044269464);
                e2.b(AbstractC0599v0.K(R.string.main_select_music_service, c0230o2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((g2) c0230o2.k(h2.f2777a)).f2755k, c0230o2, 0, 0, 65534);
                c0230o = c0230o2;
                AbstractC1070c.b(c0230o, p123x.V.a(lVar, 1.0f));
                AbstractC0149j0.b(S1.V.A(), AbstractC0599v0.K(R.string.action_more, c0230o), null, p035g0.r.f9080f, c0230o, 3072, 4);
                z6 = false;
                c0230o.p(false);
            } else {
                c0230o2.V(-1043730064);
                E4.w wVar = this.f3969k;
                if (wVar.f1074h == null) {
                    c0230o2.V(-1043742836);
                    e2.b(AbstractC0599v0.K(R.string.main_no_track_playing, c0230o2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((g2) c0230o2.k(h2.f2777a)).f2755k, c0230o2, 0, 0, 65534);
                    c0230o = c0230o2;
                    AbstractC1070c.b(c0230o, p123x.V.a(lVar, 1.0f));
                    AbstractC0149j0.b(S1.V.A(), AbstractC0599v0.K(R.string.action_more, c0230o), null, p035g0.r.f9080f, c0230o, 3072, 4);
                    c0230o.p(false);
                    z5 = false;
                } else {
                    c0230o2.V(-1043194508);
                    C1090x c1090xA = AbstractC1088v.a(AbstractC1078k.f13779c, Z.b.f5943s, c0230o2, 0);
                    int i8 = c0230o2.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M2 = c0230o2.m();
                    Z.o oVarC2 = Z.a.c(c0230o2, lVar);
                    c0230o2.Z();
                    if (c0230o2.f3743O) {
                        c0230o2.l(c1106n);
                    } else {
                        c0230o2.i0();
                    }
                    C0208d.R(c1100h, c0230o2, c1090xA);
                    C0208d.R(c1100h2, c0230o2, interfaceC0225l0M2);
                    if (c0230o2.f3743O || !E4.k.a(c0230o2.K(), Integer.valueOf(i8))) {
                        p012c.k.y(i8, c0230o2, i8, c1100h3);
                    }
                    C0208d.R(c1100h4, c0230o2, oVarC2);
                    c0230o2.V(986798220);
                    String displayName = musicServiceType.getDisplayName();
                    N.W0 w6 = h2.f2777a;
                    z5 = false;
                    e2.b(displayName, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((g2) c0230o2.k(w6)).f2756l, c0230o2, 0, 0, 65534);
                    String strK = ((B3.f) wVar.f1074h).f557b;
                    c0230o2.V(-1630728319);
                    if (strK == null) {
                        strK = AbstractC0599v0.K(R.string.main_unknown_track, c0230o2);
                    }
                    c0230o2.p(false);
                    e2.b(strK, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((g2) c0230o2.k(w6)).f2755k, c0230o2, 0, 3120, 55294);
                    B3.f fVar = (B3.f) wVar.f1074h;
                    com.nanjoran.ilightshow.Services.M m6 = com.nanjoran.ilightshow.Services.M.f8305O;
                    C0688o0 c0688o0L = m6.l();
                    UMPreset uMPresetG = m6.g();
                    if (uMPresetG != null) {
                        AbstractC0473d.a(fVar, c0688o0L, uMPresetG, j4, p035g0.r.f9082h, p035g0.r.f9078d, p035g0.r.f9081g, c0230o2, 1797704);
                        c0230o = c0230o2;
                        c0230o.p(false);
                        c0230o.p(true);
                        AbstractC1070c.b(c0230o, p123x.V.a(lVar, 1.0f));
                        C0823f c0823fB = S1.V.f4924b;
                        if (c0823fB == null) {
                            C0822e c0822e = new C0822e("Filled.MoreVert", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i9 = p058l0.G.f10217a;
                            p035g0.O o6 = new p035g0.O(p035g0.r.f9076b);
                            C0227m0 c0227m0 = new C0227m0(2);
                            c0227m0.i(12.0f, 8.0f);
                            c0227m0.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                            c0227m0.k(-0.9f, -2.0f, -2.0f, -2.0f);
                            c0227m0.k(-2.0f, 0.9f, -2.0f, 2.0f);
                            c0227m0.k(0.9f, 2.0f, 2.0f, 2.0f);
                            c0227m0.b();
                            c0227m0.i(12.0f, 10.0f);
                            c0227m0.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                            c0227m0.k(0.9f, 2.0f, 2.0f, 2.0f);
                            c0227m0.k(2.0f, -0.9f, 2.0f, -2.0f);
                            c0227m0.k(-0.9f, -2.0f, -2.0f, -2.0f);
                            c0227m0.b();
                            c0227m0.i(12.0f, 16.0f);
                            c0227m0.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                            c0227m0.k(0.9f, 2.0f, 2.0f, 2.0f);
                            c0227m0.k(2.0f, -0.9f, 2.0f, -2.0f);
                            c0227m0.k(-0.9f, -2.0f, -2.0f, -2.0f);
                            c0227m0.b();
                            C0822e.a(c0822e, c0227m0.f3729h, o6);
                            c0823fB = c0822e.b();
                            S1.V.f4924b = c0823fB;
                        }
                        AbstractC0149j0.b(c0823fB, AbstractC0599v0.K(R.string.action_more, c0230o), null, p035g0.r.f9080f, c0230o, 3072, 4);
                        c0230o.p(false);
                    }
                }
                c0230o.p(z5);
                c0230o.p(z5);
                c0230o.p(true);
            }
            z5 = z6;
            c0230o.p(z5);
            c0230o.p(true);
        }
        return p084p4.x.f10867a;
    }
}

package N3;

import L.AbstractC0149j0;
import L.e2;
import N.C0208d;
import N.C0230o;
import N.InterfaceC0225l0;
import android.content.Context;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.R;
import com.nanjoran.ilightshow.Services.PlayerServices.MusicServiceType;
import p123x.AbstractC1070c;
import p123x.AbstractC1078k;
import p123x.AbstractC1088v;
import p123x.C1090x;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: renamed from: N3.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0266g0 implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4178h;
    public final /* synthetic */ Object i;

    public /* synthetic */ C0266g0(int i, Object obj) {
        this.f4178h = i;
        this.i = obj;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        String displayName;
        switch (this.f4178h) {
            case 0:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o.B()) {
                    c0230o.P();
                } else {
                    S1.V.a((K3.a) this.i, c0230o, 8);
                }
                break;
            case 1:
                C0230o c0230o2 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    String str = ((D3.j) this.i).f800b;
                    if (str != null) {
                        e2.b(str, null, 0L, com.fasterxml.jackson.databind.deser.std.d0.q(24), L0.k.f3027l, 0L, null, 0L, 0, false, 0, 0, null, c0230o2, 199680, 0, 131030);
                    }
                }
                break;
            case 2:
                C0230o c0230o3 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o3.B()) {
                    c0230o3.P();
                } else {
                    L.L.a(new V((Context) this.i, 2), null, false, null, null, null, null, null, M.f4035a, c0230o3, 805306368, 510);
                }
                break;
            case 3:
                C0230o c0230o4 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o4.B()) {
                    c0230o4.P();
                } else {
                    Z.l lVar = Z.l.f5957a;
                    C1090x c1090xA = AbstractC1088v.a(AbstractC1078k.f13779c, Z.b.f5943s, c0230o4, 0);
                    int i = c0230o4.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M = c0230o4.m();
                    Z.o oVarC = Z.a.c(c0230o4, lVar);
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n = C1101i.f14038b;
                    c0230o4.Z();
                    if (c0230o4.f3743O) {
                        c0230o4.l(c1106n);
                    } else {
                        c0230o4.i0();
                    }
                    C1100h c1100h = C1101i.f14041e;
                    C0208d.R(c1100h, c0230o4, c1090xA);
                    C1100h c1100h2 = C1101i.f14040d;
                    C0208d.R(c1100h2, c0230o4, interfaceC0225l0M);
                    C1100h c1100h3 = C1101i.f14042f;
                    if (c0230o4.f3743O || !E4.k.a(c0230o4.K(), Integer.valueOf(i))) {
                        p012c.k.y(i, c0230o4, i, c1100h3);
                    }
                    C1100h c1100h4 = C1101i.f14039c;
                    C0208d.R(c1100h4, c0230o4, oVarC);
                    Z.f fVar = Z.b.f5942r;
                    Z.o oVarC2 = androidx.compose.foundation.layout.c.c(lVar, 54);
                    p123x.U uA = p123x.T.a(AbstractC1078k.f13777a, fVar, c0230o4, 48);
                    int i3 = c0230o4.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M2 = c0230o4.m();
                    Z.o oVarC3 = Z.a.c(c0230o4, oVarC2);
                    c0230o4.Z();
                    if (c0230o4.f3743O) {
                        c0230o4.l(c1106n);
                    } else {
                        c0230o4.i0();
                    }
                    C0208d.R(c1100h, c0230o4, uA);
                    C0208d.R(c1100h2, c0230o4, interfaceC0225l0M2);
                    if (c0230o4.f3743O || !E4.k.a(c0230o4.K(), Integer.valueOf(i3))) {
                        p012c.k.y(i3, c0230o4, i3, c1100h3);
                    }
                    C0208d.R(c1100h4, c0230o4, oVarC3);
                    MusicServiceType musicServiceType = (MusicServiceType) this.i;
                    float f6 = 8;
                    S1.V.d(com.fasterxml.jackson.databind.deser.std.d0.z(musicServiceType.getIcon(), c0230o4), null, androidx.compose.foundation.layout.a.g(lVar, f6), null, null, 0.0f, null, c0230o4, 440, 120);
                    MusicServiceType musicServiceType2 = MusicServiceType.Spotify;
                    if (musicServiceType == musicServiceType2 && ((String) com.nanjoran.ilightshow.Services.C0.i.f8242e.getValue()) == null) {
                        c0230o4.V(-979979582);
                        displayName = AbstractC0599v0.K(R.string.main_sign_in_to_spotify, c0230o4);
                        c0230o4.p(false);
                    } else {
                        c0230o4.V(-979845817);
                        displayName = musicServiceType.getDisplayName();
                        if (displayName == null) {
                            displayName = AbstractC0599v0.K(R.string.music_services_unknown, c0230o4);
                        }
                        c0230o4.p(false);
                    }
                    e2.b(displayName, androidx.compose.foundation.layout.a.g(lVar, f6), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o4, 48, 0, 131068);
                    C0230o c0230o5 = c0230o4;
                    AbstractC1070c.b(c0230o5, p123x.V.a(lVar, 1.0f));
                    c0230o5.V(661140510);
                    if (H3.f.f1787d.b() == musicServiceType) {
                        AbstractC0149j0.b(G4.a.t(), AbstractC0599v0.K(R.string.action_checked, c0230o5), androidx.compose.foundation.layout.a.g(lVar, f6), 0L, c0230o5, 384, 8);
                    }
                    c0230o5.p(false);
                    c0230o5.V(661149967);
                    if (musicServiceType == musicServiceType2 && ((String) com.nanjoran.ilightshow.Services.C0.i.f8242e.getValue()) != null) {
                        L.L.a(new H3.g(18), null, false, null, null, null, null, null, P.f4074c, c0230o5, 805306374, 510);
                        c0230o5 = c0230o5;
                    }
                    c0230o5.p(false);
                    c0230o5.p(true);
                    c0230o5.p(true);
                }
                break;
            default:
                C0230o c0230o6 = (C0230o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0230o6.B()) {
                    c0230o6.P();
                } else {
                    Z.l lVar2 = Z.l.f5957a;
                    C1090x c1090xA2 = AbstractC1088v.a(AbstractC1078k.f13779c, Z.b.f5943s, c0230o6, 0);
                    int i6 = c0230o6.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M3 = c0230o6.m();
                    Z.o oVarC4 = Z.a.c(c0230o6, lVar2);
                    InterfaceC1102j.f14043g.getClass();
                    C1106n c1106n2 = C1101i.f14038b;
                    c0230o6.Z();
                    if (c0230o6.f3743O) {
                        c0230o6.l(c1106n2);
                    } else {
                        c0230o6.i0();
                    }
                    C1100h c1100h5 = C1101i.f14041e;
                    C0208d.R(c1100h5, c0230o6, c1090xA2);
                    C1100h c1100h6 = C1101i.f14040d;
                    C0208d.R(c1100h6, c0230o6, interfaceC0225l0M3);
                    C1100h c1100h7 = C1101i.f14042f;
                    if (c0230o6.f3743O || !E4.k.a(c0230o6.K(), Integer.valueOf(i6))) {
                        p012c.k.y(i6, c0230o6, i6, c1100h7);
                    }
                    C1100h c1100h8 = C1101i.f14039c;
                    C0208d.R(c1100h8, c0230o6, oVarC4);
                    Z.f fVar2 = Z.b.f5942r;
                    Z.o oVarC5 = androidx.compose.foundation.layout.c.c(lVar2, 54);
                    p123x.U uA2 = p123x.T.a(AbstractC1078k.f13777a, fVar2, c0230o6, 48);
                    int i7 = c0230o6.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M4 = c0230o6.m();
                    Z.o oVarC6 = Z.a.c(c0230o6, oVarC5);
                    c0230o6.Z();
                    if (c0230o6.f3743O) {
                        c0230o6.l(c1106n2);
                    } else {
                        c0230o6.i0();
                    }
                    C0208d.R(c1100h5, c0230o6, uA2);
                    C0208d.R(c1100h6, c0230o6, interfaceC0225l0M4);
                    if (c0230o6.f3743O || !E4.k.a(c0230o6.K(), Integer.valueOf(i7))) {
                        p012c.k.y(i7, c0230o6, i7, c1100h7);
                    }
                    C0208d.R(c1100h8, c0230o6, oVarC6);
                    float f7 = 8;
                    S1.V.d(com.fasterxml.jackson.databind.deser.std.d0.z(R.drawable.ic_speaker_black_24dp, c0230o6), null, androidx.compose.foundation.layout.a.g(lVar2, f7), null, null, 0.0f, null, c0230o6, 440, 120);
                    F3.a aVar = (F3.a) this.i;
                    String strK = aVar.f1405a;
                    c0230o6.V(661191384);
                    if (strK == null) {
                        strK = AbstractC0599v0.K(R.string.music_services_sonos, c0230o6);
                    }
                    c0230o6.p(false);
                    e2.b(strK, androidx.compose.foundation.layout.a.g(lVar2, f7), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0230o6, 48, 0, 131068);
                    AbstractC1070c.b(c0230o6, p123x.V.a(lVar2, 1.0f));
                    c0230o6.V(661197943);
                    if (H3.f.f1787d.b() == MusicServiceType.Sonos && E4.k.a(com.nanjoran.ilightshow.Services.z0.f8505f.f8509c, aVar)) {
                        AbstractC0149j0.b(G4.a.t(), AbstractC0599v0.K(R.string.action_checked, c0230o6), androidx.compose.foundation.layout.a.g(lVar2, f7), 0L, c0230o6, 384, 8);
                    }
                    c0230o6.p(false);
                    c0230o6.p(true);
                    c0230o6.p(true);
                }
                break;
        }
        return p084p4.x.f10867a;
    }
}

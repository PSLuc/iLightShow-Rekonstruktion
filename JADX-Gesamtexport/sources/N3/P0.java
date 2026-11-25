package N3;

import B.C0043w;
import L.AbstractC0149j0;
import L.AbstractC0151k;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.C0235q0;
import N.InterfaceC0203a0;
import N.InterfaceC0225l0;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.R;
import com.nanjoran.ilightshow.Services.AbstractC0697x;
import com.nanjoran.ilightshow.Services.C0691q;
import com.nanjoran.ilightshow.Services.PlayerServices.MusicServiceType;
import java.util.Arrays;
import p096s.AbstractC0909d;
import p096s.AbstractC0914g;
import p123x.AbstractC1070c;
import p123x.AbstractC1078k;
import p123x.AbstractC1084q;
import p123x.AbstractC1088v;
import p123x.C1069b;
import p123x.C1071d;
import p123x.C1090x;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;

/* JADX INFO: loaded from: classes.dex */
public abstract class P0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ K4.e[] f4082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final N.W0 f4083b;

    static {
        E4.m mVar = new E4.m("lastNotificationId", "<v#0>");
        E4.x.f1075a.getClass();
        f4082a = new K4.e[]{mVar, new E4.m("alreadyLaunchedV3", "<v#1>"), new E4.m("alreadyShownWelcomeV3", "<v#2>"), new E4.m("alreadyTappedMicButton", "<v#3>")};
        f4083b = new N.W0(new H3.g(13));
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0237  */
    /* JADX WARN: Code duplicated, block: B:83:0x03a0  */
    public static final void a(p123x.O o6, C0230o c0230o, int i) {
        W2.g gVar;
        C1100h c1100h;
        C1100h c1100h2;
        float f6;
        C1100h c1100h3;
        C1106n c1106n;
        C1100h c1100h4;
        C1106n c1106n2;
        C1100h c1100h5;
        com.nanjoran.ilightshow.Services.M m6;
        boolean z5;
        C0230o c0230o2;
        C1106n c1106n3;
        C1100h c1100h6;
        C0230o c0230o3;
        E4.k.f("contentPadding", o6);
        c0230o.X(-1278470581);
        if (((i | (c0230o.f(o6) ? 4 : 2)) & 11) == 2 && c0230o.B()) {
            c0230o.P();
            c0230o3 = c0230o;
        } else {
            Class cls = Boolean.TYPE;
            E4.f fVarA = E4.x.a(cls);
            Boolean bool = Boolean.FALSE;
            defpackage.t tVar = new defpackage.t("alreadyLaunchedV3.0", fVarA, bool);
            F1.I i3 = (F1.I) c0230o.k(f4083b);
            defpackage.t tVar2 = new defpackage.t("alreadyShownWelcomeV3", E4.x.a(cls), bool);
            defpackage.t tVar3 = new defpackage.t("alreadyTappedMicButton", E4.x.a(cls), bool);
            com.nanjoran.ilightshow.Services.M m7 = com.nanjoran.ilightshow.Services.M.f8305O;
            C0208d.u(m7.l().f8458j, 0, null, c0230o, 56, 2);
            C0230o c0230o4 = c0230o;
            C0208d.u(m7.l().f8459k, 0, null, c0230o4, 56, 2);
            p084p4.x xVar = p084p4.x.f10867a;
            C0208d.e(new E0(tVar, null), c0230o4, xVar);
            c0230o4.V(257785736);
            Object objK = c0230o4.K();
            if (objK == C0222k.f3714a) {
                objK = C0208d.K(bool, N.U.f3673m);
                c0230o4.f0(objK);
            }
            InterfaceC0203a0 interfaceC0203a0 = (InterfaceC0203a0) objK;
            c0230o4.p(false);
            N.V0 v0B = AbstractC0914g.b(((Boolean) interfaceC0203a0.getValue()).booleanValue() ? 1.0f : 0.1f, AbstractC0909d.k(1000, 6, null), c0230o4, 48, 28);
            Boolean bool2 = (Boolean) m7.l().f8453d.getValue();
            bool2.getClass();
            C0208d.e(new F0(i3, null), c0230o4, bool2);
            C0208d.e(new G0(i3, interfaceC0203a0, null), c0230o4, xVar);
            C0208d.e(new H0(i3, tVar2, null), c0230o4, xVar);
            Z.l lVar = Z.l.f5957a;
            Z.o oVarF = androidx.compose.foundation.layout.a.f(com.fasterxml.jackson.databind.deser.std.d0.G(), o6);
            Z.g gVar2 = Z.b.f5933h;
            p113v0.F fE = AbstractC1084q.e(gVar2, false);
            int i6 = c0230o4.f3744P;
            InterfaceC0225l0 interfaceC0225l0M = c0230o4.m();
            Z.o oVarC = Z.a.c(c0230o4, oVarF);
            InterfaceC1102j.f14043g.getClass();
            C1106n c1106n4 = C1101i.f14038b;
            c0230o4.Z();
            if (c0230o4.f3743O) {
                c0230o4.l(c1106n4);
            } else {
                c0230o4.i0();
            }
            C1100h c1100h7 = C1101i.f14041e;
            C0208d.R(c1100h7, c0230o4, fE);
            C1100h c1100h8 = C1101i.f14040d;
            C0208d.R(c1100h8, c0230o4, interfaceC0225l0M);
            C1100h c1100h9 = C1101i.f14042f;
            if (c0230o4.f3743O || !E4.k.a(c0230o4.K(), Integer.valueOf(i6))) {
                p012c.k.y(i6, c0230o4, i6, c1100h9);
            }
            C1100h c1100h10 = C1101i.f14039c;
            C0208d.R(c1100h10, c0230o4, oVarC);
            H3.f fVar = H3.f.f1787d;
            H3.d dVarA = fVar.a();
            if (dVarA != null) {
                dVarA.a();
            }
            float f7 = 16;
            Z.o oVarG = androidx.compose.foundation.layout.a.g(lVar, f7);
            C1071d c1071d = AbstractC1078k.f13779c;
            Z.e eVar = Z.b.f5943s;
            C1090x c1090xA = AbstractC1088v.a(c1071d, eVar, c0230o4, 0);
            int i7 = c0230o4.f3744P;
            InterfaceC0225l0 interfaceC0225l0M2 = c0230o4.m();
            Z.o oVarC2 = Z.a.c(c0230o4, oVarG);
            c0230o4.Z();
            if (c0230o4.f3743O) {
                c0230o4.l(c1106n4);
            } else {
                c0230o4.i0();
            }
            C0208d.R(c1100h7, c0230o4, c1090xA);
            C0208d.R(c1100h8, c0230o4, interfaceC0225l0M2);
            if (c0230o4.f3743O || !E4.k.a(c0230o4.K(), Integer.valueOf(i7))) {
                p012c.k.y(i7, c0230o4, i7, c1100h9);
            }
            C0208d.R(c1100h10, c0230o4, oVarC2);
            C1069b c1069b = AbstractC1078k.f13777a;
            Z.f fVar2 = Z.b.f5941q;
            p123x.U uA = p123x.T.a(c1069b, fVar2, c0230o4, 0);
            int i8 = c0230o4.f3744P;
            InterfaceC0225l0 interfaceC0225l0M3 = c0230o4.m();
            Z.o oVarC3 = Z.a.c(c0230o4, lVar);
            c0230o4.Z();
            if (c0230o4.f3743O) {
                c0230o4.l(c1106n4);
            } else {
                c0230o4.i0();
            }
            C0208d.R(c1100h7, c0230o4, uA);
            C0208d.R(c1100h8, c0230o4, interfaceC0225l0M3);
            if (c0230o4.f3743O || !E4.k.a(c0230o4.K(), Integer.valueOf(i8))) {
                p012c.k.y(i8, c0230o4, i8, c1100h9);
            }
            C0208d.R(c1100h10, c0230o4, oVarC3);
            c0230o4.V(-1553598376);
            com.nanjoran.ilightshow.Services.F0 f0A = com.nanjoran.ilightshow.Services.E0.f8249o.a();
            com.nanjoran.ilightshow.Services.F0.i.getClass();
            com.nanjoran.ilightshow.Services.F0 f0C = C0691q.c();
            W2.g gVar3 = p035g0.H.f9016a;
            if (f0A == f0C) {
                com.nanjoran.ilightshow.Services.E0.f8249o.getClass();
                if (com.nanjoran.ilightshow.Services.E0.d()) {
                    C0255b c0255b = new C0255b(i3, 14);
                    Z.o oVarK = com.fasterxml.jackson.databind.deser.std.d0.k(lVar, A.e.a(f7));
                    int i9 = p035g0.r.f9086m;
                    gVar = gVar3;
                    c1100h = c1100h8;
                    c1100h2 = c1100h9;
                    f6 = 1.0f;
                    AbstractC0599v0.b(c0255b, androidx.compose.foundation.layout.a.i(androidx.compose.foundation.a.b(oVarK, p020d2.n.v(), gVar3), 8, 0.0f, 2), 0L, M.f4055v, c0230o, 3072, 4);
                    c0230o4 = c0230o;
                } else {
                    gVar = gVar3;
                    c1100h = c1100h8;
                    c1100h2 = c1100h9;
                    f6 = 1.0f;
                }
            } else {
                C0255b c0255b2 = new C0255b(i3, 14);
                Z.o oVarK2 = com.fasterxml.jackson.databind.deser.std.d0.k(lVar, A.e.a(f7));
                int i10 = p035g0.r.f9086m;
                gVar = gVar3;
                c1100h = c1100h8;
                c1100h2 = c1100h9;
                f6 = 1.0f;
                AbstractC0599v0.b(c0255b2, androidx.compose.foundation.layout.a.i(androidx.compose.foundation.a.b(oVarK2, p020d2.n.v(), gVar3), 8, 0.0f, 2), 0L, M.f4055v, c0230o, 3072, 4);
                c0230o4 = c0230o;
            }
            c0230o4.p(false);
            AbstractC1070c.b(c0230o4, p123x.V.a(lVar, f6));
            float f8 = 8;
            Z.o oVarG2 = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.a.f(lVar, false, null, new C0255b(i3, 15), 7), f8);
            p113v0.F fE2 = AbstractC1084q.e(gVar2, false);
            int i11 = c0230o4.f3744P;
            InterfaceC0225l0 interfaceC0225l0M4 = c0230o4.m();
            Z.o oVarC4 = Z.a.c(c0230o4, oVarG2);
            c0230o4.Z();
            if (c0230o4.f3743O) {
                c0230o4.l(c1106n4);
            } else {
                c0230o4.i0();
            }
            C0208d.R(c1100h7, c0230o4, fE2);
            C1100h c1100h11 = c1100h;
            C0208d.R(c1100h11, c0230o4, interfaceC0225l0M4);
            if (c0230o4.f3743O || !E4.k.a(c0230o4.K(), Integer.valueOf(i11))) {
                c1100h3 = c1100h2;
                p012c.k.y(i11, c0230o4, i11, c1100h3);
            } else {
                c1100h3 = c1100h2;
            }
            C0208d.R(c1100h10, c0230o4, oVarC4);
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f6633a;
            p053k0.b bVarZ = com.fasterxml.jackson.databind.deser.std.d0.z(R.drawable.ic_settings_black_24dp, c0230o4);
            String strK = AbstractC0599v0.K(R.string.action_settings, c0230o4);
            int i12 = p035g0.r.f9086m;
            long j4 = p035g0.r.f9080f;
            C1100h c1100h12 = c1100h3;
            AbstractC0149j0.a(bVarZ, strK, androidx.compose.foundation.layout.a.g(lVar, f8), j4, c0230o, 3464);
            c0230o.V(1905858144);
            com.nanjoran.ilightshow.Services.r0.f8470a.getClass();
            if (com.nanjoran.ilightshow.Services.r0.a()) {
                if (!((Boolean) com.nanjoran.ilightshow.Services.r0.f8472c.a(com.nanjoran.ilightshow.Services.r0.f8471b[0])).booleanValue()) {
                    Z.o oVarB = androidx.compose.foundation.a.b(com.fasterxml.jackson.databind.deser.std.d0.k(androidx.compose.foundation.layout.c.h(androidx.compose.foundation.layout.a.e(bVar.a(lVar, Z.b.f5934j), -4, 4), 10), A.e.f6a), p035g0.r.f9081g, gVar);
                    p113v0.F fE3 = AbstractC1084q.e(gVar2, false);
                    int i13 = c0230o.f3744P;
                    InterfaceC0225l0 interfaceC0225l0M5 = c0230o.m();
                    Z.o oVarC5 = Z.a.c(c0230o, oVarB);
                    c0230o.Z();
                    if (c0230o.f3743O) {
                        c0230o.l(c1106n4);
                    } else {
                        c0230o.i0();
                    }
                    C0208d.R(c1100h7, c0230o, fE3);
                    C0208d.R(c1100h11, c0230o, interfaceC0225l0M5);
                    if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i13))) {
                        p012c.k.y(i13, c0230o, i13, c1100h12);
                    }
                    C0208d.R(c1100h10, c0230o, oVarC5);
                    c0230o.p(true);
                }
            }
            c0230o.p(false);
            c0230o.p(true);
            c0230o.p(true);
            Z.o oVarI = androidx.compose.foundation.layout.a.i(lVar, 0.0f, 24, 1);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
            }
            Z.o oVarK3 = oVarI.k(new LayoutWeightElement(1.0f, true));
            FillElement fillElement = androidx.compose.foundation.layout.c.f6634a;
            Z.o oVarK4 = oVarK3.k(fillElement);
            Z.g gVar4 = Z.b.f5936l;
            p113v0.F fE4 = AbstractC1084q.e(gVar4, false);
            int i14 = c0230o.f3744P;
            InterfaceC0225l0 interfaceC0225l0M6 = c0230o.m();
            Z.o oVarC6 = Z.a.c(c0230o, oVarK4);
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n4);
            } else {
                c0230o.i0();
            }
            C0208d.R(c1100h7, c0230o, fE4);
            C0208d.R(c1100h11, c0230o, interfaceC0225l0M6);
            if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i14))) {
                p012c.k.y(i14, c0230o, i14, c1100h12);
            }
            C0208d.R(c1100h10, c0230o, oVarC6);
            p006b.a.g(m7.f8336w, androidx.compose.foundation.layout.c.c(fillElement, 260), c0230o, 56);
            c0230o.p(true);
            MusicServiceType musicServiceTypeB = fVar.b();
            H3.d dVarA2 = fVar.a();
            E4.w wVar = new E4.w();
            wVar.f1074h = dVarA2 != null ? dVarA2.a() : null;
            AbstractC0599v0.b(new C0255b(i3, 16), com.fasterxml.jackson.databind.deser.std.d0.k(lVar, A.e.a(f7)), 0L, V.b.c(481810271, new I0(musicServiceTypeB, musicServiceTypeB == MusicServiceType.Spotify && ((String) com.nanjoran.ilightshow.Services.C0.i.f8242e.getValue()) == null, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x047b: INVOKE 
                  (wrap N3.b:0x0453: CONSTRUCTOR (r15v1 'i3' F1.I), (16 int) A[MD:(F1.I, int):void (m), WRAPPED] call: N3.b.<init>(F1.I, int):void type: CONSTRUCTOR)
                  (wrap Z.o:0x044b: INVOKE 
                  (r11v2 'lVar' Z.l)
                  (wrap A.d:0x0447: INVOKE (r2v19 'f7' float) STATIC call: A.e.a(float):A.d A[MD:(float):A.d (m), WRAPPED])
                 STATIC call: com.fasterxml.jackson.databind.deser.std.d0.k(Z.o, g0.M):Z.o A[MD:(Z.o, g0.M):Z.o (m), WRAPPED])
                  (0 long)
                  (wrap V.a:0x0462: INVOKE 
                  (481810271 int)
                  (wrap N3.I0:0x045c: CONSTRUCTOR 
                  (r1v40 'musicServiceTypeB' com.nanjoran.ilightshow.Services.PlayerServices.MusicServiceType)
                  (wrap boolean:?: TERNARY null = (((r1v40 'musicServiceTypeB' com.nanjoran.ilightshow.Services.PlayerServices.MusicServiceType) == (wrap com.nanjoran.ilightshow.Services.PlayerServices.MusicServiceType:0x0433: SGET  A[WRAPPED] com.nanjoran.ilightshow.Services.PlayerServices.MusicServiceType.Spotify com.nanjoran.ilightshow.Services.PlayerServices.MusicServiceType) && (wrap java.lang.String:0x043f: CHECK_CAST (java.lang.String) (wrap java.lang.Object:0x043b: INVOKE 
                  (wrap N.h0:0x0439: IGET 
                  (wrap com.nanjoran.ilightshow.Services.C0:0x0437: SGET  A[WRAPPED] com.nanjoran.ilightshow.Services.C0.i com.nanjoran.ilightshow.Services.C0)
                 A[WRAPPED] com.nanjoran.ilightshow.Services.C0.e N.h0)
                 VIRTUAL call: N.h0.getValue():java.lang.Object A[MD:():java.lang.Object (m), WRAPPED])) == (null java.lang.String))) ? true : false)
                  (r31v0 ?? I:N.V0)
                  (r13v10 'wVar' E4.w)
                 A[MD:(com.nanjoran.ilightshow.Services.PlayerServices.MusicServiceType, boolean, N.V0, E4.w):void (m), WRAPPED] call: N3.I0.<init>(com.nanjoran.ilightshow.Services.PlayerServices.MusicServiceType, boolean, N.V0, E4.w):void type: CONSTRUCTOR)
                  (r74v0 'c0230o' N.o)
                 STATIC call: V.b.c(int, p4.e, N.o):V.a A[MD:(int, p4.e, N.o):V.a (m), WRAPPED])
                  (r74v0 'c0230o' N.o)
                  (3072 int)
                  (4 int)
                 STATIC call: com.google.android.gms.internal.play_billing.v0.b(D4.a, Z.o, long, V.a, N.o, int, int):void A[MD:(D4.a, Z.o, long, V.a, N.o, int, int):void (m)] in method: N3.P0.a(x.O, N.o, int):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:414)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:402)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:352)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r31v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 2453
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: N3.P0.a(x.O, N.o, int):void");
        }

        public static final void b(int i, C0230o c0230o) {
            Context context;
            defpackage.t tVar;
            boolean z5;
            C0230o c0230o2 = c0230o;
            c0230o2.X(302869110);
            if (i == 0 && c0230o2.B()) {
                c0230o2.P();
            } else {
                Context context2 = (Context) c0230o2.k(AndroidCompositionLocals_androidKt.f6730b);
                defpackage.t tVar2 = new defpackage.t("lastNotificationId", E4.x.a(Integer.TYPE), 0);
                c0230o2.V(-706869918);
                if (((Boolean) com.nanjoran.ilightshow.Services.C0.i.f8244g.getValue()).booleanValue()) {
                    tVar = tVar2;
                    z5 = false;
                    context = context2;
                    AbstractC0151k.a(new H3.g(14), V.b.c(-278916989, new C0266g0(2, context2), c0230o2), null, M.f4037c, M.f4038d, M.f4039e, null, 0L, 0L, 0L, 0L, 0.0f, null, c0230o, 1772598, 16276);
                    c0230o2 = c0230o;
                } else {
                    context = context2;
                    tVar = tVar2;
                    z5 = false;
                }
                c0230o2.p(z5);
                C0208d.e(new L0(context, tVar, null), c0230o2, AbstractC0697x.a());
                V.a aVar = M.f4035a;
                O3.c.a(384, c0230o2, z5);
            }
            C0235q0 c0235q0T = c0230o2.t();
            if (c0235q0T != null) {
                c0235q0T.f3780d = new C0253a(i, 9);
            }
        }

        public static final void c(final p123x.O o6, C0230o c0230o, final int i) throws Throwable {
            int i3;
            C0230o c0230o2;
            int i6 = 0;
            E4.k.f("contentPadding", o6);
            c0230o.X(1769725937);
            if ((i & 14) == 0) {
                i3 = (c0230o.f(o6) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            if ((i3 & 11) == 2 && c0230o.B()) {
                c0230o.P();
                c0230o2 = c0230o;
            } else {
                Context context = (Context) c0230o.k(AndroidCompositionLocals_androidKt.f6730b);
                Object[] objArrCopyOf = Arrays.copyOf(new F1.U[0], 0);
                G1.q qVar = G1.q.f1639h;
                A2.e eVar = new A2.e(10, context);
                D.x xVar = W.m.f5538a;
                D.x xVar2 = new D.x(qVar, 19, eVar);
                boolean zH = c0230o.h(context);
                Object objK = c0230o.K();
                if (zH || objK == C0222k.f3714a) {
                    objK = new C0043w(15, context);
                    c0230o.f0(objK);
                }
                c0230o2 = c0230o;
                F1.I i7 = (F1.I) p020d2.n.H(objArrCopyOf, xVar2, (D4.a) objK, c0230o2, 0, 4);
                C0208d.a(f4083b.a(i7), V.b.c(-729439055, new O0(i7, i6, o6), c0230o2), c0230o2, 56);
            }
            C0235q0 c0235q0T = c0230o2.t();
            if (c0235q0T != null) {
                c0235q0T.f3780d = new D4.e() { // from class: N3.D0
                    @Override // D4.e
                    public final Object d(Object obj, Object obj2) throws Throwable {
                        ((Integer) obj2).intValue();
                        p123x.O o7 = o6;
                        E4.k.f("$contentPadding", o7);
                        P0.c(o7, (C0230o) obj, C0208d.V(i | 1));
                        return p084p4.x.f10867a;
                    }
                };
            }
        }
    }

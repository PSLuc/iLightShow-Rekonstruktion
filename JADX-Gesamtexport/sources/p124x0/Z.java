package p124x0;

import P.d;
import Z.m;
import Z.n;
import androidx.compose.ui.focus.b;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import okhttp3.internal.http2.Http2;
import p024e0.c;
import p024e0.e;
import p024e0.l;
import p027e3.a;
import p080p.B;
import p080p.v;
import p113v0.K;
import p123x.G;
import p130y0.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f13997a;

    static {
        v vVar = B.f10713a;
        f13997a = new v();
    }

    public static final void a(n nVar) {
        if (nVar.f5969t) {
            b(nVar, -1, 1);
        } else {
            a.y0("autoInvalidateInsertedNode called on unattached node");
            throw null;
        }
    }

    public static final void b(n nVar, int i, int i3) {
        if (!(nVar instanceof AbstractC1105m)) {
            c(nVar, i & nVar.f5959j, i3);
            return;
        }
        AbstractC1105m abstractC1105m = (AbstractC1105m) nVar;
        c(nVar, abstractC1105m.f14045u & i, i3);
        int i6 = (~abstractC1105m.f14045u) & i;
        for (n nVar2 = abstractC1105m.f14046v; nVar2 != null; nVar2 = nVar2.f5962m) {
            b(nVar2, i6, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void c(n nVar, int i, int i3) {
        if (i3 != 0 || nVar.o0()) {
            if ((i & 2) != 0 && (nVar instanceof InterfaceC1114w)) {
                AbstractC1098f.m((InterfaceC1114w) nVar);
                if (i3 == 2) {
                    Y yQ = AbstractC1098f.q(nVar, 2);
                    yQ.f13992v = true;
                    yQ.I.invoke();
                    if (yQ.f13988K != null) {
                        yQ.h1(null, false);
                        yQ.f13989s.P(false);
                    }
                }
            }
            if ((i & 128) != 0 && (nVar instanceof InterfaceC1113v) && i3 != 2) {
                AbstractC1098f.s(nVar).A();
            }
            if ((i & HueLog.LogComponent.STREAMDTLS) != 0 && (nVar instanceof InterfaceC1108p) && i3 != 2) {
                D dS = AbstractC1098f.s(nVar);
                J j4 = dS.f13829D;
                if (!j4.f13911e && !j4.f13910d && !dS.J) {
                    r rVar = (r) AbstractC1098f.u(dS);
                    ((d) rVar.f14467N.f13952e.f14007b).c(dS);
                    dS.J = true;
                    rVar.A(null);
                }
            }
            if ((i & 4) != 0 && (nVar instanceof InterfaceC1107o)) {
                AbstractC1098f.l((InterfaceC1107o) nVar);
            }
            if ((i & 8) != 0 && (nVar instanceof m0)) {
                AbstractC1098f.n((m0) nVar);
            }
            if ((i & 64) != 0 && (nVar instanceof i0)) {
                J j6 = AbstractC1098f.s((i0) nVar).f13829D;
                j6.f13923r.f13903w = true;
                H h6 = j6.f13924s;
                if (h6 != null) {
                    h6.f13866B = true;
                }
            }
            if ((i & 1024) != 0 && (nVar instanceof p024e0.r) && i3 != 2) {
                p024e0.d.q((p024e0.r) nVar);
            }
            if ((i & 2048) != 0 && (nVar instanceof l)) {
                l lVar = (l) nVar;
                C1099g.f14024b = null;
                lVar.P(C1099g.f14023a);
                if (C1099g.f14024b != null) {
                    if (i3 == 2) {
                        n nVar2 = ((n) lVar).f5958h;
                        if (!nVar2.f5969t) {
                            throw new IllegalStateException("visitChildren called on an unattached node");
                        }
                        d dVar = new d(new n[16]);
                        n nVar3 = nVar2.f5962m;
                        if (nVar3 == null) {
                            AbstractC1098f.b(dVar, nVar2);
                        } else {
                            dVar.c(nVar3);
                        }
                        while (dVar.n()) {
                            n nVarE = (n) dVar.p(dVar.f4583j - 1);
                            if ((nVarE.f5960k & 1024) == 0) {
                                AbstractC1098f.b(dVar, nVarE);
                            } else {
                                while (nVarE != null) {
                                    if ((nVarE.f5959j & 1024) != 0) {
                                        d dVar2 = null;
                                        while (nVarE != null) {
                                            if (nVarE instanceof p024e0.r) {
                                                p024e0.d.q((p024e0.r) nVarE);
                                            } else if ((nVarE.f5959j & 1024) != 0 && (nVarE instanceof AbstractC1105m)) {
                                                int i6 = 0;
                                                for (n nVar4 = ((AbstractC1105m) nVarE).f14046v; nVar4 != null; nVar4 = nVar4.f5962m) {
                                                    if ((nVar4.f5959j & 1024) != 0) {
                                                        i6++;
                                                        if (i6 == 1) {
                                                            nVarE = nVar4;
                                                        } else {
                                                            if (dVar2 == null) {
                                                                dVar2 = new d(new n[16]);
                                                            }
                                                            if (nVarE != null) {
                                                                dVar2.c(nVarE);
                                                                nVarE = null;
                                                            }
                                                            dVar2.c(nVar4);
                                                        }
                                                    }
                                                }
                                                if (i6 == 1) {
                                                }
                                            }
                                            nVarE = AbstractC1098f.e(dVar2);
                                        }
                                        break;
                                    }
                                    nVarE = nVarE.f5962m;
                                }
                            }
                        }
                    } else {
                        e eVar = ((b) ((r) AbstractC1098f.t(lVar)).getFocusOwner()).f6704g;
                        eVar.b(eVar.f8646e, lVar);
                    }
                }
            }
            if ((i & 4096) == 0 || !(nVar instanceof c)) {
                return;
            }
            c cVar = (c) nVar;
            e eVar2 = ((b) ((r) AbstractC1098f.t(cVar)).getFocusOwner()).f6704g;
            eVar2.b(eVar2.f8645d, cVar);
        }
    }

    public static final void d(n nVar) {
        if (nVar.f5969t) {
            b(nVar, -1, 0);
        } else {
            a.y0("autoInvalidateUpdatedNode called on unattached node");
            throw null;
        }
    }

    public static final int e(m mVar) {
        int i = mVar instanceof p113v0.r ? 3 : 1;
        if (mVar instanceof p019d0.e) {
            i |= 4;
        }
        if (mVar instanceof AppendedSemanticsElement) {
            i |= 8;
        }
        if ((mVar instanceof p118w0.c) || (mVar instanceof G)) {
            i |= 32;
        }
        return mVar instanceof K ? i | 64 : i;
    }

    public static final int f(n nVar) {
        int i = nVar.f5959j;
        if (i != 0) {
            return i;
        }
        Class<?> cls = nVar.getClass();
        v vVar = f13997a;
        int iC = vVar.c(cls);
        if (iC >= 0) {
            return vVar.f10790c[iC];
        }
        int i3 = nVar instanceof InterfaceC1114w ? 3 : 1;
        if (nVar instanceof InterfaceC1107o) {
            i3 |= 4;
        }
        if (nVar instanceof m0) {
            i3 |= 8;
        }
        if (nVar instanceof k0) {
            i3 |= 16;
        }
        if (nVar instanceof p118w0.e) {
            i3 |= 32;
        }
        if (nVar instanceof i0) {
            i3 |= 64;
        }
        if (nVar instanceof InterfaceC1113v) {
            i3 |= 128;
        }
        if (nVar instanceof InterfaceC1108p) {
            i3 |= HueLog.LogComponent.STREAMDTLS;
        }
        if (nVar instanceof p024e0.r) {
            i3 |= 1024;
        }
        if (nVar instanceof l) {
            i3 |= 2048;
        }
        if (nVar instanceof c) {
            i3 |= 4096;
        }
        if (nVar instanceof p081p0.d) {
            i3 |= 8192;
        }
        if (nVar instanceof p102t0.a) {
            i3 |= Http2.INITIAL_MAX_FRAME_SIZE;
        }
        if (nVar instanceof InterfaceC1103k) {
            i3 |= 32768;
        }
        if (nVar instanceof p0) {
            i3 |= 262144;
        }
        int iB = vVar.b(cls);
        if (iB < 0) {
            iB = ~iB;
        }
        vVar.f10789b[iB] = cls;
        vVar.f10790c[iB] = i3;
        return i3;
    }

    public static final int g(n nVar) {
        if (!(nVar instanceof AbstractC1105m)) {
            return f(nVar);
        }
        AbstractC1105m abstractC1105m = (AbstractC1105m) nVar;
        int iG = abstractC1105m.f14045u;
        for (n nVar2 = abstractC1105m.f14046v; nVar2 != null; nVar2 = nVar2.f5962m) {
            iG |= g(nVar2);
        }
        return iG;
    }

    public static final boolean h(int i) {
        return (i & 128) != 0;
    }
}

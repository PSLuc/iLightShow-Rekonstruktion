package B2;

import N3.M0;
import S1.V;
import com.github.kittinunf.fuel.core.FuelError;
import com.github.kittinunf.fuel.core.HttpException;
import com.nanjoran.ilightshow.Model.Data.AuthRequest;
import java.io.Serializable;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p126x2.InterfaceC1118a;
import p126x2.t;
import p126x2.u;
import p126x2.v;
import p126x2.w;
import p126x2.x;
import p126x2.z;

/* JADX INFO: loaded from: classes.dex */
public final class r implements w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f535e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p084p4.m f536a = G4.a.z(new p(this, 2));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p084p4.m f537b = G4.a.z(new p(this, 1));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p084p4.m f538c = G4.a.z(new p(this, 0));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f539d;

    public r(w wVar) {
        this.f539d = wVar;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x007c A[Catch: all -> 0x0083, TryCatch #1 {all -> 0x0083, blocks: (B:33:0x006a, B:38:0x0076, B:40:0x007c, B:43:0x0085, B:44:0x0094, B:37:0x0072, B:34:0x006c), top: B:64:0x006a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0085 A[Catch: all -> 0x0083, TryCatch #1 {all -> 0x0083, blocks: (B:33:0x006a, B:38:0x0076, B:40:0x007c, B:43:0x0085, B:44:0x0094, B:37:0x0072, B:34:0x006c), top: B:64:0x006a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x009f  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:64:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A(p122w4.c cVar) {
        o oVar;
        Object objV;
        p084p4.h hVar;
        Object objV2;
        Throwable thA;
        Throwable thA2;
        Throwable thA3;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i = oVar.f526l;
            if ((i & Integer.MIN_VALUE) != 0) {
                oVar.f526l = i - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object objB = oVar.f525k;
        v4.a aVar = v4.a.f13292h;
        int i3 = oVar.f526l;
        try {
            if (i3 == 0) {
                V.O(objB);
                try {
                    objV = (w) C().f14132n.invoke(this.f539d.u());
                } catch (Throwable th) {
                    objV = V.v(th);
                }
                if (!(objV instanceof p084p4.j)) {
                    oVar.f528n = this;
                    oVar.f526l = 1;
                    objB = B((w) objV, oVar);
                    if (objB == aVar) {
                        return aVar;
                    }
                }
                if (!(objV instanceof p084p4.j)) {
                    try {
                        hVar = (p084p4.h) objV;
                        try {
                            objV2 = this.D(hVar);
                        } catch (Throwable th2) {
                            objV2 = V.v(th2);
                        }
                        thA = p084p4.k.a(objV2);
                        if (thA == null) {
                            p120w2.a.f13456b.getClass();
                            int i6 = FuelError.i;
                            throw p126x2.g.a(thA, (z) hVar.i);
                        }
                        V.O(objV2);
                        objV = (z) objV2;
                    } catch (Throwable th3) {
                        objV = V.v(th3);
                    }
                }
                thA2 = p084p4.k.a(objV);
                if (thA2 != null) {
                    p120w2.a.f13456b.getClass();
                    if ((thA2 instanceof FuelError) && ((FuelError) thA2).a()) {
                        ((D4.c) this.f536a.getValue()).invoke(this.f539d.u());
                    }
                }
                if (!(objV instanceof p084p4.j)) {
                    objV = new F2.b((z) objV);
                }
                thA3 = p084p4.k.a(objV);
                if (thA3 != null) {
                    objV = new F2.a((FuelError) thA3);
                }
                V.O(objV);
                return objV;
            }
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = oVar.f528n;
            V.O(objB);
            objV = (p084p4.h) objB;
        } catch (Throwable th4) {
            objV = V.v(th4);
        }
        if (!(objV instanceof p084p4.j)) {
            hVar = (p084p4.h) objV;
            objV2 = this.D(hVar);
            thA = p084p4.k.a(objV2);
            if (thA == null) {
                p120w2.a.f13456b.getClass();
                int i7 = FuelError.i;
                throw p126x2.g.a(thA, (z) hVar.i);
            }
            V.O(objV2);
            objV = (z) objV2;
        }
        thA2 = p084p4.k.a(objV);
        if (thA2 != null) {
            p120w2.a.f13456b.getClass();
            if (thA2 instanceof FuelError) {
                ((D4.c) this.f536a.getValue()).invoke(this.f539d.u());
            }
        }
        if (!(objV instanceof p084p4.j)) {
            objV = new F2.b((z) objV);
        }
        thA3 = p084p4.k.a(objV);
        if (thA3 != null) {
            objV = new F2.a((FuelError) thA3);
        }
        V.O(objV);
        return objV;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable B(w wVar, p122w4.c cVar) throws FuelError {
        q qVar;
        Serializable serializableV;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i = qVar.f531l;
            if ((i & Integer.MIN_VALUE) != 0) {
                qVar.f531l = i - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object objA = qVar.f530k;
        v4.a aVar = v4.a.f13292h;
        int i3 = qVar.f531l;
        try {
            if (i3 == 0) {
                V.O(objA);
                p126x2.d dVar = (p126x2.d) this.f538c.getValue();
                qVar.f533n = this;
                qVar.f534o = wVar;
                qVar.f531l = 1;
                objA = ((D2.b) dVar).a(wVar, qVar);
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wVar = qVar.f534o;
                this = qVar.f533n;
                V.O(objA);
            }
            serializableV = new p084p4.h(wVar, objA);
        } catch (Throwable th) {
            serializableV = V.v(th);
        }
        Throwable thA = p084p4.k.a(serializableV);
        if (thA == null) {
            V.O(serializableV);
            return serializableV;
        }
        int i6 = FuelError.i;
        throw p126x2.g.a(thA, new z(this.f539d.q()));
    }

    public final x C() {
        return (x) this.f537b.getValue();
    }

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
    public final z D(p084p4.h hVar) throws FuelError {
        Object objV;
        w wVar = (w) hVar.f10849h;
        z zVar = (z) hVar.i;
        try {
            objV = (z) C().f14133o.d(wVar, zVar);
        } catch (Throwable th) {
            objV = V.v(th);
        }
        boolean z5 = objV instanceof p084p4.j;
        Object objV2 = objV;
        if (!z5) {
            try {
                z zVar2 = (z) objV;
                if (!((Boolean) C().f14126g.invoke(zVar2)).booleanValue()) {
                    int i = FuelError.i;
                    throw p126x2.g.a(new HttpException(zVar2.f14135b, zVar2.f14136c), zVar2);
                }
                objV2 = zVar2;
            } catch (Throwable th2) {
                objV2 = V.v(th2);
            }
        }
        Throwable thA = p084p4.k.a(objV2);
        if (thA == null) {
            V.O(objV2);
            return (z) objV2;
        }
        int i3 = FuelError.i;
        throw p126x2.g.a(thA, zVar);
    }

    @Override // p126x2.w
    public final w a(v vVar) {
        E4.k.f("handler", vVar);
        return this.f539d.a(vVar);
    }

    @Override // p126x2.w
    public final void b(x xVar) {
        this.f539d.b(xVar);
    }

    @Override // p126x2.w
    public final w c() {
        return this.f539d.c();
    }

    @Override // p126x2.w
    public final w d(String str, String str2) {
        E4.k.f("value", str2);
        return this.f539d.d(str, str2);
    }

    @Override // p126x2.w
    public final void e(URL url) {
        E4.k.f("<set-?>", url);
        this.f539d.e(url);
    }

    @Override // p126x2.w
    public final x f() {
        return this.f539d.f();
    }

    @Override // p126x2.w
    public final b g(M0 m6) {
        return this.f539d.g(m6);
    }

    @Override // p126x2.w, java.util.concurrent.Future
    public final Collection get() {
        return this.f539d.get();
    }

    @Override // p126x2.w
    public final w h(String str, Charset charset) {
        E4.k.f("body", str);
        E4.k.f("charset", charset);
        return this.f539d.h(str, charset);
    }

    @Override // p126x2.w
    public final b i(p000a.a aVar) {
        return this.f539d.i(aVar);
    }

    @Override // p126x2.w
    public final InterfaceC1118a j() {
        return this.f539d.j();
    }

    @Override // p126x2.w
    public final w k(v vVar) {
        E4.k.f("handler", vVar);
        return this.f539d.k(vVar);
    }

    @Override // p126x2.w
    public final t l() {
        return this.f539d.l();
    }

    @Override // p126x2.w
    public final b m(defpackage.d dVar) {
        return this.f539d.m(dVar);
    }

    @Override // p126x2.w
    public final void n() {
        this.f539d.n();
    }

    @Override // p126x2.w
    public final w o(t tVar) {
        return this.f539d.o(tVar);
    }

    @Override // p126x2.w
    public final w p(String str, String str2) {
        return this.f539d.p("Content-Type", "application/json");
    }

    @Override // p126x2.w
    public final URL q() {
        return this.f539d.q();
    }

    @Override // p126x2.w
    public final b r(AuthRequest.Deserializer deserializer, D4.f fVar) {
        return this.f539d.r(deserializer, fVar);
    }

    @Override // p126x2.w
    public final w s(p084p4.h... hVarArr) {
        return this.f539d.s(hVarArr);
    }

    @Override // p126x2.w
    public final List t() {
        return this.f539d.t();
    }

    @Override // p126x2.w
    public final String toString() {
        return this.f539d.toString();
    }

    @Override // p126x2.y
    public final w u() {
        return this.f539d.u();
    }

    @Override // p126x2.w
    public final w v(InterfaceC1118a interfaceC1118a) {
        E4.k.f("body", interfaceC1118a);
        return this.f539d.v(interfaceC1118a);
    }

    @Override // p126x2.w
    public final Map w() {
        return this.f539d.w();
    }

    @Override // p126x2.w
    public final u x() {
        return this.f539d.x();
    }

    @Override // p126x2.w
    public final p084p4.n y() {
        return this.f539d.y();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(p122w4.c cVar) {
        n nVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i = nVar.f523l;
            if ((i & Integer.MIN_VALUE) != 0) {
                nVar.f523l = i - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objA = nVar.f522k;
        Object obj = v4.a.f13292h;
        int i3 = nVar.f523l;
        if (i3 == 0) {
            V.O(objA);
            nVar.f523l = 1;
            objA = A(nVar);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(objA);
        }
        return ((F2.c) objA).c();
    }
}

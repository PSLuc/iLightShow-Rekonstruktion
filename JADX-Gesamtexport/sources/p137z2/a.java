package p137z2;

import A2.d;
import B.D;
import B2.m;
import B2.r;
import D4.f;
import S1.V;
import com.github.kittinunf.fuel.core.FuelError;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.Future;
import kotlin.NoWhenBranchMatchedException;
import p084p4.k;
import p084p4.n;
import p085q.b;
import p090r.v;
import p112v.C1016z;
import p122w4.c;
import p126x2.g;
import p126x2.h;
import p126x2.i;
import p126x2.j;
import p126x2.w;
import p126x2.x;
import p126x2.z;
import p130y0.C1136i0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable a(w wVar, b bVar, c cVar) throws FuelError {
        i iVar;
        h hVar;
        Serializable serializableV;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i = iVar.f14075l;
            if ((i & Integer.MIN_VALUE) != 0) {
                iVar.f14075l = i - Integer.MIN_VALUE;
            } else {
                iVar = new i(cVar);
            }
        } else {
            iVar = new i(cVar);
        }
        Object objZ = iVar.f14074k;
        v4.a aVar = v4.a.f13292h;
        int i3 = iVar.f14075l;
        if (i3 == 0) {
            V.O(objZ);
            r rVarH = G4.a.H(wVar);
            iVar.f14076m = wVar;
            iVar.f14077n = bVar;
            iVar.f14075l = 1;
            objZ = rVarH.z(iVar);
            hVar = bVar;
            if (objZ == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h hVar2 = iVar.f14077n;
            wVar = iVar.f14076m;
            V.O(objZ);
            hVar = hVar2;
        }
        z zVar = (z) objZ;
        try {
            serializableV = new n(wVar, zVar, hVar.deserialize(zVar));
        } catch (Throwable th) {
            serializableV = V.v(th);
        }
        Throwable thA = k.a(serializableV);
        if (thA == null) {
            V.O(serializableV);
            return serializableV;
        }
        int i6 = FuelError.i;
        throw g.a(thA, zVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable b(w wVar, C1136i0 c1136i0, c cVar) {
        j jVar;
        h hVar;
        F2.c aVar;
        F2.c aVar2;
        z zVar;
        Object aVar3;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i = jVar.f14079l;
            if ((i & Integer.MIN_VALUE) != 0) {
                jVar.f14079l = i - Integer.MIN_VALUE;
            } else {
                jVar = new j(cVar);
            }
        } else {
            jVar = new j(cVar);
        }
        Object objA = jVar.f14078k;
        v4.a aVar4 = v4.a.f13292h;
        int i3 = jVar.f14079l;
        if (i3 == 0) {
            V.O(objA);
            r rVarH = G4.a.H(wVar);
            jVar.f14080m = wVar;
            jVar.f14081n = c1136i0;
            jVar.f14079l = 1;
            objA = rVarH.A(jVar);
            hVar = c1136i0;
            if (objA == aVar4) {
                return aVar4;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h hVar2 = jVar.f14081n;
            wVar = jVar.f14080m;
            V.O(objA);
            hVar = hVar2;
        }
        F2.c cVar2 = (F2.c) objA;
        try {
            if (cVar2 instanceof F2.b) {
                z zVar2 = (z) ((F2.b) cVar2).f1404a;
                aVar = new F2.b(new p084p4.h(zVar2, hVar.deserialize(zVar2)));
            } else {
                if (!(cVar2 instanceof F2.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new F2.a(((F2.a) cVar2).f1403a);
            }
        } catch (Exception e6) {
            aVar = new F2.a(e6);
        }
        v vVar = new v(13, cVar2);
        if (aVar instanceof F2.b) {
            aVar2 = new F2.b(((F2.b) aVar).f1404a);
        } else {
            if (!(aVar instanceof F2.a)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar2 = new F2.a((Exception) vVar.invoke(((F2.a) aVar).f1403a));
        }
        if (aVar2 instanceof F2.b) {
            zVar = (z) ((p084p4.h) ((F2.b) aVar2).f1404a).f10849h;
        } else {
            if (!(aVar2 instanceof F2.a)) {
                throw new NoWhenBranchMatchedException();
            }
            zVar = ((FuelError) ((F2.a) aVar2).f1403a).f7771h;
        }
        try {
            if (aVar2 instanceof F2.b) {
                aVar3 = new F2.b(((p084p4.h) ((F2.b) aVar2).f1404a).i);
            } else {
                if (!(aVar2 instanceof F2.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar3 = new F2.a(((F2.a) aVar2).f1403a);
            }
        } catch (Exception e7) {
            aVar3 = new F2.a(e7);
        }
        return new n(wVar, zVar, aVar3);
    }

    public static w c(w wVar, String str) {
        Charset charset = M4.a.f3520a;
        E4.k.f("$this$jsonBody", wVar);
        E4.k.f("body", str);
        E4.k.f("charset", charset);
        wVar.p("Content-Type", "application/json");
        return wVar.h(str, charset);
    }

    public static final B2.b d(B2.h hVar, h hVar2, D4.c cVar) {
        return f(hVar, hVar2, new C1016z(cVar, 2), new C1016z(cVar, 3));
    }

    public static final B2.b e(w wVar, h hVar, f fVar) {
        E4.k.f("$this$response", wVar);
        return f(wVar, hVar, new p126x2.k(fVar, 0), new p126x2.k(fVar, 1));
    }

    public static final B2.b f(w wVar, h hVar, f fVar, f fVar2) {
        m mVar = new m(wVar, new D(wVar, hVar, fVar, fVar2), new d(wVar, fVar2));
        String str = B2.b.f490e;
        x xVarF = wVar.f();
        xVarF.getClass();
        Future futureSubmit = xVarF.f14130l.submit(mVar);
        E4.k.e("executorService.submit(task)", futureSubmit);
        Map mapW = wVar.w();
        String str2 = B2.b.f490e;
        Object obj = mapW.get(str2);
        if (!(obj instanceof B2.b)) {
            obj = null;
        }
        B2.b bVar = (B2.b) obj;
        if (bVar == null) {
            bVar = new B2.b(wVar, futureSubmit);
        }
        if (wVar != bVar) {
            wVar.w().put(str2, bVar);
        }
        return bVar;
    }
}

package p015c2;

import B.AbstractC0013g0;
import S1.A;
import T1.b;
import T1.c;
import T1.d;
import T1.l;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import p009b2.f;
import p026e2.a;
import p026e2.g;
import p026e2.i;
import p026e2.j;
import p026e2.q;
import p032f2.k;
import p046i2.I;
import p046i2.s;
import p046i2.z;
import p087q2.m;
import p087q2.o;
import p087q2.p;
import p087q2.r;
import p093r2.e;
import p093r2.h;
import p104t2.n;
import p109u2.x;
import p109u2.y;

/* JADX INFO: loaded from: classes.dex */
public class u extends l implements Serializable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f7318q;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f7319h;
    public final n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C f7320j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h f7321k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f7322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0474e f7323m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k f7324n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinkedHashSet f7325o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ConcurrentHashMap f7326p;

    static {
        z zVar = new z();
        zVar.f9587h = new p109u2.n(48, 48);
        zVar.i = true;
        f7318q = new a(null, zVar, n.f12536k, x.f12725t, Locale.getDefault(), b.f5157a, new p009b2.l());
    }

    public u(c cVar) {
        a aVar;
        this.f7326p = new ConcurrentHashMap(64, 0.6f, 2);
        if (cVar == null) {
            this.f7319h = new s(this);
        } else {
            this.f7319h = cVar;
            if (cVar.f5165l == null) {
                cVar.f5165l = this;
            }
        }
        p077o2.l lVar = new p077o2.l();
        p109u2.n nVar = new p109u2.n();
        nVar.f12708h = new p109u2.n(20, 200);
        this.i = n.f12536k;
        I i = new I();
        s sVar = new s();
        a aVar2 = f7318q;
        if (aVar2.i == sVar) {
            aVar = aVar2;
        } else {
            aVar = new a(sVar, aVar2.f8681j, aVar2.f8680h, aVar2.f8683l, aVar2.f8684m, aVar2.f8685n, aVar2.f8682k);
        }
        A a6 = A.f4905l;
        g gVar = new g();
        p026e2.c cVar2 = new p026e2.c();
        j jVar = i.f8702a;
        this.f7320j = new C(aVar, lVar, i, nVar, gVar, jVar);
        this.f7323m = new C0474e(aVar, lVar, i, nVar, gVar, cVar2, jVar);
        this.f7319h.getClass();
        C c6 = this.f7320j;
        r rVar = r.SORT_PROPERTIES_ALPHABETICALLY;
        if (c6.k(rVar)) {
            h(rVar, false);
        }
        this.f7321k = new h();
        Class[] clsArr = p032f2.g.f8913k;
        this.f7324n = new k();
        this.f7322l = e.f11756p;
    }

    public static void b(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(AbstractC0013g0.i("argument \"", str, "\" is null"));
        }
    }

    public static void f(Y1.e eVar, k kVar, h hVar) throws MismatchedInputException {
        T1.k kVarB0 = eVar.B0();
        if (kVarB0 != null) {
            Annotation[] annotationArr = p109u2.i.f12697a;
            throw new MismatchedInputException((Closeable) eVar, "Trailing token (of type " + kVarB0 + ") found after value (bound as " + p109u2.i.z(hVar == null ? null : hVar.f7281k) + "): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`");
        }
    }

    @Override // T1.l
    public final void a(T1.e eVar, Object obj) throws IOException {
        C c6 = this.f7320j;
        if (c6.p(D.INDENT_OUTPUT) && eVar.f5181h == null) {
            f fVar = c6.f7199r;
            if (fVar != null) {
                fVar = new f(fVar);
            }
            eVar.f5181h = fVar;
        }
        if (!c6.p(D.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            e(c6).B0(eVar, obj);
            if (c6.p(D.FLUSH_AFTER_WRITE_VALUE)) {
                eVar.flush();
                return;
            }
            return;
        }
        Closeable closeable = (Closeable) obj;
        try {
            e(c6).B0(eVar, obj);
            if (c6.p(D.FLUSH_AFTER_WRITE_VALUE)) {
                eVar.flush();
            }
            closeable.close();
        } catch (Exception e6) {
            p109u2.i.g(null, closeable, e6);
            throw null;
        }
    }

    public final j c(k kVar, h hVar) throws InvalidDefinitionException {
        ConcurrentHashMap concurrentHashMap = this.f7326p;
        j jVar = (j) concurrentHashMap.get(hVar);
        if (jVar != null) {
            return jVar;
        }
        j jVarK0 = kVar.k0(hVar);
        if (jVarK0 != null) {
            concurrentHashMap.put(hVar, jVarK0);
            return jVarK0;
        }
        kVar.O("Cannot find a deserializer for type " + hVar);
        throw null;
    }

    public final JsonNode d(Y1.e eVar) {
        JsonNode jsonNode;
        try {
            h hVarJ = this.i.j(JsonNode.class);
            C0474e c0474e = this.f7323m;
            c0474e.getClass();
            T1.k kVarB0 = eVar.f5340j;
            m mVar = c0474e.f7244r;
            if (kVarB0 == null && (kVarB0 = eVar.B0()) == null) {
                mVar.getClass();
                o oVar = o.f11224h;
                eVar.close();
                return oVar;
            }
            k kVar = this.f7324n;
            kVar.getClass();
            k kVar2 = new k(kVar, c0474e, eVar);
            if (kVarB0 == T1.k.VALUE_NULL) {
                mVar.getClass();
                jsonNode = p.f11225h;
            } else {
                jsonNode = (JsonNode) kVar2.P0(eVar, hVarJ, c(kVar2, hVarJ));
            }
            if (c0474e.p(g.FAIL_ON_TRAILING_TOKENS)) {
                f(eVar, kVar2, hVarJ);
            }
            eVar.close();
            return jsonNode;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    eVar.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public final h e(C c6) {
        e eVar = this.f7322l;
        h hVar = this.f7321k;
        hVar.getClass();
        return new h(hVar, c6, eVar);
    }

    public final void g(Y1.f fVar, Object obj) throws IOException {
        C c6 = this.f7320j;
        if (!c6.p(D.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            try {
                e(c6).B0(fVar, obj);
                fVar.close();
                return;
            } catch (Exception e6) {
                Annotation[] annotationArr = p109u2.i.f12697a;
                fVar.A0(d.AUTO_CLOSE_JSON_CONTENT);
                try {
                    fVar.close();
                } catch (Exception e7) {
                    e6.addSuppressed(e7);
                }
                p109u2.i.D(e6);
                p109u2.i.E(e6);
                throw new RuntimeException(e6);
            }
        }
        Closeable closeable = (Closeable) obj;
        try {
            e(c6).B0(fVar, obj);
            try {
                closeable.close();
                fVar.close();
            } catch (Exception e8) {
                e = e8;
                closeable = null;
                p109u2.i.g(fVar, closeable, e);
                throw null;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void h(r rVar, boolean z5) {
        C cM;
        C0474e c0474eM;
        if (z5) {
            C c6 = this.f7320j;
            c6.getClass();
            long j4 = new r[]{rVar}[0].i;
            long j6 = c6.f8717h;
            long j7 = j4 | j6;
            cM = c6;
            if (j7 != j6) {
                cM = c6.m(j7);
            }
        } else {
            C c7 = this.f7320j;
            c7.getClass();
            long j8 = ~new r[]{rVar}[0].i;
            long j9 = c7.f8717h;
            long j10 = j8 & j9;
            cM = c7;
            if (j10 != j9) {
                cM = c7.m(j10);
            }
        }
        this.f7320j = cM;
        if (z5) {
            C0474e c0474e = this.f7323m;
            c0474e.getClass();
            long j11 = new r[]{rVar}[0].i;
            long j12 = c0474e.f8717h;
            long j13 = j11 | j12;
            c0474eM = c0474e;
            if (j13 != j12) {
                c0474eM = c0474e.m(j13);
            }
        } else {
            C0474e c0474e2 = this.f7323m;
            c0474e2.getClass();
            long j14 = ~new r[]{rVar}[0].i;
            long j15 = c0474e2.f8717h;
            long j16 = j14 & j15;
            c0474eM = c0474e2;
            if (j16 != j15) {
                c0474eM = c0474e2.m(j16);
            }
        }
        this.f7323m = c0474eM;
    }

    public final void i(D d6, boolean z5) {
        C c6;
        C c7;
        if (z5) {
            c6 = this.f7320j;
            c6.getClass();
            int i = d6.i;
            int i3 = c6.f7200s;
            int i6 = i | i3;
            if (i6 != i3) {
                c7 = new C(c6, c6.f8717h, i6);
                c6 = c7;
            }
        } else {
            c6 = this.f7320j;
            c6.getClass();
            int i7 = ~d6.i;
            int i8 = c6.f7200s;
            int i9 = i7 & i8;
            if (i9 != i8) {
                c7 = new C(c6, c6.f8717h, i9);
                c6 = c7;
            }
        }
        this.f7320j = c6;
    }

    public final Object j(Class cls, Object obj) {
        h hVarJ = this.i.j(cls);
        C c6 = this.f7320j;
        D d6 = D.WRAP_ROOT_VALUE;
        c6.getClass();
        int i = ~d6.i;
        int i3 = c6.f7200s;
        int i6 = i & i3;
        if (i6 != i3) {
            c6 = new C(c6, c6.f8717h, i6);
        }
        h hVarE = e(c6);
        p109u2.A a6 = new p109u2.A();
        a6.f12666u = false;
        a6.i = this;
        a6.f12656k = p109u2.A.f12654w;
        Object objDeserialize = null;
        a6.f12667v = new Y1.d(0, null, null);
        p109u2.z zVar = new p109u2.z();
        a6.f12662q = zVar;
        a6.f12661p = zVar;
        a6.f12663r = 0;
        a6.f12657l = false;
        a6.f12658m = false;
        a6.f12659n = false;
        if (this.f7323m.p(g.USE_BIG_DECIMAL_FOR_FLOATS)) {
            a6.f12660o = true;
        }
        try {
            hVarE.B0(a6, obj);
            y yVarH0 = a6.H0(this);
            C0474e c0474e = this.f7323m;
            c0474e.getClass();
            T1.k kVarB0 = yVarH0.f5340j;
            if (kVarB0 == null && (kVarB0 = yVarH0.B0()) == null) {
                throw new MismatchedInputException(yVarH0, "No content to map due to end-of-input");
            }
            if (kVarB0 == T1.k.VALUE_NULL) {
                k kVar = this.f7324n;
                kVar.getClass();
                k kVar2 = new k(kVar, c0474e, yVarH0);
                objDeserialize = c(kVar2, hVarJ).getNullValue(kVar2);
            } else if (kVarB0 != T1.k.END_ARRAY && kVarB0 != T1.k.END_OBJECT) {
                k kVar3 = this.f7324n;
                kVar3.getClass();
                k kVar4 = new k(kVar3, c0474e, yVarH0);
                objDeserialize = c(kVar4, hVarJ).deserialize(yVarH0, kVar4);
            }
            yVarH0.close();
            return objDeserialize;
        } catch (IOException e6) {
            throw new IllegalArgumentException(e6.getMessage(), e6);
        }
    }

    public final r k() {
        m mVar = this.f7323m.f7244r;
        mVar.getClass();
        return new r(mVar);
    }

    public final void l(t tVar) {
        b("module", tVar);
        p2.a aVar = (p2.a) tVar;
        String str = aVar.f10837h;
        if (str == null) {
            throw new IllegalArgumentException("Module without defined name");
        }
        if (aVar.i == null) {
            throw new IllegalArgumentException("Module without defined version");
        }
        Iterator it = Collections.EMPTY_LIST.iterator();
        while (it.hasNext()) {
            l((t) it.next());
        }
        if (this.f7320j.k(r.IGNORE_DUPLICATE_MODULE_REGISTRATIONS)) {
            if (this.f7325o == null) {
                this.f7325o = new LinkedHashSet();
            }
            if (!this.f7325o.add(str)) {
                return;
            }
        }
        p2.b bVar = aVar.f10838j;
        if (bVar != null) {
            e eVar = this.f7322l;
            q qVar = eVar.f11731m;
            Object[] objArr = qVar.f8729h;
            int length = objArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length + 1);
                    if (length > 0) {
                        System.arraycopy(objArr, 0, objArr2, 1, length);
                    }
                    objArr2[0] = bVar;
                    objArr = objArr2;
                    break;
                }
                if (objArr[i] == bVar) {
                    if (i == 0) {
                        break;
                    }
                    Object[] objArr3 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length);
                    System.arraycopy(objArr, 0, objArr3, 1, i);
                    objArr3[0] = bVar;
                    int i3 = i + 1;
                    int i6 = length - i3;
                    if (i6 > 0) {
                        System.arraycopy(objArr, i3, objArr3, i3, i6);
                    }
                    objArr = objArr3;
                    break;
                }
                i++;
            }
            q qVar2 = new q((p093r2.k[]) objArr, qVar.i, qVar.f8730j);
            if (eVar.f11731m != qVar2) {
                eVar = new e(qVar2);
            }
            this.f7322l = eVar;
        }
    }

    public final String m(Object obj) throws JsonProcessingException {
        c cVar = this.f7319h;
        V1.g gVar = new V1.g(cVar.c());
        try {
            Y1.f fVar = new Y1.f(new I1.b(cVar.c(), new V1.c(gVar, true), false), cVar.f5164k, cVar.f5165l, gVar, cVar.f5167n);
            V1.h hVar = cVar.f5166m;
            if (hVar != c.f5161r) {
                fVar.f5816q = hVar;
            }
            this.f7320j.n(fVar);
            g(fVar, obj);
            p009b2.m mVar = (p009b2.m) gVar.i;
            String strG = mVar.g();
            mVar.m();
            return strG;
        } catch (JsonProcessingException e6) {
            throw e6;
        } catch (IOException e7) {
            throw JsonMappingException.g(e7);
        }
    }

    public final y n() {
        C c6 = this.f7320j;
        return new y(this, c6, c6.f7199r);
    }

    public u() {
        this(null);
    }
}

package p093r2;

import com.fasterxml.jackson.databind.ser.std.AbstractC0536g;
import com.fasterxml.jackson.databind.ser.std.AbstractC0541l;
import com.fasterxml.jackson.databind.ser.std.C0533d;
import com.fasterxml.jackson.databind.ser.std.C0534e;
import com.fasterxml.jackson.databind.ser.std.C0535f;
import com.fasterxml.jackson.databind.ser.std.C0538i;
import com.fasterxml.jackson.databind.ser.std.C0543n;
import com.fasterxml.jackson.databind.ser.std.C0545p;
import com.fasterxml.jackson.databind.ser.std.C0546q;
import com.fasterxml.jackson.databind.ser.std.H;
import com.fasterxml.jackson.databind.ser.std.I;
import com.fasterxml.jackson.databind.ser.std.J;
import com.fasterxml.jackson.databind.ser.std.K;
import com.fasterxml.jackson.databind.ser.std.L;
import com.fasterxml.jackson.databind.ser.std.M;
import com.fasterxml.jackson.databind.ser.std.N;
import com.fasterxml.jackson.databind.ser.std.O;
import com.fasterxml.jackson.databind.ser.std.P;
import com.fasterxml.jackson.databind.ser.std.Q;
import com.fasterxml.jackson.databind.ser.std.S;
import com.fasterxml.jackson.databind.ser.std.r;
import com.fasterxml.jackson.databind.ser.std.t;
import com.fasterxml.jackson.databind.ser.std.u;
import com.fasterxml.jackson.databind.ser.std.v;
import com.fasterxml.jackson.databind.ser.std.w;
import java.io.File;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import p009b2.k;
import p015c2.B;
import p015c2.C;
import p015c2.E;
import p015c2.h;
import p015c2.o;
import p020d2.i;
import p026e2.q;
import p037g2.m;
import p046i2.AbstractC0771g;
import p046i2.C0766b;
import p046i2.D;
import p071n2.c;
import p071n2.e;
import p109u2.A;
import p109u2.C0965d;
import p109u2.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends p006b.a implements Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f11729n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final HashMap f11730o;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q f11731m;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put(String.class.getName(), new C0534e(2));
        C0546q c0546q = C0546q.f7757k;
        map2.put(StringBuffer.class.getName(), c0546q);
        map2.put(StringBuilder.class.getName(), c0546q);
        map2.put(Character.class.getName(), c0546q);
        map2.put(Character.TYPE.getName(), c0546q);
        map2.put(Integer.class.getName(), new t(1, Integer.class));
        Class cls = Integer.TYPE;
        map2.put(cls.getName(), new t(1, cls));
        map2.put(Long.class.getName(), new t(2, Long.class));
        Class cls2 = Long.TYPE;
        map2.put(cls2.getName(), new t(2, cls2));
        String name = Byte.class.getName();
        v vVar = v.f7763l;
        map2.put(name, vVar);
        map2.put(Byte.TYPE.getName(), vVar);
        String name2 = Short.class.getName();
        w wVar = w.f7764l;
        map2.put(name2, wVar);
        map2.put(Short.TYPE.getName(), wVar);
        map2.put(Double.class.getName(), new t(0, Double.class));
        Class cls3 = Double.TYPE;
        map2.put(cls3.getName(), new t(0, cls3));
        String name3 = Float.class.getName();
        u uVar = u.f7762l;
        map2.put(name3, uVar);
        map2.put(Float.TYPE.getName(), uVar);
        map2.put(Boolean.TYPE.getName(), new C0533d(true, 0));
        int i = 0;
        map2.put(Boolean.class.getName(), new C0533d(false, 0));
        map2.put(BigInteger.class.getName(), new r(BigInteger.class));
        map2.put(BigDecimal.class.getName(), new r(BigDecimal.class));
        map2.put(Calendar.class.getName(), C0535f.f7718l);
        map2.put(Date.class.getName(), C0538i.f7726l);
        HashMap map3 = new HashMap();
        map3.put(URL.class, new C0546q(i, URL.class));
        map3.put(URI.class, new C0546q(i, URI.class));
        map3.put(Currency.class, new C0546q(i, Currency.class));
        map3.put(UUID.class, new S(null));
        map3.put(Pattern.class, new C0546q(i, Pattern.class));
        map3.put(Locale.class, new C0546q(i, Locale.class));
        map3.put(AtomicBoolean.class, I.class);
        map3.put(AtomicInteger.class, J.class);
        map3.put(AtomicLong.class, K.class);
        map3.put(File.class, AbstractC0541l.class);
        map3.put(Class.class, AbstractC0536g.class);
        C0545p c0545p = C0545p.i;
        map3.put(Void.class, c0545p);
        map3.put(Void.TYPE, c0545p);
        for (Map.Entry entry : map3.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof o) {
                map2.put(((Class) entry.getKey()).getName(), (o) value);
            } else {
                map.put(((Class) entry.getKey()).getName(), (Class) value);
            }
        }
        map.put(A.class.getName(), Q.class);
        f11729n = map2;
        f11730o = map;
    }

    public a(q qVar) {
        this.f11731m = qVar == null ? new q(null, null, null) : qVar;
    }

    public static S1.A N(E e6, p046i2.r rVar, h hVar, Class cls) {
        C c6 = e6.f7226j;
        c6.f8724n.getClass();
        S1.A a6 = S1.A.f4905l;
        B b6 = rVar.f9565d;
        if (b6 != null) {
            a6 = a6.a(b6.J(rVar.f9566e));
        }
        c6.e(cls);
        c6.e(hVar.f7281k);
        return a6;
    }

    public static o R(E e6, p046i2.q qVar) {
        C c6 = e6.f7226j;
        Object objU = c6.d().U(qVar);
        if (objU == null) {
            return null;
        }
        o oVarY0 = e6.y0(qVar, objU);
        Object objQ = c6.d().Q(qVar);
        l lVarM = objQ != null ? e6.m(objQ) : null;
        if (lVarM == null) {
            return oVarY0;
        }
        e6.A();
        return new H(lVarM, ((m) lVarM).f9146a, oVarY0);
    }

    public static boolean S(C c6, p046i2.r rVar) {
        i iVarT = c6.d().T(rVar.f9566e);
        if (iVarT == null || iVarT == i.f8583j) {
            return c6.k(p015c2.r.USE_STATIC_TYPING);
        }
        return iVarT == i.i;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00df  */
    /* JADX WARN: Code duplicated, block: B:96:0x0164  */
    public final o O(E e6, h hVar) {
        o oVarY0;
        AbstractC0771g abstractC0771gE;
        o l6;
        L l7;
        C c6 = e6.f7226j;
        p046i2.r rVarO = c6.o(hVar);
        q qVar = this.f11731m;
        k[] kVarArr = qVar.i;
        if (kVarArr.length > 0) {
            oVarY0 = null;
            int i = 0;
            while (i < kVarArr.length) {
                if (i >= kVarArr.length) {
                    throw new NoSuchElementException();
                }
                int i3 = i + 1;
                o oVarA = kVarArr[i].a(hVar);
                if (oVarA != null) {
                    oVarY0 = oVarA;
                    break;
                }
                i = i3;
                oVarY0 = oVarA;
            }
        } else {
            oVarY0 = null;
        }
        if (oVarY0 == null) {
            B bD = e6.f7226j.d();
            C0766b c0766b = rVarO.f9566e;
            Object objS = bD.s(c0766b);
            oVarY0 = objS != null ? e6.y0(c0766b, objS) : null;
            if (oVarY0 == null) {
                Class cls = hVar.f7281k;
                if (cls == null || cls == Object.class) {
                    oVarY0 = new M();
                } else if (cls == String.class) {
                    oVarY0 = O.f7698a;
                } else {
                    Class clsG = cls.isPrimitive() ? p109u2.i.G(cls) : cls;
                    if (clsG == Integer.class) {
                        l7 = new L(5, clsG);
                    } else if (clsG == Long.class) {
                        l7 = new L(6, clsG);
                    } else if (clsG.isPrimitive() || Number.class.isAssignableFrom(clsG)) {
                        l7 = new L(8, clsG);
                    } else if (clsG == Class.class) {
                        l7 = new L(3, clsG);
                    } else if (Date.class.isAssignableFrom(clsG)) {
                        l7 = new L(1, clsG);
                    } else if (Calendar.class.isAssignableFrom(clsG)) {
                        l7 = new L(2, clsG);
                    } else if (clsG == UUID.class) {
                        l7 = new L(8, clsG);
                    } else if (clsG == byte[].class) {
                        l7 = new L(7, clsG);
                    } else {
                        oVarY0 = null;
                    }
                    oVarY0 = l7;
                }
                if (oVarY0 == null) {
                    D d6 = rVarO.f9563b;
                    if (d6 != null) {
                        if (!d6.i) {
                            d6.g();
                        }
                        LinkedList linkedList = d6.f9495p;
                        if (linkedList == null) {
                            abstractC0771gE = null;
                        } else {
                            if (linkedList.size() > 1 && !D.f(d6.f9495p)) {
                                d6.h("Multiple 'as-key' properties defined (%s vs %s)", d6.f9495p.get(0), d6.f9495p.get(1));
                                throw null;
                            }
                            abstractC0771gE = (AbstractC0771g) d6.f9495p.get(0);
                        }
                    } else {
                        abstractC0771gE = null;
                    }
                    if (abstractC0771gE == null) {
                        abstractC0771gE = rVarO.e();
                    }
                    if (abstractC0771gE != null) {
                        o oVarO = O(e6, abstractC0771gE.h());
                        if (c6.k(p015c2.r.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                            p109u2.i.e(abstractC0771gE.p(), c6.k(p015c2.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                        }
                        oVarY0 = new C0543n(abstractC0771gE, null, oVarO);
                    } else if (cls == null) {
                        l6 = new L(8, cls);
                        oVarY0 = l6;
                    } else if (cls == Enum.class) {
                        l6 = new M();
                        oVarY0 = l6;
                    } else {
                        Annotation[] annotationArr = p109u2.i.f12697a;
                        if (Enum.class.isAssignableFrom(cls)) {
                            oVarY0 = new N(cls, k.p(c6, cls));
                        } else {
                            l6 = new L(8, cls);
                            oVarY0 = l6;
                        }
                    }
                }
            }
        }
        if (qVar.a()) {
            C0965d c0965dB = qVar.b();
            if (c0965dB.hasNext()) {
                throw p012c.k.q(c0965dB);
            }
        }
        return oVarY0;
    }

    public final p077o2.q P(C c6, h hVar) {
        ArrayList arrayList;
        p046i2.r rVarJ = c6.j(hVar.f7281k);
        B bD = c6.d();
        C0766b c0766b = rVarJ.f9566e;
        p077o2.m mVarY = bD.Y(hVar, c6, c0766b);
        if (mVarY == null) {
            c6.i.getClass();
            arrayList = null;
            mVarY = null;
        } else {
            c6.f8721k.getClass();
            B bD2 = c6.d();
            HashMap map = new HashMap();
            p077o2.l.R(c0766b, new c(null, c0766b.f9525j), c6, bD2, map);
            arrayList = new ArrayList(map.values());
        }
        if (mVarY == null) {
            return null;
        }
        return mVarY.b(c6, hVar, arrayList);
    }

    public final P Q(E e6, h hVar, p046i2.r rVar) {
        if (p015c2.m.class.isAssignableFrom(hVar.f7281k)) {
            return C0545p.f7754j;
        }
        AbstractC0771g abstractC0771gE = rVar.e();
        if (abstractC0771gE == null) {
            return null;
        }
        C c6 = e6.f7226j;
        c6.getClass();
        if (c6.k(p015c2.r.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            p109u2.i.e(abstractC0771gE.p(), c6.k(p015c2.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        h hVarH = abstractC0771gE.h();
        o oVarR = R(e6, abstractC0771gE);
        if (oVarR == null) {
            oVarR = (o) hVarH.f7283m;
        }
        e eVarP = (e) hVarH.f7284n;
        if (eVarP == null) {
            eVarP = P(c6, hVarH);
        }
        return new C0543n(abstractC0771gE, eVarP, oVarR);
    }
}

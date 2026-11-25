package O1;

import B.AbstractC0013g0;
import android.graphics.Paint;
import android.graphics.Shader;
import c5.C0495p;
import com.google.android.gms.internal.play_billing.AbstractC0602x;
import java.lang.reflect.Array;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;
import p015c2.C0474e;
import p035g0.AbstractC0705f;
import p035g0.C0709j;
import p035g0.H;
import p035g0.Q;
import p046i2.AbstractC0771g;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f4535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4536d;

    public u(Paint paint) {
        this.f4534b = paint;
        this.f4533a = 3;
    }

    public static u f(p015c2.f fVar, p032f2.t tVar, p032f2.r[] rVarArr, boolean z5) {
        int length = rVarArr.length;
        p032f2.r[] rVarArr2 = new p032f2.r[length];
        for (int i = 0; i < length; i++) {
            p032f2.r rVarE = rVarArr[i];
            if (!rVarE.t()) {
                rVarE = rVarE.E(fVar.f0(rVarE.f8934k, rVarE));
            }
            rVarArr2[i] = rVarE;
        }
        return new u(fVar, tVar, rVarArr2, z5, false);
    }

    public void a(int i, int i3, Object obj, Object[] objArr) {
        int i6 = 0;
        for (C0495p c0495p = (C0495p) this.f4534b; c0495p != null; c0495p = (C0495p) c0495p.f7476j) {
            Object[] objArr2 = (Object[]) c0495p.i;
            int length = objArr2.length;
            System.arraycopy(objArr2, 0, obj, i6, length);
            i6 += length;
        }
        System.arraycopy(objArr, 0, obj, i6, i3);
        int i7 = i6 + i3;
        if (i7 != i) {
            throw new IllegalStateException(AbstractC0013g0.g("Should have gotten ", i, i7, " entries, got "));
        }
    }

    public void b() {
        C0495p c0495p = (C0495p) this.f4535c;
        if (c0495p != null) {
            this.f4536d = (Object[]) c0495p.i;
        }
        this.f4535c = null;
        this.f4534b = null;
        this.f4533a = 0;
    }

    public Object[] c(Object[] objArr) {
        C0495p c0495p = new C0495p(objArr, 23, null);
        if (((C0495p) this.f4534b) == null) {
            this.f4535c = c0495p;
            this.f4534b = c0495p;
        } else {
            C0495p c0495p2 = (C0495p) this.f4535c;
            if (((C0495p) c0495p2.f7476j) != null) {
                throw new IllegalStateException();
            }
            c0495p2.f7476j = c0495p;
            this.f4535c = c0495p;
        }
        int length = objArr.length;
        this.f4533a += length;
        if (length < 16384) {
            length += length;
        } else if (length < 262144) {
            length += length >> 2;
        }
        return new Object[length];
    }

    public Object d(p015c2.f fVar, p037g2.z zVar) {
        p032f2.t tVar = (p032f2.t) this.f4534b;
        tVar.getClass();
        int i = zVar.f9175e;
        Object[] objArr = zVar.f9174d;
        p032f2.r[] rVarArr = (p032f2.r[]) this.f4536d;
        if (i > 0) {
            BitSet bitSet = zVar.f9177g;
            if (bitSet != null) {
                int length = objArr.length;
                int i3 = 0;
                while (true) {
                    int iNextClearBit = bitSet.nextClearBit(i3);
                    if (iNextClearBit >= length) {
                        break;
                    }
                    objArr[iNextClearBit] = zVar.a(rVarArr[iNextClearBit]);
                    i3 = iNextClearBit + 1;
                }
            } else {
                int i6 = zVar.f9176f;
                int length2 = objArr.length;
                int i7 = 0;
                while (i7 < length2) {
                    if ((i6 & 1) == 0) {
                        objArr[i7] = zVar.a(rVarArr[i7]);
                    }
                    i7++;
                    i6 >>= 1;
                }
            }
        }
        p015c2.g gVar = p015c2.g.FAIL_ON_NULL_CREATOR_PROPERTIES;
        p015c2.f fVar2 = zVar.f9172b;
        if (fVar2.B0(gVar)) {
            for (int i8 = 0; i8 < rVarArr.length; i8++) {
                if (objArr[i8] == null) {
                    p032f2.r rVar = rVarArr[i8];
                    fVar2.I0(rVar, "Null value for creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES` enabled", rVar.f8933j.f7195h, Integer.valueOf(rVar.n()));
                    throw null;
                }
            }
        }
        Object objS = tVar.s(fVar, objArr);
        if (objS != null) {
            p037g2.r rVar2 = zVar.f9173c;
            if (rVar2 != null) {
                Object obj = zVar.i;
                if (obj != null) {
                    fVar.j0(obj, rVar2.f9159j).getClass();
                    throw null;
                }
                fVar.getClass();
                StringBuilder sbW = p012c.k.w("No Object Id found for an instance of ", p109u2.i.f(objS), ", to assign to property '");
                sbW.append(rVar2.i);
                sbW.append("'");
                fVar.I0(rVar2.f9161l, sbW.toString(), new Object[0]);
                throw null;
            }
            for (p037g2.y yVar = zVar.f9178h; yVar != null; yVar = (p037g2.y) yVar.f9169a) {
                yVar.a(objS);
            }
        }
        return objS;
    }

    public Object[] e(Object[] objArr, int i, Class cls) {
        int i3 = this.f4533a + i;
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) cls, i3);
        a(i3, i, objArr2, objArr);
        b();
        return objArr2;
    }

    public p032f2.r g(String str) {
        return (p032f2.r) ((HashMap) this.f4535c).get(str);
    }

    public int h() {
        Paint.Cap strokeCap = ((Paint) this.f4534b).getStrokeCap();
        int i = strokeCap == null ? -1 : AbstractC0705f.f9061a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public int i() {
        Paint.Join strokeJoin = ((Paint) this.f4534b).getStrokeJoin();
        int i = strokeJoin == null ? -1 : AbstractC0705f.f9062b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public Object[] j() {
        b();
        Object[] objArr = (Object[]) this.f4536d;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArr2 = new Object[12];
        this.f4536d = objArr2;
        return objArr2;
    }

    public Object[] k(Object[] objArr, int i) {
        b();
        Object[] objArr2 = (Object[]) this.f4536d;
        if (objArr2 == null || objArr2.length < i) {
            this.f4536d = new Object[Math.max(12, i)];
        }
        System.arraycopy(objArr, 0, (Object[]) this.f4536d, 0, i);
        return (Object[]) this.f4536d;
    }

    public void l(float f6) {
        ((Paint) this.f4534b).setAlpha((int) Math.rint(f6 * 255.0f));
    }

    public void m(int i) {
        if (this.f4533a == i) {
            return;
        }
        this.f4533a = i;
        Q.f9054a.a((Paint) this.f4534b, i);
    }

    public void n(long j4) {
        ((Paint) this.f4534b).setColor(H.v(j4));
    }

    public void o(C0709j c0709j) {
        this.f4536d = c0709j;
        ((Paint) this.f4534b).setColorFilter(c0709j != null ? c0709j.f9068a : null);
    }

    public void p(int i) {
        ((Paint) this.f4534b).setFilterBitmap(!(i == 0));
    }

    public void q(Shader shader) {
        this.f4535c = shader;
        ((Paint) this.f4534b).setShader(shader);
    }

    public void r(int i) {
        Paint.Cap cap;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        ((Paint) this.f4534b).setStrokeCap(cap);
    }

    public void s(int i) {
        Paint.Join join;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = i == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        ((Paint) this.f4534b).setStrokeJoin(join);
    }

    public void t(float f6) {
        ((Paint) this.f4534b).setStrokeWidth(f6);
    }

    public void u(int i) {
        ((Paint) this.f4534b).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public p037g2.z v(T1.i iVar, p015c2.f fVar, p037g2.r rVar) {
        return new p037g2.z(iVar, fVar, this.f4533a, rVar);
    }

    public void w(Throwable th) {
        boolean z5 = th instanceof TimeoutException;
        x xVar = (x) this.f4536d;
        if (z5) {
            xVar.G(102, 28, A.f4437r);
            AbstractC0602x.h("BillingClientTesting");
        } else {
            xVar.G(95, 28, A.f4437r);
            AbstractC0602x.h("BillingClientTesting");
        }
        ((Runnable) this.f4535c).run();
    }

    public u(p015c2.f fVar, p032f2.t tVar, p032f2.r[] rVarArr, boolean z5, boolean z6) {
        this.f4534b = tVar;
        if (z5) {
            this.f4535c = new p037g2.u(fVar.f7249l.i.f8684m);
        } else {
            this.f4535c = new HashMap();
        }
        int length = rVarArr.length;
        this.f4533a = length;
        this.f4536d = new p032f2.r[length];
        if (z6) {
            C0474e c0474e = fVar.f7249l;
            for (p032f2.r rVar : rVarArr) {
                if (!rVar.w()) {
                    List listD = rVar.i;
                    if (listD == null) {
                        p015c2.B bD = c0474e.d();
                        AbstractC0771g abstractC0771gE = rVar.e();
                        listD = abstractC0771gE != null ? bD.D(abstractC0771gE) : listD;
                        listD = listD == null ? Collections.EMPTY_LIST : listD;
                        rVar.i = listD;
                    }
                    if (!listD.isEmpty()) {
                        Iterator it = listD.iterator();
                        while (it.hasNext()) {
                            ((HashMap) this.f4535c).put(((p015c2.A) it.next()).f7195h, rVar);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < length; i++) {
            p032f2.r rVar2 = rVarArr[i];
            ((p032f2.r[]) this.f4536d)[i] = rVar2;
            if (!rVar2.w()) {
                ((HashMap) this.f4535c).put(rVar2.f8933j.f7195h, rVar2);
            }
        }
    }
}

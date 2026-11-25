package H1;

import B.C0031p0;
import E4.k;
import P4.C0325l;
import P4.O;
import R2.m;
import S1.V;
import android.graphics.Typeface;
import com.fasterxml.jackson.databind.ser.std.C0544o;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import p015c2.E;
import p015c2.o;
import p035g0.C0715p;
import p046i2.AbstractC0771g;
import p084p4.x;
import p089q4.y;
import p090r.AbstractC0863b;
import p090r.J;
import p090r.K;
import p092r1.N;
import p096s.A;
import p096s.A0;
import p096s.AbstractC0924q;
import p096s.r;
import p119w1.p;
import p119w1.s;

/* JADX INFO: loaded from: classes.dex */
public final class d implements N2.b, A0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f1757h;
    public Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f1758j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f1759k;

    public /* synthetic */ d(Object obj) {
        this.i = obj;
    }

    @Override // p096s.y0
    public long b(AbstractC0924q abstractC0924q, AbstractC0924q abstractC0924q2, AbstractC0924q abstractC0924q3) {
        Iterator it = p081p0.c.D0(0, abstractC0924q.b()).iterator();
        long jMax = 0;
        while (((J4.c) it).f1944j) {
            int iA = ((y) it).a();
            jMax = Math.max(jMax, ((r) this.i).get(iA).d(abstractC0924q.a(iA), abstractC0924q2.a(iA), abstractC0924q3.a(iA)));
        }
        return jMax;
    }

    public void c(String str, String str2) {
        this.f1759k = ((String) this.f1759k) + (((String) this.f1759k).length() == 0 ? "?" : "&") + str + '=' + str2;
    }

    public d d() {
        return new d((Closeable) this.i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r7 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(p122w4.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p092r1.C0887h
            if (r0 == 0) goto L13
            r0 = r7
            r1.h r0 = (p092r1.C0887h) r0
            int r1 = r0.f11655n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11655n = r1
            goto L18
        L13:
            r1.h r0 = new r1.h
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f11653l
            v4.a r1 = v4.a.f13292h
            int r2 = r0.f11655n
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            H1.d r6 = r0.f11652k
            S1.V.O(r7)
            goto L63
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            H1.d r6 = r0.f11652k
            S1.V.O(r7)
            goto L72
        L3a:
            S1.V.O(r7)
            java.lang.Object r7 = r6.f1758j
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r2 = r6.f1759k
            r1.J r2 = (p092r1.J) r2
            if (r7 == 0) goto L66
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L4e
            goto L66
        L4e:
            r1.T r7 = r2.g()
            r1.k r4 = new r1.k
            r5 = 0
            r4.<init>(r2, r6, r5)
            r0.f11652k = r6
            r0.f11655n = r3
            java.lang.Object r7 = r7.b(r4, r0)
            if (r7 != r1) goto L63
            goto L71
        L63:
            r1.b r7 = (p092r1.C0881b) r7
            goto L74
        L66:
            r0.f11652k = r6
            r0.f11655n = r4
            r7 = 0
            java.lang.Object r7 = p092r1.J.f(r2, r7, r0)
            if (r7 != r1) goto L72
        L71:
            return r1
        L72:
            r1.b r7 = (p092r1.C0881b) r7
        L74:
            java.lang.Object r6 = r6.f1759k
            r1.J r6 = (p092r1.J) r6
            g0.p r6 = r6.f11601h
            r6.C(r7)
            p4.x r6 = p084p4.x.f10867a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.d.e(w4.c):java.lang.Object");
    }

    @Override // p096s.y0
    public AbstractC0924q f(long j4, AbstractC0924q abstractC0924q, AbstractC0924q abstractC0924q2, AbstractC0924q abstractC0924q3) {
        if (((AbstractC0924q) this.f1757h) == null) {
            this.f1757h = abstractC0924q.c();
        }
        AbstractC0924q abstractC0924q4 = (AbstractC0924q) this.f1757h;
        if (abstractC0924q4 == null) {
            k.m("valueVector");
            throw null;
        }
        int iB = abstractC0924q4.b();
        for (int i = 0; i < iB; i++) {
            AbstractC0924q abstractC0924q5 = (AbstractC0924q) this.f1757h;
            if (abstractC0924q5 == null) {
                k.m("valueVector");
                throw null;
            }
            abstractC0924q5.e(i, ((r) this.i).get(i).b(j4, abstractC0924q.a(i), abstractC0924q2.a(i), abstractC0924q3.a(i)));
        }
        AbstractC0924q abstractC0924q6 = (AbstractC0924q) this.f1757h;
        if (abstractC0924q6 != null) {
            return abstractC0924q6;
        }
        k.m("valueVector");
        throw null;
    }

    @Override // p079o4.a
    public Object get() {
        return new m((Executor) ((p079o4.a) this.i).get(), (S2.d) ((p079o4.a) this.f1757h).get(), (R2.d) ((C0031p0) this.f1758j).get(), (T2.b) ((p079o4.a) this.f1759k).get());
    }

    public void h(Object obj, T1.e eVar, E e6) {
        AbstractC0771g abstractC0771g = (AbstractC0771g) this.f1757h;
        Object objQ = abstractC0771g.q(obj);
        if (objQ == null) {
            return;
        }
        if (objQ instanceof Map) {
            C0544o c0544o = (C0544o) this.f1759k;
            if (c0544o != null) {
                c0544o.g((Map) objQ, eVar, e6);
                return;
            } else {
                ((o) this.f1758j).serialize(objQ, eVar, e6);
                return;
            }
        }
        e6.O("Value returned by 'any-getter' " + abstractC0771g.getName() + "() not java.util.Map but " + objQ.getClass().getName());
        throw null;
    }

    public AbstractC0924q i(long j4, AbstractC0924q abstractC0924q, AbstractC0924q abstractC0924q2) {
        if (((AbstractC0924q) this.f1758j) == null) {
            this.f1758j = abstractC0924q.c();
        }
        AbstractC0924q abstractC0924q3 = (AbstractC0924q) this.f1758j;
        if (abstractC0924q3 == null) {
            k.m("velocityVector");
            throw null;
        }
        int iB = abstractC0924q3.b();
        for (int i = 0; i < iB; i++) {
            AbstractC0924q abstractC0924q4 = (AbstractC0924q) this.f1758j;
            if (abstractC0924q4 == null) {
                k.m("velocityVector");
                throw null;
            }
            abstractC0924q.getClass();
            long j6 = j4 / 1000000;
            J jA = ((K) ((C0715p) this.i).i).a(abstractC0924q2.a(i));
            long j7 = jA.f11382c;
            abstractC0924q4.e(i, (((Math.signum(jA.f11380a) * AbstractC0863b.a(j7 > 0 ? j6 / j7 : 1.0f).f11396b) * jA.f11381b) / j7) * 1000.0f);
        }
        AbstractC0924q abstractC0924q5 = (AbstractC0924q) this.f1758j;
        if (abstractC0924q5 != null) {
            return abstractC0924q5;
        }
        k.m("velocityVector");
        throw null;
    }

    @Override // p096s.y0
    public AbstractC0924q k(long j4, AbstractC0924q abstractC0924q, AbstractC0924q abstractC0924q2, AbstractC0924q abstractC0924q3) {
        if (((AbstractC0924q) this.f1758j) == null) {
            this.f1758j = abstractC0924q3.c();
        }
        AbstractC0924q abstractC0924q4 = (AbstractC0924q) this.f1758j;
        if (abstractC0924q4 == null) {
            k.m("velocityVector");
            throw null;
        }
        int iB = abstractC0924q4.b();
        for (int i = 0; i < iB; i++) {
            AbstractC0924q abstractC0924q5 = (AbstractC0924q) this.f1758j;
            if (abstractC0924q5 == null) {
                k.m("velocityVector");
                throw null;
            }
            abstractC0924q5.e(i, ((r) this.i).get(i).c(j4, abstractC0924q.a(i), abstractC0924q2.a(i), abstractC0924q3.a(i)));
        }
        AbstractC0924q abstractC0924q6 = (AbstractC0924q) this.f1758j;
        if (abstractC0924q6 != null) {
            return abstractC0924q6;
        }
        k.m("velocityVector");
        throw null;
    }

    public boolean l(String str) {
        String str2 = (String) this.f1757h;
        if (str2 == null) {
            this.f1757h = str;
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        String str3 = (String) this.f1758j;
        if (str3 == null) {
            this.f1758j = str;
            return false;
        }
        if (str.equals(str3)) {
            return true;
        }
        if (((HashSet) this.f1759k) == null) {
            HashSet hashSet = new HashSet(16);
            this.f1759k = hashSet;
            hashSet.add((String) this.f1757h);
            ((HashSet) this.f1759k).add((String) this.f1758j);
        }
        return !((HashSet) this.f1759k).add(str);
    }

    @Override // p096s.y0
    public AbstractC0924q m(AbstractC0924q abstractC0924q, AbstractC0924q abstractC0924q2, AbstractC0924q abstractC0924q3) {
        if (((AbstractC0924q) this.f1759k) == null) {
            this.f1759k = abstractC0924q3.c();
        }
        AbstractC0924q abstractC0924q4 = (AbstractC0924q) this.f1759k;
        if (abstractC0924q4 == null) {
            k.m("endVelocityVector");
            throw null;
        }
        int iB = abstractC0924q4.b();
        for (int i = 0; i < iB; i++) {
            AbstractC0924q abstractC0924q5 = (AbstractC0924q) this.f1759k;
            if (abstractC0924q5 == null) {
                k.m("endVelocityVector");
                throw null;
            }
            abstractC0924q5.e(i, ((r) this.i).get(i).e(abstractC0924q.a(i), abstractC0924q2.a(i), abstractC0924q3.a(i)));
        }
        AbstractC0924q abstractC0924q6 = (AbstractC0924q) this.f1759k;
        if (abstractC0924q6 != null) {
            return abstractC0924q6;
        }
        k.m("endVelocityVector");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(p122w4.c cVar) throws Throwable {
        N n6;
        X4.a aVar;
        Throwable th;
        X4.a aVar2;
        d dVar;
        if (cVar instanceof N) {
            n6 = (N) cVar;
            int i = n6.f11615o;
            if ((i & Integer.MIN_VALUE) != 0) {
                n6.f11615o = i - Integer.MIN_VALUE;
            } else {
                n6 = new N(this, cVar);
            }
        } else {
            n6 = new N(this, cVar);
        }
        Object obj = n6.f11613m;
        v4.a aVar3 = v4.a.f13292h;
        int i3 = n6.f11615o;
        x xVar = x.f10867a;
        try {
            if (i3 == 0) {
                V.O(obj);
                if (!(((C0325l) this.f1757h).I() instanceof O)) {
                    return xVar;
                }
                n6.f11611k = this;
                X4.d dVar2 = (X4.d) this.i;
                n6.f11612l = dVar2;
                n6.f11615o = 1;
                Object objC = dVar2.c(n6);
                aVar = dVar2;
                if (objC != aVar3) {
                }
                return aVar3;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = n6.f11612l;
                dVar = n6.f11611k;
                try {
                    V.O(obj);
                    aVar2 = aVar2;
                    ((C0325l) dVar.f1757h).R(xVar);
                    ((X4.d) aVar2).e(null);
                    return xVar;
                } catch (Throwable th2) {
                    th = th2;
                    ((X4.d) aVar2).e(null);
                    throw th;
                }
            }
            X4.a aVar4 = n6.f11612l;
            d dVar3 = n6.f11611k;
            V.O(obj);
            aVar = aVar4;
            this = dVar3;
            if (!(((C0325l) this.f1757h).I() instanceof O)) {
                ((X4.d) aVar).e(null);
                return xVar;
            }
            n6.f11611k = this;
            n6.f11612l = aVar;
            n6.f11615o = 2;
            if (this.e(n6) != aVar3) {
                dVar = this;
                aVar2 = aVar;
                ((C0325l) dVar.f1757h).R(xVar);
                ((X4.d) aVar2).e(null);
                return xVar;
            }
            return aVar3;
        } catch (Throwable th3) {
            X4.a aVar5 = aVar;
            th = th3;
            aVar2 = aVar5;
            ((X4.d) aVar2).e(null);
            throw th;
        }
    }

    public d(Y4.a aVar) {
        this.f1758j = "";
        this.f1759k = "";
        this.i = aVar;
        this.f1757h = aVar.getDescriptor().b();
    }

    public d(Typeface typeface, p125x1.b bVar) {
        int i;
        int i3;
        int i6;
        int i7;
        this.f1759k = typeface;
        this.i = bVar;
        this.f1758j = new p(1024);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i8 = iA + bVar.f11786h;
            i = ((ByteBuffer) bVar.f11788k).getInt(((ByteBuffer) bVar.f11788k).getInt(i8) + i8);
        } else {
            i = 0;
        }
        this.f1757h = new char[i * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i9 = iA2 + bVar.f11786h;
            i3 = ((ByteBuffer) bVar.f11788k).getInt(((ByteBuffer) bVar.f11788k).getInt(i9) + i9);
        } else {
            i3 = 0;
        }
        for (int i10 = 0; i10 < i3; i10++) {
            s sVar = new s(this, i10);
            p125x1.a aVarB = sVar.b();
            int iA3 = aVarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarB.f11788k).getInt(iA3 + aVarB.f11786h) : 0, (char[]) this.f1757h, i10 * 2);
            p125x1.a aVarB2 = sVar.b();
            int iA4 = aVarB2.a(16);
            if (iA4 != 0) {
                int i11 = iA4 + aVarB2.f11786h;
                i6 = ((ByteBuffer) aVarB2.f11788k).getInt(((ByteBuffer) aVarB2.f11788k).getInt(i11) + i11);
            } else {
                i6 = 0;
            }
            if (i6 > 0) {
                p125x1.a aVarB3 = sVar.b();
                int iA5 = aVarB3.a(16);
                if (iA5 != 0) {
                    int i12 = iA5 + aVarB3.f11786h;
                    i7 = ((ByteBuffer) aVarB3.f11788k).getInt(((ByteBuffer) aVarB3.f11788k).getInt(i12) + i12);
                } else {
                    i7 = 0;
                }
                ((p) this.f1758j).a(sVar, 0, i7 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public d(A a6) {
        this(new C0715p(25, a6));
    }
}

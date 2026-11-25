package p093r2;

import G4.a;
import S1.EnumC0363z;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import p012c.k;
import p015c2.A;
import p015c2.B;
import p015c2.C;
import p015c2.C0471b;
import p015c2.D;
import p015c2.E;
import p015c2.InterfaceC0472c;
import p015c2.h;
import p015c2.o;
import p046i2.AbstractC0771g;
import p046i2.C0766b;
import p046i2.C0767c;
import p046i2.r;
import p046i2.t;
import p077o2.m;
import p077o2.q;
import p109u2.i;
import p109u2.s;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final e f11756p = new e(null);

    /* JADX WARN: Code duplicated, block: B:103:0x021d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0243  */
    /* JADX WARN: Code duplicated, block: B:120:0x025e  */
    /* JADX WARN: Code duplicated, block: B:123:0x026b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0271 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:95:0x01ff  */
    /* JADX WARN: Multi-variable type inference failed */
    public final b T(E e6, t tVar, O1.E e7, boolean z5, AbstractC0771g abstractC0771g) throws InvalidDefinitionException {
        q qVarP;
        boolean z6;
        Object objU0;
        Class[] clsArrK;
        b bVar;
        Object objX;
        s sVarZ;
        Object objU;
        boolean z7;
        A a6 = tVar.a();
        h hVarH = abstractC0771g.h();
        tVar.t();
        InterfaceC0472c c0471b = new C0471b(a6, hVarH, null, abstractC0771g, tVar.c());
        o oVarR = a.R(e6, abstractC0771g);
        if (oVarR instanceof j) {
            ((j) oVarR).a(e6);
        }
        o oVarS0 = e6.s0(oVarR, c0471b);
        boolean zK0 = hVarH.k0();
        S1.A a7 = null;
        C c6 = e6.f7226j;
        if (zK0 || hVarH.D()) {
            h hVarY = hVarH.Y();
            m mVarE = c6.d().E(c6, abstractC0771g, hVarH);
            qVarP = mVarE == null ? P(c6, hVarY) : mVarE.b(c6, hVarY, c6.f8721k.U(c6, abstractC0771g, hVarY));
        } else {
            qVarP = null;
        }
        m mVarM = c6.d().M(c6, abstractC0771g, hVarH);
        q qVarP2 = mVarM == null ? P(c6, hVarH) : mVarM.b(c6, hVarH, c6.f8721k.U(c6, abstractC0771g, hVarH));
        r rVar = (r) e7.f4446c;
        try {
            h hVarF = e7.f(abstractC0771g, z5, hVarH);
            if (qVarP != null) {
                if (hVarF == null) {
                    hVarF = hVarH;
                }
                if (hVarF.Y() == null) {
                    e6.w0(rVar, tVar, "serialization type " + hVarF + " has no content", new Object[0]);
                    throw null;
                }
                h hVarR0 = hVarF.r0(qVarP);
                hVarR0.getClass();
                hVarF = hVarR0;
            }
            h hVar = hVarF == null ? hVarH : hVarF;
            AbstractC0771g abstractC0771gL = tVar.l();
            if (abstractC0771gL == null) {
                e6.w0(rVar, tVar, "could not determine property type", new Object[0]);
                throw null;
            }
            Class clsG = abstractC0771gL.g();
            Class cls = hVar.f7281k;
            C c7 = (C) e7.f4445b;
            c7.e(cls);
            c7.e(clsG);
            S1.A[] aArr = {(S1.A) e7.f4449f, null, null};
            S1.A a8 = S1.A.f4905l;
            for (int i = 0; i < 3; i++) {
                S1.A a9 = aArr[i];
                if (a9 != null) {
                    if (a7 != null) {
                        a9 = a7.a(a9);
                    }
                    a7 = a9;
                }
            }
            S1.A a10 = a7.a(tVar.h());
            EnumC0363z enumC0363z = EnumC0363z.f4986l;
            EnumC0363z enumC0363z2 = a10.f4906h;
            if (enumC0363z2 == enumC0363z) {
                enumC0363z2 = EnumC0363z.f4983h;
            }
            int iOrdinal = enumC0363z2.ordinal();
            Object obj = EnumC0363z.f4984j;
            C0766b c0766b = rVar.f9566e;
            q qVar = qVarP2;
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        objU0 = obj;
                    } else if (iOrdinal == 4) {
                        if (e7.f4444a) {
                            Object objU2 = e7.f4448e;
                            if (objU2 == null) {
                                boolean zK = c7.k(p015c2.r.CAN_OVERRIDE_ACCESS_MODIFIERS);
                                C0767c c0767c = (C0767c) c0766b.m().i;
                                if (c0767c == null) {
                                    objU2 = null;
                                } else {
                                    if (zK) {
                                        c0767c.m(rVar.f9564c.k(p015c2.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                                    }
                                    try {
                                        objU2 = c0767c.u();
                                    } catch (Exception e8) {
                                        e = e8;
                                        while (e.getCause() != null) {
                                            e = e.getCause();
                                        }
                                        i.C(e);
                                        i.E(e);
                                        throw new IllegalArgumentException("Failed to instantiate bean of type " + c0766b.f9525j.getName() + ": (" + e.getClass().getName() + ") " + i.i(e), e);
                                    }
                                }
                                if (objU2 == null) {
                                    objU2 = Boolean.FALSE;
                                }
                                e7.f4448e = objU2;
                            }
                            Object obj2 = objU2 == Boolean.FALSE ? null : e7.f4448e;
                            if (obj2 != null) {
                                if (c6.k(p015c2.r.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                                    abstractC0771g.m(c7.k(p015c2.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                                }
                                try {
                                    objU = abstractC0771g.q(obj2);
                                    z7 = false;
                                } catch (Exception e9) {
                                    e = e9;
                                    String name = tVar.getName();
                                    while (e.getCause() != null) {
                                        e = e.getCause();
                                    }
                                    i.C(e);
                                    i.E(e);
                                    StringBuilder sbW = k.w("Failed to get property '", name, "' of default ");
                                    sbW.append(obj2.getClass().getName());
                                    sbW.append(" instance");
                                    throw new IllegalArgumentException(sbW.toString());
                                }
                            } else {
                                objU = a.u(hVar);
                                z7 = true;
                            }
                        } else {
                            objU = a.u(hVar);
                            z7 = true;
                        }
                        Object objA = objU;
                        if (objA == null) {
                            objU0 = objA;
                        } else {
                            if (objA.getClass().isArray()) {
                                objA = K2.k.a(objA);
                            }
                            z6 = z7;
                            objU0 = objA;
                        }
                    } else if (iOrdinal != 5) {
                        z6 = false;
                    } else {
                        objU0 = e6.u0(a10.f4907j);
                        z6 = false;
                    }
                    z6 = true;
                } else {
                    if (hVar.D()) {
                        objU0 = obj;
                    } else {
                        objU0 = null;
                    }
                    z6 = true;
                }
                clsArrK = tVar.k();
                if (clsArrK == null) {
                    clsArrK = rVar.c();
                }
                bVar = new b(tVar, abstractC0771g, c0766b.f9533r, hVarH, oVarS0, qVar, hVarF, z6, objU0, clsArrK);
                B b6 = (B) e7.f4447d;
                objX = b6.x(abstractC0771g);
                if (objX != null) {
                    bVar.j(e6.y0(abstractC0771g, objX));
                }
                sVarZ = b6.Z(abstractC0771g);
                if (sVarZ != null) {
                    return new p098s2.q(bVar, sVarZ);
                }
                return bVar;
            }
            z6 = true;
            objU0 = (!hVar.k0() || c7.p(D.WRITE_EMPTY_JSON_ARRAYS)) ? null : obj;
            clsArrK = tVar.k();
            if (clsArrK == null) {
                clsArrK = rVar.c();
            }
            bVar = new b(tVar, abstractC0771g, c0766b.f9533r, hVarH, oVarS0, qVar, hVarF, z6, objU0, clsArrK);
            B b7 = (B) e7.f4447d;
            objX = b7.x(abstractC0771g);
            if (objX != null) {
                bVar.j(e6.y0(abstractC0771g, objX));
            }
            sVarZ = b7.Z(abstractC0771g);
            if (sVarZ != null) {
                return new p098s2.q(bVar, sVarZ);
            }
            return bVar;
        } catch (JsonMappingException e10) {
            e6.w0(rVar, tVar, i.i(e10), new Object[0]);
            throw null;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 31271. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final p015c2.o U(p015c2.E r42, p015c2.h r43, p046i2.r r44, boolean r45) {
        /*
            Method dump skipped, instruction units count: 3127
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p093r2.e.U(c2.E, c2.h, i2.r, boolean):c2.o");
    }
}

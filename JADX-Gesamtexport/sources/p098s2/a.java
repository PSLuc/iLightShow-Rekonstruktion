package p098s2;

import S1.A;
import S1.EnumC0363z;
import T1.e;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import p015c2.E;
import p015c2.h;
import p015c2.o;
import p077o2.q;
import p093r2.b;
import p109u2.InterfaceC0963b;
import p109u2.w;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f12160z;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(String str, w wVar, InterfaceC0963b interfaceC0963b, h hVar) {
        EnumC0363z enumC0363z;
        Object obj;
        EnumC0363z enumC0363z2 = EnumC0363z.f4986l;
        EnumC0363z enumC0363z3 = EnumC0363z.f4983h;
        A a6 = wVar.f12718m;
        boolean z5 = false;
        if (a6 != null && (enumC0363z = a6.f4906h) != enumC0363z3 && enumC0363z != enumC0363z2) {
            z5 = true;
        }
        boolean z6 = z5;
        if (a6 == null) {
            obj = Boolean.FALSE;
        } else {
            EnumC0363z enumC0363z4 = a6.f4906h;
            obj = (enumC0363z4 == enumC0363z3 || enumC0363z4 == EnumC0363z.i || enumC0363z4 == enumC0363z2) ? null : EnumC0363z.f4984j;
        }
        super(wVar, wVar.f12715j, interfaceC0963b, hVar, null, null, null, z6, obj, null);
        this.f12160z = str;
    }

    @Override // p093r2.b
    public final void m(Object obj, e eVar, E e6) {
        Object objQ0 = e6.q0(this.f12160z);
        if (objQ0 == null) {
            o oVar = this.f11741s;
            if (oVar != null) {
                oVar.serialize(null, eVar, e6);
                return;
            } else {
                eVar.V();
                return;
            }
        }
        o oVarH = this.f11740r;
        if (oVarH == null) {
            Class<?> cls = objQ0.getClass();
            AbstractC0599v0 abstractC0599v0 = this.f11743u;
            o oVarI = abstractC0599v0.I(cls);
            oVarH = oVarI == null ? h(abstractC0599v0, cls, e6) : oVarI;
        }
        Object obj2 = this.f11745w;
        if (obj2 != null) {
            if (EnumC0363z.f4984j == obj2) {
                if (oVarH.isEmpty(e6, objQ0)) {
                    o(eVar, e6);
                    return;
                }
            } else if (obj2.equals(objQ0)) {
                o(eVar, e6);
                return;
            }
        }
        if (objQ0 == obj && i(eVar, e6, oVarH)) {
            return;
        }
        q qVar = this.f11742t;
        if (qVar == null) {
            oVarH.serialize(objQ0, eVar, e6);
        } else {
            oVarH.serializeWithType(objQ0, eVar, e6, qVar);
        }
    }

    @Override // p093r2.b
    public final void n(Object obj, e eVar, E e6) {
        Object objQ0 = e6.q0(this.f12160z);
        V1.h hVar = this.f11732j;
        if (objQ0 == null) {
            if (this.f11741s != null) {
                eVar.Q(hVar);
                this.f11741s.serialize(null, eVar, e6);
                return;
            }
            return;
        }
        o oVarH = this.f11740r;
        if (oVarH == null) {
            Class<?> cls = objQ0.getClass();
            AbstractC0599v0 abstractC0599v0 = this.f11743u;
            o oVarI = abstractC0599v0.I(cls);
            oVarH = oVarI == null ? h(abstractC0599v0, cls, e6) : oVarI;
        }
        Object obj2 = this.f11745w;
        if (obj2 != null) {
            if (EnumC0363z.f4984j == obj2) {
                if (oVarH.isEmpty(e6, objQ0)) {
                    return;
                }
            } else if (obj2.equals(objQ0)) {
                return;
            }
        }
        if (objQ0 == obj && i(eVar, e6, oVarH)) {
            return;
        }
        eVar.Q(hVar);
        q qVar = this.f11742t;
        if (qVar == null) {
            oVarH.serialize(objQ0, eVar, e6);
        } else {
            oVarH.serializeWithType(objQ0, eVar, e6, qVar);
        }
    }
}

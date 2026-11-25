package p098s2;

import S1.EnumC0352n;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ser.std.AbstractC0530a;
import java.lang.reflect.Type;
import java.util.Objects;
import p015c2.B;
import p015c2.E;
import p015c2.InterfaceC0472c;
import p015c2.h;
import p015c2.o;
import p046i2.AbstractC0771g;
import p059l2.a;
import p059l2.b;
import p071n2.e;
import p087q2.r;
import p093r2.f;

/* JADX INFO: loaded from: classes.dex */
public final class n extends AbstractC0530a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n f12188k;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o f12189j;

    static {
        p104t2.n.f12536k.getClass();
        p104t2.n.m(String.class);
        f12188k = new n();
    }

    public n() {
        super(String[].class);
        this.f12189j = null;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P, p015c2.o
    public final void acceptJsonFormatVisitor(b bVar, h hVar) {
        visitArrayFormat(bVar, hVar, a.f10368h);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0530a, p093r2.g
    public final o b(E e6, InterfaceC0472c interfaceC0472c) {
        o oVarY0;
        Object objD;
        if (interfaceC0472c != null) {
            B bD = e6.f7226j.d();
            AbstractC0771g abstractC0771gE = interfaceC0472c.e();
            if (abstractC0771gE == null || (objD = bD.d(abstractC0771gE)) == null) {
                oVarY0 = null;
            } else {
                oVarY0 = e6.y0(abstractC0771gE, objD);
            }
        } else {
            oVarY0 = null;
        }
        Boolean boolFindFormatFeature = findFormatFeature(e6, interfaceC0472c, String[].class, EnumC0352n.f4955j);
        o oVar = this.f12189j;
        if (oVarY0 == null) {
            oVarY0 = oVar;
        }
        o oVarFindContextualConvertingSerializer = findContextualConvertingSerializer(e6, interfaceC0472c, oVarY0);
        if (oVarFindContextualConvertingSerializer == null) {
            oVarFindContextualConvertingSerializer = e6.i0(String.class, interfaceC0472c);
        }
        o oVar2 = isDefaultSerializer(oVarFindContextualConvertingSerializer) ? null : oVarFindContextualConvertingSerializer;
        return (oVar2 == oVar && Objects.equals(boolFindFormatFeature, this.i)) ? this : new n(this, interfaceC0472c, oVar2, boolFindFormatFeature);
    }

    @Override // p093r2.f
    public final f c(e eVar) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0530a
    public final o e(InterfaceC0472c interfaceC0472c, Boolean bool) {
        return new n(this, interfaceC0472c, this.f12189j, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0530a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void f(String[] strArr, T1.e eVar, E e6) {
        int length = strArr.length;
        if (length == 0) {
            return;
        }
        int i = 0;
        o oVar = this.f12189j;
        if (oVar == null) {
            while (i < length) {
                String str = strArr[i];
                if (str == null) {
                    eVar.V();
                } else {
                    eVar.s0(str);
                }
                i++;
            }
            return;
        }
        int length2 = strArr.length;
        while (i < length2) {
            String str2 = strArr[i];
            if (str2 == null) {
                e6.g0(eVar);
            } else {
                oVar.serialize(str2, eVar, e6);
            }
            i++;
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P
    public final JsonNode getSchema(E e6, Type type) {
        r rVarCreateSchemaNode = createSchemaNode("array", true);
        rVarCreateSchemaNode.w("items", createSchemaNode("string"));
        return rVarCreateSchemaNode;
    }

    @Override // p015c2.o
    public final boolean isEmpty(E e6, Object obj) {
        return ((String[]) obj).length == 0;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r0 == java.lang.Boolean.TRUE) goto L10;
     */
    @Override // p015c2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void serialize(java.lang.Object r4, T1.e r5, p015c2.E r6) {
        /*
            r3 = this;
            java.lang.String[] r4 = (java.lang.String[]) r4
            int r0 = r4.length
            r1 = 1
            if (r0 != r1) goto L1c
            java.lang.Boolean r0 = r3.i
            if (r0 != 0) goto L14
            c2.D r1 = p015c2.D.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            c2.C r2 = r6.f7226j
            boolean r1 = r2.p(r1)
            if (r1 != 0) goto L18
        L14:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            if (r0 != r1) goto L1c
        L18:
            r3.f(r4, r5, r6)
            return
        L1c:
            r5.n0(r4)
            r3.f(r4, r5, r6)
            r5.L()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p098s2.n.serialize(java.lang.Object, T1.e, c2.E):void");
    }

    public n(n nVar, InterfaceC0472c interfaceC0472c, o oVar, Boolean bool) {
        super(nVar, interfaceC0472c, bool);
        this.f12189j = oVar;
    }
}

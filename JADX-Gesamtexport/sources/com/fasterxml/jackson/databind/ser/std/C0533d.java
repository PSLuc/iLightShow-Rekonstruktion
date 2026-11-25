package com.fasterxml.jackson.databind.ser.std;

import S1.C0355q;
import S1.EnumC0354p;
import com.fasterxml.jackson.databind.JsonNode;
import java.lang.reflect.Type;
import java.net.InetAddress;
import p015c2.InterfaceC0472c;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0533d extends Q implements p093r2.g {
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f7717j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0533d(boolean z5, int i) {
        super(z5 ? Boolean.TYPE : Boolean.class, 2, (byte) 0);
        this.i = i;
        switch (i) {
            case 1:
                super(z5 ? Boolean.TYPE : Boolean.class, 2, (byte) 0);
                this.f7717j = z5;
                break;
            case 2:
                super(InetAddress.class, 2, (byte) 0);
                this.f7717j = z5;
                break;
            default:
                this.f7717j = z5;
                break;
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q, com.fasterxml.jackson.databind.ser.std.P, p015c2.o
    public void acceptJsonFormatVisitor(p059l2.b bVar, p015c2.h hVar) {
        switch (this.i) {
            case 0:
                bVar.getClass();
                break;
            case 1:
                visitIntFormat(bVar, hVar, T1.h.f5208h);
                break;
            default:
                super.acceptJsonFormatVisitor(bVar, hVar);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    @Override // p093r2.g
    public final p015c2.o b(p015c2.E e6, InterfaceC0472c interfaceC0472c) {
        p015c2.o c0546q;
        boolean z5;
        switch (this.i) {
            case 0:
                C0355q c0355qFindFormatOverrides = findFormatOverrides(e6, interfaceC0472c, handledType());
                if (c0355qFindFormatOverrides == null) {
                    return this;
                }
                EnumC0354p enumC0354p = c0355qFindFormatOverrides.i;
                if (enumC0354p.a()) {
                    c0546q = new C0533d(this.f7717j, 1);
                } else {
                    if (enumC0354p != EnumC0354p.f4968p) {
                        return this;
                    }
                    c0546q = new C0546q(0, this._handledType);
                }
                return c0546q;
            case 1:
                C0355q c0355qFindFormatOverrides2 = findFormatOverrides(e6, interfaceC0472c, Boolean.class);
                return (c0355qFindFormatOverrides2 == null || c0355qFindFormatOverrides2.i.a()) ? this : new C0533d(this.f7717j, 0);
            default:
                C0355q c0355qFindFormatOverrides3 = findFormatOverrides(e6, interfaceC0472c, handledType());
                if (c0355qFindFormatOverrides3 != null) {
                    EnumC0354p enumC0354p2 = c0355qFindFormatOverrides3.i;
                    if (enumC0354p2.a() || enumC0354p2 == EnumC0354p.f4963k) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                } else {
                    z5 = false;
                }
                return z5 != this.f7717j ? new C0533d(z5, 2) : this;
        }
    }

    public void f(InetAddress inetAddress, T1.e eVar) {
        String strTrim;
        if (this.f7717j) {
            strTrim = inetAddress.getHostAddress();
        } else {
            strTrim = inetAddress.toString().trim();
            int iIndexOf = strTrim.indexOf(47);
            if (iIndexOf >= 0) {
                strTrim = iIndexOf == 0 ? strTrim.substring(1) : strTrim.substring(0, iIndexOf);
            }
        }
        eVar.s0(strTrim);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q, com.fasterxml.jackson.databind.ser.std.P
    public JsonNode getSchema(p015c2.E e6, Type type) {
        switch (this.i) {
            case 0:
                return createSchemaNode("boolean", !this.f7717j);
            default:
                return super.getSchema(e6, type);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q, p015c2.o
    public final void serialize(Object obj, T1.e eVar, p015c2.E e6) {
        switch (this.i) {
            case 0:
                eVar.J(Boolean.TRUE.equals(obj));
                break;
            case 1:
                eVar.Z(!Boolean.FALSE.equals(obj) ? 1 : 0);
                break;
            default:
                f((InetAddress) obj, eVar);
                break;
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q, p015c2.o
    public final void serializeWithType(Object obj, T1.e eVar, p015c2.E e6, p071n2.e eVar2) {
        switch (this.i) {
            case 0:
                eVar.J(Boolean.TRUE.equals(obj));
                break;
            case 1:
                eVar.J(Boolean.TRUE.equals(obj));
                break;
            default:
                InetAddress inetAddress = (InetAddress) obj;
                p003a2.a aVarD = eVar2.d(T1.k.VALUE_STRING, inetAddress);
                aVarD.f6158b = InetAddress.class;
                p003a2.a aVarE = eVar2.e(eVar, aVarD);
                f(inetAddress, eVar);
                eVar2.f(eVar, aVarE);
                break;
        }
    }
}

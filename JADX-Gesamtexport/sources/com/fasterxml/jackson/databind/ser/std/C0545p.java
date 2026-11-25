package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonNode;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0545p extends P {
    public static final C0545p i = new C0545p(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0545p f7754j = new C0545p(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7755h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0545p(int i3, int i6, Class cls) {
        super(i3, cls);
        this.f7755h = i6;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P, p015c2.o
    public void acceptJsonFormatVisitor(p059l2.b bVar, p015c2.h hVar) {
        switch (this.f7755h) {
            case 0:
                bVar.getClass();
                break;
            case 1:
                bVar.getClass();
                break;
            case 2:
                bVar.getClass();
                break;
            case 3:
                visitStringFormat(bVar, hVar);
                break;
            case 4:
                visitArrayFormat(bVar, hVar, p059l2.a.f10368h);
                break;
            case 5:
            default:
                super.acceptJsonFormatVisitor(bVar, hVar);
                break;
            case 6:
                bVar.getClass();
                break;
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P
    public JsonNode getSchema(p015c2.E e6, Type type) {
        switch (this.f7755h) {
            case 0:
                return createSchemaNode("null");
            case 1:
            case 5:
            default:
                return super.getSchema(e6, type);
            case 2:
                p087q2.r rVarCreateSchemaNode = createSchemaNode("array", true);
                rVarCreateSchemaNode.w("items", createSchemaNode("byte"));
                return rVarCreateSchemaNode;
            case 3:
                return createSchemaNode("string", true);
            case 4:
                p087q2.r rVarCreateSchemaNode2 = createSchemaNode("array", true);
                p087q2.r rVarCreateSchemaNode3 = createSchemaNode("string");
                rVarCreateSchemaNode3.q("type", "string");
                rVarCreateSchemaNode2.w("items", rVarCreateSchemaNode3);
                return rVarCreateSchemaNode2;
            case 6:
                return null;
        }
    }

    @Override // p015c2.o
    public boolean isEmpty(p015c2.E e6, Object obj) {
        switch (this.f7755h) {
            case 1:
                p015c2.m mVar = (p015c2.m) obj;
                if (mVar instanceof p015c2.l) {
                    return ((p015c2.l) mVar).isEmpty();
                }
                return false;
            case 2:
                return ((byte[]) obj).length == 0;
            case 3:
            case 5:
            default:
                return super.isEmpty(e6, obj);
            case 4:
                return ((char[]) obj).length == 0;
            case 6:
                return true;
        }
    }

    @Override // p015c2.o
    public void serialize(Object obj, T1.e eVar, p015c2.E e6) {
        switch (this.f7755h) {
            case 0:
                eVar.V();
                break;
            case 1:
                ((p015c2.m) obj).c(eVar, e6);
                break;
            case 2:
                byte[] bArr = (byte[]) obj;
                eVar.G(e6.f7226j.i.f8685n, bArr, 0, bArr.length);
                break;
            case 3:
                eVar.k0(obj.toString());
                break;
            case 4:
                char[] cArr = (char[]) obj;
                boolean zP = e6.f7226j.p(p015c2.D.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS);
                if (zP) {
                    int length = cArr.length;
                    eVar.n0(cArr);
                    int length2 = cArr.length;
                    for (int i3 = 0; i3 < length2; i3++) {
                        eVar.t0(cArr, i3, 1);
                    }
                    eVar.L();
                } else {
                    eVar.t0(cArr, 0, cArr.length);
                }
                break;
            case 5:
                eVar.T((String) obj);
                break;
            default:
                eVar.q0(obj);
                eVar.M();
                break;
        }
    }

    @Override // p015c2.o
    public void serializeWithType(Object obj, T1.e eVar, p015c2.E e6, p071n2.e eVar2) {
        p003a2.a aVarE;
        switch (this.f7755h) {
            case 0:
                eVar.V();
                break;
            case 1:
                ((p015c2.m) obj).d(eVar, e6, eVar2);
                break;
            case 2:
                byte[] bArr = (byte[]) obj;
                p003a2.a aVarE2 = eVar2.e(eVar, eVar2.d(T1.k.VALUE_EMBEDDED_OBJECT, bArr));
                eVar.G(e6.f7226j.i.f8685n, bArr, 0, bArr.length);
                eVar2.f(eVar, aVarE2);
                break;
            case 3:
                p003a2.a aVarE3 = eVar2.e(eVar, eVar2.d(T1.k.VALUE_EMBEDDED_OBJECT, obj));
                serialize(obj, eVar, e6);
                eVar2.f(eVar, aVarE3);
                break;
            case 4:
                char[] cArr = (char[]) obj;
                boolean zP = e6.f7226j.p(p015c2.D.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS);
                if (zP) {
                    aVarE = eVar2.e(eVar, eVar2.d(T1.k.START_ARRAY, cArr));
                    int length = cArr.length;
                    for (int i3 = 0; i3 < length; i3++) {
                        eVar.t0(cArr, i3, 1);
                    }
                } else {
                    aVarE = eVar2.e(eVar, eVar2.d(T1.k.VALUE_STRING, cArr));
                    eVar.t0(cArr, 0, cArr.length);
                }
                eVar2.f(eVar, aVarE);
                break;
            case 5:
            default:
                super.serializeWithType(obj, eVar, e6, eVar2);
                break;
            case 6:
                eVar2.f(eVar, eVar2.e(eVar, eVar2.d(T1.k.START_OBJECT, obj)));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0545p(p015c2.h hVar) {
        super(hVar);
        this.f7755h = 6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0545p(int i3) {
        super(Object.class);
        this.f7755h = i3;
        switch (i3) {
            case 1:
                super(p015c2.m.class);
                break;
            case 2:
                super(byte[].class);
                break;
            case 3:
            default:
                break;
            case 4:
                super(char[].class);
                break;
            case 5:
                super(0, String.class);
                break;
        }
    }
}

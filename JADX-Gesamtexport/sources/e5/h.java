package e5;

import B.C0025m0;
import N3.A0;
import S1.h0;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f8764a = new i();

    public static final JsonEncodingException a(Number number, String str) {
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) h(str, -1)));
    }

    public static final JsonDecodingException b(int i, String str, CharSequence charSequence) {
        E4.k.f("message", str);
        E4.k.f("input", charSequence);
        String str2 = str + "\nJSON input: " + ((Object) h(charSequence, i));
        E4.k.f("message", str2);
        if (i >= 0) {
            str2 = "Unexpected JSON token at offset " + i + ": " + str2;
        }
        E4.k.f("message", str2);
        return new JsonDecodingException(str2);
    }

    public static final a5.g c(a5.g gVar, Z2.f fVar) {
        E4.k.f("<this>", gVar);
        E4.k.f("module", fVar);
        if (!E4.k.a(gVar.c(), a5.i.f6372j)) {
            return gVar.g() ? c(gVar.k(0), fVar) : gVar;
        }
        G4.a.s(gVar);
        return gVar;
    }

    public static final byte d(char c6) {
        if (c6 < '~') {
            return c.f8758b[c6];
        }
        return (byte) 0;
    }

    public static final String e(a5.g gVar, d5.c cVar) {
        E4.k.f("<this>", gVar);
        E4.k.f("json", cVar);
        for (Annotation annotation : gVar.d()) {
            if (annotation instanceof d5.h) {
                return ((d5.h) annotation).discriminator();
            }
        }
        return cVar.f8595a.f8615e;
    }

    public static final int f(a5.g gVar, d5.c cVar, String str) {
        E4.k.f("<this>", gVar);
        E4.k.f("json", cVar);
        E4.k.f("name", str);
        i(gVar, cVar);
        int iA = gVar.a(str);
        if (iA != -3 || !cVar.f8595a.f8616f) {
            return iA;
        }
        i iVar = f8764a;
        A0 a6 = new A0(gVar, 6, cVar);
        C0025m0 c0025m0 = cVar.f8597c;
        c0025m0.getClass();
        c0025m0.getClass();
        E4.k.f("descriptor", gVar);
        Map map = (Map) ((ConcurrentHashMap) c0025m0.i).get(gVar);
        Object obj = map != null ? map.get(iVar) : null;
        Object objInvoke = obj != null ? obj : null;
        if (objInvoke == null) {
            objInvoke = a6.invoke();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c0025m0.i;
            Object concurrentHashMap2 = concurrentHashMap.get(gVar);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(gVar, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(iVar, objInvoke);
        }
        Integer num = (Integer) ((Map) objInvoke).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final void g(o oVar, String str) {
        oVar.l(oVar.f8792a - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence h(CharSequence charSequence, int i) {
        E4.k.f("<this>", charSequence);
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i3 = i - 30;
                int i6 = i + 30;
                String str = i3 <= 0 ? "" : ".....";
                String str2 = i6 >= charSequence.length() ? "" : ".....";
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (i3 < 0) {
                    i3 = 0;
                }
                int length = charSequence.length();
                if (i6 > length) {
                    i6 = length;
                }
                sb.append(charSequence.subSequence(i3, i6).toString());
                sb.append(str2);
                return sb.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void i(a5.g gVar, d5.c cVar) {
        E4.k.f("<this>", gVar);
        E4.k.f("json", cVar);
        E4.k.a(gVar.c(), a5.j.f6374j);
    }

    public static final q j(a5.g gVar, d5.c cVar) {
        E4.k.f("<this>", cVar);
        E4.k.f("desc", gVar);
        h0 h0VarC = gVar.c();
        if (h0VarC instanceof a5.d) {
            return q.POLY_OBJ;
        }
        if (E4.k.a(h0VarC, a5.j.f6375k)) {
            return q.LIST;
        }
        if (!E4.k.a(h0VarC, a5.j.f6376l)) {
            return q.OBJ;
        }
        a5.g gVarC = c(gVar.k(0), cVar.f8596b);
        h0 h0VarC2 = gVarC.c();
        if ((h0VarC2 instanceof a5.f) || E4.k.a(h0VarC2, a5.i.f6373k)) {
            return q.MAP;
        }
        throw new JsonEncodingException("Value of type '" + gVarC.b() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + gVarC.c() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final void k(o oVar, Number number) {
        o.m(oVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String l(byte b6) {
        if (b6 == 1) {
            return "quotation mark '\"'";
        }
        if (b6 == 2) {
            return "string escape sequence '\\'";
        }
        if (b6 == 4) {
            return "comma ','";
        }
        if (b6 == 5) {
            return "colon ':'";
        }
        if (b6 == 6) {
            return "start of the object '{'";
        }
        if (b6 == 7) {
            return "end of the object '}'";
        }
        if (b6 == 8) {
            return "start of the array '['";
        }
        if (b6 == 9) {
            return "end of the array ']'";
        }
        if (b6 == 10) {
            return "end of the input";
        }
        return b6 == 127 ? "invalid token" : "valid token";
    }
}

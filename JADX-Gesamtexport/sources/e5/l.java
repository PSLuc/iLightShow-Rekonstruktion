package e5;

import E4.x;
import F.C0068j;
import S1.h0;
import c5.C0501w;
import java.util.ArrayList;
import java.util.Arrays;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p089q4.r;

/* JADX INFO: loaded from: classes.dex */
public final class l extends p027e3.a implements b5.c, b5.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d5.c f8776j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q f8777k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o f8778l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Z2.f f8779m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8780n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d5.i f8781o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f8782p;

    public l(d5.c cVar, q qVar, o oVar, a5.g gVar) {
        E4.k.f("json", cVar);
        E4.k.f("descriptor", gVar);
        this.f8776j = cVar;
        this.f8777k = qVar;
        this.f8778l = oVar;
        this.f8779m = cVar.f8596b;
        this.f8780n = -1;
        d5.i iVar = cVar.f8595a;
        this.f8781o = iVar;
        this.f8782p = iVar.f8613c ? null : new g(gVar);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0119  */
    /* JADX WARN: Code duplicated, block: B:44:0x011a  */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x011a, please report this as an issue */
    @Override // p027e3.a, b5.c
    public final Object A(Y4.a aVar) {
        String message;
        String content;
        d5.c cVar = this.f8776j;
        o oVar = this.f8778l;
        C0068j c0068j = oVar.f8793b;
        E4.k.f("deserializer", aVar);
        try {
            if (!(aVar instanceof Y4.c)) {
                return aVar.deserialize(this);
            }
            d5.i iVar = cVar.f8595a;
            String strP = oVar.p(h.e(((Y4.c) aVar).getDescriptor(), cVar));
            if (strP != null) {
                try {
                    h0.k((Y4.c) aVar, this, strP);
                    throw null;
                } catch (SerializationException e6) {
                    String message2 = e6.getMessage();
                    E4.k.c(message2);
                    int iF0 = M4.l.f0(message2, '\n', 0, 6);
                    if (iF0 != -1) {
                        message2 = message2.substring(0, iF0);
                        E4.k.e("substring(...)", message2);
                    }
                    String strQ0 = M4.l.q0(message2, ".");
                    String message3 = e6.getMessage();
                    E4.k.c(message3);
                    o.m(oVar, strQ0, 0, M4.l.x0(message3, '\n', ""), 2);
                    throw null;
                }
            }
            if (!(aVar instanceof Y4.c)) {
                return aVar.deserialize(this);
            }
            d5.i iVar2 = cVar.f8595a;
            String strE = h.e(((Y4.c) aVar).getDescriptor(), cVar);
            JsonElement jsonElementF0 = F0();
            String strB = ((Y4.c) aVar).getDescriptor().b();
            if (!(jsonElementF0 instanceof JsonObject)) {
                throw h.b(-1, "Expected " + x.a(JsonObject.class).b() + ", but had " + x.a(jsonElementF0.getClass()).b() + " as the serialized body of " + strB + " at element: " + c0068j.f(), jsonElementF0.toString());
            }
            JsonObject jsonObject = (JsonObject) jsonElementF0;
            JsonElement jsonElement = (JsonElement) jsonObject.get((Object) strE);
            if (jsonElement != null) {
                JsonPrimitive jsonPrimitiveA = d5.k.a(jsonElement);
                content = jsonPrimitiveA instanceof JsonNull ? null : jsonPrimitiveA.getContent();
            }
            try {
                h0.k((Y4.c) aVar, this, content);
                throw null;
            } catch (SerializationException e7) {
                String message4 = e7.getMessage();
                E4.k.c(message4);
                throw h.b(-1, message4, jsonObject.toString());
            }
            message = e.getMessage();
            E4.k.c(message);
            if (M4.l.a0(message, "at path")) {
                throw e;
            }
            throw new MissingFieldException(e.f9955h, e.getMessage() + " at path: " + c0068j.f(), e);
        } catch (MissingFieldException e8) {
            message = e8.getMessage();
            E4.k.c(message);
            if (M4.l.a0(message, "at path")) {
                throw e8;
            }
            throw new MissingFieldException(e8.f9955h, e8.getMessage() + " at path: " + c0068j.f(), e8);
        }
    }

    @Override // p027e3.a, b5.a
    public final Object B(a5.g gVar, int i, Y4.a aVar, Object obj) {
        E4.k.f("descriptor", gVar);
        E4.k.f("deserializer", aVar);
        boolean z5 = this.f8777k == q.MAP && (i & 1) == 0;
        C0068j c0068j = this.f8778l.f8793b;
        if (z5) {
            int[] iArr = (int[]) c0068j.f1184d;
            int i3 = c0068j.f1182b;
            if (iArr[i3] == -2) {
                ((Object[]) c0068j.f1183c)[i3] = i.f8765a;
            }
        }
        Object objB = super.B(gVar, i, aVar, obj);
        if (z5) {
            int[] iArr2 = (int[]) c0068j.f1184d;
            int i6 = c0068j.f1182b;
            if (iArr2[i6] != -2) {
                int i7 = i6 + 1;
                c0068j.f1182b = i7;
                Object[] objArr = (Object[]) c0068j.f1183c;
                if (i7 == objArr.length) {
                    int i8 = i7 * 2;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, i8);
                    E4.k.e("copyOf(...)", objArrCopyOf);
                    c0068j.f1183c = objArrCopyOf;
                    int[] iArrCopyOf = Arrays.copyOf((int[]) c0068j.f1184d, i8);
                    E4.k.e("copyOf(...)", iArrCopyOf);
                    c0068j.f1184d = iArrCopyOf;
                }
            }
            Object[] objArr2 = (Object[]) c0068j.f1183c;
            int i9 = c0068j.f1182b;
            objArr2[i9] = objB;
            ((int[]) c0068j.f1184d)[i9] = -2;
        }
        return objB;
    }

    @Override // p027e3.a, b5.c
    public final double C() {
        o oVar = this.f8778l;
        String strJ = oVar.j();
        try {
            double d6 = Double.parseDouble(strJ);
            d5.i iVar = this.f8776j.f8595a;
            if (!Double.isInfinite(d6) && !Double.isNaN(d6)) {
                return d6;
            }
            h.k(oVar, Double.valueOf(d6));
            throw null;
        } catch (IllegalArgumentException unused) {
            o.m(oVar, "Failed to parse type 'double' for input '" + strJ + '\'', 0, null, 6);
            throw null;
        }
    }

    public final JsonElement F0() {
        return new K3.e(this.f8776j.f8595a, this.f8778l).h();
    }

    @Override // p027e3.a, b5.c
    public final b5.a a(a5.g gVar) {
        E4.k.f("descriptor", gVar);
        d5.c cVar = this.f8776j;
        q qVarJ = h.j(gVar, cVar);
        o oVar = this.f8778l;
        C0068j c0068j = oVar.f8793b;
        int i = c0068j.f1182b + 1;
        c0068j.f1182b = i;
        Object[] objArr = (Object[]) c0068j.f1183c;
        if (i == objArr.length) {
            int i3 = i * 2;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i3);
            E4.k.e("copyOf(...)", objArrCopyOf);
            c0068j.f1183c = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf((int[]) c0068j.f1184d, i3);
            E4.k.e("copyOf(...)", iArrCopyOf);
            c0068j.f1184d = iArrCopyOf;
        }
        ((Object[]) c0068j.f1183c)[i] = gVar;
        oVar.g(qVarJ.f8805h);
        if (oVar.q() == 4) {
            o.m(oVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iOrdinal = qVarJ.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new l(cVar, qVarJ, oVar, gVar);
        }
        return (this.f8777k == qVarJ && cVar.f8595a.f8613c) ? this : new l(cVar, qVarJ, oVar, gVar);
    }

    @Override // p027e3.a, b5.a
    public final void b(a5.g gVar) {
        E4.k.f("descriptor", gVar);
        if (this.f8776j.f8595a.f8612b && gVar.e() == 0) {
            while (k(gVar) != -1) {
            }
        }
        o oVar = this.f8778l;
        if (oVar.u()) {
            h.g(oVar, "");
            throw null;
        }
        oVar.g(this.f8777k.i);
        C0068j c0068j = oVar.f8793b;
        int i = c0068j.f1182b;
        int[] iArr = (int[]) c0068j.f1184d;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            c0068j.f1182b = i - 1;
        }
        int i3 = c0068j.f1182b;
        if (i3 != -1) {
            c0068j.f1182b = i3 - 1;
        }
    }

    @Override // b5.a
    public final Z2.f c() {
        return this.f8779m;
    }

    @Override // p027e3.a, b5.c
    public final long d() {
        return this.f8778l.h();
    }

    @Override // p027e3.a, b5.c
    public final boolean f() {
        boolean z5;
        boolean z6;
        o oVar = this.f8778l;
        int iT = oVar.t();
        String str = oVar.f8796e;
        if (iT == str.length()) {
            o.m(oVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iT) == '\"') {
            iT++;
            z5 = true;
        } else {
            z5 = false;
        }
        int iS = oVar.s(iT);
        if (iS >= str.length() || iS == -1) {
            o.m(oVar, "EOF", 0, null, 6);
            throw null;
        }
        int i = iS + 1;
        int iCharAt = str.charAt(iS) | ' ';
        if (iCharAt == 102) {
            oVar.c(i, "alse");
            z6 = false;
        } else {
            if (iCharAt != 116) {
                o.m(oVar, "Expected valid boolean literal prefix, but had '" + oVar.j() + '\'', 0, null, 6);
                throw null;
            }
            oVar.c(i, "rue");
            z6 = true;
        }
        if (!z5) {
            return z6;
        }
        if (oVar.f8792a == str.length()) {
            o.m(oVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(oVar.f8792a) == '\"') {
            oVar.f8792a++;
            return z6;
        }
        o.m(oVar, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // p027e3.a, b5.c
    public final boolean g() {
        g gVar = this.f8782p;
        if (!(gVar != null ? gVar.f8763b : false)) {
            o oVar = this.f8778l;
            int iS = oVar.s(oVar.t());
            String str = oVar.f8796e;
            int length = str.length() - iS;
            boolean z5 = false;
            if (length >= 4 && iS != -1) {
                for (int i = 0; i < 4; i++) {
                    if ("null".charAt(i) == str.charAt(iS + i)) {
                    }
                }
                if (length <= 4 || h.d(str.charAt(iS + 4)) != 0) {
                    oVar.f8792a = iS + 4;
                    z5 = true;
                }
            }
            if (!z5) {
                return true;
            }
        }
        return false;
    }

    @Override // p027e3.a, b5.c
    public final char i() {
        o oVar = this.f8778l;
        String strJ = oVar.j();
        if (strJ.length() == 1) {
            return strJ.charAt(0);
        }
        o.m(oVar, "Expected single char, but got '" + strJ + '\'', 0, null, 6);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0205 A[EDGE_INSN: B:114:0x0205->B:115:0x0206 BREAK  A[LOOP:0: B:48:0x009a->B:92:0x016c]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    @Override // b5.a
    public final int k(a5.g gVar) {
        E4.k.f("descriptor", gVar);
        q qVar = this.f8777k;
        int iOrdinal = qVar.ordinal();
        o oVar = this.f8778l;
        boolean zU = false;
        char c6 = ':';
        d5.c cVar = this.f8776j;
        int i = -1;
        C0068j c0068j = oVar.f8793b;
        if (iOrdinal == 0) {
            boolean zU2 = oVar.u();
            while (true) {
                boolean zB = oVar.b();
                g gVar2 = this.f8782p;
                if (zB) {
                    d5.i iVar = this.f8781o;
                    String strD = oVar.d();
                    oVar.g(c6);
                    int iF = h.f(gVar, cVar, strD);
                    if (iF != -3) {
                        if (gVar2 != null) {
                            C0501w c0501w = gVar2.f8762a;
                            if (iF < 64) {
                                c0501w.f7502c |= 1 << iF;
                            } else {
                                int i3 = (iF >>> 6) - 1;
                                long[] jArr = c0501w.f7503d;
                                jArr[i3] = jArr[i3] | (1 << (iF & 63));
                            }
                        }
                        i = iF;
                        break;
                    }
                    boolean z5 = iVar.f8612b;
                    String str = oVar.f8796e;
                    if (!z5) {
                        oVar.l(M4.l.k0(6, str.subSequence(0, oVar.f8792a).toString(), strD), "Encountered an unknown key '" + strD + '\'', "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                        throw null;
                    }
                    ArrayList arrayList = new ArrayList();
                    byte bQ = oVar.q();
                    if (bQ == 8 || bQ == 6) {
                        while (true) {
                            byte bQ2 = oVar.q();
                            if (bQ2 == 1) {
                                oVar.d();
                            } else {
                                if (bQ2 == 8 || bQ2 == 6) {
                                    arrayList.add(Byte.valueOf(bQ2));
                                } else if (bQ2 == 9) {
                                    if (((Number) p089q4.l.f0(arrayList)).byteValue() != 8) {
                                        throw h.b(oVar.f8792a, "found ] instead of } at path: " + c0068j, str);
                                    }
                                    r.U(arrayList);
                                } else if (bQ2 == 7) {
                                    if (((Number) p089q4.l.f0(arrayList)).byteValue() != 6) {
                                        throw h.b(oVar.f8792a, "found } instead of ] at path: " + c0068j, str);
                                    }
                                    r.U(arrayList);
                                } else if (bQ2 == 10) {
                                    o.m(oVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                    throw null;
                                }
                                oVar.e();
                                if (arrayList.size() == 0) {
                                    break;
                                }
                            }
                        }
                    } else {
                        oVar.j();
                    }
                    zU2 = oVar.u();
                    zU = false;
                    c6 = ':';
                } else {
                    ?? r6 = zU;
                    if (!zU2) {
                        if (gVar2 == null) {
                            i = -1;
                            break;
                        }
                        C0501w c0501w2 = gVar2.f8762a;
                        a5.g gVar3 = c0501w2.f7500a;
                        int iE = gVar3.e();
                        while (true) {
                            long j4 = c0501w2.f7502c;
                            f fVar = c0501w2.f7501b;
                            if (j4 == -1) {
                                if (iE <= 64) {
                                    i = -1;
                                    break;
                                }
                                long[] jArr2 = c0501w2.f7503d;
                                int length = jArr2.length;
                                loop3: while (true) {
                                    if (r6 >= length) {
                                        i = -1;
                                        break;
                                    }
                                    int i6 = r6 + 1;
                                    int i7 = i6 * 64;
                                    long j6 = jArr2[r6];
                                    while (true) {
                                        if (j6 != -1) {
                                            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j6);
                                            j6 |= 1 << iNumberOfTrailingZeros;
                                            int i8 = iNumberOfTrailingZeros + i7;
                                            if (((Boolean) fVar.d(gVar3, Integer.valueOf(i8))).booleanValue()) {
                                                jArr2[r6] = j6;
                                                i = i8;
                                                break;
                                            }
                                        } else {
                                            jArr2[r6] = j6;
                                            r6 = i6;
                                        }
                                    }
                                }
                            } else {
                                int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j4);
                                c0501w2.f7502c |= 1 << iNumberOfTrailingZeros2;
                                if (((Boolean) fVar.d(gVar3, Integer.valueOf(iNumberOfTrailingZeros2))).booleanValue()) {
                                    i = iNumberOfTrailingZeros2;
                                    break;
                                }
                            }
                        }
                    } else {
                        d5.i iVar2 = cVar.f8595a;
                        h.g(oVar, "object");
                        throw null;
                    }
                }
            }
        } else if (iOrdinal != 2) {
            boolean zU3 = oVar.u();
            if (oVar.b()) {
                int i9 = this.f8780n;
                if (i9 != -1 && !zU3) {
                    o.m(oVar, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i = i9 + 1;
                this.f8780n = i;
            } else if (zU3) {
                d5.i iVar3 = cVar.f8595a;
                h.g(oVar, "array");
                throw null;
            }
        } else {
            int i10 = this.f8780n;
            boolean z6 = i10 % 2 != 0;
            if (!z6) {
                oVar.g(':');
            } else if (i10 != -1) {
                zU = oVar.u();
            }
            if (oVar.b()) {
                if (z6) {
                    if (this.f8780n == -1) {
                        int i11 = oVar.f8792a;
                        if (zU) {
                            o.m(oVar, "Unexpected leading comma", i11, null, 4);
                            throw null;
                        }
                    } else {
                        int i12 = oVar.f8792a;
                        if (!zU) {
                            o.m(oVar, "Expected comma after the key-value pair", i12, null, 4);
                            throw null;
                        }
                    }
                }
                i = this.f8780n + 1;
                this.f8780n = i;
            } else if (zU) {
                d5.i iVar4 = cVar.f8595a;
                h.g(oVar, "object");
                throw null;
            }
        }
        if (qVar != q.MAP) {
            ((int[]) c0068j.f1184d)[c0068j.f1182b] = i;
        }
        return i;
    }

    @Override // p027e3.a, b5.c
    public final int q() {
        o oVar = this.f8778l;
        long jH = oVar.h();
        int i = (int) jH;
        if (jH == i) {
            return i;
        }
        o.m(oVar, "Failed to parse int for input '" + jH + '\'', 0, null, 6);
        throw null;
    }

    @Override // p027e3.a, b5.c
    public final b5.c r(a5.g gVar) {
        E4.k.f("descriptor", gVar);
        return n.a(gVar) ? new H1.e(this.f8778l, this.f8776j) : this;
    }

    @Override // p027e3.a, b5.c
    public final byte s() {
        o oVar = this.f8778l;
        long jH = oVar.h();
        byte b6 = (byte) jH;
        if (jH == b6) {
            return b6;
        }
        o.m(oVar, "Failed to parse byte for input '" + jH + '\'', 0, null, 6);
        throw null;
    }

    @Override // p027e3.a, b5.c
    public final int t(a5.g gVar) {
        E4.k.f("enumDescriptor", gVar);
        o oVar = this.f8778l;
        String strI = oVar.i();
        String strConcat = " at path ".concat(oVar.f8793b.f());
        d5.c cVar = this.f8776j;
        E4.k.f("<this>", gVar);
        E4.k.f("json", cVar);
        E4.k.f("name", strI);
        E4.k.f("suffix", strConcat);
        int iF = h.f(gVar, cVar, strI);
        if (iF != -3) {
            return iF;
        }
        throw new SerializationException(gVar.b() + " does not contain element with name '" + strI + '\'' + strConcat);
    }

    @Override // p027e3.a, b5.c
    public final short x() {
        o oVar = this.f8778l;
        long jH = oVar.h();
        short s6 = (short) jH;
        if (jH == s6) {
            return s6;
        }
        o.m(oVar, "Failed to parse short for input '" + jH + '\'', 0, null, 6);
        throw null;
    }

    @Override // p027e3.a, b5.c
    public final String y() {
        return this.f8778l.i();
    }

    @Override // p027e3.a, b5.c
    public final float z() {
        o oVar = this.f8778l;
        String strJ = oVar.j();
        try {
            float f6 = Float.parseFloat(strJ);
            d5.i iVar = this.f8776j.f8595a;
            if (!Float.isInfinite(f6) && !Float.isNaN(f6)) {
                return f6;
            }
            h.k(oVar, Float.valueOf(f6));
            throw null;
        } catch (IllegalArgumentException unused) {
            o.m(oVar, "Failed to parse type 'float' for input '" + strJ + '\'', 0, null, 6);
            throw null;
        }
    }
}

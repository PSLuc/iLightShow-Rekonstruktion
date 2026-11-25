package Y1;

import T1.g;
import T1.k;
import T1.l;
import W4.i;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.spotify.protocol.WampClient;
import java.io.IOException;
import java.io.StringReader;
import java.util.concurrent.atomic.AtomicReference;
import p009b2.m;
import p015c2.u;

/* JADX INFO: loaded from: classes.dex */
public final class e extends U1.b {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f5836e0 = g.ALLOW_TRAILING_COMMA.i;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f5837f0 = g.ALLOW_NUMERIC_LEADING_ZEROS.i;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f5838g0 = g.ALLOW_NON_NUMERIC_NUMBERS.i;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f5839h0 = g.ALLOW_MISSING_VALUES.i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f5840i0 = g.ALLOW_SINGLE_QUOTES.i;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f5841j0 = g.ALLOW_UNQUOTED_FIELD_NAMES.i;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f5842k0 = g.ALLOW_COMMENTS.i;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f5843l0 = g.ALLOW_YAML_COMMENTS.i;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int[] f5844m0 = V1.b.f5488e;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public StringReader f5845U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public char[] f5846V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final boolean f5847W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final u f5848X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Z1.c f5849Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final int f5850Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f5851a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f5852b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f5853c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f5854d0;

    public e(I1.b bVar, int i, u uVar, Z1.c cVar, char[] cArr, int i3) {
        super(bVar, i);
        this.f5845U = null;
        this.f5848X = uVar;
        this.f5846V = cArr;
        this.f5326u = 0;
        this.f5327v = i3;
        this.f5330y = 0;
        this.f5328w = 0;
        this.f5849Y = cVar;
        this.f5850Z = cVar.f5988c;
        this.f5847W = true;
    }

    @Override // T1.i
    public final String A0() throws JsonParseException {
        if (this.f5340j == k.FIELD_NAME) {
            this.G = false;
            k kVar = this.f5312D;
            this.f5312D = null;
            this.f5340j = kVar;
            if (kVar == k.VALUE_STRING) {
                if (this.f5851a0) {
                    this.f5851a0 = false;
                    j1();
                }
                return this.f5313E.g();
            }
            if (kVar == k.START_ARRAY) {
                this.f5311C = this.f5311C.i(this.f5309A, this.f5310B);
                return null;
            }
            if (kVar == k.START_OBJECT) {
                this.f5311C = this.f5311C.j(this.f5309A, this.f5310B);
                return null;
            }
        } else if (B0() == k.VALUE_STRING) {
            return i0();
        }
        return null;
    }

    public final k A1(int i) throws JsonParseException {
        int i3 = this.f5326u;
        int i6 = i3 - 1;
        int i7 = this.f5327v;
        char c6 = '0';
        if (i == 48) {
            return y1(i6, false);
        }
        int i8 = 1;
        while (i3 < i7) {
            char c7 = c6;
            int i9 = i3 + 1;
            char c8 = this.f5846V[i3];
            if (c8 < c7 || c8 > '9') {
                if (c8 == '.' || c8 == 'e' || c8 == 'E') {
                    this.f5326u = i9;
                    return u1(c8, i6, i9, i8, false);
                }
                this.f5326u = i3;
                if (this.f5311C.f()) {
                    O1(c8);
                }
                this.f5313E.n(this.f5846V, i6, i3 - i6);
                this.f5322R = false;
                this.f5323S = i8;
                this.J = 0;
                return k.VALUE_NUMBER_INT;
            }
            i8++;
            i3 = i9;
            c6 = c7;
        }
        this.f5326u = i6;
        return y1(i6, false);
    }

    @Override // T1.i
    public final k B0() {
        k kVarZ1;
        k kVar = this.f5340j;
        k kVar2 = k.FIELD_NAME;
        if (kVar == kVar2) {
            return t1();
        }
        this.J = 0;
        if (this.f5851a0) {
            K1();
        }
        int iL1 = L1();
        if (iL1 < 0) {
            close();
            this.f5340j = null;
            return null;
        }
        this.I = null;
        if (iL1 == 93 || iL1 == 125) {
            h1(iL1);
            return this.f5340j;
        }
        b bVar = this.f5311C;
        int i = bVar.f5216b + 1;
        bVar.f5216b = i;
        if (bVar.f5215a != 0 && i > 0) {
            iL1 = H1(iL1);
            if ((this.f5214h & f5836e0) != 0 && (iL1 == 93 || iL1 == 125)) {
                h1(iL1);
                return this.f5340j;
            }
        }
        boolean zE = this.f5311C.e();
        if (zE) {
            int i3 = this.f5326u;
            this.f5852b0 = i3;
            this.f5853c0 = this.f5329x;
            this.f5854d0 = i3 - this.f5330y;
            this.f5311C.k(iL1 == 34 ? w1() : l1(iL1));
            this.f5340j = kVar2;
            iL1 = F1();
        }
        N1();
        if (iL1 == 34) {
            this.f5851a0 = true;
            kVarZ1 = k.VALUE_STRING;
        } else if (iL1 == 43) {
            kVarZ1 = c.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.i.a(this.f5214h) ? z1(false) : m1(iL1);
        } else if (iL1 == 91) {
            if (!zE) {
                this.f5311C = this.f5311C.i(this.f5309A, this.f5310B);
            }
            kVarZ1 = k.START_ARRAY;
        } else if (iL1 == 102) {
            p1();
            kVarZ1 = k.VALUE_FALSE;
        } else if (iL1 == 110) {
            q1();
            kVarZ1 = k.VALUE_NULL;
        } else if (iL1 == 116) {
            s1();
            kVarZ1 = k.VALUE_TRUE;
        } else if (iL1 == 123) {
            if (!zE) {
                this.f5311C = this.f5311C.j(this.f5309A, this.f5310B);
            }
            kVarZ1 = k.START_OBJECT;
        } else {
            if (iL1 == 125) {
                M0(iL1, "expected a value");
                throw null;
            }
            if (iL1 == 45) {
                kVarZ1 = z1(true);
            } else if (iL1 != 46) {
                switch (iL1) {
                    case WampClient.RequestType.CALL /* 48 */:
                    case WampClient.RequestType.CANCEL /* 49 */:
                    case WampClient.RequestType.RESULT /* 50 */:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        kVarZ1 = A1(iL1);
                        break;
                    default:
                        kVarZ1 = m1(iL1);
                        break;
                }
            } else {
                kVarZ1 = v1(false);
            }
        }
        if (zE) {
            this.f5312D = kVarZ1;
            return this.f5340j;
        }
        this.f5340j = kVarZ1;
        return kVarZ1;
    }

    public final int B1(T1.a aVar, p109u2.f fVar, byte[] bArr) throws JsonParseException {
        int length = bArr.length - 3;
        int i = 0;
        int i3 = 0;
        while (true) {
            if (this.f5326u >= this.f5327v) {
                o1();
            }
            char[] cArr = this.f5846V;
            int i6 = this.f5326u;
            this.f5326u = i6 + 1;
            char c6 = cArr[i6];
            if (c6 > ' ') {
                int iC = aVar.c(c6);
                if (iC < 0) {
                    if (c6 == '\"') {
                        break;
                    }
                    iC = V0(aVar, c6, 0);
                    if (iC < 0) {
                        continue;
                    }
                }
                if (i > length) {
                    i3 += i;
                    fVar.write(bArr, 0, i);
                    i = 0;
                }
                if (this.f5326u >= this.f5327v) {
                    o1();
                }
                char[] cArr2 = this.f5846V;
                int i7 = this.f5326u;
                this.f5326u = i7 + 1;
                char c7 = cArr2[i7];
                int iC2 = aVar.c(c7);
                if (iC2 < 0) {
                    iC2 = V0(aVar, c7, 1);
                }
                int i8 = (iC << 6) | iC2;
                if (this.f5326u >= this.f5327v) {
                    o1();
                }
                char[] cArr3 = this.f5846V;
                int i9 = this.f5326u;
                this.f5326u = i9 + 1;
                char c8 = cArr3[i9];
                int iC3 = aVar.c(c8);
                boolean z5 = aVar.f5155n;
                if (iC3 < 0) {
                    if (iC3 != -2) {
                        if (c8 == '\"') {
                            int i10 = i + 1;
                            bArr[i] = (byte) (i8 >> 4);
                            if (!z5) {
                                i = i10;
                                break;
                            }
                            this.f5326u--;
                            K0(aVar.g());
                            throw null;
                        }
                        iC3 = V0(aVar, c8, 2);
                    }
                    if (iC3 == -2) {
                        if (this.f5326u >= this.f5327v) {
                            o1();
                        }
                        char[] cArr4 = this.f5846V;
                        int i11 = this.f5326u;
                        this.f5326u = i11 + 1;
                        char c9 = cArr4[i11];
                        char c10 = aVar.f5153l;
                        if (c9 != c10 && V0(aVar, c9, 3) != -2) {
                            throw U1.b.f1(aVar, c9, 3, "expected padding character '" + c10 + "'");
                        }
                        bArr[i] = (byte) (i8 >> 4);
                        i++;
                    }
                }
                int i12 = (i8 << 6) | iC3;
                if (this.f5326u >= this.f5327v) {
                    o1();
                }
                char[] cArr5 = this.f5846V;
                int i13 = this.f5326u;
                this.f5326u = i13 + 1;
                char c11 = cArr5[i13];
                int iC4 = aVar.c(c11);
                if (iC4 < 0) {
                    if (iC4 != -2) {
                        if (c11 == '\"') {
                            int i14 = i + 1;
                            bArr[i] = (byte) (i12 >> 10);
                            i += 2;
                            bArr[i14] = (byte) (i12 >> 2);
                            if (!z5) {
                                break;
                            }
                            this.f5326u--;
                            K0(aVar.g());
                            throw null;
                        }
                        iC4 = V0(aVar, c11, 3);
                    }
                    if (iC4 == -2) {
                        int i15 = i + 1;
                        bArr[i] = (byte) (i12 >> 10);
                        i += 2;
                        bArr[i15] = (byte) (i12 >> 2);
                    }
                }
                int i16 = (i12 << 6) | iC4;
                bArr[i] = (byte) (i16 >> 16);
                int i17 = i + 2;
                bArr[i + 1] = (byte) (i16 >> 8);
                i += 3;
                bArr[i17] = (byte) i16;
            }
        }
        this.f5851a0 = false;
        if (i <= 0) {
            return i3;
        }
        int i18 = i3 + i;
        fVar.write(bArr, 0, i);
        return i18;
    }

    @Override // T1.i
    public final int C0(T1.a aVar, p109u2.f fVar) throws IOException {
        if (!this.f5851a0 || this.f5340j != k.VALUE_STRING) {
            byte[] bArrD = D(aVar);
            fVar.write(bArrD);
            return bArrD.length;
        }
        I1.b bVar = this.f5324s;
        if (bVar.f1814b != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
        p009b2.a aVar2 = (p009b2.a) bVar.f1817e;
        int i = p009b2.a.f7054c[3];
        if (i <= 0) {
            i = 0;
        }
        byte[] bArr = (byte[]) aVar2.f7056a.getAndSet(3, null);
        if (bArr == null || bArr.length < i) {
            bArr = new byte[i];
        }
        bVar.f1814b = bArr;
        try {
            return B1(aVar, fVar, bArr);
        } finally {
            bVar.b(bArr);
        }
    }

    public final void C1(String str, String str2) throws JsonParseException {
        StringBuilder sb = new StringBuilder(str);
        do {
            if (this.f5326u < this.f5327v || n1()) {
                char c6 = this.f5846V[this.f5326u];
                if (Character.isJavaIdentifierPart(c6)) {
                    this.f5326u++;
                    sb.append(c6);
                }
            }
            throw new JsonParseException(this, "Unrecognized token '" + ((Object) sb) + "': was expecting " + str2);
        } while (sb.length() < 256);
        sb.append("...");
        throw new JsonParseException(this, "Unrecognized token '" + ((Object) sb) + "': was expecting " + str2);
    }

    @Override // T1.i
    public final byte[] D(T1.a aVar) throws JsonParseException {
        byte[] bArr;
        k kVar = this.f5340j;
        if (kVar == k.VALUE_EMBEDDED_OBJECT && (bArr = this.I) != null) {
            return bArr;
        }
        if (kVar != k.VALUE_STRING) {
            K0("Current token (" + this.f5340j + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
            throw null;
        }
        if (this.f5851a0) {
            try {
                this.I = i1(aVar);
                this.f5851a0 = false;
            } catch (IllegalArgumentException e6) {
                throw new JsonParseException(this, "Failed to decode VALUE_STRING as base64 (" + aVar + "): " + e6.getMessage());
            }
        } else if (this.I == null) {
            p009b2.c cVar = this.H;
            if (cVar == null) {
                this.H = new p009b2.c();
            } else {
                cVar.s();
            }
            p009b2.c cVar2 = this.H;
            try {
                aVar.b(i0(), cVar2);
                this.I = cVar2.v();
            } catch (IllegalArgumentException e7) {
                K0(e7.getMessage());
                throw null;
            }
        }
        return this.I;
    }

    public final int D1() throws JsonParseException {
        while (true) {
            if (this.f5326u >= this.f5327v && !n1()) {
                throw new JsonParseException(this, "Unexpected end-of-input within/between " + this.f5311C.h() + " entries");
            }
            char[] cArr = this.f5846V;
            int i = this.f5326u;
            int i3 = i + 1;
            this.f5326u = i3;
            char c6 = cArr[i];
            if (c6 > ' ') {
                if (c6 == '/') {
                    I1();
                } else {
                    if (c6 != '#' || (this.f5214h & f5843l0) == 0) {
                        return c6;
                    }
                    J1();
                }
            } else if (c6 >= ' ') {
                continue;
            } else if (c6 == '\n') {
                this.f5329x++;
                this.f5330y = i3;
            } else if (c6 == '\r') {
                E1();
            } else if (c6 != '\t') {
                O0(c6);
                throw null;
            }
        }
    }

    public final void E1() {
        if (this.f5326u < this.f5327v || n1()) {
            char[] cArr = this.f5846V;
            int i = this.f5326u;
            if (cArr[i] == '\n') {
                this.f5326u = i + 1;
            }
        }
        this.f5329x++;
        this.f5330y = this.f5326u;
    }

    public final int F1() {
        int i = this.f5326u;
        if (i + 4 >= this.f5327v) {
            return G1(false);
        }
        char[] cArr = this.f5846V;
        char c6 = cArr[i];
        if (c6 == ':') {
            int i3 = i + 1;
            this.f5326u = i3;
            char c7 = cArr[i3];
            if (c7 > ' ') {
                if (c7 == '/' || c7 == '#') {
                    return G1(true);
                }
                this.f5326u = i + 2;
                return c7;
            }
            if (c7 == ' ' || c7 == '\t') {
                int i6 = i + 2;
                this.f5326u = i6;
                char c8 = cArr[i6];
                if (c8 > ' ') {
                    if (c8 == '/' || c8 == '#') {
                        return G1(true);
                    }
                    this.f5326u = i + 3;
                    return c8;
                }
            }
            return G1(true);
        }
        if (c6 == ' ' || c6 == '\t') {
            int i7 = i + 1;
            this.f5326u = i7;
            c6 = cArr[i7];
        }
        if (c6 != ':') {
            return G1(false);
        }
        int i8 = this.f5326u;
        int i9 = i8 + 1;
        this.f5326u = i9;
        char c9 = cArr[i9];
        if (c9 > ' ') {
            if (c9 == '/' || c9 == '#') {
                return G1(true);
            }
            this.f5326u = i8 + 2;
            return c9;
        }
        if (c9 == ' ' || c9 == '\t') {
            int i10 = i8 + 2;
            this.f5326u = i10;
            char c10 = cArr[i10];
            if (c10 > ' ') {
                if (c10 == '/' || c10 == '#') {
                    return G1(true);
                }
                this.f5326u = i8 + 3;
                return c10;
            }
        }
        return G1(true);
    }

    public final int G1(boolean z5) throws JsonParseException {
        while (true) {
            if (this.f5326u >= this.f5327v && !n1()) {
                L0(" within/between " + this.f5311C.h() + " entries");
                throw null;
            }
            char[] cArr = this.f5846V;
            int i = this.f5326u;
            int i3 = i + 1;
            this.f5326u = i3;
            char c6 = cArr[i];
            if (c6 > ' ') {
                if (c6 == '/') {
                    I1();
                } else if (c6 == '#' && (this.f5214h & f5843l0) != 0) {
                    J1();
                } else {
                    if (z5) {
                        return c6;
                    }
                    if (c6 != ':') {
                        M0(c6, "was expecting a colon to separate field name and value");
                        throw null;
                    }
                    z5 = true;
                }
            } else if (c6 >= ' ') {
                continue;
            } else if (c6 == '\n') {
                this.f5329x++;
                this.f5330y = i3;
            } else if (c6 == '\r') {
                E1();
            } else if (c6 != '\t') {
                O0(c6);
                throw null;
            }
        }
    }

    public final int H1(int i) throws JsonParseException {
        if (i != 44) {
            M0(i, "was expecting comma to separate " + this.f5311C.h() + " entries");
            throw null;
        }
        while (true) {
            int i3 = this.f5326u;
            if (i3 >= this.f5327v) {
                return D1();
            }
            char[] cArr = this.f5846V;
            int i6 = i3 + 1;
            this.f5326u = i6;
            char c6 = cArr[i3];
            if (c6 > ' ') {
                if (c6 != '/' && c6 != '#') {
                    return c6;
                }
                this.f5326u = i3;
                return D1();
            }
            if (c6 < ' ') {
                if (c6 == '\n') {
                    this.f5329x++;
                    this.f5330y = i6;
                } else if (c6 == '\r') {
                    E1();
                } else if (c6 != '\t') {
                    O0(c6);
                    throw null;
                }
            }
        }
    }

    public final void I1() throws JsonParseException {
        if ((this.f5214h & f5842k0) == 0) {
            M0(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
            throw null;
        }
        if (this.f5326u >= this.f5327v && !n1()) {
            L0(" in a comment");
            throw null;
        }
        char[] cArr = this.f5846V;
        int i = this.f5326u;
        this.f5326u = i + 1;
        char c6 = cArr[i];
        if (c6 == '/') {
            J1();
            return;
        }
        if (c6 != '*') {
            M0(c6, "was expecting either '*' or '/' for a comment");
            throw null;
        }
        while (true) {
            if (this.f5326u >= this.f5327v && !n1()) {
                break;
            }
            char[] cArr2 = this.f5846V;
            int i3 = this.f5326u;
            int i6 = i3 + 1;
            this.f5326u = i6;
            char c7 = cArr2[i3];
            if (c7 <= '*') {
                if (c7 == '*') {
                    if (i6 >= this.f5327v && !n1()) {
                        break;
                    }
                    char[] cArr3 = this.f5846V;
                    int i7 = this.f5326u;
                    if (cArr3[i7] == '/') {
                        this.f5326u = i7 + 1;
                        return;
                    }
                } else if (c7 >= ' ') {
                    continue;
                } else if (c7 == '\n') {
                    this.f5329x++;
                    this.f5330y = i6;
                } else if (c7 == '\r') {
                    E1();
                } else if (c7 != '\t') {
                    O0(c7);
                    throw null;
                }
            }
        }
        L0(" in a comment");
        throw null;
    }

    public final void J1() throws JsonParseException {
        while (true) {
            if (this.f5326u >= this.f5327v && !n1()) {
                return;
            }
            char[] cArr = this.f5846V;
            int i = this.f5326u;
            int i3 = i + 1;
            this.f5326u = i3;
            char c6 = cArr[i];
            if (c6 < ' ') {
                if (c6 == '\n') {
                    this.f5329x++;
                    this.f5330y = i3;
                    return;
                } else if (c6 == '\r') {
                    E1();
                    return;
                } else if (c6 != '\t') {
                    O0(c6);
                    throw null;
                }
            }
        }
    }

    public final void K1() throws JsonParseException {
        this.f5851a0 = false;
        int i = this.f5326u;
        int i3 = this.f5327v;
        char[] cArr = this.f5846V;
        while (true) {
            if (i >= i3) {
                this.f5326u = i;
                if (!n1()) {
                    k kVar = k.NOT_AVAILABLE;
                    L0(": was expecting closing quote for a string value");
                    throw null;
                }
                i = this.f5326u;
                i3 = this.f5327v;
            }
            int i6 = i + 1;
            char c6 = cArr[i];
            if (c6 <= '\\') {
                if (c6 == '\\') {
                    this.f5326u = i6;
                    W0();
                    i = this.f5326u;
                    i3 = this.f5327v;
                } else if (c6 <= '\"') {
                    if (c6 == '\"') {
                        this.f5326u = i6;
                        return;
                    } else if (c6 < ' ') {
                        this.f5326u = i6;
                        c1(c6, "string value");
                    }
                }
            }
            i = i6;
        }
    }

    @Override // T1.i
    public final l L() {
        return this.f5848X;
    }

    public final int L1() throws JsonParseException {
        if (this.f5326u >= this.f5327v && !n1()) {
            H0();
            return -1;
        }
        char[] cArr = this.f5846V;
        int i = this.f5326u;
        int i3 = i + 1;
        this.f5326u = i3;
        char c6 = cArr[i];
        if (c6 > ' ') {
            if (c6 != '/' && c6 != '#') {
                return c6;
            }
            this.f5326u = i;
            return M1();
        }
        if (c6 != ' ') {
            if (c6 == '\n') {
                this.f5329x++;
                this.f5330y = i3;
            } else if (c6 == '\r') {
                E1();
            } else if (c6 != '\t') {
                O0(c6);
                throw null;
            }
        }
        while (true) {
            int i6 = this.f5326u;
            if (i6 >= this.f5327v) {
                return M1();
            }
            char[] cArr2 = this.f5846V;
            int i7 = i6 + 1;
            this.f5326u = i7;
            char c7 = cArr2[i6];
            if (c7 > ' ') {
                if (c7 != '/' && c7 != '#') {
                    return c7;
                }
                this.f5326u = i6;
                return M1();
            }
            if (c7 != ' ') {
                if (c7 == '\n') {
                    this.f5329x++;
                    this.f5330y = i7;
                } else if (c7 == '\r') {
                    E1();
                } else if (c7 != '\t') {
                    O0(c7);
                    throw null;
                }
            }
        }
    }

    @Override // T1.i
    public final T1.f M() {
        int i = (this.f5326u - this.f5330y) + 1;
        return new T1.f(U0(), -1L, ((long) this.f5326u) + this.f5328w, this.f5329x, i);
    }

    public final int M1() throws JsonParseException {
        while (true) {
            if (this.f5326u >= this.f5327v && !n1()) {
                H0();
                return -1;
            }
            char[] cArr = this.f5846V;
            int i = this.f5326u;
            int i3 = i + 1;
            this.f5326u = i3;
            char c6 = cArr[i];
            if (c6 > ' ') {
                if (c6 == '/') {
                    I1();
                } else {
                    if (c6 != '#' || (this.f5214h & f5843l0) == 0) {
                        return c6;
                    }
                    J1();
                }
            } else if (c6 == ' ') {
                continue;
            } else if (c6 == '\n') {
                this.f5329x++;
                this.f5330y = i3;
            } else if (c6 == '\r') {
                E1();
            } else if (c6 != '\t') {
                O0(c6);
                throw null;
            }
        }
    }

    public final void N1() {
        int i = this.f5326u;
        this.f5331z = this.f5328w + ((long) i);
        this.f5309A = this.f5329x;
        this.f5310B = i - this.f5330y;
    }

    public final void O1(int i) throws JsonParseException {
        int i3 = this.f5326u;
        int i6 = i3 + 1;
        this.f5326u = i6;
        if (i != 9) {
            if (i == 10) {
                this.f5329x++;
                this.f5330y = i6;
            } else if (i == 13) {
                this.f5326u = i3;
            } else {
                if (i == 32) {
                    return;
                }
                M0(i, "Expected space separating root-level values");
                throw null;
            }
        }
    }

    @Override // U1.c
    public final String P0() throws JsonParseException {
        k kVar = this.f5340j;
        if (kVar != k.VALUE_STRING) {
            return kVar == k.FIELD_NAME ? Q() : super.P0();
        }
        if (this.f5851a0) {
            this.f5851a0 = false;
            j1();
        }
        return this.f5313E.g();
    }

    public final char P1(String str) throws JsonEOFException {
        if (this.f5326u >= this.f5327v && !n1()) {
            L0(str);
            throw null;
        }
        char[] cArr = this.f5846V;
        int i = this.f5326u;
        this.f5326u = i + 1;
        return cArr[i];
    }

    @Override // U1.b
    public final void T0() throws IOException {
        if (this.f5845U != null) {
            if (this.f5324s.f1813a || g.AUTO_CLOSE_SOURCE.a(this.f5214h)) {
                this.f5845U.close();
            }
            this.f5845U = null;
        }
    }

    @Override // U1.b
    public final char W0() throws JsonParseException {
        if (this.f5326u >= this.f5327v && !n1()) {
            k kVar = k.NOT_AVAILABLE;
            L0(" in character escape sequence");
            throw null;
        }
        char[] cArr = this.f5846V;
        int i = this.f5326u;
        this.f5326u = i + 1;
        char c6 = cArr[i];
        if (c6 != '\"' && c6 != '/' && c6 != '\\') {
            if (c6 == 'b') {
                return '\b';
            }
            if (c6 == 'f') {
                return '\f';
            }
            if (c6 == 'n') {
                return '\n';
            }
            if (c6 == 'r') {
                return '\r';
            }
            if (c6 == 't') {
                return '\t';
            }
            if (c6 == 'u') {
                int i3 = 0;
                for (int i6 = 0; i6 < 4; i6++) {
                    if (this.f5326u >= this.f5327v && !n1()) {
                        k kVar2 = k.NOT_AVAILABLE;
                        L0(" in character escape sequence");
                        throw null;
                    }
                    char[] cArr2 = this.f5846V;
                    int i7 = this.f5326u;
                    this.f5326u = i7 + 1;
                    char c7 = cArr2[i7];
                    int i8 = V1.b.i[c7 & 255];
                    if (i8 < 0) {
                        M0(c7, "expected a hex-digit for character escape sequence");
                        throw null;
                    }
                    i3 = (i3 << 4) | i8;
                }
                return (char) i3;
            }
            if (!g.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER.a(this.f5214h) && (c6 != '\'' || !g.ALLOW_SINGLE_QUOTES.a(this.f5214h))) {
                K0("Unrecognized character escape " + U1.c.G0(c6));
                throw null;
            }
        }
        return c6;
    }

    @Override // U1.b
    public final void a1() {
        char[] cArr;
        Z1.c cVar;
        this.f5313E.m();
        char[] cArr2 = this.f5314F;
        I1.b bVar = this.f5324s;
        p009b2.a aVar = (p009b2.a) bVar.f1817e;
        if (cArr2 != null) {
            this.f5314F = null;
            char[] cArr3 = (char[]) bVar.f1820h;
            if (cArr2 != cArr3 && cArr2.length < cArr3.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            bVar.f1820h = null;
            aVar.f7057b.set(3, cArr2);
        }
        Z1.c cVar2 = this.f5849Y;
        if (!cVar2.f5996l && (cVar = cVar2.f5986a) != null && cVar2.f5990e) {
            Z1.b bVar2 = new Z1.b(cVar2);
            AtomicReference atomicReference = cVar.f5987b;
            Z1.b bVar3 = (Z1.b) atomicReference.get();
            int i = bVar3.f5982a;
            int i3 = bVar2.f5982a;
            if (i3 != i) {
                if (i3 > 12000) {
                    bVar2 = new Z1.b(new String[64], new Z1.a[32]);
                }
                while (!atomicReference.compareAndSet(bVar3, bVar2) && atomicReference.get() == bVar3) {
                }
            }
            cVar2.f5996l = true;
        }
        if (!this.f5847W || (cArr = this.f5846V) == null) {
            return;
        }
        this.f5846V = null;
        char[] cArr4 = (char[]) bVar.f1818f;
        if (cArr != cArr4 && cArr.length < cArr4.length) {
            throw new IllegalArgumentException("Trying to release buffer smaller than original");
        }
        bVar.f1818f = null;
        aVar.f7057b.set(0, cArr);
    }

    @Override // T1.i
    public final i g0() {
        return U1.b.f5308T;
    }

    public final void h1(int i) {
        if (i == 93) {
            N1();
            if (!this.f5311C.d()) {
                b1('}', i);
                throw null;
            }
            b bVar = this.f5311C;
            bVar.f5823g = null;
            this.f5311C = bVar.f5819c;
            this.f5340j = k.END_ARRAY;
        }
        if (i == 125) {
            N1();
            if (!this.f5311C.e()) {
                b1(']', i);
                throw null;
            }
            b bVar2 = this.f5311C;
            bVar2.f5823g = null;
            this.f5311C = bVar2.f5819c;
            this.f5340j = k.END_OBJECT;
        }
    }

    @Override // T1.i
    public final String i0() throws JsonParseException {
        k kVar = this.f5340j;
        k kVar2 = k.VALUE_STRING;
        m mVar = this.f5313E;
        if (kVar == kVar2) {
            if (this.f5851a0) {
                this.f5851a0 = false;
                j1();
            }
            return mVar.g();
        }
        if (kVar == null) {
            return null;
        }
        int i = kVar.f5233k;
        if (i != 5) {
            return (i == 6 || i == 7 || i == 8) ? mVar.g() : kVar.f5231h;
        }
        return this.f5311C.f5822f;
    }

    public final byte[] i1(T1.a aVar) throws JsonParseException {
        p009b2.c cVar = this.H;
        if (cVar == null) {
            this.H = new p009b2.c();
        } else {
            cVar.s();
        }
        p009b2.c cVar2 = this.H;
        while (true) {
            if (this.f5326u >= this.f5327v) {
                o1();
            }
            char[] cArr = this.f5846V;
            int i = this.f5326u;
            this.f5326u = i + 1;
            char c6 = cArr[i];
            if (c6 > ' ') {
                int iC = aVar.c(c6);
                if (iC < 0) {
                    if (c6 == '\"') {
                        return cVar2.v();
                    }
                    iC = V0(aVar, c6, 0);
                    if (iC < 0) {
                        continue;
                    }
                }
                if (this.f5326u >= this.f5327v) {
                    o1();
                }
                char[] cArr2 = this.f5846V;
                int i3 = this.f5326u;
                this.f5326u = i3 + 1;
                char c7 = cArr2[i3];
                int iC2 = aVar.c(c7);
                if (iC2 < 0) {
                    iC2 = V0(aVar, c7, 1);
                }
                int i6 = (iC << 6) | iC2;
                if (this.f5326u >= this.f5327v) {
                    o1();
                }
                char[] cArr3 = this.f5846V;
                int i7 = this.f5326u;
                this.f5326u = i7 + 1;
                char c8 = cArr3[i7];
                int iC3 = aVar.c(c8);
                boolean z5 = aVar.f5155n;
                if (iC3 < 0) {
                    if (iC3 != -2) {
                        if (c8 == '\"') {
                            cVar2.c(i6 >> 4);
                            if (!z5) {
                                return cVar2.v();
                            }
                            this.f5326u--;
                            K0(aVar.g());
                            throw null;
                        }
                        iC3 = V0(aVar, c8, 2);
                    }
                    if (iC3 == -2) {
                        if (this.f5326u >= this.f5327v) {
                            o1();
                        }
                        char[] cArr4 = this.f5846V;
                        int i8 = this.f5326u;
                        this.f5326u = i8 + 1;
                        char c9 = cArr4[i8];
                        char c10 = aVar.f5153l;
                        if (c9 != c10 && V0(aVar, c9, 3) != -2) {
                            throw U1.b.f1(aVar, c9, 3, "expected padding character '" + c10 + "'");
                        }
                        cVar2.c(i6 >> 4);
                    }
                }
                int i9 = (i6 << 6) | iC3;
                if (this.f5326u >= this.f5327v) {
                    o1();
                }
                char[] cArr5 = this.f5846V;
                int i10 = this.f5326u;
                this.f5326u = i10 + 1;
                char c11 = cArr5[i10];
                int iC4 = aVar.c(c11);
                if (iC4 < 0) {
                    if (iC4 != -2) {
                        if (c11 == '\"') {
                            cVar2.o(i9 >> 2);
                            if (!z5) {
                                return cVar2.v();
                            }
                            this.f5326u--;
                            K0(aVar.g());
                            throw null;
                        }
                        iC4 = V0(aVar, c11, 3);
                    }
                    if (iC4 == -2) {
                        cVar2.o(i9 >> 2);
                    }
                }
                cVar2.k((i9 << 6) | iC4);
            }
        }
    }

    @Override // T1.i
    public final char[] j0() throws JsonParseException {
        k kVar = this.f5340j;
        if (kVar == null) {
            return null;
        }
        int i = kVar.f5233k;
        if (i != 5) {
            if (i != 6) {
                if (i != 7 && i != 8) {
                    return kVar.i;
                }
            } else if (this.f5851a0) {
                this.f5851a0 = false;
                j1();
            }
            return this.f5313E.l();
        }
        if (!this.G) {
            String str = this.f5311C.f5822f;
            int length = str.length();
            char[] cArr = this.f5314F;
            if (cArr == null) {
                I1.b bVar = this.f5324s;
                if (((char[]) bVar.f1820h) != null) {
                    throw new IllegalStateException("Trying to call same allocXxx() method second time");
                }
                char[] cArrA = ((p009b2.a) bVar.f1817e).a(3, length);
                bVar.f1820h = cArrA;
                this.f5314F = cArrA;
            } else if (cArr.length < length) {
                this.f5314F = new char[length];
            }
            str.getChars(0, length, this.f5314F, 0);
            this.G = true;
        }
        return this.f5314F;
    }

    public final void j1() throws JsonParseException {
        int i = this.f5326u;
        int i3 = this.f5327v;
        m mVar = this.f5313E;
        int[] iArr = f5844m0;
        if (i < i3) {
            int length = iArr.length;
            do {
                char[] cArr = this.f5846V;
                char c6 = cArr[i];
                if (c6 < length && iArr[c6] != 0) {
                    if (c6 != '\"') {
                        break;
                    }
                    int i6 = this.f5326u;
                    mVar.n(cArr, i6, i - i6);
                    this.f5326u = i + 1;
                    return;
                }
                i++;
            } while (i < i3);
        }
        char[] cArr2 = this.f5846V;
        int i7 = this.f5326u;
        int i8 = i - i7;
        mVar.f7084b = null;
        mVar.f7085c = -1;
        mVar.f7086d = 0;
        mVar.f7091j = null;
        mVar.f7092k = null;
        if (mVar.f7088f) {
            mVar.d();
        } else if (mVar.f7090h == null) {
            mVar.f7090h = mVar.c(i8);
        }
        mVar.f7089g = 0;
        mVar.i = 0;
        mVar.b(cArr2, i7, i8);
        this.f5326u = i;
        char[] cArrK = mVar.k();
        int i9 = mVar.i;
        int length2 = iArr.length;
        while (true) {
            if (this.f5326u >= this.f5327v && !n1()) {
                k kVar = k.NOT_AVAILABLE;
                L0(": was expecting closing quote for a string value");
                throw null;
            }
            char[] cArr3 = this.f5846V;
            int i10 = this.f5326u;
            this.f5326u = i10 + 1;
            char cW0 = cArr3[i10];
            if (cW0 < length2 && iArr[cW0] != 0) {
                if (cW0 == '\"') {
                    mVar.i = i9;
                    return;
                } else if (cW0 == '\\') {
                    cW0 = W0();
                } else if (cW0 < ' ') {
                    c1(cW0, "string value");
                }
            }
            if (i9 >= cArrK.length) {
                cArrK = mVar.j();
                i9 = 0;
            }
            cArrK[i9] = cW0;
            i9++;
        }
    }

    @Override // T1.i
    public final int k0() throws JsonParseException {
        k kVar = this.f5340j;
        if (kVar == null) {
            return 0;
        }
        int i = kVar.f5233k;
        if (i == 5) {
            return this.f5311C.f5822f.length();
        }
        if (i != 6) {
            if (i != 7 && i != 8) {
                return kVar.i.length;
            }
        } else if (this.f5851a0) {
            this.f5851a0 = false;
            j1();
        }
        return this.f5313E.o();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r11v0 ??, r11v1 ??, r11v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final T1.k k1(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r11v0 ??, r11v1 ??, r11v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:414)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:352)
        */

    @Override // T1.i
    public final int l0() throws JsonParseException {
        k kVar = this.f5340j;
        if (kVar != null) {
            int i = kVar.f5233k;
            if (i != 6) {
                if (i == 7 || i == 8) {
                }
            } else if (this.f5851a0) {
                this.f5851a0 = false;
                j1();
            }
            int i3 = this.f5313E.f7085c;
            if (i3 >= 0) {
                return i3;
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec A[SYNTHETIC] */
    public final String l1(int i) throws JsonParseException {
        boolean zIsJavaIdentifierPart;
        int i3;
        int i6 = this.f5850Z;
        Z1.c cVar = this.f5849Y;
        if (i == 39 && (this.f5214h & f5840i0) != 0) {
            int i7 = this.f5326u;
            int i8 = this.f5327v;
            if (i7 < i8) {
                int[] iArr = f5844m0;
                int length = iArr.length;
                do {
                    char[] cArr = this.f5846V;
                    char c6 = cArr[i7];
                    if (c6 != '\'') {
                        if (c6 < length && iArr[c6] != 0) {
                            break;
                        }
                        i6 = (i6 * 33) + c6;
                        i7++;
                    } else {
                        int i9 = this.f5326u;
                        this.f5326u = i7 + 1;
                        return cVar.b(i9, i7 - i9, i6, cArr);
                    }
                } while (i7 < i8);
            }
            int i10 = this.f5326u;
            this.f5326u = i7;
            return x1(i10, i6, 39);
        }
        if ((this.f5214h & f5841j0) == 0) {
            M0(i, "was expecting double-quote to start field name");
            throw null;
        }
        int[] iArr2 = V1.b.f5490g;
        int length2 = iArr2.length;
        if (i < length2) {
            zIsJavaIdentifierPart = iArr2[i] == 0;
        } else {
            zIsJavaIdentifierPart = Character.isJavaIdentifierPart((char) i);
        }
        if (!zIsJavaIdentifierPart) {
            M0(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
            throw null;
        }
        int i11 = this.f5326u;
        int i12 = this.f5327v;
        if (i11 < i12) {
            do {
                char[] cArr2 = this.f5846V;
                char c7 = cArr2[i11];
                if (c7 < length2) {
                    if (iArr2[c7] != 0) {
                        int i13 = this.f5326u - 1;
                        this.f5326u = i11;
                        return cVar.b(i13, i11 - i13, i6, cArr2);
                    }
                } else if (!Character.isJavaIdentifierPart(c7)) {
                    int i14 = this.f5326u - 1;
                    this.f5326u = i11;
                    return cVar.b(i14, i11 - i14, i6, this.f5846V);
                }
                i6 = (i6 * 33) + c7;
                i11++;
            } while (i11 < i12);
        }
        int i15 = this.f5326u - 1;
        this.f5326u = i11;
        m mVar = this.f5313E;
        mVar.n(this.f5846V, i15, i11 - i15);
        char[] cArrK = mVar.k();
        int i16 = mVar.i;
        int length3 = iArr2.length;
        while (true) {
            if (this.f5326u >= this.f5327v && !n1()) {
                break;
            }
            char c8 = this.f5846V[this.f5326u];
            if (c8 < length3) {
                if (iArr2[c8] != 0) {
                    break;
                }
                this.f5326u++;
                i6 = (i6 * 33) + c8;
                i3 = i16 + 1;
                cArrK[i16] = c8;
                if (i3 >= cArrK.length) {
                    cArrK = mVar.j();
                    i16 = 0;
                } else {
                    i16 = i3;
                }
            } else {
                if (!Character.isJavaIdentifierPart(c8)) {
                    break;
                }
                this.f5326u++;
                i6 = (i6 * 33) + c8;
                i3 = i16 + 1;
                cArrK[i16] = c8;
                if (i3 >= cArrK.length) {
                    cArrK = mVar.j();
                    i16 = 0;
                } else {
                    i16 = i3;
                }
            }
        }
        mVar.i = i16;
        char[] cArrL = mVar.l();
        int i17 = mVar.f7085c;
        return cVar.b(i17 >= 0 ? i17 : 0, mVar.o(), i6, cArrL);
    }

    @Override // U1.c, T1.i
    public final T1.f m0() {
        if (this.f5340j != k.FIELD_NAME) {
            return new T1.f(U0(), -1L, this.f5331z - 1, this.f5309A, this.f5310B);
        }
        return new T1.f(U0(), -1L, (this.f5852b0 - 1) + this.f5328w, this.f5853c0, this.f5854d0);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    public final k m1(int i) throws JsonParseException {
        if (i != 39) {
            int i3 = f5838g0;
            if (i == 73) {
                r1(1, "Infinity");
                if ((this.f5214h & i3) != 0) {
                    return g1("Infinity", Double.POSITIVE_INFINITY);
                }
                K0("Non-standard token 'Infinity': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
                throw null;
            }
            if (i == 78) {
                r1(1, "NaN");
                if ((this.f5214h & i3) != 0) {
                    return g1("NaN", Double.NaN);
                }
                K0("Non-standard token 'NaN': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
                throw null;
            }
            if (i != 93) {
                if (i == 43) {
                    if (this.f5326u >= this.f5327v && !n1()) {
                        L0(k.VALUE_NUMBER_INT != k.VALUE_STRING ? " in a Number value" : " in a String value");
                        throw null;
                    }
                    char[] cArr = this.f5846V;
                    int i6 = this.f5326u;
                    this.f5326u = i6 + 1;
                    return k1(cArr[i6], false, true);
                }
                if (i == 44) {
                    if (!this.f5311C.f() && (this.f5214h & f5839h0) != 0) {
                        this.f5326u--;
                        return k.VALUE_NULL;
                    }
                }
            } else if (this.f5311C.d()) {
                if (!this.f5311C.f()) {
                    this.f5326u--;
                    return k.VALUE_NULL;
                }
            }
        } else if ((this.f5214h & f5840i0) != 0) {
            m mVar = this.f5313E;
            char[] cArrH = mVar.h();
            int i7 = mVar.i;
            while (true) {
                if (this.f5326u >= this.f5327v && !n1()) {
                    k kVar = k.NOT_AVAILABLE;
                    L0(": was expecting closing quote for a string value");
                    throw null;
                }
                char[] cArr2 = this.f5846V;
                int i8 = this.f5326u;
                this.f5326u = i8 + 1;
                char cW0 = cArr2[i8];
                if (cW0 <= '\\') {
                    if (cW0 == '\\') {
                        cW0 = W0();
                    } else if (cW0 <= '\'') {
                        if (cW0 == '\'') {
                            mVar.i = i7;
                            return k.VALUE_STRING;
                        }
                        if (cW0 < ' ') {
                            c1(cW0, "string value");
                        }
                    }
                }
                if (i7 >= cArrH.length) {
                    cArrH = mVar.j();
                    i7 = 0;
                }
                cArrH[i7] = cW0;
                i7++;
            }
        }
        if (!Character.isJavaIdentifierStart(i)) {
            M0(i, "expected a valid value ".concat(d1()));
            throw null;
        }
        C1("" + ((char) i), d1());
        throw null;
    }

    public final boolean n1() throws IOException {
        StringReader stringReader = this.f5845U;
        if (stringReader != null) {
            char[] cArr = this.f5846V;
            int i = stringReader.read(cArr, 0, cArr.length);
            if (i > 0) {
                int i3 = this.f5327v;
                long j4 = i3;
                this.f5328w += j4;
                this.f5330y -= i3;
                this.f5852b0 -= j4;
                this.f5326u = 0;
                this.f5327v = i;
                return true;
            }
            T0();
            if (i == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this.f5327v);
            }
        }
        return false;
    }

    public final void o1() throws JsonEOFException {
        if (n1()) {
            return;
        }
        L0(" in " + this.f5340j);
        throw null;
    }

    public final void p1() throws JsonParseException {
        int i;
        char c6;
        int i3 = this.f5326u;
        if (i3 + 4 < this.f5327v) {
            char[] cArr = this.f5846V;
            if (cArr[i3] == 'a' && cArr[i3 + 1] == 'l' && cArr[i3 + 2] == 's' && cArr[i3 + 3] == 'e' && ((c6 = cArr[(i = i3 + 4)]) < '0' || c6 == ']' || c6 == '}')) {
                this.f5326u = i;
                return;
            }
        }
        r1(1, "false");
    }

    @Override // U1.c, T1.i
    public final String q0() throws JsonParseException {
        k kVar = this.f5340j;
        if (kVar != k.VALUE_STRING) {
            return kVar == k.FIELD_NAME ? Q() : super.P0();
        }
        if (this.f5851a0) {
            this.f5851a0 = false;
            j1();
        }
        return this.f5313E.g();
    }

    public final void q1() throws JsonParseException {
        int i;
        char c6;
        int i3 = this.f5326u;
        if (i3 + 3 < this.f5327v) {
            char[] cArr = this.f5846V;
            if (cArr[i3] == 'u' && cArr[i3 + 1] == 'l' && cArr[i3 + 2] == 'l' && ((c6 = cArr[(i = i3 + 3)]) < '0' || c6 == ']' || c6 == '}')) {
                this.f5326u = i;
                return;
            }
        }
        r1(1, "null");
    }

    public final void r1(int i, String str) throws JsonParseException {
        int i3;
        char c6;
        int length = str.length();
        if (this.f5326u + length < this.f5327v) {
            while (this.f5846V[this.f5326u] == str.charAt(i)) {
                int i6 = this.f5326u + 1;
                this.f5326u = i6;
                i++;
                if (i >= length) {
                    char c7 = this.f5846V[i6];
                    if (c7 < '0' || c7 == ']' || c7 == '}' || !Character.isJavaIdentifierPart(c7)) {
                        return;
                    }
                    C1(str.substring(0, i), d1());
                    throw null;
                }
            }
            C1(str.substring(0, i), d1());
            throw null;
        }
        int length2 = str.length();
        do {
            if ((this.f5326u >= this.f5327v && !n1()) || this.f5846V[this.f5326u] != str.charAt(i)) {
                C1(str.substring(0, i), d1());
                throw null;
            }
            i3 = this.f5326u + 1;
            this.f5326u = i3;
            i++;
        } while (i < length2);
        if ((i3 < this.f5327v || n1()) && (c6 = this.f5846V[this.f5326u]) >= '0' && c6 != ']' && c6 != '}' && Character.isJavaIdentifierPart(c6)) {
            C1(str.substring(0, i), d1());
            throw null;
        }
    }

    public final void s1() throws JsonParseException {
        int i;
        char c6;
        int i3 = this.f5326u;
        if (i3 + 3 < this.f5327v) {
            char[] cArr = this.f5846V;
            if (cArr[i3] == 'r' && cArr[i3 + 1] == 'u' && cArr[i3 + 2] == 'e' && ((c6 = cArr[(i = i3 + 3)]) < '0' || c6 == ']' || c6 == '}')) {
                this.f5326u = i;
                return;
            }
        }
        r1(1, "true");
    }

    public final k t1() {
        this.G = false;
        k kVar = this.f5312D;
        this.f5312D = null;
        if (kVar == k.START_ARRAY) {
            this.f5311C = this.f5311C.i(this.f5309A, this.f5310B);
        } else if (kVar == k.START_OBJECT) {
            this.f5311C = this.f5311C.j(this.f5309A, this.f5310B);
        }
        this.f5340j = kVar;
        return kVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r9v0 ??, r9v1 ??, r9v13 ??, r9v9 ??, r9v5 ??, r9v4 ??, r9v3 ??, r9v8 ??, r9v7 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final T1.k u1(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r9v0 ??, r9v1 ??, r9v13 ??, r9v9 ??, r9v5 ??, r9v4 ??, r9v3 ??, r9v8 ??, r9v7 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:414)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:352)
        */

    public final k v1(boolean z5) {
        if (!c.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.i.a(this.f5214h)) {
            return m1(46);
        }
        int i = this.f5326u;
        int i3 = i - 1;
        if (z5) {
            i3 = i - 2;
        }
        return u1(46, i3, i, 0, z5);
    }

    public final String w1() {
        int i = this.f5326u;
        int i3 = this.f5850Z;
        while (i < this.f5327v) {
            char[] cArr = this.f5846V;
            char c6 = cArr[i];
            int[] iArr = f5844m0;
            if (c6 < iArr.length && iArr[c6] != 0) {
                if (c6 != '\"') {
                    break;
                }
                int i6 = this.f5326u;
                this.f5326u = i + 1;
                return this.f5849Y.b(i6, i - i6, i3, cArr);
            }
            i3 = (i3 * 33) + c6;
            i++;
        }
        int i7 = this.f5326u;
        this.f5326u = i;
        return x1(i7, i3, 34);
    }

    public final String x1(int i, int i3, int i6) throws JsonParseException {
        char[] cArr = this.f5846V;
        int i7 = this.f5326u - i;
        m mVar = this.f5313E;
        mVar.n(cArr, i, i7);
        char[] cArrK = mVar.k();
        int i8 = mVar.i;
        while (true) {
            if (this.f5326u >= this.f5327v && !n1()) {
                k kVar = k.NOT_AVAILABLE;
                L0(" in field name");
                throw null;
            }
            char[] cArr2 = this.f5846V;
            int i9 = this.f5326u;
            this.f5326u = i9 + 1;
            char cW0 = cArr2[i9];
            if (cW0 <= '\\') {
                if (cW0 == '\\') {
                    cW0 = W0();
                } else if (cW0 <= i6) {
                    if (cW0 == i6) {
                        mVar.i = i8;
                        char[] cArrL = mVar.l();
                        int i10 = mVar.f7085c;
                        return this.f5849Y.b(i10 >= 0 ? i10 : 0, mVar.o(), i3, cArrL);
                    }
                    if (cW0 < ' ') {
                        c1(cW0, "name");
                    }
                }
            }
            i3 = (i3 * 33) + cW0;
            int i11 = i8 + 1;
            cArrK[i8] = cW0;
            if (i11 >= cArrK.length) {
                cArrK = mVar.j();
                i8 = 0;
            } else {
                i8 = i11;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a A[EDGE_INSN: B:21:0x004a->B:47:0x008f BREAK  A[LOOP:0: B:34:0x006c->B:146:?]] */
    public final k y1(int i, boolean z5) throws Throwable {
        int i3;
        char cP1;
        boolean z6;
        boolean z7;
        Throwable th;
        int i6;
        char cP2;
        char cP3;
        char c6;
        this.f5326u = z5 ? i + 1 : i;
        m mVar = this.f5313E;
        char[] cArrH = mVar.h();
        int i7 = 0;
        if (z5) {
            cArrH[0] = '-';
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i8 = this.f5326u;
        if (i8 < this.f5327v) {
            char[] cArr = this.f5846V;
            this.f5326u = i8 + 1;
            cP1 = cArr[i8];
        } else {
            k kVar = k.NOT_AVAILABLE;
            cP1 = P1("No digit following minus sign");
        }
        Throwable th2 = null;
        if (cP1 == '0') {
            int i9 = this.f5326u;
            int i10 = this.f5327v;
            if ((i9 < i10 && ((c6 = this.f5846V[i9]) < '0' || c6 > '9')) || (i9 >= i10 && !n1())) {
                cP1 = '0';
                break;
            }
            char[] cArr2 = this.f5846V;
            int i11 = this.f5326u;
            cP1 = cArr2[i11];
            if (cP1 < '0' || cP1 > '9') {
                cP1 = '0';
                break;
            }
            if ((this.f5214h & f5837f0) == 0) {
                K0("Invalid numeric value: Leading zeroes not allowed");
                throw null;
            }
            this.f5326u = i11 + 1;
            if (cP1 == '0') {
                do {
                    if (this.f5326u >= this.f5327v && !n1()) {
                        break;
                    }
                    char[] cArr3 = this.f5846V;
                    int i12 = this.f5326u;
                    cP1 = cArr3[i12];
                    if (cP1 < '0' || cP1 > '9') {
                        cP1 = '0';
                        break;
                    }
                    this.f5326u = i12 + 1;
                } while (cP1 == '0');
            }
        }
        int i13 = 0;
        while (true) {
            if (cP1 >= '0' && cP1 <= '9') {
                i13++;
                if (i3 >= cArrH.length) {
                    cArrH = mVar.j();
                    i3 = 0;
                }
                int i14 = i3 + 1;
                cArrH[i3] = cP1;
                if (this.f5326u >= this.f5327v && !n1()) {
                    cP1 = 0;
                    i3 = i14;
                    z6 = true;
                    break;
                }
                char[] cArr4 = this.f5846V;
                int i15 = this.f5326u;
                this.f5326u = i15 + 1;
                cP1 = cArr4[i15];
                i3 = i14;
            } else {
                z6 = false;
                break;
            }
        }
        if (i13 == 0 && !c.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.i.a(this.f5214h)) {
            return k1(cP1, z5, false);
        }
        int i16 = -1;
        if (cP1 == '.') {
            if (i3 >= cArrH.length) {
                cArrH = mVar.j();
                i3 = 0;
            }
            cArrH[i3] = cP1;
            z7 = true;
            i3++;
            i6 = 0;
            while (true) {
                th = th2;
                if (this.f5326u >= this.f5327v && !n1()) {
                    z6 = true;
                    break;
                }
                char[] cArr5 = this.f5846V;
                int i17 = this.f5326u;
                this.f5326u = i17 + 1;
                cP1 = cArr5[i17];
                if (cP1 < '0' || cP1 > '9') {
                    break;
                }
                i6++;
                if (i3 >= cArrH.length) {
                    cArrH = mVar.j();
                    i3 = 0;
                }
                cArrH[i3] = cP1;
                th2 = th;
                i3++;
            }
            if (i6 == 0 && !c.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.i.a(this.f5214h)) {
                N0(cP1, "Decimal point not followed by a digit");
                throw th;
            }
        } else {
            z7 = true;
            th = null;
            i6 = -1;
        }
        if (cP1 == 'e' || cP1 == 'E') {
            if (i3 >= cArrH.length) {
                cArrH = mVar.j();
                i3 = 0;
            }
            int i18 = i3 + 1;
            cArrH[i3] = cP1;
            int i19 = this.f5326u;
            if (i19 < this.f5327v) {
                char[] cArr6 = this.f5846V;
                this.f5326u = i19 + 1;
                cP2 = cArr6[i19];
            } else {
                k kVar2 = k.NOT_AVAILABLE;
                cP2 = P1("expected a digit for number exponent");
            }
            if (cP2 == '-' || cP2 == '+') {
                if (i18 >= cArrH.length) {
                    cArrH = mVar.j();
                    i18 = 0;
                }
                int i20 = i18 + 1;
                cArrH[i18] = cP2;
                int i21 = this.f5326u;
                if (i21 < this.f5327v) {
                    char[] cArr7 = this.f5846V;
                    this.f5326u = i21 + 1;
                    cP3 = cArr7[i21];
                } else {
                    k kVar3 = k.NOT_AVAILABLE;
                    cP3 = P1("expected a digit for number exponent");
                }
                cP1 = cP3;
                i18 = i20;
            } else {
                cP1 = cP2;
            }
            while (true) {
                if (cP1 <= '9' && cP1 >= '0') {
                    i7++;
                    if (i18 >= cArrH.length) {
                        cArrH = mVar.j();
                        i18 = 0;
                    }
                    i3 = i18 + 1;
                    cArrH[i18] = cP1;
                    if (this.f5326u >= this.f5327v && !n1()) {
                        z6 = z7;
                        break;
                    }
                    char[] cArr8 = this.f5846V;
                    int i22 = this.f5326u;
                    this.f5326u = i22 + 1;
                    cP1 = cArr8[i22];
                    i18 = i3;
                } else {
                    i3 = i18;
                    break;
                }
            }
            i16 = i7;
            if (i16 == 0) {
                N0(cP1, "Exponent indicator not followed by a digit");
                throw th;
            }
        }
        if (!z6) {
            this.f5326u--;
            if (this.f5311C.f()) {
                O1(cP1);
            }
        }
        mVar.i = i3;
        if (i6 >= 0 || i16 >= 0) {
            this.f5322R = z5;
            this.f5323S = i13;
            this.J = 0;
            return k.VALUE_NUMBER_FLOAT;
        }
        this.f5322R = z5;
        this.f5323S = i13;
        this.J = 0;
        return k.VALUE_NUMBER_INT;
    }

    @Override // T1.i
    public final String z0() throws JsonParseException {
        k kVarZ1;
        this.J = 0;
        k kVar = this.f5340j;
        k kVar2 = k.FIELD_NAME;
        if (kVar == kVar2) {
            t1();
            return null;
        }
        if (this.f5851a0) {
            K1();
        }
        int iL1 = L1();
        if (iL1 < 0) {
            close();
            this.f5340j = null;
            return null;
        }
        this.I = null;
        if (iL1 == 93 || iL1 == 125) {
            h1(iL1);
            return null;
        }
        b bVar = this.f5311C;
        int i = bVar.f5216b + 1;
        bVar.f5216b = i;
        if (bVar.f5215a != 0 && i > 0) {
            iL1 = H1(iL1);
            if ((this.f5214h & f5836e0) != 0 && (iL1 == 93 || iL1 == 125)) {
                h1(iL1);
                return null;
            }
        }
        if (this.f5311C.e()) {
            int i3 = this.f5326u;
            this.f5852b0 = i3;
            this.f5853c0 = this.f5329x;
            this.f5854d0 = i3 - this.f5330y;
            String strW1 = iL1 == 34 ? w1() : l1(iL1);
            this.f5311C.k(strW1);
            this.f5340j = kVar2;
            int iF1 = F1();
            N1();
            if (iF1 == 34) {
                this.f5851a0 = true;
                this.f5312D = k.VALUE_STRING;
                return strW1;
            }
            if (iF1 == 43) {
                kVarZ1 = c.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.i.a(this.f5214h) ? z1(false) : m1(iF1);
            } else if (iF1 == 91) {
                kVarZ1 = k.START_ARRAY;
            } else if (iF1 == 102) {
                p1();
                kVarZ1 = k.VALUE_FALSE;
            } else if (iF1 == 110) {
                q1();
                kVarZ1 = k.VALUE_NULL;
            } else if (iF1 == 116) {
                s1();
                kVarZ1 = k.VALUE_TRUE;
            } else if (iF1 == 123) {
                kVarZ1 = k.START_OBJECT;
            } else if (iF1 == 45) {
                kVarZ1 = z1(true);
            } else if (iF1 != 46) {
                switch (iF1) {
                    case WampClient.RequestType.CALL /* 48 */:
                    case WampClient.RequestType.CANCEL /* 49 */:
                    case WampClient.RequestType.RESULT /* 50 */:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        kVarZ1 = A1(iF1);
                        break;
                    default:
                        kVarZ1 = m1(iF1);
                        break;
                }
            } else {
                kVarZ1 = v1(false);
            }
            this.f5312D = kVarZ1;
            return strW1;
        }
        N1();
        if (iL1 == 34) {
            this.f5851a0 = true;
            this.f5340j = k.VALUE_STRING;
            return null;
        }
        if (iL1 == 91) {
            this.f5311C = this.f5311C.i(this.f5309A, this.f5310B);
            this.f5340j = k.START_ARRAY;
            return null;
        }
        if (iL1 == 102) {
            r1(1, "false");
            this.f5340j = k.VALUE_FALSE;
            return null;
        }
        if (iL1 == 110) {
            r1(1, "null");
            this.f5340j = k.VALUE_NULL;
            return null;
        }
        if (iL1 == 116) {
            r1(1, "true");
            this.f5340j = k.VALUE_TRUE;
            return null;
        }
        if (iL1 == 123) {
            this.f5311C = this.f5311C.j(this.f5309A, this.f5310B);
            this.f5340j = k.START_OBJECT;
            return null;
        }
        switch (iL1) {
            case 44:
                if (!this.f5311C.f() && (this.f5214h & f5839h0) != 0) {
                    this.f5326u--;
                    this.f5340j = k.VALUE_NULL;
                    return null;
                }
                break;
            case 45:
                this.f5340j = z1(true);
                return null;
            case 46:
                this.f5340j = v1(false);
                return null;
            default:
                switch (iL1) {
                    case WampClient.RequestType.CALL /* 48 */:
                    case WampClient.RequestType.CANCEL /* 49 */:
                    case WampClient.RequestType.RESULT /* 50 */:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        this.f5340j = A1(iL1);
                        return null;
                }
        }
        this.f5340j = m1(iL1);
        return null;
    }

    public final k z1(boolean z5) throws JsonParseException {
        int i = this.f5326u;
        int i3 = z5 ? i - 1 : i;
        int i6 = this.f5327v;
        if (i >= i6) {
            return y1(i3, z5);
        }
        int i7 = i + 1;
        char c6 = this.f5846V[i];
        int i8 = 1;
        char c7 = '.';
        if (c6 > '9' || c6 < '0') {
            this.f5326u = i7;
            return c6 == '.' ? v1(z5) : k1(c6, z5, true);
        }
        if (c6 == '0') {
            return y1(i3, z5);
        }
        while (i7 < i6) {
            char c8 = c7;
            int i9 = i7 + 1;
            char c9 = this.f5846V[i7];
            if (c9 < '0' || c9 > '9') {
                if (c9 == c8 || c9 == 'e' || c9 == 'E') {
                    this.f5326u = i9;
                    return u1(c9, i3, i9, i8, z5);
                }
                this.f5326u = i7;
                if (this.f5311C.f()) {
                    O1(c9);
                }
                this.f5313E.n(this.f5846V, i3, i7 - i3);
                this.f5322R = z5;
                this.f5323S = i8;
                this.J = 0;
                return k.VALUE_NUMBER_INT;
            }
            i8++;
            i7 = i9;
            c7 = c8;
        }
        return y1(i3, z5);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [char[], java.io.Serializable] */
    public e(I1.b bVar, int i, StringReader stringReader, u uVar, Z1.c cVar) {
        super(bVar, i);
        this.f5845U = stringReader;
        if (((char[]) bVar.f1818f) == null) {
            ?? A5 = ((p009b2.a) bVar.f1817e).a(0, 0);
            bVar.f1818f = A5;
            this.f5846V = A5;
            this.f5326u = 0;
            this.f5327v = 0;
            this.f5848X = uVar;
            this.f5849Y = cVar;
            this.f5850Z = cVar.f5988c;
            this.f5847W = true;
            return;
        }
        throw new IllegalStateException("Trying to call same allocXxx() method second time");
    }
}

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.ValueInstantiationException;
import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.IllformedLocaleException;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0522s extends AbstractC0525v {
    public final int i;

    public C0522s(int i, Class cls) {
        super(cls);
        this.i = i;
    }

    @Override // p015c2.j
    public final Object c(p015c2.f fVar) {
        return getEmptyValue(fVar);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f1 A[Catch: IllformedLocaleException -> 0x016d, TryCatch #1 {IllformedLocaleException -> 0x016d, blocks: (B:63:0x00e1, B:64:0x00e5, B:66:0x00f1, B:68:0x00f7, B:70:0x0111, B:72:0x0135, B:74:0x0156, B:75:0x0168), top: B:101:0x00e1 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f7 A[Catch: IllformedLocaleException -> 0x016d, TryCatch #1 {IllformedLocaleException -> 0x016d, blocks: (B:63:0x00e1, B:64:0x00e5, B:66:0x00f1, B:68:0x00f7, B:70:0x0111, B:72:0x0135, B:74:0x0156, B:75:0x0168), top: B:101:0x00e1 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0111 A[Catch: IllformedLocaleException -> 0x016d, TryCatch #1 {IllformedLocaleException -> 0x016d, blocks: (B:63:0x00e1, B:64:0x00e5, B:66:0x00f1, B:68:0x00f7, B:70:0x0111, B:72:0x0135, B:74:0x0156, B:75:0x0168), top: B:101:0x00e1 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0135 A[Catch: IllformedLocaleException -> 0x016d, TryCatch #1 {IllformedLocaleException -> 0x016d, blocks: (B:63:0x00e1, B:64:0x00e5, B:66:0x00f1, B:68:0x00f7, B:70:0x0111, B:72:0x0135, B:74:0x0156, B:75:0x0168), top: B:101:0x00e1 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0156 A[Catch: IllformedLocaleException -> 0x016d, TryCatch #1 {IllformedLocaleException -> 0x016d, blocks: (B:63:0x00e1, B:64:0x00e5, B:66:0x00f1, B:68:0x00f7, B:70:0x0111, B:72:0x0135, B:74:0x0156, B:75:0x0168), top: B:101:0x00e1 }] */
    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC0525v
    public final Object d(p015c2.f fVar, String str) throws InvalidFormatException, ValueInstantiationException {
        String strSubstring;
        int iIndexOf;
        String strSubstring2;
        String strSubstring3;
        int iIndexOf2;
        int length;
        Locale.Builder script;
        int i;
        int i3 = -1;
        switch (this.i) {
            case 1:
                return new File(str);
            case 2:
                return new URL(str);
            case 3:
                return URI.create(str);
            case 4:
                try {
                    fVar.A().getClass();
                    return p104t2.n.k(str);
                } catch (Exception e6) {
                    fVar.n0(this._valueClass, p109u2.i.q(e6));
                    throw null;
                }
            case 5:
                p104t2.p pVar = fVar.A().i;
                pVar.getClass();
                p104t2.o oVar = new p104t2.o(str.trim());
                p015c2.h hVarB = pVar.b(oVar);
                if (oVar.hasMoreTokens()) {
                    throw p104t2.p.a(oVar, "Unexpected tokens after complete type");
                }
                return hVarB;
            case 6:
                return Currency.getInstance(str);
            case 7:
                return Pattern.compile(str);
            case 8:
                int length2 = str.length();
                int i6 = 0;
                while (true) {
                    if (i6 < length2) {
                        char cCharAt = str.charAt(i6);
                        if (cCharAt != '_' && cCharAt != '-') {
                            i6++;
                        }
                    } else {
                        i6 = -1;
                    }
                }
                if (i6 < 0) {
                    return new Locale(str);
                }
                String strSubstring4 = str.substring(0, i6);
                String strSubstring5 = str.substring(i6 + 1);
                int length3 = strSubstring5.length();
                for (int i7 = 0; i7 < length3; i7++) {
                    char cCharAt2 = strSubstring5.charAt(i7);
                    if (cCharAt2 == '_' || cCharAt2 == '-') {
                        i3 = i7;
                        if (i3 < 0) {
                            return new Locale(strSubstring4, strSubstring5);
                        }
                        strSubstring = strSubstring5.substring(0, i3);
                        iIndexOf = strSubstring5.indexOf("_#");
                        if (iIndexOf < 0) {
                            return new Locale(strSubstring4, strSubstring, strSubstring5.substring(i3 + 1));
                        }
                        strSubstring2 = "";
                        if (iIndexOf > 0 && iIndexOf > i3) {
                            try {
                                strSubstring2 = strSubstring5.substring(i3 + 1, iIndexOf);
                            } catch (IllformedLocaleException unused) {
                                return new Locale(strSubstring4, strSubstring, "");
                            }
                        }
                        strSubstring3 = strSubstring5.substring(iIndexOf + 2);
                        iIndexOf2 = strSubstring3.indexOf(95);
                        if (iIndexOf2 < 0) {
                            int iIndexOf3 = strSubstring3.indexOf(45);
                            return iIndexOf3 < 0 ? new Locale.Builder().setLanguage(strSubstring4).setRegion(strSubstring).setVariant(strSubstring2).setScript(strSubstring3).build() : new Locale.Builder().setLanguage(strSubstring4).setRegion(strSubstring).setVariant(strSubstring2).setExtension(strSubstring3.charAt(0), strSubstring3.substring(iIndexOf3 + 1)).build();
                        }
                        length = strSubstring3.length();
                        script = new Locale.Builder().setLanguage(strSubstring4).setRegion(strSubstring).setVariant(strSubstring2).setScript(strSubstring3.substring(0, iIndexOf2));
                        i = iIndexOf2 + 1;
                        if (i < length) {
                            script = script.setExtension(strSubstring3.charAt(i), strSubstring3.substring(Math.min(length, iIndexOf2 + 3)));
                        }
                        return script.build();
                    }
                }
                if (i3 < 0) {
                    return new Locale(strSubstring4, strSubstring5);
                }
                strSubstring = strSubstring5.substring(0, i3);
                iIndexOf = strSubstring5.indexOf("_#");
                if (iIndexOf < 0) {
                    return new Locale(strSubstring4, strSubstring, strSubstring5.substring(i3 + 1));
                }
                strSubstring2 = "";
                if (iIndexOf > 0) {
                    strSubstring2 = strSubstring5.substring(i3 + 1, iIndexOf);
                }
                strSubstring3 = strSubstring5.substring(iIndexOf + 2);
                iIndexOf2 = strSubstring3.indexOf(95);
                if (iIndexOf2 < 0) {
                    int iIndexOf4 = strSubstring3.indexOf(45);
                    if (iIndexOf4 < 0) {
                    }
                }
                length = strSubstring3.length();
                script = new Locale.Builder().setLanguage(strSubstring4).setRegion(strSubstring).setVariant(strSubstring2).setScript(strSubstring3.substring(0, iIndexOf2));
                i = iIndexOf2 + 1;
                if (i < length) {
                    script = script.setExtension(strSubstring3.charAt(i), strSubstring3.substring(Math.min(length, iIndexOf2 + 3)));
                }
                return script.build();
            case 9:
                return Charset.forName(str);
            case 10:
                return TimeZone.getTimeZone(str);
            case 11:
                return InetAddress.getByName(str);
            case 12:
                if (str.startsWith("[")) {
                    int iLastIndexOf = str.lastIndexOf(93);
                    if (iLastIndexOf == -1) {
                        throw new InvalidFormatException(fVar.f7252o, "Bracketed IPv6 address must contain closing bracket", str);
                    }
                    int iIndexOf5 = str.indexOf(58, iLastIndexOf);
                    return new InetSocketAddress(str.substring(0, iLastIndexOf + 1), iIndexOf5 > -1 ? Integer.parseInt(str.substring(iIndexOf5 + 1)) : 0);
                }
                int iIndexOf6 = str.indexOf(58);
                if (iIndexOf6 >= 0) {
                    int i8 = iIndexOf6 + 1;
                    if (str.indexOf(58, i8) < 0) {
                        return new InetSocketAddress(str.substring(0, iIndexOf6), Integer.parseInt(str.substring(i8)));
                    }
                }
                return new InetSocketAddress(str, 0);
            default:
                p009b2.o.a();
                throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC0525v
    public final boolean g() {
        return this.i != 7;
    }

    @Override // p015c2.j
    public final Object getEmptyValue(p015c2.f fVar) {
        int i = this.i;
        if (i != 3) {
            return i != 8 ? super.getEmptyValue(fVar) : Locale.ROOT;
        }
        return URI.create("");
    }
}

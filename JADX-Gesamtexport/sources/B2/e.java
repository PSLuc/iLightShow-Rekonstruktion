package B2;

import B.C0043w;
import S1.V;
import S1.h0;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import p126x2.InterfaceC1118a;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC1118a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p084p4.m f498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public D4.a f499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E4.l f500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Charset f501d;

    /* JADX WARN: Multi-variable type inference failed */
    public e(D4.a aVar, D4.a aVar2, Charset charset) {
        E4.k.f("charset", charset);
        this.f499b = aVar;
        this.f500c = (E4.l) aVar2;
        this.f501d = charset;
        this.f498a = G4.a.z(new C0043w(5, this));
    }

    @Override // p126x2.InterfaceC1118a
    public final boolean a() {
        return this.f499b == c.i;
    }

    @Override // p126x2.InterfaceC1118a
    public final long b(OutputStream outputStream) throws IllegalAccessException, IOException, InvocationTargetException {
        InputStream inputStream = (InputStream) this.f499b.invoke();
        BufferedInputStream bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192);
        try {
            long jU = V.u(bufferedInputStream, outputStream);
            bufferedInputStream.close();
            outputStream.flush();
            this.f499b = c.i;
            return jU;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                h0.i(bufferedInputStream, th);
                throw th2;
            }
        }
    }

    @Override // p126x2.InterfaceC1118a
    public final Long c() {
        return (Long) this.f498a.getValue();
    }

    @Override // p126x2.InterfaceC1118a
    public final String d(String str) throws IOException {
        Charset charsetForName;
        Object obj;
        String str2;
        int i = 0;
        if (isEmpty()) {
            return "(empty)";
        }
        if (a()) {
            return "(consumed)";
        }
        if (str == null) {
            str = URLConnection.guessContentTypeFromStream((InputStream) this.f499b.invoke());
        }
        M4.j jVar = p126x2.b.f14071a;
        if (str == null || str.length() == 0) {
            str = "(unknown)";
        }
        M4.j jVar2 = p126x2.b.f14071a;
        jVar2.getClass();
        if (!jVar2.f3545h.matcher(str).find()) {
            Long lC = c();
            long jLongValue = lC != null ? lC.longValue() : -1L;
            if (jLongValue == 0) {
                return "(empty)";
            }
            return "(" + (jLongValue < 0 ? "unknown number of bytes" : jLongValue + " bytes") + " of " + str + ')';
        }
        Pattern patternCompile = Pattern.compile("^CHARSET=.*");
        E4.k.e("compile(...)", patternCompile);
        String upperCase = str.toUpperCase();
        E4.k.e("(this as java.lang.String).toUpperCase()", upperCase);
        List<String> listU0 = M4.l.u0(upperCase, new char[]{';'});
        ArrayList arrayList = new ArrayList(p089q4.n.P(listU0, 10));
        for (String str3 : listU0) {
            if (str3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            arrayList.add(M4.l.B0(str3).toString());
        }
        try {
            int size = arrayList.size();
            do {
                if (i >= size) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i);
                i++;
                str2 = (String) obj;
                E4.k.f("input", str2);
            } while (!patternCompile.matcher(str2).matches());
            String str4 = (String) obj;
            charsetForName = Charset.forName(str4 != null ? M4.l.y0(str4, "CHARSET=") : "");
            E4.k.e("Charset.forName(paramete…gAfter(\"CHARSET=\") ?: \"\")", charsetForName);
        } catch (IllegalCharsetNameException unused) {
            charsetForName = M4.a.f3521b;
        }
        return new String(e(), charsetForName);
    }

    public final byte[] e() throws IllegalAccessException, IOException, InvocationTargetException {
        if (isEmpty()) {
            return new byte[0];
        }
        Long lC = c();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(lC != null ? (int) lC.longValue() : 32);
        try {
            b(byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f499b = new d(byteArray, 0);
            this.f500c = new d(byteArray, 1);
            E4.k.e("ByteArrayOutputStream(le….toLong() }\n            }", byteArray);
            return byteArray;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                h0.i(byteArrayOutputStream, th);
                throw th2;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return E4.k.a(this.f499b, eVar.f499b) && E4.k.a(this.f500c, eVar.f500c) && E4.k.a(this.f501d, eVar.f501d);
    }

    public final int hashCode() {
        D4.a aVar = this.f499b;
        int iHashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        E4.l lVar = this.f500c;
        int iHashCode2 = (iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31;
        Charset charset = this.f501d;
        return iHashCode2 + (charset != null ? charset.hashCode() : 0);
    }

    @Override // p126x2.InterfaceC1118a
    public final boolean isEmpty() {
        if (this.f499b == c.f495j) {
            return true;
        }
        Long lC = c();
        return lC != null && lC.longValue() == 0;
    }

    public final String toString() {
        return "DefaultBody(openStream=" + this.f499b + ", calculateLength=" + this.f500c + ", charset=" + this.f501d + ")";
    }

    public /* synthetic */ e() {
        this(c.f495j, null, M4.a.f3520a);
    }
}

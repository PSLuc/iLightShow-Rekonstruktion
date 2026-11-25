package okhttp3.internal.publicsuffix;

import B.AbstractC0013g0;
import B4.b;
import E4.g;
import E4.k;
import L4.d;
import L4.e;
import L4.j;
import M4.l;
import S1.h0;
import com.fasterxml.jackson.databind.deser.std.d0;
import h5.A;
import h5.AbstractC0724b;
import h5.C0727e;
import h5.G;
import h5.P;
import h5.v;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import org.slf4j.Marker;
import p006b.a;
import p089q4.u;

/* JADX INFO: loaded from: classes.dex */
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    public static final Companion Companion = new Companion(null);
    private static final byte[] WILDCARD_LABEL = {42};
    private static final List<String> PREVAILING_RULE = d0.v(Marker.ANY_MARKER);
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i) {
            int i3;
            int iAnd;
            boolean z5;
            int iAnd2;
            int length = bArr.length;
            int i6 = 0;
            while (i6 < length) {
                int i7 = (i6 + length) / 2;
                while (i7 > -1 && bArr[i7] != 10) {
                    i7--;
                }
                int i8 = i7 + 1;
                int i9 = 1;
                while (true) {
                    i3 = i8 + i9;
                    if (bArr[i3] == 10) {
                        break;
                    }
                    i9++;
                }
                int i10 = i3 - i8;
                int i11 = i;
                boolean z6 = false;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (z6) {
                        iAnd = 46;
                        z5 = false;
                    } else {
                        boolean z7 = z6;
                        iAnd = Util.and(bArr2[i11][i12], 255);
                        z5 = z7;
                    }
                    iAnd2 = iAnd - Util.and(bArr[i8 + i13], 255);
                    if (iAnd2 != 0) {
                        break;
                    }
                    i13++;
                    i12++;
                    if (i13 == i10) {
                        break;
                    }
                    if (bArr2[i11].length != i12) {
                        z6 = z5;
                    } else {
                        if (i11 == bArr2.length - 1) {
                            break;
                        }
                        i11++;
                        z6 = true;
                        i12 = -1;
                    }
                }
                if (iAnd2 >= 0) {
                    if (iAnd2 <= 0) {
                        int i14 = i10 - i13;
                        int length2 = bArr2[i11].length - i12;
                        int length3 = bArr2.length;
                        for (int i15 = i11 + 1; i15 < length3; i15++) {
                            length2 += bArr2[i15].length;
                        }
                        if (length2 >= i14) {
                            if (length2 <= i14) {
                                Charset charset = StandardCharsets.UTF_8;
                                k.e("UTF_8", charset);
                                return new String(bArr, i8, i10, charset);
                            }
                        }
                    }
                    i6 = i3 + 1;
                }
                length = i7;
            }
            return null;
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }

        private Companion() {
        }
    }

    private final List<String> findMatchingRule(List<String> list) {
        String strBinarySearch;
        String strBinarySearch2;
        String strBinarySearch3;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            readTheListUninterruptibly();
        }
        if (this.publicSuffixListBytes == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            Charset charset = StandardCharsets.UTF_8;
            k.e("UTF_8", charset);
            byte[] bytes = str.getBytes(charset);
            k.e("this as java.lang.String).getBytes(charset)", bytes);
            bArr[i] = bytes;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                strBinarySearch = null;
                break;
            }
            int i6 = i3 + 1;
            Companion companion = Companion;
            byte[] bArr2 = this.publicSuffixListBytes;
            if (bArr2 == null) {
                k.m("publicSuffixListBytes");
                throw null;
            }
            strBinarySearch = companion.binarySearch(bArr2, bArr, i3);
            if (strBinarySearch != null) {
                break;
            }
            i3 = i6;
        }
        if (size <= 1) {
            strBinarySearch2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                strBinarySearch2 = null;
                break;
            }
            int i8 = i7 + 1;
            bArr3[i7] = WILDCARD_LABEL;
            Companion companion2 = Companion;
            byte[] bArr4 = this.publicSuffixListBytes;
            if (bArr4 == null) {
                k.m("publicSuffixListBytes");
                throw null;
            }
            strBinarySearch2 = companion2.binarySearch(bArr4, bArr3, i7);
            if (strBinarySearch2 != null) {
                break;
            }
            i7 = i8;
        }
        if (strBinarySearch2 == null) {
            strBinarySearch3 = null;
            break;
        }
        int i9 = size - 1;
        int i10 = 0;
        while (true) {
            if (i10 >= i9) {
                strBinarySearch3 = null;
                break;
            }
            int i11 = i10 + 1;
            Companion companion3 = Companion;
            byte[] bArr5 = this.publicSuffixExceptionListBytes;
            if (bArr5 == null) {
                k.m("publicSuffixExceptionListBytes");
                throw null;
            }
            strBinarySearch3 = companion3.binarySearch(bArr5, bArr, i10);
            if (strBinarySearch3 != null) {
                break;
            }
            i10 = i11;
        }
        if (strBinarySearch3 != null) {
            return l.u0(k.l("!", strBinarySearch3), new char[]{'.'});
        }
        if (strBinarySearch == null && strBinarySearch2 == null) {
            return PREVAILING_RULE;
        }
        List<String> listU0 = strBinarySearch == null ? null : l.u0(strBinarySearch, new char[]{'.'});
        List<String> list2 = u.f11237h;
        if (listU0 == null) {
            listU0 = list2;
        }
        List<String> listU1 = strBinarySearch2 != null ? l.u0(strBinarySearch2, new char[]{'.'}) : null;
        if (listU1 != null) {
            list2 = listU1;
        }
        return listU0.size() > list2.size() ? listU0 : list2;
    }

    private final void readTheList() throws IllegalAccessException, IOException, InvocationTargetException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream == null) {
            return;
        }
        Logger logger = A.f9308a;
        G gC = AbstractC0724b.c(new v(new C0727e(resourceAsStream, new P())));
        try {
            long jP = gC.p();
            gC.N(jP);
            byte[] bArrG = gC.i.G(jP);
            long jP2 = gC.p();
            gC.N(jP2);
            byte[] bArrG2 = gC.i.G(jP2);
            gC.close();
            synchronized (this) {
                this.publicSuffixListBytes = bArrG;
                this.publicSuffixExceptionListBytes = bArrG2;
            }
            this.readCompleteLatch.countDown();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                h0.i(gC, th);
                throw th2;
            }
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z5 = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z5 = true;
                } catch (IOException e6) {
                    Platform.Companion.get().log("Failed to read public suffix list", 5, e6);
                    if (!z5) {
                        return;
                    }
                }
            } catch (Throwable th) {
                if (z5) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (!z5) {
            return;
        }
        Thread.currentThread().interrupt();
    }

    private final List<String> splitDomain(String str) {
        List<String> listU0 = l.u0(str, new char[]{'.'});
        if (!k.a(p089q4.l.f0(listU0), "")) {
            return listU0;
        }
        int size = listU0.size() - 1;
        return p089q4.l.o0(size >= 0 ? size : 0, listU0);
    }

    public final String getEffectiveTldPlusOne(String str) {
        int size;
        int size2;
        k.f("domain", str);
        String unicode = IDN.toUnicode(str);
        k.e("unicodeDomain", unicode);
        List<String> listSplitDomain = splitDomain(unicode);
        List<String> listFindMatchingRule = findMatchingRule(listSplitDomain);
        int i = 0;
        if (listSplitDomain.size() == listFindMatchingRule.size() && listFindMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (listFindMatchingRule.get(0).charAt(0) == '!') {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size();
        } else {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size() + 1;
        }
        int i3 = size - size2;
        List<String> listSplitDomain2 = splitDomain(str);
        k.f("<this>", listSplitDomain2);
        j bVar = new b(4, listSplitDomain2);
        if (i3 < 0) {
            throw new IllegalArgumentException(AbstractC0013g0.f(i3, "Requested element count ", " is less than zero.").toString());
        }
        if (i3 != 0) {
            bVar = bVar instanceof e ? ((e) bVar).a(i3) : new d(bVar, i3);
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        for (Object obj : bVar) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ".");
            }
            a.l(sb, obj, null);
        }
        sb.append((CharSequence) "");
        String string = sb.toString();
        k.e("toString(...)", string);
        return string;
    }

    public final void setListBytes(byte[] bArr, byte[] bArr2) {
        k.f("publicSuffixListBytes", bArr);
        k.f("publicSuffixExceptionListBytes", bArr2);
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}

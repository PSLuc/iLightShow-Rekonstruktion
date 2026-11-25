package okhttp3.internal;

import D4.a;
import D4.c;
import E4.k;
import E4.z;
import J2.b;
import J4.d;
import M4.j;
import M4.l;
import S1.h0;
import Z2.f;
import com.spotify.android.appremote.api.ContentApi;
import h5.AbstractC0724b;
import h5.B;
import h5.C0732j;
import h5.C0735m;
import h5.InterfaceC0733k;
import h5.InterfaceC0734l;
import h5.K;
import h5.M;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;
import p089q4.m;
import p089q4.n;
import p089q4.u;
import p089q4.v;
import p089q4.y;

/* JADX INFO: loaded from: classes.dex */
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final Headers EMPTY_HEADERS = Headers.Companion.of(new String[0]);
    public static final RequestBody EMPTY_REQUEST;
    public static final ResponseBody EMPTY_RESPONSE;
    private static final B UNICODE_BOMS;
    public static final TimeZone UTC;
    private static final j VERIFY_AS_IP_ADDRESS;
    public static final boolean assertionsEnabled;
    public static final String okHttpName;
    public static final String userAgent = "okhttp/4.11.0";

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        C0735m c0735m = C0735m.f9352k;
        UNICODE_BOMS = AbstractC0724b.g(f.h("efbbbf"), f.h("feff"), f.h("fffe"), f.h("0000ffff"), f.h("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        k.c(timeZone);
        UTC = timeZone;
        VERIFY_AS_IP_ADDRESS = new j("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        okHttpName = l.q0(l.p0(OkHttpClient.class.getName(), "okhttp3."), "Client");
    }

    public static final <E> void addIfAbsent(List<E> list, E e6) {
        k.f("<this>", list);
        if (list.contains(e6)) {
            return;
        }
        list.add(e6);
    }

    public static final int and(byte b6, int i) {
        return b6 & i;
    }

    public static final EventListener.Factory asFactory(EventListener eventListener) {
        k.f("<this>", eventListener);
        return new b(10, eventListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: asFactory$lambda-8, reason: not valid java name */
    public static final EventListener m145asFactory$lambda8(EventListener eventListener, Call call) {
        k.f("$this_asFactory", eventListener);
        k.f("it", call);
        return eventListener;
    }

    public static final void assertThreadDoesntHoldLock(Object obj) {
        k.f("<this>", obj);
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + obj);
        }
    }

    public static final void assertThreadHoldsLock(Object obj) {
        k.f("<this>", obj);
        if (!assertionsEnabled || Thread.holdsLock(obj)) {
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + obj);
    }

    public static final boolean canParseAsIpAddress(String str) {
        k.f("<this>", str);
        j jVar = VERIFY_AS_IP_ADDRESS;
        jVar.getClass();
        return jVar.f3545h.matcher(str).matches();
    }

    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl httpUrl2) {
        k.f("<this>", httpUrl);
        k.f("other", httpUrl2);
        return k.a(httpUrl.host(), httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && k.a(httpUrl.scheme(), httpUrl2.scheme());
    }

    public static final int checkDuration(String str, long j4, TimeUnit timeUnit) {
        k.f("name", str);
        if (j4 < 0) {
            throw new IllegalStateException(k.l(str, " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j4);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(k.l(str, " too large.").toString());
        }
        if (millis != 0 || j4 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(k.l(str, " too small.").toString());
    }

    public static final void checkOffsetAndCount(long j4, long j6, long j7) {
        if ((j6 | j7) < 0 || j6 > j4 || j4 - j6 < j7) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(Closeable closeable) {
        k.f("<this>", closeable);
        try {
            closeable.close();
        } catch (RuntimeException e6) {
            throw e6;
        } catch (Exception unused) {
        }
    }

    public static final String[] concat(String[] strArr, String str) {
        k.f("<this>", strArr);
        k.f("value", str);
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        k.e("copyOf(this, newSize)", objArrCopyOf);
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[strArr2.length - 1] = str;
        return strArr2;
    }

    public static final int delimiterOffset(String str, String str2, int i, int i3) {
        k.f("<this>", str);
        k.f("delimiters", str2);
        while (i < i3) {
            int i6 = i + 1;
            if (l.Z(str2, str.charAt(i))) {
                return i;
            }
            i = i6;
        }
        return i3;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i, int i3, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i = 0;
        }
        if ((i6 & 4) != 0) {
            i3 = str.length();
        }
        return delimiterOffset(str, str2, i, i3);
    }

    public static final boolean discard(M m6, int i, TimeUnit timeUnit) {
        k.f("<this>", m6);
        k.f("timeUnit", timeUnit);
        try {
            return skipAll(m6, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final <T> List<T> filterList(Iterable<? extends T> iterable, c cVar) {
        k.f("<this>", iterable);
        k.f("predicate", cVar);
        ArrayList arrayList = u.f11237h;
        for (T t6 : iterable) {
            if (((Boolean) cVar.invoke(t6)).booleanValue()) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                z.b(arrayList).add(t6);
            }
        }
        return arrayList;
    }

    public static final String format(String str, Object... objArr) {
        k.f("format", str);
        k.f("args", objArr);
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        k.f("<this>", strArr);
        k.f("comparator", comparator);
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                i++;
                E4.b bVarJ = k.j(strArr2);
                while (bVarJ.hasNext()) {
                    if (comparator.compare(str, (String) bVarJ.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(Response response) {
        k.f("<this>", response);
        String str = response.headers().get("Content-Length");
        if (str == null) {
            return -1L;
        }
        return toLongOrDefault(str, -1L);
    }

    public static final void ignoreIoExceptions(a aVar) {
        k.f("block", aVar);
        try {
            aVar.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(T... tArr) {
        k.f("elements", tArr);
        Object[] objArr = (Object[]) tArr.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(m.M(Arrays.copyOf(objArr, objArr.length)));
        k.e("unmodifiableList(listOf(*elements.clone()))", listUnmodifiableList);
        return listUnmodifiableList;
    }

    public static final int indexOf(String[] strArr, String str, Comparator<String> comparator) {
        k.f("<this>", strArr);
        k.f("value", str);
        k.f("comparator", comparator);
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(String str) {
        k.f("<this>", str);
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (k.h(cCharAt, 31) <= 0 || k.h(cCharAt, 127) >= 0) {
                return i;
            }
            i = i3;
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(String str, int i, int i3) {
        k.f("<this>", str);
        while (i < i3) {
            int i6 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i = i6;
        }
        return i3;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i, int i3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = 0;
        }
        if ((i6 & 2) != 0) {
            i3 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i, i3);
    }

    public static final int indexOfLastNonAsciiWhitespace(String str, int i, int i3) {
        k.f("<this>", str);
        int i6 = i3 - 1;
        if (i <= i6) {
            while (true) {
                int i7 = i6 - 1;
                char cCharAt = str.charAt(i6);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i6 + 1;
                }
                if (i6 != i) {
                    i6 = i7;
                }
            }
        }
        return i;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i, int i3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = 0;
        }
        if ((i6 & 2) != 0) {
            i3 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i, i3);
    }

    public static final int indexOfNonWhitespace(String str, int i) {
        k.f("<this>", str);
        int length = str.length();
        while (i < length) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i;
            }
            i = i3;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        return indexOfNonWhitespace(str, i);
    }

    public static final String[] intersect(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        k.f("<this>", strArr);
        k.f("other", strArr2);
        k.f("comparator", comparator);
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            i++;
            int length2 = strArr2.length;
            int i3 = 0;
            while (i3 < length2) {
                String str2 = strArr2[i3];
                i3++;
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final boolean isCivilized(FileSystem fileSystem, File file) throws IllegalAccessException, IOException, InvocationTargetException {
        k.f("<this>", fileSystem);
        k.f("file", file);
        K kSink = fileSystem.sink(file);
        try {
            fileSystem.delete(file);
            h0.i(kSink, null);
            return true;
        } catch (IOException unused) {
            h0.i(kSink, null);
            fileSystem.delete(file);
            return false;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                h0.i(kSink, th);
                throw th2;
            }
        }
    }

    public static final boolean isHealthy(Socket socket, InterfaceC0734l interfaceC0734l) {
        k.f("<this>", socket);
        k.f("source", interfaceC0734l);
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !interfaceC0734l.z();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean isSensitiveHeader(String str) {
        k.f("name", str);
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final void notify(Object obj) {
        k.f("<this>", obj);
        obj.notify();
    }

    public static final void notifyAll(Object obj) {
        k.f("<this>", obj);
        obj.notifyAll();
    }

    public static final int parseHexDigit(char c6) {
        if ('0' <= c6 && c6 < ':') {
            return c6 - '0';
        }
        if ('a' <= c6 && c6 < 'g') {
            return c6 - 'W';
        }
        if ('A' > c6 || c6 >= 'G') {
            return -1;
        }
        return c6 - '7';
    }

    public static final String peerName(Socket socket) {
        k.f("<this>", socket);
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        k.e("address.hostName", hostName);
        return hostName;
    }

    public static final Charset readBomAsCharset(InterfaceC0734l interfaceC0734l, Charset charset) {
        k.f("<this>", interfaceC0734l);
        k.f(ContentApi.ContentType.DEFAULT, charset);
        int iK = interfaceC0734l.K(UNICODE_BOMS);
        if (iK == -1) {
            return charset;
        }
        if (iK == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            k.e("UTF_8", charset2);
            return charset2;
        }
        if (iK == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            k.e("UTF_16BE", charset3);
            return charset3;
        }
        if (iK == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            k.e("UTF_16LE", charset4);
            return charset4;
        }
        if (iK == 3) {
            Charset charset5 = M4.a.f3520a;
            Charset charset6 = M4.a.f3523d;
            if (charset6 != null) {
                return charset6;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            k.e("forName(...)", charsetForName);
            M4.a.f3523d = charsetForName;
            return charsetForName;
        }
        if (iK != 4) {
            throw new AssertionError();
        }
        Charset charset7 = M4.a.f3520a;
        Charset charset8 = M4.a.f3522c;
        if (charset8 != null) {
            return charset8;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        k.e("forName(...)", charsetForName2);
        M4.a.f3522c = charsetForName2;
        return charsetForName2;
    }

    public static final <T> T readFieldOrNull(Object obj, Class<T> cls, String str) throws IllegalAccessException {
        Object fieldOrNull;
        k.f("instance", obj);
        k.f("fieldType", cls);
        k.f("fieldName", str);
        Class<?> superclass = obj.getClass();
        while (true) {
            T tCast = null;
            if (superclass.equals(Object.class)) {
                if (str.equals("delegate") || (fieldOrNull = readFieldOrNull(obj, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) readFieldOrNull(fieldOrNull, cls, str);
            }
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (cls.isInstance(obj2)) {
                    tCast = cls.cast(obj2);
                }
                return tCast;
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
                k.e("c.superclass", superclass);
            }
        }
    }

    public static final int readMedium(InterfaceC0734l interfaceC0734l) {
        k.f("<this>", interfaceC0734l);
        return and(interfaceC0734l.W(), 255) | (and(interfaceC0734l.W(), 255) << 16) | (and(interfaceC0734l.W(), 255) << 8);
    }

    public static final boolean skipAll(M m6, int i, TimeUnit timeUnit) {
        k.f("<this>", m6);
        k.f("timeUnit", timeUnit);
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = m6.timeout().hasDeadline() ? m6.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        m6.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i)) + jNanoTime);
        try {
            C0732j c0732j = new C0732j();
            while (m6.read(c0732j, 8192L) != -1) {
                c0732j.b();
            }
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                m6.timeout().clearDeadline();
                return true;
            }
            m6.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                m6.timeout().clearDeadline();
                return false;
            }
            m6.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                m6.timeout().clearDeadline();
            } else {
                m6.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
    }

    public static final ThreadFactory threadFactory(final String str, final boolean z5) {
        k.f("name", str);
        return new ThreadFactory() { // from class: g5.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return Util.m146threadFactory$lambda1(str, z5, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: threadFactory$lambda-1, reason: not valid java name */
    public static final Thread m146threadFactory$lambda1(String str, boolean z5, Runnable runnable) {
        k.f("$name", str);
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z5);
        return thread;
    }

    public static final void threadName(String str, a aVar) {
        k.f("name", str);
        k.f("block", aVar);
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(str);
        try {
            aVar.invoke();
        } finally {
            threadCurrentThread.setName(name);
        }
    }

    public static final List<Header> toHeaderList(Headers headers) {
        k.f("<this>", headers);
        d dVarD0 = p081p0.c.D0(0, headers.size());
        ArrayList arrayList = new ArrayList(n.P(dVarD0, 10));
        Iterator it = dVarD0.iterator();
        while (it.hasNext()) {
            int iA = ((y) it).a();
            arrayList.add(new Header(headers.name(iA), headers.value(iA)));
        }
        return arrayList;
    }

    public static final Headers toHeaders(List<Header> list) {
        k.f("<this>", list);
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.addLenient$okhttp(header.component1().q(), header.component2().q());
        }
        return builder.build();
    }

    public static final String toHexString(long j4) {
        String hexString = Long.toHexString(j4);
        k.e("toHexString(this)", hexString);
        return hexString;
    }

    public static final String toHostHeader(HttpUrl httpUrl, boolean z5) {
        String strHost;
        k.f("<this>", httpUrl);
        if (l.a0(httpUrl.host(), ":")) {
            strHost = "[" + httpUrl.host() + ']';
        } else {
            strHost = httpUrl.host();
        }
        if (!z5 && httpUrl.port() == HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return strHost;
        }
        return strHost + ':' + httpUrl.port();
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z5 = false;
        }
        return toHostHeader(httpUrl, z5);
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        k.f("<this>", list);
        List<T> listUnmodifiableList = Collections.unmodifiableList(p089q4.l.u0(list));
        k.e("unmodifiableList(toMutableList())", listUnmodifiableList);
        return listUnmodifiableList;
    }

    public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> map) {
        k.f("<this>", map);
        if (map.isEmpty()) {
            return v.f11238h;
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        k.e("{\n    Collections.unmodi…(LinkedHashMap(this))\n  }", mapUnmodifiableMap);
        return mapUnmodifiableMap;
    }

    public static final long toLongOrDefault(String str, long j4) {
        k.f("<this>", str);
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j4;
        }
    }

    public static final int toNonNegativeInt(String str, int i) {
        Long lValueOf;
        if (str == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
            }
        }
        if (lValueOf == null) {
            return i;
        }
        long jLongValue = lValueOf.longValue();
        if (jLongValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }

    public static final String trimSubstring(String str, int i, int i3) {
        k.f("<this>", str);
        int iIndexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i, i3);
        String strSubstring = str.substring(iIndexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, iIndexOfFirstNonAsciiWhitespace, i3));
        k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i, int i3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = 0;
        }
        if ((i6 & 2) != 0) {
            i3 = str.length();
        }
        return trimSubstring(str, i, i3);
    }

    public static final void wait(Object obj) throws InterruptedException {
        k.f("<this>", obj);
        obj.wait();
    }

    public static final Throwable withSuppressed(Exception exc, List<? extends Exception> list) throws IllegalAccessException, InvocationTargetException {
        k.f("<this>", exc);
        k.f("suppressed", list);
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator<? extends Exception> it = list.iterator();
        while (it.hasNext()) {
            p081p0.c.D(exc, it.next());
        }
        return exc;
    }

    public static final void writeMedium(InterfaceC0733k interfaceC0733k, int i) {
        k.f("<this>", interfaceC0733k);
        interfaceC0733k.A((i >>> 16) & 255);
        interfaceC0733k.A((i >>> 8) & 255);
        interfaceC0733k.A(i & 255);
    }

    public static final int and(short s6, int i) {
        return s6 & i;
    }

    public static final int delimiterOffset(String str, char c6, int i, int i3) {
        k.f("<this>", str);
        while (i < i3) {
            int i6 = i + 1;
            if (str.charAt(i) == c6) {
                return i;
            }
            i = i6;
        }
        return i3;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c6, int i, int i3, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i = 0;
        }
        if ((i6 & 4) != 0) {
            i3 = str.length();
        }
        return delimiterOffset(str, c6, i, i3);
    }

    public static final String toHexString(int i) {
        String hexString = Integer.toHexString(i);
        k.e("toHexString(this)", hexString);
        return hexString;
    }

    public static final long and(int i, long j4) {
        return ((long) i) & j4;
    }

    public static final void closeQuietly(Socket socket) {
        k.f("<this>", socket);
        try {
            socket.close();
        } catch (AssertionError e6) {
            throw e6;
        } catch (RuntimeException e7) {
            if (!k.a(e7.getMessage(), "bio == null")) {
                throw e7;
            }
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(ServerSocket serverSocket) {
        k.f("<this>", serverSocket);
        try {
            serverSocket.close();
        } catch (RuntimeException e6) {
            throw e6;
        } catch (Exception unused) {
        }
    }

    public static final int skipAll(C0732j c0732j, byte b6) throws EOFException {
        k.f("<this>", c0732j);
        int i = 0;
        while (!c0732j.z() && c0732j.o(0L) == b6) {
            i++;
            c0732j.W();
        }
        return i;
    }
}

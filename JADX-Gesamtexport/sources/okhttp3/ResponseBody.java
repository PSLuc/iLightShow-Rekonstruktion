package okhttp3;

import E4.g;
import E4.k;
import M4.a;
import S1.h0;
import h5.C0732j;
import h5.C0735m;
import h5.InterfaceC0734l;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import okhttp3.internal.Util;
import p084p4.c;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class ResponseBody implements Closeable, AutoCloseable {
    public static final Companion Companion = new Companion(null);
    private Reader reader;

    public static final class BomAwareReader extends Reader implements AutoCloseable {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final InterfaceC0734l source;

        public BomAwareReader(InterfaceC0734l interfaceC0734l, Charset charset) {
            k.f("source", interfaceC0734l);
            k.f("charset", charset);
            this.source = interfaceC0734l;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            x xVar;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader == null) {
                xVar = null;
            } else {
                reader.close();
                xVar = x.f10867a;
            }
            if (xVar == null) {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i3) throws IOException {
            k.f("cbuf", cArr);
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.delegate;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.source.U(), Util.readBomAsCharset(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cArr, i, i3);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final ResponseBody create(String str, MediaType mediaType) {
            k.f("<this>", str);
            Charset charset = a.f3520a;
            if (mediaType != null) {
                Charset charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charsetCharset$default == null) {
                    mediaType = MediaType.Companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetCharset$default;
                }
            }
            C0732j c0732j = new C0732j();
            k.f("charset", charset);
            c0732j.f0(str, 0, str.length(), charset);
            return create(c0732j, mediaType, c0732j.i);
        }

        private Companion() {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, C0735m c0735m, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(c0735m, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, InterfaceC0734l interfaceC0734l, MediaType mediaType, long j4, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            if ((i & 2) != 0) {
                j4 = -1;
            }
            return companion.create(interfaceC0734l, mediaType, j4);
        }

        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            k.f("<this>", bArr);
            C0732j c0732j = new C0732j();
            c0732j.X(bArr);
            return create(c0732j, mediaType, bArr.length);
        }

        public final ResponseBody create(C0735m c0735m, MediaType mediaType) {
            k.f("<this>", c0735m);
            C0732j c0732j = new C0732j();
            c0732j.V(c0735m);
            return create(c0732j, mediaType, c0735m.d());
        }

        public final ResponseBody create(final InterfaceC0734l interfaceC0734l, final MediaType mediaType, final long j4) {
            k.f("<this>", interfaceC0734l);
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                public long contentLength() {
                    return j4;
                }

                @Override // okhttp3.ResponseBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.ResponseBody
                public InterfaceC0734l source() {
                    return interfaceC0734l;
                }
            };
        }

        @c
        public final ResponseBody create(MediaType mediaType, String str) {
            k.f("content", str);
            return create(str, mediaType);
        }

        @c
        public final ResponseBody create(MediaType mediaType, byte[] bArr) {
            k.f("content", bArr);
            return create(bArr, mediaType);
        }

        @c
        public final ResponseBody create(MediaType mediaType, C0735m c0735m) {
            k.f("content", c0735m);
            return create(c0735m, mediaType);
        }

        @c
        public final ResponseBody create(MediaType mediaType, long j4, InterfaceC0734l interfaceC0734l) {
            k.f("content", interfaceC0734l);
            return create(interfaceC0734l, mediaType, j4);
        }
    }

    private final Charset charset() {
        MediaType mediaTypeContentType = contentType();
        Charset charset = mediaTypeContentType == null ? null : mediaTypeContentType.charset(a.f3520a);
        return charset == null ? a.f3520a : charset;
    }

    private final <T> T consumeSource(D4.c cVar, D4.c cVar2) throws IllegalAccessException, IOException, InvocationTargetException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(k.l("Cannot buffer entire body for content length: ", Long.valueOf(jContentLength)));
        }
        InterfaceC0734l interfaceC0734lSource = source();
        try {
            T t6 = (T) cVar.invoke(interfaceC0734lSource);
            h0.i(interfaceC0734lSource, null);
            int iIntValue = ((Number) cVar2.invoke(t6)).intValue();
            if (jContentLength == -1 || jContentLength == iIntValue) {
                return t6;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iIntValue + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                h0.i(interfaceC0734lSource, th);
                throw th2;
            }
        }
    }

    public static final ResponseBody create(InterfaceC0734l interfaceC0734l, MediaType mediaType, long j4) {
        return Companion.create(interfaceC0734l, mediaType, j4);
    }

    public final InputStream byteStream() {
        return source().U();
    }

    public final C0735m byteString() throws IllegalAccessException, IOException, InvocationTargetException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(k.l("Cannot buffer entire body for content length: ", Long.valueOf(jContentLength)));
        }
        InterfaceC0734l interfaceC0734lSource = source();
        try {
            C0735m c0735mI = interfaceC0734lSource.i();
            interfaceC0734lSource.close();
            int iD = c0735mI.d();
            if (jContentLength == -1 || jContentLength == iD) {
                return c0735mI;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iD + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                h0.i(interfaceC0734lSource, th);
                throw th2;
            }
        }
    }

    public final byte[] bytes() throws IllegalAccessException, IOException, InvocationTargetException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(k.l("Cannot buffer entire body for content length: ", Long.valueOf(jContentLength)));
        }
        InterfaceC0734l interfaceC0734lSource = source();
        try {
            byte[] bArrX = interfaceC0734lSource.x();
            interfaceC0734lSource.close();
            int length = bArrX.length;
            if (jContentLength == -1 || jContentLength == length) {
                return bArrX;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                h0.i(interfaceC0734lSource, th);
                throw th2;
            }
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract InterfaceC0734l source();

    public final String string() {
        InterfaceC0734l interfaceC0734lSource = source();
        try {
            String strS = interfaceC0734lSource.S(Util.readBomAsCharset(interfaceC0734lSource, charset()));
            interfaceC0734lSource.close();
            return strS;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                h0.i(interfaceC0734lSource, th);
                throw th2;
            }
        }
    }

    public static final ResponseBody create(C0735m c0735m, MediaType mediaType) {
        return Companion.create(c0735m, mediaType);
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    @c
    public static final ResponseBody create(MediaType mediaType, long j4, InterfaceC0734l interfaceC0734l) {
        return Companion.create(mediaType, j4, interfaceC0734l);
    }

    @c
    public static final ResponseBody create(MediaType mediaType, C0735m c0735m) {
        return Companion.create(mediaType, c0735m);
    }

    @c
    public static final ResponseBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    @c
    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }
}

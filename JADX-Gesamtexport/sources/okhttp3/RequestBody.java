package okhttp3;

import E4.g;
import E4.k;
import M4.a;
import S1.h0;
import h5.AbstractC0724b;
import h5.C0727e;
import h5.C0735m;
import h5.InterfaceC0733k;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import okhttp3.internal.Util;
import p084p4.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class RequestBody {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        @c
        public final RequestBody create(MediaType mediaType, byte[] bArr) {
            k.f("content", bArr);
            return create$default(this, mediaType, bArr, 0, 0, 12, (Object) null);
        }

        private Companion() {
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, C0735m c0735m, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(c0735m, mediaType);
        }

        @c
        public final RequestBody create(MediaType mediaType, byte[] bArr, int i) {
            k.f("content", bArr);
            return create$default(this, mediaType, bArr, i, 0, 8, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, int i3, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                mediaType = null;
            }
            if ((i6 & 2) != 0) {
                i = 0;
            }
            if ((i6 & 4) != 0) {
                i3 = bArr.length;
            }
            return companion.create(bArr, mediaType, i, i3);
        }

        public final RequestBody create(byte[] bArr) {
            k.f("<this>", bArr);
            return create$default(this, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType) {
            k.f("<this>", bArr);
            return create$default(this, bArr, mediaType, 0, 0, 6, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, File file, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(file, mediaType);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType, int i) {
            k.f("<this>", bArr);
            return create$default(this, bArr, mediaType, i, 0, 4, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] bArr, int i, int i3, int i6, Object obj) {
            if ((i6 & 4) != 0) {
                i = 0;
            }
            if ((i6 & 8) != 0) {
                i3 = bArr.length;
            }
            return companion.create(mediaType, bArr, i, i3);
        }

        public final RequestBody create(String str, MediaType mediaType) {
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
            byte[] bytes = str.getBytes(charset);
            k.e("this as java.lang.String).getBytes(charset)", bytes);
            return create(bytes, mediaType, 0, bytes.length);
        }

        public final RequestBody create(final C0735m c0735m, final MediaType mediaType) {
            k.f("<this>", c0735m);
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return c0735m.d();
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(InterfaceC0733k interfaceC0733k) {
                    k.f("sink", interfaceC0733k);
                    interfaceC0733k.t(c0735m);
                }
            };
        }

        public final RequestBody create(final byte[] bArr, final MediaType mediaType, final int i, final int i3) {
            k.f("<this>", bArr);
            Util.checkOffsetAndCount(bArr.length, i, i3);
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return i3;
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(InterfaceC0733k interfaceC0733k) {
                    k.f("sink", interfaceC0733k);
                    interfaceC0733k.d(bArr, i, i3);
                }
            };
        }

        public final RequestBody create(final File file, final MediaType mediaType) {
            k.f("<this>", file);
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return file.length();
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(InterfaceC0733k interfaceC0733k) throws IllegalAccessException, IOException, InvocationTargetException {
                    k.f("sink", interfaceC0733k);
                    C0727e c0727eI = AbstractC0724b.i(file);
                    try {
                        interfaceC0733k.r(c0727eI);
                        c0727eI.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            h0.i(c0727eI, th);
                            throw th2;
                        }
                    }
                }
            };
        }

        @c
        public final RequestBody create(MediaType mediaType, String str) {
            k.f("content", str);
            return create(str, mediaType);
        }

        @c
        public final RequestBody create(MediaType mediaType, C0735m c0735m) {
            k.f("content", c0735m);
            return create(c0735m, mediaType);
        }

        @c
        public final RequestBody create(MediaType mediaType, byte[] bArr, int i, int i3) {
            k.f("content", bArr);
            return create(bArr, mediaType, i, i3);
        }

        @c
        public final RequestBody create(MediaType mediaType, File file) {
            k.f("file", file);
            return create(file, mediaType);
        }
    }

    public static final RequestBody create(C0735m c0735m, MediaType mediaType) {
        return Companion.create(c0735m, mediaType);
    }

    public long contentLength() {
        return -1L;
    }

    public abstract MediaType contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(InterfaceC0733k interfaceC0733k);

    public static final RequestBody create(File file, MediaType mediaType) {
        return Companion.create(file, mediaType);
    }

    public static final RequestBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    @c
    public static final RequestBody create(MediaType mediaType, C0735m c0735m) {
        return Companion.create(mediaType, c0735m);
    }

    @c
    public static final RequestBody create(MediaType mediaType, File file) {
        return Companion.create(mediaType, file);
    }

    @c
    public static final RequestBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    @c
    public static final RequestBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    @c
    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i) {
        return Companion.create(mediaType, bArr, i);
    }

    @c
    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i, int i3) {
        return Companion.create(mediaType, bArr, i, i3);
    }

    public static final RequestBody create(byte[] bArr) {
        return Companion.create(bArr);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i) {
        return Companion.create(bArr, mediaType, i);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i, int i3) {
        return Companion.create(bArr, mediaType, i, i3);
    }
}

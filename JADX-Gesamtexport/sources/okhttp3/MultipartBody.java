package okhttp3;

import E4.g;
import E4.k;
import Z2.f;
import h5.C0732j;
import h5.C0735m;
import h5.InterfaceC0733k;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import okhttp3.internal.Util;
import p084p4.c;

/* JADX INFO: loaded from: classes.dex */
public final class MultipartBody extends RequestBody {
    public static final MediaType ALTERNATIVE;
    private static final byte[] COLONSPACE;
    private static final byte[] CRLF;
    public static final Companion Companion = new Companion(null);
    private static final byte[] DASHDASH;
    public static final MediaType DIGEST;
    public static final MediaType FORM;
    public static final MediaType MIXED;
    public static final MediaType PARALLEL;
    private final C0735m boundaryByteString;
    private long contentLength;
    private final MediaType contentType;
    private final List<Part> parts;
    private final MediaType type;

    public static final class Builder {
        private final C0735m boundary;
        private final List<Part> parts;
        private MediaType type;

        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final Builder addFormDataPart(String str, String str2) {
            k.f("name", str);
            k.f("value", str2);
            addPart(Part.Companion.createFormData(str, str2));
            return this;
        }

        public final Builder addPart(RequestBody requestBody) {
            k.f("body", requestBody);
            addPart(Part.Companion.create(requestBody));
            return this;
        }

        public final MultipartBody build() {
            if (this.parts.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new MultipartBody(this.boundary, this.type, Util.toImmutableList(this.parts));
        }

        public final Builder setType(MediaType mediaType) {
            k.f("type", mediaType);
            if (!k.a(mediaType.type(), "multipart")) {
                throw new IllegalArgumentException(k.l("multipart != ", mediaType).toString());
            }
            this.type = mediaType;
            return this;
        }

        public Builder(String str) {
            k.f("boundary", str);
            C0735m c0735m = C0735m.f9352k;
            this.boundary = f.i(str);
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
        }

        public final Builder addFormDataPart(String str, String str2, RequestBody requestBody) {
            k.f("name", str);
            k.f("body", requestBody);
            addPart(Part.Companion.createFormData(str, str2, requestBody));
            return this;
        }

        public final Builder addPart(Headers headers, RequestBody requestBody) {
            k.f("body", requestBody);
            addPart(Part.Companion.create(headers, requestBody));
            return this;
        }

        public final Builder addPart(Part part) {
            k.f("part", part);
            this.parts.add(part);
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Builder(String str, int i, g gVar) {
            if ((i & 1) != 0) {
                str = UUID.randomUUID().toString();
                k.e("randomUUID().toString()", str);
            }
            this(str);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final void appendQuotedString$okhttp(StringBuilder sb, String str) {
            k.f("<this>", sb);
            k.f("key", str);
            sb.append('\"');
            int length = str.length();
            int i = 0;
            while (i < length) {
                int i3 = i + 1;
                char cCharAt = str.charAt(i);
                if (cCharAt == '\n') {
                    sb.append("%0A");
                } else if (cCharAt == '\r') {
                    sb.append("%0D");
                } else if (cCharAt == '\"') {
                    sb.append("%22");
                } else {
                    sb.append(cCharAt);
                }
                i = i3;
            }
            sb.append('\"');
        }

        private Companion() {
        }
    }

    public static final class Part {
        public static final Companion Companion = new Companion(null);
        private final RequestBody body;
        private final Headers headers;

        public static final class Companion {
            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final Part create(RequestBody requestBody) {
                k.f("body", requestBody);
                return create(null, requestBody);
            }

            public final Part createFormData(String str, String str2) {
                k.f("name", str);
                k.f("value", str2);
                return createFormData(str, null, RequestBody.Companion.create$default(RequestBody.Companion, str2, (MediaType) null, 1, (Object) null));
            }

            private Companion() {
            }

            public final Part create(Headers headers, RequestBody requestBody) {
                k.f("body", requestBody);
                g gVar = null;
                if ((headers == null ? null : headers.get("Content-Type")) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if ((headers == null ? null : headers.get("Content-Length")) == null) {
                    return new Part(headers, requestBody, gVar);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }

            public final Part createFormData(String str, String str2, RequestBody requestBody) {
                k.f("name", str);
                k.f("body", requestBody);
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                Companion companion = MultipartBody.Companion;
                companion.appendQuotedString$okhttp(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    companion.appendQuotedString$okhttp(sb, str2);
                }
                String string = sb.toString();
                k.e("StringBuilder().apply(builderAction).toString()", string);
                return create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", string).build(), requestBody);
            }
        }

        public /* synthetic */ Part(Headers headers, RequestBody requestBody, g gVar) {
            this(headers, requestBody);
        }

        public static final Part create(Headers headers, RequestBody requestBody) {
            return Companion.create(headers, requestBody);
        }

        public static final Part createFormData(String str, String str2) {
            return Companion.createFormData(str, str2);
        }

        @c
        /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name */
        public final RequestBody m93deprecated_body() {
            return this.body;
        }

        @c
        /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name */
        public final Headers m94deprecated_headers() {
            return this.headers;
        }

        public final RequestBody body() {
            return this.body;
        }

        public final Headers headers() {
            return this.headers;
        }

        private Part(Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        public static final Part create(RequestBody requestBody) {
            return Companion.create(requestBody);
        }

        public static final Part createFormData(String str, String str2, RequestBody requestBody) {
            return Companion.createFormData(str, str2, requestBody);
        }
    }

    static {
        MediaType.Companion companion = MediaType.Companion;
        MIXED = companion.get("multipart/mixed");
        ALTERNATIVE = companion.get("multipart/alternative");
        DIGEST = companion.get("multipart/digest");
        PARALLEL = companion.get("multipart/parallel");
        FORM = companion.get("multipart/form-data");
        COLONSPACE = new byte[]{58, 32};
        CRLF = new byte[]{13, 10};
        DASHDASH = new byte[]{45, 45};
    }

    public MultipartBody(C0735m c0735m, MediaType mediaType, List<Part> list) {
        k.f("boundaryByteString", c0735m);
        k.f("type", mediaType);
        k.f("parts", list);
        this.boundaryByteString = c0735m;
        this.type = mediaType;
        this.parts = list;
        this.contentType = MediaType.Companion.get(mediaType + "; boundary=" + boundary());
        this.contentLength = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long writeOrCountBytes(InterfaceC0733k interfaceC0733k, boolean z5) throws EOFException {
        C0732j c0732j;
        if (z5) {
            interfaceC0733k = new C0732j();
            c0732j = interfaceC0733k;
        } else {
            c0732j = 0;
        }
        int size = this.parts.size();
        long j4 = 0;
        int i = 0;
        while (i < size) {
            int i3 = i + 1;
            Part part = this.parts.get(i);
            Headers headers = part.headers();
            RequestBody requestBodyBody = part.body();
            k.c(interfaceC0733k);
            interfaceC0733k.B(DASHDASH);
            interfaceC0733k.t(this.boundaryByteString);
            interfaceC0733k.B(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    interfaceC0733k.O(headers.name(i6)).B(COLONSPACE).O(headers.value(i6)).B(CRLF);
                }
            }
            MediaType mediaTypeContentType = requestBodyBody.contentType();
            if (mediaTypeContentType != null) {
                interfaceC0733k.O("Content-Type: ").O(mediaTypeContentType.toString()).B(CRLF);
            }
            long jContentLength = requestBodyBody.contentLength();
            if (jContentLength != -1) {
                interfaceC0733k.O("Content-Length: ").P(jContentLength).B(CRLF);
            } else if (z5) {
                k.c(c0732j);
                c0732j.b();
                return -1L;
            }
            byte[] bArr = CRLF;
            interfaceC0733k.B(bArr);
            if (z5) {
                j4 += jContentLength;
            } else {
                requestBodyBody.writeTo(interfaceC0733k);
            }
            interfaceC0733k.B(bArr);
            i = i3;
        }
        k.c(interfaceC0733k);
        byte[] bArr2 = DASHDASH;
        interfaceC0733k.B(bArr2);
        interfaceC0733k.t(this.boundaryByteString);
        interfaceC0733k.B(bArr2);
        interfaceC0733k.B(CRLF);
        if (!z5) {
            return j4;
        }
        k.c(c0732j);
        long j6 = j4 + c0732j.i;
        c0732j.b();
        return j6;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_boundary, reason: not valid java name */
    public final String m89deprecated_boundary() {
        return boundary();
    }

    @c
    /* JADX INFO: renamed from: -deprecated_parts, reason: not valid java name */
    public final List<Part> m90deprecated_parts() {
        return this.parts;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m91deprecated_size() {
        return size();
    }

    @c
    /* JADX INFO: renamed from: -deprecated_type, reason: not valid java name */
    public final MediaType m92deprecated_type() {
        return this.type;
    }

    public final String boundary() {
        return this.boundaryByteString.q();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws EOFException {
        long j4 = this.contentLength;
        if (j4 != -1) {
            return j4;
        }
        long jWriteOrCountBytes = writeOrCountBytes(null, true);
        this.contentLength = jWriteOrCountBytes;
        return jWriteOrCountBytes;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.contentType;
    }

    public final Part part(int i) {
        return this.parts.get(i);
    }

    public final List<Part> parts() {
        return this.parts;
    }

    public final int size() {
        return this.parts.size();
    }

    public final MediaType type() {
        return this.type;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(InterfaceC0733k interfaceC0733k) throws EOFException {
        k.f("sink", interfaceC0733k);
        writeOrCountBytes(interfaceC0733k, false);
    }
}

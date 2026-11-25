package okhttp3;

import E4.g;
import E4.k;
import h5.C0732j;
import h5.InterfaceC0733k;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.Util;
import p084p4.c;

/* JADX INFO: loaded from: classes.dex */
public final class FormBody extends RequestBody {
    private final List<String> encodedNames;
    private final List<String> encodedValues;
    public static final Companion Companion = new Companion(null);
    private static final MediaType CONTENT_TYPE = MediaType.Companion.get("application/x-www-form-urlencoded");

    public static final class Builder {
        private final Charset charset;
        private final List<String> names;
        private final List<String> values;

        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final Builder add(String str, String str2) {
            k.f("name", str);
            k.f("value", str2);
            List<String> list = this.names;
            HttpUrl.Companion companion = HttpUrl.Companion;
            list.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
            return this;
        }

        public final Builder addEncoded(String str, String str2) {
            k.f("name", str);
            k.f("value", str2);
            List<String> list = this.names;
            HttpUrl.Companion companion = HttpUrl.Companion;
            list.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            return this;
        }

        public final FormBody build() {
            return new FormBody(this.names, this.values);
        }

        public Builder(Charset charset) {
            this.charset = charset;
            this.names = new ArrayList();
            this.values = new ArrayList();
        }

        public /* synthetic */ Builder(Charset charset, int i, g gVar) {
            this((i & 1) != 0 ? null : charset);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private Companion() {
        }
    }

    public FormBody(List<String> list, List<String> list2) {
        k.f("encodedNames", list);
        k.f("encodedValues", list2);
        this.encodedNames = Util.toImmutableList(list);
        this.encodedValues = Util.toImmutableList(list2);
    }

    private final long writeOrCountBytes(InterfaceC0733k interfaceC0733k, boolean z5) throws EOFException {
        C0732j c0732jA;
        if (z5) {
            c0732jA = new C0732j();
        } else {
            k.c(interfaceC0733k);
            c0732jA = interfaceC0733k.a();
        }
        int size = this.encodedNames.size();
        int i = 0;
        while (i < size) {
            int i3 = i + 1;
            if (i > 0) {
                c0732jA.Z(38);
            }
            c0732jA.h0(this.encodedNames.get(i));
            c0732jA.Z(61);
            c0732jA.h0(this.encodedValues.get(i));
            i = i3;
        }
        if (!z5) {
            return 0L;
        }
        long j4 = c0732jA.i;
        c0732jA.b();
        return j4;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m51deprecated_size() {
        return size();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return writeOrCountBytes(null, true);
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return CONTENT_TYPE;
    }

    public final String encodedName(int i) {
        return this.encodedNames.get(i);
    }

    public final String encodedValue(int i) {
        return this.encodedValues.get(i);
    }

    public final String name(int i) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, encodedName(i), 0, 0, true, 3, null);
    }

    public final int size() {
        return this.encodedNames.size();
    }

    public final String value(int i) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, encodedValue(i), 0, 0, true, 3, null);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(InterfaceC0733k interfaceC0733k) throws EOFException {
        k.f("sink", interfaceC0733k);
        writeOrCountBytes(interfaceC0733k, false);
    }
}

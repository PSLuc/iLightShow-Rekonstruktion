package okhttp3.internal.http2;

import E4.g;
import E4.k;
import Z2.f;
import h5.C0735m;

/* JADX INFO: loaded from: classes.dex */
public final class Header {
    public static final Companion Companion = new Companion(null);
    public static final C0735m PSEUDO_PREFIX;
    public static final C0735m RESPONSE_STATUS;
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final C0735m TARGET_AUTHORITY;
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final C0735m TARGET_METHOD;
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final C0735m TARGET_PATH;
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final C0735m TARGET_SCHEME;
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public final int hpackSize;
    public final C0735m name;
    public final C0735m value;

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private Companion() {
        }
    }

    static {
        C0735m c0735m = C0735m.f9352k;
        PSEUDO_PREFIX = f.i(":");
        RESPONSE_STATUS = f.i(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = f.i(TARGET_METHOD_UTF8);
        TARGET_PATH = f.i(TARGET_PATH_UTF8);
        TARGET_SCHEME = f.i(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = f.i(TARGET_AUTHORITY_UTF8);
    }

    public Header(C0735m c0735m, C0735m c0735m2) {
        k.f("name", c0735m);
        k.f("value", c0735m2);
        this.name = c0735m;
        this.value = c0735m2;
        this.hpackSize = c0735m2.d() + c0735m.d() + 32;
    }

    public static /* synthetic */ Header copy$default(Header header, C0735m c0735m, C0735m c0735m2, int i, Object obj) {
        if ((i & 1) != 0) {
            c0735m = header.name;
        }
        if ((i & 2) != 0) {
            c0735m2 = header.value;
        }
        return header.copy(c0735m, c0735m2);
    }

    public final C0735m component1() {
        return this.name;
    }

    public final C0735m component2() {
        return this.value;
    }

    public final Header copy(C0735m c0735m, C0735m c0735m2) {
        k.f("name", c0735m);
        k.f("value", c0735m2);
        return new Header(c0735m, c0735m2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return k.a(this.name, header.name) && k.a(this.value, header.value);
    }

    public int hashCode() {
        return this.value.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return this.name.q() + ": " + this.value.q();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(String str, String str2) {
        this(f.i(str), f.i(str2));
        k.f("name", str);
        k.f("value", str2);
        C0735m c0735m = C0735m.f9352k;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(C0735m c0735m, String str) {
        this(c0735m, f.i(str));
        k.f("name", c0735m);
        k.f("value", str);
        C0735m c0735m2 = C0735m.f9352k;
    }
}

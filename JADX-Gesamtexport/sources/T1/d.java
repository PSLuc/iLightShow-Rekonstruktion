package T1;

/* JADX INFO: loaded from: classes.dex */
public enum d {
    AUTO_CLOSE_TARGET(true),
    AUTO_CLOSE_JSON_CONTENT(true),
    FLUSH_PASSED_TO_STREAM(true),
    QUOTE_FIELD_NAMES(true),
    QUOTE_NON_NUMERIC_NUMBERS(true),
    ESCAPE_NON_ASCII(false),
    WRITE_NUMBERS_AS_STRINGS(false),
    WRITE_BIGDECIMAL_AS_PLAIN(false),
    STRICT_DUPLICATE_DETECTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    IGNORE_UNKNOWN(false),
    USE_FAST_DOUBLE_WRITER(false),
    WRITE_HEX_UPPER_CASE(true);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5180h;
    public final int i = 1 << ordinal();

    d(boolean z5) {
        this.f5180h = z5;
    }

    public final boolean a(int i) {
        return (this.i & i) != 0;
    }
}

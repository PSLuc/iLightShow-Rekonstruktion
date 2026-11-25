package T1;

/* JADX INFO: loaded from: classes.dex */
public enum g {
    AUTO_CLOSE_SOURCE(true),
    ALLOW_COMMENTS(false),
    ALLOW_YAML_COMMENTS(false),
    ALLOW_UNQUOTED_FIELD_NAMES(false),
    ALLOW_SINGLE_QUOTES(false),
    ALLOW_UNQUOTED_CONTROL_CHARS(false),
    ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
    ALLOW_NUMERIC_LEADING_ZEROS(false),
    ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS(false),
    ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false),
    ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS(false),
    ALLOW_NON_NUMERIC_NUMBERS(false),
    ALLOW_MISSING_VALUES(false),
    ALLOW_TRAILING_COMMA(false),
    STRICT_DUPLICATE_DETECTION(false),
    IGNORE_UNDEFINED(false),
    INCLUDE_SOURCE_IN_LOCATION(true),
    USE_FAST_DOUBLE_PARSER(false);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5207h;
    public final int i = 1 << ordinal();

    g(boolean z5) {
        this.f5207h = z5;
    }

    public final boolean a(int i) {
        return (this.i & i) != 0;
    }
}

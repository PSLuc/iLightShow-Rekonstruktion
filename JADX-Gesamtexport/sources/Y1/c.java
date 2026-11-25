package Y1;

import T1.g;
import p009b2.i;

/* JADX INFO: loaded from: classes.dex */
public enum c implements i {
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_JAVA_COMMENTS(g.ALLOW_COMMENTS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_YAML_COMMENTS(g.ALLOW_YAML_COMMENTS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_SINGLE_QUOTES(g.ALLOW_SINGLE_QUOTES),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_UNQUOTED_FIELD_NAMES(g.ALLOW_UNQUOTED_FIELD_NAMES),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_UNESCAPED_CONTROL_CHARS(g.ALLOW_UNQUOTED_CONTROL_CHARS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(g.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_LEADING_ZEROS_FOR_NUMBERS(g.ALLOW_NUMERIC_LEADING_ZEROS),
    ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS(g.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS),
    ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(g.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS),
    ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS(g.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_NON_NUMERIC_NUMBERS(g.ALLOW_NON_NUMERIC_NUMBERS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_MISSING_VALUES(g.ALLOW_MISSING_VALUES),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_TRAILING_COMMA(g.ALLOW_TRAILING_COMMA);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5829h = 1 << ordinal();
    public final g i;

    c(g gVar) {
        this.i = gVar;
    }

    @Override // p009b2.i
    public final boolean a() {
        return false;
    }

    @Override // p009b2.i
    public final int b() {
        return this.f5829h;
    }
}

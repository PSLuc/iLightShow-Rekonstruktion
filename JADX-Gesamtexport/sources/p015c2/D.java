package p015c2;

import p026e2.e;

/* JADX INFO: loaded from: classes.dex */
public enum D implements e {
    WRAP_ROOT_VALUE(false),
    INDENT_OUTPUT(false),
    FAIL_ON_EMPTY_BEANS(true),
    FAIL_ON_SELF_REFERENCES(true),
    WRAP_EXCEPTIONS(true),
    FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS(true),
    WRITE_SELF_REFERENCES_AS_NULL(false),
    CLOSE_CLOSEABLE(false),
    FLUSH_AFTER_WRITE_VALUE(true),
    WRITE_DATES_AS_TIMESTAMPS(true),
    WRITE_DATE_KEYS_AS_TIMESTAMPS(false),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_DATES_WITH_ZONE_ID(false),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_DATES_WITH_CONTEXT_TIME_ZONE(true),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_DURATIONS_AS_TIMESTAMPS(true),
    WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS(false),
    WRITE_ENUMS_USING_TO_STRING(false),
    WRITE_ENUMS_USING_INDEX(false),
    WRITE_ENUM_KEYS_USING_INDEX(false),
    WRITE_NULL_MAP_VALUES(true),
    WRITE_EMPTY_JSON_ARRAYS(true),
    WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED(false),
    WRITE_BIGDECIMAL_AS_PLAIN(false),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS(true),
    ORDER_MAP_ENTRIES_BY_KEYS(false),
    /* JADX INFO: Fake field, exist only in values array */
    EAGER_SERIALIZER_FETCH(true),
    USE_EQUALITY_FOR_OBJECT_ID(false);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f7223h;
    public final int i = 1 << ordinal();

    D(boolean z5) {
        this.f7223h = z5;
    }

    @Override // p026e2.e
    public final boolean a() {
        return this.f7223h;
    }

    @Override // p026e2.e
    public final int b() {
        return this.i;
    }
}

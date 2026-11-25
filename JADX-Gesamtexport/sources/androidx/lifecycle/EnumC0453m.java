package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0453m {
    private static final /* synthetic */ EnumC0453m[] $VALUES;
    public static final C0451k Companion;
    public static final EnumC0453m ON_ANY;
    public static final EnumC0453m ON_CREATE;
    public static final EnumC0453m ON_DESTROY;
    public static final EnumC0453m ON_PAUSE;
    public static final EnumC0453m ON_RESUME;
    public static final EnumC0453m ON_START;
    public static final EnumC0453m ON_STOP;

    static {
        EnumC0453m enumC0453m = new EnumC0453m("ON_CREATE", 0);
        ON_CREATE = enumC0453m;
        EnumC0453m enumC0453m2 = new EnumC0453m("ON_START", 1);
        ON_START = enumC0453m2;
        EnumC0453m enumC0453m3 = new EnumC0453m("ON_RESUME", 2);
        ON_RESUME = enumC0453m3;
        EnumC0453m enumC0453m4 = new EnumC0453m("ON_PAUSE", 3);
        ON_PAUSE = enumC0453m4;
        EnumC0453m enumC0453m5 = new EnumC0453m("ON_STOP", 4);
        ON_STOP = enumC0453m5;
        EnumC0453m enumC0453m6 = new EnumC0453m("ON_DESTROY", 5);
        ON_DESTROY = enumC0453m6;
        EnumC0453m enumC0453m7 = new EnumC0453m("ON_ANY", 6);
        ON_ANY = enumC0453m7;
        $VALUES = new EnumC0453m[]{enumC0453m, enumC0453m2, enumC0453m3, enumC0453m4, enumC0453m5, enumC0453m6, enumC0453m7};
        Companion = new C0451k();
    }

    public static EnumC0453m valueOf(String str) {
        return (EnumC0453m) Enum.valueOf(EnumC0453m.class, str);
    }

    public static EnumC0453m[] values() {
        return (EnumC0453m[]) $VALUES.clone();
    }

    public final EnumC0454n a() {
        switch (AbstractC0452l.f6990a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0454n.f6992j;
            case 3:
            case 4:
                return EnumC0454n.f6993k;
            case 5:
                return EnumC0454n.f6994l;
            case 6:
                return EnumC0454n.f6991h;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}

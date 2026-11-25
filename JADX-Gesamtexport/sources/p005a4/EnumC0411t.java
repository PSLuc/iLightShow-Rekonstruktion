package p005a4;

import U3.a;
import u5.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a4.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0411t implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC0411t f6320h;
    public static final /* synthetic */ EnumC0411t[] i;

    static {
        EnumC0411t enumC0411t = new EnumC0411t("INSTANCE", 0);
        f6320h = enumC0411t;
        i = new EnumC0411t[]{enumC0411t};
    }

    public static EnumC0411t valueOf(String str) {
        return (EnumC0411t) Enum.valueOf(EnumC0411t.class, str);
    }

    public static EnumC0411t[] values() {
        return (EnumC0411t[]) i.clone();
    }

    @Override // U3.a
    public final void e(Object obj) {
        ((c) obj).e(Long.MAX_VALUE);
    }
}

package com.nanjoran.ilightshow.Services;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ D[] f8246h;

    /* JADX INFO: Fake field, exist only in values array */
    D EF5;

    static {
        D[] dArr = {new D("START", 0), new D("STOP", 1), new D("NEXT", 2)};
        f8246h = dArr;
        p081p0.c.i0(dArr);
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f8246h.clone();
    }
}

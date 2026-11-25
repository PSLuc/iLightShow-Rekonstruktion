package p105t3;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: t3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0958a extends h {
    public C0958a() {
        super("IDENTITY", 0);
    }

    @Override // p105t3.h
    public final String b(Field field) {
        return field.getName();
    }
}

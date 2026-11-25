package p026e2;

import p009b2.i;

/* JADX INFO: loaded from: classes.dex */
public enum m implements i {
    READ_NULL_PROPERTIES,
    WRITE_NULL_PROPERTIES;


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8716h = 1 << ordinal();

    m() {
    }

    @Override // p009b2.i
    public final boolean a() {
        return true;
    }

    @Override // p009b2.i
    public final int b() {
        return this.f8716h;
    }

    public final boolean c(int i) {
        return (this.f8716h & i) != 0;
    }
}

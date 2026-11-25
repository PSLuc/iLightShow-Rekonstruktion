package p026e2;

import p009b2.i;

/* JADX INFO: loaded from: classes.dex */
public enum l implements i {
    /* JADX INFO: Fake field, exist only in values array */
    BOGUS_FEATURE;


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8713h = 1 << ordinal();

    @Override // p009b2.i
    public final boolean a() {
        return false;
    }

    @Override // p009b2.i
    public final int b() {
        return this.f8713h;
    }
}

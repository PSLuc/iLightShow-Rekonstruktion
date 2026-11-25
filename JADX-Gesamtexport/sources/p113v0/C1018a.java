package p113v0;

import D4.e;
import E4.i;
import G4.a;

/* JADX INFO: renamed from: v0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1018a extends i implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C1018a f13158p = new C1018a(2, a.class, "min", "min(II)I", 1);

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}

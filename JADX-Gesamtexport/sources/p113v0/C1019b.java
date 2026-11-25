package p113v0;

import D4.e;
import E4.i;
import G4.a;

/* JADX INFO: renamed from: v0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1019b extends i implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C1019b f13159p = new C1019b(2, a.class, "max", "max(II)I", 1);

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}

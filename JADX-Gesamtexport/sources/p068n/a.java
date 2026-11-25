package p068n;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f10498l = new HashMap();

    @Override // p068n.f
    public final c c(Object obj) {
        return (c) this.f10498l.get(obj);
    }

    @Override // p068n.f
    public final Object d(Object obj) {
        Object objD = super.d(obj);
        this.f10498l.remove(obj);
        return objD;
    }
}

package V;

import N.AbstractC0231o0;
import N.InterfaceC0225l0;
import N.Y0;
import S.n;

/* JADX INFO: loaded from: classes.dex */
public final class e extends S.c implements InterfaceC0225l0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f5395k = new e(n.f4874e, 0);

    @Override // S.c
    /* JADX INFO: renamed from: a */
    public final S.e builder() {
        d dVar = new d(this);
        dVar.f5394n = this;
        return dVar;
    }

    @Override // S.c, Q.d
    public final Q.c builder() {
        d dVar = new d(this);
        dVar.f5394n = this;
        return dVar;
    }

    @Override // S.c, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0231o0) {
            return super.containsKey((AbstractC0231o0) obj);
        }
        return false;
    }

    @Override // p089q4.e, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Y0) {
            return super.containsValue((Y0) obj);
        }
        return false;
    }

    @Override // S.c, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC0231o0) {
            return (Y0) super.get((AbstractC0231o0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC0231o0) ? obj2 : (Y0) super.getOrDefault((AbstractC0231o0) obj, (Y0) obj2);
    }
}

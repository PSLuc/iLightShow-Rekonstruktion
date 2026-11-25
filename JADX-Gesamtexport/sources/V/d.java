package V;

import N.AbstractC0231o0;
import N.Y0;
import S.n;

/* JADX INFO: loaded from: classes.dex */
public final class d extends S.e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e f5394n;

    @Override // S.e, Q.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final e d() {
        n nVar = this.f4861j;
        e eVar = this.f5394n;
        if (nVar != eVar.f4857h) {
            this.i = new U.b();
            eVar = new e(this.f4861j, this.f4864m);
        }
        this.f5394n = eVar;
        return eVar;
    }

    @Override // S.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0231o0) {
            return super.containsKey((AbstractC0231o0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Y0) {
            return super.containsValue((Y0) obj);
        }
        return false;
    }

    @Override // S.e, java.util.AbstractMap, java.util.Map
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

    @Override // S.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof AbstractC0231o0) {
            return (Y0) super.remove((AbstractC0231o0) obj);
        }
        return null;
    }
}

package S;

/* JADX INFO: loaded from: classes.dex */
public class c extends p089q4.e implements Q.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f4856j = new c(n.f4874e, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f4857h;
    public final int i;

    public c(n nVar, int i) {
        this.f4857h = nVar;
        this.i = i;
    }

    @Override // Q.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e builder() {
        return new e(this);
    }

    public final c b(Object obj, T.a aVar) {
        K3.e eVarU = this.f4857h.u(obj != null ? obj.hashCode() : 0, 0, obj, aVar);
        return eVarU == null ? this : new c((n) eVarU.f2139c, this.i + eVarU.f2138b);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f4857h.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f4857h.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}

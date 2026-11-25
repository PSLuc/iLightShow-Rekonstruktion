package c5;

/* JADX INFO: loaded from: classes.dex */
public final class X implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4.a f7420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f7421b;

    public X(Y4.a aVar) {
        E4.k.f("serializer", aVar);
        this.f7420a = aVar;
        this.f7421b = new j0(aVar.getDescriptor());
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        if (cVar.g()) {
            return cVar.A(this.f7420a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && X.class == obj.getClass() && E4.k.a(this.f7420a, ((X) obj).f7420a);
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return this.f7421b;
    }

    public final int hashCode() {
        return this.f7420a.hashCode();
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        if (obj != null) {
            dVar.r(this.f7420a, obj);
        } else {
            dVar.e();
        }
    }
}

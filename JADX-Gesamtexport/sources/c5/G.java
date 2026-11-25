package c5;

/* JADX INFO: loaded from: classes.dex */
public final class G implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y4.a f7396a;

    public G(Y4.a aVar) {
        this.f7396a = aVar;
    }

    @Override // c5.C
    public final Y4.a[] childSerializers() {
        return new Y4.a[]{this.f7396a};
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        throw new IllegalStateException("unsupported");
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        throw new IllegalStateException("unsupported");
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        throw new IllegalStateException("unsupported");
    }

    @Override // c5.C
    public final Y4.a[] typeParametersSerializers() {
        return AbstractC0476a0.f7427b;
    }
}

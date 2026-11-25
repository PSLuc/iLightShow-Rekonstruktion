package c5;

/* JADX INFO: loaded from: classes.dex */
public final class D0 implements Y4.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D0 f7387b = new D0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y f7388a = new Y("kotlin.Unit", p084p4.x.f10867a);

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        this.f7388a.deserialize(cVar);
        return p084p4.x.f10867a;
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return this.f7388a.getDescriptor();
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        p084p4.x xVar = (p084p4.x) obj;
        E4.k.f("value", xVar);
        this.f7388a.serialize(dVar, xVar);
    }
}

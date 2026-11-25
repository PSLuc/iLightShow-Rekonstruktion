package H1;

import E4.l;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class g extends l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1767h;
    public final /* synthetic */ Y4.a i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Y4.a aVar, int i) {
        super(0);
        this.f1767h = i;
        this.i = aVar;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f1767h) {
            case 0:
                throw new IllegalArgumentException("Cannot generate NavArguments for polymorphic serializer " + this.i + ". Arguments can only be generated from concrete classes or objects.");
            default:
                StringBuilder sb = new StringBuilder("Cannot generate route pattern from polymorphic class ");
                K4.b bVarS = G4.a.s(this.i.getDescriptor());
                throw new IllegalArgumentException(k.u(sb, bVarS != null ? ((E4.f) bVarS).b() : null, ". Routes can only be generated from concrete classes or objects."));
        }
    }
}

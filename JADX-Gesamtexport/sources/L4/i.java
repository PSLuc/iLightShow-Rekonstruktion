package L4;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3114c;

    /* JADX WARN: Multi-variable type inference failed */
    public i(j jVar, D4.c cVar, int i) {
        this.f3112a = i;
        switch (i) {
            case 2:
                this.f3113b = jVar;
                this.f3114c = cVar;
                break;
            default:
                this.f3114c = jVar;
                this.f3113b = (E4.l) cVar;
                break;
        }
    }

    @Override // L4.j
    public final Iterator iterator() {
        switch (this.f3112a) {
            case 0:
                return new h(this);
            case 1:
                return new g(this);
            default:
                return new p(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(D4.a aVar, D4.c cVar) {
        this.f3112a = 0;
        E4.k.f("getNextValue", cVar);
        this.f3113b = (E4.l) aVar;
        this.f3114c = cVar;
    }
}

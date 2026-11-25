package B4;

import L4.g;
import L4.j;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f581b;

    public /* synthetic */ b(int i, Object obj) {
        this.f580a = i;
        this.f581b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [int[], java.lang.Cloneable] */
    @Override // L4.j
    public final Iterator iterator() {
        switch (this.f580a) {
            case 0:
                return new a(this);
            case 1:
                return new g(this);
            case 2:
                return (Iterator) this.f581b;
            case 3:
                return new E4.a((int[]) this.f581b, 0);
            default:
                return ((Iterable) this.f581b).iterator();
        }
    }
}

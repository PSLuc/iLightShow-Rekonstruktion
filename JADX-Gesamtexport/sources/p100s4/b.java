package p100s4;

import E4.k;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f12213b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f12214c = new b(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12215a;

    public /* synthetic */ b(int i) {
        this.f12215a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f12215a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                k.f("a", comparable);
                k.f("b", comparable2);
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                k.f("a", comparable3);
                k.f("b", comparable4);
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f12215a) {
            case 0:
                return f12214c;
            default:
                return f12213b;
        }
    }
}

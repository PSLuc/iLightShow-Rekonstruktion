package p089q4;

import E4.k;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends m {
    public static int P(Iterable iterable, int i) {
        k.f("<this>", iterable);
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}

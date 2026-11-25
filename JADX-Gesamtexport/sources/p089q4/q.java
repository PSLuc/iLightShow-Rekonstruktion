package p089q4;

import E4.k;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends p {
    public static void Q(List list, Comparator comparator) {
        k.f("<this>", list);
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}

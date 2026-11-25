package q5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w[] f11320a = {w.secp256r1, w.X25519, w.X448, w.secp384r1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f11321b;

    static {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (w wVar : w.values()) {
            if (wVar.f11329k) {
                arrayList.add(wVar);
            }
        }
        for (w wVar2 : f11320a) {
            if (wVar2.f11329k) {
                arrayList2.add(wVar2);
            }
        }
        if (arrayList2.isEmpty() && !arrayList.isEmpty()) {
            arrayList2.add(arrayList.get(0));
        }
        Collections.unmodifiableList(arrayList);
        f11321b = Collections.unmodifiableList(arrayList2);
    }
}

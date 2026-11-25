package F1;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: F1.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0103u extends androidx.lifecycle.O {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0102t f1380c = new C0102t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1381b = new LinkedHashMap();

    @Override // androidx.lifecycle.O
    public final void c() {
        LinkedHashMap linkedHashMap = this.f1381b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((androidx.lifecycle.U) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.f1381b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String string = sb.toString();
        E4.k.e("sb.toString()", string);
        return string;
    }
}

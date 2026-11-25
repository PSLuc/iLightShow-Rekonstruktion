package G1;

import androidx.lifecycle.G;
import androidx.lifecycle.O;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.UUID;

/* JADX INFO: renamed from: G1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0117a extends O {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1613b = "SaveableStateHolder_BackStackEntryKey";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f1614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f1615d;

    public C0117a(G g6) {
        Object obj;
        LinkedHashMap linkedHashMap = g6.f6950a;
        try {
            obj = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            if (g6.f6952c.remove("SaveableStateHolder_BackStackEntryKey") != null) {
                throw new ClassCastException();
            }
            g6.f6953d.remove("SaveableStateHolder_BackStackEntryKey");
            obj = null;
        }
        UUID uuidRandomUUID = (UUID) obj;
        if (uuidRandomUUID == null) {
            uuidRandomUUID = UUID.randomUUID();
            g6.b(this.f1613b, uuidRandomUUID);
        }
        this.f1614c = uuidRandomUUID;
    }

    @Override // androidx.lifecycle.O
    public final void c() {
        WeakReference weakReference = this.f1615d;
        if (weakReference == null) {
            E4.k.m("saveableStateHolderRef");
            throw null;
        }
        W.c cVar = (W.c) weakReference.get();
        if (cVar != null) {
            W.g gVar = (W.g) cVar;
            LinkedHashMap linkedHashMap = gVar.f5530b;
            UUID uuid = this.f1614c;
            W.f fVar = (W.f) linkedHashMap.get(uuid);
            if (fVar != null) {
                fVar.f5526b = false;
            } else {
                gVar.f5529a.remove(uuid);
            }
        }
        WeakReference weakReference2 = this.f1615d;
        if (weakReference2 != null) {
            weakReference2.clear();
        } else {
            E4.k.m("saveableStateHolderRef");
            throw null;
        }
    }
}

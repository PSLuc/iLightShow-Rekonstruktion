package androidx.lifecycle;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class F implements J1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6948b;

    public /* synthetic */ F(int i, Object obj) {
        this.f6947a = i;
        this.f6948b = obj;
    }

    @Override // J1.d
    public final Bundle a() {
        switch (this.f6947a) {
            case 0:
                return G.a((G) this.f6948b);
            case 1:
                p012c.n nVar = (p012c.n) this.f6948b;
                E4.k.f("this$0", nVar);
                Bundle bundle = new Bundle();
                p012c.l lVar = nVar.f7163p;
                lVar.getClass();
                LinkedHashMap linkedHashMap = lVar.f7147b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(lVar.f7149d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(lVar.f7152g));
                return bundle;
            default:
                Map mapD = ((W.j) this.f6948b).d();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : ((LinkedHashMap) mapD).entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
        }
    }
}

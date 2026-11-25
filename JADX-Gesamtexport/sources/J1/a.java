package J1;

import E4.k;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f1895a;

    public a(e eVar) {
        k.f("registry", eVar);
        this.f1895a = new LinkedHashSet();
        eVar.d("androidx.savedstate.Restarter", this);
    }

    @Override // J1.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f1895a));
        return bundle;
    }
}

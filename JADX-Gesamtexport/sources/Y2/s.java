package Y2;

import B.C0025m0;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s extends Fragment {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0025m0 f5917h = new C0025m0(15);

    static {
        new WeakHashMap();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.f5917h.i).values().iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i3, Intent intent) {
        super.onActivityResult(i, i3, intent);
        Iterator it = ((Map) this.f5917h.i).values().iterator();
        if (it.hasNext()) {
            ((e) it.next()).getClass();
            throw null;
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        for (Map.Entry entry : ((Map) this.f5917h.i).entrySet()) {
            ((e) entry.getValue()).b(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C0025m0 c0025m0 = this.f5917h;
        c0025m0.getClass();
        Iterator it = ((Map) c0025m0.i).values().iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C0025m0 c0025m0 = this.f5917h;
        c0025m0.getClass();
        Iterator it = ((Map) c0025m0.i).values().iterator();
        while (it.hasNext()) {
            ((e) it.next()).d();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C0025m0 c0025m0 = this.f5917h;
        if (bundle == null) {
            c0025m0.getClass();
            return;
        }
        Iterator it = ((Map) c0025m0.i).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            new Bundle();
            ((e) entry.getValue()).getClass();
            throw null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C0025m0 c0025m0 = this.f5917h;
        c0025m0.getClass();
        for (e eVar : ((Map) c0025m0.i).values()) {
            eVar.f5888h = true;
            eVar.d();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        C0025m0 c0025m0 = this.f5917h;
        c0025m0.getClass();
        Iterator it = ((Map) c0025m0.i).values().iterator();
        while (it.hasNext()) {
            ((e) it.next()).c();
        }
    }
}

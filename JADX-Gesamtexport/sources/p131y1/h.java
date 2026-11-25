package p131y1;

import android.widget.EditText;
import java.lang.ref.WeakReference;
import p057l.AbstractC0801m;
import p119w1.f;

/* JADX INFO: loaded from: classes.dex */
public final class h extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f14588a;

    public h(AbstractC0801m abstractC0801m) {
        this.f14588a = new WeakReference(abstractC0801m);
    }

    @Override // p119w1.f
    public final void b() {
        i.a((EditText) this.f14588a.get(), 1);
    }
}

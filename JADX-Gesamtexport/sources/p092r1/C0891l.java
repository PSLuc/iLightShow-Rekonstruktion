package p092r1;

import D4.a;
import E4.l;
import h5.C;
import java.util.LinkedHashSet;
import p103t1.e;
import p103t1.f;
import p103t1.i;

/* JADX INFO: renamed from: r1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0891l extends l implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11677h;
    public final /* synthetic */ J i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0891l(J j4, int i) {
        super(0);
        this.f11677h = i;
        this.i = j4;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f11677h) {
            case 0:
                return ((i) this.i.f11602j.getValue()).f12476c;
            default:
                f fVar = this.i.f11594a;
                String strQ = ((C) fVar.f12460d.getValue()).f9310h.q();
                synchronized (f.f12456f) {
                    LinkedHashSet linkedHashSet = f.f12455e;
                    if (linkedHashSet.contains(strQ)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + strQ + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    linkedHashSet.add(strQ);
                }
                return new i(fVar.f12457a, (C) fVar.f12460d.getValue(), (T) fVar.f12458b.d((C) fVar.f12460d.getValue(), fVar.f12457a), new e(fVar, 1));
        }
    }
}

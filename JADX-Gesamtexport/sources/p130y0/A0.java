package p130y0;

import E0.h;
import E0.l;
import java.util.List;
import p080p.j;
import p080p.q;
import p080p.r;

/* JADX INFO: loaded from: classes.dex */
public final class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f14176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f14177b;

    public A0(l lVar, q qVar) {
        this.f14176a = lVar.f947d;
        int[] iArr = j.f10738a;
        this.f14177b = new r();
        List listH = l.h(lVar, 4);
        int size = listH.size();
        for (int i = 0; i < size; i++) {
            l lVar2 = (l) listH.get(i);
            if (qVar.b(lVar2.f950g)) {
                this.f14177b.a(lVar2.f950g);
            }
        }
    }
}

package p037g2;

import java.util.ArrayList;
import p015c2.f;
import p032f2.r;
import p109u2.A;
import p109u2.y;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9105a;

    public E() {
        this.f9105a = new ArrayList();
    }

    public final void a(f fVar, Object obj, A a6) {
        ArrayList arrayList = this.f9105a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            r rVar = (r) arrayList.get(i);
            y yVarH0 = a6.H0(a6.i);
            yVarH0.B0();
            rVar.j(yVarH0, fVar, obj);
        }
    }

    public E(ArrayList arrayList) {
        this.f9105a = arrayList;
    }
}

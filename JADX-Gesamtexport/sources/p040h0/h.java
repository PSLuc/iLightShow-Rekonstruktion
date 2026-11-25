package p040h0;

import p080p.i;
import p080p.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f9249a;

    static {
        q qVar = d.f9224c;
        int i = qVar.f9221c;
        e eVar = new e(qVar, qVar, 1);
        l lVar = d.f9240t;
        int i3 = lVar.f9221c << 6;
        int i6 = qVar.f9221c;
        int i7 = i3 | i6;
        g gVar = new g(qVar, lVar, 0);
        int i8 = (i6 << 6) | lVar.f9221c;
        g gVar2 = new g(lVar, qVar, 0);
        q qVar2 = i.f10737a;
        q qVar3 = new q();
        qVar3.i(i | (i << 6), eVar);
        qVar3.i(i7, gVar);
        qVar3.i(i8, gVar2);
        f9249a = qVar3;
    }
}

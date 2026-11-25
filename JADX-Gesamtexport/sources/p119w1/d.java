package p119w1;

import Y2.g;
import android.os.Build;
import java.util.ArrayList;
import p131y1.f;
import p133y4.b;

/* JADX INFO: loaded from: classes.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f13411a;

    public d(e eVar) {
        this.f13411a = eVar;
    }

    @Override // p131y1.f
    public final void b(Throwable th) {
        this.f13411a.f13412a.e(th);
    }

    @Override // p131y1.f
    public final void c(H1.d dVar) {
        e eVar = this.f13411a;
        eVar.f13414c = dVar;
        H1.d dVar2 = eVar.f13414c;
        h hVar = eVar.f13412a;
        eVar.f13413b = new p091r0.d(dVar2, hVar.f13423g, hVar.i, Build.VERSION.SDK_INT >= 34 ? k.a() : b.a());
        h hVar2 = eVar.f13412a;
        hVar2.getClass();
        ArrayList arrayList = new ArrayList();
        hVar2.f13417a.writeLock().lock();
        try {
            hVar2.f13419c = 1;
            arrayList.addAll(hVar2.f13418b);
            hVar2.f13418b.clear();
            hVar2.f13417a.writeLock().unlock();
            hVar2.f13420d.post(new g(arrayList, hVar2.f13419c, null));
        } catch (Throwable th) {
            hVar2.f13417a.writeLock().unlock();
            throw th;
        }
    }
}

package p068n;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f10504h;
    public boolean i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f10505j;

    public d(f fVar) {
        this.f10505j = fVar;
    }

    @Override // p068n.e
    public final void a(c cVar) {
        c cVar2 = this.f10504h;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f10503k;
            this.f10504h = cVar3;
            this.i = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.i) {
            return this.f10505j.f10506h != null;
        }
        c cVar = this.f10504h;
        return (cVar == null || cVar.f10502j == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.i) {
            this.i = false;
            this.f10504h = this.f10505j.f10506h;
        } else {
            c cVar = this.f10504h;
            this.f10504h = cVar != null ? cVar.f10502j : null;
        }
        return this.f10504h;
    }
}

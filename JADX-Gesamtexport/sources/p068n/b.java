package p068n;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f10499h;
    public c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f10500j;

    public b(c cVar, c cVar2, int i) {
        this.f10500j = i;
        this.f10499h = cVar2;
        this.i = cVar;
    }

    @Override // p068n.e
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.f10499h == cVar && cVar == this.i) {
            this.i = null;
            this.f10499h = null;
        }
        c cVar3 = this.f10499h;
        if (cVar3 == cVar) {
            switch (this.f10500j) {
                case 0:
                    cVar2 = cVar3.f10503k;
                    break;
                default:
                    cVar2 = cVar3.f10502j;
                    break;
            }
            this.f10499h = cVar2;
        }
        c cVar4 = this.i;
        if (cVar4 == cVar) {
            c cVar5 = this.f10499h;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.i = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.f10500j) {
            case 0:
                return cVar.f10502j;
            default:
                return cVar.f10503k;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.i != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.i;
        c cVar2 = this.f10499h;
        this.i = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}

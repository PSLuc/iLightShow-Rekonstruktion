package p115v2;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Iterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13226h;
    public final Iterator i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f13227j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o f13228k;

    public j(o oVar, int i) {
        this.f13226h = i;
        switch (i) {
            case 1:
                this.f13228k = oVar;
                this.i = oVar.f13238h.values().iterator();
                break;
            case 2:
                this.f13228k = oVar;
                this.i = oVar.f13238h.keySet().iterator();
                break;
            default:
                this.f13228k = oVar;
                this.i = oVar.f13238h.values().iterator();
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f13226h) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.i.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f13226h) {
            case 0:
                this.f13227j = (l) this.i.next();
                return new n(this.f13228k, (l) this.f13227j);
            case 1:
                l lVar = (l) this.i.next();
                this.f13227j = lVar;
                return lVar.a();
            default:
                Object next = this.i.next();
                this.f13227j = next;
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z5;
        o oVar = this.f13228k;
        switch (this.f13226h) {
            case 0:
                l lVar = (l) this.f13227j;
                z5 = lVar != null;
                int i = o.f13236v;
                if (!z5) {
                    throw new IllegalStateException();
                }
                oVar.remove(lVar.f13231h);
                this.f13227j = null;
                return;
            case 1:
                l lVar2 = (l) this.f13227j;
                z5 = lVar2 != null;
                int i3 = o.f13236v;
                if (!z5) {
                    throw new IllegalStateException();
                }
                oVar.remove(lVar2.f13231h);
                this.f13227j = null;
                return;
            default:
                Object obj = this.f13227j;
                z5 = obj != null;
                int i6 = o.f13236v;
                if (!z5) {
                    throw new IllegalStateException();
                }
                oVar.remove(obj);
                this.f13227j = null;
                return;
        }
    }
}

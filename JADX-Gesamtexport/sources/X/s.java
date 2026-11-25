package X;

import L.C0175s0;
import N.C0208d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class s implements B, List, RandomAccess, F4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r f5722h;

    public s() {
        R.i iVar = R.i.i;
        r rVar = new r(iVar);
        if (o.f5708a.get() != null) {
            r rVar2 = new r(iVar);
            rVar2.f5650a = 1;
            rVar.f5651b = rVar2;
        }
        this.f5722h = rVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        R.c cVar;
        boolean z5;
        AbstractC0391h abstractC0391hK;
        do {
            Object obj2 = t.f5723a;
            synchronized (obj2) {
                r rVar = this.f5722h;
                E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", rVar);
                r rVar2 = (r) o.i(rVar);
                i = rVar2.f5720d;
                cVar = rVar2.f5719c;
            }
            E4.k.c(cVar);
            R.c cVarI = cVar.i(obj);
            z5 = false;
            if (cVarI.equals(cVar)) {
                return false;
            }
            r rVar3 = this.f5722h;
            E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", rVar3);
            synchronized (o.f5709b) {
                abstractC0391hK = o.k();
                r rVar4 = (r) o.w(rVar3, this, abstractC0391hK);
                synchronized (obj2) {
                    int i3 = rVar4.f5720d;
                    if (i3 == i) {
                        rVar4.f5719c = cVarI;
                        rVar4.f5721e++;
                        rVar4.f5720d = i3 + 1;
                        z5 = true;
                    }
                }
            }
            o.n(abstractC0391hK, this);
        } while (!z5);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return l(new C0175s0(i, collection));
    }

    @Override // X.B
    public final D c() {
        return this.f5722h;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        AbstractC0391h abstractC0391hK;
        r rVar = this.f5722h;
        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", rVar);
        synchronized (o.f5709b) {
            abstractC0391hK = o.k();
            r rVar2 = (r) o.w(rVar, this, abstractC0391hK);
            synchronized (t.f5723a) {
                rVar2.f5719c = R.i.i;
                rVar2.f5720d++;
                rVar2.f5721e++;
            }
        }
        o.n(abstractC0391hK, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return j().f5719c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return j().f5719c.containsAll(collection);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return j().f5719c.get(i);
    }

    @Override // X.B
    public final void i(D d6) {
        d6.f5651b = this.f5722h;
        this.f5722h = (r) d6;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return j().f5719c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return j().f5719c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    public final r j() {
        r rVar = this.f5722h;
        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", rVar);
        return (r) o.t(rVar, this);
    }

    public final int k() {
        r rVar = this.f5722h;
        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", rVar);
        return ((r) o.i(rVar)).f5721e;
    }

    public final boolean l(D4.c cVar) {
        int i;
        R.c cVar2;
        Object objInvoke;
        AbstractC0391h abstractC0391hK;
        boolean z5;
        do {
            Object obj = t.f5723a;
            synchronized (obj) {
                r rVar = this.f5722h;
                E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", rVar);
                r rVar2 = (r) o.i(rVar);
                i = rVar2.f5720d;
                cVar2 = rVar2.f5719c;
            }
            E4.k.c(cVar2);
            R.f fVarK = cVar2.k();
            objInvoke = cVar.invoke(fVarK);
            R.c cVarI = fVarK.i();
            if (E4.k.a(cVarI, cVar2)) {
                break;
            }
            r rVar3 = this.f5722h;
            E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", rVar3);
            synchronized (o.f5709b) {
                abstractC0391hK = o.k();
                r rVar4 = (r) o.w(rVar3, this, abstractC0391hK);
                synchronized (obj) {
                    int i3 = rVar4.f5720d;
                    if (i3 == i) {
                        rVar4.f5719c = cVarI;
                        rVar4.f5720d = i3 + 1;
                        z5 = true;
                        rVar4.f5721e++;
                    } else {
                        z5 = false;
                    }
                }
            }
            o.n(abstractC0391hK, this);
        } while (!z5);
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return j().f5719c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new y(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i3;
        R.c cVar;
        AbstractC0391h abstractC0391hK;
        boolean z5;
        Object obj = get(i);
        do {
            Object obj2 = t.f5723a;
            synchronized (obj2) {
                r rVar = this.f5722h;
                E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", rVar);
                r rVar2 = (r) o.i(rVar);
                i3 = rVar2.f5720d;
                cVar = rVar2.f5719c;
            }
            E4.k.c(cVar);
            R.c cVarM = cVar.m(i);
            if (cVarM.equals(cVar)) {
                break;
            }
            r rVar3 = this.f5722h;
            E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", rVar3);
            synchronized (o.f5709b) {
                abstractC0391hK = o.k();
                r rVar4 = (r) o.w(rVar3, this, abstractC0391hK);
                synchronized (obj2) {
                    int i6 = rVar4.f5720d;
                    if (i6 == i3) {
                        rVar4.f5719c = cVarM;
                        z5 = true;
                        rVar4.f5721e++;
                        rVar4.f5720d = i6 + 1;
                    } else {
                        z5 = false;
                    }
                }
            }
            o.n(abstractC0391hK, this);
        } while (!z5);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        R.c cVar;
        boolean z5;
        AbstractC0391h abstractC0391hK;
        do {
            Object obj = t.f5723a;
            synchronized (obj) {
                r rVar = this.f5722h;
                E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", rVar);
                r rVar2 = (r) o.i(rVar);
                i = rVar2.f5720d;
                cVar = rVar2.f5719c;
            }
            E4.k.c(cVar);
            R.c cVarL = cVar.l(new R.b(0, collection));
            z5 = false;
            if (E4.k.a(cVarL, cVar)) {
                return false;
            }
            r rVar3 = this.f5722h;
            E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", rVar3);
            synchronized (o.f5709b) {
                abstractC0391hK = o.k();
                r rVar4 = (r) o.w(rVar3, this, abstractC0391hK);
                synchronized (obj) {
                    int i3 = rVar4.f5720d;
                    if (i3 == i) {
                        rVar4.f5719c = cVarL;
                        rVar4.f5721e++;
                        rVar4.f5720d = i3 + 1;
                        z5 = true;
                    }
                }
            }
            o.n(abstractC0391hK, this);
        } while (!z5);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return l(new R.b(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i3;
        R.c cVar;
        AbstractC0391h abstractC0391hK;
        boolean z5;
        Object obj2 = get(i);
        do {
            Object obj3 = t.f5723a;
            synchronized (obj3) {
                r rVar = this.f5722h;
                E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", rVar);
                r rVar2 = (r) o.i(rVar);
                i3 = rVar2.f5720d;
                cVar = rVar2.f5719c;
            }
            E4.k.c(cVar);
            R.c cVarN = cVar.n(i, obj);
            if (cVarN.equals(cVar)) {
                break;
            }
            r rVar3 = this.f5722h;
            E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", rVar3);
            synchronized (o.f5709b) {
                abstractC0391hK = o.k();
                r rVar4 = (r) o.w(rVar3, this, abstractC0391hK);
                synchronized (obj3) {
                    int i6 = rVar4.f5720d;
                    if (i6 == i3) {
                        rVar4.f5719c = cVarN;
                        rVar4.f5720d = i6 + 1;
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                }
            }
            o.n(abstractC0391hK, this);
        } while (!z5);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return j().f5719c.c();
    }

    @Override // java.util.List
    public final List subList(int i, int i3) {
        if (i >= 0 && i <= i3 && i3 <= size()) {
            return new F(this, i, i3);
        }
        C0208d.S("fromIndex or toIndex are out of bounds");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return E4.j.a(this);
    }

    public final String toString() {
        r rVar = this.f5722h;
        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", rVar);
        return "SnapshotStateList(value=" + ((r) o.i(rVar)).f5719c + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        R.c cVar;
        boolean z5;
        AbstractC0391h abstractC0391hK;
        do {
            Object obj = t.f5723a;
            synchronized (obj) {
                r rVar = this.f5722h;
                E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", rVar);
                r rVar2 = (r) o.i(rVar);
                i = rVar2.f5720d;
                cVar = rVar2.f5719c;
            }
            E4.k.c(cVar);
            R.c cVarJ = cVar.j(collection);
            z5 = false;
            if (E4.k.a(cVarJ, cVar)) {
                return false;
            }
            r rVar3 = this.f5722h;
            E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", rVar3);
            synchronized (o.f5709b) {
                abstractC0391hK = o.k();
                r rVar4 = (r) o.w(rVar3, this, abstractC0391hK);
                synchronized (obj) {
                    int i3 = rVar4.f5720d;
                    if (i3 == i) {
                        rVar4.f5719c = cVarJ;
                        rVar4.f5721e++;
                        rVar4.f5720d = i3 + 1;
                        z5 = true;
                    }
                }
            }
            o.n(abstractC0391hK, this);
        } while (!z5);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new y(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return E4.j.b(this, objArr);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0054 */
    @Override // java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void add(int r8, java.lang.Object r9) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = X.t.f5723a
            monitor-enter(r0)
            X.r r1 = r7.f5722h     // Catch: java.lang.Throwable -> L5a
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            E4.k.d(r2, r1)     // Catch: java.lang.Throwable -> L5a
            X.D r1 = X.o.i(r1)     // Catch: java.lang.Throwable -> L5a
            X.r r1 = (X.r) r1     // Catch: java.lang.Throwable -> L5a
            int r2 = r1.f5720d     // Catch: java.lang.Throwable -> L5a
            R.c r1 = r1.f5719c     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r0)
            E4.k.c(r1)
            R.c r3 = r1.g(r8, r9)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L23
            goto L53
        L23:
            X.r r1 = r7.f5722h
            java.lang.String r4 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            E4.k.d(r4, r1)
            java.lang.Object r4 = X.o.f5709b
            monitor-enter(r4)
            X.h r5 = X.o.k()     // Catch: java.lang.Throwable -> L54
            X.D r1 = X.o.w(r1, r7, r5)     // Catch: java.lang.Throwable -> L54
            X.r r1 = (X.r) r1     // Catch: java.lang.Throwable -> L54
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L54
            int r6 = r1.f5720d     // Catch: java.lang.Throwable -> L49
            if (r6 != r2) goto L4b
            r1.f5719c = r3     // Catch: java.lang.Throwable -> L49
            int r2 = r1.f5721e     // Catch: java.lang.Throwable -> L49
            r3 = 1
            int r2 = r2 + r3
            r1.f5721e = r2     // Catch: java.lang.Throwable -> L49
            int r6 = r6 + 1
            r1.f5720d = r6     // Catch: java.lang.Throwable -> L49
            goto L4c
        L49:
            r7 = move-exception
            goto L56
        L4b:
            r3 = 0
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r4)
            X.o.n(r5, r7)
            if (r3 == 0) goto L0
        L53:
            return
        L54:
            r7 = move-exception
            goto L58
        L56:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L54
            throw r7     // Catch: java.lang.Throwable -> L54
        L58:
            monitor-exit(r4)
            throw r7
        L5a:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.s.add(int, java.lang.Object):void");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        R.c cVar;
        boolean z5;
        AbstractC0391h abstractC0391hK;
        do {
            Object obj2 = t.f5723a;
            synchronized (obj2) {
                r rVar = this.f5722h;
                E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", rVar);
                r rVar2 = (r) o.i(rVar);
                i = rVar2.f5720d;
                cVar = rVar2.f5719c;
            }
            E4.k.c(cVar);
            int iIndexOf = cVar.indexOf(obj);
            R.c cVarM = iIndexOf != -1 ? cVar.m(iIndexOf) : cVar;
            z5 = false;
            if (cVarM.equals(cVar)) {
                return false;
            }
            r rVar3 = this.f5722h;
            E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", rVar3);
            synchronized (o.f5709b) {
                abstractC0391hK = o.k();
                r rVar4 = (r) o.w(rVar3, this, abstractC0391hK);
                synchronized (obj2) {
                    int i3 = rVar4.f5720d;
                    if (i3 == i) {
                        rVar4.f5719c = cVarM;
                        rVar4.f5721e++;
                        rVar4.f5720d = i3 + 1;
                        z5 = true;
                    }
                }
            }
            o.n(abstractC0391hK, this);
        } while (!z5);
        return true;
    }
}

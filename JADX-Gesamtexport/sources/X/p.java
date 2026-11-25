package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Set, F4.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f5718h;
    public final /* synthetic */ int i;

    public p(v vVar, int i) {
        this.i = i;
        this.f5718h = vVar;
    }

    private final boolean c(Collection collection) {
        Q.d dVar;
        int i;
        boolean z5;
        AbstractC0391h abstractC0391hK;
        Collection<Map.Entry> collection2 = collection;
        int iS = p089q4.z.S(p089q4.n.P(collection2, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Map.Entry entry : collection2) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        v vVar = this.f5718h;
        boolean z6 = false;
        do {
            synchronized (t.f5724b) {
                u uVar = vVar.f5727h;
                E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", uVar);
                u uVar2 = (u) o.i(uVar);
                dVar = uVar2.f5725c;
                i = uVar2.f5726d;
            }
            E4.k.c(dVar);
            Q.c cVarBuilder = dVar.builder();
            Iterator it = vVar.i.iterator();
            while (true) {
                z5 = true;
                if (!((A) it).hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) ((A) it).next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !E4.k.a(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    cVarBuilder.remove(entry2.getKey());
                    z6 = true;
                }
            }
            Q.d dVarD = cVarBuilder.d();
            if (E4.k.a(dVarD, dVar)) {
                break;
            }
            u uVar3 = vVar.f5727h;
            E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", uVar3);
            synchronized (o.f5709b) {
                abstractC0391hK = o.k();
                u uVar4 = (u) o.w(uVar3, vVar, abstractC0391hK);
                synchronized (t.f5724b) {
                    int i3 = uVar4.f5726d;
                    if (i3 == i) {
                        uVar4.f5725c = dVarD;
                        uVar4.f5726d = i3 + 1;
                    } else {
                        z5 = false;
                    }
                }
            }
            o.n(abstractC0391hK, vVar);
        } while (!z5);
        return z6;
    }

    private final boolean g(Collection collection) {
        Q.d dVar;
        int i;
        boolean z5;
        AbstractC0391h abstractC0391hK;
        Set setX0 = p089q4.l.x0(collection);
        v vVar = this.f5718h;
        boolean z6 = false;
        do {
            synchronized (t.f5724b) {
                u uVar = vVar.f5727h;
                E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", uVar);
                u uVar2 = (u) o.i(uVar);
                dVar = uVar2.f5725c;
                i = uVar2.f5726d;
            }
            E4.k.c(dVar);
            Q.c cVarBuilder = dVar.builder();
            Iterator it = vVar.i.iterator();
            while (true) {
                z5 = true;
                if (!((A) it).hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) ((A) it).next();
                if (!setX0.contains(entry.getKey())) {
                    cVarBuilder.remove(entry.getKey());
                    z6 = true;
                }
            }
            Q.d dVarD = cVarBuilder.d();
            if (E4.k.a(dVarD, dVar)) {
                break;
            }
            u uVar3 = vVar.f5727h;
            E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", uVar3);
            synchronized (o.f5709b) {
                abstractC0391hK = o.k();
                u uVar4 = (u) o.w(uVar3, vVar, abstractC0391hK);
                synchronized (t.f5724b) {
                    int i3 = uVar4.f5726d;
                    if (i3 == i) {
                        uVar4.f5725c = dVarD;
                        uVar4.f5726d = i3 + 1;
                    } else {
                        z5 = false;
                    }
                }
            }
            o.n(abstractC0391hK, vVar);
        } while (!z5);
        return z6;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.i) {
            case 0:
                t.h();
                throw null;
            case 1:
                t.h();
                throw null;
            default:
                t.h();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.i) {
            case 0:
                t.h();
                throw null;
            case 1:
                t.h();
                throw null;
            default:
                t.h();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f5718h.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.i) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof F4.a) && !(obj instanceof F4.d))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return E4.k.a(this.f5718h.get(entry.getKey()), entry.getValue());
            case 1:
                return this.f5718h.containsKey(obj);
            default:
                return this.f5718h.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.i) {
            case 0:
                Collection collection2 = collection;
                if ((collection2 instanceof Collection) && collection2.isEmpty()) {
                    return true;
                }
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    if (!contains((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            case 1:
                Collection collection3 = collection;
                if ((collection3 instanceof Collection) && collection3.isEmpty()) {
                    return true;
                }
                Iterator it2 = collection3.iterator();
                while (it2.hasNext()) {
                    if (!this.f5718h.containsKey(it2.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Collection collection4 = collection;
                if ((collection4 instanceof Collection) && collection4.isEmpty()) {
                    return true;
                }
                Iterator it3 = collection4.iterator();
                while (it3.hasNext()) {
                    if (!this.f5718h.containsValue(it3.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f5718h.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.i) {
            case 0:
                v vVar = this.f5718h;
                return new A(vVar, ((Q.b) ((p089q4.e) vVar.a().f5725c).entrySet()).iterator(), 0);
            case 1:
                v vVar2 = this.f5718h;
                return new A(vVar2, ((Q.b) ((p089q4.e) vVar2.a().f5725c).entrySet()).iterator(), 1);
            default:
                v vVar3 = this.f5718h;
                return new A(vVar3, ((Q.b) ((p089q4.e) vVar3.a().f5725c).entrySet()).iterator(), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX WARN: Code duplicated, block: B:14:0x0039 A[ORIG_RETURN, RETURN] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v10 java.lang.Object, still in use, count: 2, list:
          (r1v10 java.lang.Object) from 0x002c: PHI (r1 I:??) = (r1v5 java.lang.Object), (r1v10 java.lang.Object) binds: [B:10:0x002b, B:36:0x002c] A[DONT_GENERATE, DONT_INLINE]
          (r1v10 java.lang.Object) from 0x001e: CHECK_CAST (java.util.Map$Entry) (r1v10 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.i
            switch(r0) {
                case 0: goto L47;
                case 1: goto L3b;
                default: goto L5;
            }
        L5:
            X.v r3 = r3.f5718h
            X.p r0 = r3.i
            java.util.Iterator r0 = r0.iterator()
        Ld:
            r1 = r0
            X.A r1 = (X.A) r1
            boolean r1 = r1.hasNext()
            if (r1 == 0) goto L2b
            r1 = r0
            X.A r1 = (X.A) r1
            java.lang.Object r1 = r1.next()
            r2 = r1
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            boolean r2 = E4.k.a(r2, r4)
            if (r2 == 0) goto Ld
            goto L2c
        L2b:
            r1 = 0
        L2c:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r1 == 0) goto L39
            java.lang.Object r4 = r1.getKey()
            r3.remove(r4)
            r3 = 1
            goto L3a
        L39:
            r3 = 0
        L3a:
            return r3
        L3b:
            X.v r3 = r3.f5718h
            java.lang.Object r3 = r3.remove(r4)
            if (r3 == 0) goto L45
            r3 = 1
            goto L46
        L45:
            r3 = 0
        L46:
            return r3
        L47:
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L57
            boolean r0 = r4 instanceof F4.a
            if (r0 == 0) goto L55
            boolean r0 = r4 instanceof F4.d
            if (r0 == 0) goto L57
        L55:
            r0 = r2
            goto L58
        L57:
            r0 = r1
        L58:
            if (r0 != 0) goto L5b
            goto L6a
        L5b:
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getKey()
            X.v r3 = r3.f5718h
            java.lang.Object r3 = r3.remove(r4)
            if (r3 == 0) goto L6a
            r1 = r2
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.p.remove(java.lang.Object):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Q.d dVar;
        int i;
        boolean z5;
        AbstractC0391h abstractC0391hK;
        switch (this.i) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z6 = false;
                    while (it.hasNext()) {
                        if (this.f5718h.remove(((Map.Entry) it.next()).getKey()) != null || z6) {
                            z6 = true;
                        }
                    }
                    return z6;
                }
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z7 = false;
                    while (it2.hasNext()) {
                        if (this.f5718h.remove(it2.next()) != null || z7) {
                            z7 = true;
                        }
                    }
                    return z7;
                }
            default:
                Set setX0 = p089q4.l.x0(collection);
                v vVar = this.f5718h;
                boolean z8 = false;
                do {
                    synchronized (t.f5724b) {
                        u uVar = vVar.f5727h;
                        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", uVar);
                        u uVar2 = (u) o.i(uVar);
                        dVar = uVar2.f5725c;
                        i = uVar2.f5726d;
                    }
                    E4.k.c(dVar);
                    Q.c cVarBuilder = dVar.builder();
                    Iterator it3 = vVar.i.iterator();
                    while (true) {
                        z5 = true;
                        if (!((A) it3).hasNext()) {
                            Q.d dVarD = cVarBuilder.d();
                            if (!E4.k.a(dVarD, dVar)) {
                                u uVar3 = vVar.f5727h;
                                E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", uVar3);
                                synchronized (o.f5709b) {
                                    abstractC0391hK = o.k();
                                    u uVar4 = (u) o.w(uVar3, vVar, abstractC0391hK);
                                    synchronized (t.f5724b) {
                                        int i3 = uVar4.f5726d;
                                        if (i3 == i) {
                                            uVar4.f5725c = dVarD;
                                            uVar4.f5726d = i3 + 1;
                                        } else {
                                            z5 = false;
                                        }
                                        break;
                                    }
                                }
                                o.n(abstractC0391hK, vVar);
                            }
                            return z8;
                        }
                        Map.Entry entry = (Map.Entry) ((A) it3).next();
                        if (setX0.contains(entry.getValue())) {
                            cVarBuilder.remove(entry.getKey());
                            z8 = true;
                        }
                    }
                } while (!z5);
                return z8;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Q.d dVar;
        int i;
        boolean z5;
        AbstractC0391h abstractC0391hK;
        switch (this.i) {
            case 0:
                return c(collection);
            case 1:
                return g(collection);
            default:
                Set setX0 = p089q4.l.x0(collection);
                v vVar = this.f5718h;
                boolean z6 = false;
                do {
                    synchronized (t.f5724b) {
                        u uVar = vVar.f5727h;
                        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", uVar);
                        u uVar2 = (u) o.i(uVar);
                        dVar = uVar2.f5725c;
                        i = uVar2.f5726d;
                    }
                    E4.k.c(dVar);
                    Q.c cVarBuilder = dVar.builder();
                    Iterator it = vVar.i.iterator();
                    while (true) {
                        z5 = true;
                        if (!((A) it).hasNext()) {
                            Q.d dVarD = cVarBuilder.d();
                            if (!E4.k.a(dVarD, dVar)) {
                                u uVar3 = vVar.f5727h;
                                E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", uVar3);
                                synchronized (o.f5709b) {
                                    abstractC0391hK = o.k();
                                    u uVar4 = (u) o.w(uVar3, vVar, abstractC0391hK);
                                    synchronized (t.f5724b) {
                                        int i3 = uVar4.f5726d;
                                        if (i3 == i) {
                                            uVar4.f5725c = dVarD;
                                            uVar4.f5726d = i3 + 1;
                                        } else {
                                            z5 = false;
                                        }
                                        break;
                                    }
                                }
                                o.n(abstractC0391hK, vVar);
                            }
                            return z6;
                        }
                        Map.Entry entry = (Map.Entry) ((A) it).next();
                        if (!setX0.contains(entry.getValue())) {
                            cVarBuilder.remove(entry.getKey());
                            z6 = true;
                        }
                    }
                } while (!z5);
                return z6;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f5718h.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return E4.j.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return E4.j.b(this, objArr);
    }
}

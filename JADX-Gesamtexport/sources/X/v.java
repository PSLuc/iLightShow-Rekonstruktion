package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class v implements B, Map, F4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u f5727h;
    public final p i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p f5728j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p f5729k;

    public v() {
        S.c cVar = S.c.f4856j;
        u uVar = new u(cVar);
        if (o.f5708a.get() != null) {
            u uVar2 = new u(cVar);
            uVar2.f5650a = 1;
            uVar.f5651b = uVar2;
        }
        this.f5727h = uVar;
        this.i = new p(this, 0);
        this.f5728j = new p(this, 1);
        this.f5729k = new p(this, 2);
    }

    public final u a() {
        u uVar = this.f5727h;
        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", uVar);
        return (u) o.t(uVar, this);
    }

    @Override // X.B
    public final D c() {
        return this.f5727h;
    }

    @Override // java.util.Map
    public final void clear() {
        AbstractC0391h abstractC0391hK;
        u uVar = this.f5727h;
        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", uVar);
        u uVar2 = (u) o.i(uVar);
        S.c cVar = S.c.f4856j;
        if (cVar != uVar2.f5725c) {
            u uVar3 = this.f5727h;
            E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", uVar3);
            synchronized (o.f5709b) {
                abstractC0391hK = o.k();
                u uVar4 = (u) o.w(uVar3, this, abstractC0391hK);
                synchronized (t.f5724b) {
                    uVar4.f5725c = cVar;
                    uVar4.f5726d++;
                }
            }
            o.n(abstractC0391hK, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return a().f5725c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return a().f5725c.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.i;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return a().f5725c.get(obj);
    }

    @Override // X.B
    public final void i(D d6) {
        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", d6);
        this.f5727h = (u) d6;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((p089q4.e) a().f5725c).isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f5728j;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Q.d dVar;
        int i;
        Object objPut;
        AbstractC0391h abstractC0391hK;
        boolean z5;
        do {
            Object obj3 = t.f5724b;
            synchronized (obj3) {
                u uVar = this.f5727h;
                E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", uVar);
                u uVar2 = (u) o.i(uVar);
                dVar = uVar2.f5725c;
                i = uVar2.f5726d;
            }
            E4.k.c(dVar);
            S.e eVar = (S.e) dVar.builder();
            objPut = eVar.put(obj, obj2);
            Q.d dVarD = eVar.d();
            if (E4.k.a(dVarD, dVar)) {
                break;
            }
            u uVar3 = this.f5727h;
            E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", uVar3);
            synchronized (o.f5709b) {
                abstractC0391hK = o.k();
                u uVar4 = (u) o.w(uVar3, this, abstractC0391hK);
                synchronized (obj3) {
                    int i3 = uVar4.f5726d;
                    if (i3 == i) {
                        uVar4.f5725c = dVarD;
                        uVar4.f5726d = i3 + 1;
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                }
            }
            o.n(abstractC0391hK, this);
        } while (!z5);
        return objPut;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0057 */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void putAll(java.util.Map r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = X.t.f5724b
            monitor-enter(r0)
            X.u r1 = r7.f5727h     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"
            E4.k.d(r2, r1)     // Catch: java.lang.Throwable -> L5e
            X.D r1 = X.o.i(r1)     // Catch: java.lang.Throwable -> L5e
            X.u r1 = (X.u) r1     // Catch: java.lang.Throwable -> L5e
            Q.d r2 = r1.f5725c     // Catch: java.lang.Throwable -> L5e
            int r1 = r1.f5726d     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r0)
            E4.k.c(r2)
            Q.c r3 = r2.builder()
            S.e r3 = (S.e) r3
            r3.putAll(r8)
            Q.d r3 = r3.d()
            boolean r2 = E4.k.a(r3, r2)
            if (r2 != 0) goto L5d
            X.u r2 = r7.f5727h
            java.lang.String r4 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"
            E4.k.d(r4, r2)
            java.lang.Object r4 = X.o.f5709b
            monitor-enter(r4)
            X.h r5 = X.o.k()     // Catch: java.lang.Throwable -> L57
            X.D r2 = X.o.w(r2, r7, r5)     // Catch: java.lang.Throwable -> L57
            X.u r2 = (X.u) r2     // Catch: java.lang.Throwable -> L57
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L57
            int r6 = r2.f5726d     // Catch: java.lang.Throwable -> L4c
            if (r6 != r1) goto L4e
            r2.f5725c = r3     // Catch: java.lang.Throwable -> L4c
            int r6 = r6 + 1
            r2.f5726d = r6     // Catch: java.lang.Throwable -> L4c
            r1 = 1
            goto L4f
        L4c:
            r7 = move-exception
            goto L59
        L4e:
            r1 = 0
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r4)
            X.o.n(r5, r7)
            if (r1 == 0) goto L0
            goto L5d
        L57:
            r7 = move-exception
            goto L5b
        L59:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            throw r7     // Catch: java.lang.Throwable -> L57
        L5b:
            monitor-exit(r4)
            throw r7
        L5d:
            return
        L5e:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.v.putAll(java.util.Map):void");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Q.d dVar;
        int i;
        Object objRemove;
        AbstractC0391h abstractC0391hK;
        boolean z5;
        do {
            Object obj2 = t.f5724b;
            synchronized (obj2) {
                u uVar = this.f5727h;
                E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", uVar);
                u uVar2 = (u) o.i(uVar);
                dVar = uVar2.f5725c;
                i = uVar2.f5726d;
            }
            E4.k.c(dVar);
            Q.c cVarBuilder = dVar.builder();
            objRemove = cVarBuilder.remove(obj);
            Q.d dVarD = cVarBuilder.d();
            if (E4.k.a(dVarD, dVar)) {
                break;
            }
            u uVar3 = this.f5727h;
            E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", uVar3);
            synchronized (o.f5709b) {
                abstractC0391hK = o.k();
                u uVar4 = (u) o.w(uVar3, this, abstractC0391hK);
                synchronized (obj2) {
                    int i3 = uVar4.f5726d;
                    if (i3 == i) {
                        uVar4.f5725c = dVarD;
                        uVar4.f5726d = i3 + 1;
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                }
            }
            o.n(abstractC0391hK, this);
        } while (!z5);
        return objRemove;
    }

    @Override // java.util.Map
    public final int size() {
        p089q4.e eVar = (p089q4.e) a().f5725c;
        eVar.getClass();
        return ((S.c) eVar).i;
    }

    public final String toString() {
        u uVar = this.f5727h;
        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", uVar);
        return "SnapshotStateMap(value=" + ((u) o.i(uVar)).f5725c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f5729k;
    }
}

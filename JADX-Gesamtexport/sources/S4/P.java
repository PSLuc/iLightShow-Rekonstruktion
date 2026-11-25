package S4;

import O1.C0308a;
import P4.C0319f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class P extends T4.a implements y, InterfaceC0368e, T4.o {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5057m = AtomicReferenceFieldUpdater.newUpdater(P.class, Object.class, "_state");
    private volatile Object _state;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5058l;

    public P(Object obj) {
        this._state = obj;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00e9 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:31:0x007c, B:33:0x0084, B:36:0x008b, B:37:0x008f, B:39:0x0092, B:49:0x00b3, B:52:0x00c6, B:53:0x00de, B:59:0x00f2, B:56:0x00e9, B:58:0x00ef, B:41:0x0098, B:45:0x009f, B:21:0x004d), top: B:66:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[LOOP:0: B:53:0x00de->B:73:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [S4.Q] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [T4.c] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [S4.Q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [S4.Q] */
    /* JADX WARN: Type inference failed for: r2v8, types: [S4.Q] */
    /* JADX WARN: Type inference failed for: r8v1, types: [T4.a] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [S4.P] */
    /* JADX WARN: Type inference failed for: r8v5, types: [S4.P, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [S4.P] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00c5 -> B:31:0x007c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // S4.InterfaceC0368e
    public final java.lang.Object a(S4.InterfaceC0369f r14, p111u4.d r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S4.P.a(S4.f, u4.d):java.lang.Object");
    }

    @Override // T4.o
    public final InterfaceC0368e b(p111u4.i iVar, int i, int i3) {
        return (((i < 0 || i >= 2) && i != -2) || i3 != 2) ? F.j(this, iVar, i, i3) : this;
    }

    @Override // T4.a
    public final T4.c d() {
        return new Q();
    }

    @Override // T4.a
    public final T4.c[] e() {
        return new Q[2];
    }

    @Override // S4.N
    public final Object getValue() {
        C0308a c0308a = T4.b.f5258b;
        Object obj = f5057m.get(this);
        if (obj == c0308a) {
            return null;
        }
        return obj;
    }

    public final void h(Object obj) {
        if (obj == null) {
            obj = T4.b.f5258b;
        }
        i(null, obj);
    }

    public final boolean i(Object obj, Object obj2) {
        int i;
        T4.c[] cVarArr;
        C0308a c0308a;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5057m;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !E4.k.a(obj3, obj)) {
                return false;
            }
            if (E4.k.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i3 = this.f5058l;
            if ((i3 & 1) != 0) {
                this.f5058l = i3 + 2;
                return true;
            }
            int i6 = i3 + 1;
            this.f5058l = i6;
            T4.c[] cVarArr2 = this.f5254h;
            while (true) {
                Q[] qArr = (Q[]) cVarArr2;
                if (qArr != null) {
                    for (Q q6 : qArr) {
                        if (q6 != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Q.f5059a;
                                Object obj4 = atomicReferenceFieldUpdater2.get(q6);
                                if (obj4 == null || obj4 == (c0308a = F.f5035c)) {
                                    break;
                                }
                                C0308a c0308a2 = F.f5034b;
                                if (obj4 != c0308a2) {
                                    do {
                                        if (atomicReferenceFieldUpdater2.compareAndSet(q6, obj4, c0308a2)) {
                                            ((C0319f) obj4).g(p084p4.x.f10867a);
                                            break;
                                        }
                                    } while (atomicReferenceFieldUpdater2.get(q6) == obj4);
                                } else {
                                    do {
                                        if (atomicReferenceFieldUpdater2.compareAndSet(q6, obj4, c0308a)) {
                                            break;
                                        }
                                    } while (atomicReferenceFieldUpdater2.get(q6) == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f5058l;
                    if (i == i6) {
                        this.f5058l = i6 + 1;
                        return true;
                    }
                    cVarArr = this.f5254h;
                }
                cVarArr2 = cVarArr;
                i6 = i;
            }
        }
    }

    @Override // S4.InterfaceC0369f
    public final Object m(Object obj, p111u4.d dVar) {
        h(obj);
        return p084p4.x.f10867a;
    }
}

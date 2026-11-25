package p092r1;

import D4.e;
import S1.V;
import S4.A;
import X4.d;
import java.util.concurrent.atomic.AtomicInteger;
import p035g0.C0715p;
import p122w4.c;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f11629a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0715p f11630b = new C0715p(19);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A f11631c = new A(new S(2, null));

    public T(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f11630b.i).get());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [r1.T] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v6, types: [X4.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(D4.c r7, p122w4.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p092r1.P
            if (r0 == 0) goto L13
            r0 = r8
            r1.P r0 = (p092r1.P) r0
            int r1 = r0.f11623o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11623o = r1
            goto L18
        L13:
            r1.P r0 = new r1.P
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f11621m
            v4.a r1 = v4.a.f13292h
            int r2 = r0.f11623o
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f11619k
            X4.a r6 = (X4.a) r6
            S1.V.O(r8)     // Catch: java.lang.Throwable -> L2f
            goto L62
        L2f:
            r7 = move-exception
            goto L68
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            X4.d r6 = r0.f11620l
            java.lang.Object r7 = r0.f11619k
            D4.c r7 = (D4.c) r7
            S1.V.O(r8)
            goto L55
        L43:
            S1.V.O(r8)
            r0.f11619k = r7
            X4.d r6 = r6.f11629a
            r0.f11620l = r6
            r0.f11623o = r4
            java.lang.Object r8 = r6.c(r0)
            if (r8 != r1) goto L55
            goto L61
        L55:
            r0.f11619k = r6     // Catch: java.lang.Throwable -> L2f
            r0.f11620l = r5     // Catch: java.lang.Throwable -> L2f
            r0.f11623o = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r1) goto L62
        L61:
            return r1
        L62:
            X4.d r6 = (X4.d) r6
            r6.e(r5)
            return r8
        L68:
            X4.d r6 = (X4.d) r6
            r6.e(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p092r1.T.b(D4.c, w4.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(e eVar, c cVar) {
        Q q6;
        d dVar;
        boolean z5;
        Throwable th;
        if (cVar instanceof Q) {
            q6 = (Q) cVar;
            int i = q6.f11628o;
            if ((i & Integer.MIN_VALUE) != 0) {
                q6.f11628o = i - Integer.MIN_VALUE;
            } else {
                q6 = new Q(this, cVar);
            }
        } else {
            q6 = new Q(this, cVar);
        }
        Object obj = q6.f11626m;
        Object obj2 = a.f13292h;
        int i3 = q6.f11628o;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z5 = q6.f11625l;
            dVar = q6.f11624k;
            try {
                V.O(obj);
                if (z5) {
                    dVar.e(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z5) {
                    dVar.e(null);
                }
                throw th;
            }
        }
        V.O(obj);
        d dVar2 = this.f11629a;
        boolean zD = dVar2.d();
        try {
            Object objValueOf = Boolean.valueOf(zD);
            q6.f11624k = dVar2;
            q6.f11625l = zD;
            q6.f11628o = 1;
            Object objD = eVar.d(objValueOf, q6);
            if (objD == obj2) {
                return obj2;
            }
            dVar = dVar2;
            z5 = zD;
            obj = objD;
            if (z5) {
                dVar.e(null);
            }
            return obj;
        } catch (Throwable th3) {
            dVar = dVar2;
            z5 = zD;
            th = th3;
            if (z5) {
                dVar.e(null);
            }
            throw th;
        }
    }
}

package p007b0;

import B0.d;
import B0.e;
import E0.g;
import E0.h;
import E0.l;
import E0.o;
import E4.k;
import G0.C0110f;
import G0.F;
import G0.G;
import I3.a;
import R4.b;
import R4.i;
import S0.m;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.lifecycle.InterfaceC0445e;
import androidx.lifecycle.InterfaceC0458s;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p012c.C;
import p080p.C0834f;
import p080p.q;
import p084p4.x;
import p124x0.AbstractC1098f;
import p124x0.D;
import p124x0.Y;
import p130y0.A0;
import p130y0.H;
import p130y0.r;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0445e, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f7029h;
    public final C i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f7030j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q f7031k = new q();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p080p.r f7032l = new p080p.r();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f7033m = 100;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7034n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f7035o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0834f f7036p = new C0834f(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f7037q = i.a(1, 0, 6);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Handler f7038r = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public q f7039s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f7040t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final q f7041u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public A0 f7042v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f7043w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a f7044x;

    public c(r rVar, C c6) {
        this.f7029h = rVar;
        this.i = c6;
        q qVar = p080p.i.f10737a;
        k.d("null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>", qVar);
        this.f7039s = qVar;
        this.f7041u = new q();
        l lVarA = rVar.getSemanticsOwner().a();
        k.d("null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>", qVar);
        this.f7042v = new A0(lVarA, qVar);
        this.f7044x = new a(8, this);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0054 A[Catch: all -> 0x0076, PHI: r2 r8
  0x0054: PHI (r2v8 R4.a) = (r2v4 R4.a), (r2v7 R4.a), (r2v9 R4.a) binds: [B:14:0x002d, B:38:0x0098, B:23:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x0054: PHI (r8v13 'this' b0.c) = (r8v6 'this' b0.c), (r8v10 'this' b0.c), (r8v0 'this' b0.c A[IMMUTABLE_TYPE, THIS]) binds: [B:14:0x002d, B:38:0x0098, B:23:0x004a] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0076, blocks: (B:24:0x0054, B:27:0x0061, B:29:0x0069, B:31:0x0072, B:34:0x007a, B:36:0x007e, B:37:0x0087, B:23:0x004a), top: B:45:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:27:0x0061 A[Catch: all -> 0x0076, PHI: r2 r8 r9
  0x0061: PHI (r2v7 R4.a) = (r2v2 R4.a), (r2v8 R4.a) binds: [B:21:0x0043, B:25:0x005e] A[DONT_GENERATE, DONT_INLINE]
  0x0061: PHI (r8v10 'this' b0.c) = (r8v3 'this' b0.c), (r8v13 'this' b0.c) binds: [B:21:0x0043, B:25:0x005e] A[DONT_GENERATE, DONT_INLINE]
  0x0061: PHI (r9v5 java.lang.Object) = (r9v1 java.lang.Object), (r9v13 java.lang.Object) binds: [B:21:0x0043, B:25:0x005e] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0076, blocks: (B:24:0x0054, B:27:0x0061, B:29:0x0069, B:31:0x0072, B:34:0x007a, B:36:0x007e, B:37:0x0087, B:23:0x004a), top: B:45:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0069 A[Catch: all -> 0x0076, TryCatch #1 {all -> 0x0076, blocks: (B:24:0x0054, B:27:0x0061, B:29:0x0069, B:31:0x0072, B:34:0x007a, B:36:0x007e, B:37:0x0087, B:23:0x004a), top: B:45:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0072 A[Catch: all -> 0x0076, TryCatch #1 {all -> 0x0076, blocks: (B:24:0x0054, B:27:0x0061, B:29:0x0069, B:31:0x0072, B:34:0x007a, B:36:0x007e, B:37:0x0087, B:23:0x004a), top: B:45:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:36:0x007e A[Catch: all -> 0x0076, TryCatch #1 {all -> 0x0076, blocks: (B:24:0x0054, B:27:0x0061, B:29:0x0069, B:31:0x0072, B:34:0x007a, B:36:0x007e, B:37:0x0087, B:23:0x004a), top: B:45:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0098 -> B:24:0x0054). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(p122w4.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof p007b0.b
            if (r0 == 0) goto L13
            r0 = r9
            b0.b r0 = (p007b0.b) r0
            int r1 = r0.f7028o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7028o = r1
            goto L18
        L13:
            b0.b r0 = new b0.b
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f7026m
            v4.a r1 = v4.a.f13292h
            int r2 = r0.f7028o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            R4.a r8 = r0.f7025l
            b0.c r2 = r0.f7024k
            S1.V.O(r9)     // Catch: java.lang.Throwable -> L31
            r7 = r2
            r2 = r8
            r8 = r7
            goto L54
        L31:
            r8 = move-exception
            goto La3
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            R4.a r8 = r0.f7025l
            b0.c r2 = r0.f7024k
            S1.V.O(r9)     // Catch: java.lang.Throwable -> L31
            r7 = r2
            r2 = r8
            r8 = r7
            goto L61
        L47:
            S1.V.O(r9)
            R4.b r9 = r8.f7037q     // Catch: java.lang.Throwable -> L76
            r9.getClass()     // Catch: java.lang.Throwable -> L76
            R4.a r2 = new R4.a     // Catch: java.lang.Throwable -> L76
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L76
        L54:
            r0.f7024k = r8     // Catch: java.lang.Throwable -> L76
            r0.f7025l = r2     // Catch: java.lang.Throwable -> L76
            r0.f7028o = r4     // Catch: java.lang.Throwable -> L76
            java.lang.Object r9 = r2.a(r0)     // Catch: java.lang.Throwable -> L76
            if (r9 != r1) goto L61
            goto L9a
        L61:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L76
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L76
            if (r9 == 0) goto L9b
            r2.c()     // Catch: java.lang.Throwable -> L76
            boolean r9 = r8.e()     // Catch: java.lang.Throwable -> L76
            if (r9 == 0) goto L7a
            r8.f()     // Catch: java.lang.Throwable -> L76
            goto L7a
        L76:
            r9 = move-exception
            r2 = r8
            r8 = r9
            goto La3
        L7a:
            boolean r9 = r8.f7043w     // Catch: java.lang.Throwable -> L76
            if (r9 != 0) goto L87
            r8.f7043w = r4     // Catch: java.lang.Throwable -> L76
            android.os.Handler r9 = r8.f7038r     // Catch: java.lang.Throwable -> L76
            I3.a r5 = r8.f7044x     // Catch: java.lang.Throwable -> L76
            r9.post(r5)     // Catch: java.lang.Throwable -> L76
        L87:
            p.f r9 = r8.f7036p     // Catch: java.lang.Throwable -> L76
            r9.clear()     // Catch: java.lang.Throwable -> L76
            long r5 = r8.f7033m     // Catch: java.lang.Throwable -> L76
            r0.f7024k = r8     // Catch: java.lang.Throwable -> L76
            r0.f7025l = r2     // Catch: java.lang.Throwable -> L76
            r0.f7028o = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r9 = P4.AbstractC0336x.e(r5, r0)     // Catch: java.lang.Throwable -> L76
            if (r9 != r1) goto L54
        L9a:
            return r1
        L9b:
            p.f r8 = r8.f7036p
            r8.clear()
            p4.x r8 = p084p4.x.f10867a
            return r8
        La3:
            p.f r9 = r2.f7036p
            r9.clear()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p007b0.c.a(w4.c):java.lang.Object");
    }

    public final q d() {
        if (this.f7035o) {
            this.f7035o = false;
            this.f7039s = H.p(this.f7029h.getSemanticsOwner());
            this.f7040t = System.currentTimeMillis();
        }
        return this.f7039s;
    }

    public final boolean e() {
        return this.f7030j != null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0065 A[LOOP:0: B:10:0x0032->B:20:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0122 A[LOOP:3: B:40:0x00f2->B:50:0x0122, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x0073 A[EDGE_INSN: B:61:0x0073->B:22:0x0073 BREAK  A[LOOP:0: B:10:0x0032->B:20:0x0065], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0125 A[EDGE_INSN: B:67:0x0125->B:51:0x0125 BREAK  A[LOOP:3: B:40:0x00f2->B:50:0x0122], SYNTHETIC] */
    public final void f() {
        long j4;
        char c6;
        long j6;
        String str;
        d dVar = this.f7030j;
        if (dVar == null) {
            return;
        }
        q qVar = this.f7031k;
        int i = qVar.f10764e;
        ContentCaptureSession contentCaptureSession = dVar.f484a;
        String str2 = "TREAT_AS_VIEW_TREE_APPEARED";
        View view = dVar.f485b;
        if (i != 0) {
            ArrayList arrayList = new ArrayList();
            Object[] objArr = qVar.f10762c;
            j4 = 255;
            long[] jArr = qVar.f10760a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                c6 = 7;
                j6 = -9187201950435737472L;
                while (true) {
                    long j7 = jArr[i3];
                    str = str2;
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j7 & 255) < 128) {
                                arrayList.add((B0.i) objArr[(i3 << 3) + i7]);
                            }
                            j7 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                        if (i3 != length) {
                            break;
                        }
                        i3++;
                        str2 = str;
                    } else if (i3 != length) {
                        break;
                        break;
                    } else {
                        i3++;
                        str2 = str;
                    }
                }
            } else {
                str = "TREAT_AS_VIEW_TREE_APPEARED";
                c6 = 7;
                j6 = -9187201950435737472L;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                arrayList2.add(((B0.i) arrayList.get(i8)).f486a);
            }
            if (Build.VERSION.SDK_INT >= 34) {
                B0.c.a(contentCaptureSession, arrayList2);
                str2 = str;
            } else {
                ViewStructure viewStructureB = B0.b.b(contentCaptureSession, view);
                B0.a.a(viewStructureB).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                B0.b.d(contentCaptureSession, viewStructureB);
                for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                    B0.b.d(contentCaptureSession, (ViewStructure) arrayList2.get(i9));
                }
                ViewStructure viewStructureB2 = B0.b.b(contentCaptureSession, view);
                str2 = str;
                B0.a.a(viewStructureB2).putBoolean(str2, true);
                B0.b.d(contentCaptureSession, viewStructureB2);
            }
            qVar.a();
        } else {
            j4 = 255;
            c6 = 7;
            j6 = -9187201950435737472L;
        }
        p080p.r rVar = this.f7032l;
        if (rVar.f10769d != 0) {
            ArrayList arrayList3 = new ArrayList();
            int[] iArr = rVar.f10767b;
            long[] jArr2 = rVar.f10766a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                while (true) {
                    long j8 = jArr2[i10];
                    if ((((~j8) << c6) & j8 & j6) == j6) {
                        if (i10 != length2) {
                            break;
                            break;
                        }
                        i10++;
                    } else {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((j8 & j4) < 128) {
                                arrayList3.add(Integer.valueOf(iArr[(i10 << 3) + i12]));
                            }
                            j8 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        } else if (i10 != length2) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int size2 = arrayList3.size();
            for (int i13 = 0; i13 < size2; i13++) {
                arrayList4.add(Long.valueOf(((Number) arrayList3.get(i13)).intValue()));
            }
            long[] jArrT0 = p089q4.l.t0(arrayList4);
            if (Build.VERSION.SDK_INT >= 34) {
                B0.b.f(contentCaptureSession, e.a(view), jArrT0);
            } else {
                ViewStructure viewStructureB3 = B0.b.b(contentCaptureSession, view);
                B0.a.a(viewStructureB3).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                B0.b.d(contentCaptureSession, viewStructureB3);
                B0.b.f(contentCaptureSession, e.a(view), jArrT0);
                ViewStructure viewStructureB4 = B0.b.b(contentCaptureSession, view);
                B0.a.a(viewStructureB4).putBoolean(str2, true);
                B0.b.d(contentCaptureSession, viewStructureB4);
            }
            rVar.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0091 A[LOOP:1: B:14:0x0044->B:29:0x0091, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0094 A[EDGE_INSN: B:48:0x0094->B:30:0x0094 BREAK  A[LOOP:1: B:14:0x0044->B:29:0x0091], SYNTHETIC] */
    public final void g(l lVar, A0 a6) {
        List listH = l.h(lVar, 4);
        int size = listH.size();
        for (int i = 0; i < size; i++) {
            l lVar2 = (l) listH.get(i);
            if (d().b(lVar2.f950g) && !a6.f14177b.c(lVar2.f950g)) {
                i(lVar2);
            }
        }
        q qVar = this.f7041u;
        int[] iArr = qVar.f10761b;
        long[] jArr = qVar.f10760a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j4 = jArr[i3];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i6 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j4) < 128) {
                            int i8 = iArr[(i3 << 3) + i7];
                            if (!d().b(i8)) {
                                q qVar2 = this.f7031k;
                                if (qVar2.c(i8)) {
                                    qVar2.h(i8);
                                } else {
                                    this.f7032l.a(i8);
                                }
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List listH2 = l.h(lVar, 4);
        int size2 = listH2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            l lVar3 = (l) listH2.get(i9);
            if (d().b(lVar3.f950g)) {
                int i10 = lVar3.f950g;
                if (qVar.b(i10)) {
                    Object objF = qVar.f(i10);
                    if (objF == null) {
                        p027e3.a.z0("node not present in pruned tree before this change");
                        throw null;
                    }
                    g(lVar3, (A0) objF);
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a3 A[LOOP:1: B:18:0x0057->B:35:0x00a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x009f A[EDGE_INSN: B:51:0x009f->B:33:0x009f BREAK  A[LOOP:1: B:18:0x0057->B:35:0x00a3], SYNTHETIC] */
    public final void h(l lVar, A0 a6) {
        p080p.r rVar = new p080p.r();
        List listH = l.h(lVar, 4);
        int size = listH.size();
        int i = 0;
        while (true) {
            x xVar = x.f10867a;
            b bVar = this.f7037q;
            C0834f c0834f = this.f7036p;
            D d6 = lVar.f946c;
            if (i >= size) {
                p080p.r rVar2 = a6.f14177b;
                int[] iArr = rVar2.f10767b;
                long[] jArr = rVar2.f10766a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j4 = jArr[i3];
                        int[] iArr2 = iArr;
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & 255) < 128 && !rVar.c(iArr2[(i3 << 3) + i7])) {
                                    if (c0834f.add(d6)) {
                                        bVar.j(xVar);
                                        return;
                                    }
                                    return;
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                            if (i3 != length) {
                                break;
                            }
                            i3++;
                            iArr = iArr2;
                        } else if (i3 != length) {
                            break;
                            break;
                        } else {
                            i3++;
                            iArr = iArr2;
                        }
                    }
                }
                List listH2 = l.h(lVar, 4);
                int size2 = listH2.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    l lVar2 = (l) listH2.get(i8);
                    if (d().b(lVar2.f950g)) {
                        Object objF = this.f7041u.f(lVar2.f950g);
                        if (objF == null) {
                            p027e3.a.z0("node not present in pruned tree before this change");
                            throw null;
                        }
                        h(lVar2, (A0) objF);
                    }
                }
                return;
            }
            l lVar3 = (l) listH.get(i);
            if (d().b(lVar3.f950g)) {
                p080p.r rVar3 = a6.f14177b;
                int i9 = lVar3.f950g;
                if (!rVar3.c(i9)) {
                    if (c0834f.add(d6)) {
                        bVar.j(xVar);
                        return;
                    }
                    return;
                }
                rVar.a(i9);
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0097 A[PHI: r8
  0x0097: PHI (r8v6 android.view.autofill.AutofillId) = (r8v5 android.view.autofill.AutofillId), (r8v51 android.view.autofill.AutofillId) binds: [B:36:0x0084, B:38:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00af  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:66:0x0104  */
    /* JADX WARN: Code duplicated, block: B:69:0x0109  */
    /* JADX WARN: Code duplicated, block: B:72:0x0118  */
    /* JADX WARN: Code duplicated, block: B:80:0x012e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0160  */
    /* JADX WARN: Code duplicated, block: B:90:0x0163  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void i(l lVar) {
        D4.c cVar;
        int iNumberOfTrailingZeros;
        ViewStructure viewStructureC;
        B0.i iVar;
        E0.r rVar;
        h hVar;
        LinkedHashMap linkedHashMap;
        Bundle bundleA;
        Object obj;
        String str;
        Object obj2;
        List list;
        Object obj3;
        C0110f c0110f;
        Object obj4;
        List list2;
        Object obj5;
        E0.e eVar;
        G gR;
        l lVarJ;
        p030f0.d dVarO;
        Y yC;
        Y y2;
        String strZ;
        D4.c cVar2;
        if (e()) {
            h hVar2 = lVar.f947d;
            E0.r rVar2 = o.f992w;
            LinkedHashMap linkedHashMap2 = hVar2.f939h;
            Object obj6 = linkedHashMap2.get(rVar2);
            B0.i iVar2 = null;
            iVar2 = null;
            iVar2 = null;
            if (obj6 == null) {
                obj6 = null;
            }
            Boolean bool = (Boolean) obj6;
            if (this.f7034n == 1 && k.a(bool, Boolean.TRUE)) {
                Object obj7 = linkedHashMap2.get(g.f922j);
                if (obj7 == null) {
                    obj7 = null;
                }
                E0.a aVar = (E0.a) obj7;
                if (aVar != null && (cVar2 = (D4.c) aVar.f903b) != null) {
                }
            } else if (this.f7034n == 2 && k.a(bool, Boolean.FALSE)) {
                Object obj8 = linkedHashMap2.get(g.f922j);
                if (obj8 == null) {
                    obj8 = null;
                }
                E0.a aVar2 = (E0.a) obj8;
                if (aVar2 != null && (cVar = (D4.c) aVar2.f903b) != null) {
                }
            }
            d dVar = this.f7030j;
            char c6 = '\b';
            int i = lVar.f950g;
            if (dVar != null) {
                AutofillId autofillIdA = e.a(this.f7029h);
                l lVarJ2 = lVar.j();
                ContentCaptureSession contentCaptureSession = dVar.f484a;
                if (lVarJ2 != null) {
                    autofillIdA = B0.b.a(contentCaptureSession, e.a(dVar.f485b), lVarJ2.f950g);
                    if (autofillIdA != null) {
                        viewStructureC = B0.b.c(contentCaptureSession, autofillIdA, i);
                        iVar = new B0.i(viewStructureC);
                        rVar = o.f967C;
                        hVar = lVar.f947d;
                        linkedHashMap = hVar.f939h;
                        if (!linkedHashMap.containsKey(rVar)) {
                            bundleA = B0.h.a(viewStructureC);
                            if (bundleA != null) {
                                bundleA.putLong("android.view.contentcapture.EventTimestamp", this.f7040t);
                            }
                            obj = linkedHashMap.get(o.f989t);
                            if (obj == null) {
                                obj = null;
                            }
                            str = (String) obj;
                            if (str != null) {
                                viewStructureC.setId(i, null, null, str);
                            }
                            obj2 = linkedHashMap.get(o.f990u);
                            if (obj2 == null) {
                                obj2 = null;
                            }
                            list = (List) obj2;
                            if (list != null) {
                                B0.h.b(viewStructureC, "android.widget.TextView");
                                B0.h.e(viewStructureC, G4.a.r("\n", list));
                            }
                            obj3 = linkedHashMap.get(o.f993x);
                            if (obj3 == null) {
                                obj3 = null;
                            }
                            c0110f = (C0110f) obj3;
                            if (c0110f != null) {
                                B0.h.b(viewStructureC, "android.widget.EditText");
                                B0.h.e(viewStructureC, c0110f);
                            }
                            obj4 = linkedHashMap.get(o.f971a);
                            if (obj4 == null) {
                                obj4 = null;
                            }
                            list2 = (List) obj4;
                            if (list2 != null) {
                                B0.h.c(viewStructureC, G4.a.r("\n", list2));
                            }
                            obj5 = linkedHashMap.get(o.f988s);
                            if (obj5 == null) {
                                obj5 = null;
                            }
                            eVar = (E0.e) obj5;
                            if (eVar != null && (strZ = H.z(eVar.f911a)) != null) {
                                B0.h.b(viewStructureC, strZ);
                            }
                            gR = H.r(hVar);
                            if (gR != null) {
                                F f6 = gR.f1458a;
                                float fC = m.c(f6.f1450b.f1472a.f1429b);
                                S0.b bVar = f6.f1455g;
                                B0.h.f(viewStructureC, bVar.n() * bVar.a() * fC, 0, 0, 0);
                            }
                            lVarJ = lVar.j();
                            dVarO = p030f0.d.f8838e;
                            if (lVarJ != null && (yC = lVar.c()) != null) {
                                y2 = yC.M0().f5969t ? yC : null;
                                if (y2 != null) {
                                    dVarO = AbstractC1098f.q(lVarJ.f944a, 8).o(y2, true);
                                }
                            }
                            B0.h.d(viewStructureC, (int) dVarO.f8839a, (int) dVarO.f8840b, 0, 0, (int) dVarO.c(), (int) dVarO.b());
                            iVar2 = iVar;
                        }
                    }
                } else {
                    viewStructureC = B0.b.c(contentCaptureSession, autofillIdA, i);
                    iVar = new B0.i(viewStructureC);
                    rVar = o.f967C;
                    hVar = lVar.f947d;
                    linkedHashMap = hVar.f939h;
                    if (!linkedHashMap.containsKey(rVar)) {
                        bundleA = B0.h.a(viewStructureC);
                        if (bundleA != null) {
                            bundleA.putLong("android.view.contentcapture.EventTimestamp", this.f7040t);
                        }
                        obj = linkedHashMap.get(o.f989t);
                        if (obj == null) {
                            obj = null;
                        }
                        str = (String) obj;
                        if (str != null) {
                            viewStructureC.setId(i, null, null, str);
                        }
                        obj2 = linkedHashMap.get(o.f990u);
                        if (obj2 == null) {
                            obj2 = null;
                        }
                        list = (List) obj2;
                        if (list != null) {
                            B0.h.b(viewStructureC, "android.widget.TextView");
                            B0.h.e(viewStructureC, G4.a.r("\n", list));
                        }
                        obj3 = linkedHashMap.get(o.f993x);
                        if (obj3 == null) {
                            obj3 = null;
                        }
                        c0110f = (C0110f) obj3;
                        if (c0110f != null) {
                            B0.h.b(viewStructureC, "android.widget.EditText");
                            B0.h.e(viewStructureC, c0110f);
                        }
                        obj4 = linkedHashMap.get(o.f971a);
                        if (obj4 == null) {
                            obj4 = null;
                        }
                        list2 = (List) obj4;
                        if (list2 != null) {
                            B0.h.c(viewStructureC, G4.a.r("\n", list2));
                        }
                        obj5 = linkedHashMap.get(o.f988s);
                        if (obj5 == null) {
                            obj5 = null;
                        }
                        eVar = (E0.e) obj5;
                        if (eVar != null) {
                            B0.h.b(viewStructureC, strZ);
                        }
                        gR = H.r(hVar);
                        if (gR != null) {
                            F f7 = gR.f1458a;
                            float fC2 = m.c(f7.f1450b.f1472a.f1429b);
                            S0.b bVar2 = f7.f1455g;
                            B0.h.f(viewStructureC, bVar2.n() * bVar2.a() * fC2, 0, 0, 0);
                        }
                        lVarJ = lVar.j();
                        dVarO = p030f0.d.f8838e;
                        if (lVarJ != null) {
                            if (yC.M0().f5969t) {
                            }
                            if (y2 != null) {
                                dVarO = AbstractC1098f.q(lVarJ.f944a, 8).o(y2, true);
                            }
                        }
                        B0.h.d(viewStructureC, (int) dVarO.f8839a, (int) dVarO.f8840b, 0, 0, (int) dVarO.c(), (int) dVarO.b());
                        iVar2 = iVar;
                    }
                }
            }
            if (iVar2 != null) {
                p080p.r rVar3 = this.f7032l;
                if (rVar3.c(i)) {
                    int iHashCode = Integer.hashCode(i) * (-862048943);
                    int i3 = iHashCode ^ (iHashCode << 16);
                    int i6 = i3 & 127;
                    int i7 = rVar3.f10768c;
                    int i8 = (i3 >>> 7) & i7;
                    int i9 = 0;
                    loop0: while (true) {
                        long[] jArr = rVar3.f10766a;
                        int i10 = i8 >> 3;
                        int i11 = (i8 & 7) << 3;
                        char c7 = c6;
                        int i12 = i8;
                        long j4 = (((-i11) >> 63) & (jArr[i10 + 1] << (64 - i11))) | (jArr[i10] >>> i11);
                        long j6 = (((long) i6) * 72340172838076673L) ^ j4;
                        for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                            iNumberOfTrailingZeros = (i12 + (Long.numberOfTrailingZeros(j7) >> 3)) & i7;
                            if (rVar3.f10767b[iNumberOfTrailingZeros] == i) {
                                break loop0;
                            }
                        }
                        if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                            iNumberOfTrailingZeros = -1;
                            break;
                        } else {
                            i9 += 8;
                            i8 = (i12 + i9) & i7;
                            c6 = c7;
                        }
                    }
                    if (iNumberOfTrailingZeros >= 0) {
                        rVar3.f(iNumberOfTrailingZeros);
                    }
                } else {
                    this.f7031k.i(i, iVar2);
                }
            }
            List listH = l.h(lVar, 4);
            int size = listH.size();
            for (int i13 = 0; i13 < size; i13++) {
                i((l) listH.get(i13));
            }
        }
    }

    public final void j(l lVar) {
        if (e()) {
            int i = lVar.f950g;
            q qVar = this.f7031k;
            if (qVar.c(i)) {
                qVar.h(i);
            } else {
                this.f7032l.a(i);
            }
            List listH = l.h(lVar, 4);
            int size = listH.size();
            for (int i3 = 0; i3 < size; i3++) {
                j((l) listH.get(i3));
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0445e
    public final void k(InterfaceC0458s interfaceC0458s) {
        this.f7030j = (d) this.i.invoke();
        i(this.f7029h.getSemanticsOwner().a());
        f();
    }

    @Override // androidx.lifecycle.InterfaceC0445e
    public final void o(InterfaceC0458s interfaceC0458s) {
        j(this.f7029h.getSemanticsOwner().a());
        f();
        this.f7030j = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f7038r.removeCallbacks(this.f7044x);
        this.f7030j = null;
    }
}

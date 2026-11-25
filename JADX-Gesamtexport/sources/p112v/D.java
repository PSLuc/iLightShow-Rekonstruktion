package p112v;

import D4.e;
import E4.w;
import S1.V;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import p091r0.i;
import p091r0.p;
import p091r0.q;
import p091r0.y;
import p122w4.c;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f12793a = ((float) 0.125d) / 18;

    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083 A[LOOP:0: B:23:0x006f->B:27:0x0083, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0087 A[EDGE_INSN: B:54:0x0087->B:29:0x0087 BREAK  A[LOOP:0: B:23:0x006f->B:27:0x0083], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0060 -> B:22:0x0065). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(p091r0.y r17, long r18, p122w4.c r20) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p112v.D.a(r0.y, long, w4.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, java.util.List] */
    public static final Object b(y yVar, long j4, c cVar) {
        C1010w c1010w;
        Object obj;
        q qVar;
        w wVar;
        if (cVar instanceof C1010w) {
            c1010w = (C1010w) cVar;
            int i = c1010w.f13085n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1010w.f13085n = i - Integer.MIN_VALUE;
            } else {
                c1010w = new C1010w(cVar);
            }
        } else {
            c1010w = new C1010w(cVar);
        }
        Object obj2 = c1010w.f13084m;
        Object obj3 = a.f13292h;
        int i3 = c1010w.f13085n;
        if (i3 == 0) {
            V.O(obj2);
            if (!e(yVar.f11548l.f11468z, j4)) {
                ?? r12 = yVar.f11548l.f11468z.f11494a;
                int size = r12.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size) {
                        obj = null;
                        break;
                    }
                    obj = r12.get(i6);
                    if (p.a(((q) obj).f11508a, j4)) {
                        break;
                    }
                    i6++;
                }
                qVar = (q) obj;
                if (qVar != null) {
                    w wVar2 = new w();
                    w wVar3 = new w();
                    wVar3.f1074h = qVar;
                    long jC = yVar.d().c();
                    try {
                        e c1012x = new C1012x(wVar3, wVar2, null);
                        c1010w.f13082k = qVar;
                        c1010w.f13083l = wVar2;
                        c1010w.f13085n = 1;
                        if (yVar.j(jC, c1012x, c1010w) == obj3) {
                            return obj3;
                        }
                    } catch (PointerEventTimeoutCancellationException unused) {
                        wVar = wVar2;
                    }
                }
            }
            return null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        wVar = c1010w.f13083l;
        qVar = c1010w.f13082k;
        try {
            V.O(obj2);
            return null;
        } catch (PointerEventTimeoutCancellationException unused2) {
        }
        q qVar2 = (q) wVar.f1074h;
        return qVar2 == null ? qVar : qVar2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(p091r0.y r4, long r5, D4.c r7, p122w4.c r8) {
        /*
            boolean r0 = r8 instanceof p112v.B
            if (r0 == 0) goto L13
            r0 = r8
            v.B r0 = (p112v.B) r0
            int r1 = r0.f12778n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12778n = r1
            goto L18
        L13:
            v.B r0 = new v.B
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f12777m
            v4.a r1 = v4.a.f13292h
            int r2 = r0.f12778n
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            D4.c r4 = r0.f12776l
            r0.y r5 = r0.f12775k
            S1.V.O(r8)
            r7 = r4
            r4 = r5
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            S1.V.O(r8)
        L38:
            r0.f12775k = r4
            r0.f12776l = r7
            r0.f12778n = r3
            java.lang.Object r8 = a(r4, r5, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            r0.q r8 = (p091r0.q) r8
            if (r8 != 0) goto L4c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4c:
            boolean r5 = p091r0.o.c(r8)
            if (r5 == 0) goto L55
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L55:
            r7.invoke(r8)
            long r5 = r8.f11508a
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: p112v.D.c(r0.y, long, D4.c, w4.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code duplicated, block: B:28:0x009f A[LOOP:0: B:24:0x0088->B:28:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x00a9 A[EDGE_INSN: B:71:0x00a9->B:30:0x00a9 BREAK  A[LOOP:0: B:24:0x0088->B:28:0x009f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0079 -> B:23:0x007f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(p091r0.y r18, long r19, B.C0005c0 r21, p122w4.a r22) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p112v.D.d(r0.y, long, B.c0, w4.a):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public static final boolean e(i iVar, long j4) {
        Object obj;
        ?? r6 = iVar.f11494a;
        int size = r6.size();
        boolean z5 = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = r6.get(i);
            if (p.a(((q) obj).f11508a, j4)) {
                break;
            }
            i++;
        }
        q qVar = (q) obj;
        if (qVar != null && qVar.f11511d) {
            z5 = true;
        }
        return true ^ z5;
    }
}

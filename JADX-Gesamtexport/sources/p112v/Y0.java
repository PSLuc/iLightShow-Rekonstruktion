package p112v;

import D4.c;
import D4.f;
import P4.AbstractC0336x;
import p084p4.x;
import p091r0.A;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N f12938a = new N(3, null, 2);

    /* JADX WARN: Code duplicated, block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004d A[LOOP:0: B:19:0x004b->B:20:0x004d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c A[LOOP:1: B:22:0x005f->B:26:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0061
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(p091r0.y r8, p122w4.a r9) {
        /*
            boolean r0 = r9 instanceof p112v.C0
            if (r0 == 0) goto L13
            r0 = r9
            v.C0 r0 = (p112v.C0) r0
            int r1 = r0.f12792m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12792m = r1
            goto L18
        L13:
            v.C0 r0 = new v.C0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f12791l
            v4.a r1 = v4.a.f13292h
            int r2 = r0.f12792m
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            r0.y r8 = r0.f12790k
            S1.V.O(r9)
            goto L41
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            S1.V.O(r9)
        L34:
            r0.f12790k = r8
            r0.f12792m = r3
            r0.j r9 = p091r0.j.i
            java.lang.Object r9 = r8.b(r9, r0)
            if (r9 != r1) goto L41
            return r1
        L41:
            r0.i r9 = (p091r0.i) r9
            java.lang.Object r2 = r9.f11494a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L4b:
            if (r6 >= r4) goto L59
            java.lang.Object r7 = r2.get(r6)
            r0.q r7 = (p091r0.q) r7
            r7.a()
            int r6 = r6 + 1
            goto L4b
        L59:
            java.lang.Object r9 = r9.f11494a
            int r2 = r9.size()
        L5f:
            if (r5 >= r2) goto L6f
            java.lang.Object r4 = r9.get(r5)
            r0.q r4 = (p091r0.q) r4
            boolean r4 = r4.f11511d
            if (r4 == 0) goto L6c
            goto L34
        L6c:
            int r5 = r5 + 1
            goto L5f
        L6f:
            p4.x r8 = p084p4.x.f10867a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p112v.Y0.a(r0.y, w4.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0079 A[LOOP:0: B:19:0x0055->B:33:0x0079, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(p091r0.y r10, boolean r11, p091r0.j r12, p122w4.a r13) {
        /*
            boolean r0 = r13 instanceof p112v.A0
            if (r0 == 0) goto L13
            r0 = r13
            v.A0 r0 = (p112v.A0) r0
            int r1 = r0.f12774o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12774o = r1
            goto L18
        L13:
            v.A0 r0 = new v.A0
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f12773n
            v4.a r1 = v4.a.f13292h
            int r2 = r0.f12774o
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r10 = r0.f12772m
            r0.j r11 = r0.f12771l
            r0.y r12 = r0.f12770k
            S1.V.O(r13)
            r9 = r11
            r11 = r10
            r10 = r12
            r12 = r9
            goto L4b
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            S1.V.O(r13)
        L3c:
            r0.f12770k = r10
            r0.f12771l = r12
            r0.f12772m = r11
            r0.f12774o = r3
            java.lang.Object r13 = r10.b(r12, r0)
            if (r13 != r1) goto L4b
            return r1
        L4b:
            r0.i r13 = (p091r0.i) r13
            java.lang.Object r2 = r13.f11494a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L55:
            if (r6 >= r4) goto L7c
            java.lang.Object r7 = r2.get(r6)
            r0.q r7 = (p091r0.q) r7
            if (r11 == 0) goto L71
            boolean r8 = r7.b()
            if (r8 != 0) goto L6f
            boolean r8 = r7.f11515h
            if (r8 != 0) goto L6f
            boolean r7 = r7.f11511d
            if (r7 == 0) goto L6f
            r7 = r3
            goto L75
        L6f:
            r7 = r5
            goto L75
        L71:
            boolean r7 = p091r0.o.a(r7)
        L75:
            if (r7 != 0) goto L79
            r2 = r5
            goto L7d
        L79:
            int r6 = r6 + 1
            goto L55
        L7c:
            r2 = r3
        L7d:
            if (r2 == 0) goto L3c
            java.lang.Object r10 = r13.f11494a
            java.lang.Object r10 = r10.get(r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p112v.Y0.b(r0.y, boolean, r0.j, w4.a):java.lang.Object");
    }

    public static Object d(A a6, f fVar, c cVar, i iVar, int i) throws Throwable {
        if ((i & 4) != 0) {
            fVar = f12938a;
        }
        f fVar2 = fVar;
        if ((i & 8) != 0) {
            cVar = null;
        }
        Object objD = AbstractC0336x.d(new W0(a6, fVar2, null, null, cVar, null), iVar);
        return objD == a.f13292h ? objD : x.f10867a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d2 A[LOOP:1: B:23:0x006f->B:46:0x00d2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ca A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b0 -> B:13:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:25:0x0073
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(p091r0.y r17, p091r0.j r18, p122w4.a r19) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p112v.Y0.e(r0.y, r0.j, w4.a):java.lang.Object");
    }
}

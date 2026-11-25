package p112v;

import p096s.C0920m;
import p096s.InterfaceC0918k;
import p096s.x0;
import p096s.y0;

/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0920m f12956f = new C0920m(0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f12957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f12958b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0920m f12959c = f12956f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f12961e;

    public b1(InterfaceC0918k interfaceC0918k) {
        this.f12957a = interfaceC0918k.a(x0.f12138a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0078 A[Catch: all -> 0x00e9, PHI: r12 r13 r14 r15
  0x0078: PHI (r12v6 'this' v.b1) = (r12v0 'this' v.b1 A[IMMUTABLE_TYPE, THIS]), (r12v7 'this' v.b1) binds: [B:30:0x0076, B:39:0x00af] A[DONT_GENERATE, DONT_INLINE]
  0x0078: PHI (r13v6 ??) = (r13v22 ??), (r13v23 ??) binds: [B:30:0x0076, B:39:0x00af] A[DONT_GENERATE, DONT_INLINE]
  0x0078: PHI (r14v7 D4.a) = (r14v13 D4.a), (r14v14 D4.a) binds: [B:30:0x0076, B:39:0x00af] A[DONT_GENERATE, DONT_INLINE]
  0x0078: PHI (r15v13 float) = (r15v7 float), (r15v14 float) binds: [B:30:0x0076, B:39:0x00af] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x00e9, blocks: (B:37:0x00aa, B:31:0x0078, B:34:0x008a), top: B:60:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0085 A[PHI: r12 r13 r14
  0x0085: PHI (r12v4 'this' v.b1) = (r12v6 'this' v.b1), (r12v7 'this' v.b1) binds: [B:32:0x0083, B:39:0x00af] A[DONT_GENERATE, DONT_INLINE]
  0x0085: PHI (r13v4 ??) = (r13v24 ??), (r13v25 ??) binds: [B:32:0x0083, B:39:0x00af] A[DONT_GENERATE, DONT_INLINE]
  0x0085: PHI (r14v1 D4.a) = (r14v15 D4.a), (r14v16 D4.a) binds: [B:32:0x0083, B:39:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x008a A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:37:0x00aa, B:31:0x0078, B:34:0x008a), top: B:60:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0032, B:47:0x00dd, B:41:0x00b2, B:44:0x00bd), top: B:58:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa A[EXC_TOP_SPLITTER, PHI: r12 r13 r14 r15
  0x00aa: PHI (r12v7 'this' v.b1) = (r12v6 'this' v.b1), (r12v13 'this' v.b1) binds: [B:35:0x00a7, B:21:0x004f] A[DONT_GENERATE, DONT_INLINE]
  0x00aa: PHI (r13v7 ??) = (r13v21 ??), (r13v14 ??) binds: [B:35:0x00a7, B:21:0x004f] A[DONT_GENERATE, DONT_INLINE]
  0x00aa: PHI (r14v8 D4.a) = (r14v12 D4.a), (r14v11 D4.a) binds: [B:35:0x00a7, B:21:0x004f] A[DONT_GENERATE, DONT_INLINE]
  0x00aa: PHI (r15v14 float) = (r15v13 float), (r15v16 float) binds: [B:35:0x00a7, B:21:0x004f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [B.n] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [v.b1] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2, types: [v.b1] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, p4.e] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a7 -> B:60:0x00aa). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(B.C0026n r13, B.c1 r14, p122w4.c r15) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p112v.b1.a(B.n, B.c1, w4.c):java.lang.Object");
    }
}

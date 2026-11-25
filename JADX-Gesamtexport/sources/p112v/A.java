package p112v;

import D4.a;
import D4.c;
import D4.e;
import D4.f;
import E4.l;
import E4.v;
import p084p4.x;
import p091r0.q;
import p091r0.y;
import p111u4.d;
import p122w4.h;

/* JADX INFO: loaded from: classes.dex */
public final class A extends h implements e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f12753j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f12754k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f12755l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public v f12756m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Z0 f12757n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q f12758o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f12759p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f12760q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12761r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ d f12762s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l f12763t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ v f12764u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ W f12765v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f12766w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f12767x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a f12768y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ l f12769z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public A(a aVar, v vVar, W w6, f fVar, e eVar, a aVar2, c cVar, d dVar) {
        super(2, dVar);
        this.f12763t = (l) aVar;
        this.f12764u = vVar;
        this.f12765v = w6;
        this.f12766w = (l) fVar;
        this.f12767x = eVar;
        this.f12768y = aVar2;
        this.f12769z = (l) cVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [D4.a, E4.l] */
    /* JADX WARN: Type inference failed for: r4v0, types: [D4.f, E4.l] */
    /* JADX WARN: Type inference failed for: r7v0, types: [D4.c, E4.l] */
    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        ?? r7 = this.f12769z;
        A a6 = new A(this.f12763t, this.f12764u, this.f12765v, this.f12766w, this.f12767x, this.f12768y, r7, dVar);
        a6.f12762s = (d) obj;
        return a6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((A) b((y) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:117:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:118:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:166:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:167:0x03be  */
    /* JADX WARN: Code duplicated, block: B:177:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0155  */
    /* JADX WARN: Code duplicated, block: B:46:0x0172 A[LOOP:2: B:42:0x0153->B:46:0x0172, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [D4.a, E4.l] */
    /* JADX WARN: Type inference failed for: r3v2, types: [D4.f, E4.l] */
    /* JADX WARN: Type inference failed for: r3v55, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x027e -> B:101:0x0282). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x02a8 -> B:105:0x02ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x0321 -> B:123:0x0324). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00fe -> B:31:0x0104). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x01b5 -> B:101:0x0282). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p122w4.a
    public final java.lang.Object o(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 991
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p112v.A.o(java.lang.Object):java.lang.Object");
    }
}

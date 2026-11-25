package p112v;

import D4.e;
import p084p4.x;
import p091r0.y;
import p111u4.d;
import p111u4.i;
import p122w4.h;

/* JADX INFO: loaded from: classes.dex */
public final class V extends h implements e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12906j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ d f12907k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f12908l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f12909m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public V(i iVar, e eVar, d dVar) {
        super(2, dVar);
        this.f12908l = iVar;
        this.f12909m = (h) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [D4.e, w4.h] */
    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        V v6 = new V(this.f12908l, this.f12909m, dVar);
        v6.f12907k = (d) obj;
        return v6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((V) b((y) obj, (d) obj2)).o(x.f10867a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:40|21|(2:24|25)|34) */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r9 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        r1 = r9;
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        if (r9 == r0) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [r0.y, u4.d] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [r0.y, u4.d] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [D4.e, w4.h] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, u4.d] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0057 -> B:12:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x006c -> B:12:0x0028). Please report as a decompilation issue!!! */
    @Override // p122w4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            v4.a r0 = v4.a.f13292h
            int r1 = r8.f12906j
            u4.i r2 = r8.f12908l
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L34
            if (r1 == r5) goto L2c
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            u4.d r1 = r8.f12907k
            r0.y r1 = (p091r0.y) r1
            S1.V.O(r9)
            goto L28
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L21:
            u4.d r1 = r8.f12907k
            r0.y r1 = (p091r0.y) r1
            S1.V.O(r9)     // Catch: java.util.concurrent.CancellationException -> L2a
        L28:
            r9 = r1
            goto L3b
        L2a:
            r9 = move-exception
            goto L5e
        L2c:
            u4.d r1 = r8.f12907k
            r0.y r1 = (p091r0.y) r1
            S1.V.O(r9)     // Catch: java.util.concurrent.CancellationException -> L2a
            goto L4f
        L34:
            S1.V.O(r9)
            u4.d r9 = r8.f12907k
            r0.y r9 = (p091r0.y) r9
        L3b:
            boolean r1 = P4.AbstractC0336x.n(r2)
            if (r1 == 0) goto L70
            w4.h r1 = r8.f12909m     // Catch: java.util.concurrent.CancellationException -> L5a
            r8.f12907k = r9     // Catch: java.util.concurrent.CancellationException -> L5a
            r8.f12906j = r5     // Catch: java.util.concurrent.CancellationException -> L5a
            java.lang.Object r1 = r1.d(r9, r8)     // Catch: java.util.concurrent.CancellationException -> L5a
            if (r1 != r0) goto L4e
            goto L6e
        L4e:
            r1 = r9
        L4f:
            r8.f12907k = r1     // Catch: java.util.concurrent.CancellationException -> L2a
            r8.f12906j = r4     // Catch: java.util.concurrent.CancellationException -> L2a
            java.lang.Object r9 = p006b.a.m(r1, r8)     // Catch: java.util.concurrent.CancellationException -> L2a
            if (r9 != r0) goto L28
            goto L6e
        L5a:
            r1 = move-exception
            r7 = r1
            r1 = r9
            r9 = r7
        L5e:
            boolean r6 = P4.AbstractC0336x.n(r2)
            if (r6 == 0) goto L6f
            r8.f12907k = r1
            r8.f12906j = r3
            java.lang.Object r9 = p006b.a.m(r1, r8)
            if (r9 != r0) goto L28
        L6e:
            return r0
        L6f:
            throw r9
        L70:
            p4.x r8 = p084p4.x.f10867a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p112v.V.o(java.lang.Object):java.lang.Object");
    }
}

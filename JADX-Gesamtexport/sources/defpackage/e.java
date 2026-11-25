package defpackage;

import P4.InterfaceC0335w;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.NoSuchAlgorithmException;
import p084p4.x;
import p111u4.d;
import p122w4.i;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class e extends i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8634l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f8635m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(long j4, d dVar) {
        super(2, dVar);
        this.f8635m = j4;
    }

    @Override // p122w4.a
    public final d b(Object obj, d dVar) {
        return new e(this.f8635m, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) throws IllegalAccessException, NoSuchAlgorithmException, IOException, InvocationTargetException {
        ((e) b((InterfaceC0335w) obj, (d) obj2)).o(x.f10867a);
        return a.f13292h;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #2 {all -> 0x0085, blocks: (B:24:0x0069, B:25:0x0077, B:27:0x007d), top: B:71:0x0069 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:47:0x0136 A[LOOP:2: B:46:0x0134->B:47:0x0136, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x0178 A[Catch: Exception -> 0x017c, TryCatch #1 {Exception -> 0x017c, blocks: (B:49:0x016a, B:51:0x0178, B:54:0x017e, B:56:0x0188, B:57:0x018c), top: B:69:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:54:0x017e A[Catch: Exception -> 0x017c, TryCatch #1 {Exception -> 0x017c, blocks: (B:49:0x016a, B:51:0x0178, B:54:0x017e, B:56:0x0188, B:57:0x018c), top: B:69:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0188 A[Catch: Exception -> 0x017c, TryCatch #1 {Exception -> 0x017c, blocks: (B:49:0x016a, B:51:0x0178, B:54:0x017e, B:56:0x0188, B:57:0x018c), top: B:69:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:78:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [q4.u] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [d5.c, d5.n, java.lang.Object] */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01c4 -> B:11:0x001d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p122w4.a
    public final java.lang.Object o(java.lang.Object r14) throws java.lang.IllegalAccessException, java.security.NoSuchAlgorithmException, java.io.IOException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e.o(java.lang.Object):java.lang.Object");
    }
}

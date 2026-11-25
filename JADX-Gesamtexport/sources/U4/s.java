package U4;

import S1.V;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5378a = 0;

    static {
        Object objV;
        Object objV2;
        Exception exc = new Exception();
        String simpleName = p006b.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objV = p122w4.a.class.getCanonicalName();
        } catch (Throwable th) {
            objV = V.v(th);
        }
        if (p084p4.k.a(objV) != null) {
            objV = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objV2 = s.class.getCanonicalName();
        } catch (Throwable th2) {
            objV2 = V.v(th2);
        }
        if (p084p4.k.a(objV2) != null) {
            objV2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}

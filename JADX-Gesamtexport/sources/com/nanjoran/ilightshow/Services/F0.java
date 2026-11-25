package com.nanjoran.ilightshow.Services;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.nanjoran.ilightshow.Services.F0[], still in use, count: 1, list:
  (r0v1 com.nanjoran.ilightshow.Services.F0[]) from 0x0036: INVOKE (r0v1 com.nanjoran.ilightshow.Services.F0[]) STATIC call: p0.c.i0(java.lang.Enum[]):x4.b A[MD:(java.lang.Enum[]):x4.b (m), WRAPPED]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class F0 implements Comparable {
    NONE(0),
    STARTER_PACK(1),
    OLD_PRO(2),
    /* JADX INFO: Fake field, exist only in values array */
    LITE_V3(3),
    MEMBERSHIP_V3(4);

    public static final C0691q i = new C0691q();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ p128x4.b f8261o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8262h;

    static {
        f8261o = p081p0.c.i0(new F0[]{r0, r1, r2, r3, r4});
    }

    public F0(int i3) {
        super(str, i);
        this.f8262h = i3;
    }

    public static F0 valueOf(String str) {
        return (F0) Enum.valueOf(F0.class, str);
    }

    public static F0[] values() {
        return (F0[]) f8260n.clone();
    }
}

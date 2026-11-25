package w5;

import java.util.LinkedHashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 w5.n0[], still in use, count: 1, list:
  (r0v1 w5.n0[]) from 0x0039: INVOKE (r0v1 w5.n0[]) STATIC call: p0.c.i0(java.lang.Enum[]):x4.b A[MD:(java.lang.Enum[]):x4.b (m)]
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
public final class n0 {
    /* JADX INFO: Fake field, exist only in values array */
    SAW((byte) 0),
    /* JADX INFO: Fake field, exist only in values array */
    SINE((byte) 1),
    /* JADX INFO: Fake field, exist only in values array */
    HALF_SINE((byte) 2),
    /* JADX INFO: Fake field, exist only in values array */
    TRIANGLE((byte) 3),
    /* JADX INFO: Fake field, exist only in values array */
    PULSE((byte) 4),
    UNKNOWN((byte) 6);

    public static final q5.n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final LinkedHashMap f13643j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte f13646h;

    static {
        p081p0.c.i0(new n0[]{r0, r1, r2, r3, r4, r5});
        i = new q5.n(10);
        n0[] n0VarArrValues = values();
        int iS = p089q4.z.S(n0VarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
        for (n0 n0Var : n0VarArrValues) {
            linkedHashMap.put(Byte.valueOf(n0Var.f13646h), n0Var);
        }
        f13643j = linkedHashMap;
    }

    public n0(byte b6) {
        super(str, i);
        this.f13646h = b6;
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) f13645l.clone();
    }
}

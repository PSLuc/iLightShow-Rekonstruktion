package w5;

import java.util.LinkedHashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 w5.K[], still in use, count: 1, list:
  (r0v1 w5.K[]) from 0x0023: INVOKE (r0v1 w5.K[]) STATIC call: p0.c.i0(java.lang.Enum[]):x4.b A[MD:(java.lang.Enum[]):x4.b (m)]
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
public final class K {
    OFF((short) 0),
    /* JADX INFO: Fake field, exist only in values array */
    ON((short) -1),
    UNKNOWN((short) 1);

    public static final q5.n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final LinkedHashMap f13502j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final short f13506h;

    static {
        p081p0.c.i0(new K[]{r0, r1, r3});
        i = new q5.n(9);
        K[] kArrValues = values();
        int iS = p089q4.z.S(kArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
        for (K k3 : kArrValues) {
            linkedHashMap.put(Short.valueOf(k3.f13506h), k3);
        }
        f13502j = linkedHashMap;
    }

    public K(short s6) {
        super(str, i);
        this.f13506h = s6;
    }

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K[] values() {
        return (K[]) f13505m.clone();
    }
}

package w5;

import java.util.LinkedHashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 w5.L[], still in use, count: 1, list:
  (r0v1 w5.L[]) from 0x0018: INVOKE (r0v1 w5.L[]) STATIC call: p0.c.i0(java.lang.Enum[]):x4.b A[MD:(java.lang.Enum[]):x4.b (m)]
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
public final class L {
    /* JADX INFO: Fake field, exist only in values array */
    UDP((byte) 1),
    UNKNOWN((byte) 0);

    public static final p085q.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final LinkedHashMap f13507j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte f13510h;

    static {
        p081p0.c.i0(new L[]{r0, r1});
        i = new p085q.b(10);
        L[] lArrValues = values();
        int iS = p089q4.z.S(lArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
        for (L l6 : lArrValues) {
            linkedHashMap.put(Byte.valueOf(l6.f13510h), l6);
        }
        f13507j = linkedHashMap;
    }

    public L(byte b6) {
        super(str, i);
        this.f13510h = b6;
    }

    public static L valueOf(String str) {
        return (L) Enum.valueOf(L.class, str);
    }

    public static L[] values() {
        return (L[]) f13509l.clone();
    }
}

package w5;

import java.util.LinkedHashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 w5.c[], still in use, count: 1, list:
  (r0v1 w5.c[]) from 0x0028: INVOKE (r0v1 w5.c[]) STATIC call: p0.c.i0(java.lang.Enum[]):x4.b A[MD:(java.lang.Enum[]):x4.b (m)]
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
/* JADX INFO: renamed from: w5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1045c {
    /* JADX INFO: Fake field, exist only in values array */
    NO_APPLY((byte) 0),
    /* JADX INFO: Fake field, exist only in values array */
    APPLY((byte) 1),
    /* JADX INFO: Fake field, exist only in values array */
    APPLY_ONLY((byte) 2),
    UNKNOWN((byte) 3);

    public static final p085q.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final LinkedHashMap f13570j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte f13573h;

    static {
        p081p0.c.i0(new EnumC1045c[]{r0, r1, r3, r4});
        i = new p085q.b(9);
        EnumC1045c[] enumC1045cArrValues = values();
        int iS = p089q4.z.S(enumC1045cArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
        for (EnumC1045c enumC1045c : enumC1045cArrValues) {
            linkedHashMap.put(Byte.valueOf(enumC1045c.f13573h), enumC1045c);
        }
        f13570j = linkedHashMap;
    }

    public EnumC1045c(byte b6) {
        super(str, i);
        this.f13573h = b6;
    }

    public static EnumC1045c valueOf(String str) {
        return (EnumC1045c) Enum.valueOf(EnumC1045c.class, str);
    }

    public static EnumC1045c[] values() {
        return (EnumC1045c[]) f13572l.clone();
    }
}

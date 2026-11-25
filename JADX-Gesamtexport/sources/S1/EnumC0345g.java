package S1;

import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: S1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0345g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC0345g f4936h;
    public static final EnumC0345g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC0345g f4937j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC0345g f4938k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ EnumC0345g[] f4939l;

    static {
        EnumC0345g enumC0345g = new EnumC0345g("ANY", 0);
        f4936h = enumC0345g;
        EnumC0345g enumC0345g2 = new EnumC0345g("NON_PRIVATE", 1);
        EnumC0345g enumC0345g3 = new EnumC0345g("PROTECTED_AND_PUBLIC", 2);
        EnumC0345g enumC0345g4 = new EnumC0345g("PUBLIC_ONLY", 3);
        i = enumC0345g4;
        EnumC0345g enumC0345g5 = new EnumC0345g("NONE", 4);
        f4937j = enumC0345g5;
        EnumC0345g enumC0345g6 = new EnumC0345g("DEFAULT", 5);
        f4938k = enumC0345g6;
        f4939l = new EnumC0345g[]{enumC0345g, enumC0345g2, enumC0345g3, enumC0345g4, enumC0345g5, enumC0345g6};
    }

    public static EnumC0345g valueOf(String str) {
        return (EnumC0345g) Enum.valueOf(EnumC0345g.class, str);
    }

    public static EnumC0345g[] values() {
        return (EnumC0345g[]) f4939l.clone();
    }

    public final boolean a(Member member) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            return !Modifier.isPrivate(member.getModifiers());
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                return false;
            }
        } else if (Modifier.isProtected(member.getModifiers())) {
            return true;
        }
        return Modifier.isPublic(member.getModifiers());
    }
}

package p024e0;

import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q f8670h;
    public static final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final q f8671j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ q[] f8672k;

    static {
        q qVar = new q("Active", 0);
        f8670h = qVar;
        q qVar2 = new q("ActiveParent", 1);
        i = qVar2;
        q qVar3 = new q("Captured", 2);
        q qVar4 = new q("Inactive", 3);
        f8671j = qVar4;
        f8672k = new q[]{qVar, qVar2, qVar3, qVar4};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f8672k.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }
}

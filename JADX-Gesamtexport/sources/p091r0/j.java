package p091r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j f11497h;
    public static final j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j f11498j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ j[] f11499k;

    static {
        j jVar = new j("Initial", 0);
        f11497h = jVar;
        j jVar2 = new j("Main", 1);
        i = jVar2;
        j jVar3 = new j("Final", 2);
        f11498j = jVar3;
        f11499k = new j[]{jVar, jVar2, jVar3};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f11499k.clone();
    }
}

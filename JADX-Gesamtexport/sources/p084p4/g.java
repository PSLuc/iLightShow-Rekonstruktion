package p084p4;

import p081p0.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f10847h;
    public static final g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ g[] f10848j;

    /* JADX INFO: Fake field, exist only in values array */
    g EF0;

    static {
        g gVar = new g("SYNCHRONIZED", 0);
        g gVar2 = new g("PUBLICATION", 1);
        f10847h = gVar2;
        g gVar3 = new g("NONE", 2);
        i = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
        f10848j = gVarArr;
        c.i0(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f10848j.clone();
    }
}

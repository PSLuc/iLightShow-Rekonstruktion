package p084p4;

import p081p0.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f10846h;
    public static final /* synthetic */ d[] i;

    static {
        d dVar = new d("WARNING", 0);
        f10846h = dVar;
        d[] dVarArr = {dVar, new d("ERROR", 1), new d("HIDDEN", 2)};
        i = dVarArr;
        c.i0(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) i.clone();
    }
}

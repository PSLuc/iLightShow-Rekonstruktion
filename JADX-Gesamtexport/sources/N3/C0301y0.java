package N3;

import java.util.Comparator;

/* JADX INFO: renamed from: N3.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0301y0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = ((D3.j) obj).f801c;
        if (str == null) {
            str = "";
        }
        String str2 = ((D3.j) obj2).f801c;
        return p027e3.a.R(str, str2 != null ? str2 : "");
    }
}

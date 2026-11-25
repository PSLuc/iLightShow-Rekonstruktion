package H0;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f1745a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f1746b;

    static {
        long j4 = 0;
        f1746b = (j4 & 4294967295L) | (j4 << 32);
    }

    public static final TextDirectionHeuristic a(int i) {
        if (i == 0) {
            return TextDirectionHeuristics.LTR;
        }
        if (i == 1) {
            return TextDirectionHeuristics.RTL;
        }
        if (i == 2) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (i == 3) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (i != 4) {
            return i != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.ANYRTL_LTR;
    }
}

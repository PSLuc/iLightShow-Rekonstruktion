package p130y0;

import p037g2.y;

/* JADX INFO: renamed from: y0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1125d extends y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C1125d f14382c;

    @Override // p037g2.y
    public final int[] b(int i) {
        int length = d().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && d().charAt(i) == '\n' && (d().charAt(i) == '\n' || (i != 0 && d().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i3 = i + 1;
        while (i3 < length && !f(i3)) {
            i3++;
        }
        return c(i, i3);
    }

    @Override // p037g2.y
    public final int[] e(int i) {
        int length = d().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && d().charAt(i - 1) == '\n' && !f(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i3 = i - 1;
        while (i3 > 0 && (d().charAt(i3) == '\n' || (i3 != 0 && d().charAt(i3 - 1) != '\n'))) {
            i3--;
        }
        return c(i3, i);
    }

    public final boolean f(int i) {
        if (i <= 0 || d().charAt(i - 1) == '\n') {
            return false;
        }
        return i == d().length() || d().charAt(i) == '\n';
    }
}

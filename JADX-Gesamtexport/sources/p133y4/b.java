package p133y4;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static Set a() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final int b(int i, int i3, int i6) {
        if (i6 > 0) {
            if (i < i3) {
                int i7 = i3 % i6;
                if (i7 < 0) {
                    i7 += i6;
                }
                int i8 = i % i6;
                if (i8 < 0) {
                    i8 += i6;
                }
                int i9 = (i7 - i8) % i6;
                if (i9 < 0) {
                    i9 += i6;
                }
                return i3 - i9;
            }
        } else {
            if (i6 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i3) {
                int i10 = -i6;
                int i11 = i % i10;
                if (i11 < 0) {
                    i11 += i10;
                }
                int i12 = i3 % i10;
                if (i12 < 0) {
                    i12 += i10;
                }
                int i13 = (i11 - i12) % i10;
                if (i13 < 0) {
                    i13 += i10;
                }
                return i13 + i3;
            }
        }
        return i3;
    }
}

package I4;

import E4.k;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes.dex */
public final class a extends H4.a {
    @Override // H4.e
    public final int d(int i, int i3) {
        return ThreadLocalRandom.current().nextInt(i, i3);
    }

    @Override // H4.a
    public final Random e() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        k.e("current(...)", threadLocalRandomCurrent);
        return threadLocalRandomCurrent;
    }
}

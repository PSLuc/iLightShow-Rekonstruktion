package H4;

import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends e {
    @Override // H4.e
    public final int a(int i) {
        return (e().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // H4.e
    public final int b() {
        return e().nextInt();
    }

    @Override // H4.e
    public final int c(int i) {
        return e().nextInt(i);
    }

    public abstract Random e();
}

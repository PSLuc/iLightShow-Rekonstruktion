package H4;

import E4.k;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {
    public final b i = new b(0);

    @Override // H4.a
    public final Random e() {
        Object obj = this.i.get();
        k.e("get(...)", obj);
        return (Random) obj;
    }
}

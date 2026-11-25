package E4;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class l implements h, Serializable {
    private final int arity;

    public l(int i) {
        this.arity = i;
    }

    @Override // E4.h
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        x.f1075a.getClass();
        String strA = y.a(this);
        k.e("renderLambdaToString(...)", strA);
        return strA;
    }
}

package p122w4;

import E4.k;
import E4.x;
import E4.y;
import p111u4.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends g implements E4.h {
    public final int i;

    public h(int i, d dVar) {
        super(dVar);
        this.i = i;
    }

    @Override // E4.h
    public final int getArity() {
        return this.i;
    }

    @Override // p122w4.a
    public final String toString() {
        if (this.f13459h != null) {
            return super.toString();
        }
        x.f1075a.getClass();
        String strA = y.a(this);
        k.e("renderLambdaToString(...)", strA);
        return strA;
    }
}

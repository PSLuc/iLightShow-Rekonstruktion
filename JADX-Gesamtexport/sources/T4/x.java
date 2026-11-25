package T4;

import S4.E;
import S4.N;

/* JADX INFO: loaded from: classes.dex */
public final class x extends E implements N {
    @Override // S4.N
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f5028o;
            E4.k.c(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f5029p + ((long) ((int) ((o() + ((long) this.f5031r)) - this.f5029p)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void w(int i) {
        synchronized (this) {
            Object[] objArr = this.f5028o;
            E4.k.c(objArr);
            q(Integer.valueOf(((Number) objArr[((int) ((this.f5029p + ((long) ((int) ((o() + ((long) this.f5031r)) - this.f5029p)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}

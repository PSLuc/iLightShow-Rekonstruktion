package p037g2;

import S1.c0;
import S1.d0;
import S1.f0;

/* JADX INFO: loaded from: classes.dex */
public final class v extends f0 {
    @Override // S1.d0
    public final d0 b(Class cls) {
        return cls == this.f4935h ? this : new v(cls);
    }

    @Override // S1.d0
    public final Object c(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // S1.d0
    public final c0 d(Object obj) {
        if (obj == null) {
            return null;
        }
        return new c0(v.class, this.f4935h, obj);
    }

    @Override // S1.d0
    public final d0 e() {
        return this;
    }
}

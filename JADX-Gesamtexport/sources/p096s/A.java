package p096s;

import H1.d;

/* JADX INFO: loaded from: classes.dex */
public interface A extends InterfaceC0918k {
    @Override // p096s.InterfaceC0918k
    default y0 a(w0 w0Var) {
        return new d(this);
    }

    float b(long j4, float f6, float f7, float f8);

    float c(long j4, float f6, float f7, float f8);

    long d(float f6, float f7, float f8);

    default float e(float f6, float f7, float f8) {
        return c(d(f6, f7, f8), f6, f7, f8);
    }
}

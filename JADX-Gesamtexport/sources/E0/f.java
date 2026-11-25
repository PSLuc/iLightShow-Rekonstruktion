package E0;

import p101t.o0;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f913b;

    public f(o0 o0Var, o0 o0Var2) {
        this.f912a = o0Var;
        this.f913b = o0Var2;
    }

    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f912a.invoke()).floatValue() + ", maxValue=" + ((Number) this.f913b.invoke()).floatValue() + ", reverseScrolling=false)";
    }
}

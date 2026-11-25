package E3;

import B.AbstractC0013g0;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p110u3.c("numLEDs")
    @p110u3.a
    private final int f1026a = 1;

    public final int a() {
        return this.f1026a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f1026a == ((f) obj).f1026a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1026a);
    }

    public final String toString() {
        return AbstractC0013g0.f(this.f1026a, "NanoleafLengthResponse(numLEDs=", ")");
    }
}

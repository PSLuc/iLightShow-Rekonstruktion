package J4;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1940b;

    public a(float f6, float f7) {
        this.f1939a = f6;
        this.f1940b = f7;
    }

    public static boolean a(Float f6, Float f7) {
        return f6.floatValue() <= f7.floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        float f6 = this.f1939a;
        float f7 = this.f1940b;
        if (f6 > f7) {
            a aVar = (a) obj;
            if (aVar.f1939a > aVar.f1940b) {
                return true;
            }
        }
        a aVar2 = (a) obj;
        return f6 == aVar2.f1939a && f7 == aVar2.f1940b;
    }

    public final int hashCode() {
        float f6 = this.f1939a;
        float f7 = this.f1940b;
        if (f6 > f7) {
            return -1;
        }
        return Float.hashCode(f7) + (Float.hashCode(f6) * 31);
    }

    public final String toString() {
        return this.f1939a + ".." + this.f1940b;
    }
}

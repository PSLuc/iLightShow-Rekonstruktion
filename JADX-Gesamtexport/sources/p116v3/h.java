package p116v3;

/* JADX INFO: loaded from: classes.dex */
public final class h extends Number {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13264h;

    public h(String str) {
        this.f13264h = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f13264h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.f13264h.equals(((h) obj).f13264h);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f13264h);
    }

    public final int hashCode() {
        return this.f13264h.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f13264h;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return d.j(str).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(str);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f13264h;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return d.j(str).longValue();
        }
    }

    public final String toString() {
        return this.f13264h;
    }
}

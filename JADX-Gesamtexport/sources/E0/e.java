package E0;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f911a;

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f911a == ((e) obj).f911a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f911a);
    }

    public final String toString() {
        int i = this.f911a;
        if (i == 0) {
            return "Button";
        }
        if (i == 1) {
            return "Checkbox";
        }
        if (i == 2) {
            return "Switch";
        }
        if (i == 3) {
            return "RadioButton";
        }
        if (i == 4) {
            return "Tab";
        }
        if (i == 5) {
            return "Image";
        }
        return i == 6 ? "DropdownList" : "Unknown";
    }
}

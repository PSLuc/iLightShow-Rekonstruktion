package R0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f4746b = new j(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f4747c = new j(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f4748d = new j(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4749a;

    public j(int i) {
        this.f4749a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.f4749a == ((j) obj).f4749a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4749a;
    }

    public final String toString() {
        int i = this.f4749a;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + G4.a.r(", ", arrayList) + ']';
    }
}

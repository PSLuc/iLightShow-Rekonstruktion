package p083p3;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f10842b;

    public b(String str, Map map) {
        this.f10841a = str;
        this.f10842b = map;
    }

    public static b a(String str) {
        return new b(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f10841a.equals(bVar.f10841a) && this.f10842b.equals(bVar.f10842b);
    }

    public final int hashCode() {
        return this.f10842b.hashCode() + (this.f10841a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f10841a + ", properties=" + this.f10842b.values() + "}";
    }
}

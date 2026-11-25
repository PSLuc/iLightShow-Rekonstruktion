package p104t2;

import p015c2.h;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f12516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h[] f12517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12518c;

    public k(Class cls, h[] hVarArr, int i) {
        this.f12516a = cls;
        this.f12517b = hVarArr;
        this.f12518c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != k.class) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f12518c == kVar.f12518c && this.f12516a == kVar.f12516a) {
            h[] hVarArr = this.f12517b;
            int length = hVarArr.length;
            h[] hVarArr2 = kVar.f12517b;
            if (length == hVarArr2.length) {
                for (int i = 0; i < length; i++) {
                    if (!hVarArr[i].equals(hVarArr2[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f12518c;
    }

    public final String toString() {
        return this.f12516a.getName().concat("<>");
    }
}

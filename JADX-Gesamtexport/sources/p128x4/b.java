package p128x4;

import B.AbstractC0013g0;
import E4.k;
import java.io.Serializable;
import p089q4.d;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d implements a, Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Enum[] f14145h;

    public b(Enum[] enumArr) {
        k.f("entries", enumArr);
        this.f14145h = enumArr;
    }

    @Override // p089q4.AbstractC0861a
    public final int c() {
        return this.f14145h.length;
    }

    @Override // p089q4.AbstractC0861a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r6 = (Enum) obj;
        k.f("element", r6);
        int iOrdinal = r6.ordinal();
        Enum[] enumArr = this.f14145h;
        k.f("<this>", enumArr);
        return ((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r6;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f14145h;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(AbstractC0013g0.g("index: ", i, length, ", size: "));
        }
        return enumArr[i];
    }

    @Override // p089q4.d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r6 = (Enum) obj;
        k.f("element", r6);
        int iOrdinal = r6.ordinal();
        Enum[] enumArr = this.f14145h;
        k.f("<this>", enumArr);
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r6) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // p089q4.d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r6 = (Enum) obj;
        k.f("element", r6);
        return indexOf(r6);
    }
}

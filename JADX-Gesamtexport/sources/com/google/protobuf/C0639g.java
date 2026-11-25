package com.google.protobuf;

import androidx.datastore.preferences.protobuf.C0419d;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0639g extends AbstractC0640h {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f8212k;

    public C0639g(byte[] bArr) {
        this.f8215h = 0;
        bArr.getClass();
        this.f8212k = bArr;
    }

    @Override // com.google.protobuf.AbstractC0640h
    public byte c(int i) {
        return this.f8212k[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0640h) || size() != ((AbstractC0640h) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0639g)) {
            return obj.equals(this);
        }
        C0639g c0639g = (C0639g) obj;
        int i = this.f8215h;
        int i3 = c0639g.f8215h;
        if (i != 0 && i3 != 0 && i != i3) {
            return false;
        }
        int size = size();
        if (size > c0639g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0639g.size()) {
            StringBuilder sbV = p012c.k.v(size, "Ran off end of other: 0, ", ", ");
            sbV.append(c0639g.size());
            throw new IllegalArgumentException(sbV.toString());
        }
        int iJ = j() + size;
        int iJ2 = j();
        int iJ3 = c0639g.j();
        while (iJ2 < iJ) {
            if (this.f8212k[iJ2] != c0639g.f8212k[iJ3]) {
                return false;
            }
            iJ2++;
            iJ3++;
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC0640h
    public void i(int i, byte[] bArr) {
        System.arraycopy(this.f8212k, 0, bArr, 0, i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0419d(this);
    }

    public int j() {
        return 0;
    }

    public byte k(int i) {
        return this.f8212k[i];
    }

    @Override // com.google.protobuf.AbstractC0640h
    public int size() {
        return this.f8212k.length;
    }
}

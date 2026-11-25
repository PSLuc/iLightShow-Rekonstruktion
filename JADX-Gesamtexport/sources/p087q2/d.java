package p087q2;

import T1.a;
import T1.b;
import T1.e;
import T1.k;
import java.util.Arrays;
import p015c2.E;

/* JADX INFO: loaded from: classes.dex */
public final class d extends u {
    public static final d i = new d(new byte[0]);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f11212h;

    public d(byte[] bArr) {
        this.f11212h = bArr;
    }

    @Override // p087q2.b, p015c2.m
    public final void c(e eVar, E e6) {
        a aVar = e6.f7226j.i.f8685n;
        byte[] bArr = this.f11212h;
        eVar.G(aVar, bArr, 0, bArr.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof d)) {
            return Arrays.equals(((d) obj).f11212h, this.f11212h);
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = this.f11212h;
        if (bArr == null) {
            return -1;
        }
        return bArr.length;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final String j() {
        return b.f5157a.d(this.f11212h);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final int o() {
        return 2;
    }

    @Override // p087q2.u
    public final k p() {
        return k.VALUE_EMBEDDED_OBJECT;
    }
}

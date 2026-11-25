package c5;

import java.util.Arrays;
import kotlinx.serialization.SerializationException;

/* JADX INFO: renamed from: c5.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0503y implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enum[] f7510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p084p4.m f7511b;

    public C0503y(String str, Enum[] enumArr) {
        this.f7510a = enumArr;
        this.f7511b = G4.a.z(new N3.A0(this, 4, str));
    }

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        int iT = cVar.t(getDescriptor());
        Enum[] enumArr = this.f7510a;
        if (iT >= 0 && iT < enumArr.length) {
            return enumArr[iT];
        }
        throw new SerializationException(iT + " is not among valid " + getDescriptor().b() + " enum values, values size is " + enumArr.length);
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return (a5.g) this.f7511b.getValue();
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        Enum r6 = (Enum) obj;
        E4.k.f("value", r6);
        Enum[] enumArr = this.f7510a;
        int iN0 = p089q4.k.n0(enumArr, r6);
        if (iN0 != -1) {
            dVar.d(getDescriptor(), iN0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r6);
        sb.append(" is not a valid enum ");
        sb.append(getDescriptor().b());
        sb.append(", must be one of ");
        String string = Arrays.toString(enumArr);
        E4.k.e("toString(...)", string);
        sb.append(string);
        throw new SerializationException(sb.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().b() + '>';
    }
}

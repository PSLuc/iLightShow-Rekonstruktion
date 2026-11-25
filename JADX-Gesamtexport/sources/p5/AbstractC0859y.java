package p5;

import javax.security.auth.Destroyable;
import p096s.AbstractC0916i;

/* JADX INFO: renamed from: p5.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0859y implements Destroyable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0858x f11174j = new C0858x(q5.i.f11286r, EnumC0852q.NULL);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q5.i f11175h;
    public final EnumC0852q i;

    public AbstractC0859y(q5.i iVar, EnumC0852q enumC0852q) {
        if (iVar == null) {
            throw new NullPointerException("Cipher suite must not be null");
        }
        if (enumC0852q == null) {
            throw new NullPointerException("Compression method must not be null");
        }
        this.f11175h = iVar;
        this.i = enumC0852q;
    }

    public static AbstractC0859y a(q5.i iVar, EnumC0852q enumC0852q, t5.b bVar, t5.a aVar, t5.b bVar2) {
        String str;
        int iD = AbstractC0916i.d(iVar.f11291j.i);
        if (iD == 0) {
            return f11174j;
        }
        if (iD == 2) {
            return new E(iVar, enumC0852q, bVar, bVar2);
        }
        if (iD == 3) {
            return new D(iVar, enumC0852q, bVar, aVar);
        }
        StringBuilder sb = new StringBuilder("cipher type ");
        int i = iVar.f11291j.i;
        if (i == 1) {
            str = "NULL";
        } else if (i == 2) {
            str = "STREAM";
        } else if (i != 3) {
            str = i != 4 ? "null" : "AEAD";
        } else {
            str = "BLOCK";
        }
        sb.append(str);
        sb.append(" not supported!");
        throw new IllegalArgumentException(sb.toString());
    }

    public abstract byte[] b(i0 i0Var, byte[] bArr);

    public abstract byte[] c(i0 i0Var, byte[] bArr);
}

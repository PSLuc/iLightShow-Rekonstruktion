package q5;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes.dex */
public enum e {
    NULL("NULL", 1, 0, 0, 0, 0),
    /* JADX INFO: Fake field, exist only in values array */
    B_3DES_EDE_CBC("DESede/CBC/NoPadding", 3, 24, 4, 8, 0),
    AES_128_CBC("AES/CBC/NoPadding", 3, 16, 4, 16, 0),
    AES_256_CBC("AES/CBC/NoPadding", 3, 32, 4, 16, 0),
    AES_128_CCM_8("AES/CCM", 4, 16, 4, 8, 8),
    AES_256_CCM_8("AES/CCM", 4, 32, 4, 8, 8),
    AES_128_CCM("AES/CCM", 4, 16, 4, 8, 16),
    AES_256_CCM("AES/CCM", 4, 32, 4, 8, 16),
    AES_128_GCM("AES/GCM/NoPadding", 4, 16, 4, 8, 16),
    AES_256_GCM("AES/GCM/NoPadding", 4, 32, 4, 8, 16);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f11259h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f11260j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f11261k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f11262l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f11263m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f11264n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o f11265o;

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    e(String str, int i, int i3, int i6, int i7, int i8) {
        boolean z5;
        this.f11259h = str;
        this.i = i;
        this.f11260j = i3;
        this.f11261k = i6;
        this.f11262l = i7;
        this.f11263m = i8;
        boolean z6 = false;
        if (i == 4 || i == 3) {
            try {
                Cipher cipher = "AES/CCM".equals(str) ? (Cipher) c.f11247a.a() : Cipher.getInstance(str);
                if (cipher == null || i3 * 8 > Cipher.getMaxAllowedKeyLength(cipher.getAlgorithm())) {
                    z5 = false;
                } else {
                    z5 = true;
                }
            } catch (GeneralSecurityException unused) {
            }
        } else {
            z5 = true;
        }
        if ("AES/CCM".equals(str)) {
            this.f11265o = null;
            this.f11264n = z5;
            return;
        }
        o oVar = z5 ? new o(str, 1) : null;
        this.f11265o = oVar;
        if (oVar != null && oVar.f11317a != null) {
            z6 = true;
        }
        this.f11264n = z6;
    }
}

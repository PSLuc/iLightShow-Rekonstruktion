package p5;

import c5.C0495p;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0495p f11167f = new C0495p(new Z2.f(29, false));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f11168g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11173e;

    static {
        new x0(3, 4, null);
        x0 x0Var = new x0(5, 4, null);
        new x0(6, 4, null);
        x0 x0Var2 = new x0(5, 2, null);
        new x0(8, 5, null);
        new x0(8, 6, null);
        f11168g = Collections.unmodifiableList(Arrays.asList(x0Var, x0Var2));
    }

    public x0(int i, int i3, AbstractC0916i abstractC0916i) {
        if (i == 0) {
            throw new NullPointerException("Hash Algorithm must not be null!");
        }
        if (i3 == 0) {
            throw new NullPointerException("Signature Algorithm must not be null!");
        }
        this.f11170b = i;
        this.f11171c = i3;
        this.f11172d = p012c.k.d(i);
        this.f11173e = p012c.k.e(i3);
        String strA = a();
        this.f11169a = strA;
        if (strA != null) {
            d(strA).a();
        }
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x0 x0Var = (x0) it.next();
            boolean z5 = true;
            switch (x0Var.f11171c) {
                case 1:
                case 2:
                case 3:
                    z5 = false;
                    break;
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    throw null;
            }
            if (z5) {
                arrayList.add(x0Var);
            }
        }
        return arrayList;
    }

    public static x0 c(List list, PublicKey publicKey) {
        if (publicKey == null) {
            throw new NullPointerException("Public key must not be null!");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x0 x0Var = (x0) it.next();
            try {
                Signature signature = (Signature) d(x0Var.f11169a).a();
                if (signature != null) {
                    signature.initVerify(publicKey);
                    return x0Var;
                }
                continue;
            } catch (InvalidKeyException unused) {
            }
        }
        return null;
    }

    public static q5.u d(String str) {
        if (str == null) {
            str = "UNKNOWN";
        }
        return (q5.u) f11167f.q(str);
    }

    public final String a() {
        int i;
        int i3 = this.f11170b;
        if (i3 == 0 || (i = this.f11171c) == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (i3 != 8) {
            sb.append(p012c.k.D(i3));
            sb.append("with");
        }
        sb.append(p012c.k.E(i));
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x0.class != obj.getClass()) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.f11173e == x0Var.f11173e && this.f11172d == x0Var.f11172d;
    }

    public final int hashCode() {
        return (this.f11172d * 100) + this.f11173e;
    }

    public final String toString() {
        String str = this.f11169a;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i = this.f11170b;
        if (i != 0) {
            sb.append(p012c.k.D(i));
        } else {
            sb.append(String.format("0x%02x", Integer.valueOf(this.f11172d)));
        }
        sb.append("with");
        int i3 = this.f11171c;
        if (i3 != 0) {
            sb.append(p012c.k.E(i3));
        } else {
            sb.append(String.format("0x%02x", Integer.valueOf(this.f11173e)));
        }
        return sb.toString();
    }

    public x0(int i, int i3) {
        this.f11172d = i;
        this.f11173e = i3;
        int i6 = 4;
        this.f11171c = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 7 ? i3 != 8 ? 0 : 6 : 5 : 4 : 3 : 2 : 1;
        switch (i) {
            case 0:
                i6 = 1;
                break;
            case 1:
                i6 = 2;
                break;
            case 2:
                i6 = 3;
                break;
            case 3:
                break;
            case 4:
                i6 = 5;
                break;
            case 5:
                i6 = 6;
                break;
            case 6:
                i6 = 7;
                break;
            case 7:
            default:
                i6 = 0;
                break;
            case 8:
                i6 = 8;
                break;
        }
        this.f11170b = i6;
        String strA = a();
        this.f11169a = strA;
        if (strA != null) {
            d(strA).a();
        }
    }
}

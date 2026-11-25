package W2;

import F.C0074p;
import F1.B;
import F1.C0096m;
import F1.C0103u;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.lifecycle.EnumC0454n;
import com.spotify.sdk.android.auth.AccountsQueryParameters;
import h5.C;
import h5.C0732j;
import h5.C0735m;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import p035g0.E;
import p035g0.M;
import p035g0.z;
import p052k.p;
import q5.r;
import q5.s;

/* JADX INFO: loaded from: classes.dex */
public final class g implements I1.e, N2.b, U2.a, U3.b, U3.a, M, p, r {
    public static g i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5584h;

    public /* synthetic */ g(int i3) {
        this.f5584h = i3;
    }

    private final void g(Object obj) {
    }

    public static C0096m h(Context context, B b6, Bundle bundle, EnumC0454n enumC0454n, C0103u c0103u) {
        String string = UUID.randomUUID().toString();
        E4.k.e("randomUUID().toString()", string);
        E4.k.f("destination", b6);
        E4.k.f("hostLifecycleState", enumC0454n);
        return new C0096m(context, b6, bundle, enumC0454n, c0103u, string, null);
    }

    public static Typeface j(String str, L0.k kVar, int i3) {
        if (i3 == 0 && E4.k.a(kVar, L0.k.f3025j) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), kVar.f3028h, i3 == 1);
    }

    public static C k(String str, boolean z5) {
        E4.k.f("<this>", str);
        C0735m c0735m = i5.c.f9595a;
        C0732j c0732j = new C0732j();
        c0732j.h0(str);
        return i5.c.d(c0732j, z5);
    }

    public static C l(File file) {
        String str = C.i;
        String string = file.toString();
        E4.k.e("toString()", string);
        return k(string, false);
    }

    public static z m(List list) {
        return new z(list, p081p0.c.y(0.0f, 0.0f), p081p0.c.y(Float.POSITIVE_INFINITY, 0.0f));
    }

    public static final boolean n(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo;
        p042h3.f fVar;
        int i3;
        if (packageInfo != null) {
            boolean z5 = (("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) && ((applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 129) == 0)) ? false : true;
            try {
                p042h3.f fVar2 = z5 ? m.f5594c : m.f5593b;
                SigningInfo signingInfo = packageInfo.signingInfo;
                if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                    p042h3.b bVar = p042h3.e.i;
                    fVar = p042h3.f.f9300l;
                } else {
                    p042h3.b bVar2 = p042h3.e.i;
                    Object[] objArrCopyOf = new Object[4];
                    Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    int length = signingCertificateHistory.length;
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < length) {
                        byte[] byteArray = signingCertificateHistory[i6].toByteArray();
                        byteArray.getClass();
                        int length2 = objArrCopyOf.length;
                        int i8 = i7 + 1;
                        if (i8 < 0) {
                            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                        }
                        if (i8 <= length2) {
                            i3 = length2;
                        } else {
                            i3 = (length2 >> 1) + length2 + 1;
                            if (i3 < i8) {
                                int iHighestOneBit = Integer.highestOneBit(i7);
                                i3 = iHighestOneBit + iHighestOneBit;
                            }
                            if (i3 < 0) {
                                i3 = Integer.MAX_VALUE;
                            }
                        }
                        if (i3 > length2) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                        }
                        objArrCopyOf[i7] = byteArray;
                        i6++;
                        i7 = i8;
                    }
                    fVar = i7 == 0 ? p042h3.f.f9300l : new p042h3.f(objArrCopyOf, i7);
                }
                if (fVar.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                p042h3.e eVarJ = fVar.j();
                int size = eVarJ.size();
                int i9 = 0;
                while (i9 < size) {
                    byte[] bArr = (byte[]) eVarJ.get(i9);
                    p042h3.b bVarL = fVar2.listIterator(0);
                    do {
                        int i10 = i9 + 1;
                        if (!bVarL.hasNext()) {
                            i9 = i10;
                        }
                    } while (!Arrays.equals(bArr, (byte[]) bVarL.next()));
                    return true;
                }
            } catch (IllegalArgumentException unused) {
                if ((z5 ? o(packageInfo, m.f5592a) : o(packageInfo, m.f5592a[0])) == null) {
                    return false;
                }
            }
        }
        return false;
    }

    public static k o(PackageInfo packageInfo, k... kVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        l lVar = new l(packageInfo.signatures[0].toByteArray());
        for (int i3 = 0; i3 < kVarArr.length; i3++) {
            if (kVarArr[i3].equals(lVar)) {
                return kVarArr[i3];
            }
        }
        return null;
    }

    @Override // p035g0.M
    public E a(long j4, S0.k kVar, S0.b bVar) {
        return new p035g0.C(G4.a.e(0L, j4));
    }

    @Override // U3.b
    public Object apply(Object obj) throws Throwable {
        Object[] objArr = (Object[]) obj;
        if (objArr.length != 2) {
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
        Throwable th = (Throwable) objArr[0];
        Integer num = (Integer) objArr[1];
        E4.k.f(AccountsQueryParameters.ERROR, th);
        E4.k.f("i", num);
        if (num.intValue() != 3) {
            return num;
        }
        throw th;
    }

    @Override // I1.e
    public void b(int i3, Serializable serializable) {
        if (i3 == 6 || i3 == 7 || i3 == 8) {
        }
    }

    @Override // p052k.p
    public void c(p052k.j jVar, boolean z5) {
    }

    @Override // U2.a
    public long d() {
        return SystemClock.elapsedRealtime();
    }

    @Override // U3.a
    public void e(Object obj) {
        switch (this.f5584h) {
            case 15:
                break;
            default:
                G4.a.A(new OnErrorNotImplementedException((Throwable) obj));
                break;
        }
    }

    @Override // q5.r
    public Object f(String str) {
        return new s(str);
    }

    @Override // p079o4.a
    public Object get() {
        Z2.f fVar = new Z2.f(13, false);
        HashMap map = new HashMap();
        I2.c cVar = I2.c.f1854h;
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(cVar, new R2.c(30000L, 86400000L, set));
        I2.c cVar2 = I2.c.f1855j;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(cVar2, new R2.c(1000L, 86400000L, set));
        I2.c cVar3 = I2.c.i;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(R2.e.i)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(cVar3, new R2.c(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() < I2.c.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new R2.b(fVar, map);
    }

    @Override // p052k.p
    public boolean i(p052k.j jVar) {
        return false;
    }

    public String toString() {
        switch (this.f5584h) {
            case 15:
                return "EmptyConsumer";
            case 25:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }

    public g(C0074p c0074p) {
        this.f5584h = 14;
    }
}

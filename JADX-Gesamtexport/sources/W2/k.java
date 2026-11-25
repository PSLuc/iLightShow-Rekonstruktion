package W2;

import Z2.A;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.play_billing.AbstractBinderC0560e;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends AbstractBinderC0560e implements A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5590b;

    public k(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.f5590b = Arrays.hashCode(bArr);
    }

    public static byte[] f(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e6) {
            throw new AssertionError(e6);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractBinderC0560e
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f5590b);
            return true;
        }
        p033f3.a aVar = new p033f3.a(e());
        parcel2.writeNoException();
        int i3 = p042h3.g.f9303a;
        parcel2.writeStrongBinder(aVar);
        return true;
    }

    public abstract byte[] e();

    public final boolean equals(Object obj) {
        if (!(obj instanceof A)) {
            return false;
        }
        try {
            A a6 = (A) obj;
            if (((k) a6).f5590b != this.f5590b) {
                return false;
            }
            return Arrays.equals(e(), new p033f3.a(((k) a6).e()).f8943b);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return this.f5590b;
    }
}

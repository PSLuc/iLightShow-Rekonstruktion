package O1;

import B.AbstractC0013g0;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.google.gson.JsonIOException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import java.util.IllegalFormatException;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* JADX INFO: renamed from: O1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0308a implements q5.p, p116v3.m, p119w1.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4454h;
    public String i;

    public static String e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(String.valueOf(str2));
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    @Override // p119w1.l
    public Object a() {
        return this;
    }

    @Override // q5.p
    public Object b() {
        Provider provider;
        Provider provider2;
        Provider provider3;
        switch (this.f4454h) {
            case 3:
                return Cipher.getInstance(this.i);
            case 4:
                return KeyAgreement.getInstance(this.i);
            case 5:
                String str = this.i;
                String strA = m5.b.a(str, null);
                return (strA == null || (provider = m5.b.f10434j) == null) ? KeyFactory.getInstance(str) : KeyFactory.getInstance(strA, provider);
            case 6:
                String str2 = this.i;
                String strA2 = m5.b.a(str2, null);
                return (strA2 == null || (provider2 = m5.b.f10434j) == null) ? KeyPairGenerator.getInstance(str2) : KeyPairGenerator.getInstance(strA2, provider2);
            case 7:
                return Mac.getInstance(this.i);
            case 8:
                return MessageDigest.getInstance(this.i);
            default:
                String str3 = this.i;
                String strA3 = m5.b.a(str3, null);
                return (strA3 == null || (provider3 = m5.b.f10434j) == null) ? Signature.getInstance(str3) : Signature.getInstance(strA3, provider3);
        }
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            e(this.i, str, objArr);
        }
    }

    public void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            e(this.i, str, objArr);
        }
    }

    @Override // p119w1.l
    public boolean g(CharSequence charSequence, int i, int i3, p119w1.s sVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i3), this.i)) {
            return true;
        }
        sVar.f13449c = (sVar.f13449c & 3) | 4;
        return false;
    }

    @Override // p116v3.m
    public Object l() {
        switch (this.f4454h) {
            case 10:
                throw new JsonIOException(this.i);
            case 11:
                throw new JsonIOException(this.i);
            default:
                throw new JsonIOException(this.i);
        }
    }

    public String toString() {
        switch (this.f4454h) {
            case 1:
                return AbstractC0013g0.m(new StringBuilder("<"), this.i, '>');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0308a(String str, int i) {
        this.f4454h = i;
        this.i = str;
    }

    public C0308a(String str) {
        this.f4454h = 2;
        this.i = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }
}

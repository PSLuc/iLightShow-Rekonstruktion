package p025e1;

import E4.k;
import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    static {
        int i = Build.VERSION.SDK_INT;
        a aVar = a.f8678a;
        if (i >= 30) {
            aVar.a(30);
        }
        if (i >= 30) {
            aVar.a(31);
        }
        if (i >= 30) {
            aVar.a(33);
        }
        if (i >= 30) {
            aVar.a(1000000);
        }
    }

    public static final boolean a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return true;
        }
        if (i < 32) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        k.e("CODENAME", str);
        if ("REL".equals(str)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str.toUpperCase(locale);
        k.e("this as java.lang.String).toUpperCase(Locale.ROOT)", upperCase);
        String upperCase2 = "Tiramisu".toUpperCase(locale);
        k.e("this as java.lang.String).toUpperCase(Locale.ROOT)", upperCase2);
        return upperCase.compareTo(upperCase2) >= 0;
    }
}

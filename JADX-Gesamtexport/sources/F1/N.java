package F1;

import B.AbstractC0013g0;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class N extends S {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1308q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N(boolean z5, int i) {
        super(z5);
        this.f1308q = i;
    }

    @Override // F1.S
    public final Object a(String str, Bundle bundle) {
        switch (this.f1308q) {
            case 0:
                return (Boolean) AbstractC0013g0.e(bundle, "bundle", str, "key", str);
            case 1:
                Object objE = AbstractC0013g0.e(bundle, "bundle", str, "key", str);
                E4.k.d("null cannot be cast to non-null type kotlin.Float", objE);
                return (Float) objE;
            case 2:
                Object objE2 = AbstractC0013g0.e(bundle, "bundle", str, "key", str);
                E4.k.d("null cannot be cast to non-null type kotlin.Int", objE2);
                return (Integer) objE2;
            case 3:
                Object objE3 = AbstractC0013g0.e(bundle, "bundle", str, "key", str);
                E4.k.d("null cannot be cast to non-null type kotlin.Long", objE3);
                return (Long) objE3;
            default:
                return (String) AbstractC0013g0.e(bundle, "bundle", str, "key", str);
        }
    }

    @Override // F1.S
    public final String b() {
        switch (this.f1308q) {
            case 0:
                return "boolean";
            case 1:
                return "float";
            case 2:
                return "integer";
            case 3:
                return "long";
            default:
                return "string";
        }
    }

    @Override // F1.S
    public final Object c(String str) {
        boolean z5;
        int i;
        String strSubstring;
        long j4;
        switch (this.f1308q) {
            case 0:
                if (str.equals("true")) {
                    z5 = true;
                } else {
                    if (!str.equals("false")) {
                        throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                    }
                    z5 = false;
                }
                return Boolean.valueOf(z5);
            case 1:
                return Float.valueOf(Float.parseFloat(str));
            case 2:
                if (M4.s.W(str, "0x", false)) {
                    String strSubstring2 = str.substring(2);
                    E4.k.e("substring(...)", strSubstring2);
                    S1.V.t(16);
                    i = Integer.parseInt(strSubstring2, 16);
                } else {
                    i = Integer.parseInt(str);
                }
                return Integer.valueOf(i);
            case 3:
                if (M4.s.P(str, "L", false)) {
                    strSubstring = str.substring(0, str.length() - 1);
                    E4.k.e("substring(...)", strSubstring);
                } else {
                    strSubstring = str;
                }
                if (M4.s.W(str, "0x", false)) {
                    String strSubstring3 = strSubstring.substring(2);
                    E4.k.e("substring(...)", strSubstring3);
                    S1.V.t(16);
                    j4 = Long.parseLong(strSubstring3, 16);
                } else {
                    j4 = Long.parseLong(strSubstring);
                }
                return Long.valueOf(j4);
            default:
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // F1.S
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f1308q) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                E4.k.f("key", str);
                bundle.putBoolean(str, zBooleanValue);
                break;
            case 1:
                float fFloatValue = ((Number) obj).floatValue();
                E4.k.f("key", str);
                bundle.putFloat(str, fFloatValue);
                break;
            case 2:
                int iIntValue = ((Number) obj).intValue();
                E4.k.f("key", str);
                bundle.putInt(str, iIntValue);
                break;
            case 3:
                long jLongValue = ((Number) obj).longValue();
                E4.k.f("key", str);
                bundle.putLong(str, jLongValue);
                break;
            default:
                E4.k.f("key", str);
                bundle.putString(str, (String) obj);
                break;
        }
    }

    @Override // F1.S
    public String f(Object obj) {
        switch (this.f1308q) {
            case 4:
                String str = (String) obj;
                String strEncode = str != null ? Uri.encode(str) : null;
                return strEncode == null ? "null" : strEncode;
            default:
                return super.f(obj);
        }
    }
}

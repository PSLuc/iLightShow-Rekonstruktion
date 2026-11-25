package H1;

import B.AbstractC0013g0;
import E4.k;
import F1.S;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class h extends S {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h f1768r = new h(false, 0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1769q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(boolean z5, int i) {
        super(z5);
        this.f1769q = i;
    }

    @Override // F1.S
    public final Object a(String str, Bundle bundle) {
        switch (this.f1769q) {
            case 0:
                k.f("bundle", bundle);
                k.f("key", str);
                return null;
            case 1:
                Object objE = AbstractC0013g0.e(bundle, "bundle", str, "key", str);
                if (objE instanceof Boolean) {
                    return (Boolean) objE;
                }
                return null;
            case 2:
                Object objE2 = AbstractC0013g0.e(bundle, "bundle", str, "key", str);
                if (objE2 instanceof Double) {
                    return (Double) objE2;
                }
                return null;
            case 3:
                Object objE3 = AbstractC0013g0.e(bundle, "bundle", str, "key", str);
                k.d("null cannot be cast to non-null type kotlin.Double", objE3);
                return (Double) objE3;
            case 4:
                Object objE4 = AbstractC0013g0.e(bundle, "bundle", str, "key", str);
                if (objE4 instanceof Float) {
                    return (Float) objE4;
                }
                return null;
            case 5:
                Object objE5 = AbstractC0013g0.e(bundle, "bundle", str, "key", str);
                if (objE5 instanceof Integer) {
                    return (Integer) objE5;
                }
                return null;
            case 6:
                Object objE6 = AbstractC0013g0.e(bundle, "bundle", str, "key", str);
                if (objE6 instanceof Long) {
                    return (Long) objE6;
                }
                return null;
            default:
                k.f("bundle", bundle);
                k.f("key", str);
                String string = bundle.getString(str);
                return string == null ? "null" : string;
        }
    }

    @Override // F1.S
    public final String b() {
        switch (this.f1769q) {
            case 0:
                return "unknown";
            case 1:
                return "boolean_nullable";
            case 2:
                return "double_nullable";
            case 3:
                return "double";
            case 4:
                return "float_nullable";
            case 5:
                return "integer_nullable";
            case 6:
                return "long_nullable";
            default:
                return "string_non_nullable";
        }
    }

    @Override // F1.S
    public final Object c(String str) {
        switch (this.f1769q) {
            case 0:
                return "null";
            case 1:
                if (str.equals("null")) {
                    return null;
                }
                return (Boolean) S.f1320k.c(str);
            case 2:
                if (str.equals("null")) {
                    return null;
                }
                return Double.valueOf(Double.parseDouble(str));
            case 3:
                return Double.valueOf(Double.parseDouble(str));
            case 4:
                if (str.equals("null")) {
                    return null;
                }
                return Float.valueOf(Float.parseFloat(str));
            case 5:
                if (str.equals("null")) {
                    return null;
                }
                return (Integer) S.f1312b.c(str);
            case 6:
                if (str.equals("null")) {
                    return null;
                }
                return (Long) S.f1315e.c(str);
            default:
                return str;
        }
    }

    @Override // F1.S
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f1769q) {
            case 0:
                k.f("key", str);
                k.f("value", (String) obj);
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                k.f("key", str);
                if (bool != null) {
                    S.f1320k.e(bundle, str, bool);
                } else {
                    bundle.putSerializable(str, null);
                }
                break;
            case 2:
                Double d6 = (Double) obj;
                k.f("key", str);
                if (d6 != null) {
                    bundle.putDouble(str, d6.doubleValue());
                } else {
                    bundle.putSerializable(str, null);
                }
                break;
            case 3:
                double dDoubleValue = ((Number) obj).doubleValue();
                k.f("key", str);
                bundle.putDouble(str, dDoubleValue);
                break;
            case 4:
                Float f6 = (Float) obj;
                k.f("key", str);
                if (f6 != null) {
                    S.f1318h.e(bundle, str, f6);
                } else {
                    bundle.putSerializable(str, null);
                }
                break;
            case 5:
                Integer num = (Integer) obj;
                k.f("key", str);
                if (num != null) {
                    S.f1312b.e(bundle, str, num);
                } else {
                    bundle.putSerializable(str, null);
                }
                break;
            case 6:
                Long l6 = (Long) obj;
                k.f("key", str);
                if (l6 != null) {
                    S.f1315e.e(bundle, str, l6);
                } else {
                    bundle.putSerializable(str, null);
                }
                break;
            default:
                String str2 = (String) obj;
                k.f("key", str);
                k.f("value", str2);
                bundle.putString(str, str2);
                break;
        }
    }

    @Override // F1.S
    public String f(Object obj) {
        switch (this.f1769q) {
            case 7:
                String str = (String) obj;
                k.f("value", str);
                String strEncode = Uri.encode(str);
                k.e("encode(value)", strEncode);
                return strEncode;
            default:
                return super.f(obj);
        }
    }
}

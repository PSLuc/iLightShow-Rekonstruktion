package Z2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.nanjoran.ilightshow.R;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import p080p.E;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E f6034a = new E(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Locale f6035b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = p027e3.b.a(context).f3068a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, strA);
        }
        if (i == 2) {
            return p027e3.a.m0(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, strA);
        }
        if (i == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, strA);
        }
        if (i == 5) {
            return d(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i == 7) {
            return d(context, "common_google_play_services_network_error_text", strA);
        }
        if (i == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, strA);
        }
        if (i == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", strA);
        }
        switch (i) {
            case 16:
                return d(context, "common_google_play_services_api_unavailable_text", strA);
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                return d(context, "common_google_play_services_sign_in_failed_text", strA);
            case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                return resources.getString(R.string.common_google_play_services_updating_text, strA);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, strA);
        }
    }

    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_title);
        }
        if (i == 2) {
            return resources.getString(R.string.common_google_play_services_update_title);
        }
        if (i == 3) {
            return resources.getString(R.string.common_google_play_services_enable_title);
        }
        if (i == 5) {
            return e(context, "common_google_play_services_invalid_account_title");
        }
        if (i == 7) {
            return e(context, "common_google_play_services_network_error_title");
        }
        if (i == 17) {
            return e(context, "common_google_play_services_sign_in_failed_title");
        }
        if (i != 20) {
            return null;
        }
        return e(context, "common_google_play_services_restricted_profile_title");
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strE = e(context, str);
        if (strE == null) {
            strE = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strE, str2);
    }

    public static String e(Context context, String str) {
        Resources resourcesForApplication;
        E e6 = f6034a;
        synchronized (e6) {
            try {
                Locale locale = p025e1.e.a(context.getResources().getConfiguration()).get(0);
                if (!locale.equals(f6035b)) {
                    e6.clear();
                    f6035b = locale;
                }
                String str2 = (String) e6.get(str);
                if (str2 != null) {
                    return str2;
                }
                AtomicBoolean atomicBoolean = W2.f.f5581a;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication != null) {
                    int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier != 0) {
                        String string = resourcesForApplication.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            f6034a.put(str, string);
                            return string;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

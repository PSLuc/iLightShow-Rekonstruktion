package W2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.nanjoran.ilightshow.R;
import com.spotify.sdk.android.auth.AuthorizationClient;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f5580a;

    static {
        AtomicBoolean atomicBoolean = f.f5581a;
        f5580a = 12451000;
    }

    public Intent a(int i, Context context, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && p027e3.a.m0(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(f5580a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                L2.j jVarA = p027e3.b.a(context);
                sb.append(jVarA.f3068a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(AuthorizationClient.PlayStoreParams.ID, "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:83:0x0155  */
    /* JADX WARN: Code duplicated, block: B:88:0x0172  */
    /* JADX WARN: Code duplicated, block: B:90:0x0177  */
    /* JADX WARN: Code duplicated, block: B:91:0x0179  */
    /* JADX WARN: Code duplicated, block: B:94:0x017e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0182  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a7  */
    /* JADX WARN: Instruction removed from duplicated block: B:88:0x0172, please report this as an issue */
    public int b(Context context, int i) {
        boolean z5;
        PackageInfo packageInfo;
        int i3;
        int i6;
        ApplicationInfo applicationInfo;
        boolean z6 = true;
        int i7 = 0;
        AtomicBoolean atomicBoolean = f.f5581a;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f.f5582b.get()) {
            synchronized (Z2.n.f6046a) {
                try {
                    if (!Z2.n.f6047b) {
                        Z2.n.f6047b = true;
                        try {
                            Bundle bundle = p027e3.b.a(context).f3068a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                            if (bundle != null) {
                                bundle.getString("com.google.app.id");
                                Z2.n.f6048c = bundle.getInt("com.google.android.gms.version");
                            }
                        } catch (PackageManager.NameNotFoundException e6) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e6);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i8 = Z2.n.f6048c;
            if (i8 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i8 != 12451000) {
                int i9 = f5580a;
                StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + 104 + String.valueOf(i8).length() + 194);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(i9);
                sb.append(" but found ");
                sb.append(i8);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new GooglePlayServicesIncorrectManifestValueException(sb.toString());
            }
        }
        if (p027e3.a.m0(context)) {
            z5 = false;
        } else {
            if (p027e3.a.f8738h == null) {
                p027e3.a.f8738h = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (p027e3.a.f8738h.booleanValue()) {
                z5 = false;
            } else {
                z5 = true;
            }
        }
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        int i10 = 9;
        if (z5) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 134225984);
            } catch (PackageManager.NameNotFoundException unused2) {
                String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing.");
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 134217792);
            synchronized (g.class) {
                if (g.i == null) {
                    j jVar = n.f5595a;
                    synchronized (n.class) {
                        try {
                            if (n.f5597c == null) {
                                n.f5597c = context.getApplicationContext();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    g gVar = new g(i7);
                    context.getApplicationContext();
                    g.i = gVar;
                }
            }
            if (!g.n(packageInfo2)) {
                String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid.");
            } else if (z5) {
                Z2.n.b(packageInfo);
                if (!g.n(packageInfo)) {
                    String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid.");
                } else if (z5 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    i3 = packageInfo2.versionCode;
                    if (i3 == -1) {
                        i6 = -1;
                    } else {
                        i6 = i3 / 1000;
                    }
                    if (i6 < (i != -1 ? i / 1000 : -1)) {
                        new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i3).length());
                        i10 = 2;
                    } else {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e7) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e7);
                                i10 = 1;
                            }
                        }
                        if (applicationInfo.enabled) {
                            i10 = 0;
                        } else {
                            i10 = 3;
                        }
                    }
                } else {
                    String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services.");
                }
            } else if (z5) {
                i3 = packageInfo2.versionCode;
                if (i3 == -1) {
                    i6 = -1;
                } else {
                    i6 = i3 / 1000;
                }
                if (i6 < (i != -1 ? i / 1000 : -1)) {
                    new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i3).length());
                    i10 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                }
            } else {
                i3 = packageInfo2.versionCode;
                if (i3 == -1) {
                    i6 = -1;
                } else {
                    i6 = i3 / 1000;
                }
                if (i6 < (i != -1 ? i / 1000 : -1)) {
                    new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i3).length());
                    i10 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            String.valueOf(packageName).concat(" requires Google Play services, but they are missing.");
        }
        if (i10 != 18) {
            if (i10 == 1) {
                try {
                    Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                    while (it.hasNext()) {
                        if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                        }
                    }
                    z6 = context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
                } catch (PackageManager.NameNotFoundException | Exception unused4) {
                    z6 = false;
                }
            } else {
                z6 = false;
            }
        }
        if (z6) {
            return 18;
        }
        return i10;
    }
}

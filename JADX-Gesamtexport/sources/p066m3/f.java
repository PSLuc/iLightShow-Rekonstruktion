package p066m3;

import B.AbstractC0013g0;
import O1.C0308a;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import p072n3.i;
import p072n3.j;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0308a f10417c = new C0308a("ReviewService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f10418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10419b;

    public f(Context context) {
        String strEncodeToString;
        this.f10419b = context.getPackageName();
        C0308a c0308a = j.f10561a;
        try {
            if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                c0308a.d("Play Store package is disabled.", new Object[0]);
                return;
            }
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    c0308a.d("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    byte[] byteArray = signature.toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.update(byteArray);
                        strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        strEncodeToString = "";
                    }
                    arrayList.add(strEncodeToString);
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                        String str = Build.TAGS;
                        if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                        }
                    }
                    this.f10418a = new i(context, f10417c, new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"));
                    return;
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        } else {
                            sb.append((CharSequence) ", ");
                        }
                    }
                }
                c0308a.d(AbstractC0013g0.i("Play Store package certs are not valid. Found these sha256 certs: [", sb.toString(), "]."), new Object[0]);
            } catch (PackageManager.NameNotFoundException unused2) {
                c0308a.d("Play Store package is not found.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            c0308a.d("Play Store package is not found.", new Object[0]);
        }
    }
}

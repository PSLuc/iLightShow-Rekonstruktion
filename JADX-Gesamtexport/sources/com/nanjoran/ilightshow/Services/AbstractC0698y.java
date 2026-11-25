package com.nanjoran.ilightshow.Services;

import B.AbstractC0013g0;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.auth0.jwt.exceptions.SignatureGenerationException;
import com.nanjoran.outpost.outpost.Config;
import com.nanjoran.outpost.outpost.Outpost;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.nanjoran.ilightshow.Services.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0698y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f8496a = {19, -40, -100, -45, 10, 85, 69, 22, 48, 94, -118, 71, 36, -14, -75, 35, -42, -55, 107, 96, -40, 28, 60, -24, -108, 61, 73, 123, 71, 56, -117, -40, -94, 11, -102, -35, 103, 98, -127, 10, -119, 113, 71, -124, -37, 3, -81, 106, -46, -72, 79, 36, 31, 89, 52, 45, 78, 35, -4, -90, -114, -67, -121, 110};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f8497b = {108, -53, -104, -59, 60, 10, -101, 122, 35, -56, 16, 49, 117, -26, 104, -49, 113, -98, -15, -109, -36, 111, -8, -23, 21, -51, -24, 51, 28, -14, -50, -67, -64, -58, -92, -120, 55, -115, -3, 2, 101, 32, 78, 106, -86, 118, -74, 87, -18, -67, 67, 67, -120, 77, -17, -113, 28, -30, 67, 62, 75, -78, -93, -18};

    public static final float a(float f6) {
        float f7 = f6 % 360.0f;
        return f7 < 0.0f ? f7 + 360.0f : f7;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0113  */
    public static Config b(Context context) {
        NetworkCapabilities networkCapabilities;
        Object objV;
        E4.k.f("context", context);
        Context applicationContext = context.getApplicationContext();
        Config configNewConfig = Outpost.newConfig("quic://outpost.nanjoran.com:4567", applicationContext.getFilesDir().getAbsolutePath());
        PackageManager packageManager = applicationContext.getPackageManager();
        E4.k.e("getPackageManager(...)", packageManager);
        String packageName = applicationContext.getPackageName();
        E4.k.e("getPackageName(...)", packageName);
        PackageInfo packageInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(packageName, 0);
        long longVersionCode = packageInfo.getLongVersionCode();
        String str = packageInfo.versionName;
        configNewConfig.setAppID(applicationContext.getPackageName());
        if (str == null) {
            str = "1.0.0";
        }
        configNewConfig.setAppVersion(str);
        configNewConfig.setAppBuild(String.valueOf(longVersionCode));
        configNewConfig.setReportedOS("Android");
        configNewConfig.setReportedDeviceType(applicationContext.getResources().getConfiguration().smallestScreenWidthDp >= 600 ? "tablet" : "phone");
        String country = Locale.getDefault().getCountry();
        if (country == null) {
            country = "";
        }
        configNewConfig.setReportedCountryCode(country);
        configNewConfig.setEnableDebugLogging(false);
        configNewConfig.setAllowInsecureCertificates(false);
        Object systemService = applicationContext.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        Map mapU = p089q4.v.f11238h;
        if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null) {
            if (networkCapabilities.hasTransport(1)) {
                mapU = p089q4.z.U(new p084p4.h("networkType", "wifi"), new p084p4.h("networkKind", "wifi"));
            } else if (networkCapabilities.hasTransport(0)) {
                Object obj = "cellular";
                p084p4.h hVar = new p084p4.h("networkType", "cellular");
                if (com.fasterxml.jackson.databind.deser.std.d0.j(applicationContext, "android.permission.READ_PHONE_STATE") == 0) {
                    Object systemService2 = applicationContext.getSystemService("phone");
                    TelephonyManager telephonyManager = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
                    if (telephonyManager != null) {
                        try {
                            int dataNetworkType = telephonyManager.getDataNetworkType();
                            if (dataNetworkType == 12) {
                                objV = "3g";
                            } else if (dataNetworkType == 13) {
                                objV = "4g";
                            } else if (dataNetworkType == 15) {
                                objV = "3g";
                            } else if (dataNetworkType != 20) {
                                switch (dataNetworkType) {
                                    case 1:
                                    case 2:
                                    case 4:
                                    case 7:
                                        objV = "2g";
                                        break;
                                    case 3:
                                    case 5:
                                    case 6:
                                    case 8:
                                    case 9:
                                    case 10:
                                        objV = "3g";
                                        break;
                                    default:
                                        objV = "cellular";
                                        break;
                                }
                            } else {
                                objV = "5g";
                            }
                        } catch (Throwable th) {
                            objV = S1.V.v(th);
                        }
                        obj = (String) (objV instanceof p084p4.j ? "cellular" : objV);
                    }
                }
                mapU = p089q4.z.U(hVar, new p084p4.h("networkKind", obj));
            } else if (networkCapabilities.hasTransport(3)) {
                mapU = p089q4.z.U(new p084p4.h("networkType", "wired"), new p084p4.h("networkKind", "wired"));
            }
        }
        String str2 = (String) mapU.get("networkType");
        if (str2 != null) {
            configNewConfig.putReportedInfo("networkType", str2);
        }
        String str3 = (String) mapU.get("networkKind");
        if (str3 != null) {
            configNewConfig.putReportedInfo("networkKind", str3);
        }
        return configNewConfig;
    }

    public static final byte[] c(byte[] bArr) throws IllegalAccessException, IOException, InvocationTargetException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            j5.b bVar = new j5.b(byteArrayInputStream);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, bVar.available()));
                S1.V.u(bVar, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                E4.k.e("toByteArray(...)", byteArray);
                bVar.close();
                byteArrayInputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    S1.h0.i(bVar, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                S1.h0.i(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static final byte[] d(byte[] bArr, byte[] bArr2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        E4.k.f("combinedData", bArr);
        byte[] bArrP0 = p089q4.k.p0(bArr, p081p0.c.D0(0, 12));
        byte[] bArrP1 = p089q4.k.p0(bArr, p081p0.c.D0(12, bArr.length));
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, secretKeySpec, new GCMParameterSpec(128, bArrP0));
        byte[] bArrDoFinal = cipher.doFinal(bArrP1);
        E4.k.e("doFinal(...)", bArrDoFinal);
        return bArrDoFinal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [q4.u] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final byte[] e(byte[] bArr) {
        ?? arrayList;
        int length = bArr.length / 2;
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC0013g0.f(length, "Requested element count ", " is less than zero.").toString());
        }
        ?? arrayList2 = p089q4.u.f11237h;
        int i = 0;
        if (length == 0) {
            arrayList = arrayList2;
        } else if (length >= bArr.length) {
            arrayList = p089q4.l.s0(new p084p4.p(bArr));
        } else if (length == 1) {
            arrayList = com.fasterxml.jackson.databind.deser.std.d0.v(new p084p4.o(bArr[0]));
        } else {
            arrayList = new ArrayList(length);
            int i3 = 0;
            for (byte b6 : bArr) {
                arrayList.add(new p084p4.o(b6));
                i3++;
                if (i3 == length) {
                    break;
                }
            }
        }
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC0013g0.f(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length != 0) {
            int length2 = bArr.length;
            if (length >= length2) {
                arrayList2 = p089q4.l.s0(new p084p4.p(bArr));
            } else if (length == 1) {
                arrayList2 = com.fasterxml.jackson.databind.deser.std.d0.v(new p084p4.o(bArr[length2 - 1]));
            } else {
                arrayList2 = new ArrayList(length);
                for (int i6 = length2 - length; i6 < length2; i6++) {
                    arrayList2.add(new p084p4.o(bArr[i6]));
                }
            }
        }
        Iterator it = arrayList.iterator();
        Iterator it2 = arrayList2.iterator();
        ArrayList arrayList3 = new ArrayList(Math.min(p089q4.n.P(arrayList, 10), p089q4.n.P(arrayList2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList3.add(new p084p4.o((byte) (((p084p4.o) it.next()).f10858h ^ ((p084p4.o) it2.next()).f10858h)));
        }
        ArrayList arrayList4 = new ArrayList(p089q4.n.P(arrayList3, 10));
        int size = arrayList3.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList3.get(i7);
            i7++;
            arrayList4.add(Byte.valueOf(((p084p4.o) obj).f10858h));
        }
        byte[] bArr2 = new byte[arrayList4.size()];
        int size2 = arrayList4.size();
        int i8 = 0;
        while (i8 < size2) {
            Object obj2 = arrayList4.get(i8);
            i8++;
            bArr2[i] = ((Number) obj2).byteValue();
            i++;
        }
        return bArr2;
    }

    public static String f(Context context) {
        E4.k.f("context", context);
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        D.x xVar = new D.x(e(f8497b));
        p055k2.a aVar = P1.a.f4596c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap.put("os", "android");
        linkedHashMap.put("user_id", string);
        linkedHashMap.put("appBuild", 29859116);
        linkedHashMap.put("exp", new Date(System.currentTimeMillis() + ((long) 15000)));
        linkedHashMap2.put("alg", "HS256");
        if (!linkedHashMap2.containsKey("typ")) {
            linkedHashMap2.put("typ", "JWT");
        }
        P1.a aVar2 = new P1.a(xVar, linkedHashMap2, linkedHashMap);
        Base64.Encoder encoderWithoutPadding = Base64.getUrlEncoder().withoutPadding();
        Charset charset = StandardCharsets.UTF_8;
        String strEncodeToString = encoderWithoutPadding.encodeToString(aVar2.f4597a.getBytes(charset));
        String strEncodeToString2 = Base64.getUrlEncoder().withoutPadding().encodeToString(aVar2.f4598b.getBytes(charset));
        byte[] bytes = strEncodeToString.getBytes(charset);
        byte[] bytes2 = strEncodeToString2.getBytes(charset);
        try {
            Z2.f fVar = (Z2.f) xVar.i;
            byte[] bArr = (byte[]) xVar.f707j;
            fVar.getClass();
            return strEncodeToString + "." + strEncodeToString2 + "." + Base64.getUrlEncoder().withoutPadding().encodeToString(Z2.f.e(bArr, bytes, bytes2));
        } catch (InvalidKeyException | NoSuchAlgorithmException e6) {
            throw new SignatureGenerationException("The Token's Signature couldn't be generated when signing using the Algorithm: " + xVar, e6);
        }
    }

    public static E0 g() {
        return E0.f8249o;
    }

    public static y0 h(int i) {
        int iMin = Math.min(G4.a.C((((double) i) * 5.0d) / 100.0d), 5);
        y0 y0Var = new y0();
        y0Var.f8499b = 255;
        y0Var.f8498a = iMin;
        if (iMin == 0) {
            y0Var.f8499b = 220;
            y0Var.f8500c = -100;
            return y0Var;
        }
        if (iMin == 1) {
            y0Var.f8499b = 230;
            y0Var.f8500c = 0;
            return y0Var;
        }
        if (iMin == 2) {
            y0Var.f8500c = 0;
            y0Var.f8499b = 250;
            return y0Var;
        }
        if (iMin == 3) {
            y0Var.f8499b = 255;
            y0Var.f8500c = 80;
            y0Var.f8501d = false;
            return y0Var;
        }
        if (iMin == 4) {
            y0Var.f8499b = 255;
            y0Var.f8500c = 80;
            y0Var.f8501d = true;
            return y0Var;
        }
        if (iMin != 5) {
            return y0Var;
        }
        y0Var.f8499b = 255;
        y0Var.f8500c = 200;
        y0Var.f8502e = true;
        y0Var.f8501d = true;
        y0Var.f8503f = true;
        return y0Var;
    }

    public static final double i(Date date, Date date2) {
        E4.k.f("date", date2);
        return (date.getTime() - date2.getTime()) / 1000.0d;
    }
}

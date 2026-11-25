package p008b1;

import B.C0025m0;
import G0.p;
import I0.d;
import I1.g;
import O1.s;
import O1.t;
import W3.a;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import c5.C0495p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p002a1.h;
import p031f1.b;
import p031f1.c;
import p031f1.e;
import p080p.E;
import p080p.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z2.f f7052a = new Z2.f(21);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f7053b = new n(16);

    public static Typeface a(Context context, e[] eVarArr, int i) {
        f7052a.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (e eVar : eVarArr) {
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(eVar.f8863a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                        }
                    } else {
                        try {
                            Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(eVar.f8865c).setSlant(eVar.f8866d ? 1 : 0).setTtcIndex(eVar.f8864b).build();
                            if (builder == null) {
                                builder = new FontFamily.Builder(fontBuild);
                            } else {
                                builder.addFont(fontBuild);
                            }
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(Z2.f.j(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    public static Typeface b(Context context, p002a1.e eVar, Resources resources, int i, String str, int i3, int i6, d dVar, boolean z5) {
        Typeface typefaceCreate;
        Typeface typeface;
        int i7 = 9;
        boolean z6 = true;
        int i8 = 2;
        byte b6 = 0;
        Typeface typefaceBuild = null;
        if (eVar instanceof h) {
            h hVar = (h) eVar;
            String str2 = hVar.f6138d;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (dVar != null) {
                    new Handler(Looper.getMainLooper()).post(new g(dVar, i8, typefaceCreate));
                }
                return typefaceCreate;
            }
            if (!z5 ? dVar != null : hVar.f6137c != 0) {
                z6 = false;
            }
            int i9 = z5 ? hVar.f6136b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            C0025m0 c0025m0 = new C0025m0(20, (boolean) (b6 == true ? 1 : 0));
            c0025m0.i = dVar;
            p pVar = hVar.f6135a;
            C0495p c0495p = new C0495p(c0025m0, 6, handler);
            if (z6) {
                n nVar = p031f1.d.f8859a;
                String str3 = ((String) pVar.i) + "-" + i6;
                typeface = (Typeface) p031f1.d.f8859a.a(str3);
                if (typeface != null) {
                    handler.post(new O1.n(c0025m0, i7, typeface));
                    typefaceBuild = typeface;
                } else if (i9 == -1) {
                    c cVarA = p031f1.d.a(str3, context, pVar, i6);
                    c0495p.v(cVarA);
                    typefaceBuild = cVarA.f8857a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    c cVar = (c) p031f1.d.f8860b.submit(new b(str3, context, pVar, i6, 0)).get(i9, TimeUnit.MILLISECONDS);
                                    c0495p.v(cVar);
                                    typefaceBuild = cVar.f8857a;
                                } catch (ExecutionException e6) {
                                    throw new RuntimeException(e6);
                                }
                            } catch (InterruptedException e7) {
                                throw e7;
                            }
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) c0495p.f7476j).post(new a((C0025m0) c0495p.i, -3));
                    }
                }
            } else {
                n nVar2 = p031f1.d.f8859a;
                String str4 = ((String) pVar.i) + "-" + i6;
                typeface = (Typeface) p031f1.d.f8859a.a(str4);
                if (typeface != null) {
                    handler.post(new O1.n(c0025m0, i7, typeface));
                    typefaceBuild = typeface;
                } else {
                    s sVar = new s(i8, c0495p);
                    synchronized (p031f1.d.f8861c) {
                        try {
                            E e8 = p031f1.d.f8862d;
                            ArrayList arrayList = (ArrayList) e8.get(str4);
                            if (arrayList != null) {
                                arrayList.add(sVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(sVar);
                                e8.put(str4, arrayList2);
                                b bVar = new b(str4, context, pVar, i6, 1);
                                ThreadPoolExecutor threadPoolExecutor = p031f1.d.f8860b;
                                s sVar2 = new s(3, str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                t tVar = new t();
                                tVar.i = bVar;
                                tVar.f4531j = sVar2;
                                tVar.f4532k = handler2;
                                threadPoolExecutor.execute(tVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        } else {
            p002a1.f fVar = (p002a1.f) eVar;
            f7052a.getClass();
            try {
                FontFamily.Builder builder = null;
                for (p002a1.g gVar : fVar.f6129a) {
                    try {
                        Font fontBuild = new Font.Builder(resources, gVar.f6134e).setWeight(gVar.f6130a).setSlant(gVar.f6131b ? 1 : 0).setTtcIndex(gVar.f6133d).setFontVariationSettings(gVar.f6132c).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                    } catch (IOException unused3) {
                    }
                }
                if (builder != null) {
                    FontFamily fontFamilyBuild = builder.build();
                    typefaceBuild = new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(Z2.f.j(fontFamilyBuild, i6).getStyle()).build();
                }
            } catch (Exception unused4) {
            }
            if (dVar != null) {
                if (typefaceBuild != null) {
                    new Handler(Looper.getMainLooper()).post(new g(dVar, i8, typefaceBuild));
                } else {
                    dVar.a(-3);
                }
            }
        }
        if (typefaceBuild != null) {
            f7053b.b(d(resources, i, str, i3, i6), typefaceBuild);
        }
        return typefaceBuild;
    }

    public static Typeface c(Resources resources, int i, String str, int i3, int i6) {
        Typeface typefaceBuild;
        f7052a.getClass();
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            typefaceBuild = new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            typefaceBuild = null;
        }
        if (typefaceBuild != null) {
            f7053b.b(d(resources, i, str, i3, i6), typefaceBuild);
        }
        return typefaceBuild;
    }

    public static String d(Resources resources, int i, String str, int i3, int i6) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i3 + '-' + i + '-' + i6;
    }
}

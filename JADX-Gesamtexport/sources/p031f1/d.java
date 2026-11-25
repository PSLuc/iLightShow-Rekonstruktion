package p031f1;

import G0.p;
import K3.e;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p008b1.f;
import p080p.E;
import p080p.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f8859a = new n(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f8860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f8861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final E f8862d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new g());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f8860b = threadPoolExecutor;
        f8861c = new Object();
        f8862d = new E(0);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020 A[EDGE_INSN: B:10:0x0020->B:24:0x003d BREAK  A[LOOP:0: B:17:0x002d->B:23:0x003a]] */
    public static c a(String str, Context context, p pVar, int i) {
        n nVar = f8859a;
        Typeface typeface = (Typeface) nVar.a(str);
        if (typeface != null) {
            return new c(typeface);
        }
        try {
            e eVarA = a.a(context, pVar);
            int i3 = 1;
            e[] eVarArr = (e[]) eVarA.f2139c;
            int i6 = eVarA.f2138b;
            if (i6 != 0) {
                if (i6 != 1) {
                    i3 = -3;
                    break;
                }
                i3 = -2;
            } else if (eVarArr != null && eVarArr.length != 0) {
                i3 = 0;
                for (e eVar : eVarArr) {
                    int i7 = eVar.f8867e;
                    if (i7 != 0) {
                        if (i7 >= 0) {
                            i3 = i7;
                            break;
                        }
                        i3 = -3;
                        break;
                    }
                }
            }
            if (i3 != 0) {
                return new c(i3);
            }
            Typeface typefaceA = f.a(context, eVarArr, i);
            if (typefaceA == null) {
                return new c(-3);
            }
            nVar.b(str, typefaceA);
            return new c(typefaceA);
        } catch (PackageManager.NameNotFoundException unused) {
            return new c(-1);
        }
    }
}

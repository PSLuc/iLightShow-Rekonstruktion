package F;

import B.C0031p0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p015c2.AbstractC0473d;
import p045i1.AbstractC0762x;
import p045i1.ViewTreeObserverOnGlobalLayoutListenerC0756q;
import p057l.B0;
import p057l.C0805o;
import p130y0.G0;

/* JADX INFO: renamed from: F.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0068j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1184d;

    public /* synthetic */ C0068j(int i) {
        this.f1181a = i;
    }

    public static void d(C0068j c0068j, j5.a aVar) {
        int length = ((int[]) c0068j.f1184d).length;
        int i = 0;
        for (int i3 = 0; i3 < length; i3++) {
            ((int[]) c0068j.f1184d)[i3] = i;
            j5.d.f(c0068j.f1182b, (int[]) c0068j.f1183c, i, aVar);
            i += 1080;
        }
    }

    public boolean a(R3.c cVar) {
        Object obj;
        Object obj2 = this.f1183c;
        while (true) {
            Object[] objArr = (Object[]) obj2;
            if (objArr == null) {
                return false;
            }
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (obj == p047i4.f.f9592h) {
                    cVar.b();
                    return true;
                }
                if (obj instanceof p047i4.d) {
                    cVar.onError(((p047i4.d) obj).f9590h);
                    return true;
                }
                if (obj instanceof p047i4.e) {
                    cVar.h(((p047i4.e) obj).f9591h);
                } else {
                    cVar.c(obj);
                }
            }
            obj2 = objArr[4];
        }
    }

    public void b(Object obj) {
        int i = this.f1182b;
        if (i == 4) {
            Object[] objArr = new Object[5];
            ((Object[]) this.f1184d)[4] = objArr;
            this.f1184d = objArr;
            i = 0;
        }
        ((Object[]) this.f1184d)[i] = obj;
        this.f1182b = i + 1;
    }

    public void c() {
        B0 b6;
        ImageView imageView = (ImageView) this.f1183c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            p057l.H.a(drawable);
        }
        if (drawable == null || (b6 = (B0) this.f1184d) == null) {
            return;
        }
        C0805o.c(drawable, b6, imageView.getDrawableState());
    }

    public Object e() {
        D.x xVar = (D.x) this.f1183c;
        String str = (String) this.f1184d;
        F1.S s6 = (F1.S) ((LinkedHashMap) xVar.f707j).get(str);
        Object objA = s6 != null ? s6.a(str, (Bundle) xVar.i) : null;
        if (objA != null) {
            return objA;
        }
        throw new IllegalStateException("Unexpected null value for non-nullable argument ".concat((String) this.f1184d).toString());
    }

    public boolean equals(Object obj) {
        switch (this.f1181a) {
            case 9:
                if (obj == this) {
                    return true;
                }
                if (p109u2.i.s((Class) this.f1183c, obj)) {
                    int length = Array.getLength(obj);
                    int i = this.f1182b;
                    if (length == i) {
                        for (int i3 = 0; i3 < i; i3++) {
                            Object obj2 = Array.get(this.f1184d, i3);
                            Object obj3 = Array.get(obj, i3);
                            if (obj2 == obj3 || obj2 == null || obj2.equals(obj3)) {
                            }
                        }
                        return true;
                    }
                }
                return false;
            default:
                return super.equals(obj);
        }
    }

    public String f() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f1182b + 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = ((Object[]) this.f1183c)[i3];
            if (obj instanceof a5.g) {
                a5.g gVar = (a5.g) obj;
                if (!E4.k.a(gVar.c(), a5.j.f6375k)) {
                    int i6 = ((int[]) this.f1184d)[i3];
                    if (i6 >= 0) {
                        sb.append(".");
                        sb.append(gVar.f(i6));
                    }
                } else if (((int[]) this.f1184d)[i3] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f1184d)[i3]);
                    sb.append("]");
                }
            } else if (obj != e5.i.f8765a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        String string = sb.toString();
        E4.k.e("toString(...)", string);
        return string;
    }

    public void g(int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f1183c;
        Context context = imageView.getContext();
        int[] iArr = h.a.f9196e;
        C0031p0 c0031p0O = C0031p0.o(context, null, iArr, i);
        Context context2 = imageView.getContext();
        ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = p045i1.A.f9394a;
        AbstractC0762x.d(imageView, context2, iArr, null, (TypedArray) c0031p0O.f394j, i, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) c0031p0O.f394j;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0473d.z(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                p057l.H.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                p070n1.d.c(imageView, c0031p0O.g(2));
            }
            if (typedArray.hasValue(3)) {
                p070n1.d.d(imageView, p057l.H.b(typedArray.getInt(3, -1), null));
            }
        } finally {
            c0031p0O.p();
        }
    }

    public String toString() {
        switch (this.f1181a) {
            case 5:
                return f();
            default:
                return super.toString();
        }
    }

    public C0068j(int i, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f1181a = 2;
        this.f1182b = i;
        this.f1184d = str;
        this.f1183c = arrayList;
    }

    public C0068j() {
        this.f1181a = 6;
        Object[] objArr = new Object[5];
        this.f1183c = objArr;
        this.f1184d = objArr;
    }

    public C0068j(ImageView imageView) {
        this.f1181a = 8;
        this.f1182b = 0;
        this.f1183c = imageView;
    }

    public C0068j(D.x xVar) {
        this.f1181a = 1;
        this.f1183c = xVar;
        this.f1182b = -1;
        this.f1184d = "";
    }

    public C0068j(int i, Object obj) {
        this.f1181a = 10;
        this.f1183c = obj;
        this.f1182b = i;
    }

    public C0068j(Class cls, int i, Object obj) {
        this.f1181a = 9;
        this.f1183c = cls;
        this.f1182b = i;
        this.f1184d = obj;
    }

    public C0068j(G0 g6) {
        this.f1181a = 0;
        this.f1183c = g6;
    }
}

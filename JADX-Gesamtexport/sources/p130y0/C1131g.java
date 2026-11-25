package p130y0;

import E4.k;
import G0.C;
import G0.C0108d;
import G0.C0110f;
import L0.i;
import L0.j;
import R0.a;
import R0.o;
import S0.m;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import java.util.List;
import p030f0.c;
import p035g0.L;
import p035g0.r;

/* JADX INFO: renamed from: y0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1131g implements Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClipboardManager f14389a;

    public C1131g(Context context) {
        Object systemService = context.getSystemService("clipboard");
        k.d("null cannot be cast to non-null type android.content.ClipboardManager", systemService);
        this.f14389a = (ClipboardManager) systemService;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a3  */
    public final void a(C0110f c0110f) {
        boolean zIsEmpty = c0110f.b().isEmpty();
        CharSequence charSequence = c0110f.f1494h;
        if (!zIsEmpty) {
            SpannableString spannableString = new SpannableString(charSequence);
            C1136i0 c1136i0 = new C1136i0();
            c1136i0.f14396h = Parcel.obtain();
            List listB = c0110f.b();
            int size = listB.size();
            for (int i = 0; i < size; i++) {
                C0108d c0108d = (C0108d) listB.get(i);
                C c6 = (C) c0108d.f1490a;
                ((Parcel) c1136i0.f14396h).recycle();
                c1136i0.f14396h = Parcel.obtain();
                long jA = c6.f1428a.a();
                long j4 = r.f9085l;
                byte b6 = 1;
                if (!r.c(jA, j4)) {
                    c1136i0.a((byte) 1);
                    ((Parcel) c1136i0.f14396h).writeLong(c6.f1428a.a());
                }
                long j6 = m.f4901c;
                long j7 = c6.f1429b;
                if (!m.a(j7, j6)) {
                    c1136i0.a((byte) 2);
                    c1136i0.c(j7);
                }
                L0.k kVar = c6.f1430c;
                if (kVar != null) {
                    c1136i0.a((byte) 3);
                    ((Parcel) c1136i0.f14396h).writeInt(kVar.f3028h);
                }
                i iVar = c6.f1431d;
                if (iVar != null) {
                    c1136i0.a((byte) 4);
                    int i3 = iVar.f3023a;
                    c1136i0.a((i3 != 0 && i3 == 1) ? (byte) 1 : (byte) 0);
                }
                j jVar = c6.f1432e;
                if (jVar != null) {
                    c1136i0.a((byte) 5);
                    int i6 = jVar.f3024a;
                    if (i6 == 0) {
                        b6 = 0;
                    } else if (i6 != 1) {
                        if (i6 == 2) {
                            b6 = 2;
                        } else if (i6 == 3) {
                            b6 = 3;
                        } else {
                            b6 = 0;
                        }
                    }
                    c1136i0.a(b6);
                }
                String str = c6.f1434g;
                if (str != null) {
                    c1136i0.a((byte) 6);
                    ((Parcel) c1136i0.f14396h).writeString(str);
                }
                long j8 = c6.f1435h;
                if (!m.a(j8, j6)) {
                    c1136i0.a((byte) 7);
                    c1136i0.c(j8);
                }
                a aVar = c6.i;
                if (aVar != null) {
                    c1136i0.a((byte) 8);
                    c1136i0.b(aVar.f4730a);
                }
                o oVar = c6.f1436j;
                if (oVar != null) {
                    c1136i0.a((byte) 9);
                    c1136i0.b(oVar.f4754a);
                    c1136i0.b(oVar.f4755b);
                }
                long j9 = c6.f1438l;
                if (!r.c(j9, j4)) {
                    c1136i0.a((byte) 10);
                    ((Parcel) c1136i0.f14396h).writeLong(j9);
                }
                R0.j jVar2 = c6.f1439m;
                if (jVar2 != null) {
                    c1136i0.a((byte) 11);
                    ((Parcel) c1136i0.f14396h).writeInt(jVar2.f4749a);
                }
                L l6 = c6.f1440n;
                if (l6 != null) {
                    c1136i0.a((byte) 12);
                    ((Parcel) c1136i0.f14396h).writeLong(l6.f9035a);
                    long j10 = l6.f9036b;
                    c1136i0.b(c.d(j10));
                    c1136i0.b(c.e(j10));
                    c1136i0.b(l6.f9037c);
                }
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) c1136i0.f14396h).marshall(), 0)), c0108d.f1491b, c0108d.f1492c, 33);
            }
            charSequence = spannableString;
        }
        this.f14389a.setPrimaryClip(ClipData.newPlainText("plain text", charSequence));
    }
}

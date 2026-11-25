package p007b0;

import D4.c;
import E0.g;
import E0.l;
import E0.o;
import E4.k;
import G0.C0110f;
import android.os.Build;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import java.util.List;
import java.util.function.Consumer;
import p130y0.B0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f7023a = new a();

    public static void a(c cVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        B0 b6;
        l lVar;
        c cVar2;
        int i = 0;
        while (i < longSparseArray.size()) {
            int i3 = i + 1;
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponseJ = D0.a.j(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseJ != null && (value = viewTranslationResponseJ.getValue("android:text")) != null && (text = value.getText()) != null && (b6 = (B0) cVar.d().f((int) jKeyAt)) != null && (lVar = b6.f14210a) != null) {
                Object obj = lVar.f947d.f939h.get(g.i);
                if (obj == null) {
                    obj = null;
                }
                E0.a aVar = (E0.a) obj;
                if (aVar != null && (cVar2 = (c) aVar.f903b) != null) {
                }
            }
            i = i3;
        }
    }

    public final void b(c cVar, long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        l lVar;
        String strR;
        for (long j4 : jArr) {
            B0 b6 = (B0) cVar.d().f((int) j4);
            if (b6 != null && (lVar = b6.f14210a) != null) {
                D0.a.l();
                ViewTranslationRequest.Builder builderH = D0.a.h(cVar.f7029h.getAutofillId(), lVar.f950g);
                Object obj = lVar.f947d.f939h.get(o.f990u);
                if (obj == null) {
                    obj = null;
                }
                List list = (List) obj;
                if (list != null && (strR = G4.a.r("\n", list)) != null) {
                    builderH.setValue("android:text", TranslationRequestValue.forText(new C0110f(strR, null, 6)));
                    consumer.accept(builderH.build());
                }
            }
        }
    }

    public final void c(c cVar, LongSparseArray<ViewTranslationResponse> longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (k.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            a(cVar, longSparseArray);
        } else {
            cVar.f7029h.post(new I1.g(cVar, 3, longSparseArray));
        }
    }
}

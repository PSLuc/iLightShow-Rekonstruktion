package O0;

import G0.n;
import G0.q;
import android.text.TextPaint;
import java.util.ArrayList;
import p035g0.AbstractC0712m;
import p035g0.InterfaceC0714o;
import p035g0.L;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f4419a = new l(false);

    public static final void a(n nVar, InterfaceC0714o interfaceC0714o, AbstractC0712m abstractC0712m, float f6, L l6, R0.j jVar, p044i0.e eVar) {
        ArrayList arrayList = nVar.f1520h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            q qVar = (q) arrayList.get(i);
            qVar.f1527a.g(interfaceC0714o, abstractC0712m, f6, l6, jVar, eVar);
            interfaceC0714o.g(0.0f, qVar.f1527a.b());
        }
    }

    public static final void b(TextPaint textPaint, float f6) {
        if (Float.isNaN(f6)) {
            return;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f6 * 255));
    }
}

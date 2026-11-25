package A2;

import E4.k;
import E4.l;
import p084p4.h;

/* JADX INFO: loaded from: classes.dex */
public final class a extends l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f17h = new a(1);

    @Override // D4.c
    public final Object invoke(Object obj) {
        h hVar = (h) obj;
        k.f("<name for destructuring parameter 0>", hVar);
        String str = (String) hVar.f10849h;
        String str2 = (String) hVar.i;
        k.e("value", str2);
        if (M4.l.i0(str2)) {
            return str;
        }
        return str + '=' + str2;
    }
}

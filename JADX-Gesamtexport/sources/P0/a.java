package P0;

import N0.b;
import O0.f;
import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import p089q4.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f4595a = new a();

    public final Object a(b bVar) {
        ArrayList arrayList = new ArrayList(n.P(bVar, 10));
        Iterator<E> it = bVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((N0.a) it.next()).f3876a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(f fVar, b bVar) {
        ArrayList arrayList = new ArrayList(n.P(bVar, 10));
        Iterator<E> it = bVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((N0.a) it.next()).f3876a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        fVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}

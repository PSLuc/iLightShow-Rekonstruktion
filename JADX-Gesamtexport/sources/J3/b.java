package J3;

import E4.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1922h;
    public final /* synthetic */ e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ K3.e f1923j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1924k;

    public /* synthetic */ b(int i, e eVar, K3.e eVar2, ArrayList arrayList) {
        this.f1922h = i;
        this.i = eVar;
        this.f1923j = eVar2;
        this.f1924k = arrayList;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        String lowerCase;
        int i = this.f1922h;
        e eVar = this.i;
        K3.e eVar2 = this.f1923j;
        ArrayList arrayList = this.f1924k;
        List<K3.a> list = (List) obj;
        if (i != eVar.f1934d) {
            eVar2.g();
        } else {
            for (K3.a aVar : list) {
                Iterator it = arrayList.iterator();
                k.e("iterator(...)", it);
                boolean z5 = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    k.e("next(...)", next);
                    K3.a aVar2 = (K3.a) next;
                    String str = aVar2.id;
                    if (str != null) {
                        Locale locale = Locale.ROOT;
                        String lowerCase2 = str.toLowerCase(locale);
                        k.e("toLowerCase(...)", lowerCase2);
                        String str2 = aVar.id;
                        if (str2 != null) {
                            lowerCase = str2.toLowerCase(locale);
                            k.e("toLowerCase(...)", lowerCase);
                        } else {
                            lowerCase = null;
                        }
                        if (lowerCase2.equals(lowerCase)) {
                            aVar2.ip = aVar.ip;
                            z5 = true;
                        }
                    }
                }
                if (!z5 && !eVar.f1937g) {
                    eVar.f1932b.add(aVar);
                }
            }
            eVar2.g();
        }
        return x.f10867a;
    }
}

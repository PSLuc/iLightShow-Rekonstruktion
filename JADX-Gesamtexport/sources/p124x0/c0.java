package p124x0;

import E4.k;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c0 f14003b = new c0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14004a;

    public /* synthetic */ c0(int i) {
        this.f14004a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f14004a) {
            case 0:
                D d6 = (D) obj;
                D d7 = (D) obj2;
                int iH = k.h(d7.f13843q, d6.f13843q);
                return iH != 0 ? iH : k.h(d6.hashCode(), d7.hashCode());
            default:
                D d8 = (D) obj;
                D d9 = (D) obj2;
                int iH2 = k.h(d8.f13843q, d9.f13843q);
                return iH2 != 0 ? iH2 : k.h(d8.hashCode(), d9.hashCode());
        }
    }
}

package i5;

import java.util.Comparator;
import p5.O;
import p5.i0;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9608a;

    public /* synthetic */ f(int i) {
        this.f9608a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f9608a) {
            case 0:
                return p027e3.a.R(((e) obj).f9602a, ((e) obj2).f9602a);
            case 1:
                i0 i0Var = (i0) obj;
                i0 i0Var2 = (i0) obj2;
                if (i0Var.f11075c != i0Var2.f11075c) {
                    throw new IllegalArgumentException("records with different epoch! " + i0Var.f11075c + " != " + i0Var2.f11075c);
                }
                O o6 = (O) i0Var.c();
                O o7 = (O) i0Var2.c();
                int i = o6.i;
                int i3 = o7.i;
                if (i >= i3) {
                    if (i <= i3) {
                        long j4 = i0Var.f11076d;
                        long j6 = i0Var2.f11076d;
                        if (j4 >= j6) {
                            if (j4 <= j6) {
                                return 0;
                            }
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }
}

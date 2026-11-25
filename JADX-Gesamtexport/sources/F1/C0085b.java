package F1;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: renamed from: F1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0085b extends E4.l implements D4.c {
    public static final C0085b i = new C0085b(1, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0085b f1331j = new C0085b(1, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0085b f1332k = new C0085b(1, 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0085b f1333l = new C0085b(1, 3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C0085b f1334m = new C0085b(1, 4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0085b f1335n = new C0085b(1, 5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0085b f1336o = new C0085b(1, 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1337h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0085b(int i3, int i6) {
        super(i3);
        this.f1337h = i6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f1337h) {
            case 0:
                Context context = (Context) obj;
                E4.k.f("it", context);
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 1:
                Context context2 = (Context) obj;
                E4.k.f("it", context2);
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 2:
                B b6 = (B) obj;
                E4.k.f("destination", b6);
                E e6 = b6.i;
                if (e6 == null || e6.f1260r != b6.f1247m) {
                    return null;
                }
                return e6;
            case 3:
                B b7 = (B) obj;
                E4.k.f("destination", b7);
                E e7 = b7.i;
                if (e7 == null || e7.f1260r != b7.f1247m) {
                    return null;
                }
                return e7;
            case 4:
                B b8 = (B) obj;
                E4.k.f("it", b8);
                return Integer.valueOf(b8.f1247m);
            case 5:
                B b9 = (B) obj;
                E4.k.f("it", b9);
                return b9.i;
            default:
                B b10 = (B) obj;
                E4.k.f("it", b10);
                if (!(b10 instanceof E)) {
                    return null;
                }
                E e8 = (E) b10;
                return e8.k(e8.f1260r, e8, false);
        }
    }
}

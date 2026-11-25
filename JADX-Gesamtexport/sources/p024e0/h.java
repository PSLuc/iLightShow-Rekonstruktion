package p024e0;

import D4.c;
import E4.l;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class h extends l implements c {
    public static final h i = new h(1, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f8650j = new h(1, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h f8651k = new h(1, 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h f8652l = new h(1, 3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h f8653m = new h(1, 4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8654h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i3) {
        super(1);
        this.f8654h = 5;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f8654h) {
            case 0:
                ((i) obj).b(false);
                return x.f10867a;
            case 1:
                int i3 = ((b) obj).f8640a;
                return n.f8666b;
            case 2:
                int i6 = ((b) obj).f8640a;
                return n.f8666b;
            case 3:
                Boolean boolB = d.B((r) obj);
                return Boolean.valueOf(boolB != null ? boolB.booleanValue() : false);
            case 4:
                Boolean boolB2 = d.B((r) obj);
                return Boolean.valueOf(boolB2 != null ? boolB2.booleanValue() : false);
            default:
                Boolean boolB3 = d.B((r) obj);
                return Boolean.valueOf(boolB3 != null ? boolB3.booleanValue() : false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i3, int i6) {
        super(i3);
        this.f8654h = i6;
    }
}

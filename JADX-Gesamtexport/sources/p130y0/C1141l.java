package p130y0;

import D4.c;
import E4.l;
import p024e0.b;
import p024e0.d;
import p024e0.r;
import p084p4.x;

/* JADX INFO: renamed from: y0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1141l extends l implements c {
    public static final C1141l i = new C1141l(1, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C1141l f14406j = new C1141l(1, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C1141l f14407k = new C1141l(1, 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C1141l f14408l = new C1141l(1, 3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14409h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1141l(int i3) {
        super(1);
        this.f14409h = 6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f14409h) {
            case 0:
                return x.f10867a;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                return Boolean.valueOf(H.n(obj));
            case 4:
                Boolean boolB = d.B((r) obj);
                return Boolean.valueOf(boolB != null ? boolB.booleanValue() : true);
            case 5:
                Boolean boolB2 = d.B((r) obj);
                return Boolean.valueOf(boolB2 != null ? boolB2.booleanValue() : true);
            default:
                Boolean boolB3 = d.B((r) obj);
                return Boolean.valueOf(boolB3 != null ? boolB3.booleanValue() : false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1141l(int i3, int i6) {
        super(i3);
        this.f14409h = i6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1141l(b bVar, int i3) {
        super(1);
        this.f14409h = i3;
    }
}

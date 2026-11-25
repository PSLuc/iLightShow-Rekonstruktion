package p112v;

import D4.a;
import E4.l;
import p084p4.x;

/* JADX INFO: renamed from: v.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1014y extends l implements a {
    public static final C1014y i = new C1014y(0, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C1014y f13097j = new C1014y(0, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13098h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1014y(int i3, int i6) {
        super(i3);
        this.f13098h = i6;
    }

    @Override // D4.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f13098h) {
            case 0:
                return x.f10867a;
            default:
                return Boolean.TRUE;
        }
    }
}

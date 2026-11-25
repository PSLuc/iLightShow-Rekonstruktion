package p024e0;

import D4.a;
import E4.l;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class f extends l implements a {
    public static final f i = new f(0, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f f8648j = new f(0, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8649h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i3, int i6) {
        super(i3);
        this.f8649h = i6;
    }

    @Override // D4.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f8649h) {
            case 0:
                return Boolean.FALSE;
            default:
                return x.f10867a;
        }
    }
}

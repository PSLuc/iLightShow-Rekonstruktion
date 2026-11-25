package p058l0;

import D4.a;
import E4.l;
import android.graphics.PathMeasure;
import p035g0.C0707h;
import p084p4.x;

/* JADX INFO: renamed from: l0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0824g extends l implements a {
    public static final C0824g i = new C0824g(0, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0824g f10292j = new C0824g(0, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10293h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0824g(int i3, int i6) {
        super(i3);
        this.f10293h = i6;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f10293h) {
            case 0:
                return new C0707h(new PathMeasure());
            default:
                return x.f10867a;
        }
    }
}

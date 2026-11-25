package p012c;

import D4.a;
import E4.l;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class w extends l implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7183h;
    public final /* synthetic */ D i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(D d6, int i) {
        super(0);
        this.f7183h = i;
        this.i = d6;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f7183h) {
            case 0:
                this.i.c();
                break;
            case 1:
                this.i.b();
                break;
            default:
                this.i.c();
                break;
        }
        return x.f10867a;
    }
}

package N;

import P4.C0319f;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class A implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3550h = 0;
    public final /* synthetic */ C0319f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ D4.c f3551j;

    public A(D4.c cVar, C0319f c0319f) {
        this.i = c0319f;
        this.f3551j = cVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j4) {
        Object objV;
        Object objV2;
        C0319f c0319f = this.i;
        D4.c cVar = this.f3551j;
        switch (this.f3550h) {
            case 0:
                B b6 = B.f3554h;
                try {
                    objV2 = cVar.invoke(Long.valueOf(j4));
                } catch (Throwable th) {
                    objV2 = S1.V.v(th);
                }
                c0319f.g(objV2);
                break;
            default:
                try {
                    objV = cVar.invoke(Long.valueOf(j4));
                } catch (Throwable th2) {
                    objV = S1.V.v(th2);
                }
                c0319f.g(objV);
                break;
        }
    }

    public A(C0319f c0319f, C0221j0 c0221j0, D4.c cVar) {
        this.i = c0319f;
        this.f3551j = cVar;
    }
}

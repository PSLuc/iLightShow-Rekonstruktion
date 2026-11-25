package S3;

import E4.k;
import java.net.DatagramSocket;
import java.util.concurrent.atomic.AtomicReference;
import y5.d;
import y5.e;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AtomicReference implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5013h;

    public /* synthetic */ c() {
        this.f5013h = 2;
    }

    @Override // S3.b
    public final void a() {
        Object andSet;
        d dVar;
        switch (this.f5013h) {
            case 0:
                if (get() != null && (andSet = getAndSet(null)) != null) {
                    ((Runnable) andSet).run();
                    break;
                }
                break;
            case 1:
                if (get() != null && (dVar = (d) getAndSet(null)) != null) {
                    try {
                        e eVar = dVar.f14598a;
                        k.f("this$0", eVar);
                        DatagramSocket datagramSocket = dVar.f14599b;
                        if (eVar.f14603d) {
                            datagramSocket.close();
                        }
                    } catch (Exception e6) {
                        p027e3.a.w0(e6);
                        G4.a.A(e6);
                        return;
                    }
                    break;
                }
                break;
            default:
                V3.a.b(this);
                break;
        }
    }

    public boolean b() {
        return ((b) get()) == V3.a.f5508h;
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.f5013h) {
            case 0:
                StringBuilder sb = new StringBuilder("RunnableDisposable(disposed=");
                sb.append(get() == null);
                sb.append(", ");
                sb.append(get());
                sb.append(")");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, Object obj) {
        super(obj);
        this.f5013h = i;
    }
}

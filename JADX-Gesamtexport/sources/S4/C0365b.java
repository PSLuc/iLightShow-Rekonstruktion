package S4;

import P4.AbstractC0336x;
import P4.InterfaceC0335w;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: S4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0365b extends T4.f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5065m = AtomicIntegerFieldUpdater.newUpdater(C0365b.class, "consumed");
    private volatile int consumed;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final R4.b f5066k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f5067l;

    public /* synthetic */ C0365b(R4.b bVar, boolean z5) {
        this(bVar, z5, p111u4.j.f12751h, -3, 1);
    }

    @Override // S4.InterfaceC0368e
    public final Object a(InterfaceC0369f interfaceC0369f, p111u4.d dVar) throws Throwable {
        p084p4.x xVar = p084p4.x.f10867a;
        if (this.i == -3) {
            boolean z5 = this.f5067l;
            if (z5 && f5065m.getAndSet(this, 1) != 0) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
            }
            Object objG = F.g(interfaceC0369f, this.f5066k, z5, dVar);
            if (objG == v4.a.f13292h) {
                return objG;
            }
        } else {
            Object objD = AbstractC0336x.d(new T4.d(interfaceC0369f, this, null), dVar);
            v4.a aVar = v4.a.f13292h;
            if (objD != aVar) {
                objD = xVar;
            }
            if (objD == aVar) {
                return objD;
            }
        }
        return xVar;
    }

    @Override // T4.f
    public final String c() {
        return "channel=" + this.f5066k;
    }

    @Override // T4.f
    public final Object d(R4.m mVar, T4.e eVar) throws Throwable {
        Object objG = F.g(new T4.v(mVar), this.f5066k, this.f5067l, eVar);
        return objG == v4.a.f13292h ? objG : p084p4.x.f10867a;
    }

    @Override // T4.f
    public final T4.f e(p111u4.i iVar, int i, int i3) {
        return new C0365b(this.f5066k, this.f5067l, iVar, i, i3);
    }

    @Override // T4.f
    public final InterfaceC0368e f() {
        return new C0365b(this.f5066k, this.f5067l);
    }

    @Override // T4.f
    public final R4.n g(InterfaceC0335w interfaceC0335w) {
        if (!this.f5067l || f5065m.getAndSet(this, 1) == 0) {
            return this.i == -3 ? this.f5066k : super.g(interfaceC0335w);
        }
        throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
    }

    public C0365b(R4.b bVar, boolean z5, p111u4.i iVar, int i, int i3) {
        super(iVar, i, i3);
        this.f5066k = bVar;
        this.f5067l = z5;
        this.consumed = 0;
    }
}

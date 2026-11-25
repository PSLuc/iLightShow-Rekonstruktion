package P4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class V extends b0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f4626j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(T t6) {
        super(true);
        boolean z5 = true;
        O(t6);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b0.i;
        InterfaceC0322i interfaceC0322i = (InterfaceC0322i) atomicReferenceFieldUpdater.get(this);
        C0323j c0323j = interfaceC0322i instanceof C0323j ? (C0323j) interfaceC0322i : null;
        if (c0323j == null) {
            z5 = false;
            break;
        }
        b0 b0VarP = c0323j.p();
        while (!b0VarP.E()) {
            InterfaceC0322i interfaceC0322i2 = (InterfaceC0322i) atomicReferenceFieldUpdater.get(b0VarP);
            C0323j c0323j2 = interfaceC0322i2 instanceof C0323j ? (C0323j) interfaceC0322i2 : null;
            if (c0323j2 == null) {
                z5 = false;
                break;
            }
            b0VarP = c0323j2.p();
        }
        this.f4626j = z5;
    }

    @Override // P4.b0
    public final boolean E() {
        return this.f4626j;
    }

    @Override // P4.b0
    public final boolean F() {
        return true;
    }
}

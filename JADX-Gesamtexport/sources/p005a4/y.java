package p005a4;

import java.util.concurrent.atomic.AtomicReference;
import u5.a;
import u5.b;

/* JADX INFO: loaded from: classes.dex */
public final class y implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f6337h;
    public final int i;

    public y(AtomicReference atomicReference, int i) {
        this.f6337h = atomicReference;
        this.i = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u5.a
    public final void a(b bVar) {
        A a6;
        z zVar = new z(bVar);
        bVar.h(zVar);
        loop0: while (true) {
            A a7 = (A) this.f6337h.get();
            if (a7 == null || a7.f6167j.get() == A.f6165q) {
                A a8 = new A(this.f6337h, this.i);
                AtomicReference atomicReference = this.f6337h;
                while (true) {
                    if (atomicReference.compareAndSet(a7, a8)) {
                        a6 = a8;
                    } else if (atomicReference.get() != a7) {
                    }
                }
            } else {
                a6 = a7;
            }
            while (true) {
                AtomicReference atomicReference2 = a6.f6167j;
                z[] zVarArr = (z[]) atomicReference2.get();
                if (zVarArr == A.f6165q) {
                    break;
                }
                int length = zVarArr.length;
                z[] zVarArr2 = new z[length + 1];
                System.arraycopy(zVarArr, 0, zVarArr2, 0, length);
                zVarArr2[length] = zVar;
                do {
                    if (atomicReference2.compareAndSet(zVarArr, zVarArr2)) {
                        break loop0;
                    }
                } while (atomicReference2.get() == zVarArr);
            }
        }
        if (zVar.get() == Long.MIN_VALUE) {
            a6.f(zVar);
        } else {
            zVar.i = a6;
        }
        a6.e();
    }
}

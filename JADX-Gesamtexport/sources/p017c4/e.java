package p017c4;

import R3.g;
import S3.b;
import V3.a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class e implements g, b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d[] f7362l = new d[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d[] f7363m = new d[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f7364h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReference f7366k = new AtomicReference();
    public final AtomicReference i = new AtomicReference(f7362l);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f7365j = new AtomicBoolean();

    public e(AtomicReference atomicReference) {
        this.f7364h = atomicReference;
    }

    @Override // S3.b
    public final void a() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.i;
        d[] dVarArr = f7363m;
        if (((d[]) atomicReference2.getAndSet(dVarArr)) != dVarArr) {
            do {
                atomicReference = this.f7364h;
                if (atomicReference.compareAndSet(this, null)) {
                    break;
                }
            } while (atomicReference.get() == this);
            a.b(this.f7366k);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [R3.g, java.lang.Object] */
    @Override // R3.g
    public final void b() {
        AtomicReference atomicReference;
        do {
            atomicReference = this.f7364h;
            if (atomicReference.compareAndSet(this, null)) {
                break;
            }
        } while (atomicReference.get() == this);
        for (d dVar : (d[]) this.i.getAndSet(f7363m)) {
            dVar.f7361h.b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [R3.g, java.lang.Object] */
    @Override // R3.g
    public final void c(Object obj) {
        for (d dVar : (d[]) this.i.get()) {
            dVar.f7361h.c(obj);
        }
    }

    @Override // R3.g
    public final void d(b bVar) {
        a.d(this.f7366k, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(d dVar) {
        d[] dVarArr;
        while (true) {
            AtomicReference atomicReference = this.i;
            d[] dVarArr2 = (d[]) atomicReference.get();
            int length = dVarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (dVarArr2[i].equals(dVar)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                dVarArr = f7362l;
            } else {
                d[] dVarArr3 = new d[length - 1];
                System.arraycopy(dVarArr2, 0, dVarArr3, 0, i);
                System.arraycopy(dVarArr2, i + 1, dVarArr3, i, (length - i) - 1);
                dVarArr = dVarArr3;
            }
            while (!atomicReference.compareAndSet(dVarArr2, dVarArr)) {
                if (atomicReference.get() != dVarArr2) {
                }
            }
            return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [R3.g, java.lang.Object] */
    @Override // R3.g
    public final void onError(Throwable th) {
        AtomicReference atomicReference;
        do {
            atomicReference = this.f7364h;
            if (atomicReference.compareAndSet(this, null)) {
                break;
            }
        } while (atomicReference.get() == this);
        d[] dVarArr = (d[]) this.i.getAndSet(f7363m);
        if (dVarArr.length == 0) {
            G4.a.A(th);
            return;
        }
        for (d dVar : dVarArr) {
            dVar.f7361h.onError(th);
        }
    }
}

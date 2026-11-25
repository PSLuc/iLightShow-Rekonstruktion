package p067m4;

import G4.a;
import R3.g;
import com.fasterxml.jackson.databind.deser.std.d0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d0 implements g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a[] f10422m = new a[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a[] f10423n = new a[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReference f10424k = new AtomicReference(f10423n);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Throwable f10425l;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.deser.std.d0
    public final void E(g gVar) {
        a aVar = new a(gVar, this);
        gVar.d(aVar);
        while (true) {
            AtomicReference atomicReference = this.f10424k;
            a[] aVarArr = (a[]) atomicReference.get();
            if (aVarArr == f10422m) {
                Throwable th = this.f10425l;
                if (th != null) {
                    gVar.onError(th);
                    return;
                } else {
                    gVar.b();
                    return;
                }
            }
            int length = aVarArr.length;
            a[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            do {
                if (atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                    if (aVar.get()) {
                        J(aVar);
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == aVarArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J(a aVar) {
        a[] aVarArr;
        while (true) {
            AtomicReference atomicReference = this.f10424k;
            a[] aVarArr2 = (a[]) atomicReference.get();
            if (aVarArr2 == f10422m || aVarArr2 == (aVarArr = f10423n)) {
                return;
            }
            int length = aVarArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (aVarArr2[i] == aVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                aVarArr = new a[length - 1];
                System.arraycopy(aVarArr2, 0, aVarArr, 0, i);
                System.arraycopy(aVarArr2, i + 1, aVarArr, i, (length - i) - 1);
            }
            while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                if (atomicReference.get() != aVarArr2) {
                }
            }
            return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [R3.g, java.lang.Object] */
    @Override // R3.g
    public final void b() {
        AtomicReference atomicReference = this.f10424k;
        Object obj = atomicReference.get();
        Object obj2 = f10422m;
        if (obj == obj2) {
            return;
        }
        a[] aVarArr = (a[]) atomicReference.getAndSet(obj2);
        for (a aVar : aVarArr) {
            if (!aVar.get()) {
                aVar.f10421h.b();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [R3.g, java.lang.Object] */
    @Override // R3.g
    public final void c(Object obj) {
        W3.b.a("onNext called with null. Null values are generally not allowed in 2.x operators and sources.", obj);
        for (a aVar : (a[]) this.f10424k.get()) {
            if (!aVar.get()) {
                aVar.f10421h.c(obj);
            }
        }
    }

    @Override // R3.g
    public final void d(S3.b bVar) {
        if (this.f10424k.get() == f10422m) {
            bVar.a();
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [R3.g, java.lang.Object] */
    @Override // R3.g
    public final void onError(Throwable th) {
        W3.b.a("onError called with null. Null values are generally not allowed in 2.x operators and sources.", th);
        AtomicReference atomicReference = this.f10424k;
        Object obj = atomicReference.get();
        Object obj2 = f10422m;
        if (obj == obj2) {
            a.A(th);
            return;
        }
        this.f10425l = th;
        for (a aVar : (a[]) atomicReference.getAndSet(obj2)) {
            if (aVar.get()) {
                a.A(th);
            } else {
                aVar.f10421h.onError(th);
            }
        }
    }
}

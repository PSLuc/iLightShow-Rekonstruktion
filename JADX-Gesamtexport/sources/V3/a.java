package V3;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a implements S3.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f5508h;
    public static final /* synthetic */ a[] i;

    static {
        a aVar = new a("DISPOSED", 0);
        f5508h = aVar;
        i = new a[]{aVar};
    }

    public static boolean b(AtomicReference atomicReference) {
        S3.b bVar;
        S3.b bVar2 = (S3.b) atomicReference.get();
        a aVar = f5508h;
        if (bVar2 == aVar || (bVar = (S3.b) atomicReference.getAndSet(aVar)) == aVar) {
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar.a();
        return true;
    }

    public static boolean c(AtomicReference atomicReference, S3.b bVar) {
        while (true) {
            S3.b bVar2 = (S3.b) atomicReference.get();
            if (bVar2 != f5508h) {
                while (!atomicReference.compareAndSet(bVar2, bVar)) {
                    if (atomicReference.get() != bVar2) {
                    }
                }
                return true;
            }
            if (bVar == null) {
                return false;
            }
            bVar.a();
            return false;
        }
    }

    public static boolean d(AtomicReference atomicReference, S3.b bVar) {
        W3.b.a("d is null", bVar);
        while (!atomicReference.compareAndSet(null, bVar)) {
            if (atomicReference.get() != null) {
                bVar.a();
                if (atomicReference.get() == f5508h) {
                    return false;
                }
                G4.a.A(new ProtocolViolationException("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean e(S3.b bVar, S3.b bVar2) {
        if (bVar == null) {
            return true;
        }
        bVar2.a();
        G4.a.A(new ProtocolViolationException("Disposable already set!"));
        return false;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) i.clone();
    }

    @Override // S3.b
    public final void a() {
    }
}

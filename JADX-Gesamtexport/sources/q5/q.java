package q5;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f11317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GeneralSecurityException f11318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadLocal f11319c;

    public q(p pVar) {
        ThreadLocal threadLocal;
        GeneralSecurityException e6 = null;
        try {
            Object objB = pVar.b();
            if (objB != null) {
                try {
                    threadLocal = new ThreadLocal();
                    try {
                        threadLocal.set(objB);
                    } catch (GeneralSecurityException e7) {
                        e6 = e7;
                    }
                } catch (GeneralSecurityException e8) {
                    e6 = e8;
                    threadLocal = null;
                }
            } else {
                GeneralSecurityException generalSecurityException = new GeneralSecurityException(pVar.getClass().getSimpleName().concat(" not supported!"));
                pVar = null;
                threadLocal = null;
                e6 = generalSecurityException;
            }
        } catch (GeneralSecurityException e9) {
            threadLocal = null;
            e6 = e9;
            pVar = null;
        }
        this.f11319c = threadLocal;
        this.f11317a = pVar;
        this.f11318b = e6;
    }

    public final Object a() {
        p pVar = this.f11317a;
        if (pVar == null) {
            return null;
        }
        ThreadLocal threadLocal = this.f11319c;
        Object objB = threadLocal.get();
        if (objB != null) {
            return objB;
        }
        try {
            objB = pVar.b();
            threadLocal.set(objB);
            return objB;
        } catch (GeneralSecurityException unused) {
            return objB;
        }
    }

    public final Object b() throws GeneralSecurityException {
        GeneralSecurityException generalSecurityException = this.f11318b;
        if (generalSecurityException != null) {
            throw generalSecurityException;
        }
        ThreadLocal threadLocal = this.f11319c;
        Object obj = threadLocal.get();
        if (obj != null) {
            return obj;
        }
        Object objB = this.f11317a.b();
        threadLocal.set(objB);
        return objB;
    }
}

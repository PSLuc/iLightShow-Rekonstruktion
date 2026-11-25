package com.google.android.gms.internal.play_billing;

import B.C0031p0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class U implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final X f7911h;
    public final O1.u i;

    public U(X x6, O1.u uVar) {
        this.f7911h = x6;
        this.i = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable thA;
        X x6 = this.f7911h;
        boolean z5 = x6 instanceof AbstractC0552b0;
        O1.u uVar = this.i;
        if (z5 && (thA = ((AbstractC0552b0) x6).a()) != null) {
            uVar.w(thA);
            return;
        }
        try {
            if (!x6.isDone()) {
                throw new IllegalStateException(p006b.a.K("Future was expected to be done: %s", x6));
            }
            boolean z6 = false;
            Future future = x6;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z6 = true;
                    future = future;
                } catch (Throwable th) {
                    if (z6) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z6) {
                Thread.currentThread().interrupt();
            }
            Integer num = (Integer) obj;
            if (num.intValue() <= 0) {
                ((Runnable) uVar.f4535c).run();
                return;
            }
            int iIntValue = num.intValue();
            O1.x xVar = (O1.x) uVar.f4536d;
            xVar.getClass();
            O1.g gVarA = O1.A.a(iIntValue, "Billing override value was set by a license tester.");
            xVar.G(93, uVar.f4533a, gVarA);
            ((O1.s) uVar.f4534b).a(gVarA);
        } catch (ExecutionException e6) {
            uVar.w(e6.getCause());
        } catch (Throwable th2) {
            uVar.w(th2);
        }
    }

    public final String toString() {
        C0031p0 c0031p0 = new C0031p0(U.class.getSimpleName());
        C0581m c0581m = new C0581m();
        ((C0581m) c0031p0.f395k).f7969b = c0581m;
        c0031p0.f395k = c0581m;
        c0581m.f7968a = this.i;
        return c0031p0.toString();
    }
}

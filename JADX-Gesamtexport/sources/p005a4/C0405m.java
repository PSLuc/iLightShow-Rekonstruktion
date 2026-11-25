package p005a4;

import R3.a;
import R3.c;
import U3.b;
import java.util.concurrent.Callable;
import p043h4.d;
import p043h4.e;

/* JADX INFO: renamed from: a4.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0405m extends AbstractC0393a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f6282j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f6283k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f6284l;

    public C0405m(a aVar, b bVar, int i, int i3) {
        super(aVar);
        this.f6282j = bVar;
        this.f6283k = i;
        this.f6284l = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // R3.a
    public final void f(c cVar) {
        a aVar = this.i;
        boolean z5 = aVar instanceof Callable;
        b bVar = this.f6282j;
        if (!z5) {
            aVar.e(new C0404l(cVar, bVar, this.f6283k, this.f6284l));
            return;
        }
        try {
            Object objCall = ((Callable) aVar).call();
            d dVar = d.f9305h;
            if (objCall == null) {
                cVar.h(dVar);
                cVar.b();
                return;
            }
            try {
                Object objApply = bVar.apply(objCall);
                W3.b.a("The mapper returned a null Publisher", objApply);
                u5.a aVar2 = (u5.a) objApply;
                if (!(aVar2 instanceof Callable)) {
                    aVar2.a(cVar);
                    return;
                }
                try {
                    Object objCall2 = ((Callable) aVar2).call();
                    if (objCall2 != null) {
                        cVar.h(new e(cVar, objCall2));
                    } else {
                        cVar.h(dVar);
                        cVar.b();
                    }
                } catch (Throwable th) {
                    p027e3.a.w0(th);
                    d.a(th, cVar);
                }
            } catch (Throwable th2) {
                p027e3.a.w0(th2);
                d.a(th2, cVar);
            }
        } catch (Throwable th3) {
            p027e3.a.w0(th3);
            d.a(th3, cVar);
        }
    }
}

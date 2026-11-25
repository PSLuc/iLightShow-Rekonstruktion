package p072n3;

import F.L;
import K.y;
import c5.C0495p;
import java.util.ArrayDeque;
import p060l3.b;
import p060l3.c;
import p066m3.d;

/* JADX INFO: loaded from: classes.dex */
public final class g extends e {
    public final /* synthetic */ b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f10545j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f10546k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, b bVar, b bVar2, d dVar) {
        super(bVar);
        this.i = bVar2;
        this.f10545j = dVar;
        this.f10546k = iVar;
    }

    @Override // p072n3.e
    public final void a() {
        synchronized (this.f10546k.f10554f) {
            try {
                i iVar = this.f10546k;
                b bVar = this.i;
                iVar.f10553e.add(bVar);
                y yVar = bVar.f10375a;
                C0495p c0495p = new C0495p(iVar, 14, bVar);
                yVar.getClass();
                p060l3.d dVar = new p060l3.d(c.f10376a, c0495p);
                L l6 = (L) yVar.f2033d;
                synchronized (l6.f1106c) {
                    try {
                        if (((ArrayDeque) l6.f1107d) == null) {
                            l6.f1107d = new ArrayDeque();
                        }
                        ((ArrayDeque) l6.f1107d).add(dVar);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                synchronized (yVar.f2032c) {
                    try {
                        if (yVar.f2031b) {
                            ((L) yVar.f2033d).m(yVar);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (this.f10546k.f10558k.getAndIncrement() > 0) {
                    this.f10546k.f10550b.c("Already connected to the service.", new Object[0]);
                }
                i.b(this.f10546k, this.f10545j);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}

package p058l0;

import B.C0031p0;
import D4.c;
import E4.l;
import p035g0.C0715p;
import p044i0.d;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class D extends l implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10196h;
    public final /* synthetic */ E i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(E e6, int i) {
        super(1);
        this.f10196h = i;
        this.i = e6;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [D4.a, E4.l] */
    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f10196h) {
            case 0:
                E e6 = this.i;
                e6.f10199d = true;
                e6.f10201f.invoke();
                return x.f10867a;
            default:
                d dVar = (d) obj;
                E e7 = this.i;
                C0820c c0820c = e7.f10197b;
                float f6 = e7.f10205k;
                float f7 = e7.f10206l;
                C0031p0 c0031p0B = dVar.B();
                long jL = c0031p0B.l();
                c0031p0B.f().l();
                try {
                    ((C0715p) c0031p0B.i).y(f6, f7, 0L);
                    c0820c.a(dVar);
                    return x.f10867a;
                } finally {
                    c0031p0B.f().i();
                    c0031p0B.x(jL);
                }
        }
    }
}

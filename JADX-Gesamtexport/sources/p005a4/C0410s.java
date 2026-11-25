package p005a4;

import J2.b;
import R3.c;
import Z2.f;
import java.util.concurrent.ConcurrentHashMap;
import p027e3.a;

/* JADX INFO: renamed from: a4.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0410s extends AbstractC0393a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f6317j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f f6318k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f6319l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0410s(G g6, b bVar, int i) {
        super(g6);
        f fVar = W3.b.f5599a;
        this.f6317j = bVar;
        this.f6318k = fVar;
        this.f6319l = i;
    }

    @Override // R3.a
    public final void f(c cVar) {
        try {
            this.i.e(new C0408p(cVar, this.f6317j, this.f6318k, this.f6319l, new ConcurrentHashMap(), null));
        } catch (Exception e6) {
            a.w0(e6);
            cVar.h(p047i4.b.f9588h);
            cVar.onError(e6);
        }
    }
}

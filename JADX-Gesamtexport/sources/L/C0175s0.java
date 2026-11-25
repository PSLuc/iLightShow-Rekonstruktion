package L;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: L.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0175s0 extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2907h = 1;
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2908j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0175s0(int i, Collection collection) {
        super(1);
        this.i = i;
        this.f2908j = collection;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f2907h) {
            case 0:
                p113v0.M.d((p113v0.M) obj, (p113v0.N) this.f2908j, 0, -this.i);
                return p084p4.x.f10867a;
            default:
                return Boolean.valueOf(((List) obj).addAll(this.i, (Collection) this.f2908j));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0175s0(p113v0.N n6, int i) {
        super(1);
        this.f2908j = n6;
        this.i = i;
    }
}

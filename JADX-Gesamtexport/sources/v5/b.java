package v5;

import E4.w;
import java.io.Serializable;
import w5.C1064w;

/* JADX INFO: loaded from: classes.dex */
public final class b implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13301h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Serializable f13302j;

    public /* synthetic */ b(Object obj, Serializable serializable, int i) {
        this.f13301h = i;
        this.i = obj;
        this.f13302j = serializable;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f13301h) {
            case 0:
                y5.b bVar = (y5.b) obj;
                E4.k.f("it", bVar);
                C1064w c1064w = bVar.f14594a.f13321a;
                long j4 = c1064w.f13667d;
                k kVar = (k) this.i;
                return Boolean.valueOf(j4 == kVar.f13331k && c1064w.f13666c == kVar.f13332l.f13370h && c1064w.f13670g == ((Byte) this.f13302j).byteValue());
            default:
                E4.k.f("it", (y5.b) obj);
                if (!((E4.s) this.i).f1070h) {
                    return p011b4.b.f7107h;
                }
                Object obj2 = ((w) this.f13302j).f1074h;
                E4.k.c(obj2);
                W3.b.a("item is null", obj2);
                return new p011b4.c(obj2);
        }
    }
}

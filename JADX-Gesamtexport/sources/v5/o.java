package v5;

import F.C0074p;
import com.spotify.sdk.android.auth.AccountsQueryParameters;
import java.util.concurrent.TimeUnit;
import p005a4.D;
import p005a4.G;
import p005a4.V;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13361h;

    public /* synthetic */ o(int i) {
        this.f13361h = i;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        int i = 17;
        x xVar = x.f10867a;
        int i3 = 2;
        switch (this.f13361h) {
            case 0:
                y5.b bVar = (y5.b) obj;
                E4.k.f("it", bVar);
                return Long.valueOf(bVar.f14594a.f13321a.f13667d);
            case 1:
                R3.a aVar = (R3.a) obj;
                E4.k.f(AccountsQueryParameters.ERROR, aVar);
                J2.b bVar2 = new J2.b(i, new o(i3));
                int i6 = R3.a.f4801h;
                return aVar.d(bVar2, i6, i6);
            case 2:
                E4.k.f("it", (Throwable) obj);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                int i7 = R3.a.f4801h;
                R3.l lVar = p061l4.f.f10386b;
                W3.b.a("unit is null", timeUnit);
                W3.b.a("scheduler is null", lVar);
                return new V(Math.max(0L, 2L), lVar);
            case 3:
                y5.b bVar3 = (y5.b) obj;
                E4.k.f("it", bVar3);
                return Boolean.valueOf(bVar3.f14594a.f13321a.f13667d != 0);
            case 4:
                return xVar;
            case 5:
                R3.a aVar2 = (R3.a) obj;
                E4.k.f("errors", aVar2);
                int i8 = R3.a.f4801h;
                if (((long) 1) + ((long) 2) > 2147483647L) {
                    throw new IllegalArgumentException("Integer overflow");
                }
                D d6 = new D();
                W2.g gVar = new W2.g(new C0074p(17));
                u5.a[] aVarArr = {aVar2, d6};
                int i9 = R3.a.f4801h;
                W3.b.b(i9, "bufferSize");
                return new G(aVarArr, gVar, i9);
            default:
                return xVar;
        }
    }
}

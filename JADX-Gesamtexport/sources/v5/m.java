package v5;

import E4.w;
import w5.InterfaceC1067z;
import w5.J;
import w5.b0;

/* JADX INFO: loaded from: classes.dex */
public final class m implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ E4.s f13348h;
    public final /* synthetic */ E4.s i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f13349j;

    public m(E4.s sVar, E4.s sVar2, w wVar) {
        this.f13348h = sVar;
        this.i = sVar2;
        this.f13349j = wVar;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        y5.b bVar = (y5.b) obj;
        E4.k.f("it", bVar);
        E4.s sVar = this.f13348h;
        boolean z5 = sVar.f1070h;
        h hVar = bVar.f14594a;
        if (z5) {
            short s6 = hVar.f13321a.i;
            J[] jArr = J.f13501h;
            if (s6 == 45) {
                sVar.f1070h = false;
            }
        }
        E4.s sVar2 = this.i;
        if (sVar2.f1070h) {
            InterfaceC1067z interfaceC1067z = hVar.f13322b;
            if (interfaceC1067z instanceof b0) {
                this.f13349j.f1074h = interfaceC1067z;
                sVar2.f1070h = false;
            }
        }
        return Boolean.valueOf(sVar2.f1070h || sVar.f1070h);
    }
}

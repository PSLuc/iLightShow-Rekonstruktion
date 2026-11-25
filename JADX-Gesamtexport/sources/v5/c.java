package v5;

import com.google.android.gms.internal.play_billing.G;
import w5.InterfaceC1067z;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f13304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1067z f13305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D4.a f13306d;

    public /* synthetic */ c(k kVar, InterfaceC1067z interfaceC1067z, D4.a aVar, int i) {
        this.f13303a = i;
        this.f13304b = kVar;
        this.f13305c = interfaceC1067z;
        this.f13306d = aVar;
    }

    public final void a(p022d4.a aVar) {
        switch (this.f13303a) {
            case 0:
                k kVar = this.f13304b;
                kVar.getClass();
                byte b6 = (byte) 1;
                q qVar = kVar.f13332l;
                if (!qVar.a(x5.a.b(this.f13305c, qVar.f13370h, kVar.f13331k, kVar.f13337q, b6))) {
                    aVar.b(new G());
                } else {
                    D4.a aVar2 = this.f13306d;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                    aVar.c(Byte.valueOf(b6));
                }
                break;
            default:
                k kVar2 = this.f13304b;
                q qVar2 = kVar2.f13332l;
                if (!qVar2.a(x5.a.b(this.f13305c, qVar2.f13370h, kVar2.f13331k, kVar2.f13337q, (byte) 0))) {
                    aVar.b(new G());
                } else {
                    D4.a aVar3 = this.f13306d;
                    if (aVar3 != null) {
                        aVar3.invoke();
                    }
                    aVar.c(Boolean.TRUE);
                }
                break;
        }
    }
}

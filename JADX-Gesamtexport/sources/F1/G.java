package F1;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class G extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1265h;
    public final /* synthetic */ E4.w i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(E4.w wVar, int i) {
        super(1);
        this.f1265h = 1;
        this.i = wVar;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f1265h) {
            case 0:
                String str = (String) obj;
                E4.k.f("key", str);
                Object obj2 = this.i.f1074h;
                boolean z5 = true;
                if (obj2 != null && ((Bundle) obj2).containsKey(str)) {
                    z5 = false;
                }
                return Boolean.valueOf(z5);
            case 1:
                Boolean boolB = p024e0.d.B((p024e0.r) obj);
                this.i.f1074h = boolB;
                return Boolean.valueOf(boolB != null ? boolB.booleanValue() : false);
            default:
                p091r0.k kVar = (p091r0.k) obj;
                E4.w wVar = this.i;
                Object obj3 = wVar.f1074h;
                if (obj3 == null && kVar.f11501v) {
                    wVar.f1074h = kVar;
                } else if (obj3 != null) {
                    kVar.getClass();
                }
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(E4.w wVar, int i, byte b6) {
        super(1);
        this.f1265h = i;
        this.i = wVar;
    }
}

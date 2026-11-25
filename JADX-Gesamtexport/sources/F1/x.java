package F1;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class x extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1385h;
    public final /* synthetic */ Bundle i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i, Bundle bundle) {
        super(1);
        this.f1385h = i;
        this.i = bundle;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f1385h) {
            case 0:
                String str = (String) obj;
                E4.k.f("argName", str);
                return Boolean.valueOf(!this.i.containsKey(str));
            default:
                String str2 = (String) obj;
                E4.k.f("key", str2);
                return Boolean.valueOf(!this.i.containsKey(str2));
        }
    }
}

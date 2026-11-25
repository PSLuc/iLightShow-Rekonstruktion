package V0;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5438b;

    public /* synthetic */ m(int i, Object obj) {
        this.f5437a = i;
        this.f5438b = obj;
    }

    public final void onBackInvoked() {
        int i = this.f5437a;
        Object obj = this.f5438b;
        switch (i) {
            case 0:
                D4.a aVar = (D4.a) obj;
                if (aVar != null) {
                    aVar.invoke();
                }
                break;
            case 1:
                D4.a aVar2 = (D4.a) obj;
                E4.k.f("$onBackInvoked", aVar2);
                aVar2.invoke();
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}

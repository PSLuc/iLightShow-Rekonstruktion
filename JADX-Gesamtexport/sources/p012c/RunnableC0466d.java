package p012c;

import E4.k;

/* JADX INFO: renamed from: c.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0466d implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7137h;
    public final /* synthetic */ n i;

    public /* synthetic */ RunnableC0466d(n nVar, int i) {
        this.f7137h = i;
        this.i = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7137h) {
            case 0:
                n nVar = this.i;
                k.f("this$0", nVar);
                nVar.invalidateOptionsMenu();
                return;
            default:
                n nVar2 = this.i;
                k.f("this$0", nVar2);
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e6) {
                    if (!k.a(e6.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e6;
                    }
                    return;
                } catch (NullPointerException e7) {
                    if (!k.a(e7.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e7;
                    }
                    return;
                }
        }
    }
}

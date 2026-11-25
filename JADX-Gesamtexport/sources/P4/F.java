package P4;

/* JADX INFO: loaded from: classes.dex */
public final class F implements g0, D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4607h;
    public final Object i;

    public /* synthetic */ F(int i, Object obj) {
        this.f4607h = i;
        this.i = obj;
    }

    public final void a(Throwable th) {
        switch (this.f4607h) {
            case 0:
                ((E) this.i).a();
                break;
            default:
                ((D4.c) this.i).invoke(th);
                break;
        }
    }

    @Override // D4.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f4607h) {
            case 0:
                a((Throwable) obj);
                break;
            default:
                a((Throwable) obj);
                break;
        }
        return p084p4.x.f10867a;
    }

    public final String toString() {
        switch (this.f4607h) {
            case 0:
                return "DisposeOnCancel[" + ((E) this.i) + ']';
            default:
                return "InvokeOnCancel[" + ((D4.c) this.i).getClass().getSimpleName() + '@' + AbstractC0336x.h(this) + ']';
        }
    }
}

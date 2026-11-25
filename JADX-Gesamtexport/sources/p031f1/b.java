package p031f1;

import G0.p;
import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Callable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8853h;
    public final /* synthetic */ String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f8854j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f8855k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8856l;

    public /* synthetic */ b(String str, Context context, p pVar, int i, int i3) {
        this.f8853h = i3;
        this.i = str;
        this.f8854j = context;
        this.f8855k = pVar;
        this.f8856l = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f8853h) {
            case 0:
                return d.a(this.i, this.f8854j, this.f8855k, this.f8856l);
            default:
                try {
                    return d.a(this.i, this.f8854j, this.f8855k, this.f8856l);
                } catch (Throwable unused) {
                    return new c(-3);
                }
        }
    }
}

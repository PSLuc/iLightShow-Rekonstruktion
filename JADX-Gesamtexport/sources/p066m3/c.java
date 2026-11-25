package p066m3;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import p060l3.b;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ResultReceiver {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f10411h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Handler handler, b bVar) {
        super(handler);
        this.f10411h = bVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.f10411h.b(null);
    }
}

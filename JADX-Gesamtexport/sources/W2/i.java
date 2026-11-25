package W2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p038g3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f5586b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d dVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.f5586b = dVar;
        this.f5585a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        int i = e.f5580a;
        d dVar = this.f5586b;
        Context context = this.f5585a;
        int iB = dVar.b(context, i);
        AtomicBoolean atomicBoolean = f.f5581a;
        if (iB == 1 || iB == 2 || iB == 3 || iB == 9) {
            Intent intentA = dVar.a(iB, context, "n");
            dVar.f(context, iB, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}

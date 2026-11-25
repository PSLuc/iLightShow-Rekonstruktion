package O1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.internal.play_billing.AbstractBinderC0569h;
import com.google.android.gms.internal.play_billing.AbstractC0602x;
import com.google.android.gms.internal.play_billing.C0566g;
import com.google.android.gms.internal.play_billing.C0568g1;
import com.google.android.gms.internal.play_billing.InterfaceC0572i;
import com.google.android.gms.internal.play_billing.k1;
import com.google.android.gms.internal.play_billing.n1;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class w implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4538a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4539b;

    public /* synthetic */ w(p072n3.i iVar) {
        this.f4539b = iVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0572i c0566g;
        switch (this.f4538a) {
            case 0:
                AbstractC0602x.g("BillingClientTesting", "Billing Override Service connected.");
                x xVar = (x) this.f4539b;
                int i = AbstractBinderC0569h.f7943b;
                if (iBinder == null) {
                    c0566g = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    c0566g = iInterfaceQueryLocalInterface instanceof InterfaceC0572i ? (InterfaceC0572i) iInterfaceQueryLocalInterface : new C0566g(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                }
                xVar.G = c0566g;
                xVar.f4541F = 2;
                int i3 = y.f4542a;
                C0568g1 c0568g1C = y.c(26, k1.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(c0568g1C, "ApiSuccess should not be null");
                D.x xVar2 = xVar.f4470h;
                xVar2.getClass();
                try {
                    xVar2.w(c0568g1C, (n1) xVar2.i);
                } catch (Throwable unused) {
                    AbstractC0602x.h("BillingLogger");
                    return;
                }
                break;
            default:
                p072n3.i iVar = (p072n3.i) this.f4539b;
                iVar.f10550b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                iVar.a().post(new p066m3.d(this, iBinder));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f4538a) {
            case 0:
                int i = AbstractC0602x.f8015a;
                Log.isLoggable("BillingClientTesting", 5);
                x xVar = (x) this.f4539b;
                xVar.G = null;
                xVar.f4541F = 0;
                break;
            default:
                p072n3.i iVar = (p072n3.i) this.f4539b;
                iVar.f10550b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                iVar.a().post(new p072n3.h(1, this));
                break;
        }
    }

    public /* synthetic */ w(x xVar) {
        Objects.requireNonNull(xVar);
        this.f4539b = xVar;
    }
}

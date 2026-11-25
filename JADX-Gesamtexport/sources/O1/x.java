package O1;

import N.P;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.fasterxml.jackson.databind.deser.std.d0;
import com.google.android.gms.internal.play_billing.AbstractC0602x;
import com.google.android.gms.internal.play_billing.C0549a0;
import com.google.android.gms.internal.play_billing.C0562e1;
import com.google.android.gms.internal.play_billing.C0568g1;
import com.google.android.gms.internal.play_billing.InterfaceC0572i;
import com.google.android.gms.internal.play_billing.T;
import com.google.android.gms.internal.play_billing.U;
import com.google.android.gms.internal.play_billing.V;
import com.google.android.gms.internal.play_billing.X;
import com.google.android.gms.internal.play_billing.Y;
import com.google.android.gms.internal.play_billing.k1;
import com.google.android.gms.internal.play_billing.n1;
import com.nanjoran.ilightshow.Services.D0;
import com.nanjoran.ilightshow.Services.E0;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class x extends C0310c {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Context f4540E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public volatile int f4541F;
    public volatile InterfaceC0572i G;
    public volatile w H;
    public volatile ScheduledExecutorService I;

    public x(W2.g gVar, Context context, C0309b c0309b) {
        super(gVar, context, c0309b);
        this.f4541F = 0;
        this.f4540E = context;
    }

    public final X F(int i) {
        if (K()) {
            return d0.I(new K3.e(i, 1, this));
        }
        int i3 = AbstractC0602x.f8015a;
        Log.isLoggable("BillingClientTesting", 5);
        G(94, 28, A.a(-1, "Billing Override Service connection is disconnected."));
        return new V(0);
    }

    public final void G(int i, int i3, g gVar) {
        int i6 = y.f4542a;
        C0562e1 c0562e1B = y.b(i, i3, gVar, null, k1.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(c0562e1B, "ApiFailure should not be null");
        this.f4470h.q(c0562e1B);
    }

    public final void H(int i, s sVar, Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService;
        X xF = F(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.I == null) {
                    this.I = Executors.newSingleThreadScheduledExecutor();
                }
                scheduledExecutorService = this.I;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!xF.isDone()) {
            C0549a0 c0549a0 = new C0549a0();
            c0549a0.f7929h = xF;
            Y y2 = new Y();
            y2.f7927h = c0549a0;
            c0549a0.i = scheduledExecutorService.schedule(y2, 28500L, timeUnit);
            xF.z(y2, T.f7909h);
            xF = c0549a0;
        }
        u uVar = new u();
        uVar.f4533a = i;
        uVar.f4534b = sVar;
        uVar.f4535c = runnable;
        uVar.f4536d = this;
        xF.z(new U(xF, uVar), e());
    }

    public final synchronized boolean K() {
        return (this.f4541F != 2 || this.G == null || this.H == null) ? false : true;
    }

    @Override // O1.C0310c
    public final void a(C0308a c0308a, J2.b bVar) {
        H(3, new s(1, bVar), new t(this, c0308a, bVar, 1));
    }

    @Override // O1.C0310c
    public final g b(Activity activity, P p6) {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) F(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException unused) {
            G(102, 28, A.f4437r);
            AbstractC0602x.h("BillingClientTesting");
        } catch (Exception e6) {
            if (e6 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            G(95, 28, A.f4437r);
            AbstractC0602x.h("BillingClientTesting");
        }
        if (iIntValue > 0) {
            g gVarA = A.a(iIntValue, "Billing override value was set by a license tester.");
            G(93, 2, gVarA);
            E(gVarA);
            return gVarA;
        }
        try {
            return super.b(activity, p6);
        } catch (Exception unused2) {
            g gVar = A.f4428h;
            G(103, 2, gVar);
            AbstractC0602x.h("BillingClientTesting");
            return gVar;
        }
    }

    @Override // O1.C0310c
    public final void c(j jVar, D0 d1) {
        H(7, new s(0, d1), new t(this, jVar, d1, 0));
    }

    @Override // O1.C0310c
    public final void d(E0 e6) {
        synchronized (this) {
            if (K()) {
                AbstractC0602x.g("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                int i = y.f4542a;
                C0568g1 c0568g1C = y.c(26, k1.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(c0568g1C, "ApiSuccess should not be null");
                D.x xVar = this.f4470h;
                xVar.getClass();
                try {
                    xVar.w(c0568g1C, (n1) xVar.i);
                } catch (Throwable unused) {
                    AbstractC0602x.h("BillingLogger");
                }
            } else {
                int i3 = 1;
                if (this.f4541F == 1) {
                    int i6 = AbstractC0602x.f8015a;
                    Log.isLoggable("BillingClientTesting", 5);
                } else if (this.f4541F == 3) {
                    int i7 = AbstractC0602x.f8015a;
                    Log.isLoggable("BillingClientTesting", 5);
                    G(38, 26, A.a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.f4541F = 1;
                    AbstractC0602x.g("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.H = new w(this);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    Context context = this.f4540E;
                    List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        i3 = 41;
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                Log.isLoggable("BillingClientTesting", 5);
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (context.bindService(intent2, this.H, 1)) {
                                    AbstractC0602x.g("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    Log.isLoggable("BillingClientTesting", 5);
                                }
                            }
                            i3 = 39;
                        }
                    }
                    this.f4541F = 0;
                    AbstractC0602x.g("BillingClientTesting", "Billing Override Service unavailable on device.");
                    G(i3, 26, A.a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        l(e6, 0);
    }

    public x(W2.g gVar, Context context, D0 d1, C0309b c0309b) {
        super(gVar, context, d1, c0309b);
        this.f4541F = 0;
        this.f4540E = context;
    }
}

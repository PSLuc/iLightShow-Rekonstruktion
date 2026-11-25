package O1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.play_billing.A1;
import com.google.android.gms.internal.play_billing.AbstractBinderC0551b;
import com.google.android.gms.internal.play_billing.AbstractC0602x;
import com.google.android.gms.internal.play_billing.B1;
import com.google.android.gms.internal.play_billing.C0548a;
import com.google.android.gms.internal.play_billing.C0559d1;
import com.google.android.gms.internal.play_billing.C0562e1;
import com.google.android.gms.internal.play_billing.C0565f1;
import com.google.android.gms.internal.play_billing.C0568g1;
import com.google.android.gms.internal.play_billing.C0571h1;
import com.google.android.gms.internal.play_billing.C0574i1;
import com.google.android.gms.internal.play_billing.C0585o;
import com.google.android.gms.internal.play_billing.InterfaceC0554c;
import com.google.android.gms.internal.play_billing.j1;
import com.google.android.gms.internal.play_billing.n1;
import com.google.android.gms.internal.play_billing.u1;
import com.google.android.gms.internal.play_billing.v1;
import com.google.android.gms.internal.play_billing.x1;
import com.google.android.gms.internal.play_billing.y1;
import com.google.android.gms.internal.play_billing.z1;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p015c2.AbstractC0473d;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class r implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0311d f4523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0585o f4524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0585o f4525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0310c f4527e;

    public r(C0310c c0310c, InterfaceC0311d interfaceC0311d, int i) {
        Objects.requireNonNull(c0310c);
        this.f4527e = c0310c;
        AbstractC0473d abstractC0473d = c0310c.f4462D;
        this.f4524b = new C0585o(abstractC0473d);
        this.f4525c = new C0585o(abstractC0473d);
        this.f4523a = interfaceC0311d;
        this.f4526d = i;
    }

    public final Long a(boolean z5) {
        try {
            if (z5) {
                synchronized (this.f4527e.f4463a) {
                    try {
                        C0585o c0585o = this.f4524b;
                        if (!c0585o.f7978b) {
                            return null;
                        }
                        long jY = c0585o.f7977a.Y();
                        if (!c0585o.f7978b) {
                            throw new IllegalStateException("This stopwatch is already stopped.");
                        }
                        c0585o.f7978b = false;
                        long j4 = (jY - c0585o.f7980d) + c0585o.f7979c;
                        c0585o.f7979c = j4;
                        return Long.valueOf(TimeUnit.MILLISECONDS.convert(j4, TimeUnit.NANOSECONDS));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            synchronized (this.f4527e.f4463a) {
                try {
                    C0585o c0585o2 = this.f4525c;
                    if (!c0585o2.f7978b) {
                        return null;
                    }
                    long jY2 = c0585o2.f7977a.Y();
                    if (!c0585o2.f7978b) {
                        throw new IllegalStateException("This stopwatch is already stopped.");
                    }
                    c0585o2.f7978b = false;
                    long j6 = (jY2 - c0585o2.f7980d) + c0585o2.f7979c;
                    c0585o2.f7979c = j6;
                    return Long.valueOf(TimeUnit.MILLISECONDS.convert(j6, TimeUnit.NANOSECONDS));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable unused) {
            AbstractC0602x.h("BillingClient");
            return null;
        }
        AbstractC0602x.h("BillingClient");
        return null;
    }

    public final void b(g gVar, int i, String str, boolean z5) {
        try {
            C0571h1 c0571h1Q = C0574i1.q();
            int i3 = gVar.f4493a;
            c0571h1Q.c();
            C0574i1.p((C0574i1) c0571h1Q.i, i3);
            String str2 = gVar.f4495c;
            c0571h1Q.c();
            C0574i1.s((C0574i1) c0571h1Q.i, str2);
            c0571h1Q.c();
            C0574i1.o((C0574i1) c0571h1Q.i, i);
            if (str != null) {
                c0571h1Q.c();
                C0574i1.r((C0574i1) c0571h1Q.i, str);
            }
            Long lA = a(z5);
            C0310c c0310c = this.f4527e;
            if (!z5) {
                x1 x1VarO = y1.o();
                x1VarO.c();
                y1.p((y1) x1VarO.i, (C0574i1) c0571h1Q.a());
                if (lA != null) {
                    long jLongValue = lA.longValue();
                    x1VarO.c();
                    y1.q((y1) x1VarO.i, jLongValue);
                }
                c0310c.f4470h.u((y1) x1VarO.a());
                return;
            }
            A1 a1P = B1.p();
            int i6 = this.f4526d;
            a1P.d(i6 > 0);
            a1P.e(i6);
            if (lA != null) {
                long jLongValue2 = lA.longValue();
                a1P.c();
                B1.s((B1) a1P.i, jLongValue2);
            }
            C0559d1 c0559d1S = C0562e1.s();
            c0559d1S.d(c0571h1Q);
            c0559d1S.c();
            C0562e1.r((C0562e1) c0559d1S.i, 6);
            c0559d1S.e(a1P);
            c0310c.h((C0562e1) c0559d1S.a());
        } catch (Throwable unused) {
            AbstractC0602x.h("BillingClient");
        }
    }

    public final void c(g gVar) {
        C0310c c0310c = this.f4527e;
        synchronized (c0310c.f4463a) {
            try {
                if (c0310c.f4464b == 3) {
                    return;
                }
                try {
                    this.f4523a.c(gVar);
                } catch (Throwable unused) {
                    AbstractC0602x.h("BillingClient");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z5;
        boolean z6;
        int i = AbstractC0602x.f8015a;
        Log.isLoggable("BillingClient", 5);
        try {
            C0310c c0310c = this.f4527e;
            synchronized (c0310c.f4463a) {
                z5 = true;
                z6 = c0310c.f4464b == 1;
            }
            if (z6) {
                D.x xVar = c0310c.f4470h;
                C0559d1 c0559d1S = C0562e1.s();
                c0559d1S.c();
                C0562e1.r((C0562e1) c0559d1S.i, 6);
                C0571h1 c0571h1Q = C0574i1.q();
                c0571h1Q.c();
                C0574i1.o((C0574i1) c0571h1Q.i, 110);
                c0559d1S.d(c0571h1Q);
                A1 a1P = B1.p();
                int i3 = this.f4526d;
                if (i3 <= 0) {
                    z5 = false;
                }
                a1P.d(z5);
                a1P.e(i3);
                c0559d1S.e(a1P);
                xVar.q((C0562e1) c0559d1S.a());
            } else {
                D.x xVar2 = c0310c.f4470h;
                j1 j1VarO = j1.o();
                xVar2.getClass();
                try {
                    u1 u1VarR = v1.r();
                    u1VarR.d((n1) xVar2.i);
                    u1VarR.c();
                    v1.u((v1) u1VarR.i, j1VarO);
                    ((B) xVar2.f707j).l((v1) u1VarR.a());
                } catch (Throwable unused) {
                    AbstractC0602x.h("BillingLogger");
                }
            }
        } catch (Throwable unused2) {
            AbstractC0602x.h("BillingClient");
        }
        C0310c c0310c2 = this.f4527e;
        synchronized (c0310c2.f4463a) {
            if (c0310c2.f4464b != 3 && c0310c2.f4464b != 0) {
                c0310c2.k(0);
                c0310c2.m();
                try {
                    this.f4523a.e();
                } catch (Throwable unused3) {
                    AbstractC0602x.h("BillingClient");
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0554c c0548a;
        AbstractC0602x.g("BillingClient", "Billing service connected.");
        C0310c c0310c = this.f4527e;
        synchronized (c0310c.f4463a) {
            try {
                if (c0310c.f4464b == 3) {
                    return;
                }
                int i = AbstractBinderC0551b.f7937b;
                if (iBinder == null) {
                    c0548a = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    c0548a = iInterfaceQueryLocalInterface instanceof InterfaceC0554c ? (InterfaceC0554c) iInterfaceQueryLocalInterface : new C0548a(iBinder, "com.android.vending.billing.IInAppBillingService");
                }
                c0310c.i = c0548a;
                if (C0310c.f(new Callable() { // from class: O1.q
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Bundle bundle;
                        InterfaceC0554c interfaceC0554c;
                        int i3;
                        int i6;
                        r rVar = this.f4522h;
                        C0310c c0310c2 = rVar.f4527e;
                        synchronized (c0310c2.f4463a) {
                            try {
                                if (c0310c2.f4464b == 3) {
                                    return null;
                                }
                                boolean z5 = true;
                                boolean z6 = c0310c2.f4464b == 1;
                                if (TextUtils.isEmpty(null)) {
                                    bundle = null;
                                } else {
                                    bundle = new Bundle();
                                    bundle.putString("accountName", null);
                                    AbstractC0602x.b(bundle, c0310c2.f4465c, c0310c2.f4466d, c0310c2.f4461C.longValue());
                                }
                                synchronized (c0310c2.f4463a) {
                                    interfaceC0554c = c0310c2.i;
                                }
                                if (interfaceC0554c == null) {
                                    C0310c c0310c3 = rVar.f4527e;
                                    c0310c3.k(0);
                                    int i7 = rVar.f4526d;
                                    g gVar = A.f4429j;
                                    c0310c3.j(107, i7, gVar);
                                    rVar.c(gVar);
                                    return null;
                                }
                                C0310c c0310c4 = rVar.f4527e;
                                String packageName = c0310c4.f4469g.getPackageName();
                                int iC = 3;
                                int i8 = 27;
                                while (true) {
                                    if (i8 < 3) {
                                        i8 = 0;
                                        break;
                                    }
                                    try {
                                        AbstractC0602x.g("BillingClient", "trying subs apiVersion: " + i8);
                                        if (bundle == null) {
                                            C0548a c0548a2 = (C0548a) interfaceC0554c;
                                            Parcel parcelA = c0548a2.a();
                                            parcelA.writeInt(i8);
                                            parcelA.writeString(packageName);
                                            parcelA.writeString("subs");
                                            Parcel parcelB = c0548a2.b(parcelA, 1);
                                            int i9 = parcelB.readInt();
                                            parcelB.recycle();
                                            iC = i9;
                                        } else {
                                            iC = ((C0548a) interfaceC0554c).c(i8, packageName, "subs", bundle);
                                        }
                                        if (iC == 0) {
                                            AbstractC0602x.g("BillingClient", "highestLevelSupportedForSubs: " + i8);
                                            break;
                                        }
                                        i8--;
                                    } catch (Exception e6) {
                                        AbstractC0602x.h("BillingClient");
                                        boolean z7 = e6 instanceof DeadObjectException;
                                        if (z7) {
                                            i3 = 91;
                                        } else if (e6 instanceof RemoteException) {
                                            i3 = 90;
                                        } else {
                                            i3 = e6 instanceof SecurityException ? 92 : 42;
                                        }
                                        String strA = AbstractC0916i.b(i3, 42) ? y.a(e6) : null;
                                        rVar.f4527e.k(0);
                                        rVar.b(z7 ? A.f4429j : A.f4428h, i3, strA, z6);
                                        rVar.c(z7 ? A.f4429j : A.f4428h);
                                    }
                                }
                                c0310c4.f4472k = i8 >= 3;
                                if (i8 < 3) {
                                    AbstractC0602x.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                    i6 = 9;
                                } else {
                                    i6 = 1;
                                }
                                for (int i10 = 27; i10 >= 3; i10--) {
                                    AbstractC0602x.g("BillingClient", "trying inapp apiVersion: " + i10);
                                    if (bundle == null) {
                                        C0548a c0548a3 = (C0548a) interfaceC0554c;
                                        Parcel parcelA2 = c0548a3.a();
                                        parcelA2.writeInt(i10);
                                        parcelA2.writeString(packageName);
                                        parcelA2.writeString("inapp");
                                        Parcel parcelB2 = c0548a3.b(parcelA2, 1);
                                        int i11 = parcelB2.readInt();
                                        parcelB2.recycle();
                                        iC = i11;
                                    } else {
                                        iC = ((C0548a) interfaceC0554c).c(i10, packageName, "inapp", bundle);
                                    }
                                    if (iC == 0) {
                                        c0310c4.f4473l = i10;
                                        AbstractC0602x.g("BillingClient", "mHighestLevelSupportedForInApp: " + i10);
                                        break;
                                    }
                                }
                                int i12 = c0310c4.f4473l;
                                c0310c4.f4473l = i12;
                                c0310c4.f4484w = i12 >= 26;
                                c0310c4.f4483v = i12 >= 24;
                                c0310c4.f4482u = i12 >= 21;
                                c0310c4.f4481t = i12 >= 20;
                                c0310c4.f4480s = i12 >= 19;
                                c0310c4.f4479r = i12 >= 17;
                                c0310c4.f4478q = i12 >= 16;
                                c0310c4.f4477p = i12 >= 15;
                                c0310c4.f4476o = i12 >= 14;
                                c0310c4.f4475n = i12 >= 9;
                                c0310c4.f4474m = i12 >= 6;
                                if (i12 < 3) {
                                    int i13 = AbstractC0602x.f8015a;
                                    Log.isLoggable("BillingClient", 5);
                                    i6 = 36;
                                }
                                C0310c.p(c0310c4, iC);
                                if (iC != 0) {
                                    g gVar2 = A.f4422b;
                                    rVar.b(gVar2, i6, null, z6);
                                    rVar.c(gVar2);
                                    return null;
                                }
                                try {
                                    Long lA = rVar.a(z6);
                                    if (z6) {
                                        C0565f1 c0565f1R = C0568g1.r();
                                        c0565f1R.c();
                                        C0568g1.q((C0568g1) c0565f1R.i, 6);
                                        A1 a1P = B1.p();
                                        int i14 = rVar.f4526d;
                                        if (i14 <= 0) {
                                            z5 = false;
                                        }
                                        a1P.d(z5);
                                        a1P.e(i14);
                                        if (lA != null) {
                                            long jLongValue = lA.longValue();
                                            a1P.c();
                                            B1.s((B1) a1P.i, jLongValue);
                                        }
                                        C0310c c0310c5 = rVar.f4527e;
                                        c0565f1R.c();
                                        C0568g1.p((C0568g1) c0565f1R.i, (B1) a1P.a());
                                        c0310c5.i((C0568g1) c0565f1R.a());
                                    } else {
                                        x1 x1VarO = y1.o();
                                        C0571h1 c0571h1Q = C0574i1.q();
                                        c0571h1Q.c();
                                        C0574i1.p((C0574i1) c0571h1Q.i, 0);
                                        x1VarO.c();
                                        y1.p((y1) x1VarO.i, (C0574i1) c0571h1Q.a());
                                        if (lA != null) {
                                            long jLongValue2 = lA.longValue();
                                            x1VarO.c();
                                            y1.q((y1) x1VarO.i, jLongValue2);
                                        }
                                        rVar.f4527e.f4470h.u((y1) x1VarO.a());
                                    }
                                } catch (Throwable unused) {
                                    AbstractC0602x.h("BillingClient");
                                }
                                rVar.c(A.i);
                                return null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }, 30000L, new L2.o(2, this), c0310c.q(), c0310c.e()) == null) {
                    int i3 = this.f4526d;
                    g gVarT = c0310c.t();
                    c0310c.j(25, i3, gVarT);
                    c(gVarT);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z5;
        boolean z6;
        int i = AbstractC0602x.f8015a;
        Log.isLoggable("BillingClient", 5);
        try {
            C0310c c0310c = this.f4527e;
            synchronized (c0310c.f4463a) {
                z5 = true;
                z6 = c0310c.f4464b == 1;
            }
            if (z6) {
                D.x xVar = c0310c.f4470h;
                C0559d1 c0559d1S = C0562e1.s();
                c0559d1S.c();
                C0562e1.r((C0562e1) c0559d1S.i, 6);
                C0571h1 c0571h1Q = C0574i1.q();
                c0571h1Q.c();
                C0574i1.o((C0574i1) c0571h1Q.i, 109);
                c0559d1S.d(c0571h1Q);
                A1 a1P = B1.p();
                int i3 = this.f4526d;
                if (i3 <= 0) {
                    z5 = false;
                }
                a1P.d(z5);
                a1P.e(i3);
                c0559d1S.e(a1P);
                xVar.q((C0562e1) c0559d1S.a());
            } else {
                D.x xVar2 = c0310c.f4470h;
                z1 z1VarO = z1.o();
                xVar2.getClass();
                if (z1VarO != null) {
                    try {
                        u1 u1VarR = v1.r();
                        u1VarR.d((n1) xVar2.i);
                        u1VarR.c();
                        v1.q((v1) u1VarR.i, z1VarO);
                        ((B) xVar2.f707j).l((v1) u1VarR.a());
                    } catch (Throwable unused) {
                        AbstractC0602x.h("BillingLogger");
                    }
                }
            }
        } catch (Throwable unused2) {
            AbstractC0602x.h("BillingClient");
        }
        C0310c c0310c2 = this.f4527e;
        synchronized (c0310c2.f4463a) {
            try {
                C0585o c0585o = this.f4525c;
                c0585o.f7979c = 0L;
                c0585o.f7978b = false;
                c0585o.a();
                if (c0310c2.f4464b == 3) {
                    return;
                }
                c0310c2.k(0);
                try {
                    this.f4523a.e();
                } catch (Throwable unused3) {
                    AbstractC0602x.h("BillingClient");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

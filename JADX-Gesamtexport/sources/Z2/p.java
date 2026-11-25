package Z2;

import B.C0025m0;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class p extends p038g3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f6050a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.google.android.gms.common.internal.a aVar, Looper looper) {
        super(looper, 1);
        Objects.requireNonNull(aVar);
        this.f6050a = aVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        l lVar;
        com.google.android.gms.common.internal.a aVar = this.f6050a;
        if (aVar.f7802v.get() != message.arg1) {
            int i = message.what;
            if ((i == 2 || i == 1 || i == 7) && (lVar = (l) message.obj) != null) {
                synchronized (lVar) {
                    lVar.f6039a = null;
                }
                com.google.android.gms.common.internal.a aVar2 = lVar.f6041c;
                synchronized (aVar2.f7791k) {
                    aVar2.f7791k.remove(lVar);
                }
                return;
            }
            return;
        }
        int i3 = message.what;
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !aVar.isConnecting()) {
            l lVar2 = (l) message.obj;
            if (lVar2 != null) {
                synchronized (lVar2) {
                    lVar2.f6039a = null;
                }
                com.google.android.gms.common.internal.a aVar3 = lVar2.f6041c;
                synchronized (aVar3.f7791k) {
                    aVar3.f7791k.remove(lVar2);
                }
                return;
            }
            return;
        }
        int i6 = message.what;
        if (i6 == 4) {
            aVar.f7799s = new W2.a(message.arg2, null, null);
            if (!aVar.f7800t && !TextUtils.isEmpty(aVar.o()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(aVar.o());
                    if (!aVar.f7800t) {
                        aVar.s(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            W2.a aVar4 = aVar.f7799s;
            if (aVar4 == null) {
                aVar4 = new W2.a(8, null, null);
            }
            aVar.i.g(aVar4);
            System.currentTimeMillis();
            return;
        }
        if (i6 == 5) {
            W2.a aVar5 = aVar.f7799s;
            if (aVar5 == null) {
                aVar5 = new W2.a(8, null, null);
            }
            aVar.i.g(aVar5);
            System.currentTimeMillis();
            return;
        }
        if (i6 == 3) {
            Object obj = message.obj;
            aVar.i.g(new W2.a(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i6 == 6) {
            aVar.s(5, null);
            C0025m0 c0025m0 = aVar.f7794n;
            if (c0025m0 != null) {
                ((X2.c) c0025m0.i).b(message.arg2);
            }
            System.currentTimeMillis();
            aVar.r(5, 1, null);
            return;
        }
        if (i6 == 2 && !aVar.isConnected()) {
            l lVar3 = (l) message.obj;
            if (lVar3 != null) {
                synchronized (lVar3) {
                    lVar3.f6039a = null;
                }
                com.google.android.gms.common.internal.a aVar6 = lVar3.f6041c;
                synchronized (aVar6.f7791k) {
                    aVar6.f7791k.remove(lVar3);
                }
                return;
            }
            return;
        }
        int i7 = message.what;
        if (i7 != 2 && i7 != 1 && i7 != 7) {
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 34);
            sb.append("Don't know how to handle message: ");
            sb.append(i7);
            Log.wtf("GmsClient", sb.toString(), new Exception());
            return;
        }
        l lVar4 = (l) message.obj;
        synchronized (lVar4) {
            try {
                bool = lVar4.f6039a;
                if (lVar4.f6040b) {
                    new StringBuilder(lVar4.toString().length() + 47);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            com.google.android.gms.common.internal.a aVar7 = lVar4.f6044f;
            int i8 = lVar4.f6042d;
            if (i8 != 0) {
                aVar7.s(1, null);
                Bundle bundle = lVar4.f6043e;
                lVar4.b(new W2.a(i8, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!lVar4.a()) {
                aVar7.s(1, null);
                lVar4.b(new W2.a(8, null, null));
            }
        }
        synchronized (lVar4) {
            lVar4.f6040b = true;
        }
        synchronized (lVar4) {
            lVar4.f6039a = null;
        }
        com.google.android.gms.common.internal.a aVar8 = lVar4.f6041c;
        synchronized (aVar8.f7791k) {
            aVar8.f7791k.remove(lVar4);
        }
    }
}

package Z2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.internal.play_billing.AbstractBinderC0560e;

/* JADX INFO: loaded from: classes.dex */
public final class q extends AbstractBinderC0560e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.google.android.gms.common.internal.a f6051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6052c;

    public q(com.google.android.gms.common.internal.a aVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f6051b = aVar;
        this.f6052c = i;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractBinderC0560e
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i3 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) p042h3.g.a(parcel, Bundle.CREATOR);
            p042h3.g.b(parcel);
            n.c("onPostInitComplete can be called only once per call to getRemoteService", this.f6051b);
            com.google.android.gms.common.internal.a aVar = this.f6051b;
            aVar.getClass();
            s sVar = new s(aVar, i3, strongBinder, bundle);
            p pVar = aVar.f7786e;
            pVar.sendMessage(pVar.obtainMessage(1, this.f6052c, -1, sVar));
            this.f6051b = null;
        } else if (i == 2) {
            parcel.readInt();
            p042h3.g.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i6 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            u uVar = (u) p042h3.g.a(parcel, u.CREATOR);
            p042h3.g.b(parcel);
            com.google.android.gms.common.internal.a aVar2 = this.f6051b;
            n.c("onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService", aVar2);
            n.b(uVar);
            aVar2.f7801u = uVar;
            Bundle bundle2 = uVar.f6058h;
            n.c("onPostInitComplete can be called only once per call to getRemoteService", this.f6051b);
            com.google.android.gms.common.internal.a aVar3 = this.f6051b;
            aVar3.getClass();
            s sVar2 = new s(aVar3, i6, strongBinder2, bundle2);
            p pVar2 = aVar3.f7786e;
            pVar2.sendMessage(pVar2.obtainMessage(1, this.f6052c, -1, sVar2));
            this.f6051b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}

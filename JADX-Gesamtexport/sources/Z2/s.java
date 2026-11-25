package Z2;

import B.C0025m0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class s extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f6055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f6056h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.google.android.gms.common.internal.a aVar, int i, IBinder iBinder, Bundle bundle) {
        super(aVar, i, bundle);
        Objects.requireNonNull(aVar);
        this.f6056h = aVar;
        this.f6055g = iBinder;
    }

    @Override // Z2.l
    public final boolean a() {
        IBinder iBinder = this.f6055g;
        try {
            n.b(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            com.google.android.gms.common.internal.a aVar = this.f6056h;
            if (!aVar.o().equals(interfaceDescriptor)) {
                new StringBuilder(aVar.o().length() + 34 + String.valueOf(interfaceDescriptor).length());
                return false;
            }
            IInterface iInterfaceL = aVar.l(iBinder);
            if (iInterfaceL != null && (aVar.r(2, 4, iInterfaceL) || aVar.r(3, 4, iInterfaceL))) {
                aVar.f7799s = null;
                C0025m0 c0025m0 = aVar.f7794n;
                if (c0025m0 == null) {
                    return true;
                }
                ((X2.c) c0025m0.i).c();
                return true;
            }
            return false;
        } catch (RemoteException unused) {
        }
    }

    @Override // Z2.l
    public final void b(W2.a aVar) {
        C0025m0 c0025m0 = this.f6056h.f7795o;
        if (c0025m0 != null) {
            ((X2.d) c0025m0.i).a(aVar);
        }
        System.currentTimeMillis();
    }
}

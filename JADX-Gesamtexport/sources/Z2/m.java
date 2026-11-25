package Z2;

import F1.C0097n;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class m implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f6045a;

    public m(IBinder iBinder) {
        this.f6045a = iBinder;
    }

    public final void a(q qVar, c cVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(qVar);
            parcelObtain.writeInt(1);
            C0097n.a(cVar, parcelObtain, 0);
            this.f6045a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6045a;
    }
}

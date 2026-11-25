package Z2;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class z implements d, IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f6080a;

    public z(IBinder iBinder) {
        this.f6080a = iBinder;
    }

    public final Account a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                this.f6080a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain.recycle();
                Account account = (Account) p042h3.g.a(parcelObtain2, Account.CREATOR);
                parcelObtain2.recycle();
                return account;
            } catch (RuntimeException e6) {
                parcelObtain2.recycle();
                throw e6;
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6080a;
    }
}

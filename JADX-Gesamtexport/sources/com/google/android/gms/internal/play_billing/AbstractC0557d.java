package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0557d implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f7939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7940b;

    public AbstractC0557d(IBinder iBinder, String str) {
        this.f7939a = iBinder;
        this.f7940b = str;
    }

    public final Parcel a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f7940b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7939a;
    }

    public final Parcel b(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f7939a.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e6) {
                parcelObtain.recycle();
                throw e6;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }
}

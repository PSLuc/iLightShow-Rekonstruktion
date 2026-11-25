package com.google.android.gms.internal.play_billing;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0560e extends Binder implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7941a;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int i = this.f7941a;
        return this;
    }

    public boolean d(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i3) {
        int i6 = 0;
        switch (this.f7941a) {
            case 0:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i3)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                O1.v vVar = (O1.v) this;
                if (i != 1) {
                    return false;
                }
                int i7 = parcel.readInt();
                int i8 = AbstractC0563f.f7942a;
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    throw new BadParcelableException(p012c.k.r(iDataAvail, "Parcel data not fully consumed, unread size: "));
                }
                vVar.f4537b.a(Integer.valueOf(i7));
                return true;
            case 1:
            default:
                return super.onTransact(i, parcel, parcel2, i3);
            case 2:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i3)) {
                    return true;
                }
                return d(i, parcel, parcel2);
            case 3:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i3)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                p066m3.e eVar = (p066m3.e) this;
                if (i != 2) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                int i9 = p072n3.a.f10540a;
                Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
                int iDataAvail2 = parcel.dataAvail();
                if (iDataAvail2 > 0) {
                    throw new BadParcelableException(p012c.k.r(iDataAvail2, "Parcel data not fully consumed, unread size: "));
                }
                p072n3.i iVar = eVar.f10416d.f10418a;
                if (iVar != null) {
                    p060l3.b bVar = eVar.f10415c;
                    synchronized (iVar.f10554f) {
                        iVar.f10553e.remove(bVar);
                        break;
                    }
                    iVar.a().post(new p072n3.h(i6, iVar));
                }
                eVar.f10414b.c("onGetLaunchReviewFlowInfo", new Object[0]);
                eVar.f10415c.b(new p066m3.b((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
                return true;
        }
    }

    public AbstractBinderC0560e(String str) {
        this.f7941a = 2;
        attachInterface(this, str);
    }
}

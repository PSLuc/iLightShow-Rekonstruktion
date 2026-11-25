package F1;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import java.util.ArrayList;

/* JADX INFO: renamed from: F1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0097n implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1364a;

    public /* synthetic */ C0097n(int i) {
        this.f1364a = i;
    }

    public static void a(Z2.c cVar, Parcel parcel, int i) {
        int iJ0 = p081p0.c.J0(parcel, 20293);
        p081p0.c.H0(parcel, 1, 4);
        parcel.writeInt(cVar.f6006h);
        p081p0.c.H0(parcel, 2, 4);
        parcel.writeInt(cVar.i);
        p081p0.c.H0(parcel, 3, 4);
        parcel.writeInt(cVar.f6007j);
        p081p0.c.F0(parcel, 4, cVar.f6008k);
        IBinder iBinder = cVar.f6009l;
        if (iBinder != null) {
            int iJ1 = p081p0.c.J0(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            p081p0.c.L0(parcel, iJ1);
        }
        p081p0.c.G0(parcel, 6, cVar.f6010m, i);
        Bundle bundle = cVar.f6011n;
        if (bundle != null) {
            int iJ2 = p081p0.c.J0(parcel, 7);
            parcel.writeBundle(bundle);
            p081p0.c.L0(parcel, iJ2);
        }
        p081p0.c.E0(parcel, 8, cVar.f6012o, i);
        p081p0.c.G0(parcel, 10, cVar.f6013p, i);
        p081p0.c.G0(parcel, 11, cVar.f6014q, i);
        p081p0.c.H0(parcel, 12, 4);
        parcel.writeInt(cVar.f6015r ? 1 : 0);
        p081p0.c.H0(parcel, 13, 4);
        parcel.writeInt(cVar.f6016s);
        boolean z5 = cVar.f6017t;
        p081p0.c.H0(parcel, 14, 4);
        parcel.writeInt(z5 ? 1 : 0);
        p081p0.c.F0(parcel, 15, cVar.f6018u);
        p081p0.c.L0(parcel, iJ0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1364a) {
            case 0:
                E4.k.f("inParcel", parcel);
                return new C0098o(parcel);
            case 1:
                return new ParcelImpl(parcel);
            case 2:
                int iC0 = p027e3.a.C0(parcel);
                PendingIntent pendingIntent = null;
                String strT = null;
                Integer numValueOf = null;
                int iS0 = 0;
                int iS1 = 0;
                while (parcel.dataPosition() < iC0) {
                    int i = parcel.readInt();
                    char c6 = (char) i;
                    if (c6 == 1) {
                        iS0 = p027e3.a.s0(parcel, i);
                    } else if (c6 == 2) {
                        iS1 = p027e3.a.s0(parcel, i);
                    } else if (c6 == 3) {
                        pendingIntent = (PendingIntent) p027e3.a.S(parcel, i, PendingIntent.CREATOR);
                    } else if (c6 == 4) {
                        strT = p027e3.a.T(parcel, i);
                    } else if (c6 != 5) {
                        p027e3.a.v0(parcel, i);
                    } else {
                        int iT0 = p027e3.a.t0(parcel, i);
                        if (iT0 == 0) {
                            numValueOf = null;
                        } else {
                            if (iT0 != 4) {
                                String hexString = Integer.toHexString(iT0);
                                StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + String.valueOf(4).length() + 19 + String.valueOf(iT0).length() + 4 + 1);
                                sb.append("Expected size 4 got ");
                                sb.append(iT0);
                                sb.append(" (0x");
                                sb.append(hexString);
                                sb.append(")");
                                throw new SafeParcelReader$ParseException(sb.toString(), parcel);
                            }
                            numValueOf = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                p027e3.a.Y(parcel, iC0);
                return new W2.a(iS0, iS1, pendingIntent, strT, numValueOf);
            case 3:
                int iC1 = p027e3.a.C0(parcel);
                int iS2 = 0;
                boolean zR0 = false;
                long j4 = -1;
                String strT2 = null;
                while (parcel.dataPosition() < iC1) {
                    int i3 = parcel.readInt();
                    char c7 = (char) i3;
                    if (c7 == 1) {
                        strT2 = p027e3.a.T(parcel, i3);
                    } else if (c7 == 2) {
                        iS2 = p027e3.a.s0(parcel, i3);
                    } else if (c7 == 3) {
                        p027e3.a.D0(parcel, i3, 8);
                        j4 = parcel.readLong();
                    } else if (c7 != 4) {
                        p027e3.a.v0(parcel, i3);
                    } else {
                        zR0 = p027e3.a.r0(parcel, i3);
                    }
                }
                p027e3.a.Y(parcel, iC1);
                return new W2.c(strT2, iS2, j4, zR0);
            case 4:
                int iC2 = p027e3.a.C0(parcel);
                String strT3 = null;
                int iS3 = 0;
                while (parcel.dataPosition() < iC2) {
                    int i6 = parcel.readInt();
                    char c8 = (char) i6;
                    if (c8 == 1) {
                        iS3 = p027e3.a.s0(parcel, i6);
                    } else if (c8 != 2) {
                        p027e3.a.v0(parcel, i6);
                    } else {
                        strT3 = p027e3.a.T(parcel, i6);
                    }
                }
                p027e3.a.Y(parcel, iC2);
                return new Scope(iS3, strT3);
            case 5:
                int iC3 = p027e3.a.C0(parcel);
                String strT4 = null;
                W2.a aVar = null;
                int iS4 = 0;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iC3) {
                    int i7 = parcel.readInt();
                    char c9 = (char) i7;
                    if (c9 == 1) {
                        iS4 = p027e3.a.s0(parcel, i7);
                    } else if (c9 == 2) {
                        strT4 = p027e3.a.T(parcel, i7);
                    } else if (c9 == 3) {
                        pendingIntent2 = (PendingIntent) p027e3.a.S(parcel, i7, PendingIntent.CREATOR);
                    } else if (c9 != 4) {
                        p027e3.a.v0(parcel, i7);
                    } else {
                        aVar = (W2.a) p027e3.a.S(parcel, i7, W2.a.CREATOR);
                    }
                }
                p027e3.a.Y(parcel, iC3);
                return new Status(iS4, strT4, pendingIntent2, aVar);
            case 6:
                int iC4 = p027e3.a.C0(parcel);
                int iS5 = 0;
                while (true) {
                    ArrayList arrayListCreateTypedArrayList = null;
                    while (true) {
                        if (parcel.dataPosition() >= iC4) {
                            p027e3.a.Y(parcel, iC4);
                            return new Z2.h(iS5, arrayListCreateTypedArrayList);
                        }
                        int i8 = parcel.readInt();
                        char c10 = (char) i8;
                        if (c10 == 1) {
                            iS5 = p027e3.a.s0(parcel, i8);
                        } else if (c10 != 2) {
                            p027e3.a.v0(parcel, i8);
                        } else {
                            Parcelable.Creator<Z2.e> creator = Z2.e.CREATOR;
                            int iT1 = p027e3.a.t0(parcel, i8);
                            int iDataPosition = parcel.dataPosition();
                            if (iT1 == 0) {
                            }
                            arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
                            parcel.setDataPosition(iDataPosition + iT1);
                        }
                        break;
                    }
                }
                break;
            case 7:
                int iC5 = p027e3.a.C0(parcel);
                int iS6 = -1;
                int iS7 = 0;
                int iS8 = 0;
                int iS9 = 0;
                int iS10 = 0;
                String strT5 = null;
                String strT6 = null;
                long j6 = 0;
                long j7 = 0;
                while (parcel.dataPosition() < iC5) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            iS7 = p027e3.a.s0(parcel, i9);
                            break;
                        case 2:
                            iS8 = p027e3.a.s0(parcel, i9);
                            break;
                        case 3:
                            iS9 = p027e3.a.s0(parcel, i9);
                            break;
                        case 4:
                            p027e3.a.D0(parcel, i9, 8);
                            j6 = parcel.readLong();
                            break;
                        case 5:
                            p027e3.a.D0(parcel, i9, 8);
                            j7 = parcel.readLong();
                            break;
                        case 6:
                            strT5 = p027e3.a.T(parcel, i9);
                            break;
                        case 7:
                            strT6 = p027e3.a.T(parcel, i9);
                            break;
                        case '\b':
                            iS10 = p027e3.a.s0(parcel, i9);
                            break;
                        case '\t':
                            iS6 = p027e3.a.s0(parcel, i9);
                            break;
                        default:
                            p027e3.a.v0(parcel, i9);
                            break;
                    }
                }
                p027e3.a.Y(parcel, iC5);
                return new Z2.e(iS7, iS8, iS9, j6, j7, strT5, strT6, iS10, iS6);
            case 8:
                int iC6 = p027e3.a.C0(parcel);
                int iS11 = 0;
                boolean zR1 = false;
                boolean zR2 = false;
                int iS12 = 0;
                int iS13 = 0;
                while (parcel.dataPosition() < iC6) {
                    int i10 = parcel.readInt();
                    char c11 = (char) i10;
                    if (c11 == 1) {
                        iS11 = p027e3.a.s0(parcel, i10);
                    } else if (c11 == 2) {
                        zR1 = p027e3.a.r0(parcel, i10);
                    } else if (c11 == 3) {
                        zR2 = p027e3.a.r0(parcel, i10);
                    } else if (c11 == 4) {
                        iS12 = p027e3.a.s0(parcel, i10);
                    } else if (c11 != 5) {
                        p027e3.a.v0(parcel, i10);
                    } else {
                        iS13 = p027e3.a.s0(parcel, i10);
                    }
                }
                p027e3.a.Y(parcel, iC6);
                return new Z2.g(iS11, zR1, zR2, iS12, iS13);
            case 9:
                int iC7 = p027e3.a.C0(parcel);
                int iS14 = 0;
                Bundle bundle = null;
                W2.c[] cVarArr = null;
                Z2.b bVar = null;
                while (parcel.dataPosition() < iC7) {
                    int i11 = parcel.readInt();
                    char c12 = (char) i11;
                    if (c12 == 1) {
                        int iT2 = p027e3.a.t0(parcel, i11);
                        int iDataPosition2 = parcel.dataPosition();
                        if (iT2 == 0) {
                            bundle = null;
                        } else {
                            Bundle bundle2 = parcel.readBundle();
                            parcel.setDataPosition(iDataPosition2 + iT2);
                            bundle = bundle2;
                        }
                    } else if (c12 == 2) {
                        cVarArr = (W2.c[]) p027e3.a.U(parcel, i11, W2.c.CREATOR);
                    } else if (c12 == 3) {
                        iS14 = p027e3.a.s0(parcel, i11);
                    } else if (c12 != 4) {
                        p027e3.a.v0(parcel, i11);
                    } else {
                        bVar = (Z2.b) p027e3.a.S(parcel, i11, Z2.b.CREATOR);
                    }
                }
                p027e3.a.Y(parcel, iC7);
                Z2.u uVar = new Z2.u();
                uVar.f6058h = bundle;
                uVar.i = cVarArr;
                uVar.f6059j = iS14;
                uVar.f6060k = bVar;
                return uVar;
            case 10:
                int iC8 = p027e3.a.C0(parcel);
                Z2.g gVar = null;
                int[] iArrCreateIntArray = null;
                int[] iArrCreateIntArray2 = null;
                boolean zR3 = false;
                boolean zR4 = false;
                int iS15 = 0;
                while (parcel.dataPosition() < iC8) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            gVar = (Z2.g) p027e3.a.S(parcel, i12, Z2.g.CREATOR);
                            break;
                        case 2:
                            zR3 = p027e3.a.r0(parcel, i12);
                            break;
                        case 3:
                            zR4 = p027e3.a.r0(parcel, i12);
                            break;
                        case 4:
                            int iT3 = p027e3.a.t0(parcel, i12);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iT3 != 0) {
                                iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition3 + iT3);
                            } else {
                                iArrCreateIntArray = null;
                            }
                            break;
                        case 5:
                            iS15 = p027e3.a.s0(parcel, i12);
                            break;
                        case 6:
                            int iT4 = p027e3.a.t0(parcel, i12);
                            int iDataPosition4 = parcel.dataPosition();
                            if (iT4 != 0) {
                                iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition4 + iT4);
                            } else {
                                iArrCreateIntArray2 = null;
                            }
                            break;
                        default:
                            p027e3.a.v0(parcel, i12);
                            break;
                    }
                }
                p027e3.a.Y(parcel, iC8);
                return new Z2.b(gVar, zR3, zR4, iArrCreateIntArray, iS15, iArrCreateIntArray2);
            case 11:
                int iC9 = p027e3.a.C0(parcel);
                Scope[] scopeArr = Z2.c.f6004v;
                Bundle bundle3 = new Bundle();
                W2.c[] cVarArr2 = Z2.c.f6005w;
                W2.c[] cVarArr3 = cVarArr2;
                String strT7 = null;
                IBinder iBinder = null;
                Account account = null;
                String strT8 = null;
                int iS16 = 0;
                int iS17 = 0;
                int iS18 = 0;
                boolean zR5 = false;
                int iS19 = 0;
                boolean zR6 = false;
                while (parcel.dataPosition() < iC9) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            iS16 = p027e3.a.s0(parcel, i13);
                            break;
                        case 2:
                            iS17 = p027e3.a.s0(parcel, i13);
                            break;
                        case 3:
                            iS18 = p027e3.a.s0(parcel, i13);
                            break;
                        case 4:
                            strT7 = p027e3.a.T(parcel, i13);
                            break;
                        case 5:
                            int iT5 = p027e3.a.t0(parcel, i13);
                            int iDataPosition5 = parcel.dataPosition();
                            if (iT5 != 0) {
                                IBinder strongBinder = parcel.readStrongBinder();
                                parcel.setDataPosition(iDataPosition5 + iT5);
                                iBinder = strongBinder;
                            } else {
                                iBinder = null;
                            }
                            break;
                        case 6:
                            scopeArr = (Scope[]) p027e3.a.U(parcel, i13, Scope.CREATOR);
                            break;
                        case 7:
                            int iT6 = p027e3.a.t0(parcel, i13);
                            int iDataPosition6 = parcel.dataPosition();
                            if (iT6 != 0) {
                                Bundle bundle4 = parcel.readBundle();
                                parcel.setDataPosition(iDataPosition6 + iT6);
                                bundle3 = bundle4;
                            } else {
                                bundle3 = null;
                            }
                            break;
                        case '\b':
                            account = (Account) p027e3.a.S(parcel, i13, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            p027e3.a.v0(parcel, i13);
                            break;
                        case '\n':
                            cVarArr2 = (W2.c[]) p027e3.a.U(parcel, i13, W2.c.CREATOR);
                            break;
                        case 11:
                            cVarArr3 = (W2.c[]) p027e3.a.U(parcel, i13, W2.c.CREATOR);
                            break;
                        case '\f':
                            zR5 = p027e3.a.r0(parcel, i13);
                            break;
                        case '\r':
                            iS19 = p027e3.a.s0(parcel, i13);
                            break;
                        case 14:
                            zR6 = p027e3.a.r0(parcel, i13);
                            break;
                        case 15:
                            strT8 = p027e3.a.T(parcel, i13);
                            break;
                    }
                }
                p027e3.a.Y(parcel, iC9);
                return new Z2.c(iS16, iS17, iS18, strT7, iBinder, scopeArr, bundle3, account, cVarArr2, cVarArr3, zR5, iS19, zR6, strT8);
            case 12:
                E4.k.f("parcel", parcel);
                return new p029f.a(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
            case 13:
                E4.k.f("inParcel", parcel);
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                E4.k.c(parcelable);
                return new p029f.i((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 14:
                return new p066m3.b((PendingIntent) parcel.readParcelable(p066m3.a.class.getClassLoader()), parcel.readInt() != 0);
            default:
                p070n1.i iVar = new p070n1.i(parcel);
                iVar.f10535h = parcel.readInt();
                return iVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f1364a) {
            case 0:
                return new C0098o[i];
            case 1:
                return new ParcelImpl[i];
            case 2:
                return new W2.a[i];
            case 3:
                return new W2.c[i];
            case 4:
                return new Scope[i];
            case 5:
                return new Status[i];
            case 6:
                return new Z2.h[i];
            case 7:
                return new Z2.e[i];
            case 8:
                return new Z2.g[i];
            case 9:
                return new Z2.u[i];
            case 10:
                return new Z2.b[i];
            case 11:
                return new Z2.c[i];
            case 12:
                return new p029f.a[i];
            case 13:
                return new p029f.i[i];
            case 14:
                return new p066m3.a[i];
            default:
                return new p070n1.i[i];
        }
    }
}

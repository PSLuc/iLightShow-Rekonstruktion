package p010b3;

import B.C0031p0;
import W2.c;
import Y2.h;
import Z2.i;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;
import p038g3.b;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i f7104y;

    public d(Context context, Looper looper, C0031p0 c0031p0, i iVar, h hVar, h hVar2) {
        super(context, looper, 270, c0031p0, hVar, hVar2);
        this.f7104y = iVar;
    }

    @Override // X2.a
    public final int e() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // com.google.android.gms.common.internal.a
    public final c[] m() {
        return b.f9181b;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle n() {
        this.f7104y.getClass();
        return new Bundle();
    }

    @Override // com.google.android.gms.common.internal.a
    public final String o() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String p() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean q() {
        return true;
    }
}

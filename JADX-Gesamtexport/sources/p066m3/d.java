package p066m3;

import O1.C0308a;
import O1.w;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import p060l3.b;
import p072n3.a;
import p072n3.c;
import p072n3.e;
import p072n3.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {
    public final /* synthetic */ int i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f10412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f10413k;

    public d(w wVar, IBinder iBinder) {
        this.f10412j = iBinder;
        this.f10413k = wVar;
    }

    @Override // p072n3.e
    public final void a() {
        HashMap map;
        int i = 0;
        p072n3.d bVar = null;
        switch (this.i) {
            case 0:
                try {
                    f fVar = (f) this.f10413k;
                    p072n3.d dVar = fVar.f10418a.f10560m;
                    String str = fVar.f10419b;
                    Bundle bundle = new Bundle();
                    HashMap map2 = g.f10420a;
                    synchronized (g.class) {
                        map = g.f10420a;
                        map.put("java", 20002);
                    }
                    bundle.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
                    if (map.containsKey("native")) {
                        bundle.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
                    }
                    if (map.containsKey("unity")) {
                        bundle.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
                    }
                    f fVar2 = (f) this.f10413k;
                    b bVar2 = (b) this.f10412j;
                    String str2 = fVar2.f10419b;
                    e eVar = new e(fVar2, bVar2);
                    p072n3.b bVar3 = (p072n3.b) dVar;
                    bVar3.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    parcelObtain.writeString(str);
                    int i3 = a.f10540a;
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeStrongBinder(eVar);
                    try {
                        bVar3.f10541a.transact(2, parcelObtain, null, 1);
                        return;
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (RemoteException e6) {
                    f fVar3 = (f) this.f10413k;
                    C0308a c0308a = f.f10417c;
                    Object[] objArr = {fVar3.f10419b};
                    c0308a.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        C0308a.e(c0308a.i, "error requesting in-app review for %s", objArr);
                    }
                    ((b) this.f10412j).a(new RuntimeException(e6));
                    return;
                }
            default:
                int i6 = c.f10542b;
                IBinder iBinder = (IBinder) this.f10412j;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    bVar = iInterfaceQueryLocalInterface instanceof p072n3.d ? (p072n3.d) iInterfaceQueryLocalInterface : new p072n3.b(iBinder);
                }
                i iVar = (i) ((w) this.f10413k).f4539b;
                iVar.f10560m = bVar;
                C0308a c0308a2 = iVar.f10550b;
                c0308a2.c("linkToDeath", new Object[0]);
                try {
                    ((p072n3.b) iVar.f10560m).f10541a.linkToDeath(iVar.f10557j, 0);
                    break;
                } catch (RemoteException unused) {
                    Object[] objArr2 = new Object[0];
                    c0308a2.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        C0308a.e(c0308a2.i, "linkToDeath failed", objArr2);
                    }
                }
                iVar.f10555g = false;
                ArrayList arrayList = iVar.f10552d;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((Runnable) obj).run();
                }
                iVar.f10552d.clear();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, b bVar, b bVar2) {
        super(bVar);
        this.f10412j = bVar2;
        this.f10413k = fVar;
    }
}

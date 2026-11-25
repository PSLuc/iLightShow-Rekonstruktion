package p029f;

import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import g.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p012c.l;
import p020d2.n;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0599v0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8824k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f8825l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f8826m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n f8827n;

    public /* synthetic */ g(l lVar, String str, n nVar, int i) {
        this.f8824k = i;
        this.f8825l = lVar;
        this.f8826m = str;
        this.f8827n = nVar;
    }

    public final void R(Object obj) throws Exception {
        switch (this.f8824k) {
            case 0:
                l lVar = this.f8825l;
                LinkedHashMap linkedHashMap = lVar.f7147b;
                String str = this.f8826m;
                Object obj2 = linkedHashMap.get(str);
                a aVar = (a) this.f8827n;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue = ((Number) obj2).intValue();
                ArrayList arrayList = lVar.f7149d;
                arrayList.add(str);
                try {
                    lVar.b(iIntValue, aVar, obj);
                    return;
                } catch (Exception e6) {
                    arrayList.remove(str);
                    throw e6;
                }
            default:
                l lVar2 = this.f8825l;
                LinkedHashMap linkedHashMap2 = lVar2.f7147b;
                String str2 = this.f8826m;
                Object obj3 = linkedHashMap2.get(str2);
                a aVar2 = (a) this.f8827n;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue2 = ((Number) obj3).intValue();
                ArrayList arrayList2 = lVar2.f7149d;
                arrayList2.add(str2);
                try {
                    lVar2.b(iIntValue2, aVar2, obj);
                    return;
                } catch (Exception e7) {
                    arrayList2.remove(str2);
                    throw e7;
                }
        }
    }
}

package p129y;

import B.C0024m;
import G0.p;
import G4.a;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import p030f0.d;
import p084p4.x;
import p119w1.n;
import p119w1.o;
import p122w4.c;
import p124x0.AbstractC1098f;
import p124x0.InterfaceC1104l;
import p124x0.Y;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static o a(Context context) {
        ProviderInfo providerInfo;
        p pVar;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        a.n("Package manager required to locate emoji font provider", packageManager);
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            pVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                pVar = new p(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e6) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e6);
                pVar = null;
            }
        }
        if (pVar == null) {
            return null;
        }
        return new o(new n(context, pVar));
    }

    public static final Object b(InterfaceC1104l interfaceC1104l, d dVar, c cVar) {
        a aVar;
        Object objM;
        boolean z5 = ((Z.n) interfaceC1104l).f5958h.f5969t;
        x xVar = x.f10867a;
        if (z5) {
            Y yR = AbstractC1098f.r(interfaceC1104l);
            if (((Z.n) interfaceC1104l).f5958h.f5969t) {
                a jVar = (a) AbstractC1098f.i(interfaceC1104l, i.f14171w);
                if (jVar == null) {
                    jVar = new j(interfaceC1104l);
                }
                aVar = jVar;
            } else {
                aVar = null;
            }
            if (aVar != null && (objM = aVar.M(yR, new C0024m(dVar, 17, yR), cVar)) == v4.a.f13292h) {
                return objM;
            }
        }
        return xVar;
    }
}

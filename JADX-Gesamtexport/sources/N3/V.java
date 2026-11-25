package N3;

import O1.C0310c;
import O1.C0312e;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.AbstractC0594t;
import com.nanjoran.ilightshow.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class V implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4131h;
    public final /* synthetic */ Context i;

    public /* synthetic */ V(Context context, int i) {
        this.f4131h = i;
        this.i = context;
    }

    @Override // D4.a
    public final Object invoke() throws Throwable {
        switch (this.f4131h) {
            case 0:
                Context context = this.i;
                E4.k.f("$context", context);
                new N.P(2).a().u(context, Uri.parse("https://ilightshow.net/img/rock-demo.mp4"));
                return p084p4.x.f10867a;
            case 1:
                Context context2 = this.i;
                E4.k.f("$context", context2);
                new N.P(2).a().u(context2, Uri.parse("https://ilightshow.net/img/edm-demo.mp4"));
                return p084p4.x.f10867a;
            case 2:
                Context context3 = this.i;
                E4.k.f("$context", context3);
                com.nanjoran.ilightshow.Services.C0.i.d(false);
                context3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(com.nanjoran.ilightshow.Services.C0.f8237m)));
                return p084p4.x.f10867a;
            case 3:
                Context context4 = this.i;
                E4.k.f("$context", context4);
                com.nanjoran.ilightshow.Services.E0 e6 = com.nanjoran.ilightshow.Services.E0.f8249o;
                Activity activity = context4 instanceof Activity ? (Activity) context4 : null;
                if (activity != null) {
                    e6.getClass();
                    D.x xVar = new D.x(12, false);
                    O1.i iVar = e6.f8250h;
                    if (iVar != null) {
                        xVar.i = iVar;
                        if (iVar.a() != null) {
                            iVar.a().getClass();
                            String str = iVar.a().f4497b;
                            if (str != null) {
                                xVar.f707j = str;
                            }
                        }
                        if (((O1.i) xVar.i) == null) {
                            throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
                        }
                        ArrayList arrayList = new ArrayList(com.fasterxml.jackson.databind.deser.std.d0.v(new C0312e(xVar)));
                        boolean zIsEmpty = arrayList.isEmpty();
                        if (zIsEmpty) {
                            throw new IllegalArgumentException("Details of the products must be provided.");
                        }
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            if (((C0312e) obj) == null) {
                                throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                            }
                        }
                        N.P p6 = new N.P();
                        p6.f3646a = (zIsEmpty || ((C0312e) arrayList.get(0)).f4488a.f4502b.optString("packageName").isEmpty()) ? false : true;
                        boolean z5 = (TextUtils.isEmpty(null) && TextUtils.isEmpty(null)) ? false : true;
                        boolean zIsEmpty2 = TextUtils.isEmpty(null);
                        if (z5 && !zIsEmpty2) {
                            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                        }
                        p6.f3648c = new Z2.f(8, false);
                        p6.f3647b = new ArrayList();
                        p6.f3649d = AbstractC0594t.n(arrayList);
                        C0310c c0310c = e6.f8251j;
                        if (c0310c != null) {
                            c0310c.b(activity, p6);
                        }
                    }
                }
                return p084p4.x.f10867a;
            case 4:
                Context context5 = this.i;
                E4.k.f("$context", context5);
                context5.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.nanjoran.ilightshow")));
                return p084p4.x.f10867a;
            case 5:
                Context context6 = this.i;
                E4.k.f("$context", context6);
                Object systemService = context6.getSystemService("clipboard");
                E4.k.d("null cannot be cast to non-null type android.content.ClipboardManager", systemService);
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(context6.getString(R.string.settings_device_id_clip_label), Settings.Secure.getString(context6.getContentResolver(), "android_id")));
                return p084p4.x.f10867a;
            case 6:
                Context context7 = this.i;
                E4.k.f("$context", context7);
                new N.P(2).a().u(context7, Uri.parse("https://ilightshow.net/help"));
                return p084p4.x.f10867a;
            default:
                Context context8 = this.i;
                E4.k.f("$context", context8);
                new N.P(2).a().u(context8, Uri.parse("https://ilightshow.net/privacy-policy"));
                return p084p4.x.f10867a;
        }
    }
}

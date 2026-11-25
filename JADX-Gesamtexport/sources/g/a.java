package g;

import B.C0025m0;
import E4.k;
import android.content.Context;
import android.content.Intent;
import com.fasterxml.jackson.databind.deser.std.d0;
import p020d2.n;
import p029f.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f9007k;

    public /* synthetic */ a(int i) {
        this.f9007k = i;
    }

    @Override // p020d2.n
    public final Object F(int i, Intent intent) {
        switch (this.f9007k) {
            case 0:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z5 = false;
                if (intArrayExtra != null) {
                    for (int i3 : intArrayExtra) {
                        if (i3 == 0) {
                            z5 = true;
                        }
                    }
                }
                return Boolean.valueOf(z5);
            default:
                return new p029f.a(i, intent);
        }
    }

    @Override // p020d2.n
    public final Intent m(Context context, Object obj) {
        switch (this.f9007k) {
            case 0:
                k.f("context", context);
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{(String) obj});
                k.e("Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)", intentPutExtra);
                return intentPutExtra;
            default:
                k.f("context", context);
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", (i) obj);
                k.e("Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)", intentPutExtra2);
                return intentPutExtra2;
        }
    }

    @Override // p020d2.n
    public C0025m0 z(Context context, Object obj) {
        switch (this.f9007k) {
            case 0:
                k.f("context", context);
                if (d0.j(context, (String) obj) != 0) {
                    return null;
                }
                return new C0025m0(29, Boolean.TRUE);
            default:
                return super.z(context, obj);
        }
    }
}

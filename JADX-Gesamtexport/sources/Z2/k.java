package Z2;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes.dex */
public final class k implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f6037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6038c;

    public /* synthetic */ k(Intent intent, Object obj, int i) {
        this.f6036a = i;
        this.f6037b = intent;
        this.f6038c = obj;
    }

    public final void a() {
        switch (this.f6036a) {
            case 0:
                Intent intent = this.f6037b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f6038c).startActivityForResult(intent, 2);
                }
                break;
            default:
                Intent intent2 = this.f6037b;
                if (intent2 != null) {
                    ((Y2.s) this.f6038c).startActivityForResult(intent2, 2);
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException unused) {
                Build.FINGERPRINT.contains("generic");
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}

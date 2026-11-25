package p130y0;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14302a;

    public T(Context context) {
        this.f14302a = context;
    }

    public final void a(String str) {
        try {
            this.f14302a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e6) {
            throw new IllegalArgumentException("Can't open " + str + '.', e6);
        }
    }
}

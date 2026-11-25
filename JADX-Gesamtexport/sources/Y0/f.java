package Y0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f5789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f5790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f5794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PendingIntent f5795g;

    public f(String str, PendingIntent pendingIntent) {
        IconCompat iconCompatA = IconCompat.a(2131165286);
        Bundle bundle = new Bundle();
        this.f5792d = true;
        this.f5790b = iconCompatA;
        int i = iconCompatA.f6751a;
        if ((i == -1 ? p014c1.d.c(iconCompatA.f6752b) : i) == 2) {
            this.f5793e = iconCompatA.b();
        }
        this.f5794f = h.b(str);
        this.f5795g = pendingIntent;
        this.f5789a = bundle;
        this.f5791c = true;
        this.f5792d = true;
    }
}

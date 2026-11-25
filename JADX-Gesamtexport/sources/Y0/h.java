package Y0;

import D.x;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5796a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f5800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f5801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PendingIntent f5802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5803h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x f5804j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bundle f5806l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f5807m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f5808n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Notification f5809o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f5810p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5797b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f5798c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f5799d = new ArrayList();
    public final boolean i = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5805k = false;

    public h(Context context, String str) {
        Notification notification = new Notification();
        this.f5809o = notification;
        this.f5796a = context;
        this.f5807m = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f5803h = 0;
        this.f5810p = new ArrayList();
        this.f5808n = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Bundle bundle;
        int i;
        int i3;
        new ArrayList();
        Bundle bundle2 = new Bundle();
        Notification.Builder builderA = m.a(this.f5796a, this.f5807m);
        Notification notification = this.f5809o;
        int i6 = 0;
        builderA.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.f5800e).setContentText(this.f5801f).setContentInfo(null).setContentIntent(this.f5802g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        k.b(builderA, null);
        builderA.setSubText(null).setUsesChronometer(false).setPriority(this.f5803h);
        ArrayList arrayList = this.f5797b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            f fVar = (f) obj;
            if (fVar.f5790b == null && (i3 = fVar.f5793e) != 0) {
                fVar.f5790b = IconCompat.a(i3);
            }
            IconCompat iconCompat = fVar.f5790b;
            Notification.Action.Builder builderA2 = k.a(iconCompat != null ? p014c1.b.c(iconCompat, null) : null, fVar.f5794f, fVar.f5795g);
            Bundle bundle3 = fVar.f5789a;
            Bundle bundle4 = bundle3 != null ? new Bundle(bundle3) : new Bundle();
            boolean z5 = fVar.f5791c;
            bundle4.putBoolean("android.support.allowGeneratedReplies", z5);
            int i8 = Build.VERSION.SDK_INT;
            l.a(builderA2, z5);
            bundle4.putInt("android.support.action.semanticAction", 0);
            n.b(builderA2, 0);
            o.c(builderA2, false);
            if (i8 >= 31) {
                p.a(builderA2, false);
            }
            bundle4.putBoolean("android.support.action.showsUserInterface", fVar.f5792d);
            i.b(builderA2, bundle4);
            i.a(builderA, i.d(builderA2));
        }
        Bundle bundle5 = this.f5806l;
        if (bundle5 != null) {
            bundle2.putAll(bundle5);
        }
        builderA.setShowWhen(this.i);
        i.i(builderA, this.f5805k);
        i.g(builderA, null);
        i.j(builderA, null);
        i.h(builderA, false);
        j.b(builderA, null);
        j.c(builderA, 0);
        j.f(builderA, 0);
        j.d(builderA, null);
        j.e(builderA, notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = this.f5810p;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size2 = arrayList2.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj2 = arrayList2.get(i9);
                i9++;
                j.a(builderA, (String) obj2);
            }
        }
        ArrayList arrayList3 = this.f5799d;
        if (arrayList3.size() > 0) {
            if (this.f5806l == null) {
                this.f5806l = new Bundle();
            }
            Bundle bundle6 = this.f5806l.getBundle("android.car.EXTENSIONS");
            if (bundle6 == null) {
                bundle6 = new Bundle();
            }
            Bundle bundle7 = new Bundle(bundle6);
            Bundle bundle8 = new Bundle();
            int i10 = 0;
            while (i10 < arrayList3.size()) {
                String string = Integer.toString(i10);
                f fVar2 = (f) arrayList3.get(i10);
                Bundle bundle9 = new Bundle();
                if (fVar2.f5790b == null && (i = fVar2.f5793e) != 0) {
                    fVar2.f5790b = IconCompat.a(i);
                }
                IconCompat iconCompat2 = fVar2.f5790b;
                bundle9.putInt("icon", iconCompat2 != null ? iconCompat2.b() : i6);
                bundle9.putCharSequence("title", fVar2.f5794f);
                bundle9.putParcelable("actionIntent", fVar2.f5795g);
                Bundle bundle10 = fVar2.f5789a;
                Bundle bundle11 = bundle10 != null ? new Bundle(bundle10) : new Bundle();
                bundle11.putBoolean("android.support.allowGeneratedReplies", fVar2.f5791c);
                bundle9.putBundle("extras", bundle11);
                bundle9.putParcelableArray("remoteInputs", null);
                bundle9.putBoolean("showsUserInterface", fVar2.f5792d);
                bundle9.putInt("semanticAction", 0);
                bundle8.putBundle(string, bundle9);
                i10++;
                i6 = 0;
            }
            bundle6.putBundle("invisible_actions", bundle8);
            bundle7.putBundle("invisible_actions", bundle8);
            if (this.f5806l == null) {
                this.f5806l = new Bundle();
            }
            this.f5806l.putBundle("android.car.EXTENSIONS", bundle6);
            bundle2.putBundle("android.car.EXTENSIONS", bundle7);
        }
        builderA.setExtras(this.f5806l);
        l.e(builderA, null);
        m.b(builderA, 0);
        m.e(builderA, null);
        m.f(builderA, null);
        m.g(builderA, 0L);
        m.d(builderA, 0);
        if (!TextUtils.isEmpty(this.f5807m)) {
            builderA.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator it = this.f5798c.iterator();
        if (it.hasNext()) {
            throw p138z3.b.a(it);
        }
        o.a(builderA, this.f5808n);
        o.b(builderA, null);
        x xVar = this.f5804j;
        if (xVar != null) {
            new Notification.BigTextStyle(builderA).setBigContentTitle(null).bigText((CharSequence) xVar.f707j);
        }
        Notification notificationBuild = builderA.build();
        if (xVar != null) {
            this.f5804j.getClass();
        }
        if (xVar != null && (bundle = notificationBuild.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        return notificationBuild;
    }

    public final void c(int i) {
        Notification notification = this.f5809o;
        notification.flags = i | notification.flags;
    }

    public final void d(x xVar) {
        if (this.f5804j != xVar) {
            this.f5804j = xVar;
            if (((h) xVar.i) != this) {
                xVar.i = this;
                d(xVar);
            }
        }
    }
}

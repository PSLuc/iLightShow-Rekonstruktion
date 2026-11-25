package p057l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final class L0 implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Toolbar f9993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f9995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f9996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f9997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f9998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f10000h;
    public CharSequence i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f10001j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Window.Callback f10002k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10003l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f10004m;

    public final void a(int i) {
        View view;
        int i3 = this.f9994b ^ i;
        this.f9994b = i;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i & 4) != 0) {
                    b();
                }
                int i6 = this.f9994b & 4;
                Toolbar toolbar = this.f9993a;
                if (i6 != 0) {
                    Drawable drawable = this.f9998f;
                    if (drawable == null) {
                        drawable = this.f10004m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i3 & 3) != 0) {
                c();
            }
            int i7 = i3 & 8;
            Toolbar toolbar2 = this.f9993a;
            if (i7 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.f10000h);
                    toolbar2.setSubtitle(this.i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.f9995c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f9994b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f10001j);
            Toolbar toolbar = this.f9993a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f10003l);
            } else {
                toolbar.setNavigationContentDescription(this.f10001j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i = this.f9994b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f9997e) == null) {
            drawable = this.f9996d;
        }
        this.f9993a.setLogo(drawable);
    }
}

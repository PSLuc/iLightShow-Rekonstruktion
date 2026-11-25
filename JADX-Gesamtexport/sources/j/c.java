package j;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import p012c.k;
import p045i1.AbstractC0746g;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f9622A;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ d f9625D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Menu f9626a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9633h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9634j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f9635k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f9636l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9637m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char f9638n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9639o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char f9640p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9641q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9642r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f9643s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f9644t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f9645u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f9646v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9647w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f9648x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f9649y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f9650z;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ColorStateList f9623B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public PorterDuff.Mode f9624C = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9627b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9628c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9629d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9630e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9631f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9632g = true;

    public c(d dVar, Menu menu) {
        this.f9625D = dVar;
        this.f9626a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f9625D.f9655c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z5 = false;
        menuItem.setChecked(this.f9643s).setVisible(this.f9644t).setEnabled(this.f9645u).setCheckable(this.f9642r >= 1).setTitleCondensed(this.f9636l).setIcon(this.f9637m);
        int i = this.f9646v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f9649y;
        d dVar = this.f9625D;
        if (str != null) {
            if (dVar.f9655c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (dVar.f9656d == null) {
                dVar.f9656d = d.a(dVar.f9655c);
            }
            Object obj = dVar.f9656d;
            String str2 = this.f9649y;
            b bVar = new b();
            bVar.f9620a = obj;
            Class<?> cls = obj.getClass();
            try {
                bVar.f9621b = cls.getMethod(str2, b.f9619c);
                menuItem.setOnMenuItemClickListener(bVar);
            } catch (Exception e6) {
                StringBuilder sbW = k.w("Couldn't resolve menu item onClick handler ", str2, " in class ");
                sbW.append(cls.getName());
                InflateException inflateException = new InflateException(sbW.toString());
                inflateException.initCause(e6);
                throw inflateException;
            }
        }
        if (this.f9642r >= 2 && (menuItem instanceof p052k.k)) {
            p052k.k kVar = (p052k.k) menuItem;
            kVar.f9891x = (kVar.f9891x & (-5)) | 4;
        }
        String str3 = this.f9648x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, d.f9651e, dVar.f9653a));
            z5 = true;
        }
        int i3 = this.f9647w;
        if (i3 > 0 && !z5) {
            menuItem.setActionView(i3);
        }
        CharSequence charSequence = this.f9650z;
        boolean z6 = menuItem instanceof p052k.k;
        if (z6) {
            ((p052k.k) menuItem).c(charSequence);
        } else {
            AbstractC0746g.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f9622A;
        if (z6) {
            ((p052k.k) menuItem).e(charSequence2);
        } else {
            AbstractC0746g.m(menuItem, charSequence2);
        }
        char c6 = this.f9638n;
        int i6 = this.f9639o;
        if (z6) {
            ((p052k.k) menuItem).setAlphabeticShortcut(c6, i6);
        } else {
            AbstractC0746g.g(menuItem, c6, i6);
        }
        char c7 = this.f9640p;
        int i7 = this.f9641q;
        if (z6) {
            ((p052k.k) menuItem).setNumericShortcut(c7, i7);
        } else {
            AbstractC0746g.k(menuItem, c7, i7);
        }
        PorterDuff.Mode mode = this.f9624C;
        if (mode != null) {
            if (z6) {
                ((p052k.k) menuItem).setIconTintMode(mode);
            } else {
                AbstractC0746g.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f9623B;
        if (colorStateList != null) {
            if (z6) {
                ((p052k.k) menuItem).setIconTintList(colorStateList);
            } else {
                AbstractC0746g.i(menuItem, colorStateList);
            }
        }
    }
}

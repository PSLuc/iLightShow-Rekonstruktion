package p052k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import p014c1.a;
import p015c2.AbstractC0473d;

/* JADX INFO: loaded from: classes.dex */
public final class k implements MenuItem {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f9867A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f9873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f9874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f9875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f9876h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f9877j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f9879l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f9881n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u f9882o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f9883p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f9884q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f9885r;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f9893z;
    public int i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9878k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9880m = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f9886s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f9887t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f9888u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9889v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9890w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9891x = 16;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f9868B = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f9892y = 0;

    public k(j jVar, int i, int i3, int i6, int i7, CharSequence charSequence) {
        this.f9881n = jVar;
        this.f9869a = i3;
        this.f9870b = i;
        this.f9871c = i6;
        this.f9872d = i7;
        this.f9873e = charSequence;
    }

    public static void a(StringBuilder sb, int i, int i3, String str) {
        if ((i & i3) == i3) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f9890w && (this.f9888u || this.f9889v)) {
            drawable = drawable.mutate();
            if (this.f9888u) {
                a.h(drawable, this.f9886s);
            }
            if (this.f9889v) {
                a.i(drawable, this.f9887t);
            }
            this.f9890w = false;
        }
        return drawable;
    }

    public final k c(CharSequence charSequence) {
        this.f9884q = charSequence;
        this.f9881n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f9892y & 8) == 0) {
            return false;
        }
        if (this.f9893z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f9867A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f9881n.d(this);
        }
        return false;
    }

    public final void d(boolean z5) {
        if (z5) {
            this.f9891x |= 32;
        } else {
            this.f9891x &= -33;
        }
    }

    public final k e(CharSequence charSequence) {
        this.f9885r = charSequence;
        this.f9881n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        MenuItem.OnActionExpandListener onActionExpandListener;
        if ((((this.f9892y & 8) == 0 || this.f9893z == null) ? false : true) && ((onActionExpandListener = this.f9867A) == null || onActionExpandListener.onMenuItemActionExpand(this))) {
            return this.f9881n.f(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f9893z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f9878k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f9877j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f9884q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f9870b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f9879l;
        if (drawable != null) {
            return b(drawable);
        }
        int i = this.f9880m;
        if (i == 0) {
            return null;
        }
        Drawable drawableZ = AbstractC0473d.z(this.f9881n.f9848a, i);
        this.f9880m = 0;
        this.f9879l = drawableZ;
        return b(drawableZ);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f9886s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f9887t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f9875g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f9869a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f9876h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f9871c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f9882o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f9873e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f9874f;
        return charSequence != null ? charSequence : this.f9873e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f9885r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f9882o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f9868B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f9891x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f9891x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f9891x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f9891x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f9893z = view;
        if (view != null && view.getId() == -1 && (i = this.f9869a) > 0) {
            view.setId(i);
        }
        j jVar = this.f9881n;
        jVar.f9857k = true;
        jVar.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6) {
        if (this.f9877j == c6) {
            return this;
        }
        this.f9877j = Character.toLowerCase(c6);
        this.f9881n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z5) {
        int i = this.f9891x;
        int i3 = (z5 ? 1 : 0) | (i & (-2));
        this.f9891x = i3;
        if (i != i3) {
            this.f9881n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z5) {
        int i = this.f9891x;
        if ((i & 4) == 0) {
            int i3 = (i & (-3)) | (z5 ? 2 : 0);
            this.f9891x = i3;
            if (i != i3) {
                this.f9881n.o(false);
            }
            return this;
        }
        j jVar = this.f9881n;
        jVar.getClass();
        ArrayList arrayList = jVar.f9853f;
        int size = arrayList.size();
        jVar.s();
        for (int i6 = 0; i6 < size; i6++) {
            k kVar = (k) arrayList.get(i6);
            if (kVar.f9870b == this.f9870b && (kVar.f9891x & 4) != 0 && kVar.isCheckable()) {
                boolean z6 = kVar == this;
                int i7 = kVar.f9891x;
                int i8 = (z6 ? 2 : 0) | (i7 & (-3));
                kVar.f9891x = i8;
                if (i7 != i8) {
                    kVar.f9881n.o(false);
                }
            }
        }
        jVar.r();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        c(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z5) {
        if (z5) {
            this.f9891x |= 16;
        } else {
            this.f9891x &= -17;
        }
        this.f9881n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f9880m = 0;
        this.f9879l = drawable;
        this.f9890w = true;
        this.f9881n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f9886s = colorStateList;
        this.f9888u = true;
        this.f9890w = true;
        this.f9881n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f9887t = mode;
        this.f9889v = true;
        this.f9890w = true;
        this.f9881n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f9875g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6) {
        if (this.f9876h == c6) {
            return this;
        }
        this.f9876h = c6;
        this.f9881n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f9867A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f9883p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c7) {
        this.f9876h = c6;
        this.f9877j = Character.toLowerCase(c7);
        this.f9881n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i3 = i & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f9892y = i;
        j jVar = this.f9881n;
        jVar.f9857k = true;
        jVar.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f9873e = charSequence;
        this.f9881n.o(false);
        u uVar = this.f9882o;
        if (uVar != null) {
            uVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f9874f = charSequence;
        this.f9881n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z5) {
        int i = this.f9891x;
        int i3 = (z5 ? 0 : 8) | (i & (-9));
        this.f9891x = i3;
        if (i != i3) {
            j jVar = this.f9881n;
            jVar.f9855h = true;
            jVar.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f9873e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6, int i) {
        if (this.f9877j == c6 && this.f9878k == i) {
            return this;
        }
        this.f9877j = Character.toLowerCase(c6);
        this.f9878k = KeyEvent.normalizeMetaState(i);
        this.f9881n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6, int i) {
        if (this.f9876h == c6 && this.i == i) {
            return this;
        }
        this.f9876h = c6;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f9881n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c7, int i, int i3) {
        this.f9876h = c6;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f9877j = Character.toLowerCase(c7);
        this.f9878k = KeyEvent.normalizeMetaState(i3);
        this.f9881n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f9879l = null;
        this.f9880m = i;
        this.f9890w = true;
        this.f9881n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f9881n.f9848a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i3;
        Context context = this.f9881n.f9848a;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f9893z = viewInflate;
        if (viewInflate != null && viewInflate.getId() == -1 && (i3 = this.f9869a) > 0) {
            viewInflate.setId(i3);
        }
        j jVar = this.f9881n;
        jVar.f9857k = true;
        jVar.o(true);
        return this;
    }
}

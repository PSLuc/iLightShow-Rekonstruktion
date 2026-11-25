package p052k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class u extends j implements SubMenu {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j f9924v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k f9925w;

    public u(Context context, j jVar, k kVar) {
        super(context);
        this.f9924v = jVar;
        this.f9925w = kVar;
    }

    @Override // p052k.j
    public final boolean d(k kVar) {
        return this.f9924v.d(kVar);
    }

    @Override // p052k.j
    public final boolean e(j jVar, MenuItem menuItem) {
        super.e(jVar, menuItem);
        return this.f9924v.e(jVar, menuItem);
    }

    @Override // p052k.j
    public final boolean f(k kVar) {
        return this.f9924v.f(kVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f9925w;
    }

    @Override // p052k.j
    public final j j() {
        return this.f9924v.j();
    }

    @Override // p052k.j
    public final boolean l() {
        return this.f9924v.l();
    }

    @Override // p052k.j
    public final boolean m() {
        return this.f9924v.m();
    }

    @Override // p052k.j
    public final boolean n() {
        return this.f9924v.n();
    }

    @Override // p052k.j, android.view.Menu
    public final void setGroupDividerEnabled(boolean z5) {
        this.f9924v.setGroupDividerEnabled(z5);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        q(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        q(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f9925w.setIcon(drawable);
        return this;
    }

    @Override // p052k.j, android.view.Menu
    public final void setQwertyMode(boolean z5) {
        this.f9924v.setQwertyMode(z5);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        q(0, null, i, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        q(i, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f9925w.setIcon(i);
        return this;
    }
}

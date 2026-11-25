package p052k;

import Z0.a;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActionMenuView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p035g0.C0715p;
import p045i1.C;
import p057l.E0;
import p057l.InterfaceC0799l;
import p138z3.b;

/* JADX INFO: loaded from: classes.dex */
public class j implements Menu {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int[] f9847u = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f9849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0715p f9852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f9853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f9854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9855h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f9856j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9857k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f9858l;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k f9865s;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9859m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9860n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f9861o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f9862p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f9863q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f9864r = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f9866t = false;

    public j(Context context) {
        boolean z5 = false;
        this.f9848a = context;
        Resources resources = context.getResources();
        this.f9849b = resources;
        this.f9853f = new ArrayList();
        this.f9854g = new ArrayList();
        this.f9855h = true;
        this.i = new ArrayList();
        this.f9856j = new ArrayList();
        this.f9857k = true;
        if (resources.getConfiguration().keyboard != 1 && C.b(ViewConfiguration.get(context))) {
            z5 = true;
        }
        this.f9851d = z5;
    }

    public final k a(int i, int i3, int i6, CharSequence charSequence) {
        int i7;
        int i8 = ((-65536) & i6) >> 16;
        if (i8 < 0 || i8 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i9 = (f9847u[i8] << 16) | (65535 & i6);
        k kVar = new k(this, i, i3, i6, i9, charSequence);
        ArrayList arrayList = this.f9853f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((k) arrayList.get(size)).f9872d <= i9) {
                i7 = size + 1;
                arrayList.add(i7, kVar);
                o(true);
                return kVar;
            }
        }
        i7 = 0;
        arrayList.add(i7, kVar);
        o(true);
        return kVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i3, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        int i8;
        PackageManager packageManager = this.f9848a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i7 & 1) == 0) {
            removeGroup(i);
        }
        for (int i9 = 0; i9 < size; i9++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i9);
            int i10 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i10 < 0 ? intent : intentArr[i10]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            k kVarA = a(i, i3, i6, resolveInfo.loadLabel(packageManager));
            kVarA.setIcon(resolveInfo.loadIcon(packageManager));
            kVarA.f9875g = intent2;
            if (menuItemArr != null && (i8 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i8] = kVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(q qVar, Context context) {
        this.f9864r.add(new WeakReference(qVar));
        qVar.i(context, this);
        this.f9857k = true;
    }

    public final void c(boolean z5) {
        if (this.f9862p) {
            return;
        }
        this.f9862p = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f9864r;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            q qVar = (q) weakReference.get();
            if (qVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                qVar.c(this, z5);
            }
        }
        this.f9862p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        k kVar = this.f9865s;
        if (kVar != null) {
            d(kVar);
        }
        this.f9853f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f9858l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(k kVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f9864r;
        boolean zE = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f9865s == kVar) {
            s();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                q qVar = (q) weakReference.get();
                if (qVar != null) {
                    zE = qVar.e(kVar);
                    if (zE) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            r();
            if (zE) {
                this.f9865s = null;
            }
        }
        return zE;
    }

    public boolean e(j jVar, MenuItem menuItem) {
        InterfaceC0799l interfaceC0799l;
        C0715p c0715p = this.f9852e;
        if (c0715p == null || (interfaceC0799l = ((ActionMenuView) c0715p.i).f6454F) == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((E0) interfaceC0799l).f9978a.f6518N.i).iterator();
        if (it.hasNext()) {
            throw b.a(it);
        }
        return false;
    }

    public boolean f(k kVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f9864r;
        boolean zA = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            q qVar = (q) weakReference.get();
            if (qVar != null) {
                zA = qVar.a(kVar);
                if (zA) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        r();
        if (zA) {
            this.f9865s = kVar;
        }
        return zA;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f9853f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            k kVar = (k) arrayList.get(i3);
            if (kVar.f9869a == i) {
                return kVar;
            }
            if (kVar.hasSubMenu() && (menuItemFindItem = kVar.f9882o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final k g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f9863q;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (k) arrayList.get(0);
        }
        boolean zM = m();
        for (int i3 = 0; i3 < size; i3++) {
            k kVar = (k) arrayList.get(i3);
            char c6 = zM ? kVar.f9877j : kVar.f9876h;
            char[] cArr = keyData.meta;
            if ((c6 == cArr[0] && (metaState & 2) == 0) || ((c6 == cArr[2] && (metaState & 2) != 0) || (zM && c6 == '\b' && i == 67))) {
                return kVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f9853f.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        boolean zM = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f9853f;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                k kVar = (k) arrayList2.get(i3);
                if (kVar.hasSubMenu()) {
                    kVar.f9882o.h(arrayList, i, keyEvent);
                }
                char c6 = zM ? kVar.f9877j : kVar.f9876h;
                if ((modifiers & 69647) == ((zM ? kVar.f9878k : kVar.i) & 69647) && c6 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c6 == cArr[0] || c6 == cArr[2] || (zM && c6 == '\b' && i == 67)) && kVar.isEnabled()) {
                        arrayList.add(kVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f9853f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((k) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListK = k();
        if (this.f9857k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f9864r;
            boolean zJ = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                q qVar = (q) weakReference.get();
                if (qVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zJ |= qVar.j();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.f9856j;
            if (zJ) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListK.size();
                for (int i = 0; i < size; i++) {
                    k kVar = (k) arrayListK.get(i);
                    if ((kVar.f9891x & 32) == 32) {
                        arrayList.add(kVar);
                    } else {
                        arrayList2.add(kVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(k());
            }
            this.f9857k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public j j() {
        return this;
    }

    public final ArrayList k() {
        boolean z5 = this.f9855h;
        ArrayList arrayList = this.f9854g;
        if (!z5) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f9853f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            k kVar = (k) arrayList2.get(i);
            if (kVar.isVisible()) {
                arrayList.add(kVar);
            }
        }
        this.f9855h = false;
        this.f9857k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f9866t;
    }

    public boolean m() {
        return this.f9850c;
    }

    public boolean n() {
        return this.f9851d;
    }

    public final void o(boolean z5) {
        if (this.f9859m) {
            this.f9860n = true;
            if (z5) {
                this.f9861o = true;
                return;
            }
            return;
        }
        if (z5) {
            this.f9855h = true;
            this.f9857k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f9864r;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            q qVar = (q) weakReference.get();
            if (qVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                qVar.f();
            }
        }
        r();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    public final boolean p(MenuItem menuItem, l lVar, int i) {
        boolean zExpandActionView;
        k kVar = (k) menuItem;
        boolean zB = false;
        if (kVar == null || !kVar.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = kVar.f9883p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(kVar)) {
            j jVar = kVar.f9881n;
            if (jVar.e(jVar, kVar)) {
                zExpandActionView = true;
            } else {
                Intent intent = kVar.f9875g;
                if (intent != null) {
                    try {
                        jVar.f9848a.startActivity(intent);
                        zExpandActionView = true;
                    } catch (ActivityNotFoundException unused) {
                        zExpandActionView = false;
                    }
                }
                zExpandActionView = false;
            }
        } else {
            zExpandActionView = true;
        }
        if ((kVar.f9892y & 8) != 0 && kVar.f9893z != null) {
            zExpandActionView |= kVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (kVar.hasSubMenu()) {
            if ((i & 4) == 0) {
                c(false);
            }
            if (!kVar.hasSubMenu()) {
                u uVar = new u(this.f9848a, this, kVar);
                kVar.f9882o = uVar;
                uVar.setHeaderTitle(kVar.f9873e);
            }
            u uVar2 = kVar.f9882o;
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f9864r;
            if (!copyOnWriteArrayList.isEmpty()) {
                zB = lVar != null ? lVar.b(uVar2) : false;
                for (WeakReference weakReference : copyOnWriteArrayList) {
                    q qVar = (q) weakReference.get();
                    if (qVar == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zB) {
                        zB = qVar.b(uVar2);
                    }
                }
            }
            zExpandActionView |= zB;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i3) {
        return p(findItem(i), null, i3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i3) {
        k kVarG = g(i, keyEvent);
        boolean zP = kVarG != null ? p(kVarG, null, i3) : false;
        if ((i3 & 2) != 0) {
            c(true);
        }
        return zP;
    }

    public final void q(int i, CharSequence charSequence, int i3, View view) {
        if (view != null) {
            this.f9858l = null;
        } else {
            if (i > 0) {
                this.f9858l = this.f9849b.getText(i);
            } else if (charSequence != null) {
                this.f9858l = charSequence;
            }
            if (i3 > 0) {
                a.b(this.f9848a, i3);
            }
        }
        o(false);
    }

    public final void r() {
        this.f9859m = false;
        if (this.f9860n) {
            this.f9860n = false;
            o(this.f9861o);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f9853f;
        int size = arrayList.size();
        int i3 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            } else if (((k) arrayList.get(i6)).f9870b == i) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 >= 0) {
            int size2 = arrayList.size() - i6;
            while (true) {
                int i7 = i3 + 1;
                if (i3 >= size2 || ((k) arrayList.get(i6)).f9870b != i) {
                    break;
                }
                if (i6 >= 0) {
                    ArrayList arrayList2 = this.f9853f;
                    if (i6 < arrayList2.size()) {
                        arrayList2.remove(i6);
                    }
                }
                i3 = i7;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f9853f;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((k) arrayList.get(i3)).f9869a == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            ArrayList arrayList2 = this.f9853f;
            if (i3 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i3);
            o(true);
        }
    }

    public final void s() {
        if (this.f9859m) {
            return;
        }
        this.f9859m = true;
        this.f9860n = false;
        this.f9861o = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z5, boolean z6) {
        ArrayList arrayList = this.f9853f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            k kVar = (k) arrayList.get(i3);
            if (kVar.f9870b == i) {
                kVar.f9891x = (kVar.f9891x & (-5)) | (z6 ? 4 : 0);
                kVar.setCheckable(z5);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z5) {
        this.f9866t = z5;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z5) {
        ArrayList arrayList = this.f9853f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            k kVar = (k) arrayList.get(i3);
            if (kVar.f9870b == i) {
                kVar.setEnabled(z5);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z5) {
        ArrayList arrayList = this.f9853f;
        int size = arrayList.size();
        boolean z6 = false;
        for (int i3 = 0; i3 < size; i3++) {
            k kVar = (k) arrayList.get(i3);
            if (kVar.f9870b == i) {
                int i6 = kVar.f9891x;
                int i7 = (i6 & (-9)) | (z5 ? 0 : 8);
                kVar.f9891x = i7;
                if (i6 != i7) {
                    z6 = true;
                }
            }
        }
        if (z6) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z5) {
        this.f9850c = z5;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f9853f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f9849b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f9849b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i3, int i6, CharSequence charSequence) {
        return a(i, i3, i6, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i3, int i6, CharSequence charSequence) {
        k kVarA = a(i, i3, i6, charSequence);
        u uVar = new u(this.f9848a, this, kVarA);
        kVarA.f9882o = uVar;
        uVar.setHeaderTitle(kVarA.f9873e);
        return uVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i3, int i6, int i7) {
        return a(i, i3, i6, this.f9849b.getString(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i3, int i6, int i7) {
        return addSubMenu(i, i3, i6, this.f9849b.getString(i7));
    }
}

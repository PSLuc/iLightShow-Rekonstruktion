package p136z1;

import F.L;
import J1.e;
import J1.f;
import L2.o;
import V1.g;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.view.ContextMenu;
import android.view.View;
import androidx.lifecycle.C0460u;
import androidx.lifecycle.EnumC0454n;
import androidx.lifecycle.InterfaceC0449i;
import androidx.lifecycle.InterfaceC0458s;
import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import androidx.lifecycle.x;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p012c.k;
import p124x0.d0;

/* JADX INFO: loaded from: classes.dex */
public class d implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener, ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0458s, V, InterfaceC0449i, f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f14616q = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f14617h = UUID.randomUUID().toString();
    public final EnumC0454n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0460u f14618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final L f14619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f14620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f14621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f14622n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f14623o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14624p;

    public d() {
        new d0(3);
        this.i = EnumC0454n.f6994l;
        new x();
        new AtomicInteger();
        new ArrayList();
        this.f14618j = new C0460u(this);
        this.f14619k = new L(this);
        new o(12, this);
        new b(this);
        this.f14620l = new c(this);
        this.f14621m = true;
        this.f14622n = -1;
    }

    @Override // J1.f
    public final e b() {
        return (e) this.f14619k.f1107d;
    }

    @Override // androidx.lifecycle.InterfaceC0449i
    public final Q c() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.V
    public final U e() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.InterfaceC0458s
    public final C0460u f() {
        return this.f14618j;
    }

    public final d0 g() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void h() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View i() {
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        if (this.f14623o) {
            return;
        }
        if (d0.c(3)) {
            toString();
        }
        if (this.f14624p) {
            return;
        }
        this.f14624p = true;
        this.f14623o = true;
        if (this.f14622n >= 0) {
            d0 d0VarG = g();
            int i = this.f14622n;
            if (i < 0) {
                throw new IllegalArgumentException(k.r(i, "Bad id: "));
            }
            d0VarG.getClass();
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        a aVar = new a(g());
        f fVar = new f(3, this);
        aVar.f14610a.add(fVar);
        fVar.f14627c = 0;
        fVar.f14628d = 0;
        fVar.f14629e = 0;
        fVar.f14630f = 0;
        if (aVar.f14612c) {
            throw new IllegalStateException("commit already called");
        }
        if (d0.c(2)) {
            aVar.toString();
            PrintWriter printWriter = new PrintWriter(new g());
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(aVar.f14613d);
            printWriter.print(" mCommitted=");
            printWriter.println(aVar.f14612c);
            ArrayList arrayList = aVar.f14610a;
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    f fVar2 = (f) arrayList.get(i3);
                    switch (fVar2.f14625a) {
                        case 0:
                            str = "NULL";
                            break;
                        case 1:
                            str = "ADD";
                            break;
                        case 2:
                            str = "REPLACE";
                            break;
                        case 3:
                            str = "REMOVE";
                            break;
                        case 4:
                            str = "HIDE";
                            break;
                        case 5:
                            str = "SHOW";
                            break;
                        case 6:
                            str = "DETACH";
                            break;
                        case 7:
                            str = "ATTACH";
                            break;
                        case 8:
                            str = "SET_PRIMARY_NAV";
                            break;
                        case 9:
                            str = "UNSET_PRIMARY_NAV";
                            break;
                        case 10:
                            str = "OP_SET_MAX_LIFECYCLE";
                            break;
                        default:
                            str = "cmd=" + fVar2.f14625a;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(fVar2.f14626b);
                    if (fVar2.f14627c != 0 || fVar2.f14628d != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(fVar2.f14627c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(fVar2.f14628d));
                    }
                    if (fVar2.f14629e != 0 || fVar2.f14630f != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(fVar2.f14629e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(fVar2.f14630f));
                    }
                }
            }
            printWriter.close();
        }
        aVar.f14612c = true;
        d0 d0Var = aVar.f14611b;
        aVar.f14613d = -1;
        synchronized (((ArrayList) d0Var.f14007b)) {
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f14617h);
        sb.append(")");
        return sb.toString();
    }
}

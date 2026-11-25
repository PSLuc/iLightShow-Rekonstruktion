package W;

import B.C0031p0;
import B.C0043w;
import N.InterfaceC0250y0;
import N.U;
import X.q;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import p020d2.n;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0250y0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l f5515h;
    public i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f5516j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f5517k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object[] f5518l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0031p0 f5519m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0043w f5520n = new C0043w(25, this);

    public b(l lVar, i iVar, String str, Object obj, Object[] objArr) {
        this.f5515h = lVar;
        this.i = iVar;
        this.f5516j = str;
        this.f5517k = obj;
        this.f5518l = objArr;
    }

    @Override // N.InterfaceC0250y0
    public final void a() throws IllegalAccessException, IOException, InvocationTargetException {
        c();
    }

    @Override // N.InterfaceC0250y0
    public final void b() {
        C0031p0 c0031p0 = this.f5519m;
        if (c0031p0 != null) {
            c0031p0.y();
        }
    }

    public final void c() throws IllegalAccessException, IOException, InvocationTargetException {
        String strQ;
        i iVar = this.i;
        if (this.f5519m != null) {
            throw new IllegalArgumentException(("entry(" + this.f5519m + ") is not null").toString());
        }
        if (iVar != null) {
            C0043w c0043w = this.f5520n;
            Object objInvoke = c0043w.invoke();
            if (objInvoke == null || iVar.a(objInvoke)) {
                this.f5519m = iVar.c(this.f5516j, c0043w);
                return;
            }
            if (objInvoke instanceof q) {
                q qVar = (q) objInvoke;
                if (qVar.e() == U.f3670j || qVar.e() == U.f3673m || qVar.e() == U.f3671k) {
                    strQ = "MutableState containing " + qVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strQ = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strQ = n.q(objInvoke);
            }
            throw new IllegalArgumentException(strQ);
        }
    }

    @Override // N.InterfaceC0250y0
    public final void e() {
        C0031p0 c0031p0 = this.f5519m;
        if (c0031p0 != null) {
            c0031p0.y();
        }
    }
}

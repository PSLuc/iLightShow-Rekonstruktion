package p026e2;

import S1.V;
import com.fasterxml.jackson.databind.deser.std.d0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.io.Serializable;
import p006b.a;
import p009b2.l;
import p109u2.C0965d;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d0[] f8704m = new d0[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a[] f8705n = new a[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final V[] f8706o = new V[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AbstractC0599v0[] f8707p = new AbstractC0599v0[0];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final l[] f8708q = {new l()};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d0[] f8709h;
    public final l[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a[] f8710j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final V[] f8711k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AbstractC0599v0[] f8712l;

    public k(d0[] d0VarArr, l[] lVarArr, a[] aVarArr, V[] vArr, AbstractC0599v0[] abstractC0599v0Arr) {
        this.f8709h = d0VarArr == null ? f8704m : d0VarArr;
        this.i = lVarArr == null ? f8708q : lVarArr;
        this.f8710j = aVarArr == null ? f8705n : aVarArr;
        this.f8711k = vArr == null ? f8706o : vArr;
        this.f8712l = abstractC0599v0Arr == null ? f8707p : abstractC0599v0Arr;
    }

    public final C0965d a() {
        return new C0965d(this.f8710j);
    }

    public final C0965d b() {
        return new C0965d(this.f8709h);
    }

    public final boolean c() {
        return this.f8710j.length > 0;
    }
}

package p026e2;

import S1.h0;
import java.io.Serializable;
import p093r2.k;
import p109u2.C0965d;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final k[] f8727k = new k[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h0[] f8728l = new h0[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k[] f8729h;
    public final k[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h0[] f8730j;

    public q(k[] kVarArr, k[] kVarArr2, h0[] h0VarArr) {
        k[] kVarArr3 = f8727k;
        this.f8729h = kVarArr == null ? kVarArr3 : kVarArr;
        this.i = kVarArr2 == null ? kVarArr3 : kVarArr2;
        this.f8730j = h0VarArr == null ? f8728l : h0VarArr;
    }

    public final boolean a() {
        return this.f8730j.length > 0;
    }

    public final C0965d b() {
        return new C0965d(this.f8730j);
    }
}

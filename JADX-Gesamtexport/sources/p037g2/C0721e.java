package p037g2;

import com.fasterxml.jackson.databind.deser.std.o0;
import com.spotify.android.appremote.api.ContentApi;
import java.util.HashMap;
import p015c2.B;
import p015c2.C0474e;
import p015c2.f;
import p015c2.h;
import p026e2.n;
import p046i2.C0776l;
import p046i2.m;
import p046i2.r;
import p104t2.c;
import p109u2.i;

/* JADX INFO: renamed from: g2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0721e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f9125j = {ContentApi.ContentType.DEFAULT, "from-String", "from-int", "from-long", "from-big-integer", "from-double", "from-big-decimal", "from-boolean", "delegate", "property-based", "array-delegate"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f9126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m[] f9129d = new m[11];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9130e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9131f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p032f2.r[] f9132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p032f2.r[] f9133h;
    public p032f2.r[] i;

    public C0721e(r rVar, n nVar) {
        this.f9126a = rVar;
        nVar.getClass();
        this.f9127b = nVar.k(p015c2.r.CAN_OVERRIDE_ACCESS_MODIFIERS);
        this.f9128c = nVar.k(p015c2.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
    }

    public final h a(f fVar, m mVar, p032f2.r[] rVarArr) {
        if (!this.f9131f || mVar == null) {
            return null;
        }
        int i = 0;
        if (rVarArr != null) {
            int length = rVarArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                if (rVarArr[i3] == null) {
                    i = i3;
                    break;
                }
            }
        }
        n nVar = fVar.f7249l;
        h hVarZ = mVar.z(i);
        B bD = nVar.d();
        C0776l c0776lX = mVar.x(i);
        Object objJ = bD.j(c0776lX);
        return objJ != null ? hVarZ.w0(fVar.c0(objJ)) : bD.o0(nVar, c0776lX, hVarZ);
    }

    public final void b(m mVar, boolean z5, p032f2.r[] rVarArr, int i) {
        h hVarZ = mVar.z(i);
        hVarZ.getClass();
        if (hVarZ instanceof c) {
            if (e(mVar, 10, z5)) {
                this.f9133h = rVarArr;
            }
        } else if (e(mVar, 8, z5)) {
            this.f9132g = rVarArr;
        }
    }

    public final void c(m mVar, boolean z5, p032f2.r[] rVarArr) {
        Integer num;
        if (e(mVar, 9, z5)) {
            if (rVarArr.length > 1) {
                HashMap map = new HashMap();
                int length = rVarArr.length;
                for (int i = 0; i < length; i++) {
                    String str = rVarArr[i].f8933j.f7195h;
                    if ((!str.isEmpty() || rVarArr[i].o() == null) && (num = (Integer) map.put(str, Integer.valueOf(i))) != null) {
                        throw new IllegalArgumentException(String.format("Duplicate creator property \"%s\" (index %s vs %d) for type %s ", str, num, Integer.valueOf(i), i.z(this.f9126a.f9562a.f7281k)));
                    }
                }
            }
            this.i = rVarArr;
        }
    }

    public final o0 d(f fVar) {
        C0474e c0474e = fVar.f7249l;
        m[] mVarArr = this.f9129d;
        h hVarA = a(fVar, mVarArr[8], this.f9132g);
        h hVarA2 = a(fVar, mVarArr[10], this.f9133h);
        o0 o0Var = new o0(this.f9126a.f9562a);
        m mVar = mVarArr[0];
        m mVar2 = mVarArr[8];
        p032f2.r[] rVarArr = this.f9132g;
        m mVar3 = mVarArr[9];
        p032f2.r[] rVarArr2 = this.i;
        o0Var.f7625j = mVar;
        o0Var.f7629n = mVar2;
        o0Var.f7628m = hVarA;
        o0Var.f7630o = rVarArr;
        o0Var.f7626k = mVar3;
        o0Var.f7627l = rVarArr2;
        m mVar4 = mVarArr[10];
        p032f2.r[] rVarArr3 = this.f9133h;
        o0Var.f7632q = mVar4;
        o0Var.f7631p = hVarA2;
        o0Var.f7633r = rVarArr3;
        o0Var.f7634s = mVarArr[1];
        o0Var.f7635t = mVarArr[2];
        o0Var.f7636u = mVarArr[3];
        o0Var.f7637v = mVarArr[4];
        o0Var.f7638w = mVarArr[5];
        o0Var.f7639x = mVarArr[6];
        o0Var.f7640y = mVarArr[7];
        return o0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x009e, code lost:
    
        if (r4.isPrimitive() != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(p046i2.m r13, int r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p037g2.C0721e.e(i2.m, int, boolean):boolean");
    }
}

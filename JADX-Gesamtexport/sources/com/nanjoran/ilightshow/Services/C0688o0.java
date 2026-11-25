package com.nanjoran.ilightshow.Services;

import N.C0208d;
import N.C0217h0;
import P4.AbstractC0336x;
import android.content.Context;
import com.nanjoran.ilightshow.Model.JSON.UsageJSON;
import com.nanjoran.ilightshow.Model.Presets.FXOpt;
import com.nanjoran.ilightshow.Model.Presets.UMPreset;
import p092r1.InterfaceC0886g;

/* JADX INFO: renamed from: com.nanjoran.ilightshow.Services.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0688o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0886g f8450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p114v1.e f8451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p114v1.e f8452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0217h0 f8453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public UsageJSON f8454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0217h0 f8455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f8456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final U4.d f8457h;
    public P4.i0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0675i0 f8458j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0675i0 f8459k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0217h0 f8460l;

    public C0688o0(Context context) {
        InterfaceC0886g interfaceC0886g = (InterfaceC0886g) AbstractC0690p0.f8463b.a(AbstractC0690p0.f8462a[0], context);
        this.f8450a = interfaceC0886g;
        this.f8451b = new p114v1.e("STANDARD_USAGE_KEY");
        this.f8452c = new p114v1.e("ADVANCED_USAGE_KEY");
        Boolean bool = Boolean.FALSE;
        N.U u6 = N.U.f3673m;
        this.f8453d = C0208d.K(bool, u6);
        this.f8455f = C0208d.K(bool, u6);
        this.f8456g = 10.0d;
        P4.j0 j0VarB = AbstractC0336x.b();
        W4.d dVar = P4.D.f4604a;
        dVar.getClass();
        this.f8457h = AbstractC0336x.a(S1.h0.u(dVar, j0VarB));
        this.f8458j = new C0675i0(interfaceC0886g.getData(), this, 0);
        this.f8459k = new C0675i0(interfaceC0886g.getData(), this, 1);
        this.f8460l = C0208d.K(null, u6);
    }

    public final boolean a() {
        M m6 = M.f8305O;
        int size = m6.k().size();
        if (!m6.f8336w.f810a.isEmpty() && size == 0) {
            return false;
        }
        E0 e6 = E0.f8249o;
        if (e6.a() == F0.MEMBERSHIP_V3 || b() > 0) {
            return false;
        }
        UMPreset uMPresetG = m6.g();
        return E4.k.a(uMPresetG != null ? uMPresetG.getEngineMode() : null, FXOpt.INSTANCE.getEngineAdvanced()) || (e6.a() == F0.NONE && size > 1);
    }

    public final int b() {
        AppConfig config;
        EntitlementsConfig entitlements;
        EntitlementQuotaConfig quota;
        Integer advancedSecondsPerPeriod;
        if (E0.f8249o.a() == F0.MEMBERSHIP_V3) {
            return 10000;
        }
        C0217h0 c0217h0 = this.f8460l;
        if (((Integer) c0217h0.getValue()) == null) {
            return 0;
        }
        AppConfigWrapper appConfigWrapperA = AbstractC0697x.a();
        int iIntValue = (appConfigWrapperA == null || (config = appConfigWrapperA.getConfig()) == null || (entitlements = config.getEntitlements()) == null || (quota = entitlements.getQuota()) == null || (advancedSecondsPerPeriod = quota.getAdvancedSecondsPerPeriod()) == null) ? 1200 : advancedSecondsPerPeriod.intValue();
        Integer num = (Integer) c0217h0.getValue();
        E4.k.c(num);
        return Math.max(0, iIntValue - num.intValue());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(p122w4.c cVar) {
        C0667e0 c0667e0;
        C0688o0 c0688o0;
        C0688o0 c0688o1;
        int i;
        C0688o0 c0688o2;
        if (cVar instanceof C0667e0) {
            c0667e0 = (C0667e0) cVar;
            int i3 = c0667e0.f8388p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0667e0.f8388p = i3 - Integer.MIN_VALUE;
            } else {
                c0667e0 = new C0667e0(this, cVar);
            }
        } else {
            c0667e0 = new C0667e0(this, cVar);
        }
        Object objI = c0667e0.f8386n;
        v4.a aVar = v4.a.f13292h;
        int i6 = c0667e0.f8388p;
        if (i6 == 0) {
            S1.V.O(objI);
            c0667e0.f8383k = this;
            c0667e0.f8384l = this;
            c0667e0.f8388p = 1;
            objI = S4.F.i(this.f8459k, c0667e0);
            if (objI != aVar) {
                c0688o0 = this;
            }
            return aVar;
        }
        if (i6 == 1) {
            this = c0667e0.f8384l;
            c0688o0 = c0667e0.f8383k;
            S1.V.O(objI);
        } else {
            if (i6 == 2) {
                i = c0667e0.f8385m;
                C0688o0 c0688o3 = c0667e0.f8384l;
                C0688o0 c0688o4 = c0667e0.f8383k;
                S1.V.O(objI);
                c0688o1 = c0688o3;
                c0688o0 = c0688o4;
                c0688o1.f8460l.setValue(new Integer(((Number) objI).intValue() + i));
                c0667e0.f8383k = c0688o0;
                c0667e0.f8384l = null;
                c0667e0.f8388p = 3;
                if (c0688o0.e(false, c0667e0) != aVar) {
                    c0688o2 = c0688o0;
                }
                return aVar;
            }
            if (i6 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0688o2 = c0667e0.f8383k;
            S1.V.O(objI);
        }
        c0688o2.d();
        return p084p4.x.f10867a;
        int iIntValue = ((Number) objI).intValue();
        C0675i0 c0675i0 = c0688o0.f8458j;
        c0667e0.f8383k = c0688o0;
        c0667e0.f8384l = this;
        c0667e0.f8385m = iIntValue;
        c0667e0.f8388p = 2;
        Object objI2 = S4.F.i(c0675i0, c0667e0);
        if (objI2 != aVar) {
            c0688o1 = this;
            i = iIntValue;
            objI = objI2;
            c0688o1.f8460l.setValue(new Integer(((Number) objI).intValue() + i));
            c0667e0.f8383k = c0688o0;
            c0667e0.f8384l = null;
            c0667e0.f8388p = 3;
            if (c0688o0.e(false, c0667e0) != aVar) {
                c0688o2 = c0688o0;
                c0688o2.d();
                return p084p4.x.f10867a;
            }
        }
        return aVar;
    }

    public final void d() {
        P4.i0 i0Var = this.i;
        if (i0Var == null || !i0Var.b()) {
            this.i = AbstractC0336x.o(this.f8457h, null, new C0679k0(this, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0239 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x023b  */
    /* JADX WARN: Code duplicated, block: B:103:0x023e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0241  */
    /* JADX WARN: Code duplicated, block: B:117:0x029c  */
    /* JADX WARN: Code duplicated, block: B:120:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:122:0x02a3 A[PHI: r1 r4
  0x02a3: PHI (r1v30 int) = (r1v19 int), (r1v19 int), (r1v19 int), (r1v19 int), (r1v19 int), (r1v19 int), (r1v19 int), (r1v32 int) binds: [B:88:0x020b, B:94:0x021f, B:100:0x0237, B:104:0x023f, B:106:0x024c, B:108:0x0256, B:109:0x0258, B:121:0x02a2] A[DONT_GENERATE, DONT_INLINE]
  0x02a3: PHI (r4v20 com.nanjoran.ilightshow.Services.o0) = 
  (r4v11 com.nanjoran.ilightshow.Services.o0)
  (r4v11 com.nanjoran.ilightshow.Services.o0)
  (r4v11 com.nanjoran.ilightshow.Services.o0)
  (r4v11 com.nanjoran.ilightshow.Services.o0)
  (r4v11 com.nanjoran.ilightshow.Services.o0)
  (r4v11 com.nanjoran.ilightshow.Services.o0)
  (r4v11 com.nanjoran.ilightshow.Services.o0)
  (r4v22 com.nanjoran.ilightshow.Services.o0)
 binds: [B:88:0x020b, B:94:0x021f, B:100:0x0237, B:104:0x023f, B:106:0x024c, B:108:0x0256, B:109:0x0258, B:121:0x02a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:125:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:129:0x02d7 A[PHI: r0 r1 r4 r9 r10
  0x02d7: PHI (r0v25 int) = (r0v23 int), (r0v29 int) binds: [B:127:0x02d3, B:18:0x0070] A[DONT_GENERATE, DONT_INLINE]
  0x02d7: PHI (r1v37 java.lang.Object) = (r1v36 java.lang.Object), (r1v1 java.lang.Object) binds: [B:127:0x02d3, B:18:0x0070] A[DONT_GENERATE, DONT_INLINE]
  0x02d7: PHI (r4v28 int) = (r4v24 int), (r4v29 int) binds: [B:127:0x02d3, B:18:0x0070] A[DONT_GENERATE, DONT_INLINE]
  0x02d7: PHI (r9v22 com.nanjoran.ilightshow.Services.o0) = (r9v19 com.nanjoran.ilightshow.Services.o0), (r9v25 com.nanjoran.ilightshow.Services.o0) binds: [B:127:0x02d3, B:18:0x0070] A[DONT_GENERATE, DONT_INLINE]
  0x02d7: PHI (r10v17 com.nanjoran.ilightshow.Services.o0) = (r10v15 com.nanjoran.ilightshow.Services.o0), (r10v18 com.nanjoran.ilightshow.Services.o0) binds: [B:127:0x02d3, B:18:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:131:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:134:0x0304  */
    /* JADX WARN: Code duplicated, block: B:137:0x0317  */
    /* JADX WARN: Code duplicated, block: B:140:0x0322 A[PHI: r4 r10
  0x0322: PHI (r4v32 int) = (r4v30 int), (r4v34 int) binds: [B:138:0x031f, B:147:0x0355] A[DONT_GENERATE, DONT_INLINE]
  0x0322: PHI (r10v21 com.nanjoran.ilightshow.Services.o0) = (r10v19 com.nanjoran.ilightshow.Services.o0), (r10v22 com.nanjoran.ilightshow.Services.o0) binds: [B:138:0x031f, B:147:0x0355] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0046 A[PHI: r0 r1 r4 r8
  0x0046: PHI (r0v42 int) = (r0v40 int), (r0v43 int) binds: [B:153:0x0382, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x0046: PHI (r1v61 java.lang.Object) = (r1v60 java.lang.Object), (r1v1 java.lang.Object) binds: [B:153:0x0382, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x0046: PHI (r4v38 com.nanjoran.ilightshow.Services.o0) = (r4v36 com.nanjoran.ilightshow.Services.o0), (r4v39 com.nanjoran.ilightshow.Services.o0) binds: [B:153:0x0382, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x0046: PHI (r8v29 long) = (r8v28 long), (r8v31 long) binds: [B:153:0x0382, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:152:0x036b A[PHI: r0 r1 r4
  0x036b: PHI (r0v40 int) = (r0v32 int), (r0v41 int) binds: [B:150:0x0368, B:15:0x0049] A[DONT_GENERATE, DONT_INLINE]
  0x036b: PHI (r1v56 java.lang.Object) = (r1v52 java.lang.Object), (r1v1 java.lang.Object) binds: [B:150:0x0368, B:15:0x0049] A[DONT_GENERATE, DONT_INLINE]
  0x036b: PHI (r4v36 com.nanjoran.ilightshow.Services.o0) = (r4v33 com.nanjoran.ilightshow.Services.o0), (r4v37 com.nanjoran.ilightshow.Services.o0) binds: [B:150:0x0368, B:15:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:158:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:161:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:163:0x03be A[DONT_INVERT, PHI: r4 r10
  0x03be: PHI (r4v40 int) = (r4v28 int), (r4v34 int), (r4v34 int), (r4v41 int) binds: [B:130:0x02ea, B:145:0x0348, B:147:0x0355, B:162:0x03bc] A[DONT_GENERATE, DONT_INLINE]
  0x03be: PHI (r10v25 com.nanjoran.ilightshow.Services.o0) = 
  (r10v17 com.nanjoran.ilightshow.Services.o0)
  (r10v22 com.nanjoran.ilightshow.Services.o0)
  (r10v22 com.nanjoran.ilightshow.Services.o0)
  (r10v26 com.nanjoran.ilightshow.Services.o0)
 binds: [B:130:0x02ea, B:145:0x0348, B:147:0x0355, B:162:0x03bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:164:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:168:0x03db  */
    /* JADX WARN: Code duplicated, block: B:170:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:173:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:175:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:33:0x0110  */
    /* JADX WARN: Code duplicated, block: B:39:0x012a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0140  */
    /* JADX WARN: Code duplicated, block: B:45:0x0145  */
    /* JADX WARN: Code duplicated, block: B:49:0x0152  */
    /* JADX WARN: Code duplicated, block: B:51:0x0158  */
    /* JADX WARN: Code duplicated, block: B:52:0x015d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0168  */
    /* JADX WARN: Code duplicated, block: B:56:0x016d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0178  */
    /* JADX WARN: Code duplicated, block: B:60:0x017b  */
    /* JADX WARN: Code duplicated, block: B:62:0x017e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0180  */
    /* JADX WARN: Code duplicated, block: B:66:0x0187 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x020d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0215  */
    /* JADX WARN: Code duplicated, block: B:92:0x021a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0221  */
    /* JADX WARN: Code duplicated, block: B:97:0x0227  */
    /* JADX WARN: Code duplicated, block: B:98:0x022c  */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0337, code lost:
    
        if (r1 == r3) goto L157;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(boolean r21, p122w4.c r22) {
        /*
            Method dump skipped, instruction units count: 1048
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nanjoran.ilightshow.Services.C0688o0.e(boolean, w4.c):java.lang.Object");
    }
}

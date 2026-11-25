package p130y0;

import B.C0024m;
import B.C0031p0;
import E0.e;
import E0.f;
import E0.g;
import E0.l;
import G0.C0110f;
import G0.G;
import G0.I;
import I3.a;
import N3.C0303z0;
import R4.b;
import R4.i;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.nanjoran.ilightshow.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import p012c.k;
import p035g0.C0715p;
import p045i1.C0741b;
import p049j1.h;
import p052k.d;
import p080p.C0834f;
import p080p.F;
import p080p.j;
import p080p.o;
import p080p.p;
import p080p.q;
import p080p.r;
import p081p0.c;
import p084p4.x;
import p089q4.m;
import p089q4.u;
import p101t.o0;
import p124x0.D;
import p124x0.Y;

/* JADX INFO: loaded from: classes.dex */
public final class B extends C0741b {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final p f14178N;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public q f14179A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final r f14180B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final o f14181C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final o f14182D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final String f14183E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final String f14184F;
    public final C0031p0 G;
    public final q H;
    public A0 I;
    public boolean J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final a f14185K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final ArrayList f14186L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final A f14187M;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f14188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14189e = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final A f14190f = new A(this, 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AccessibilityManager f14191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f14192h;
    public final AccessibilityManagerAccessibilityStateChangeListenerC1154s i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AccessibilityManagerTouchExplorationStateChangeListenerC1156t f14193j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f14194k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f14195l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C1162w f14196m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14197n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h f14198o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14199p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q f14200q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q f14201r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final F f14202s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final F f14203t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14204u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Integer f14205v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0834f f14206w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b f14207x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f14208y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C1166y f14209z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        int i = p080p.h.f10736a;
        p pVar = new p(32);
        int i3 = pVar.f10759b;
        if (i3 < 0) {
            StringBuilder sbV = k.v(i3, "Index ", " must be in 0..");
            sbV.append(pVar.f10759b);
            throw new IndexOutOfBoundsException(sbV.toString());
        }
        int i6 = i3 + 32;
        pVar.b(i6);
        int[] iArr2 = pVar.f10758a;
        int i7 = pVar.f10759b;
        if (i3 != i7) {
            p089q4.k.c0(i6, i3, i7, iArr2, iArr2);
        }
        p089q4.k.f0(i3, 0, 12, iArr, iArr2);
        pVar.f10759b += 32;
        f14178N = pVar;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [y0.s] */
    /* JADX WARN: Type inference failed for: r2v5, types: [y0.t] */
    public B(r rVar) {
        this.f14188d = rVar;
        Object systemService = rVar.getContext().getSystemService("accessibility");
        E4.k.d("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager", systemService);
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f14191g = accessibilityManager;
        this.f14192h = 100L;
        this.i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: y0.s
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z5) {
                B b6 = this.f14521a;
                b6.f14194k = z5 ? b6.f14191g.getEnabledAccessibilityServiceList(-1) : u.f11237h;
            }
        };
        this.f14193j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: y0.t
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z5) {
                B b6 = this.f14533a;
                b6.f14194k = b6.f14191g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f14194k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f14195l = new Handler(Looper.getMainLooper());
        this.f14196m = new C1162w(this);
        this.f14197n = Integer.MIN_VALUE;
        this.f14200q = new q();
        this.f14201r = new q();
        this.f14202s = new F(0);
        this.f14203t = new F(0);
        this.f14204u = -1;
        this.f14206w = new C0834f(null);
        this.f14207x = i.a(1, 0, 6);
        this.f14208y = true;
        q qVar = p080p.i.f10737a;
        E4.k.d("null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>", qVar);
        this.f14179A = qVar;
        this.f14180B = new r();
        this.f14181C = new o();
        this.f14182D = new o();
        this.f14183E = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f14184F = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.G = new C0031p0(16);
        this.H = new q();
        l lVarA = rVar.getSemanticsOwner().a();
        E4.k.d("null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>", qVar);
        this.I = new A0(lVarA, qVar);
        rVar.addOnAttachStateChangeListener(new d(2, this));
        this.f14185K = new a(15, this);
        this.f14186L = new ArrayList();
        this.f14187M = new A(this, 1);
    }

    public static /* synthetic */ void C(B b6, int i, int i3, Integer num, int i6) {
        if ((i6 & 4) != 0) {
            num = null;
        }
        b6.B(i, i3, num, null);
    }

    public static CharSequence K(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                E4.k.d("null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize", charSequenceSubSequence);
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static boolean p(l lVar) {
        Object obj = lVar.f947d.f939h.get(E0.o.f966B);
        if (obj == null) {
            obj = null;
        }
        F0.a aVar = (F0.a) obj;
        E0.r rVar = E0.o.f988s;
        LinkedHashMap linkedHashMap = lVar.f947d.f939h;
        Object obj2 = linkedHashMap.get(rVar);
        if (obj2 == null) {
            obj2 = null;
        }
        e eVar = (e) obj2;
        boolean z5 = aVar != null;
        Object obj3 = linkedHashMap.get(E0.o.f965A);
        if (((Boolean) (obj3 != null ? obj3 : null)) == null || (eVar != null && eVar.f911a == 4)) {
            return z5;
        }
        return true;
    }

    public static String r(l lVar) {
        C0110f c0110f;
        if (lVar != null) {
            E0.r rVar = E0.o.f971a;
            E0.h hVar = lVar.f947d;
            LinkedHashMap linkedHashMap = hVar.f939h;
            if (linkedHashMap.containsKey(rVar)) {
                return G4.a.r(",", (List) hVar.g(rVar));
            }
            E0.r rVar2 = E0.o.f993x;
            if (linkedHashMap.containsKey(rVar2)) {
                Object obj = linkedHashMap.get(rVar2);
                if (obj == null) {
                    obj = null;
                }
                C0110f c0110f2 = (C0110f) obj;
                if (c0110f2 != null) {
                    return c0110f2.f1494h;
                }
            } else {
                Object obj2 = linkedHashMap.get(E0.o.f990u);
                if (obj2 == null) {
                    obj2 = null;
                }
                List list = (List) obj2;
                if (list != null && (c0110f = (C0110f) p089q4.l.Z(list)) != null) {
                    return c0110f.f1494h;
                }
            }
        }
        return null;
    }

    public static final boolean v(f fVar, float f6) {
        o0 o0Var = fVar.f912a;
        if (f6 >= 0.0f || ((Number) o0Var.invoke()).floatValue() <= 0.0f) {
            return f6 > 0.0f && ((Number) o0Var.invoke()).floatValue() < ((Number) fVar.f913b.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean w(f fVar) {
        o0 o0Var = fVar.f912a;
        if (((Number) o0Var.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) o0Var.invoke()).floatValue();
        ((Number) fVar.f913b.invoke()).floatValue();
        return false;
    }

    public static final boolean x(f fVar) {
        o0 o0Var = fVar.f912a;
        if (((Number) o0Var.invoke()).floatValue() < ((Number) fVar.f913b.invoke()).floatValue()) {
            return true;
        }
        ((Number) o0Var.invoke()).floatValue();
        return false;
    }

    public final boolean A(AccessibilityEvent accessibilityEvent) {
        if (!s()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f14199p = true;
        }
        try {
            return ((Boolean) this.f14190f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f14199p = false;
        }
    }

    public final boolean B(int i, int i3, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !s()) {
            return false;
        }
        AccessibilityEvent accessibilityEventJ = j(i, i3);
        if (num != null) {
            accessibilityEventJ.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventJ.setContentDescription(G4.a.r(",", list));
        }
        Trace.beginSection("sendEvent");
        try {
            return A(accessibilityEventJ);
        } finally {
            Trace.endSection();
        }
    }

    public final void D(int i, String str, int i3) {
        AccessibilityEvent accessibilityEventJ = j(y(i), 32);
        accessibilityEventJ.setContentChangeTypes(i3);
        if (str != null) {
            accessibilityEventJ.getText().add(str);
        }
        A(accessibilityEventJ);
    }

    public final void E(int i) {
        C1166y c1166y = this.f14209z;
        if (c1166y != null) {
            l lVar = c1166y.f14546a;
            if (i != lVar.f950g) {
                return;
            }
            if (SystemClock.uptimeMillis() - c1166y.f14551f <= 1000) {
                AccessibilityEvent accessibilityEventJ = j(y(lVar.f950g), 131072);
                accessibilityEventJ.setFromIndex(c1166y.f14549d);
                accessibilityEventJ.setToIndex(c1166y.f14550e);
                accessibilityEventJ.setAction(c1166y.f14547b);
                accessibilityEventJ.setMovementGranularity(c1166y.f14548c);
                accessibilityEventJ.getText().add(r(lVar));
                A(accessibilityEventJ);
            }
        }
        this.f14209z = null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:103:0x0210  */
    /* JADX WARN: Code duplicated, block: B:104:0x0220  */
    /* JADX WARN: Code duplicated, block: B:105:0x023b  */
    /* JADX WARN: Code duplicated, block: B:108:0x025d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0276  */
    /* JADX WARN: Code duplicated, block: B:114:0x027c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0283  */
    /* JADX WARN: Code duplicated, block: B:121:0x028b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0293  */
    /* JADX WARN: Code duplicated, block: B:128:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:133:0x02af  */
    /* JADX WARN: Code duplicated, block: B:136:0x02bc A[LOOP:4: B:131:0x02ab->B:136:0x02bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:144:0x02df A[LOOP:5: B:139:0x02c7->B:144:0x02df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:148:0x02fc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x0302  */
    /* JADX WARN: Code duplicated, block: B:153:0x0306 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:156:0x030d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0311 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:161:0x0337  */
    /* JADX WARN: Code duplicated, block: B:164:0x035d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:167:0x0363  */
    /* JADX WARN: Code duplicated, block: B:168:0x037d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0393  */
    /* JADX WARN: Code duplicated, block: B:173:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:176:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:181:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:183:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:184:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:188:0x040a  */
    /* JADX WARN: Code duplicated, block: B:191:0x041b A[LOOP:3: B:187:0x0408->B:191:0x041b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:195:0x0429  */
    /* JADX WARN: Code duplicated, block: B:198:0x0437  */
    /* JADX WARN: Code duplicated, block: B:202:0x0447  */
    /* JADX WARN: Code duplicated, block: B:203:0x045b  */
    /* JADX WARN: Code duplicated, block: B:207:0x0474  */
    /* JADX WARN: Code duplicated, block: B:208:0x0482  */
    /* JADX WARN: Code duplicated, block: B:210:0x0492  */
    /* JADX WARN: Code duplicated, block: B:212:0x049a  */
    /* JADX WARN: Code duplicated, block: B:214:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:219:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:221:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:223:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:227:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:233:0x0507  */
    /* JADX WARN: Code duplicated, block: B:238:0x052c  */
    /* JADX WARN: Code duplicated, block: B:240:0x0543  */
    /* JADX WARN: Code duplicated, block: B:243:0x0548  */
    /* JADX WARN: Code duplicated, block: B:246:0x054d  */
    /* JADX WARN: Code duplicated, block: B:249:0x055a  */
    /* JADX WARN: Code duplicated, block: B:251:0x0560 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:253:0x0563 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:256:0x0569  */
    /* JADX WARN: Code duplicated, block: B:259:0x056e  */
    /* JADX WARN: Code duplicated, block: B:274:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:285:0x04f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x04e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x050d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x03a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x03ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x0463 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x0524 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x04ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x04d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x041e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x0414 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x02c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x02c5 A[EDGE_INSN: B:313:0x02c5->B:138:0x02c5 BREAK  A[LOOP:4: B:131:0x02ab->B:136:0x02bc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x02e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x02e4 A[EDGE_INSN: B:315:0x02e4->B:146:0x02e4 BREAK  A[LOOP:5: B:139:0x02c7->B:144:0x02df], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:55:0x011c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0122  */
    /* JADX WARN: Code duplicated, block: B:58:0x012a  */
    /* JADX WARN: Code duplicated, block: B:59:0x012c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0151  */
    /* JADX WARN: Code duplicated, block: B:66:0x0177  */
    /* JADX WARN: Code duplicated, block: B:70:0x0190  */
    /* JADX WARN: Code duplicated, block: B:73:0x0196  */
    /* JADX WARN: Code duplicated, block: B:74:0x0199  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:89:0x01db  */
    /* JADX WARN: Code duplicated, block: B:92:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:98:0x01fa  */
    public final void F(q qVar) {
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        int i3;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i9;
        int i10;
        int i11;
        C1169z0 c1169z0;
        boolean z5;
        LinkedHashMap linkedHashMap;
        E0.r rVar;
        E0.r rVar2;
        String str;
        boolean zA;
        A0 a6;
        E0.r rVar3;
        boolean zA2;
        D d6;
        ArrayList arrayList3;
        LinkedHashMap linkedHashMap2;
        int[] iArr3;
        Object obj;
        e eVar;
        boolean z6;
        Object obj2;
        AccessibilityEvent accessibilityEventJ;
        Object obj3;
        List list;
        String strR;
        Object obj4;
        List list2;
        String strR2;
        E0.r rVar4;
        String str2;
        l lVar;
        l lVar2;
        Object obj5;
        C0110f c0110f;
        Object obj6;
        CharSequence charSequence;
        CharSequence charSequenceK;
        int length;
        int length2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean zContainsKey;
        boolean z7;
        boolean z8;
        AccessibilityEvent accessibilityEventK;
        E0.r rVar5;
        boolean zA3;
        int i17;
        int i18;
        Object obj7;
        C0110f c0110f2;
        String str3;
        boolean zA4;
        int size;
        int i19;
        C1169z0 c1169z1;
        Object obj8;
        Object obj9;
        Object value;
        int i20;
        E0.r rVar6;
        E0.a aVar;
        Object obj10;
        boolean z9;
        E0.a aVar2;
        List list3;
        Object obj11;
        List list4;
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        Object value2;
        Object obj12;
        q qVar2 = qVar;
        ArrayList arrayList4 = this.f14186L;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr4 = qVar2.f10761b;
        long[] jArr3 = qVar2.f10760a;
        int i21 = 2;
        int length3 = jArr3.length - 2;
        if (length3 < 0) {
            return;
        }
        int i22 = 0;
        while (true) {
            long j4 = jArr3[i22];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i23 = 8;
                int i24 = 8 - ((~(i22 - length3)) >>> 31);
                long j6 = j4;
                int i25 = 0;
                while (i25 < i24) {
                    if ((j6 & 255) >= 128) {
                        int i26 = i23;
                        i6 = i24;
                        i7 = i26;
                        i8 = i25;
                        arrayList2 = arrayList5;
                        iArr2 = iArr4;
                        jArr2 = jArr3;
                        i9 = i21;
                        i10 = length3;
                        break;
                        break;
                    }
                    int i27 = iArr4[(i22 << 3) + i25];
                    A0 a7 = (A0) this.H.f(i27);
                    if (a7 == null) {
                        int i28 = i23;
                        i6 = i24;
                        i7 = i28;
                        i8 = i25;
                        arrayList2 = arrayList5;
                        iArr2 = iArr4;
                        jArr2 = jArr3;
                        i9 = i21;
                        i10 = length3;
                    } else {
                        B0 b6 = (B0) qVar2.f(i27);
                        l lVar3 = b6 != null ? b6.f14210a : null;
                        if (lVar3 == null) {
                            p027e3.a.z0("no value for specified key");
                            throw null;
                        }
                        i9 = i21;
                        E0.h hVar = lVar3.f947d;
                        Iterator it = hVar.iterator();
                        boolean z10 = false;
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            E0.h hVar2 = a7.f14176a;
                            if (zHasNext) {
                                Map.Entry entry = (Map.Entry) it.next();
                                Object key = entry.getKey();
                                i25 = i25;
                                E0.r rVar7 = E0.o.f984o;
                                if (E4.k.a(key, rVar7)) {
                                    i11 = i24;
                                } else {
                                    i11 = i24;
                                    if (!E4.k.a(entry.getKey(), E0.o.f985p)) {
                                        z5 = false;
                                    }
                                    linkedHashMap = hVar2.f939h;
                                    if (z5) {
                                        rVar = (E0.r) entry.getKey();
                                        rVar2 = E0.o.f974d;
                                        if (E4.k.a(rVar, rVar2)) {
                                            Object value3 = entry.getValue();
                                            E4.k.d("null cannot be cast to non-null type kotlin.String", value3);
                                            str = (String) value3;
                                            if (linkedHashMap.containsKey(rVar2)) {
                                                D(i27, str, 8);
                                            }
                                        } else {
                                            if (E4.k.a(rVar, E0.o.f972b)) {
                                                zA = true;
                                            } else {
                                                zA = E4.k.a(rVar, E0.o.f966B);
                                            }
                                            if (zA) {
                                                C(this, y(i27), 2048, 64, 8);
                                                C(this, y(i27), 2048, 0, 8);
                                            } else {
                                                a6 = a7;
                                                if (E4.k.a(rVar, E0.o.f973c)) {
                                                    C(this, y(i27), 2048, 64, 8);
                                                    C(this, y(i27), 2048, 0, 8);
                                                    arrayList3 = arrayList5;
                                                    iArr3 = iArr4;
                                                    lVar2 = lVar3;
                                                    i17 = length3;
                                                    i27 = i27;
                                                    lVar3 = lVar2;
                                                    i24 = i11;
                                                    length3 = i17;
                                                    a7 = a6;
                                                    arrayList5 = arrayList3;
                                                    iArr4 = iArr3;
                                                    jArr3 = jArr3;
                                                } else {
                                                    rVar3 = E0.o.f965A;
                                                    zA2 = E4.k.a(rVar, rVar3);
                                                    d6 = lVar3.f946c;
                                                    arrayList3 = arrayList5;
                                                    linkedHashMap2 = hVar.f939h;
                                                    iArr3 = iArr4;
                                                    if (zA2) {
                                                        obj = linkedHashMap2.get(E0.o.f988s);
                                                        if (obj == null) {
                                                            obj = null;
                                                        }
                                                        eVar = (e) obj;
                                                        if (eVar == null) {
                                                            z6 = false;
                                                        } else {
                                                            z6 = true;
                                                        }
                                                        if (z6) {
                                                            obj2 = linkedHashMap2.get(rVar3);
                                                            if (obj2 == null) {
                                                                obj2 = null;
                                                            }
                                                            if (E4.k.a(obj2, Boolean.TRUE)) {
                                                                accessibilityEventJ = j(y(i27), 4);
                                                                l lVar4 = new l(lVar3.f944a, true, d6, hVar);
                                                                obj3 = lVar4.i().f939h.get(E0.o.f971a);
                                                                if (obj3 == null) {
                                                                    obj3 = null;
                                                                }
                                                                list = (List) obj3;
                                                                if (list != null) {
                                                                    strR = G4.a.r(",", list);
                                                                } else {
                                                                    strR = null;
                                                                }
                                                                obj4 = lVar4.i().f939h.get(E0.o.f990u);
                                                                if (obj4 == null) {
                                                                    obj4 = null;
                                                                }
                                                                list2 = (List) obj4;
                                                                if (list2 != null) {
                                                                    strR2 = G4.a.r(",", list2);
                                                                } else {
                                                                    strR2 = null;
                                                                }
                                                                if (strR != null) {
                                                                    accessibilityEventJ.setContentDescription(strR);
                                                                }
                                                                if (strR2 != null) {
                                                                    accessibilityEventJ.getText().add(strR2);
                                                                }
                                                                A(accessibilityEventJ);
                                                            } else {
                                                                C(this, y(i27), 2048, 0, 8);
                                                            }
                                                        } else {
                                                            C(this, y(i27), 2048, 64, 8);
                                                            C(this, y(i27), 2048, 0, 8);
                                                        }
                                                    } else if (E4.k.a(rVar, E0.o.f971a)) {
                                                        int iY = y(i27);
                                                        Object value4 = entry.getValue();
                                                        E4.k.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>", value4);
                                                        B(iY, 2048, 4, (List) value4);
                                                    } else {
                                                        rVar4 = E0.o.f993x;
                                                        str2 = "";
                                                        if (E4.k.a(rVar, rVar4)) {
                                                            if (linkedHashMap2.containsKey(g.f921h)) {
                                                                obj5 = linkedHashMap.get(rVar4);
                                                                if (obj5 == null) {
                                                                    obj5 = null;
                                                                }
                                                                c0110f = (C0110f) obj5;
                                                                if (c0110f == null) {
                                                                    c0110f = "";
                                                                }
                                                                obj6 = linkedHashMap2.get(rVar4);
                                                                if (obj6 == null) {
                                                                    obj6 = null;
                                                                }
                                                                charSequence = (C0110f) obj6;
                                                                if (charSequence == null) {
                                                                    charSequence = "";
                                                                }
                                                                l lVar5 = lVar3;
                                                                charSequenceK = K(charSequence);
                                                                length = c0110f.length();
                                                                length2 = charSequence.length();
                                                                if (length > length2) {
                                                                    i12 = length2;
                                                                } else {
                                                                    i12 = length;
                                                                }
                                                                lVar = lVar5;
                                                                i13 = 0;
                                                                while (true) {
                                                                    i14 = length;
                                                                    if (i13 < i12) {
                                                                        jArr3 = jArr3;
                                                                        break;
                                                                    }
                                                                    jArr3 = jArr3;
                                                                    if (c0110f.charAt(i13) != charSequence.charAt(i13)) {
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        i13++;
                                                                        length = i14;
                                                                        jArr3 = jArr3;
                                                                    }
                                                                }
                                                                i15 = 0;
                                                                while (true) {
                                                                    if (i15 < i12 - i13) {
                                                                        i16 = i15;
                                                                        break;
                                                                    }
                                                                    i16 = i15;
                                                                    if (c0110f.charAt((i14 - 1) - i15) != charSequence.charAt((length2 - 1) - i16)) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i15 = i16 + 1;
                                                                }
                                                                int i29 = (i14 - i16) - i13;
                                                                int i30 = (length2 - i16) - i13;
                                                                E0.r rVar8 = E0.o.f967C;
                                                                boolean zContainsKey2 = linkedHashMap.containsKey(rVar8);
                                                                boolean zContainsKey3 = linkedHashMap2.containsKey(rVar8);
                                                                zContainsKey = linkedHashMap.containsKey(E0.o.f993x);
                                                                if (zContainsKey) {
                                                                    z7 = false;
                                                                } else {
                                                                    z7 = false;
                                                                }
                                                                if (zContainsKey) {
                                                                    z8 = false;
                                                                } else {
                                                                    z8 = false;
                                                                }
                                                                if (z7) {
                                                                    i27 = i27;
                                                                    accessibilityEventK = k(y(i27), 0, 0, Integer.valueOf(length2), charSequenceK);
                                                                } else {
                                                                    i27 = i27;
                                                                    accessibilityEventK = k(y(i27), 0, 0, Integer.valueOf(length2), charSequenceK);
                                                                }
                                                                accessibilityEventK.setClassName("android.widget.EditText");
                                                                A(accessibilityEventK);
                                                                if (z7) {
                                                                    long j7 = ((I) hVar.g(E0.o.f994y)).f1470a;
                                                                    accessibilityEventK.setFromIndex((int) (j7 >> 32));
                                                                    accessibilityEventK.setToIndex((int) (j7 & 4294967295L));
                                                                    A(accessibilityEventK);
                                                                } else {
                                                                    long j8 = ((I) hVar.g(E0.o.f994y)).f1470a;
                                                                    accessibilityEventK.setFromIndex((int) (j8 >> 32));
                                                                    accessibilityEventK.setToIndex((int) (j8 & 4294967295L));
                                                                    A(accessibilityEventK);
                                                                }
                                                            } else {
                                                                i27 = i27;
                                                                lVar = lVar3;
                                                                jArr3 = jArr3;
                                                                i11 = i11;
                                                                C(this, y(i27), 2048, Integer.valueOf(i9), 8);
                                                            }
                                                            lVar2 = lVar;
                                                            i17 = length3;
                                                            i27 = i27;
                                                            lVar3 = lVar2;
                                                            i24 = i11;
                                                            length3 = i17;
                                                            a7 = a6;
                                                            arrayList5 = arrayList3;
                                                            iArr4 = iArr3;
                                                            jArr3 = jArr3;
                                                        } else {
                                                            i27 = i27;
                                                            jArr3 = jArr3;
                                                            i11 = i11;
                                                            lVar2 = lVar3;
                                                            rVar5 = E0.o.f994y;
                                                            zA3 = E4.k.a(rVar, rVar5);
                                                            i17 = length3;
                                                            i18 = lVar2.f950g;
                                                            if (zA3) {
                                                                obj7 = linkedHashMap2.get(rVar4);
                                                                if (obj7 == null) {
                                                                    obj7 = null;
                                                                }
                                                                c0110f2 = (C0110f) obj7;
                                                                if (c0110f2 != null) {
                                                                    str2 = str3;
                                                                }
                                                                I i31 = (I) hVar.g(rVar5);
                                                                int iY2 = y(i27);
                                                                long j9 = i31.f1470a;
                                                                A(k(iY2, Integer.valueOf((int) (j9 >> 32)), Integer.valueOf((int) (j9 & 4294967295L)), Integer.valueOf(str2.length()), K(str2)));
                                                                E(i18);
                                                            } else {
                                                                if (E4.k.a(rVar, rVar7)) {
                                                                    zA4 = true;
                                                                } else {
                                                                    zA4 = E4.k.a(rVar, E0.o.f985p);
                                                                }
                                                                if (zA4) {
                                                                    u(d6);
                                                                    size = arrayList4.size();
                                                                    i19 = 0;
                                                                    while (true) {
                                                                        if (i19 < size) {
                                                                            c1169z1 = null;
                                                                            break;
                                                                        } else {
                                                                            if (((C1169z0) arrayList4.get(i19)).f14570h == i27) {
                                                                                c1169z1 = (C1169z0) arrayList4.get(i19);
                                                                                break;
                                                                            }
                                                                            i19++;
                                                                        }
                                                                    }
                                                                    E4.k.c(c1169z1);
                                                                    obj8 = linkedHashMap2.get(rVar7);
                                                                    if (obj8 == null) {
                                                                        obj8 = null;
                                                                    }
                                                                    c1169z1.f14573l = (f) obj8;
                                                                    obj9 = linkedHashMap2.get(E0.o.f985p);
                                                                    if (obj9 == null) {
                                                                        obj9 = null;
                                                                    }
                                                                    c1169z1.f14574m = (f) obj9;
                                                                    if (c1169z1.i.contains(c1169z1)) {
                                                                        this.f14188d.getSnapshotObserver().a(c1169z1, this.f14187M, new C0024m(c1169z1, 19, this));
                                                                    }
                                                                } else if (E4.k.a(rVar, E0.o.f980k)) {
                                                                    value = entry.getValue();
                                                                    E4.k.d("null cannot be cast to non-null type kotlin.Boolean", value);
                                                                    if (((Boolean) value).booleanValue()) {
                                                                        i20 = 8;
                                                                        A(j(y(i18), 8));
                                                                    } else {
                                                                        i20 = 8;
                                                                    }
                                                                    C(this, y(i18), 2048, 0, i20);
                                                                } else {
                                                                    rVar6 = g.f933u;
                                                                    if (E4.k.a(rVar, rVar6)) {
                                                                        list3 = (List) hVar.g(rVar6);
                                                                        obj11 = linkedHashMap.get(rVar6);
                                                                        if (obj11 == null) {
                                                                            obj11 = null;
                                                                        }
                                                                        list4 = (List) obj11;
                                                                        if (list4 != null) {
                                                                            linkedHashSet = new LinkedHashSet();
                                                                            if (list3.size() <= 0) {
                                                                                list3.get(0).getClass();
                                                                                throw new ClassCastException();
                                                                            }
                                                                            linkedHashSet2 = new LinkedHashSet();
                                                                            if (list4.size() <= 0) {
                                                                                list4.get(0).getClass();
                                                                                throw new ClassCastException();
                                                                            }
                                                                            if (linkedHashSet.containsAll(linkedHashSet2)) {
                                                                                z10 = true;
                                                                            } else {
                                                                                z10 = true;
                                                                            }
                                                                        } else if (!list3.isEmpty()) {
                                                                            i27 = i27;
                                                                            lVar3 = lVar2;
                                                                            i24 = i11;
                                                                            length3 = i17;
                                                                            a7 = a6;
                                                                            arrayList5 = arrayList3;
                                                                            iArr4 = iArr3;
                                                                            jArr3 = jArr3;
                                                                            z10 = true;
                                                                        }
                                                                    } else if (entry.getValue() instanceof E0.a) {
                                                                        Object value5 = entry.getValue();
                                                                        E4.k.d("null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>", value5);
                                                                        aVar = (E0.a) value5;
                                                                        obj10 = linkedHashMap.get((E0.r) entry.getKey());
                                                                        if (obj10 == null) {
                                                                            obj10 = null;
                                                                        }
                                                                        if (aVar != obj10) {
                                                                            if (obj10 instanceof E0.a) {
                                                                                aVar2 = (E0.a) obj10;
                                                                                if (E4.k.a(aVar.f902a, aVar2.f902a)) {
                                                                                    p084p4.e eVar2 = aVar2.f903b;
                                                                                    p084p4.e eVar3 = aVar.f903b;
                                                                                    if (eVar3 == null) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        if (z9) {
                                                                            z10 = false;
                                                                        } else {
                                                                            z10 = true;
                                                                        }
                                                                    } else {
                                                                        z10 = true;
                                                                    }
                                                                }
                                                            }
                                                            i27 = i27;
                                                            lVar3 = lVar2;
                                                            i24 = i11;
                                                            length3 = i17;
                                                            a7 = a6;
                                                            arrayList5 = arrayList3;
                                                            iArr4 = iArr3;
                                                            jArr3 = jArr3;
                                                        }
                                                    }
                                                    lVar2 = lVar3;
                                                    i17 = length3;
                                                    i27 = i27;
                                                    lVar3 = lVar2;
                                                    i24 = i11;
                                                    length3 = i17;
                                                    a7 = a6;
                                                    arrayList5 = arrayList3;
                                                    iArr4 = iArr3;
                                                    jArr3 = jArr3;
                                                }
                                            }
                                        }
                                        a6 = a7;
                                        arrayList3 = arrayList5;
                                        iArr3 = iArr4;
                                        lVar2 = lVar3;
                                        i17 = length3;
                                        i27 = i27;
                                        lVar3 = lVar2;
                                        i24 = i11;
                                        length3 = i17;
                                        a7 = a6;
                                        arrayList5 = arrayList3;
                                        iArr4 = iArr3;
                                        jArr3 = jArr3;
                                    } else {
                                        value2 = entry.getValue();
                                        obj12 = linkedHashMap.get((E0.r) entry.getKey());
                                        if (obj12 == null) {
                                            obj12 = null;
                                        }
                                        if (E4.k.a(value2, obj12)) {
                                            rVar = (E0.r) entry.getKey();
                                            rVar2 = E0.o.f974d;
                                            if (E4.k.a(rVar, rVar2)) {
                                                Object value6 = entry.getValue();
                                                E4.k.d("null cannot be cast to non-null type kotlin.String", value6);
                                                str = (String) value6;
                                                if (linkedHashMap.containsKey(rVar2)) {
                                                    D(i27, str, 8);
                                                }
                                            } else {
                                                if (E4.k.a(rVar, E0.o.f972b)) {
                                                    zA = true;
                                                } else {
                                                    zA = E4.k.a(rVar, E0.o.f966B);
                                                }
                                                if (zA) {
                                                    C(this, y(i27), 2048, 64, 8);
                                                    C(this, y(i27), 2048, 0, 8);
                                                } else {
                                                    a6 = a7;
                                                    if (E4.k.a(rVar, E0.o.f973c)) {
                                                        C(this, y(i27), 2048, 64, 8);
                                                        C(this, y(i27), 2048, 0, 8);
                                                        arrayList3 = arrayList5;
                                                        iArr3 = iArr4;
                                                        lVar2 = lVar3;
                                                        i17 = length3;
                                                        i27 = i27;
                                                        lVar3 = lVar2;
                                                        i24 = i11;
                                                        length3 = i17;
                                                        a7 = a6;
                                                        arrayList5 = arrayList3;
                                                        iArr4 = iArr3;
                                                        jArr3 = jArr3;
                                                    } else {
                                                        rVar3 = E0.o.f965A;
                                                        zA2 = E4.k.a(rVar, rVar3);
                                                        d6 = lVar3.f946c;
                                                        arrayList3 = arrayList5;
                                                        linkedHashMap2 = hVar.f939h;
                                                        iArr3 = iArr4;
                                                        if (zA2) {
                                                            obj = linkedHashMap2.get(E0.o.f988s);
                                                            if (obj == null) {
                                                                obj = null;
                                                            }
                                                            eVar = (e) obj;
                                                            if (eVar == null && eVar.f911a == 4) {
                                                                z6 = true;
                                                            } else {
                                                                z6 = false;
                                                            }
                                                            if (z6) {
                                                                obj2 = linkedHashMap2.get(rVar3);
                                                                if (obj2 == null) {
                                                                    obj2 = null;
                                                                }
                                                                if (E4.k.a(obj2, Boolean.TRUE)) {
                                                                    accessibilityEventJ = j(y(i27), 4);
                                                                    l lVar6 = new l(lVar3.f944a, true, d6, hVar);
                                                                    obj3 = lVar6.i().f939h.get(E0.o.f971a);
                                                                    if (obj3 == null) {
                                                                        obj3 = null;
                                                                    }
                                                                    list = (List) obj3;
                                                                    if (list != null) {
                                                                        strR = G4.a.r(",", list);
                                                                    } else {
                                                                        strR = null;
                                                                    }
                                                                    obj4 = lVar6.i().f939h.get(E0.o.f990u);
                                                                    if (obj4 == null) {
                                                                        obj4 = null;
                                                                    }
                                                                    list2 = (List) obj4;
                                                                    if (list2 != null) {
                                                                        strR2 = G4.a.r(",", list2);
                                                                    } else {
                                                                        strR2 = null;
                                                                    }
                                                                    if (strR != null) {
                                                                        accessibilityEventJ.setContentDescription(strR);
                                                                    }
                                                                    if (strR2 != null) {
                                                                        accessibilityEventJ.getText().add(strR2);
                                                                    }
                                                                    A(accessibilityEventJ);
                                                                } else {
                                                                    C(this, y(i27), 2048, 0, 8);
                                                                }
                                                            } else {
                                                                C(this, y(i27), 2048, 64, 8);
                                                                C(this, y(i27), 2048, 0, 8);
                                                            }
                                                        } else if (E4.k.a(rVar, E0.o.f971a)) {
                                                            int iY3 = y(i27);
                                                            Object value7 = entry.getValue();
                                                            E4.k.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>", value7);
                                                            B(iY3, 2048, 4, (List) value7);
                                                        } else {
                                                            rVar4 = E0.o.f993x;
                                                            str2 = "";
                                                            if (E4.k.a(rVar, rVar4)) {
                                                                if (linkedHashMap2.containsKey(g.f921h)) {
                                                                    obj5 = linkedHashMap.get(rVar4);
                                                                    if (obj5 == null) {
                                                                        obj5 = null;
                                                                    }
                                                                    c0110f = (C0110f) obj5;
                                                                    if (c0110f == null) {
                                                                        c0110f = "";
                                                                    }
                                                                    obj6 = linkedHashMap2.get(rVar4);
                                                                    if (obj6 == null) {
                                                                        obj6 = null;
                                                                    }
                                                                    charSequence = (C0110f) obj6;
                                                                    if (charSequence == null) {
                                                                        charSequence = "";
                                                                    }
                                                                    l lVar7 = lVar3;
                                                                    charSequenceK = K(charSequence);
                                                                    length = c0110f.length();
                                                                    length2 = charSequence.length();
                                                                    if (length > length2) {
                                                                        i12 = length2;
                                                                    } else {
                                                                        i12 = length;
                                                                    }
                                                                    lVar = lVar7;
                                                                    i13 = 0;
                                                                    while (true) {
                                                                        i14 = length;
                                                                        if (i13 < i12) {
                                                                            jArr3 = jArr3;
                                                                            break;
                                                                        }
                                                                        jArr3 = jArr3;
                                                                        if (c0110f.charAt(i13) != charSequence.charAt(i13)) {
                                                                            break;
                                                                        }
                                                                        i13++;
                                                                        length = i14;
                                                                        jArr3 = jArr3;
                                                                    }
                                                                    i15 = 0;
                                                                    while (true) {
                                                                        if (i15 < i12 - i13) {
                                                                            i16 = i15;
                                                                            break;
                                                                        }
                                                                        i16 = i15;
                                                                        if (c0110f.charAt((i14 - 1) - i15) != charSequence.charAt((length2 - 1) - i16)) {
                                                                            break;
                                                                        } else {
                                                                            i15 = i16 + 1;
                                                                        }
                                                                    }
                                                                    int i210 = (i14 - i16) - i13;
                                                                    int i32 = (length2 - i16) - i13;
                                                                    E0.r rVar9 = E0.o.f967C;
                                                                    boolean zContainsKey4 = linkedHashMap.containsKey(rVar9);
                                                                    boolean zContainsKey5 = linkedHashMap2.containsKey(rVar9);
                                                                    zContainsKey = linkedHashMap.containsKey(E0.o.f993x);
                                                                    if (zContainsKey || zContainsKey4 || !zContainsKey5) {
                                                                        z7 = false;
                                                                    } else {
                                                                        z7 = true;
                                                                    }
                                                                    if (zContainsKey || !zContainsKey4 || zContainsKey5) {
                                                                        z8 = false;
                                                                    } else {
                                                                        z8 = true;
                                                                    }
                                                                    if (z7 || z8) {
                                                                        i27 = i27;
                                                                        accessibilityEventK = k(y(i27), 0, 0, Integer.valueOf(length2), charSequenceK);
                                                                    } else {
                                                                        accessibilityEventK = j(y(i27), 16);
                                                                        accessibilityEventK.setFromIndex(i13);
                                                                        accessibilityEventK.setRemovedCount(i210);
                                                                        accessibilityEventK.setAddedCount(i32);
                                                                        accessibilityEventK.setBeforeText(c0110f);
                                                                        accessibilityEventK.getText().add(charSequenceK);
                                                                        i27 = i27;
                                                                    }
                                                                    accessibilityEventK.setClassName("android.widget.EditText");
                                                                    A(accessibilityEventK);
                                                                    if (z7 || z8) {
                                                                        long j10 = ((I) hVar.g(E0.o.f994y)).f1470a;
                                                                        accessibilityEventK.setFromIndex((int) (j10 >> 32));
                                                                        accessibilityEventK.setToIndex((int) (j10 & 4294967295L));
                                                                        A(accessibilityEventK);
                                                                    }
                                                                } else {
                                                                    i27 = i27;
                                                                    lVar = lVar3;
                                                                    jArr3 = jArr3;
                                                                    i11 = i11;
                                                                    C(this, y(i27), 2048, Integer.valueOf(i9), 8);
                                                                }
                                                                lVar2 = lVar;
                                                                i17 = length3;
                                                                i27 = i27;
                                                                lVar3 = lVar2;
                                                                i24 = i11;
                                                                length3 = i17;
                                                                a7 = a6;
                                                                arrayList5 = arrayList3;
                                                                iArr4 = iArr3;
                                                                jArr3 = jArr3;
                                                            } else {
                                                                i27 = i27;
                                                                jArr3 = jArr3;
                                                                i11 = i11;
                                                                lVar2 = lVar3;
                                                                rVar5 = E0.o.f994y;
                                                                zA3 = E4.k.a(rVar, rVar5);
                                                                i17 = length3;
                                                                i18 = lVar2.f950g;
                                                                if (zA3) {
                                                                    obj7 = linkedHashMap2.get(rVar4);
                                                                    if (obj7 == null) {
                                                                        obj7 = null;
                                                                    }
                                                                    c0110f2 = (C0110f) obj7;
                                                                    if (c0110f2 != null && (str3 = c0110f2.f1494h) != null) {
                                                                        str2 = str3;
                                                                    }
                                                                    I i33 = (I) hVar.g(rVar5);
                                                                    int iY4 = y(i27);
                                                                    long j11 = i33.f1470a;
                                                                    A(k(iY4, Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) (j11 & 4294967295L)), Integer.valueOf(str2.length()), K(str2)));
                                                                    E(i18);
                                                                } else {
                                                                    if (E4.k.a(rVar, rVar7)) {
                                                                        zA4 = true;
                                                                    } else {
                                                                        zA4 = E4.k.a(rVar, E0.o.f985p);
                                                                    }
                                                                    if (zA4) {
                                                                        u(d6);
                                                                        size = arrayList4.size();
                                                                        i19 = 0;
                                                                        while (true) {
                                                                            if (i19 < size) {
                                                                                c1169z1 = null;
                                                                                break;
                                                                            } else {
                                                                                if (((C1169z0) arrayList4.get(i19)).f14570h == i27) {
                                                                                    c1169z1 = (C1169z0) arrayList4.get(i19);
                                                                                    break;
                                                                                }
                                                                                i19++;
                                                                            }
                                                                        }
                                                                        E4.k.c(c1169z1);
                                                                        obj8 = linkedHashMap2.get(rVar7);
                                                                        if (obj8 == null) {
                                                                            obj8 = null;
                                                                        }
                                                                        c1169z1.f14573l = (f) obj8;
                                                                        obj9 = linkedHashMap2.get(E0.o.f985p);
                                                                        if (obj9 == null) {
                                                                            obj9 = null;
                                                                        }
                                                                        c1169z1.f14574m = (f) obj9;
                                                                        if (c1169z1.i.contains(c1169z1)) {
                                                                            this.f14188d.getSnapshotObserver().a(c1169z1, this.f14187M, new C0024m(c1169z1, 19, this));
                                                                        }
                                                                    } else if (E4.k.a(rVar, E0.o.f980k)) {
                                                                        value = entry.getValue();
                                                                        E4.k.d("null cannot be cast to non-null type kotlin.Boolean", value);
                                                                        if (((Boolean) value).booleanValue()) {
                                                                            i20 = 8;
                                                                            A(j(y(i18), 8));
                                                                        } else {
                                                                            i20 = 8;
                                                                        }
                                                                        C(this, y(i18), 2048, 0, i20);
                                                                    } else {
                                                                        rVar6 = g.f933u;
                                                                        if (E4.k.a(rVar, rVar6)) {
                                                                            list3 = (List) hVar.g(rVar6);
                                                                            obj11 = linkedHashMap.get(rVar6);
                                                                            if (obj11 == null) {
                                                                                obj11 = null;
                                                                            }
                                                                            list4 = (List) obj11;
                                                                            if (list4 != null) {
                                                                                linkedHashSet = new LinkedHashSet();
                                                                                if (list3.size() <= 0) {
                                                                                    list3.get(0).getClass();
                                                                                    throw new ClassCastException();
                                                                                }
                                                                                linkedHashSet2 = new LinkedHashSet();
                                                                                if (list4.size() <= 0) {
                                                                                    list4.get(0).getClass();
                                                                                    throw new ClassCastException();
                                                                                }
                                                                                if (linkedHashSet.containsAll(linkedHashSet2) || !linkedHashSet2.containsAll(linkedHashSet)) {
                                                                                    z10 = true;
                                                                                } else {
                                                                                    z10 = false;
                                                                                }
                                                                            } else if (!list3.isEmpty()) {
                                                                                i27 = i27;
                                                                                lVar3 = lVar2;
                                                                                i24 = i11;
                                                                                length3 = i17;
                                                                                a7 = a6;
                                                                                arrayList5 = arrayList3;
                                                                                iArr4 = iArr3;
                                                                                jArr3 = jArr3;
                                                                                z10 = true;
                                                                            }
                                                                        } else if (entry.getValue() instanceof E0.a) {
                                                                            Object value8 = entry.getValue();
                                                                            E4.k.d("null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>", value8);
                                                                            aVar = (E0.a) value8;
                                                                            obj10 = linkedHashMap.get((E0.r) entry.getKey());
                                                                            if (obj10 == null) {
                                                                                obj10 = null;
                                                                            }
                                                                            if (aVar != obj10) {
                                                                                if (obj10 instanceof E0.a) {
                                                                                    aVar2 = (E0.a) obj10;
                                                                                    if (E4.k.a(aVar.f902a, aVar2.f902a)) {
                                                                                        p084p4.e eVar4 = aVar2.f903b;
                                                                                        p084p4.e eVar5 = aVar.f903b;
                                                                                        z9 = (eVar5 == null || eVar4 == null) && (eVar5 == null || eVar4 != null);
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (z9) {
                                                                                z10 = true;
                                                                            } else {
                                                                                z10 = false;
                                                                            }
                                                                        } else {
                                                                            z10 = true;
                                                                        }
                                                                    }
                                                                }
                                                                i27 = i27;
                                                                lVar3 = lVar2;
                                                                i24 = i11;
                                                                length3 = i17;
                                                                a7 = a6;
                                                                arrayList5 = arrayList3;
                                                                iArr4 = iArr3;
                                                                jArr3 = jArr3;
                                                            }
                                                        }
                                                        lVar2 = lVar3;
                                                        i17 = length3;
                                                        i27 = i27;
                                                        lVar3 = lVar2;
                                                        i24 = i11;
                                                        length3 = i17;
                                                        a7 = a6;
                                                        arrayList5 = arrayList3;
                                                        iArr4 = iArr3;
                                                        jArr3 = jArr3;
                                                    }
                                                }
                                            }
                                        }
                                        a6 = a7;
                                        arrayList3 = arrayList5;
                                        iArr3 = iArr4;
                                        lVar2 = lVar3;
                                        i17 = length3;
                                        i27 = i27;
                                        lVar3 = lVar2;
                                        i24 = i11;
                                        length3 = i17;
                                        a7 = a6;
                                        arrayList5 = arrayList3;
                                        iArr4 = iArr3;
                                        jArr3 = jArr3;
                                    }
                                }
                                int size2 = arrayList5.size();
                                int i34 = 0;
                                while (true) {
                                    if (i34 >= size2) {
                                        c1169z0 = null;
                                        break;
                                    }
                                    int i35 = size2;
                                    if (((C1169z0) arrayList5.get(i34)).f14570h == i27) {
                                        c1169z0 = (C1169z0) arrayList5.get(i34);
                                        break;
                                    } else {
                                        i34++;
                                        size2 = i35;
                                    }
                                }
                                if (c1169z0 != null) {
                                    z5 = false;
                                } else {
                                    c1169z0 = new C1169z0(i27, arrayList4);
                                    z5 = true;
                                }
                                arrayList4.add(c1169z0);
                                linkedHashMap = hVar2.f939h;
                                if (z5) {
                                    value2 = entry.getValue();
                                    obj12 = linkedHashMap.get((E0.r) entry.getKey());
                                    if (obj12 == null) {
                                        obj12 = null;
                                    }
                                    if (E4.k.a(value2, obj12)) {
                                        rVar = (E0.r) entry.getKey();
                                        rVar2 = E0.o.f974d;
                                        if (E4.k.a(rVar, rVar2)) {
                                            Object value9 = entry.getValue();
                                            E4.k.d("null cannot be cast to non-null type kotlin.String", value9);
                                            str = (String) value9;
                                            if (linkedHashMap.containsKey(rVar2)) {
                                                D(i27, str, 8);
                                            }
                                        } else {
                                            if (E4.k.a(rVar, E0.o.f972b)) {
                                                zA = true;
                                            } else {
                                                zA = E4.k.a(rVar, E0.o.f966B);
                                            }
                                            if (zA) {
                                                C(this, y(i27), 2048, 64, 8);
                                                C(this, y(i27), 2048, 0, 8);
                                            } else {
                                                a6 = a7;
                                                if (E4.k.a(rVar, E0.o.f973c)) {
                                                    C(this, y(i27), 2048, 64, 8);
                                                    C(this, y(i27), 2048, 0, 8);
                                                    arrayList3 = arrayList5;
                                                    iArr3 = iArr4;
                                                    lVar2 = lVar3;
                                                    i17 = length3;
                                                    i27 = i27;
                                                    lVar3 = lVar2;
                                                    i24 = i11;
                                                    length3 = i17;
                                                    a7 = a6;
                                                    arrayList5 = arrayList3;
                                                    iArr4 = iArr3;
                                                    jArr3 = jArr3;
                                                } else {
                                                    rVar3 = E0.o.f965A;
                                                    zA2 = E4.k.a(rVar, rVar3);
                                                    d6 = lVar3.f946c;
                                                    arrayList3 = arrayList5;
                                                    linkedHashMap2 = hVar.f939h;
                                                    iArr3 = iArr4;
                                                    if (zA2) {
                                                        obj = linkedHashMap2.get(E0.o.f988s);
                                                        if (obj == null) {
                                                            obj = null;
                                                        }
                                                        eVar = (e) obj;
                                                        if (eVar == null) {
                                                            z6 = false;
                                                        } else {
                                                            z6 = true;
                                                        }
                                                        if (z6) {
                                                            obj2 = linkedHashMap2.get(rVar3);
                                                            if (obj2 == null) {
                                                                obj2 = null;
                                                            }
                                                            if (E4.k.a(obj2, Boolean.TRUE)) {
                                                                accessibilityEventJ = j(y(i27), 4);
                                                                l lVar8 = new l(lVar3.f944a, true, d6, hVar);
                                                                obj3 = lVar8.i().f939h.get(E0.o.f971a);
                                                                if (obj3 == null) {
                                                                    obj3 = null;
                                                                }
                                                                list = (List) obj3;
                                                                if (list != null) {
                                                                    strR = G4.a.r(",", list);
                                                                } else {
                                                                    strR = null;
                                                                }
                                                                obj4 = lVar8.i().f939h.get(E0.o.f990u);
                                                                if (obj4 == null) {
                                                                    obj4 = null;
                                                                }
                                                                list2 = (List) obj4;
                                                                if (list2 != null) {
                                                                    strR2 = G4.a.r(",", list2);
                                                                } else {
                                                                    strR2 = null;
                                                                }
                                                                if (strR != null) {
                                                                    accessibilityEventJ.setContentDescription(strR);
                                                                }
                                                                if (strR2 != null) {
                                                                    accessibilityEventJ.getText().add(strR2);
                                                                }
                                                                A(accessibilityEventJ);
                                                            } else {
                                                                C(this, y(i27), 2048, 0, 8);
                                                            }
                                                        } else {
                                                            C(this, y(i27), 2048, 64, 8);
                                                            C(this, y(i27), 2048, 0, 8);
                                                        }
                                                    } else if (E4.k.a(rVar, E0.o.f971a)) {
                                                        int iY5 = y(i27);
                                                        Object value10 = entry.getValue();
                                                        E4.k.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>", value10);
                                                        B(iY5, 2048, 4, (List) value10);
                                                    } else {
                                                        rVar4 = E0.o.f993x;
                                                        str2 = "";
                                                        if (E4.k.a(rVar, rVar4)) {
                                                            if (linkedHashMap2.containsKey(g.f921h)) {
                                                                obj5 = linkedHashMap.get(rVar4);
                                                                if (obj5 == null) {
                                                                    obj5 = null;
                                                                }
                                                                c0110f = (C0110f) obj5;
                                                                if (c0110f == null) {
                                                                    c0110f = "";
                                                                }
                                                                obj6 = linkedHashMap2.get(rVar4);
                                                                if (obj6 == null) {
                                                                    obj6 = null;
                                                                }
                                                                charSequence = (C0110f) obj6;
                                                                if (charSequence == null) {
                                                                    charSequence = "";
                                                                }
                                                                l lVar9 = lVar3;
                                                                charSequenceK = K(charSequence);
                                                                length = c0110f.length();
                                                                length2 = charSequence.length();
                                                                if (length > length2) {
                                                                    i12 = length2;
                                                                } else {
                                                                    i12 = length;
                                                                }
                                                                lVar = lVar9;
                                                                i13 = 0;
                                                                while (true) {
                                                                    i14 = length;
                                                                    if (i13 < i12) {
                                                                        jArr3 = jArr3;
                                                                        break;
                                                                    }
                                                                    jArr3 = jArr3;
                                                                    if (c0110f.charAt(i13) != charSequence.charAt(i13)) {
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        i13++;
                                                                        length = i14;
                                                                        jArr3 = jArr3;
                                                                    }
                                                                }
                                                                i15 = 0;
                                                                while (true) {
                                                                    if (i15 < i12 - i13) {
                                                                        i16 = i15;
                                                                        break;
                                                                    }
                                                                    i16 = i15;
                                                                    if (c0110f.charAt((i14 - 1) - i15) != charSequence.charAt((length2 - 1) - i16)) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i15 = i16 + 1;
                                                                }
                                                                int i211 = (i14 - i16) - i13;
                                                                int i36 = (length2 - i16) - i13;
                                                                E0.r rVar10 = E0.o.f967C;
                                                                boolean zContainsKey6 = linkedHashMap.containsKey(rVar10);
                                                                boolean zContainsKey7 = linkedHashMap2.containsKey(rVar10);
                                                                zContainsKey = linkedHashMap.containsKey(E0.o.f993x);
                                                                if (zContainsKey) {
                                                                    z7 = false;
                                                                } else {
                                                                    z7 = false;
                                                                }
                                                                if (zContainsKey) {
                                                                    z8 = false;
                                                                } else {
                                                                    z8 = false;
                                                                }
                                                                if (z7) {
                                                                    i27 = i27;
                                                                    accessibilityEventK = k(y(i27), 0, 0, Integer.valueOf(length2), charSequenceK);
                                                                } else {
                                                                    i27 = i27;
                                                                    accessibilityEventK = k(y(i27), 0, 0, Integer.valueOf(length2), charSequenceK);
                                                                }
                                                                accessibilityEventK.setClassName("android.widget.EditText");
                                                                A(accessibilityEventK);
                                                                if (z7) {
                                                                    long j12 = ((I) hVar.g(E0.o.f994y)).f1470a;
                                                                    accessibilityEventK.setFromIndex((int) (j12 >> 32));
                                                                    accessibilityEventK.setToIndex((int) (j12 & 4294967295L));
                                                                    A(accessibilityEventK);
                                                                } else {
                                                                    long j13 = ((I) hVar.g(E0.o.f994y)).f1470a;
                                                                    accessibilityEventK.setFromIndex((int) (j13 >> 32));
                                                                    accessibilityEventK.setToIndex((int) (j13 & 4294967295L));
                                                                    A(accessibilityEventK);
                                                                }
                                                            } else {
                                                                i27 = i27;
                                                                lVar = lVar3;
                                                                jArr3 = jArr3;
                                                                i11 = i11;
                                                                C(this, y(i27), 2048, Integer.valueOf(i9), 8);
                                                            }
                                                            lVar2 = lVar;
                                                            i17 = length3;
                                                            i27 = i27;
                                                            lVar3 = lVar2;
                                                            i24 = i11;
                                                            length3 = i17;
                                                            a7 = a6;
                                                            arrayList5 = arrayList3;
                                                            iArr4 = iArr3;
                                                            jArr3 = jArr3;
                                                        } else {
                                                            i27 = i27;
                                                            jArr3 = jArr3;
                                                            i11 = i11;
                                                            lVar2 = lVar3;
                                                            rVar5 = E0.o.f994y;
                                                            zA3 = E4.k.a(rVar, rVar5);
                                                            i17 = length3;
                                                            i18 = lVar2.f950g;
                                                            if (zA3) {
                                                                obj7 = linkedHashMap2.get(rVar4);
                                                                if (obj7 == null) {
                                                                    obj7 = null;
                                                                }
                                                                c0110f2 = (C0110f) obj7;
                                                                if (c0110f2 != null) {
                                                                    str2 = str3;
                                                                }
                                                                I i37 = (I) hVar.g(rVar5);
                                                                int iY6 = y(i27);
                                                                long j14 = i37.f1470a;
                                                                A(k(iY6, Integer.valueOf((int) (j14 >> 32)), Integer.valueOf((int) (j14 & 4294967295L)), Integer.valueOf(str2.length()), K(str2)));
                                                                E(i18);
                                                            } else {
                                                                if (E4.k.a(rVar, rVar7)) {
                                                                    zA4 = true;
                                                                } else {
                                                                    zA4 = E4.k.a(rVar, E0.o.f985p);
                                                                }
                                                                if (zA4) {
                                                                    u(d6);
                                                                    size = arrayList4.size();
                                                                    i19 = 0;
                                                                    while (true) {
                                                                        if (i19 < size) {
                                                                            c1169z1 = null;
                                                                            break;
                                                                        } else {
                                                                            if (((C1169z0) arrayList4.get(i19)).f14570h == i27) {
                                                                                c1169z1 = (C1169z0) arrayList4.get(i19);
                                                                                break;
                                                                            }
                                                                            i19++;
                                                                        }
                                                                    }
                                                                    E4.k.c(c1169z1);
                                                                    obj8 = linkedHashMap2.get(rVar7);
                                                                    if (obj8 == null) {
                                                                        obj8 = null;
                                                                    }
                                                                    c1169z1.f14573l = (f) obj8;
                                                                    obj9 = linkedHashMap2.get(E0.o.f985p);
                                                                    if (obj9 == null) {
                                                                        obj9 = null;
                                                                    }
                                                                    c1169z1.f14574m = (f) obj9;
                                                                    if (c1169z1.i.contains(c1169z1)) {
                                                                        this.f14188d.getSnapshotObserver().a(c1169z1, this.f14187M, new C0024m(c1169z1, 19, this));
                                                                    }
                                                                } else if (E4.k.a(rVar, E0.o.f980k)) {
                                                                    value = entry.getValue();
                                                                    E4.k.d("null cannot be cast to non-null type kotlin.Boolean", value);
                                                                    if (((Boolean) value).booleanValue()) {
                                                                        i20 = 8;
                                                                        A(j(y(i18), 8));
                                                                    } else {
                                                                        i20 = 8;
                                                                    }
                                                                    C(this, y(i18), 2048, 0, i20);
                                                                } else {
                                                                    rVar6 = g.f933u;
                                                                    if (E4.k.a(rVar, rVar6)) {
                                                                        list3 = (List) hVar.g(rVar6);
                                                                        obj11 = linkedHashMap.get(rVar6);
                                                                        if (obj11 == null) {
                                                                            obj11 = null;
                                                                        }
                                                                        list4 = (List) obj11;
                                                                        if (list4 != null) {
                                                                            linkedHashSet = new LinkedHashSet();
                                                                            if (list3.size() <= 0) {
                                                                                list3.get(0).getClass();
                                                                                throw new ClassCastException();
                                                                            }
                                                                            linkedHashSet2 = new LinkedHashSet();
                                                                            if (list4.size() <= 0) {
                                                                                list4.get(0).getClass();
                                                                                throw new ClassCastException();
                                                                            }
                                                                            if (linkedHashSet.containsAll(linkedHashSet2)) {
                                                                                z10 = true;
                                                                            } else {
                                                                                z10 = true;
                                                                            }
                                                                        } else if (!list3.isEmpty()) {
                                                                            i27 = i27;
                                                                            lVar3 = lVar2;
                                                                            i24 = i11;
                                                                            length3 = i17;
                                                                            a7 = a6;
                                                                            arrayList5 = arrayList3;
                                                                            iArr4 = iArr3;
                                                                            jArr3 = jArr3;
                                                                            z10 = true;
                                                                        }
                                                                    } else if (entry.getValue() instanceof E0.a) {
                                                                        Object value11 = entry.getValue();
                                                                        E4.k.d("null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>", value11);
                                                                        aVar = (E0.a) value11;
                                                                        obj10 = linkedHashMap.get((E0.r) entry.getKey());
                                                                        if (obj10 == null) {
                                                                            obj10 = null;
                                                                        }
                                                                        if (aVar != obj10) {
                                                                            if (obj10 instanceof E0.a) {
                                                                                aVar2 = (E0.a) obj10;
                                                                                if (E4.k.a(aVar.f902a, aVar2.f902a)) {
                                                                                    p084p4.e eVar6 = aVar2.f903b;
                                                                                    p084p4.e eVar7 = aVar.f903b;
                                                                                    if (eVar7 == null) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        if (z9) {
                                                                            z10 = true;
                                                                        } else {
                                                                            z10 = false;
                                                                        }
                                                                    } else {
                                                                        z10 = true;
                                                                    }
                                                                }
                                                            }
                                                            i27 = i27;
                                                            lVar3 = lVar2;
                                                            i24 = i11;
                                                            length3 = i17;
                                                            a7 = a6;
                                                            arrayList5 = arrayList3;
                                                            iArr4 = iArr3;
                                                            jArr3 = jArr3;
                                                        }
                                                    }
                                                    lVar2 = lVar3;
                                                    i17 = length3;
                                                    i27 = i27;
                                                    lVar3 = lVar2;
                                                    i24 = i11;
                                                    length3 = i17;
                                                    a7 = a6;
                                                    arrayList5 = arrayList3;
                                                    iArr4 = iArr3;
                                                    jArr3 = jArr3;
                                                }
                                            }
                                        }
                                    }
                                    a6 = a7;
                                    arrayList3 = arrayList5;
                                    iArr3 = iArr4;
                                    lVar2 = lVar3;
                                    i17 = length3;
                                    i27 = i27;
                                    lVar3 = lVar2;
                                    i24 = i11;
                                    length3 = i17;
                                    a7 = a6;
                                    arrayList5 = arrayList3;
                                    iArr4 = iArr3;
                                    jArr3 = jArr3;
                                } else {
                                    rVar = (E0.r) entry.getKey();
                                    rVar2 = E0.o.f974d;
                                    if (E4.k.a(rVar, rVar2)) {
                                        Object value12 = entry.getValue();
                                        E4.k.d("null cannot be cast to non-null type kotlin.String", value12);
                                        str = (String) value12;
                                        if (linkedHashMap.containsKey(rVar2)) {
                                            D(i27, str, 8);
                                        }
                                    } else {
                                        if (E4.k.a(rVar, E0.o.f972b)) {
                                            zA = true;
                                        } else {
                                            zA = E4.k.a(rVar, E0.o.f966B);
                                        }
                                        if (zA) {
                                            C(this, y(i27), 2048, 64, 8);
                                            C(this, y(i27), 2048, 0, 8);
                                        } else {
                                            a6 = a7;
                                            if (E4.k.a(rVar, E0.o.f973c)) {
                                                C(this, y(i27), 2048, 64, 8);
                                                C(this, y(i27), 2048, 0, 8);
                                                arrayList3 = arrayList5;
                                                iArr3 = iArr4;
                                                lVar2 = lVar3;
                                                i17 = length3;
                                                i27 = i27;
                                                lVar3 = lVar2;
                                                i24 = i11;
                                                length3 = i17;
                                                a7 = a6;
                                                arrayList5 = arrayList3;
                                                iArr4 = iArr3;
                                                jArr3 = jArr3;
                                            } else {
                                                rVar3 = E0.o.f965A;
                                                zA2 = E4.k.a(rVar, rVar3);
                                                d6 = lVar3.f946c;
                                                arrayList3 = arrayList5;
                                                linkedHashMap2 = hVar.f939h;
                                                iArr3 = iArr4;
                                                if (zA2) {
                                                    obj = linkedHashMap2.get(E0.o.f988s);
                                                    if (obj == null) {
                                                        obj = null;
                                                    }
                                                    eVar = (e) obj;
                                                    if (eVar == null) {
                                                        z6 = false;
                                                    } else {
                                                        z6 = true;
                                                    }
                                                    if (z6) {
                                                        obj2 = linkedHashMap2.get(rVar3);
                                                        if (obj2 == null) {
                                                            obj2 = null;
                                                        }
                                                        if (E4.k.a(obj2, Boolean.TRUE)) {
                                                            accessibilityEventJ = j(y(i27), 4);
                                                            l lVar10 = new l(lVar3.f944a, true, d6, hVar);
                                                            obj3 = lVar10.i().f939h.get(E0.o.f971a);
                                                            if (obj3 == null) {
                                                                obj3 = null;
                                                            }
                                                            list = (List) obj3;
                                                            if (list != null) {
                                                                strR = G4.a.r(",", list);
                                                            } else {
                                                                strR = null;
                                                            }
                                                            obj4 = lVar10.i().f939h.get(E0.o.f990u);
                                                            if (obj4 == null) {
                                                                obj4 = null;
                                                            }
                                                            list2 = (List) obj4;
                                                            if (list2 != null) {
                                                                strR2 = G4.a.r(",", list2);
                                                            } else {
                                                                strR2 = null;
                                                            }
                                                            if (strR != null) {
                                                                accessibilityEventJ.setContentDescription(strR);
                                                            }
                                                            if (strR2 != null) {
                                                                accessibilityEventJ.getText().add(strR2);
                                                            }
                                                            A(accessibilityEventJ);
                                                        } else {
                                                            C(this, y(i27), 2048, 0, 8);
                                                        }
                                                    } else {
                                                        C(this, y(i27), 2048, 64, 8);
                                                        C(this, y(i27), 2048, 0, 8);
                                                    }
                                                } else if (E4.k.a(rVar, E0.o.f971a)) {
                                                    int iY7 = y(i27);
                                                    Object value13 = entry.getValue();
                                                    E4.k.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>", value13);
                                                    B(iY7, 2048, 4, (List) value13);
                                                } else {
                                                    rVar4 = E0.o.f993x;
                                                    str2 = "";
                                                    if (E4.k.a(rVar, rVar4)) {
                                                        if (linkedHashMap2.containsKey(g.f921h)) {
                                                            obj5 = linkedHashMap.get(rVar4);
                                                            if (obj5 == null) {
                                                                obj5 = null;
                                                            }
                                                            c0110f = (C0110f) obj5;
                                                            if (c0110f == null) {
                                                                c0110f = "";
                                                            }
                                                            obj6 = linkedHashMap2.get(rVar4);
                                                            if (obj6 == null) {
                                                                obj6 = null;
                                                            }
                                                            charSequence = (C0110f) obj6;
                                                            if (charSequence == null) {
                                                                charSequence = "";
                                                            }
                                                            l lVar11 = lVar3;
                                                            charSequenceK = K(charSequence);
                                                            length = c0110f.length();
                                                            length2 = charSequence.length();
                                                            if (length > length2) {
                                                                i12 = length2;
                                                            } else {
                                                                i12 = length;
                                                            }
                                                            lVar = lVar11;
                                                            i13 = 0;
                                                            while (true) {
                                                                i14 = length;
                                                                if (i13 < i12) {
                                                                    jArr3 = jArr3;
                                                                    break;
                                                                }
                                                                jArr3 = jArr3;
                                                                if (c0110f.charAt(i13) != charSequence.charAt(i13)) {
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    i13++;
                                                                    length = i14;
                                                                    jArr3 = jArr3;
                                                                }
                                                            }
                                                            i15 = 0;
                                                            while (true) {
                                                                if (i15 < i12 - i13) {
                                                                    i16 = i15;
                                                                    break;
                                                                }
                                                                i16 = i15;
                                                                if (c0110f.charAt((i14 - 1) - i15) != charSequence.charAt((length2 - 1) - i16)) {
                                                                    break;
                                                                    break;
                                                                }
                                                                i15 = i16 + 1;
                                                            }
                                                            int i212 = (i14 - i16) - i13;
                                                            int i38 = (length2 - i16) - i13;
                                                            E0.r rVar11 = E0.o.f967C;
                                                            boolean zContainsKey8 = linkedHashMap.containsKey(rVar11);
                                                            boolean zContainsKey9 = linkedHashMap2.containsKey(rVar11);
                                                            zContainsKey = linkedHashMap.containsKey(E0.o.f993x);
                                                            if (zContainsKey) {
                                                                z7 = false;
                                                            } else {
                                                                z7 = false;
                                                            }
                                                            if (zContainsKey) {
                                                                z8 = false;
                                                            } else {
                                                                z8 = false;
                                                            }
                                                            if (z7) {
                                                                i27 = i27;
                                                                accessibilityEventK = k(y(i27), 0, 0, Integer.valueOf(length2), charSequenceK);
                                                            } else {
                                                                i27 = i27;
                                                                accessibilityEventK = k(y(i27), 0, 0, Integer.valueOf(length2), charSequenceK);
                                                            }
                                                            accessibilityEventK.setClassName("android.widget.EditText");
                                                            A(accessibilityEventK);
                                                            if (z7) {
                                                                long j15 = ((I) hVar.g(E0.o.f994y)).f1470a;
                                                                accessibilityEventK.setFromIndex((int) (j15 >> 32));
                                                                accessibilityEventK.setToIndex((int) (j15 & 4294967295L));
                                                                A(accessibilityEventK);
                                                            } else {
                                                                long j16 = ((I) hVar.g(E0.o.f994y)).f1470a;
                                                                accessibilityEventK.setFromIndex((int) (j16 >> 32));
                                                                accessibilityEventK.setToIndex((int) (j16 & 4294967295L));
                                                                A(accessibilityEventK);
                                                            }
                                                        } else {
                                                            i27 = i27;
                                                            lVar = lVar3;
                                                            jArr3 = jArr3;
                                                            i11 = i11;
                                                            C(this, y(i27), 2048, Integer.valueOf(i9), 8);
                                                        }
                                                        lVar2 = lVar;
                                                        i17 = length3;
                                                        i27 = i27;
                                                        lVar3 = lVar2;
                                                        i24 = i11;
                                                        length3 = i17;
                                                        a7 = a6;
                                                        arrayList5 = arrayList3;
                                                        iArr4 = iArr3;
                                                        jArr3 = jArr3;
                                                    } else {
                                                        i27 = i27;
                                                        jArr3 = jArr3;
                                                        i11 = i11;
                                                        lVar2 = lVar3;
                                                        rVar5 = E0.o.f994y;
                                                        zA3 = E4.k.a(rVar, rVar5);
                                                        i17 = length3;
                                                        i18 = lVar2.f950g;
                                                        if (zA3) {
                                                            obj7 = linkedHashMap2.get(rVar4);
                                                            if (obj7 == null) {
                                                                obj7 = null;
                                                            }
                                                            c0110f2 = (C0110f) obj7;
                                                            if (c0110f2 != null) {
                                                                str2 = str3;
                                                            }
                                                            I i39 = (I) hVar.g(rVar5);
                                                            int iY8 = y(i27);
                                                            long j17 = i39.f1470a;
                                                            A(k(iY8, Integer.valueOf((int) (j17 >> 32)), Integer.valueOf((int) (j17 & 4294967295L)), Integer.valueOf(str2.length()), K(str2)));
                                                            E(i18);
                                                        } else {
                                                            if (E4.k.a(rVar, rVar7)) {
                                                                zA4 = true;
                                                            } else {
                                                                zA4 = E4.k.a(rVar, E0.o.f985p);
                                                            }
                                                            if (zA4) {
                                                                u(d6);
                                                                size = arrayList4.size();
                                                                i19 = 0;
                                                                while (true) {
                                                                    if (i19 < size) {
                                                                        c1169z1 = null;
                                                                        break;
                                                                    } else {
                                                                        if (((C1169z0) arrayList4.get(i19)).f14570h == i27) {
                                                                            c1169z1 = (C1169z0) arrayList4.get(i19);
                                                                            break;
                                                                        }
                                                                        i19++;
                                                                    }
                                                                }
                                                                E4.k.c(c1169z1);
                                                                obj8 = linkedHashMap2.get(rVar7);
                                                                if (obj8 == null) {
                                                                    obj8 = null;
                                                                }
                                                                c1169z1.f14573l = (f) obj8;
                                                                obj9 = linkedHashMap2.get(E0.o.f985p);
                                                                if (obj9 == null) {
                                                                    obj9 = null;
                                                                }
                                                                c1169z1.f14574m = (f) obj9;
                                                                if (c1169z1.i.contains(c1169z1)) {
                                                                    this.f14188d.getSnapshotObserver().a(c1169z1, this.f14187M, new C0024m(c1169z1, 19, this));
                                                                }
                                                            } else if (E4.k.a(rVar, E0.o.f980k)) {
                                                                value = entry.getValue();
                                                                E4.k.d("null cannot be cast to non-null type kotlin.Boolean", value);
                                                                if (((Boolean) value).booleanValue()) {
                                                                    i20 = 8;
                                                                    A(j(y(i18), 8));
                                                                } else {
                                                                    i20 = 8;
                                                                }
                                                                C(this, y(i18), 2048, 0, i20);
                                                            } else {
                                                                rVar6 = g.f933u;
                                                                if (E4.k.a(rVar, rVar6)) {
                                                                    list3 = (List) hVar.g(rVar6);
                                                                    obj11 = linkedHashMap.get(rVar6);
                                                                    if (obj11 == null) {
                                                                        obj11 = null;
                                                                    }
                                                                    list4 = (List) obj11;
                                                                    if (list4 != null) {
                                                                        linkedHashSet = new LinkedHashSet();
                                                                        if (list3.size() <= 0) {
                                                                            list3.get(0).getClass();
                                                                            throw new ClassCastException();
                                                                        }
                                                                        linkedHashSet2 = new LinkedHashSet();
                                                                        if (list4.size() <= 0) {
                                                                            list4.get(0).getClass();
                                                                            throw new ClassCastException();
                                                                        }
                                                                        if (linkedHashSet.containsAll(linkedHashSet2)) {
                                                                            z10 = true;
                                                                        } else {
                                                                            z10 = true;
                                                                        }
                                                                    } else if (!list3.isEmpty()) {
                                                                        i27 = i27;
                                                                        lVar3 = lVar2;
                                                                        i24 = i11;
                                                                        length3 = i17;
                                                                        a7 = a6;
                                                                        arrayList5 = arrayList3;
                                                                        iArr4 = iArr3;
                                                                        jArr3 = jArr3;
                                                                        z10 = true;
                                                                    }
                                                                } else if (entry.getValue() instanceof E0.a) {
                                                                    Object value14 = entry.getValue();
                                                                    E4.k.d("null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>", value14);
                                                                    aVar = (E0.a) value14;
                                                                    obj10 = linkedHashMap.get((E0.r) entry.getKey());
                                                                    if (obj10 == null) {
                                                                        obj10 = null;
                                                                    }
                                                                    if (aVar != obj10) {
                                                                        if (obj10 instanceof E0.a) {
                                                                            aVar2 = (E0.a) obj10;
                                                                            if (E4.k.a(aVar.f902a, aVar2.f902a)) {
                                                                                p084p4.e eVar8 = aVar2.f903b;
                                                                                p084p4.e eVar9 = aVar.f903b;
                                                                                if (eVar9 == null) {
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (z9) {
                                                                        z10 = true;
                                                                    } else {
                                                                        z10 = false;
                                                                    }
                                                                } else {
                                                                    z10 = true;
                                                                }
                                                            }
                                                        }
                                                        i27 = i27;
                                                        lVar3 = lVar2;
                                                        i24 = i11;
                                                        length3 = i17;
                                                        a7 = a6;
                                                        arrayList5 = arrayList3;
                                                        iArr4 = iArr3;
                                                        jArr3 = jArr3;
                                                    }
                                                }
                                                lVar2 = lVar3;
                                                i17 = length3;
                                                i27 = i27;
                                                lVar3 = lVar2;
                                                i24 = i11;
                                                length3 = i17;
                                                a7 = a6;
                                                arrayList5 = arrayList3;
                                                iArr4 = iArr3;
                                                jArr3 = jArr3;
                                            }
                                        }
                                    }
                                    a6 = a7;
                                    arrayList3 = arrayList5;
                                    iArr3 = iArr4;
                                    lVar2 = lVar3;
                                    i17 = length3;
                                    i27 = i27;
                                    lVar3 = lVar2;
                                    i24 = i11;
                                    length3 = i17;
                                    a7 = a6;
                                    arrayList5 = arrayList3;
                                    iArr4 = iArr3;
                                    jArr3 = jArr3;
                                }
                            } else {
                                i8 = i25;
                                i6 = i24;
                                arrayList2 = arrayList5;
                                iArr2 = iArr4;
                                jArr2 = jArr3;
                                i10 = length3;
                                int i40 = i27;
                                l lVar12 = lVar3;
                                if (!z10) {
                                    Iterator it2 = hVar2.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            z10 = false;
                                            break;
                                        }
                                        if (!lVar12.i().f939h.containsKey((E0.r) ((Map.Entry) it2.next()).getKey())) {
                                            z10 = true;
                                            break;
                                        }
                                    }
                                }
                                if (z10) {
                                    i7 = 8;
                                    C(this, y(i40), 2048, 0, 8);
                                    break;
                                }
                                i7 = 8;
                            }
                        }
                    }
                    break;
                    j6 >>= i7;
                    i25 = i8 + 1;
                    int i41 = i6;
                    i23 = i7;
                    i24 = i41;
                    qVar2 = qVar;
                    i21 = i9;
                    length3 = i10;
                    arrayList5 = arrayList2;
                    iArr4 = iArr2;
                    jArr3 = jArr2;
                }
                arrayList = arrayList5;
                iArr = iArr4;
                jArr = jArr3;
                i = i21;
                int i42 = length3;
                if (i24 != i23) {
                    return;
                } else {
                    i3 = i42;
                }
            } else {
                arrayList = arrayList5;
                iArr = iArr4;
                jArr = jArr3;
                i = i21;
                i3 = length3;
            }
            if (i22 == i3) {
                return;
            }
            i22++;
            qVar2 = qVar;
            length3 = i3;
            i21 = i;
            arrayList5 = arrayList;
            iArr4 = iArr;
            jArr3 = jArr;
        }
    }

    public final void G(D d6, r rVar) {
        E0.h hVarN;
        if (d6.D() && !this.f14188d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(d6)) {
            D d7 = null;
            if (!d6.f13828C.f(8)) {
                d6 = d6.r();
                while (true) {
                    if (d6 == null) {
                        d6 = null;
                        break;
                    } else if (d6.f13828C.f(8)) {
                        break;
                    } else {
                        d6 = d6.r();
                    }
                }
            }
            if (d6 == null || (hVarN = d6.n()) == null) {
                return;
            }
            if (!hVarN.i) {
                for (D dR = d6.r(); dR != null; dR = dR.r()) {
                    E0.h hVarN2 = dR.n();
                    if (hVarN2 != null && hVarN2.i) {
                        d7 = dR;
                        break;
                    }
                }
                if (d7 != null) {
                    d6 = d7;
                }
            }
            int i = d6.i;
            if (rVar.a(i)) {
                C(this, y(i), 2048, 1, 8);
            }
        }
    }

    public final void H(D d6) {
        if (d6.D() && !this.f14188d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(d6)) {
            int i = d6.i;
            f fVar = (f) this.f14200q.f(i);
            f fVar2 = (f) this.f14201r.f(i);
            if (fVar == null && fVar2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventJ = j(i, 4096);
            if (fVar != null) {
                accessibilityEventJ.setScrollX((int) ((Number) fVar.f912a.invoke()).floatValue());
                accessibilityEventJ.setMaxScrollX((int) ((Number) fVar.f913b.invoke()).floatValue());
            }
            if (fVar2 != null) {
                accessibilityEventJ.setScrollY((int) ((Number) fVar2.f912a.invoke()).floatValue());
                accessibilityEventJ.setMaxScrollY((int) ((Number) fVar2.f913b.invoke()).floatValue());
            }
            A(accessibilityEventJ);
        }
    }

    public final boolean I(l lVar, int i, int i3, boolean z5) {
        String strR;
        E0.h hVar = lVar.f947d;
        E0.r rVar = g.f920g;
        if (hVar.f939h.containsKey(rVar) && H.l(lVar)) {
            D4.f fVar = (D4.f) ((E0.a) lVar.f947d.g(rVar)).f903b;
            if (fVar != null) {
                return ((Boolean) fVar.c(Integer.valueOf(i), Integer.valueOf(i3), Boolean.valueOf(z5))).booleanValue();
            }
        } else if ((i != i3 || i3 != this.f14204u) && (strR = r(lVar)) != null) {
            if (i < 0 || i != i3 || i3 > strR.length()) {
                i = -1;
            }
            this.f14204u = i;
            boolean z6 = strR.length() > 0;
            int i6 = lVar.f950g;
            A(k(y(i6), z6 ? Integer.valueOf(this.f14204u) : null, z6 ? Integer.valueOf(this.f14204u) : null, z6 ? Integer.valueOf(strR.length()) : null, strR));
            E(i6);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00be  */
    public final ArrayList J(boolean z5, ArrayList arrayList) {
        boolean z6;
        int i = 5;
        boolean z7 = true;
        q qVar = p080p.i.f10737a;
        q qVar2 = new q();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            l((l) arrayList.get(i3), arrayList2, qVar2);
        }
        ArrayList arrayList3 = new ArrayList();
        int iL = m.L(arrayList2);
        if (iL >= 0) {
            int i6 = 0;
            while (true) {
                l lVar = (l) arrayList2.get(i6);
                if (i6 == 0) {
                    z6 = z7;
                    arrayList3.add(new p084p4.h(lVar.f(), m.N(lVar)));
                    break;
                }
                p030f0.d dVarF = lVar.f();
                p030f0.d dVarF2 = lVar.f();
                float f6 = dVarF.f8840b;
                float f7 = dVarF2.f8842d;
                boolean z8 = f6 >= f7 ? z7 : false;
                int iL2 = m.L(arrayList3);
                if (iL2 >= 0) {
                    int i7 = 0;
                    while (true) {
                        p030f0.d dVar = (p030f0.d) ((p084p4.h) arrayList3.get(i7)).f10849h;
                        z6 = z7;
                        float f8 = dVar.f8840b;
                        float f9 = dVar.f8842d;
                        boolean z9 = f8 >= f9 ? z6 : false;
                        if (!z8 && !z9 && Math.max(f6, f8) < Math.min(f7, f9)) {
                            arrayList3.set(i7, new p084p4.h(new p030f0.d(Math.max(dVar.f8839a, 0.0f), Math.max(dVar.f8840b, f6), Math.min(dVar.f8841c, Float.POSITIVE_INFINITY), Math.min(f9, f7)), ((p084p4.h) arrayList3.get(i7)).i));
                            ((List) ((p084p4.h) arrayList3.get(i7)).i).add(lVar);
                            break;
                        }
                        if (i7 != iL2) {
                            i7++;
                            z7 = z6;
                        }
                    }
                } else {
                    z6 = z7;
                }
                arrayList3.add(new p084p4.h(lVar.f(), m.N(lVar)));
                break;
                if (i6 == iL) {
                    break;
                }
                i6++;
                z7 = z6;
            }
        }
        p089q4.q.Q(arrayList3, C1164x.f14543d);
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList3.size();
        for (int i8 = 0; i8 < size2; i8++) {
            p084p4.h hVar = (p084p4.h) arrayList3.get(i8);
            p089q4.q.Q((List) hVar.i, new C0303z0(new C0303z0(z5 ? C1164x.f14542c : C1164x.f14541b), i));
            arrayList4.addAll((Collection) hVar.i);
        }
        p089q4.q.Q(arrayList4, new D3.k(i));
        int size3 = 0;
        while (size3 <= m.L(arrayList4)) {
            List list = (List) qVar2.f(((l) arrayList4.get(size3)).f950g);
            if (list != null) {
                if (t((l) arrayList4.get(size3))) {
                    size3++;
                } else {
                    arrayList4.remove(size3);
                }
                arrayList4.addAll(size3, list);
                size3 += list.size();
            } else {
                size3++;
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0063  */
    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:22:0x007a  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    public final void L() {
        char c6;
        long j4;
        long j6;
        long j7;
        long[] jArr;
        long[] jArr2;
        long j8;
        int i;
        int iNumberOfTrailingZeros;
        char c7;
        long j9;
        A0 a6;
        String str;
        Object obj;
        Object obj2;
        r rVar = new r();
        r rVar2 = this.f14180B;
        int[] iArr = rVar2.f10767b;
        long[] jArr3 = rVar2.f10766a;
        int length = jArr3.length - 2;
        q qVar = this.H;
        char c8 = 7;
        long j10 = -9187201950435737472L;
        int i3 = 8;
        if (length >= 0) {
            int i6 = 0;
            j6 = 128;
            while (true) {
                long j11 = jArr3[i6];
                j7 = 255;
                if ((((~j11) << c8) & j11 & j10) != j10) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j11 & 255) < 128) {
                            c7 = c8;
                            int i9 = iArr[(i6 << 3) + i8];
                            j9 = j10;
                            B0 b6 = (B0) o().f(i9);
                            l lVar = b6 != null ? b6.f14210a : null;
                            if (lVar == null) {
                                rVar.a(i9);
                                a6 = (A0) qVar.f(i9);
                                if (a6 != null) {
                                    obj = a6.f14176a.f939h.get(E0.o.f974d);
                                    if (obj == null) {
                                        obj2 = null;
                                    } else {
                                        obj2 = obj;
                                    }
                                    str = (String) obj2;
                                } else {
                                    str = null;
                                }
                                D(i9, str, 32);
                            } else if (!lVar.f947d.f939h.containsKey(E0.o.f974d)) {
                                rVar.a(i9);
                                a6 = (A0) qVar.f(i9);
                                if (a6 != null) {
                                    obj = a6.f14176a.f939h.get(E0.o.f974d);
                                    if (obj == null) {
                                        obj2 = null;
                                    } else {
                                        obj2 = obj;
                                    }
                                    str = (String) obj2;
                                } else {
                                    str = null;
                                }
                                D(i9, str, 32);
                            }
                        } else {
                            c7 = c8;
                            j9 = j10;
                        }
                        j11 >>= 8;
                        i8++;
                        c8 = c7;
                        j10 = j9;
                    }
                    c6 = c8;
                    j4 = j10;
                    if (i7 != 8) {
                        break;
                    }
                } else {
                    c6 = c8;
                    j4 = j10;
                }
                if (i6 == length) {
                    break;
                }
                i6++;
                c8 = c6;
                j10 = j4;
            }
        } else {
            c6 = 7;
            j4 = -9187201950435737472L;
            j6 = 128;
            j7 = 255;
        }
        int[] iArr2 = rVar.f10767b;
        long[] jArr4 = rVar.f10766a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i10 = 0;
            while (true) {
                long j12 = jArr4[i10];
                if ((((~j12) << c6) & j12 & j4) != j4) {
                    int i11 = 8 - ((~(i10 - length2)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j12 & j7) < j6) {
                            int i13 = iArr2[(i10 << 3) + i12];
                            int iHashCode = Integer.hashCode(i13) * (-862048943);
                            int i14 = iHashCode ^ (iHashCode << 16);
                            int i15 = i14 & 127;
                            int i16 = rVar2.f10768c;
                            int i17 = (i14 >>> 7) & i16;
                            i = i3;
                            int i18 = 0;
                            while (true) {
                                long[] jArr5 = rVar2.f10766a;
                                int i19 = i17 >> 3;
                                jArr2 = jArr4;
                                int i20 = (i17 & 7) << 3;
                                j8 = j12;
                                long j13 = (jArr5[i19] >>> i20) | ((jArr5[i19 + 1] << (64 - i20)) & ((-i20) >> 63));
                                int i21 = i16;
                                long j14 = (((long) i15) * 72340172838076673L) ^ j13;
                                long j15 = (j14 - 72340172838076673L) & (~j14) & j4;
                                while (j15 != 0) {
                                    iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j15) >> 3)) & i21;
                                    int i22 = i21;
                                    if (rVar2.f10767b[iNumberOfTrailingZeros] == i13) {
                                        break;
                                    }
                                    j15 &= j15 - 1;
                                    i21 = i22;
                                }
                                int i23 = i21;
                                if ((j13 & ((~j13) << 6) & j4) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i18 += 8;
                                i17 = (i17 + i18) & i23;
                                jArr4 = jArr2;
                                i16 = i23;
                                j12 = j8;
                            }
                            int i24 = iNumberOfTrailingZeros;
                            if (i24 >= 0) {
                                rVar2.f(i24);
                            }
                        } else {
                            jArr2 = jArr4;
                            j8 = j12;
                            i = i3;
                        }
                        j12 = j8 >> i;
                        i12++;
                        i3 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i11 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i10 == length2) {
                    break;
                }
                i10++;
                jArr4 = jArr;
                i3 = 8;
            }
        }
        qVar.a();
        q qVarO = o();
        int[] iArr3 = qVarO.f10761b;
        Object[] objArr = qVarO.f10762c;
        long[] jArr6 = qVarO.f10760a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i25 = 0;
            while (true) {
                long j16 = jArr6[i25];
                if ((((~j16) << c6) & j16 & j4) != j4) {
                    int i26 = 8 - ((~(i25 - length3)) >>> 31);
                    for (int i27 = 0; i27 < i26; i27++) {
                        if ((j16 & j7) < j6) {
                            int i28 = (i25 << 3) + i27;
                            int i29 = iArr3[i28];
                            B0 b7 = (B0) objArr[i28];
                            E0.h hVar = b7.f14210a.f947d;
                            E0.r rVar3 = E0.o.f974d;
                            boolean zContainsKey = hVar.f939h.containsKey(rVar3);
                            l lVar2 = b7.f14210a;
                            if (zContainsKey && rVar2.a(i29)) {
                                D(i29, (String) lVar2.f947d.g(rVar3), 16);
                            }
                            qVar.i(i29, new A0(lVar2, o()));
                        }
                        j16 >>= 8;
                    }
                    if (i26 != 8) {
                        break;
                    }
                }
                if (i25 == length3) {
                    break;
                } else {
                    i25++;
                }
            }
        }
        this.I = new A0(this.f14188d.getSemanticsOwner().a(), o());
    }

    @Override // p045i1.C0741b
    public final C0715p a(View view) {
        return this.f14196m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(int i, h hVar, String str, Bundle bundle) {
        l lVar;
        G gR;
        RectF rectF;
        B0 b6 = (B0) o().f(i);
        if (b6 == null || (lVar = b6.f14210a) == null) {
            return;
        }
        String strR = r(lVar);
        boolean zA = E4.k.a(str, this.f14183E);
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f9708a;
        if (zA) {
            o oVar = this.f14181C;
            int iC = oVar.c(i);
            int i3 = iC >= 0 ? oVar.f10754c[iC] : -1;
            if (i3 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, i3);
                return;
            }
            return;
        }
        if (E4.k.a(str, this.f14184F)) {
            o oVar2 = this.f14182D;
            int iC2 = oVar2.c(i);
            int i6 = iC2 >= 0 ? oVar2.f10754c[iC2] : -1;
            if (i6 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, i6);
                return;
            }
            return;
        }
        E0.r rVar = g.f914a;
        E0.h hVar2 = lVar.f947d;
        LinkedHashMap linkedHashMap = hVar2.f939h;
        Y y2 = null;
        if (!linkedHashMap.containsKey(rVar) || bundle == null || !E4.k.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            E0.r rVar2 = E0.o.f989t;
            if (!linkedHashMap.containsKey(rVar2) || bundle == null || !E4.k.a(str, "androidx.compose.ui.semantics.testTag")) {
                if (E4.k.a(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo.getExtras().putInt(str, lVar.f950g);
                    return;
                }
                return;
            } else {
                Object obj = linkedHashMap.get(rVar2);
                String str2 = (String) (obj == null ? null : obj);
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
        }
        int i7 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i8 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i8 <= 0 || i7 < 0) {
            return;
        }
        if (i7 < (strR != null ? strR.length() : Integer.MAX_VALUE) && (gR = H.r(hVar2)) != null) {
            ArrayList arrayList = new ArrayList();
            int i9 = 0;
            while (i9 < i8) {
                int i10 = i7 + i9;
                if (i10 >= gR.f1458a.f1449a.f1494h.length()) {
                    arrayList.add(y2);
                } else {
                    p030f0.d dVarB = gR.b(i10);
                    Y yC = lVar.c();
                    long jQ = 0;
                    if (yC != null) {
                        if (!yC.M0().f5969t) {
                            yC = y2;
                        }
                        if (yC != null) {
                            jQ = yC.Q(0L);
                        }
                    }
                    p030f0.d dVarH = dVarB.h(jQ);
                    p030f0.d dVarE = lVar.e();
                    p030f0.d dVarD = dVarH.f(dVarE) ? dVarH.d(dVarE) : y2;
                    if (dVarD != 0) {
                        long jY = c.y(dVarD.f8839a, dVarD.f8840b);
                        r rVar3 = this.f14188d;
                        long jP = rVar3.p(jY);
                        long jP2 = rVar3.p(c.y(dVarD.f8841c, dVarD.f8842d));
                        rectF = new RectF(p030f0.c.d(jP), p030f0.c.e(jP), p030f0.c.d(jP2), p030f0.c.e(jP2));
                    } else {
                        rectF = null;
                    }
                    arrayList.add(rectF);
                }
                i9++;
                y2 = null;
            }
            accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
        }
    }

    public final Rect f(B0 b6) {
        Rect rect = b6.f14211b;
        long jY = c.y(rect.left, rect.top);
        r rVar = this.f14188d;
        long jP = rVar.p(jY);
        long jP2 = rVar.p(c.y(rect.right, rect.bottom));
        return new Rect((int) Math.floor(p030f0.c.d(jP)), (int) Math.floor(p030f0.c.e(jP)), (int) Math.ceil(p030f0.c.d(jP2)), (int) Math.ceil(p030f0.c.e(jP2)));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0078 A[Catch: all -> 0x0097, TRY_LEAVE, TryCatch #1 {all -> 0x0097, blocks: (B:24:0x005e, B:28:0x0070, B:30:0x0078, B:33:0x0083, B:35:0x0088, B:38:0x009b, B:40:0x00a2, B:41:0x00ab, B:23:0x004f), top: B:50:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0083 A[Catch: all -> 0x0097, TRY_ENTER, TryCatch #1 {all -> 0x0097, blocks: (B:24:0x005e, B:28:0x0070, B:30:0x0078, B:33:0x0083, B:35:0x0088, B:38:0x009b, B:40:0x00a2, B:41:0x00ab, B:23:0x004f), top: B:50:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0088 A[Catch: all -> 0x0097, LOOP:0: B:34:0x0086->B:35:0x0088, LOOP_END, TryCatch #1 {all -> 0x0097, blocks: (B:24:0x005e, B:28:0x0070, B:30:0x0078, B:33:0x0083, B:35:0x0088, B:38:0x009b, B:40:0x00a2, B:41:0x00ab, B:23:0x004f), top: B:50:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a2 A[Catch: all -> 0x0097, TryCatch #1 {all -> 0x0097, blocks: (B:24:0x005e, B:28:0x0070, B:30:0x0078, B:33:0x0083, B:35:0x0088, B:38:0x009b, B:40:0x00a2, B:41:0x00ab, B:23:0x004f), top: B:50:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00c9 -> B:24:0x005e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object g(p122w4.c r11) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p130y0.B.g(w4.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d1  */
    public final boolean h(int i, long j4, boolean z5) {
        E0.r rVar;
        long[] jArr;
        long[] jArr2;
        int i3;
        if (!E4.k.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        q qVarO = o();
        if (p030f0.c.b(j4, 9205357640488583168L) || !p030f0.c.f(j4)) {
            return false;
        }
        if (z5) {
            rVar = E0.o.f985p;
        } else {
            if (z5) {
                throw new NoWhenBranchMatchedException();
            }
            rVar = E0.o.f984o;
        }
        Object[] objArr = qVarO.f10762c;
        long[] jArr3 = qVarO.f10760a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return false;
        }
        int i6 = 0;
        boolean z6 = false;
        while (true) {
            long j6 = jArr3[i6];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8;
                int i8 = 8 - ((~(i6 - length)) >>> 31);
                int i9 = 0;
                while (i9 < i8) {
                    if ((255 & j6) < 128) {
                        B0 b6 = (B0) objArr[(i6 << 3) + i9];
                        Rect rect = b6.f14211b;
                        i3 = i7;
                        jArr2 = jArr3;
                        if (p030f0.c.d(j4) >= ((float) rect.left) && p030f0.c.d(j4) < ((float) rect.right) && p030f0.c.e(j4) >= ((float) rect.top) && p030f0.c.e(j4) < ((float) rect.bottom)) {
                            Object obj = b6.f14210a.f947d.f939h.get(rVar);
                            if (obj == null) {
                                obj = null;
                            }
                            f fVar = (f) obj;
                            if (fVar != null) {
                                o0 o0Var = fVar.f912a;
                                if (i < 0) {
                                    if (((Number) o0Var.invoke()).floatValue() > 0.0f) {
                                        z6 = true;
                                    }
                                } else if (((Number) o0Var.invoke()).floatValue() < ((Number) fVar.f913b.invoke()).floatValue()) {
                                    z6 = true;
                                }
                            }
                        }
                    } else {
                        jArr2 = jArr3;
                        i3 = i7;
                    }
                    j6 >>= i3;
                    i9++;
                    i7 = i3;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i8 != i7) {
                    return z6;
                }
            } else {
                jArr = jArr3;
            }
            if (i6 == length) {
                return z6;
            }
            i6++;
            jArr3 = jArr;
        }
    }

    public final void i() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (s()) {
                z(this.f14188d.getSemanticsOwner().a(), this.I);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                F(o());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    L();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final AccessibilityEvent j(int i, int i3) {
        B0 b6;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i3);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        r rVar = this.f14188d;
        accessibilityEventObtain.setPackageName(rVar.getContext().getPackageName());
        accessibilityEventObtain.setSource(rVar, i);
        if (s() && (b6 = (B0) o().f(i)) != null) {
            accessibilityEventObtain.setPassword(b6.f14210a.f947d.f939h.containsKey(E0.o.f967C));
        }
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent k(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventJ = j(i, 8192);
        if (num != null) {
            accessibilityEventJ.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventJ.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventJ.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventJ.getText().add(charSequence);
        }
        return accessibilityEventJ;
    }

    public final void l(l lVar, ArrayList arrayList, q qVar) {
        boolean zM = H.m(lVar);
        Object obj = lVar.f947d.f939h.get(E0.o.f981l);
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = lVar.f950g;
        if ((zBooleanValue || t(lVar)) && o().c(i)) {
            arrayList.add(lVar);
        }
        if (zBooleanValue) {
            qVar.i(i, J(zM, p089q4.l.u0(l.h(lVar, 7))));
            return;
        }
        List listH = l.h(lVar, 7);
        int size = listH.size();
        for (int i3 = 0; i3 < size; i3++) {
            l((l) listH.get(i3), arrayList, qVar);
        }
    }

    public final int m(l lVar) {
        E0.h hVar = lVar.f947d;
        if (!hVar.f939h.containsKey(E0.o.f971a)) {
            E0.r rVar = E0.o.f994y;
            E0.h hVar2 = lVar.f947d;
            if (hVar2.f939h.containsKey(rVar)) {
                return (int) (((I) hVar2.g(rVar)).f1470a & 4294967295L);
            }
        }
        return this.f14204u;
    }

    public final int n(l lVar) {
        E0.h hVar = lVar.f947d;
        if (!hVar.f939h.containsKey(E0.o.f971a)) {
            E0.r rVar = E0.o.f994y;
            E0.h hVar2 = lVar.f947d;
            if (hVar2.f939h.containsKey(rVar)) {
                return (int) (((I) hVar2.g(rVar)).f1470a >> 32);
            }
        }
        return this.f14204u;
    }

    public final q o() {
        if (this.f14208y) {
            this.f14208y = false;
            this.f14179A = H.p(this.f14188d.getSemanticsOwner());
            if (s()) {
                o oVar = this.f14181C;
                oVar.a();
                o oVar2 = this.f14182D;
                oVar2.a();
                B0 b6 = (B0) o().f(-1);
                l lVar = b6 != null ? b6.f14210a : null;
                E4.k.c(lVar);
                ArrayList arrayListJ = J(H.m(lVar), m.N(lVar));
                int iL = m.L(arrayListJ);
                int i = 1;
                if (1 <= iL) {
                    while (true) {
                        int i3 = ((l) arrayListJ.get(i - 1)).f950g;
                        int i6 = ((l) arrayListJ.get(i)).f950g;
                        oVar.f(i3, i6);
                        oVar2.f(i6, i3);
                        if (i == iL) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.f14179A;
    }

    public final String q(l lVar) {
        int iO;
        Object string = lVar.f947d.f939h.get(E0.o.f972b);
        String string2 = null;
        if (string == null) {
            string = null;
        }
        E0.r rVar = E0.o.f966B;
        E0.h hVar = lVar.f947d;
        LinkedHashMap linkedHashMap = hVar.f939h;
        Object obj = linkedHashMap.get(rVar);
        if (obj == null) {
            obj = null;
        }
        F0.a aVar = (F0.a) obj;
        Object obj2 = linkedHashMap.get(E0.o.f988s);
        if (obj2 == null) {
            obj2 = null;
        }
        e eVar = (e) obj2;
        r rVar2 = this.f14188d;
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2 && string == null) {
                        string = rVar2.getContext().getResources().getString(R.string.indeterminate);
                    }
                } else if (eVar != null && eVar.f911a == 2 && string == null) {
                    string = rVar2.getContext().getResources().getString(R.string.state_off);
                }
            } else if (eVar != null && eVar.f911a == 2 && string == null) {
                string = rVar2.getContext().getResources().getString(R.string.state_on);
            }
        }
        Object obj3 = linkedHashMap.get(E0.o.f965A);
        if (obj3 == null) {
            obj3 = null;
        }
        Boolean bool = (Boolean) obj3;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((eVar == null || eVar.f911a != 4) && string == null) {
                string = zBooleanValue ? rVar2.getContext().getResources().getString(R.string.selected) : rVar2.getContext().getResources().getString(R.string.not_selected);
            }
        }
        Object obj4 = linkedHashMap.get(E0.o.f973c);
        if (obj4 == null) {
            obj4 = null;
        }
        E0.d dVar = (E0.d) obj4;
        if (dVar != null) {
            if (dVar != E0.d.f907d) {
                if (string == null) {
                    J4.a aVar2 = dVar.f909b;
                    float f6 = aVar2.f1940b;
                    float f7 = aVar2.f1939a;
                    float f8 = f6 - f7 == 0.0f ? 0.0f : (dVar.f908a - f7) / (f6 - f7);
                    if (f8 < 0.0f) {
                        f8 = 0.0f;
                    }
                    if (f8 > 1.0f) {
                        f8 = 1.0f;
                    }
                    if (f8 == 0.0f) {
                        iO = 0;
                    } else {
                        iO = f8 == 1.0f ? 100 : c.O(Math.round(f8 * 100), 1, 99);
                    }
                    string = rVar2.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(iO));
                }
            } else if (string == null) {
                string = rVar2.getContext().getResources().getString(R.string.in_progress);
            }
        }
        E0.r rVar3 = E0.o.f993x;
        if (linkedHashMap.containsKey(rVar3)) {
            E0.h hVarI = new l(lVar.f944a, true, lVar.f946c, hVar).i();
            E0.r rVar4 = E0.o.f971a;
            LinkedHashMap linkedHashMap2 = hVarI.f939h;
            Object obj5 = linkedHashMap2.get(rVar4);
            if (obj5 == null) {
                obj5 = null;
            }
            Collection collection = (Collection) obj5;
            if (collection == null || collection.isEmpty()) {
                Object obj6 = linkedHashMap2.get(E0.o.f990u);
                if (obj6 == null) {
                    obj6 = null;
                }
                Collection collection2 = (Collection) obj6;
                if (collection2 == null || collection2.isEmpty()) {
                    Object obj7 = linkedHashMap2.get(rVar3);
                    if (obj7 == null) {
                        obj7 = null;
                    }
                    CharSequence charSequence = (CharSequence) obj7;
                    if (charSequence == null || charSequence.length() == 0) {
                        string2 = rVar2.getContext().getResources().getString(R.string.state_empty);
                    }
                }
            }
            string = string2;
        }
        return (String) string;
    }

    public final boolean s() {
        return this.f14191g.isEnabled() && !this.f14194k.isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    public final boolean t(l lVar) {
        boolean z5;
        Object obj = lVar.f947d.f939h.get(E0.o.f971a);
        if (obj == null) {
            obj = null;
        }
        List list = (List) obj;
        String str = list != null ? (String) p089q4.l.Z(list) : null;
        E0.h hVar = lVar.f947d;
        if (str == null) {
            Object obj2 = hVar.f939h.get(E0.o.f993x);
            if (obj2 == null) {
                obj2 = null;
            }
            C0110f c0110f = (C0110f) obj2;
            Object obj3 = hVar.f939h.get(E0.o.f990u);
            if (obj3 == null) {
                obj3 = null;
            }
            List list2 = (List) obj3;
            C0110f c0110f2 = list2 != null ? (C0110f) p089q4.l.Z(list2) : null;
            if (c0110f == null) {
                c0110f = c0110f2;
            }
            if (c0110f == null && q(lVar) == null && !p(lVar)) {
                z5 = false;
            } else {
                z5 = true;
            }
        } else {
            z5 = true;
        }
        return hVar.i || (lVar.m() && z5);
    }

    public final void u(D d6) {
        if (this.f14206w.add(d6)) {
            this.f14207x.j(x.f10867a);
        }
    }

    public final int y(int i) {
        if (i == this.f14188d.getSemanticsOwner().a().f950g) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x008a A[LOOP:1: B:16:0x004e->B:29:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x008d A[EDGE_INSN: B:43:0x008d->B:30:0x008d BREAK  A[LOOP:1: B:16:0x004e->B:29:0x008a], SYNTHETIC] */
    public final void z(l lVar, A0 a6) {
        int[] iArr = j.f10738a;
        r rVar = new r();
        List listH = l.h(lVar, 4);
        int size = listH.size();
        int i = 0;
        while (true) {
            D d6 = lVar.f946c;
            if (i >= size) {
                r rVar2 = a6.f14177b;
                int[] iArr2 = rVar2.f10767b;
                long[] jArr = rVar2.f10766a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j4 = jArr[i3];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            int i6 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((255 & j4) < 128 && !rVar.c(iArr2[(i3 << 3) + i7])) {
                                    u(d6);
                                    return;
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            } else if (i3 != length) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                List listH2 = l.h(lVar, 4);
                int size2 = listH2.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    l lVar2 = (l) listH2.get(i8);
                    if (o().b(lVar2.f950g)) {
                        Object objF = this.H.f(lVar2.f950g);
                        E4.k.c(objF);
                        z(lVar2, (A0) objF);
                    }
                }
                return;
            }
            l lVar3 = (l) listH.get(i);
            if (o().b(lVar3.f950g)) {
                r rVar3 = a6.f14177b;
                int i9 = lVar3.f950g;
                if (!rVar3.c(i9)) {
                    u(d6);
                    return;
                }
                rVar.a(i9);
            }
            i++;
        }
    }
}

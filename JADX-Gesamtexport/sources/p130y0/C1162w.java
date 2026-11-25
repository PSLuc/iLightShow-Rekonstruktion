package p130y0;

import B.AbstractC0013g0;
import B.C0031p0;
import E0.e;
import E0.f;
import E0.g;
import E0.l;
import E0.o;
import E0.p;
import E0.r;
import G0.AbstractC0111g;
import G0.AbstractC0116l;
import G0.C;
import G0.C0108d;
import G0.C0110f;
import G0.C0115k;
import G0.K;
import G0.L;
import L0.i;
import L0.k;
import R0.j;
import R0.n;
import S0.b;
import S1.V;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.lifecycle.C0460u;
import androidx.lifecycle.EnumC0454n;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.R;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.internal.http2.Http2;
import p027e3.a;
import p035g0.C0715p;
import p035g0.H;
import p049j1.c;
import p049j1.d;
import p049j1.h;
import p080p.B;
import p080p.F;
import p080p.m;
import p080p.v;
import p084p4.x;
import p089q4.u;
import p124x0.D;
import p124x0.Y;

/* JADX INFO: renamed from: y0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1162w extends C0715p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ B f14539j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1162w(B b6) {
        super(8);
        this.f14539j = b6;
    }

    @Override // p035g0.C0715p
    public final void n(int i, h hVar, String str, Bundle bundle) {
        this.f14539j.e(i, hVar, str, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    /* JADX WARN: Code duplicated, block: B:295:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:323:0x0610  */
    /* JADX WARN: Code duplicated, block: B:336:0x063b  */
    /* JADX WARN: Code duplicated, block: B:420:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:422:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:432:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:434:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:436:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:438:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:440:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:524:0x099e  */
    /* JADX WARN: Code duplicated, block: B:559:0x0a27  */
    /* JADX WARN: Code duplicated, block: B:660:0x07c5 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v62 */
    /* JADX WARN: Type inference failed for: r9v63, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v67, types: [java.util.ArrayList] */
    @Override // p035g0.C0715p
    public final h o(int i) {
        h hVar;
        h hVar2;
        AccessibilityNodeInfo accessibilityNodeInfo;
        E0.h hVar3;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        boolean z5;
        h hVar4;
        boolean z6;
        boolean z7;
        D dR;
        E0.h hVarN;
        boolean zA;
        Object obj;
        E0.h hVarN2;
        boolean z8;
        boolean z9;
        boolean zBooleanValue;
        u uVar;
        List list;
        ?? arrayList;
        C0031p0 c0031p0;
        int i3;
        int i6;
        int i7;
        int i8;
        C0460u c0460uF;
        B b6 = this.f14539j;
        r rVar = b6.f14188d;
        C1139k viewTreeOwners = rVar.getViewTreeOwners();
        if (((viewTreeOwners == null || (c0460uF = viewTreeOwners.f14402a.f()) == null) ? null : c0460uF.f7001c) == EnumC0454n.f6991h) {
            hVar = null;
        } else {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
            h hVar5 = new h(accessibilityNodeInfoObtain);
            AccessibilityNodeInfo accessibilityNodeInfo3 = hVar5.f9708a;
            B0 b7 = (B0) b6.o().f(i);
            if (b7 == null) {
                hVar = null;
            } else {
                l lVar = b7.f14210a;
                if (i == -1) {
                    Object parentForAccessibility = rVar.getParentForAccessibility();
                    View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
                    hVar5.f9709b = -1;
                    accessibilityNodeInfoObtain.setParent(view);
                } else {
                    l lVarJ = lVar.j();
                    Integer numValueOf = lVarJ != null ? Integer.valueOf(lVarJ.f950g) : null;
                    if (numValueOf == null) {
                        a.z0("semanticsNode " + i + " has null parent");
                        throw null;
                    }
                    int iIntValue = numValueOf.intValue();
                    if (iIntValue == rVar.getSemanticsOwner().a().f950g) {
                        iIntValue = -1;
                    }
                    hVar5.f9709b = iIntValue;
                    accessibilityNodeInfoObtain.setParent(rVar, iIntValue);
                }
                hVar5.f9710c = i;
                accessibilityNodeInfoObtain.setSource(rVar, i);
                accessibilityNodeInfoObtain.setBoundsInScreen(b6.f(b7));
                hVar5.f("android.view.View");
                if (lVar.f947d.f939h.containsKey(o.f993x)) {
                    hVar5.f("android.widget.EditText");
                }
                r rVar2 = o.f990u;
                E0.h hVar6 = lVar.f947d;
                LinkedHashMap linkedHashMap = hVar6.f939h;
                if (linkedHashMap.containsKey(rVar2)) {
                    hVar5.f("android.widget.TextView");
                }
                Object obj2 = linkedHashMap.get(o.f988s);
                if (obj2 == null) {
                    obj2 = null;
                }
                e eVar = (e) obj2;
                if (eVar != null && (lVar.f948e || l.h(lVar, 4).isEmpty())) {
                    int i9 = eVar.f911a;
                    if (i9 == 4) {
                        accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", rVar.getContext().getResources().getString(R.string.tab));
                    } else if (i9 == 2) {
                        accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", rVar.getContext().getResources().getString(R.string.switch_role));
                    } else {
                        String strZ = H.z(i9);
                        if (i9 != 5 || lVar.m() || hVar6.i) {
                            hVar5.f(strZ);
                        }
                    }
                }
                if (linkedHashMap.containsKey(g.f921h)) {
                    hVar5.f("android.widget.EditText");
                }
                if (linkedHashMap.containsKey(rVar2)) {
                    hVar5.f("android.widget.TextView");
                }
                accessibilityNodeInfoObtain.setPackageName(rVar.getContext().getPackageName());
                accessibilityNodeInfoObtain.setImportantForAccessibility(H.t(lVar));
                List listH = l.h(lVar, 4);
                int size = listH.size();
                for (int i10 = 0; i10 < size; i10++) {
                    l lVar2 = (l) listH.get(i10);
                    if (b6.o().b(lVar2.f950g)) {
                        if (rVar.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(lVar2.f946c) != null) {
                            throw new ClassCastException();
                        }
                        int i11 = lVar2.f950g;
                        if (i11 != -1) {
                            accessibilityNodeInfoObtain.addChild(rVar, i11);
                        }
                    }
                }
                if (i == b6.f14197n) {
                    accessibilityNodeInfo3.setAccessibilityFocused(true);
                    hVar5.a(c.f9700d);
                } else {
                    accessibilityNodeInfo3.setAccessibilityFocused(false);
                    hVar5.a(c.f9699c);
                }
                Object obj3 = hVar6.f939h.get(o.f993x);
                if (obj3 == null) {
                    obj3 = null;
                }
                C0110f c0110f = (C0110f) obj3;
                Object obj4 = hVar6.f939h.get(o.f990u);
                if (obj4 == null) {
                    obj4 = null;
                }
                List list2 = (List) obj4;
                C0110f c0110f2 = list2 != null ? (C0110f) p089q4.l.Z(list2) : null;
                if (c0110f == null) {
                    c0110f = c0110f2;
                }
                if (c0110f != null) {
                    rVar.getFontFamilyResolver();
                    b density = rVar.getDensity();
                    String str = c0110f.f1494h;
                    SpannableString spannableString2 = new SpannableString(str);
                    List list3 = c0110f.i;
                    if (list3 != null) {
                        int size2 = list3.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            int i13 = size2;
                            C0108d c0108d = (C0108d) list3.get(i12);
                            String str2 = str;
                            C c6 = (C) c0108d.f1490a;
                            int i14 = i12;
                            List list4 = list3;
                            E0.h hVar7 = hVar6;
                            long jA = c6.f1428a.a();
                            n cVar = c6.f1428a;
                            h hVar8 = hVar5;
                            AccessibilityNodeInfo accessibilityNodeInfo4 = accessibilityNodeInfo3;
                            if (!p035g0.r.c(jA, cVar.a())) {
                                cVar = jA != 16 ? new R0.c(jA) : R0.l.f4751a;
                            }
                            long jA2 = cVar.a();
                            int i15 = c0108d.f1491b;
                            int i16 = c0108d.f1492c;
                            V.K(spannableString2, jA2, i15, i16);
                            SpannableString spannableString3 = spannableString2;
                            V.L(spannableString3, c6.f1429b, density, i15, i16);
                            k kVar = c6.f1430c;
                            i iVar = c6.f1431d;
                            if (kVar == null && iVar == null) {
                                i8 = 33;
                            } else {
                                if (kVar == null) {
                                    kVar = k.f3025j;
                                }
                                int i17 = iVar != null ? iVar.f3023a : 0;
                                boolean z10 = E4.k.h(kVar.f3028h, k.i.f3028h) >= 0;
                                boolean z11 = i17 == 1;
                                if (z11 && z10) {
                                    i7 = 3;
                                } else if (z10) {
                                    i7 = 1;
                                } else {
                                    i7 = z11 ? 2 : 0;
                                }
                                StyleSpan styleSpan = new StyleSpan(i7);
                                i8 = 33;
                                spannableString3.setSpan(styleSpan, i15, i16, 33);
                            }
                            j jVar = c6.f1439m;
                            if (jVar != null) {
                                int i18 = jVar.f4749a;
                                if ((i18 | 1) == i18) {
                                    spannableString3.setSpan(new UnderlineSpan(), i15, i16, i8);
                                }
                                if ((i18 | 2) == i18) {
                                    spannableString3.setSpan(new StrikethroughSpan(), i15, i16, i8);
                                }
                            }
                            R0.o oVar = c6.f1436j;
                            if (oVar != null) {
                                spannableString3.setSpan(new ScaleXSpan(oVar.f4754a), i15, i16, i8);
                            }
                            N0.b bVar = c6.f1437k;
                            if (bVar != null) {
                                spannableString3.setSpan(P0.a.f4595a.a(bVar), i15, i16, i8);
                            }
                            long j4 = c6.f1438l;
                            if (j4 != 16) {
                                spannableString3.setSpan(new BackgroundColorSpan(H.v(j4)), i15, i16, i8);
                            }
                            i12 = i14 + 1;
                            spannableString2 = spannableString3;
                            size2 = i13;
                            str = str2;
                            hVar6 = hVar7;
                            list3 = list4;
                            hVar5 = hVar8;
                            accessibilityNodeInfo3 = accessibilityNodeInfo4;
                        }
                    }
                    SpannableString spannableString4 = spannableString2;
                    hVar2 = hVar5;
                    accessibilityNodeInfo = accessibilityNodeInfo3;
                    String str3 = str;
                    hVar3 = hVar6;
                    int length = str3.length();
                    u uVar2 = u.f11237h;
                    List list5 = c0110f.f1496k;
                    if (list5 != null) {
                        ArrayList arrayList2 = new ArrayList(list5.size());
                        int size3 = list5.size();
                        int i19 = 0;
                        while (i19 < size3) {
                            Object obj5 = list5.get(i19);
                            u uVar3 = uVar2;
                            C0108d c0108d2 = (C0108d) obj5;
                            int i20 = size3;
                            if (c0108d2.f1490a instanceof L) {
                                i6 = i19;
                                if (AbstractC0111g.c(0, length, c0108d2.f1491b, c0108d2.f1492c)) {
                                    arrayList2.add(obj5);
                                }
                            } else {
                                i6 = i19;
                            }
                            i19 = i6 + 1;
                            uVar2 = uVar3;
                            size3 = i20;
                        }
                        uVar = uVar2;
                        list = arrayList2;
                    } else {
                        uVar = uVar2;
                        list = uVar;
                    }
                    int i21 = 0;
                    for (int size4 = list.size(); i21 < size4; size4 = size4) {
                        C0108d c0108d3 = (C0108d) list.get(i21);
                        L l6 = (L) c0108d3.f1490a;
                        if (!(l6 instanceof L)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        spannableString4.setSpan(new TtsSpan.VerbatimBuilder(l6.f1476a).build(), c0108d3.f1491b, c0108d3.f1492c, 33);
                        i21++;
                    }
                    int length2 = str3.length();
                    if (list5 != null) {
                        arrayList = new ArrayList(list5.size());
                        int size5 = list5.size();
                        int i22 = 0;
                        while (i22 < size5) {
                            Object obj6 = list5.get(i22);
                            C0108d c0108d4 = (C0108d) obj6;
                            List list6 = list5;
                            if (c0108d4.f1490a instanceof K) {
                                i3 = size5;
                                if (AbstractC0111g.c(0, length2, c0108d4.f1491b, c0108d4.f1492c)) {
                                    arrayList.add(obj6);
                                }
                            } else {
                                i3 = size5;
                            }
                            i22++;
                            size5 = i3;
                            list5 = list6;
                        }
                    } else {
                        arrayList = uVar;
                    }
                    int size6 = arrayList.size();
                    int i23 = 0;
                    while (true) {
                        c0031p0 = b6.G;
                        if (i23 >= size6) {
                            break;
                        }
                        C0108d c0108d5 = (C0108d) arrayList.get(i23);
                        K k3 = (K) c0108d5.f1490a;
                        WeakHashMap weakHashMap = (WeakHashMap) c0031p0.i;
                        Object uRLSpan = weakHashMap.get(k3);
                        if (uRLSpan == null) {
                            uRLSpan = new URLSpan(k3.f1475a);
                            weakHashMap.put(k3, uRLSpan);
                        }
                        spannableString4.setSpan((URLSpan) uRLSpan, c0108d5.f1491b, c0108d5.f1492c, 33);
                        i23++;
                        size6 = size6;
                    }
                    List listA = c0110f.a(str3.length());
                    int size7 = listA.size();
                    int i24 = 0;
                    while (i24 < size7) {
                        C0108d c0108d6 = (C0108d) listA.get(i24);
                        Object obj7 = c0108d6.f1490a;
                        AbstractC0116l abstractC0116l = (AbstractC0116l) obj7;
                        boolean z12 = abstractC0116l instanceof C0115k;
                        List list7 = listA;
                        int i25 = c0108d6.f1492c;
                        int i26 = size7;
                        int i27 = c0108d6.f1491b;
                        if (z12) {
                            abstractC0116l.getClass();
                            E4.k.d("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url", obj7);
                            C0115k c0115k = (C0115k) obj7;
                            C0108d c0108d7 = new C0108d(i27, i25, c0115k);
                            WeakHashMap weakHashMap2 = (WeakHashMap) c0031p0.f394j;
                            Object uRLSpan2 = weakHashMap2.get(c0108d7);
                            if (uRLSpan2 == null) {
                                uRLSpan2 = new URLSpan(c0115k.f1507a);
                                weakHashMap2.put(c0108d7, uRLSpan2);
                            }
                            spannableString4.setSpan((URLSpan) uRLSpan2, i27, i25, 33);
                        } else {
                            WeakHashMap weakHashMap3 = (WeakHashMap) c0031p0.f395k;
                            Object gVar = weakHashMap3.get(c0108d6);
                            if (gVar == null) {
                                gVar = new O0.g(abstractC0116l);
                                weakHashMap3.put(c0108d6, gVar);
                            }
                            spannableString4.setSpan((ClickableSpan) gVar, i27, i25, 33);
                        }
                        i24++;
                        listA = list7;
                        size7 = i26;
                    }
                    spannableString = (SpannableString) B.K(spannableString4);
                } else {
                    hVar2 = hVar5;
                    accessibilityNodeInfo = accessibilityNodeInfo3;
                    hVar3 = hVar6;
                    spannableString = null;
                }
                accessibilityNodeInfoObtain.setText(spannableString);
                r rVar3 = o.f968D;
                if (linkedHashMap.containsKey(rVar3)) {
                    accessibilityNodeInfoObtain.setContentInvalid(true);
                    Object obj8 = linkedHashMap.get(rVar3);
                    if (obj8 == null) {
                        obj8 = null;
                    }
                    accessibilityNodeInfoObtain.setError((CharSequence) obj8);
                }
                String strQ = b6.q(lVar);
                if (Build.VERSION.SDK_INT >= 30) {
                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                    d.c(accessibilityNodeInfo2, strQ);
                } else {
                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                    accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strQ);
                }
                accessibilityNodeInfoObtain.setCheckable(B.p(lVar));
                Object obj9 = linkedHashMap.get(o.f966B);
                if (obj9 == null) {
                    obj9 = null;
                }
                F0.a aVar = (F0.a) obj9;
                if (aVar != null) {
                    if (aVar == F0.a.f1239h) {
                        accessibilityNodeInfo2.setChecked(true);
                    } else if (aVar == F0.a.i) {
                        accessibilityNodeInfo2.setChecked(false);
                    }
                }
                Object obj10 = linkedHashMap.get(o.f965A);
                if (obj10 == null) {
                    obj10 = null;
                }
                Boolean bool = (Boolean) obj10;
                if (bool != null) {
                    boolean zBooleanValue2 = bool.booleanValue();
                    if (eVar != null && eVar.f911a == 4) {
                        accessibilityNodeInfoObtain.setSelected(zBooleanValue2);
                    } else {
                        accessibilityNodeInfo2.setChecked(zBooleanValue2);
                    }
                }
                E0.h hVar9 = hVar3;
                if (!hVar9.i || l.h(lVar, 4).isEmpty()) {
                    Object obj11 = linkedHashMap.get(o.f971a);
                    if (obj11 == null) {
                        obj11 = null;
                    }
                    List list8 = (List) obj11;
                    accessibilityNodeInfoObtain.setContentDescription(list8 != null ? (String) p089q4.l.Z(list8) : null);
                }
                Object obj12 = linkedHashMap.get(o.f989t);
                if (obj12 == null) {
                    obj12 = null;
                }
                String str4 = (String) obj12;
                if (str4 != null) {
                    l lVarJ2 = lVar;
                    while (true) {
                        if (lVarJ2 == null) {
                            zBooleanValue = false;
                            break;
                        }
                        r rVar4 = p.f996a;
                        E0.h hVar10 = lVarJ2.f947d;
                        if (hVar10.f939h.containsKey(rVar4)) {
                            zBooleanValue = ((Boolean) hVar10.g(rVar4)).booleanValue();
                            break;
                        }
                        lVarJ2 = lVarJ2.j();
                    }
                    if (zBooleanValue) {
                        accessibilityNodeInfoObtain.setViewIdResourceName(str4);
                    }
                }
                r rVar5 = o.f971a;
                Object obj13 = linkedHashMap.get(o.f978h);
                if (obj13 == null) {
                    obj13 = null;
                }
                if (((x) obj13) != null) {
                    accessibilityNodeInfo2.setHeading(true);
                }
                accessibilityNodeInfoObtain.setPassword(linkedHashMap.containsKey(o.f967C));
                accessibilityNodeInfoObtain.setEditable(linkedHashMap.containsKey(o.f969E));
                Object obj14 = linkedHashMap.get(o.f970F);
                if (obj14 == null) {
                    obj14 = null;
                }
                Integer num = (Integer) obj14;
                accessibilityNodeInfoObtain.setMaxTextLength(num != null ? num.intValue() : -1);
                accessibilityNodeInfoObtain.setEnabled(H.l(lVar));
                r rVar6 = o.f980k;
                accessibilityNodeInfoObtain.setFocusable(linkedHashMap.containsKey(rVar6));
                if (accessibilityNodeInfoObtain.isFocusable()) {
                    accessibilityNodeInfoObtain.setFocused(((Boolean) hVar9.g(rVar6)).booleanValue());
                    if (accessibilityNodeInfoObtain.isFocused()) {
                        accessibilityNodeInfo2.addAction(2);
                    } else {
                        accessibilityNodeInfo2.addAction(1);
                    }
                }
                Y yC = lVar.c();
                if (yC != null ? yC.T0() : false) {
                    z5 = false;
                } else if (hVar9.f939h.containsKey(o.f982m)) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                accessibilityNodeInfoObtain.setVisibleToUser(z5);
                Object obj15 = linkedHashMap.get(o.f979j);
                if (obj15 == null) {
                    obj15 = null;
                }
                if (obj15 != null) {
                    throw new ClassCastException();
                }
                accessibilityNodeInfo2.setClickable(false);
                Object obj16 = linkedHashMap.get(g.f915b);
                if (obj16 == null) {
                    obj16 = null;
                }
                E0.a aVar2 = (E0.a) obj16;
                if (aVar2 == null) {
                    hVar4 = hVar2;
                } else {
                    Object obj17 = linkedHashMap.get(o.f965A);
                    if (obj17 == null) {
                        obj17 = null;
                    }
                    boolean zA2 = E4.k.a(obj17, Boolean.TRUE);
                    if (eVar != null && eVar.f911a == 4) {
                        z9 = true;
                    } else if (eVar != null && eVar.f911a == 3) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    accessibilityNodeInfo2.setClickable(!z9 || (z9 && !zA2));
                    if (H.l(lVar) && accessibilityNodeInfoObtain.isClickable()) {
                        hVar4 = hVar2;
                        hVar4.a(new c(null, 16, aVar2.f902a, null));
                    } else {
                        hVar4 = hVar2;
                    }
                }
                accessibilityNodeInfo2.setLongClickable(false);
                Object obj18 = hVar9.f939h.get(g.f916c);
                if (obj18 == null) {
                    obj18 = null;
                }
                E0.a aVar3 = (E0.a) obj18;
                if (aVar3 != null) {
                    accessibilityNodeInfo2.setLongClickable(true);
                    if (H.l(lVar)) {
                        hVar4.a(new c(null, 32, aVar3.f902a, null));
                    }
                }
                Object obj19 = hVar9.f939h.get(g.f926n);
                if (obj19 == null) {
                    obj19 = null;
                }
                E0.a aVar4 = (E0.a) obj19;
                if (aVar4 != null) {
                    hVar4.a(new c(null, Http2.INITIAL_MAX_FRAME_SIZE, aVar4.f902a, null));
                }
                if (H.l(lVar)) {
                    Object obj20 = hVar9.f939h.get(g.f921h);
                    if (obj20 == null) {
                        obj20 = null;
                    }
                    E0.a aVar5 = (E0.a) obj20;
                    if (aVar5 != null) {
                        hVar4.a(new c(null, 2097152, aVar5.f902a, null));
                    }
                    Object obj21 = hVar9.f939h.get(g.f925m);
                    if (obj21 == null) {
                        obj21 = null;
                    }
                    E0.a aVar6 = (E0.a) obj21;
                    if (aVar6 != null) {
                        hVar4.a(new c(null, android.R.id.accessibilityActionImeEnter, aVar6.f902a, null));
                    }
                    Object obj22 = hVar9.f939h.get(g.f927o);
                    if (obj22 == null) {
                        obj22 = null;
                    }
                    E0.a aVar7 = (E0.a) obj22;
                    if (aVar7 != null) {
                        hVar4.a(new c(null, 65536, aVar7.f902a, null));
                    }
                    Object obj23 = hVar9.f939h.get(g.f928p);
                    if (obj23 == null) {
                        obj23 = null;
                    }
                    E0.a aVar8 = (E0.a) obj23;
                    if (aVar8 != null && accessibilityNodeInfo2.isFocused()) {
                        ClipDescription primaryClipDescription = rVar.getClipboardManager().f14389a.getPrimaryClipDescription();
                        if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                            hVar4.a(new c(null, 32768, aVar8.f902a, null));
                        }
                    }
                }
                String strR = B.r(lVar);
                if (!(strR == null || strR.length() == 0)) {
                    accessibilityNodeInfo2.setTextSelection(b6.n(lVar), b6.m(lVar));
                    Object obj24 = hVar9.f939h.get(g.f920g);
                    if (obj24 == null) {
                        obj24 = null;
                    }
                    E0.a aVar9 = (E0.a) obj24;
                    hVar4.a(new c(null, 131072, aVar9 != null ? aVar9.f902a : null, null));
                    accessibilityNodeInfo2.addAction(HueLog.LogComponent.STREAMDTLS);
                    accessibilityNodeInfo2.addAction(HueLog.LogComponent.APPCORE);
                    accessibilityNodeInfo2.setMovementGranularities(11);
                    Object obj25 = hVar9.f939h.get(o.f971a);
                    if (obj25 == null) {
                        obj25 = null;
                    }
                    List list9 = (List) obj25;
                    if (list9 == null || list9.isEmpty()) {
                        if (hVar9.f939h.containsKey(g.f914a)) {
                            if (hVar9.f939h.containsKey(o.f993x)) {
                                Object obj26 = hVar9.f939h.get(rVar6);
                                if (obj26 == null) {
                                    obj26 = null;
                                }
                                if (E4.k.a(obj26, Boolean.TRUE)) {
                                    dR = lVar.f946c.r();
                                    while (true) {
                                        if (dR == null) {
                                            dR = null;
                                            break;
                                        }
                                        hVarN2 = dR.n();
                                        if (hVarN2 == null) {
                                        }
                                        dR = dR.r();
                                    }
                                    if (dR != null) {
                                        hVarN = dR.n();
                                        if (hVarN != null) {
                                            obj = hVarN.f939h.get(o.f980k);
                                            if (obj == null) {
                                                obj = null;
                                            }
                                            zA = E4.k.a(obj, Boolean.TRUE);
                                        } else {
                                            zA = false;
                                        }
                                        if (zA) {
                                        }
                                    }
                                }
                            } else {
                                dR = lVar.f946c.r();
                                while (true) {
                                    if (dR == null) {
                                        dR = null;
                                        break;
                                    }
                                    hVarN2 = dR.n();
                                    if (hVarN2 == null && hVarN2.i) {
                                        if (hVarN2.f939h.containsKey(o.f993x)) {
                                            break;
                                        }
                                    }
                                    dR = dR.r();
                                }
                                if (dR != null) {
                                    hVarN = dR.n();
                                    if (hVarN != null) {
                                        obj = hVarN.f939h.get(o.f980k);
                                        if (obj == null) {
                                            obj = null;
                                        }
                                        zA = E4.k.a(obj, Boolean.TRUE);
                                    } else {
                                        zA = false;
                                    }
                                    z8 = zA ? false : true;
                                }
                            }
                            if (!z8) {
                                accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo2.getMovementGranularities() | 20);
                            }
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add("androidx.compose.ui.semantics.id");
                CharSequence charSequenceE = hVar4.e();
                if (!(charSequenceE == null || charSequenceE.length() == 0)) {
                    if (hVar9.f939h.containsKey(g.f914a)) {
                        arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                    }
                }
                if (hVar9.f939h.containsKey(o.f989t)) {
                    arrayList3.add("androidx.compose.ui.semantics.testTag");
                }
                accessibilityNodeInfo2.setAvailableExtraData(arrayList3);
                Object obj27 = hVar9.f939h.get(o.f973c);
                if (obj27 == null) {
                    obj27 = null;
                }
                E0.d dVar = (E0.d) obj27;
                if (dVar != null) {
                    r rVar7 = g.f919f;
                    if (hVar9.f939h.containsKey(rVar7)) {
                        hVar4.f("android.widget.SeekBar");
                    } else {
                        hVar4.f("android.widget.ProgressBar");
                    }
                    E0.d dVar2 = E0.d.f907d;
                    float f6 = dVar.f908a;
                    if (dVar != dVar2) {
                        J4.a aVar10 = dVar.f909b;
                        accessibilityNodeInfo2.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new C0715p(7, AccessibilityNodeInfo.RangeInfo.obtain(1, Float.valueOf(aVar10.f1939a).floatValue(), Float.valueOf(aVar10.f1940b).floatValue(), f6)).i);
                    }
                    if (lVar.k().c(rVar7) && H.l(lVar)) {
                        float fFloatValue = Float.valueOf(dVar.a().f1940b).floatValue();
                        float fFloatValue2 = Float.valueOf(dVar.a().f1939a).floatValue();
                        if (fFloatValue < fFloatValue2) {
                            fFloatValue = fFloatValue2;
                        }
                        if (f6 < fFloatValue) {
                            hVar4.a(c.f9701e);
                        }
                        float fFloatValue3 = Float.valueOf(dVar.a().f1939a).floatValue();
                        float fFloatValue4 = Float.valueOf(dVar.a().f1940b).floatValue();
                        if (fFloatValue3 > fFloatValue4) {
                            fFloatValue3 = fFloatValue4;
                        }
                        if (f6 > fFloatValue3) {
                            hVar4.a(c.f9702f);
                        }
                    }
                }
                AbstractC1158u.a(hVar4, lVar);
                Object obj28 = lVar.i().f939h.get(o.f976f);
                if (obj28 == null) {
                    obj28 = null;
                }
                if (obj28 != null) {
                    throw new ClassCastException();
                }
                ArrayList arrayList4 = new ArrayList();
                Object obj29 = lVar.i().f939h.get(o.f975e);
                if (obj29 == null) {
                    obj29 = null;
                }
                if (obj29 != null) {
                    List listH2 = l.h(lVar, 4);
                    int size8 = listH2.size();
                    for (int i28 = 0; i28 < size8; i28++) {
                        l lVar3 = (l) listH2.get(i28);
                        if (lVar3.i().f939h.containsKey(o.f965A)) {
                            arrayList4.add(lVar3);
                        }
                    }
                }
                if (!arrayList4.isEmpty()) {
                    boolean zA3 = p135z0.a.a(arrayList4);
                    accessibilityNodeInfo2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(zA3 ? 1 : arrayList4.size(), zA3 ? arrayList4.size() : 1, false, 0));
                }
                p135z0.a.c(hVar4, lVar);
                f fVar = (f) AbstractC0599v0.C(lVar.k(), o.f984o);
                E0.a aVar11 = (E0.a) AbstractC0599v0.C(lVar.k(), g.f917d);
                if (fVar != null && aVar11 != null) {
                    Object obj30 = lVar.i().f939h.get(o.f976f);
                    if (obj30 == null) {
                        obj30 = null;
                    }
                    if (obj30 == null) {
                        Object obj31 = lVar.i().f939h.get(o.f975e);
                        if (obj31 == null) {
                            obj31 = null;
                        }
                        if (obj31 != null) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                    } else {
                        z7 = true;
                    }
                    if (!z7) {
                        hVar4.f("android.widget.HorizontalScrollView");
                    }
                    if (((Number) fVar.f913b.invoke()).floatValue() > 0.0f) {
                        accessibilityNodeInfo2.setScrollable(true);
                    }
                    if (H.l(lVar)) {
                        if (B.x(fVar)) {
                            hVar4.a(c.f9701e);
                            hVar4.a(!H.m(lVar) ? c.f9705j : c.f9704h);
                        }
                        if (B.w(fVar)) {
                            hVar4.a(c.f9702f);
                            hVar4.a(!H.m(lVar) ? c.f9704h : c.f9705j);
                        }
                    }
                }
                f fVar2 = (f) AbstractC0599v0.C(lVar.k(), o.f985p);
                if (fVar2 != null && aVar11 != null) {
                    Object obj32 = lVar.i().f939h.get(o.f976f);
                    if (obj32 == null) {
                        obj32 = null;
                    }
                    if (obj32 == null) {
                        Object obj33 = lVar.i().f939h.get(o.f975e);
                        if (obj33 == null) {
                            obj33 = null;
                        }
                        if (obj33 != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        z6 = true;
                    }
                    if (!z6) {
                        hVar4.f("android.widget.ScrollView");
                    }
                    if (((Number) fVar2.f913b.invoke()).floatValue() > 0.0f) {
                        accessibilityNodeInfo2.setScrollable(true);
                    }
                    if (H.l(lVar)) {
                        if (B.x(fVar2)) {
                            hVar4.a(c.f9701e);
                            hVar4.a(c.i);
                        }
                        if (B.w(fVar2)) {
                            hVar4.a(c.f9702f);
                            hVar4.a(c.f9703g);
                        }
                    }
                }
                AbstractC1160v.a(hVar4, lVar);
                accessibilityNodeInfo2.setPaneTitle((CharSequence) AbstractC0599v0.C(lVar.k(), o.f974d));
                if (H.l(lVar)) {
                    E0.a aVar12 = (E0.a) AbstractC0599v0.C(lVar.k(), g.f929q);
                    if (aVar12 != null) {
                        hVar4.a(new c(262144, aVar12.a()));
                    }
                    E0.a aVar13 = (E0.a) AbstractC0599v0.C(lVar.k(), g.f930r);
                    if (aVar13 != null) {
                        hVar4.a(new c(524288, aVar13.a()));
                    }
                    E0.a aVar14 = (E0.a) AbstractC0599v0.C(lVar.k(), g.f931s);
                    if (aVar14 != null) {
                        hVar4.a(new c(1048576, aVar14.a()));
                    }
                    E0.h hVarK = lVar.k();
                    r rVar8 = g.f933u;
                    if (hVarK.c(rVar8)) {
                        List list10 = (List) lVar.k().g(rVar8);
                        int size9 = list10.size();
                        p080p.p pVar = B.f14178N;
                        if (size9 >= pVar.f10759b) {
                            throw new IllegalStateException(AbstractC0013g0.l(new StringBuilder("Can't have more than "), pVar.f10759b, " custom actions for one widget"));
                        }
                        F f7 = new F(0);
                        v vVar = B.f10713a;
                        v vVar2 = new v();
                        F f8 = b6.f14203t;
                        if (f8.f10718h) {
                            m.a(f8);
                        }
                        if (p085q.a.a(f8.f10720k, i, f8.i) >= 0) {
                            v vVar3 = (v) f8.c(i);
                            p080p.p pVar2 = new p080p.p();
                            int[] iArr = pVar.f10758a;
                            int i29 = pVar.f10759b;
                            for (int i30 = 0; i30 < i29; i30++) {
                                pVar2.a(iArr[i30]);
                            }
                            ArrayList arrayList5 = new ArrayList();
                            if (list10.size() > 0) {
                                p012c.k.A(list10.get(0));
                                E4.k.c(vVar3);
                                throw null;
                            }
                            if (arrayList5.size() > 0) {
                                p012c.k.A(arrayList5.get(0));
                                pVar2.c(0);
                                throw null;
                            }
                        } else if (list10.size() > 0) {
                            p012c.k.A(list10.get(0));
                            pVar.c(0);
                            throw null;
                        }
                        b6.f14202s.e(i, f7);
                        f8.e(i, vVar2);
                    }
                }
                accessibilityNodeInfo2.setScreenReaderFocusable(b6.t(lVar));
                p080p.o oVar2 = b6.f14181C;
                int iC = oVar2.c(i);
                int i31 = iC >= 0 ? oVar2.f10754c[iC] : -1;
                if (i31 != -1) {
                    H.x(rVar.getAndroidViewsHandler$ui_release(), i31);
                    accessibilityNodeInfo2.setTraversalBefore(rVar, i31);
                    b6.e(i, hVar4, b6.f14183E, null);
                }
                p080p.o oVar3 = b6.f14182D;
                int iC2 = oVar3.c(i);
                int i32 = iC2 >= 0 ? oVar3.f10754c[iC2] : -1;
                if (i32 != -1) {
                    H.x(rVar.getAndroidViewsHandler$ui_release(), i32);
                }
                hVar = hVar4;
            }
        }
        if (b6.f14199p && i == b6.f14197n) {
            b6.f14198o = hVar;
        }
        return hVar;
    }

    @Override // p035g0.C0715p
    public final h p() {
        return o(this.f14539j.f14197n);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:138:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:235:0x033c  */
    /* JADX WARN: Code duplicated, block: B:237:0x0340  */
    /* JADX WARN: Code duplicated, block: B:238:0x0342  */
    /* JADX WARN: Code duplicated, block: B:241:0x0347  */
    /* JADX WARN: Code duplicated, block: B:242:0x0349  */
    /* JADX WARN: Code duplicated, block: B:245:0x034f  */
    /* JADX WARN: Code duplicated, block: B:246:0x0351  */
    /* JADX WARN: Code duplicated, block: B:249:0x0357  */
    /* JADX WARN: Code duplicated, block: B:250:0x0359  */
    /* JADX WARN: Code duplicated, block: B:253:0x035f  */
    /* JADX WARN: Code duplicated, block: B:254:0x0361  */
    /* JADX WARN: Code duplicated, block: B:257:0x0367  */
    /* JADX WARN: Code duplicated, block: B:258:0x0369  */
    /* JADX WARN: Code duplicated, block: B:265:0x0375  */
    /* JADX WARN: Code duplicated, block: B:272:0x0381  */
    /* JADX WARN: Code duplicated, block: B:275:0x0386  */
    /* JADX WARN: Code duplicated, block: B:277:0x038e  */
    /* JADX WARN: Code duplicated, block: B:280:0x0399  */
    /* JADX WARN: Code duplicated, block: B:283:0x039e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:303:0x03db  */
    /* JADX WARN: Code duplicated, block: B:305:0x0400  */
    /* JADX WARN: Code duplicated, block: B:308:0x0405  */
    /* JADX WARN: Code duplicated, block: B:313:0x041e  */
    /* JADX WARN: Code duplicated, block: B:316:0x0427  */
    /* JADX WARN: Code duplicated, block: B:320:0x042e  */
    /* JADX WARN: Code duplicated, block: B:322:0x0436  */
    /* JADX WARN: Code duplicated, block: B:325:0x043d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:365:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:367:0x04be  */
    /* JADX WARN: Code duplicated, block: B:370:0x04c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:372:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:373:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:375:0x04d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:376:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:379:0x04db  */
    /* JADX WARN: Code duplicated, block: B:381:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:388:0x0503  */
    /* JADX WARN: Code duplicated, block: B:390:0x0507  */
    /* JADX WARN: Code duplicated, block: B:393:0x0510  */
    /* JADX WARN: Code duplicated, block: B:395:0x0514  */
    /* JADX WARN: Code duplicated, block: B:398:0x051b  */
    /* JADX WARN: Code duplicated, block: B:401:0x0520  */
    /* JADX WARN: Code duplicated, block: B:501:0x0660  */
    /* JADX WARN: Code duplicated, block: B:508:0x0674  */
    /* JADX WARN: Code duplicated, block: B:510:0x0678  */
    /* JADX WARN: Code duplicated, block: B:512:0x068c  */
    /* JADX WARN: Code duplicated, block: B:514:0x0690  */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x017a, code lost:
    
        r1 = null;
     */
    @Override // p035g0.C0715p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(int r18, int r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instruction units count: 2024
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p130y0.C1162w.w(int, int, android.os.Bundle):boolean");
    }
}

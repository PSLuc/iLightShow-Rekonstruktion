package O0;

import B.C0025m0;
import B.C0031p0;
import B.S0;
import G0.AbstractC0111g;
import G0.C;
import G0.C0108d;
import G0.J;
import G0.s;
import G0.t;
import G0.v;
import G0.x;
import H0.n;
import L0.r;
import N.V0;
import R0.o;
import R0.p;
import R0.q;
import S0.m;
import S1.V;
import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import com.fasterxml.jackson.databind.deser.std.d0;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import p035g0.AbstractC0712m;
import p035g0.H;
import p035g0.K;
import p035g0.L;
import p035g0.O;

/* JADX INFO: loaded from: classes.dex */
public final class d implements s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f4392h;
    public final J i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f4393j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f4394k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final L0.d f4395l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final S0.b f4396m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f f4397n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CharSequence f4398o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f4399p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0031p0 f4400q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f4401r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f4402s;

    /* JADX WARN: Code duplicated, block: B:11:0x006b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0070  */
    /* JADX WARN: Code duplicated, block: B:180:0x0374  */
    /* JADX WARN: Code duplicated, block: B:182:0x0378  */
    /* JADX WARN: Code duplicated, block: B:183:0x037b  */
    /* JADX WARN: Code duplicated, block: B:186:0x038d  */
    /* JADX WARN: Code duplicated, block: B:192:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:200:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:201:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:203:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:206:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:209:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:211:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:216:0x0401  */
    /* JADX WARN: Code duplicated, block: B:217:0x0404  */
    /* JADX WARN: Code duplicated, block: B:220:0x040a  */
    /* JADX WARN: Code duplicated, block: B:221:0x040d  */
    /* JADX WARN: Code duplicated, block: B:225:0x0426  */
    /* JADX WARN: Code duplicated, block: B:227:0x043b  */
    /* JADX WARN: Code duplicated, block: B:231:0x044c  */
    /* JADX WARN: Code duplicated, block: B:238:0x046c  */
    /* JADX WARN: Code duplicated, block: B:239:0x0476  */
    /* JADX WARN: Code duplicated, block: B:241:0x0481  */
    /* JADX WARN: Code duplicated, block: B:242:0x0488  */
    /* JADX WARN: Code duplicated, block: B:245:0x0499  */
    /* JADX WARN: Code duplicated, block: B:246:0x049e  */
    /* JADX WARN: Code duplicated, block: B:248:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:249:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:251:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:254:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:256:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:263:0x0500  */
    /* JADX WARN: Code duplicated, block: B:267:0x050c  */
    /* JADX WARN: Code duplicated, block: B:276:0x051d  */
    /* JADX WARN: Code duplicated, block: B:279:0x0557  */
    /* JADX WARN: Code duplicated, block: B:281:0x055d  */
    /* JADX WARN: Code duplicated, block: B:284:0x056b  */
    /* JADX WARN: Code duplicated, block: B:287:0x058e  */
    /* JADX WARN: Code duplicated, block: B:289:0x0599 A[LOOP:5: B:288:0x0597->B:289:0x0599, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:292:0x05ad A[LOOP:6: B:291:0x05ab->B:292:0x05ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:295:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:297:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:299:0x05df  */
    /* JADX WARN: Code duplicated, block: B:301:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:302:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:304:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:306:0x060f  */
    /* JADX WARN: Code duplicated, block: B:315:0x0637  */
    /* JADX WARN: Code duplicated, block: B:320:0x0652  */
    /* JADX WARN: Code duplicated, block: B:322:0x065c  */
    /* JADX WARN: Code duplicated, block: B:328:0x066c  */
    /* JADX WARN: Code duplicated, block: B:380:0x079e  */
    /* JADX WARN: Code duplicated, block: B:382:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:384:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:390:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:405:0x0815  */
    /* JADX WARN: Code duplicated, block: B:407:0x0820  */
    /* JADX WARN: Code duplicated, block: B:409:0x082e A[LOOP:4: B:408:0x082c->B:409:0x082e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:412:0x083d  */
    /* JADX WARN: Code duplicated, block: B:416:0x0851  */
    /* JADX WARN: Code duplicated, block: B:440:0x0622 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:407:0x0820, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29, types: [G0.C] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31, types: [G0.C, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Type inference failed for: r3v6, types: [B.S0] */
    public d(String str, J j4, List list, List list2, L0.d dVar, S0.b bVar) throws Throwable {
        Locale locale;
        int i;
        Typeface typeface;
        CharSequence charSequence;
        Spannable spannableString;
        x xVar;
        boolean z5;
        t tVar;
        R0.g gVar;
        float fJ;
        int length;
        int i3;
        boolean z6;
        boolean z7;
        int i6;
        p pVar;
        float f6;
        Throwable th;
        Spannable spannable;
        ArrayList arrayList;
        int size;
        int i7;
        C c6;
        L0.p pVar2;
        ?? c7;
        ?? s1;
        int size2;
        int i8;
        Integer[] numArr;
        int i9;
        int size3;
        int i10;
        Integer[] numArr2;
        int iIntValue;
        int i11;
        ?? r6;
        Integer num;
        int iIntValue2;
        int size4;
        int i12;
        ?? C5;
        ArrayList arrayList2;
        S0.b bVar2;
        int i13;
        int i14;
        int i15;
        S0.b bVar3;
        int size5;
        boolean z8;
        int i16;
        C0108d c0108d;
        int i17;
        int size6;
        int i18;
        int i19;
        int i20;
        int i21;
        S0.b bVar4;
        int i22;
        int i23;
        int i24;
        Object obj;
        C c8;
        long j6;
        boolean zA;
        long j7;
        Spannable spannable2;
        long jB;
        long j8;
        float fC;
        long jB2;
        float fC2;
        v vVar;
        CharSequence charSequence2;
        N0.b bVar5;
        this.f4392h = str;
        this.i = j4;
        List list3 = list;
        this.f4393j = list3;
        this.f4394k = list2;
        this.f4395l = dVar;
        this.f4396m = bVar;
        float fA = bVar.a();
        f fVar = new f(1);
        ((TextPaint) fVar).density = fA;
        fVar.f4406b = R0.j.f4746b;
        fVar.f4407c = 3;
        fVar.f4408d = L.f9034d;
        this.f4397n = fVar;
        x xVar2 = j4.f1474c;
        C0025m0 c0025m0 = j.f4418a;
        C0025m0 c0025m1 = j.f4418a;
        V0 v0F = (V0) c0025m1.i;
        if (v0F == null) {
            if (p119w1.h.c()) {
                v0F = c0025m1.f();
                c0025m1.i = v0F;
            } else {
                v0F = k.f4419a;
            }
        }
        this.f4401r = ((Boolean) v0F.getValue()).booleanValue();
        int i25 = j4.f1473b.f1538b;
        N0.b bVar6 = j4.f1472a.f1437k;
        if (i25 == 4) {
            i = 2;
        } else if (i25 == 5) {
            i = 3;
        } else if (i25 == 1) {
            i = 0;
        } else if (i25 == 2) {
            i = 1;
        } else {
            if (i25 != 3 && i25 != Integer.MIN_VALUE) {
                throw new IllegalStateException("Invalid TextDirection.");
            }
            int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((bVar6 == null || (locale = ((N0.a) bVar6.f3878h.get(0)).f3876a) == null) ? Locale.getDefault() : locale);
            if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                i = 2;
            } else {
                i = 3;
            }
        }
        this.f4402s = i;
        c cVar = new c(this);
        q qVar = j4.f1473b.i;
        qVar = qVar == null ? q.f4759c : qVar;
        fVar.setFlags(qVar.f4762b ? fVar.getFlags() | 128 : fVar.getFlags() & (-129));
        int i26 = qVar.f4761a;
        if (i26 == 1) {
            fVar.setFlags(fVar.getFlags() | 64);
            fVar.setHinting(0);
        } else if (i26 == 2) {
            fVar.getFlags();
            fVar.setHinting(1);
        } else if (i26 == 3) {
            fVar.getFlags();
            fVar.setHinting(0);
        } else {
            fVar.getFlags();
        }
        C c9 = j4.f1472a;
        boolean zIsEmpty = list3.isEmpty();
        long jB3 = m.b(c9.f1429b);
        boolean zA2 = S0.n.a(jB3, 4294967296L);
        long j9 = c9.f1429b;
        if (zA2) {
            fVar.setTextSize(bVar.V(j9));
        } else if (S0.n.a(jB3, 8589934592L)) {
            fVar.setTextSize(m.c(j9) * fVar.getTextSize());
        }
        L0.p pVar3 = c9.f1433f;
        if (pVar3 != null || c9.f1431d != null || c9.f1430c != null) {
            L0.k kVar = c9.f1430c;
            kVar = kVar == null ? L0.k.f3025j : kVar;
            L0.i iVar = c9.f1431d;
            int i27 = iVar != null ? iVar.f3023a : 0;
            L0.j jVar = c9.f1432e;
            r rVarB = ((L0.e) dVar).b(pVar3, kVar, i27, jVar != null ? jVar.f3024a : 1);
            if (rVarB instanceof r) {
                Object obj2 = rVarB.f3038h;
                E4.k.d("null cannot be cast to non-null type android.graphics.Typeface", obj2);
                typeface = (Typeface) obj2;
            } else {
                C0031p0 c0031p0 = new C0031p0(rVarB, this.f4400q);
                this.f4400q = c0031p0;
                Object obj3 = c0031p0.f395k;
                E4.k.d("null cannot be cast to non-null type android.graphics.Typeface", obj3);
                typeface = (Typeface) obj3;
            }
            fVar.setTypeface(typeface);
        }
        N0.b bVar7 = c9.f1437k;
        if (bVar7 != null) {
            N0.b bVar8 = N0.b.f3877j;
            C0031p0 c0031p1 = N0.c.f3879a;
            c0031p1.getClass();
            LocaleList localeList = LocaleList.getDefault();
            synchronized (((W2.g) c0031p1.f395k)) {
                try {
                    bVar5 = (N0.b) c0031p1.f394j;
                    if (bVar5 == null || localeList != ((LocaleList) c0031p1.i)) {
                        int size7 = localeList.size();
                        ArrayList arrayList3 = new ArrayList(size7);
                        for (int i28 = 0; i28 < size7; i28++) {
                            arrayList3.add(new N0.a(localeList.get(i28)));
                        }
                        bVar5 = new N0.b(arrayList3);
                        c0031p1.i = localeList;
                        c0031p1.f394j = bVar5;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!bVar7.equals(bVar5)) {
                P0.a.f4595a.b(fVar, bVar7);
            }
        }
        String str2 = c9.f1434g;
        if (str2 != null && !str2.equals("")) {
            fVar.setFontFeatureSettings(str2);
        }
        o oVar = c9.f1436j;
        if (oVar != null && !oVar.equals(o.f4753c)) {
            fVar.setTextScaleX(fVar.getTextScaleX() * oVar.f4754a);
            fVar.setTextSkewX(fVar.getTextSkewX() + oVar.f4755b);
        }
        R0.n nVar = c9.f1428a;
        fVar.d(nVar.a());
        fVar.c(nVar.b(), 9205357640488583168L, nVar.c());
        fVar.f(c9.f1440n);
        fVar.g(c9.f1439m);
        fVar.e(c9.f1442p);
        long j10 = c9.f1435h;
        if (S0.n.a(m.b(j10), 4294967296L) && m.c(j10) != 0.0f) {
            float textScaleX = fVar.getTextScaleX() * fVar.getTextSize();
            float fV = bVar.V(j10);
            if (textScaleX != 0.0f) {
                fVar.setLetterSpacing(fV / textScaleX);
            }
        } else if (S0.n.a(m.b(j10), 8589934592L)) {
            fVar.setLetterSpacing(m.c(j10));
        }
        boolean z9 = (zIsEmpty || !S0.n.a(m.b(j10), 4294967296L) || m.c(j10) == 0.0f) ? false : true;
        long j11 = p035g0.r.f9085l;
        long j12 = c9.f1438l;
        boolean z10 = (p035g0.r.c(j12, j11) || p035g0.r.c(j12, p035g0.r.f9084k)) ? false : true;
        R0.a aVar = c9.i;
        boolean z11 = (aVar == null || Float.compare(aVar.f4730a, 0.0f) == 0) ? false : true;
        C c10 = (z9 || z10 || z11) ? new C(0L, 0L, (L0.k) null, (L0.i) null, (L0.j) null, (L0.p) null, (String) null, z9 ? j10 : m.f4901c, z11 ? aVar : null, (o) null, (N0.b) null, z10 ? j12 : j11, (R0.j) null, (L) null, 63103) : null;
        if (c10 != null) {
            int size8 = list3.size() + 1;
            ArrayList arrayList4 = new ArrayList(size8);
            int i29 = 0;
            while (i29 < size8) {
                arrayList4.add(i29 == 0 ? new C0108d(0, this.f4392h.length(), c10) : (C0108d) this.f4393j.get(i29 - 1));
                i29++;
            }
            list3 = arrayList4;
        }
        String str3 = this.f4392h;
        float textSize = this.f4397n.getTextSize();
        J j13 = this.i;
        List list4 = this.f4394k;
        S0.b bVar9 = this.f4396m;
        boolean z12 = this.f4401r;
        a aVar2 = b.f4390a;
        if (z12 && p119w1.h.c()) {
            x xVar3 = j13.f1474c;
            if (xVar3 != null) {
                v vVar2 = xVar3.f1551b;
            }
            CharSequence charSequenceF = p119w1.h.a().f(0, str3.length(), 0, str3);
            E4.k.c(charSequenceF);
            charSequence = charSequenceF;
        } else {
            charSequence = str3;
        }
        if (list3.isEmpty() && list4.isEmpty() && E4.k.a(j13.f1473b.f1540d, p.f4756c)) {
            charSequence2 = charSequence;
            if (!d0.u(j13.f1473b.f1539c)) {
                if (charSequence instanceof Spannable) {
                    spannableString = (Spannable) charSequence;
                } else {
                    spannableString = new SpannableString(charSequence);
                }
                if (E4.k.a(j13.f1472a.f1439m, R0.j.f4747c)) {
                    spannableString.setSpan(b.f4390a, 0, str3.length(), 33);
                }
                xVar = j13.f1474c;
                if (xVar != null) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                tVar = j13.f1473b;
                if (z5) {
                    gVar = tVar.f1542f;
                    if (gVar == null) {
                    }
                    fJ = V.J(tVar.f1539c, textSize, bVar9);
                    if (Float.isNaN(fJ)) {
                        i6 = 0;
                    } else {
                        if (spannableString.length() == 0) {
                            length = spannableString.length() + 1;
                        } else {
                            length = spannableString.length();
                        }
                        int i30 = length;
                        i3 = gVar.f4742b;
                        if ((i3 & 1) > 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if ((i3 & 16) > 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        i6 = 0;
                        spannableString.setSpan(new J0.h(fJ, i30, z6, z7, gVar.f4741a), 0, spannableString.length(), 33);
                    }
                } else {
                    gVar = tVar.f1542f;
                    if (gVar == null) {
                    }
                    fJ = V.J(tVar.f1539c, textSize, bVar9);
                    if (Float.isNaN(fJ)) {
                        if (spannableString.length() == 0) {
                            length = spannableString.length() + 1;
                        } else {
                            length = spannableString.length();
                        }
                        int i31 = length;
                        i3 = gVar.f4742b;
                        if ((i3 & 1) > 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if ((i3 & 16) > 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        i6 = 0;
                        spannableString.setSpan(new J0.h(fJ, i31, z6, z7, gVar.f4741a), 0, spannableString.length(), 33);
                    } else {
                        i6 = 0;
                    }
                }
                pVar = tVar.f1540d;
                if (pVar != null) {
                    int i32 = i6;
                    long jQ = d0.q(i32);
                    th = null;
                    j6 = pVar.f4757a;
                    zA = m.a(j6, jQ);
                    j7 = pVar.f4758b;
                    spannable2 = spannableString;
                    if (!zA) {
                        jB = m.b(j6);
                        f6 = 0.0f;
                        if (S0.n.a(jB, 4294967296L)) {
                            fC = bVar9.V(j6);
                            j8 = 8589934592L;
                        } else {
                            j8 = 8589934592L;
                            if (S0.n.a(jB, 8589934592L)) {
                                fC = m.c(j6) * textSize;
                            } else {
                                fC = 0.0f;
                            }
                        }
                        jB2 = m.b(j7);
                        if (S0.n.a(jB2, 4294967296L)) {
                            fC2 = bVar9.V(j7);
                        } else if (S0.n.a(jB2, j8)) {
                            fC2 = m.c(j7) * textSize;
                        } else {
                            fC2 = 0.0f;
                        }
                        Spannable spannable3 = spannable2;
                        spannable3.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannable2.length(), 33);
                        spannable = spannable3;
                    } else {
                        jB = m.b(j6);
                        f6 = 0.0f;
                        if (S0.n.a(jB, 4294967296L)) {
                            fC = bVar9.V(j6);
                            j8 = 8589934592L;
                        } else {
                            j8 = 8589934592L;
                            if (S0.n.a(jB, 8589934592L)) {
                                fC = m.c(j6) * textSize;
                            } else {
                                fC = 0.0f;
                            }
                        }
                        jB2 = m.b(j7);
                        if (S0.n.a(jB2, 4294967296L)) {
                            fC2 = bVar9.V(j7);
                        } else if (S0.n.a(jB2, j8)) {
                            fC2 = m.c(j7) * textSize;
                        } else {
                            fC2 = 0.0f;
                        }
                        Spannable spannable4 = spannable2;
                        spannable4.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannable2.length(), 33);
                        spannable = spannable4;
                    }
                } else {
                    f6 = 0.0f;
                    th = null;
                    spannable = spannableString;
                }
                arrayList = new ArrayList(list3.size());
                size = list3.size();
                for (i7 = 0; i7 < size; i7++) {
                    obj = list3.get(i7);
                    Object obj4 = ((C0108d) obj).f1490a;
                    c8 = (C) obj4;
                    if (c8.f1433f == null) {
                        arrayList.add(obj);
                    } else {
                        arrayList.add(obj);
                    }
                }
                c6 = j13.f1472a;
                pVar2 = c6.f1433f;
                if (pVar2 != null) {
                    c7 = new C(0L, 0L, c6.f1430c, c6.f1431d, c6.f1432e, pVar2, (String) null, 0L, (R0.a) null, (o) null, (N0.b) null, 0L, (R0.j) null, (L) null, 65475);
                } else {
                    c7 = new C(0L, 0L, c6.f1430c, c6.f1431d, c6.f1432e, pVar2, (String) null, 0L, (R0.a) null, (o) null, (N0.b) null, 0L, (R0.j) null, (L) null, 65475);
                }
                s1 = new S0(spannable, 3, cVar);
                if (arrayList.size() > 1) {
                    size2 = arrayList.size();
                    i8 = size2 * 2;
                    numArr = new Integer[i8];
                    for (i9 = 0; i9 < i8; i9++) {
                        numArr[i9] = 0;
                    }
                    size3 = arrayList.size();
                    for (i10 = 0; i10 < size3; i10++) {
                        C0108d c0108d2 = (C0108d) arrayList.get(i10);
                        numArr[i10] = Integer.valueOf(c0108d2.f1491b);
                        numArr[i10 + size2] = Integer.valueOf(c0108d2.f1492c);
                    }
                    numArr2 = numArr;
                    if (numArr2.length > 1) {
                        Arrays.sort(numArr2);
                    }
                    if (i8 == 0) {
                        throw new NoSuchElementException("Array is empty.");
                    }
                    iIntValue = numArr[0].intValue();
                    i11 = 0;
                    r6 = c7;
                    while (i11 < i8) {
                        num = numArr[i11];
                        iIntValue2 = num.intValue();
                        if (iIntValue2 == iIntValue) {
                            arrayList2 = arrayList;
                            bVar2 = bVar9;
                            i13 = i8;
                        } else {
                            size4 = arrayList.size();
                            i12 = 0;
                            C5 = r6;
                            while (i12 < size4) {
                                ArrayList arrayList5 = arrayList;
                                C0108d c0108d3 = (C0108d) arrayList.get(i12);
                                S0.b bVar10 = bVar9;
                                i14 = c0108d3.f1491b;
                                int i33 = i8;
                                i15 = c0108d3.f1492c;
                                if (i14 == i15) {
                                }
                                i12++;
                                i8 = i33;
                                arrayList = arrayList5;
                                bVar9 = bVar10;
                                C5 = C5;
                            }
                            arrayList2 = arrayList;
                            bVar2 = bVar9;
                            i13 = i8;
                            if (C5 != 0) {
                                s1.c(C5, Integer.valueOf(iIntValue), num);
                            }
                            iIntValue = iIntValue2;
                        }
                        i11++;
                        r6 = r6;
                        i8 = i13;
                        arrayList = arrayList2;
                        bVar9 = bVar2;
                    }
                } else if (!arrayList.isEmpty()) {
                    C c11 = (C) ((C0108d) arrayList.get(0)).f1490a;
                    s1.c(c7 != 0 ? c7.c(c11) : c11, Integer.valueOf(((C0108d) arrayList.get(0)).f1491b), Integer.valueOf(((C0108d) arrayList.get(0)).f1492c));
                }
                bVar3 = bVar9;
                size5 = list3.size();
                z8 = false;
                i16 = 0;
                while (i16 < size5) {
                    C0108d c0108d4 = (C0108d) list3.get(i16);
                    i21 = c0108d4.f1491b;
                    if (i21 >= 0) {
                        size5 = size5;
                        bVar4 = bVar3;
                    } else {
                        size5 = size5;
                        bVar4 = bVar3;
                    }
                    i16++;
                    size5 = size5;
                    bVar3 = bVar4;
                }
                S0.b bVar11 = bVar3;
                if (z8) {
                    size6 = list3.size();
                    for (i18 = 0; i18 < size6; i18++) {
                        C0108d c0108d5 = (C0108d) list3.get(i18);
                        i19 = c0108d5.f1491b;
                        C c12 = (C) c0108d5.f1490a;
                        if (i19 < 0) {
                        }
                    }
                }
                charSequence2 = spannable;
                if (list4.size() > 0) {
                    c0108d = (C0108d) list4.get(0);
                    if (c0108d.f1490a != null) {
                        throw new ClassCastException();
                    }
                    for (Object obj5 : spannable.getSpans(c0108d.f1491b, c0108d.f1492c, p119w1.t.class)) {
                        spannable.removeSpan((p119w1.t) obj5);
                    }
                    throw th;
                }
            }
        } else {
            if (charSequence instanceof Spannable) {
                spannableString = (Spannable) charSequence;
            } else {
                spannableString = new SpannableString(charSequence);
            }
            if (E4.k.a(j13.f1472a.f1439m, R0.j.f4747c)) {
                spannableString.setSpan(b.f4390a, 0, str3.length(), 33);
            }
            xVar = j13.f1474c;
            if (xVar != null || (vVar = xVar.f1551b) == null) {
                z5 = false;
            } else {
                z5 = vVar.f1548a;
            }
            tVar = j13.f1473b;
            if (z5 || tVar.f1542f != null) {
                gVar = tVar.f1542f;
                gVar = gVar == null ? R0.g.f4740c : gVar;
                fJ = V.J(tVar.f1539c, textSize, bVar9);
                if (Float.isNaN(fJ)) {
                    if (spannableString.length() == 0 && M4.l.j0(spannableString) != '\n') {
                        length = spannableString.length();
                    } else {
                        length = spannableString.length() + 1;
                    }
                    int i34 = length;
                    i3 = gVar.f4742b;
                    if ((i3 & 1) > 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if ((i3 & 16) > 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    i6 = 0;
                    spannableString.setSpan(new J0.h(fJ, i34, z6, z7, gVar.f4741a), 0, spannableString.length(), 33);
                }
                pVar = tVar.f1540d;
                if (pVar != null) {
                    int i35 = i6;
                    long jQ2 = d0.q(i35);
                    th = null;
                    j6 = pVar.f4757a;
                    zA = m.a(j6, jQ2);
                    j7 = pVar.f4758b;
                    spannable2 = spannableString;
                    if ((!zA && m.a(j7, d0.q(i35))) || d0.u(j6) || d0.u(j7)) {
                        f6 = 0.0f;
                        spannable = spannable2;
                    } else {
                        jB = m.b(j6);
                        f6 = 0.0f;
                        if (S0.n.a(jB, 4294967296L)) {
                            fC = bVar9.V(j6);
                            j8 = 8589934592L;
                        } else {
                            j8 = 8589934592L;
                            if (S0.n.a(jB, 8589934592L)) {
                                fC = m.c(j6) * textSize;
                            } else {
                                fC = 0.0f;
                            }
                        }
                        jB2 = m.b(j7);
                        if (S0.n.a(jB2, 4294967296L)) {
                            fC2 = bVar9.V(j7);
                        } else if (S0.n.a(jB2, j8)) {
                            fC2 = m.c(j7) * textSize;
                        } else {
                            fC2 = 0.0f;
                        }
                        Spannable spannable5 = spannable2;
                        spannable5.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannable2.length(), 33);
                        spannable = spannable5;
                    }
                } else {
                    f6 = 0.0f;
                    th = null;
                    spannable = spannableString;
                }
                arrayList = new ArrayList(list3.size());
                size = list3.size();
                while (i7 < size) {
                    obj = list3.get(i7);
                    Object obj6 = ((C0108d) obj).f1490a;
                    c8 = (C) obj6;
                    if (c8.f1433f == null || c8.f1431d != null || c8.f1430c != null || ((C) obj6).f1432e != null) {
                        arrayList.add(obj);
                    }
                }
                c6 = j13.f1472a;
                pVar2 = c6.f1433f;
                if (pVar2 != null && c6.f1431d == null && c6.f1430c == null && c6.f1432e == null) {
                    c7 = th;
                } else {
                    c7 = new C(0L, 0L, c6.f1430c, c6.f1431d, c6.f1432e, pVar2, (String) null, 0L, (R0.a) null, (o) null, (N0.b) null, 0L, (R0.j) null, (L) null, 65475);
                }
                s1 = new S0(spannable, 3, cVar);
                if (arrayList.size() > 1) {
                    size2 = arrayList.size();
                    i8 = size2 * 2;
                    numArr = new Integer[i8];
                    while (i9 < i8) {
                        numArr[i9] = 0;
                    }
                    size3 = arrayList.size();
                    while (i10 < size3) {
                        C0108d c0108d6 = (C0108d) arrayList.get(i10);
                        numArr[i10] = Integer.valueOf(c0108d6.f1491b);
                        numArr[i10 + size2] = Integer.valueOf(c0108d6.f1492c);
                    }
                    numArr2 = numArr;
                    if (numArr2.length > 1) {
                        Arrays.sort(numArr2);
                    }
                    if (i8 == 0) {
                        throw new NoSuchElementException("Array is empty.");
                    }
                    iIntValue = numArr[0].intValue();
                    i11 = 0;
                    r6 = c7;
                    while (i11 < i8) {
                        num = numArr[i11];
                        iIntValue2 = num.intValue();
                        if (iIntValue2 == iIntValue) {
                            arrayList2 = arrayList;
                            bVar2 = bVar9;
                            i13 = i8;
                        } else {
                            size4 = arrayList.size();
                            i12 = 0;
                            C5 = r6;
                            while (i12 < size4) {
                                ArrayList arrayList6 = arrayList;
                                C0108d c0108d7 = (C0108d) arrayList.get(i12);
                                S0.b bVar12 = bVar9;
                                i14 = c0108d7.f1491b;
                                int i36 = i8;
                                i15 = c0108d7.f1492c;
                                if (i14 == i15 && AbstractC0111g.c(iIntValue, iIntValue2, i14, i15)) {
                                    C c13 = (C) c0108d7.f1490a;
                                    C5 = C5 != 0 ? C5.c(c13) : c13;
                                }
                                i12++;
                                i8 = i36;
                                arrayList = arrayList6;
                                bVar9 = bVar12;
                                C5 = C5;
                            }
                            arrayList2 = arrayList;
                            bVar2 = bVar9;
                            i13 = i8;
                            if (C5 != 0) {
                                s1.c(C5, Integer.valueOf(iIntValue), num);
                            }
                            iIntValue = iIntValue2;
                        }
                        i11++;
                        r6 = r6;
                        i8 = i13;
                        arrayList = arrayList2;
                        bVar9 = bVar2;
                    }
                } else if (!arrayList.isEmpty()) {
                    C c14 = (C) ((C0108d) arrayList.get(0)).f1490a;
                    s1.c(c7 != 0 ? c7.c(c14) : c14, Integer.valueOf(((C0108d) arrayList.get(0)).f1491b), Integer.valueOf(((C0108d) arrayList.get(0)).f1492c));
                }
                bVar3 = bVar9;
                size5 = list3.size();
                z8 = false;
                i16 = 0;
                while (i16 < size5) {
                    C0108d c0108d8 = (C0108d) list3.get(i16);
                    i21 = c0108d8.f1491b;
                    if (i21 >= 0 || i21 >= spannable.length() || (i22 = c0108d8.f1492c) <= i21 || i22 > spannable.length()) {
                        size5 = size5;
                        bVar4 = bVar3;
                    } else {
                        C c15 = (C) c0108d8.f1490a;
                        R0.a aVar3 = c15.i;
                        int i37 = c0108d8.f1491b;
                        int i38 = c0108d8.f1492c;
                        if (aVar3 != null) {
                            spannable.setSpan(new J0.a(0, aVar3.f4730a), i37, i38, 33);
                        }
                        R0.n nVar2 = c15.f1428a;
                        V.K(spannable, nVar2.a(), i37, i38);
                        AbstractC0712m abstractC0712mB = nVar2.b();
                        float fC3 = nVar2.c();
                        if (abstractC0712mB != null) {
                            if (abstractC0712mB instanceof O) {
                                V.K(spannable, ((O) abstractC0712mB).f9050a, i37, i38);
                            } else {
                                spannable.setSpan(new Q0.b((K) abstractC0712mB, fC3), i37, i38, 33);
                            }
                        }
                        R0.j jVar2 = c15.f1439m;
                        if (jVar2 != null) {
                            int i39 = jVar2.f4749a;
                            spannable.setSpan(new J0.k((i39 | 1) == i39, (i39 | 2) == i39), i37, i38, 33);
                        }
                        V.L(spannable, c15.f1429b, bVar3, i37, i38);
                        bVar4 = bVar3;
                        String str4 = c15.f1434g;
                        if (str4 != null) {
                            i23 = 33;
                            spannable.setSpan(new J0.b(0, str4), i37, i38, 33);
                        } else {
                            i23 = 33;
                        }
                        o oVar2 = c15.f1436j;
                        if (oVar2 != null) {
                            spannable.setSpan(new ScaleXSpan(oVar2.f4754a), i37, i38, i23);
                            spannable.setSpan(new J0.a(1, oVar2.f4755b), i37, i38, i23);
                        }
                        N0.b bVar13 = c15.f1437k;
                        if (bVar13 != null) {
                            spannable.setSpan(P0.a.f4595a.a(bVar13), i37, i38, i23);
                        }
                        long j14 = c15.f1438l;
                        if (j14 != 16) {
                            spannable.setSpan(new BackgroundColorSpan(H.v(j14)), i37, i38, 33);
                        }
                        L l6 = c15.f1440n;
                        if (l6 != null) {
                            int iV = H.v(l6.f9035a);
                            long j15 = l6.f9036b;
                            float fD = p030f0.c.d(j15);
                            float fE = p030f0.c.e(j15);
                            float f7 = l6.f9037c;
                            J0.j jVar3 = new J0.j(iV, fD, fE, f7 == f6 ? Float.MIN_VALUE : f7);
                            i24 = 33;
                            spannable.setSpan(jVar3, i37, i38, 33);
                        } else {
                            i24 = 33;
                        }
                        p044i0.e eVar = c15.f1442p;
                        if (eVar != null) {
                            spannable.setSpan(new Q0.a(eVar), i37, i38, i24);
                        }
                        long j16 = c15.f1435h;
                        if (S0.n.a(m.b(j16), 4294967296L) || S0.n.a(m.b(j16), 8589934592L)) {
                            z8 = true;
                        }
                    }
                    i16++;
                    size5 = size5;
                    bVar3 = bVar4;
                }
                S0.b bVar14 = bVar3;
                if (z8) {
                    size6 = list3.size();
                    while (i18 < size6) {
                        C0108d c0108d9 = (C0108d) list3.get(i18);
                        i19 = c0108d9.f1491b;
                        C c16 = (C) c0108d9.f1490a;
                        if (i19 < 0 && i19 < spannable.length() && (i20 = c0108d9.f1492c) > i19 && i20 <= spannable.length()) {
                            long j17 = c16.f1435h;
                            long jB4 = m.b(j17);
                            Object fVar2 = S0.n.a(jB4, 4294967296L) ? new J0.f(bVar14.V(j17)) : S0.n.a(jB4, 8589934592L) ? new J0.e(m.c(j17)) : th;
                            if (fVar2 != null) {
                                spannable.setSpan(fVar2, i19, i20, 33);
                            }
                        }
                    }
                }
                charSequence2 = spannable;
                if (list4.size() > 0) {
                    c0108d = (C0108d) list4.get(0);
                    if (c0108d.f1490a != null) {
                        throw new ClassCastException();
                    }
                    while (i17 < r1) {
                        spannable.removeSpan((p119w1.t) obj5);
                    }
                    throw th;
                }
            } else {
                float fJ2 = V.J(tVar.f1539c, textSize, bVar9);
                if (!Float.isNaN(fJ2)) {
                    spannableString.setSpan(new J0.g(fJ2), 0, spannableString.length(), 33);
                }
            }
            i6 = 0;
            pVar = tVar.f1540d;
            if (pVar != null) {
                int i310 = i6;
                long jQ3 = d0.q(i310);
                th = null;
                j6 = pVar.f4757a;
                zA = m.a(j6, jQ3);
                j7 = pVar.f4758b;
                spannable2 = spannableString;
                if (!zA) {
                    jB = m.b(j6);
                    f6 = 0.0f;
                    if (S0.n.a(jB, 4294967296L)) {
                        fC = bVar9.V(j6);
                        j8 = 8589934592L;
                    } else {
                        j8 = 8589934592L;
                        if (S0.n.a(jB, 8589934592L)) {
                            fC = m.c(j6) * textSize;
                        } else {
                            fC = 0.0f;
                        }
                    }
                    jB2 = m.b(j7);
                    if (S0.n.a(jB2, 4294967296L)) {
                        fC2 = bVar9.V(j7);
                    } else if (S0.n.a(jB2, j8)) {
                        fC2 = m.c(j7) * textSize;
                    } else {
                        fC2 = 0.0f;
                    }
                    Spannable spannable6 = spannable2;
                    spannable6.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannable2.length(), 33);
                    spannable = spannable6;
                } else {
                    jB = m.b(j6);
                    f6 = 0.0f;
                    if (S0.n.a(jB, 4294967296L)) {
                        fC = bVar9.V(j6);
                        j8 = 8589934592L;
                    } else {
                        j8 = 8589934592L;
                        if (S0.n.a(jB, 8589934592L)) {
                            fC = m.c(j6) * textSize;
                        } else {
                            fC = 0.0f;
                        }
                    }
                    jB2 = m.b(j7);
                    if (S0.n.a(jB2, 4294967296L)) {
                        fC2 = bVar9.V(j7);
                    } else if (S0.n.a(jB2, j8)) {
                        fC2 = m.c(j7) * textSize;
                    } else {
                        fC2 = 0.0f;
                    }
                    Spannable spannable7 = spannable2;
                    spannable7.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannable2.length(), 33);
                    spannable = spannable7;
                }
            } else {
                f6 = 0.0f;
                th = null;
                spannable = spannableString;
            }
            arrayList = new ArrayList(list3.size());
            size = list3.size();
            while (i7 < size) {
                obj = list3.get(i7);
                Object obj7 = ((C0108d) obj).f1490a;
                c8 = (C) obj7;
                if (c8.f1433f == null) {
                    arrayList.add(obj);
                } else {
                    arrayList.add(obj);
                }
            }
            c6 = j13.f1472a;
            pVar2 = c6.f1433f;
            if (pVar2 != null) {
                c7 = new C(0L, 0L, c6.f1430c, c6.f1431d, c6.f1432e, pVar2, (String) null, 0L, (R0.a) null, (o) null, (N0.b) null, 0L, (R0.j) null, (L) null, 65475);
            } else {
                c7 = new C(0L, 0L, c6.f1430c, c6.f1431d, c6.f1432e, pVar2, (String) null, 0L, (R0.a) null, (o) null, (N0.b) null, 0L, (R0.j) null, (L) null, 65475);
            }
            s1 = new S0(spannable, 3, cVar);
            if (arrayList.size() > 1) {
                size2 = arrayList.size();
                i8 = size2 * 2;
                numArr = new Integer[i8];
                while (i9 < i8) {
                    numArr[i9] = 0;
                }
                size3 = arrayList.size();
                while (i10 < size3) {
                    C0108d c0108d10 = (C0108d) arrayList.get(i10);
                    numArr[i10] = Integer.valueOf(c0108d10.f1491b);
                    numArr[i10 + size2] = Integer.valueOf(c0108d10.f1492c);
                }
                numArr2 = numArr;
                if (numArr2.length > 1) {
                    Arrays.sort(numArr2);
                }
                if (i8 == 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                iIntValue = numArr[0].intValue();
                i11 = 0;
                r6 = c7;
                while (i11 < i8) {
                    num = numArr[i11];
                    iIntValue2 = num.intValue();
                    if (iIntValue2 == iIntValue) {
                        arrayList2 = arrayList;
                        bVar2 = bVar9;
                        i13 = i8;
                    } else {
                        size4 = arrayList.size();
                        i12 = 0;
                        C5 = r6;
                        while (i12 < size4) {
                            ArrayList arrayList7 = arrayList;
                            C0108d c0108d11 = (C0108d) arrayList.get(i12);
                            S0.b bVar15 = bVar9;
                            i14 = c0108d11.f1491b;
                            int i311 = i8;
                            i15 = c0108d11.f1492c;
                            if (i14 == i15) {
                            }
                            i12++;
                            i8 = i311;
                            arrayList = arrayList7;
                            bVar9 = bVar15;
                            C5 = C5;
                        }
                        arrayList2 = arrayList;
                        bVar2 = bVar9;
                        i13 = i8;
                        if (C5 != 0) {
                            s1.c(C5, Integer.valueOf(iIntValue), num);
                        }
                        iIntValue = iIntValue2;
                    }
                    i11++;
                    r6 = r6;
                    i8 = i13;
                    arrayList = arrayList2;
                    bVar9 = bVar2;
                }
            } else if (!arrayList.isEmpty()) {
                C c17 = (C) ((C0108d) arrayList.get(0)).f1490a;
                s1.c(c7 != 0 ? c7.c(c17) : c17, Integer.valueOf(((C0108d) arrayList.get(0)).f1491b), Integer.valueOf(((C0108d) arrayList.get(0)).f1492c));
            }
            bVar3 = bVar9;
            size5 = list3.size();
            z8 = false;
            i16 = 0;
            while (i16 < size5) {
                C0108d c0108d12 = (C0108d) list3.get(i16);
                i21 = c0108d12.f1491b;
                if (i21 >= 0) {
                    size5 = size5;
                    bVar4 = bVar3;
                } else {
                    size5 = size5;
                    bVar4 = bVar3;
                }
                i16++;
                size5 = size5;
                bVar3 = bVar4;
            }
            S0.b bVar16 = bVar3;
            if (z8) {
                size6 = list3.size();
                while (i18 < size6) {
                    C0108d c0108d13 = (C0108d) list3.get(i18);
                    i19 = c0108d13.f1491b;
                    C c18 = (C) c0108d13.f1490a;
                    if (i19 < 0) {
                    }
                }
            }
            charSequence2 = spannable;
            if (list4.size() > 0) {
                c0108d = (C0108d) list4.get(0);
                if (c0108d.f1490a != null) {
                    throw new ClassCastException();
                }
                while (i17 < r1) {
                    spannable.removeSpan((p119w1.t) obj5);
                }
                throw th;
            }
        }
        this.f4398o = charSequence2;
        this.f4399p = new n(charSequence2, this.f4397n, this.f4402s);
    }

    @Override // G0.s
    public final float a() {
        n nVar = this.f4399p;
        if (!Float.isNaN(nVar.f1709e)) {
            return nVar.f1709e;
        }
        TextPaint textPaint = nVar.f1706b;
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = nVar.f1705a;
        lineInstance.setText(new H0.k(charSequence, charSequence.length()));
        PriorityQueue<p084p4.h> priorityQueue = new PriorityQueue(10, new D3.k(1));
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new p084p4.h(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                p084p4.h hVar = (p084p4.h) priorityQueue.peek();
                if (hVar != null && ((Number) hVar.i).intValue() - ((Number) hVar.f10849h).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new p084p4.h(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        float fMax = 0.0f;
        for (p084p4.h hVar2 : priorityQueue) {
            fMax = Math.max(fMax, Layout.getDesiredWidth(charSequence, ((Number) hVar2.f10849h).intValue(), ((Number) hVar2.i).intValue(), textPaint));
        }
        nVar.f1709e = fMax;
        return fMax;
    }

    @Override // G0.s
    public final boolean b() {
        C0031p0 c0031p0 = this.f4400q;
        if (c0031p0 != null ? c0031p0.n() : false) {
            return true;
        }
        if (!this.f4401r) {
            x xVar = this.i.f1474c;
            C0025m0 c0025m0 = j.f4418a;
            C0025m0 c0025m1 = j.f4418a;
            V0 v0F = (V0) c0025m1.i;
            if (v0F == null) {
                if (p119w1.h.c()) {
                    v0F = c0025m1.f();
                    c0025m1.i = v0F;
                } else {
                    v0F = k.f4419a;
                }
            }
            if (((Boolean) v0F.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // G0.s
    public final float c() {
        return this.f4399p.b();
    }
}

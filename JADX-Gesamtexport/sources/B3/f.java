package B3;

import B.AbstractC0013g0;
import E4.k;
import E4.x;
import N.C0208d;
import N.C0217h0;
import N.U;
import P4.AbstractC0336x;
import P4.D;
import c5.i0;
import com.google.protobuf.AbstractC0640h;
import com.google.protobuf.AbstractC0648p;
import com.google.protobuf.AbstractC0652u;
import com.google.protobuf.O;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.r;
import com.nanjoran.ilightshow.Model.Presets.FXOpt;
import com.nanjoran.ilightshow.Model.Presets.UMPreset;
import com.nanjoran.ilightshow.Services.AbstractC0698y;
import com.nanjoran.ilightshow.Services.M;
import com.nanjoran.ilightshow.Services.r0;
import com.nanjoran.libaudiomatch.LibAudioMatch;
import com.nanjoran.libaudiomatch.MatchResult;
import defpackage.g;
import defpackage.h;
import defpackage.i;
import defpackage.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import p089q4.l;
import p089q4.n;
import p089q4.z;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f557b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Double f559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Double f560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Date f561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0217h0 f562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f563h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f564j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f565k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0217h0 f566l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f567m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0217h0 f568n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Date f569o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f570p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a f571q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j f572r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public defpackage.c f573s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0217h0 f574t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final X4.d f575u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0217h0 f576v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final X4.d f577w;

    public f() {
        U u6 = U.f3673m;
        this.f562g = C0208d.K(null, u6);
        this.f566l = C0208d.K(null, u6);
        Math.random();
        this.f568n = C0208d.K(null, u6);
        Boolean bool = Boolean.FALSE;
        this.f574t = C0208d.K(bool, u6);
        this.f575u = new X4.d();
        this.f576v = C0208d.K(bool, u6);
        this.f577w = new X4.d();
    }

    public static String a(double d6) {
        if (Double.isNaN(d6) || Double.isInfinite(d6) || d6 < 0.0d) {
            d6 = 0.0d;
        }
        int i = (int) d6;
        return String.format("%02d:%02d.%03d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60), Integer.valueOf((int) ((d6 % ((double) 1)) * ((double) 1000)))}, 3));
    }

    public static i b(f fVar, double d6, i iVar, int i) {
        Object obj = null;
        if ((i & 2) != 0) {
            iVar = null;
        }
        j jVar = fVar.f572r;
        if (jVar == null) {
            return null;
        }
        List listO = jVar.o();
        k.e("getTatumsList(...)", listO);
        for (Object obj2 : listO) {
            i iVar2 = (i) obj2;
            if (iVar2.v() && d6 < iVar2.w() && !iVar2.equals(iVar)) {
                obj = obj2;
                break;
            }
        }
        return (i) obj;
    }

    public final Double c() {
        Double d6 = this.f560e;
        if (d6 == null) {
            return null;
        }
        double dDoubleValue = d6.doubleValue();
        Date date = this.f561f;
        if (date == null) {
            return null;
        }
        return Double.valueOf(AbstractC0698y.i(new Date(), date) + dDoubleValue);
    }

    public final Double d() {
        Double d6 = (Double) this.f568n.getValue();
        if (d6 == null) {
            return null;
        }
        double dDoubleValue = d6.doubleValue();
        Date date = this.f569o;
        if (date == null) {
            return null;
        }
        return Double.valueOf(AbstractC0698y.i(new Date(), date) + dDoubleValue);
    }

    public final void e(short[] sArr) {
        AbstractC0640h abstractC0640hM;
        byte[] bArr;
        try {
            Date date = new Date();
            double length = ((double) sArr.length) / 16000.0d;
            Double dC = c();
            if (dC != null) {
                double dDoubleValue = dC.doubleValue();
                defpackage.c cVar = this.f573s;
                if (cVar != null && (abstractC0640hM = cVar.m()) != null) {
                    int size = abstractC0640hM.size();
                    if (size == 0) {
                        bArr = AbstractC0652u.f8225b;
                    } else {
                        byte[] bArr2 = new byte[size];
                        abstractC0640hM.i(size, bArr2);
                        bArr = bArr2;
                    }
                    LibAudioMatch libAudioMatch = LibAudioMatch.f8512a;
                    k.c(bArr);
                    double d6 = 30;
                    String strMatchAudio = libAudioMatch.matchAudio(sArr, bArr, (float) (dDoubleValue - d6), (float) (d6 + dDoubleValue));
                    d5.b bVar = d5.c.f8594d;
                    bVar.getClass();
                    for (MatchResult matchResult : (MatchResult[]) bVar.a(new i0(x.a(MatchResult.class), MatchResult.Companion.serializer()), strMatchAudio)) {
                        if (Math.abs(dDoubleValue - matchResult.getTime()) < 15.0d && matchResult.getCount() > 10) {
                            double time = matchResult.getTime() + length;
                            a(time);
                            matchResult.getCount();
                            matchResult.getScore();
                            matchResult.getCount();
                            k(time, date);
                            return;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
        } catch (Exception e6) {
            e6.toString();
        }
    }

    public final void f() {
        Double d6;
        M m6 = M.f8305O;
        if (m6.i()) {
            if ((m6.k().isEmpty() && m6.f8336w.f810a.isEmpty()) || (d6 = this.f559d) == null) {
                return;
            }
            double dDoubleValue = d6.doubleValue();
            a aVar = (dDoubleValue < 32.0d || dDoubleValue > 900.0d) ? a.f540h : null;
            if (aVar != null) {
                g(aVar);
                h(aVar);
                return;
            }
            W4.d dVar = D.f4604a;
            AbstractC0336x.o(AbstractC0336x.a(dVar), null, new d(this, null), 3);
            UMPreset uMPresetG = m6.g();
            if (k.a(uMPresetG != null ? uMPresetG.getEngineMode() : null, FXOpt.INSTANCE.getEngineAdvanced())) {
                AbstractC0336x.o(AbstractC0336x.a(dVar), null, new e(this, null), 3);
            }
        }
    }

    public final void g(a aVar) {
        if (this.f570p == null) {
            r0.f8470a.getClass();
            r0.f8473d.b(r0.f8471b[2], 0);
            if (aVar == a.i) {
                WeakReference weakReference = defpackage.f.f8806a;
                defpackage.f.c("analysis2Error", null, l(), 22);
            }
        }
        this.f570p = aVar;
    }

    public final void h(a aVar) {
        if (this.f571q == null) {
            r0.f8470a.getClass();
            r0.f8473d.b(r0.f8471b[2], 0);
            if (aVar == a.i) {
                WeakReference weakReference = defpackage.f.f8806a;
                defpackage.f.c("analysis3Error", null, l(), 22);
            }
        }
        this.f571q = aVar;
    }

    public final void i(j jVar) {
        AbstractC0648p abstractC0648p = (AbstractC0648p) jVar.a(5);
        if (!abstractC0648p.f8223h.equals(jVar)) {
            abstractC0648p.b();
            r rVar = abstractC0648p.i;
            O o6 = O.f8176c;
            o6.getClass();
            o6.a(rVar.getClass()).a(rVar, jVar);
        }
        g gVar = (g) abstractC0648p;
        int iN = ((j) gVar.i).n() / 10;
        gVar.b();
        j.m((j) gVar.i, iN);
        List listUnmodifiableList = Collections.unmodifiableList(((j) gVar.i).o());
        k.e("getTatumsList(...)", listUnmodifiableList);
        i iVar = (i) l.Z(listUnmodifiableList);
        int i = 0;
        int iR = iVar != null ? iVar.r() : 0;
        List listUnmodifiableList2 = Collections.unmodifiableList(((j) gVar.i).o());
        k.e("getTatumsList(...)", listUnmodifiableList2);
        i iVar2 = (i) l.Z(listUnmodifiableList2);
        int iR2 = iVar2 != null ? iVar2.r() : 0;
        List<i> listUnmodifiableList3 = Collections.unmodifiableList(((j) gVar.i).o());
        k.e("getTatumsList(...)", listUnmodifiableList3);
        for (i iVar3 : listUnmodifiableList3) {
            iR = Math.min(iVar3.r(), iR);
            iR2 = Math.max(iVar3.r(), iR2);
        }
        List<i> listUnmodifiableList4 = Collections.unmodifiableList(((j) gVar.i).o());
        k.e("getTatumsList(...)", listUnmodifiableList4);
        ArrayList arrayList = new ArrayList(n.P(listUnmodifiableList4, 10));
        for (i iVar4 : listUnmodifiableList4) {
            AbstractC0648p abstractC0648p2 = (AbstractC0648p) iVar4.a(5);
            if (!abstractC0648p2.f8223h.equals(iVar4)) {
                abstractC0648p2.b();
                r rVar2 = abstractC0648p2.i;
                O o7 = O.f8176c;
                o7.getClass();
                o7.a(rVar2.getClass()).a(rVar2, iVar4);
            }
            arrayList.add((h) abstractC0648p2);
        }
        h hVar = (h) l.Z(arrayList);
        int iP = hVar != null ? ((i) hVar.i).p() : 0;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            h hVar2 = (h) obj;
            int iC = G4.a.C(Math.exp(((double) (((((i) hVar2.i).r() - iR) * 255) / (iR2 - iR))) / 45.82d) - Math.exp(0.0d));
            hVar2.b();
            i.o((i) hVar2.i, iC);
            if (((i) hVar2.i).p() != 0) {
                hVar2.b();
                i.n((i) hVar2.i);
                iP = ((i) hVar2.i).p();
            } else {
                hVar2.b();
                i.k((i) hVar2.i, iP);
            }
        }
        int size2 = arrayList.size();
        Integer numValueOf = null;
        for (int i6 = 1; i6 < size2; i6++) {
            h hVar3 = (h) arrayList.get(i6);
            hVar3.b();
            i.l((i) hVar3.i, 2.0f);
            if (((i) ((h) arrayList.get(i6)).i).v()) {
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    h hVar4 = (h) arrayList.get(iIntValue);
                    float fW = ((i) ((h) arrayList.get(i6)).i).w() - ((i) ((h) arrayList.get(iIntValue)).i).w();
                    hVar4.b();
                    i.l((i) hVar4.i, fW);
                }
                numValueOf = Integer.valueOf(i6);
            }
            int i7 = i6 - 1;
            h hVar5 = (h) arrayList.get(i7);
            float fW2 = ((i) ((h) arrayList.get(i6)).i).w() - ((i) ((h) arrayList.get(i7)).i).w();
            hVar5.b();
            i.m((i) hVar5.i, fW2);
        }
        gVar.b();
        j.l((j) gVar.i);
        ArrayList arrayList2 = new ArrayList(n.P(arrayList, 10));
        int size3 = arrayList.size();
        while (i < size3) {
            Object obj2 = arrayList.get(i);
            i++;
            r rVarA = ((h) obj2).a();
            rVarA.getClass();
            if (!r.d(rVarA, true)) {
                throw new UninitializedMessageException();
            }
            arrayList2.add((i) rVarA);
        }
        gVar.b();
        j.k((j) gVar.i, arrayList2);
        r rVarA2 = gVar.a();
        rVarA2.getClass();
        if (!r.d(rVarA2, true)) {
            throw new UninitializedMessageException();
        }
        this.f572r = (j) rVarA2;
    }

    public final void j(Double d6) {
        if (d6 == null) {
            return;
        }
        Double dC = c();
        if (Math.abs((dC != null ? dC.doubleValue() : 0.0d) - d6.doubleValue()) < 0.2d) {
            return;
        }
        this.f560e = d6;
        this.f561f = new Date();
        Double d7 = d();
        if (d7 != null) {
            double dDoubleValue = d7.doubleValue();
            Double dC2 = c();
            if (dC2 == null || Math.abs(dC2.doubleValue() - dDoubleValue) <= 5.0d) {
                return;
            }
            this.f568n.setValue(null);
            this.f569o = null;
        }
    }

    public final void k(double d6, Date date) {
        double d7 = d6 + 0.03d;
        double dI = AbstractC0698y.i(new Date(), date) + d7;
        Double dC = c();
        if (dC != null) {
            double dAbs = Math.abs(dC.doubleValue() - dI);
            Double d8 = d();
            double dAbs2 = Math.abs((d8 != null ? d8.doubleValue() : 0.0d) - dI);
            String strA = a(dI);
            Double dC2 = c();
            StringBuilder sbO = AbstractC0013g0.o("New Shazam Position: ", strA, "   --  playerPosition: ", a(dC2 != null ? dC2.doubleValue() : 0.0d), "  --  diffFromPlayer: ");
            sbO.append(dAbs);
            sbO.append("   --  diffFromLastShazam: ");
            sbO.append(dAbs2);
            System.out.println((Object) sbO.toString());
            if (dAbs2 <= 0.05d || dAbs >= 10.0d) {
                return;
            }
            Double dValueOf = Double.valueOf(d7);
            C0217h0 c0217h0 = this.f568n;
            c0217h0.setValue(dValueOf);
            this.f569o = date;
        }
    }

    public final Map l() {
        return z.U(new p084p4.h("uri", String.valueOf(this.f556a)), new p084p4.h("name", String.valueOf(this.f557b)), new p084p4.h("artist", String.valueOf(this.f558c)), new p084p4.h("duration", String.valueOf(this.f559d)), new p084p4.h("mediaId", String.valueOf(this.i)), new p084p4.h("source", String.valueOf(this.f564j)), new p084p4.h("isrc", String.valueOf(this.f567m)), new p084p4.h("analysis2Error", String.valueOf(this.f570p)), new p084p4.h("analysis3Error", String.valueOf(this.f571q)), new p084p4.h("dlAnalysis", String.valueOf(this.f572r)), new p084p4.h("analysis3", String.valueOf(this.f573s)));
    }
}

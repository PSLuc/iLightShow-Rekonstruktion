package N3;

import N.C0208d;
import N.C0209d0;
import N.C0217h0;
import N.InterfaceC0203a0;
import com.nanjoran.ilightshow.Services.Palette;
import com.nanjoran.ilightshow.Services.PaletteColor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: N3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0271j implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4199h;
    public final /* synthetic */ InterfaceC0203a0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4200j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f4201k;

    public /* synthetic */ C0271j(int i, InterfaceC0203a0 interfaceC0203a0, Object obj, Object obj2) {
        this.f4199h = i;
        this.f4200j = obj;
        this.f4201k = obj2;
        this.i = interfaceC0203a0;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    @Override // D4.c
    public final Object invoke(Object obj) throws Exception {
        p029f.g gVar;
        p084p4.x xVar;
        switch (this.f4199h) {
            case 0:
                X.s sVar = (X.s) this.f4200j;
                E4.k.f("$selectedColors", sVar);
                Palette palette = (Palette) this.f4201k;
                E4.k.f("$palette", palette);
                InterfaceC0203a0 interfaceC0203a0 = this.i;
                E4.k.f("$parentSize$delegate", interfaceC0203a0);
                interfaceC0203a0.setValue(new S0.j(((S0.j) obj).f4896a));
                float fMin = Math.min((int) (((S0.j) interfaceC0203a0.getValue()).f4896a >> 32), (int) (((S0.j) interfaceC0203a0.getValue()).f4896a & 4294967295L)) / 2.0f;
                if (sVar.isEmpty() && fMin > 0.0f) {
                    List<PaletteColor> colors = palette.getColors();
                    E4.k.f("colors", colors);
                    long jY = p081p0.c.y(fMin, fMin);
                    ArrayList arrayList = new ArrayList(p089q4.n.P(colors, 10));
                    Iterator it = colors.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i3 = i + 1;
                        if (i < 0) {
                            p089q4.m.O();
                            throw null;
                        }
                        PaletteColor paletteColor = (PaletteColor) next;
                        float hue = (float) ((((double) paletteColor.getHue()) * 3.141592653589793d) / ((double) 180));
                        float saturation = paletteColor.getSaturation() * fMin;
                        double d6 = hue;
                        float f6 = fMin;
                        float fCos = (((float) Math.cos(d6)) * saturation) + p030f0.c.d(jY);
                        float fSin = (saturation * ((float) Math.sin(d6))) + p030f0.c.e(jY);
                        arrayList.add(C0208d.K(new U0(i, p081p0.c.y(fCos, fSin), p081p0.c.y(fCos, fSin), paletteColor), N.U.f3673m));
                        fMin = f6;
                        it = it;
                        i = i3;
                    }
                    sVar.addAll(arrayList);
                }
                return p084p4.x.f10867a;
            case 1:
                ((InterfaceC0203a0) this.f4201k).setValue(Boolean.TRUE);
                ((D4.a) this.f4200j).invoke();
                InterfaceC0203a0 interfaceC0203a1 = this.i;
                interfaceC0203a1.setValue(U0.a((U0) interfaceC0203a1.getValue(), ((U0) interfaceC0203a1.getValue()).f4129c, 0L, null, 13));
                return p084p4.x.f10867a;
            case 2:
                float fFloatValue = ((Float) obj).floatValue();
                List list = (List) this.f4200j;
                E4.k.f("$divisors", list);
                D3.j jVar = (D3.j) this.f4201k;
                E4.k.f("$light", jVar);
                C0209d0 c0209d0 = (C0209d0) this.i;
                E4.k.f("$segmentIndex$delegate", c0209d0);
                c0209d0.j(fFloatValue);
                int iO = p081p0.c.O(G4.a.D(fFloatValue), 0, list.size() - 1);
                D3.h hVar = jVar.f806h;
                if (hVar != null) {
                    hVar.f794j = ((Number) list.get(iO)).intValue();
                }
                return p084p4.x.f10867a;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                G2.a aVar = (G2.a) this.f4200j;
                p018d.g gVar2 = (p018d.g) this.f4201k;
                E4.k.f("$requestPermissionLauncher", gVar2);
                InterfaceC0203a0 interfaceC0203a2 = this.i;
                E4.k.f("$micEnabled$delegate", interfaceC0203a2);
                boolean z5 = false;
                if (zBooleanValue) {
                    C0217h0 c0217h0 = aVar.f1680c;
                    G2.e eVar = (G2.e) c0217h0.getValue();
                    E4.k.f("<this>", eVar);
                    G2.d dVar = G2.d.f1683a;
                    if (eVar.equals(dVar)) {
                        gVar = gVar2.f8557k.f8549a;
                        if (gVar != null) {
                            gVar.R("android.permission.RECORD_AUDIO");
                            xVar = p084p4.x.f10867a;
                        } else {
                            xVar = null;
                        }
                        if (xVar == null) {
                            throw new IllegalStateException("Launcher has not been initialized");
                        }
                    } else {
                        G2.e eVar2 = (G2.e) c0217h0.getValue();
                        E4.k.f("<this>", eVar2);
                        if (!eVar2.equals(dVar)) {
                            if (!(eVar2 instanceof G2.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            z5 = ((G2.c) eVar2).f1682a;
                        }
                        if (!z5) {
                            gVar = gVar2.f8557k.f8549a;
                            if (gVar != null) {
                                gVar.R("android.permission.RECORD_AUDIO");
                                xVar = p084p4.x.f10867a;
                            } else {
                                xVar = null;
                            }
                            if (xVar == null) {
                                throw new IllegalStateException("Launcher has not been initialized");
                            }
                        }
                    }
                } else {
                    interfaceC0203a2.setValue(Boolean.FALSE);
                    com.nanjoran.ilightshow.Services.M.f8305O.f8325l.c(false);
                }
                return p084p4.x.f10867a;
        }
    }

    public /* synthetic */ C0271j(D4.a aVar, InterfaceC0203a0 interfaceC0203a0, InterfaceC0203a0 interfaceC0203a1) {
        this.f4199h = 1;
        this.f4200j = aVar;
        this.i = interfaceC0203a0;
        this.f4201k = interfaceC0203a1;
    }
}

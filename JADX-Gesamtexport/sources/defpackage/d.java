package defpackage;

import D4.c;
import E4.k;
import K4.b;
import N.G;
import N3.C0267h;
import Y4.a;
import c5.AbstractC0476a0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.Services.AbstractC0698y;
import com.nanjoran.ilightshow.Services.M;
import com.nanjoran.ilightshow.Services.PaletteColor;
import com.nanjoran.ilightshow.Services.lights.hue.DeviceHueBridge;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.RecurringDays;
import d5.g;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;
import p030f0.f;
import p035g0.r;
import p084p4.x;
import p089q4.m;
import p090r.C0873l;
import p096s.AbstractC0909d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8548h;

    public /* synthetic */ d(int i) {
        this.f8548h = i;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        float f6;
        float f7;
        float f8;
        switch (this.f8548h) {
            case 0:
                g gVar = (g) obj;
                k.f("$this$Json", gVar);
                gVar.f8605c = true;
                return x.f10867a;
            case 1:
                ((Throwable) obj).printStackTrace();
                return x.f10867a;
            case 2:
                k.f("$this$DisposableEffect", (G) obj);
                return new C0267h(0);
            case 3:
                p044i0.d dVar = (p044i0.d) obj;
                k.f("$this$Canvas", dVar);
                long jF = dVar.f();
                float f9 = 2;
                long jY = p081p0.c.y(f.d(jF) / f9, f.b(jF) / f9);
                float fC = f.c(dVar.f()) / 1.5f;
                dVar.R(new p035g0.G(m.M(new r(r.b(0.4f, r.f9076b)), new r(r.f9084k)), jY, fC), fC, jY, p044i0.g.f9389a);
                return x.f10867a;
            case 4:
                M.f8305O.F(((Float) obj).floatValue());
                return x.f10867a;
            case 5:
                k.f("$this$DisposableEffect", (G) obj);
                return new C0267h(1);
            case 6:
                k.f("$this$DisposableEffect", (G) obj);
                return new C0267h(2);
            case 7:
                k.f("$this$DisposableEffect", (G) obj);
                return new C0267h(3);
            case 8:
                k.f("$this$DisposableEffect", (G) obj);
                return new C0267h(4);
            case 9:
                k.f("$this$DisposableEffect", (G) obj);
                return new C0267h(5);
            case 10:
                M.f8305O.M(((Boolean) obj).booleanValue());
                return x.f10867a;
            case 11:
                C0873l c0873l = (C0873l) obj;
                k.f("$this$NavHost", c0873l);
                return C0873l.e(c0873l, 4, AbstractC0909d.k(300, 6, null));
            case 12:
                C0873l c0873l2 = (C0873l) obj;
                k.f("$this$NavHost", c0873l2);
                return C0873l.f(c0873l2, 4, AbstractC0909d.k(300, 6, null));
            case 13:
                C0873l c0873l3 = (C0873l) obj;
                k.f("$this$NavHost", c0873l3);
                return C0873l.e(c0873l3, 5, AbstractC0909d.k(300, 6, null));
            case 14:
                C0873l c0873l4 = (C0873l) obj;
                k.f("$this$NavHost", c0873l4);
                return C0873l.f(c0873l4, 5, AbstractC0909d.k(300, 6, null));
            case 15:
                k.f("$this$DisposableEffect", (G) obj);
                return new C0267h(6);
            case 16:
                k.f("$this$DisposableEffect", (G) obj);
                return new C0267h(7);
            case b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                p044i0.d dVar2 = (p044i0.d) obj;
                k.f("$this$drawBehind", dVar2);
                p044i0.d.c0(dVar2, r.f9080f, dVar2.y(8), 0L, null, RecurringDays.RECURRING_WEEKDAYS);
                return x.f10867a;
            case b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                p044i0.d dVar3 = (p044i0.d) obj;
                k.f("$this$drawBehind", dVar3);
                p044i0.d.c0(dVar3, r.f9080f, dVar3.y(8), 0L, null, RecurringDays.RECURRING_WEEKDAYS);
                return x.f10867a;
            case b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                k.f("$this$DisposableEffect", (G) obj);
                return new C0267h(8);
            case 20:
                b bVar = (b) obj;
                k.f("it", bVar);
                a aVarC = p006b.a.C(bVar);
                if (aVarC != null) {
                    return aVarC;
                }
                if (AbstractC0476a0.g(bVar)) {
                    return new Y4.c(bVar);
                }
                return null;
            case 21:
                b bVar2 = (b) obj;
                k.f("it", bVar2);
                a aVarC2 = p006b.a.C(bVar2);
                if (aVarC2 == null) {
                    aVarC2 = AbstractC0476a0.g(bVar2) ? new Y4.c(bVar2) : null;
                }
                if (aVarC2 != null) {
                    return AbstractC0599v0.B(aVarC2);
                }
                return null;
            case 22:
                g gVar2 = (g) obj;
                k.f("$this$Json", gVar2);
                gVar2.f8605c = true;
                gVar2.f8603a = true;
                gVar2.f8604b = true;
                return x.f10867a;
            case 23:
                int iIntValue = ((Integer) obj).intValue();
                if (((iIntValue >>> 24) & 255) >= 128) {
                    int i = (iIntValue >>> 16) & 255;
                    int i3 = (iIntValue >>> 8) & 255;
                    int i6 = iIntValue & 255;
                    int iMax = Math.max(i, Math.max(i3, i6));
                    int iMin = Math.min(i, Math.min(i3, i6));
                    float f10 = iMax;
                    if (f10 / 255.0f >= 0.08f) {
                        int i7 = iMax - iMin;
                        float f11 = iMax == 0 ? 0.0f : i7 / f10;
                        if (i7 == 0) {
                            f8 = 0.0f;
                        } else if (iMax == i) {
                            f8 = ((((i3 - i6) / i7) * 60.0f) + 360.0f) % 360.0f;
                        } else {
                            if (iMax == i3) {
                                f6 = (i6 - i) / i7;
                                f7 = 2.0f;
                            } else {
                                f6 = (i - i3) / i7;
                                f7 = 4.0f;
                            }
                            f8 = (f6 + f7) * 60.0f;
                        }
                        return new PaletteColor(AbstractC0698y.a(f8), p081p0.c.N(f11, 0.0f, 1.0f));
                    }
                }
                return null;
            case 24:
                PaletteColor paletteColor = (PaletteColor) obj;
                k.f("it", paletteColor);
                return G4.a.D(paletteColor.getHue() / 12.0f) + ":" + G4.a.D(paletteColor.getSaturation() * 10.0f);
            case 25:
                g gVar3 = (g) obj;
                k.f("$this$Json", gVar3);
                gVar3.f8605c = true;
                gVar3.f8603a = true;
                gVar3.f8604b = false;
                return x.f10867a;
            case 26:
                g gVar4 = (g) obj;
                k.f("$this$Json", gVar4);
                gVar4.f8605c = true;
                return x.f10867a;
            case 27:
                return DeviceHueBridge.send$lambda$7((F2.c) obj);
            case 28:
                a5.a aVar = (a5.a) obj;
                k.f("$this$buildSerialDescriptor", aVar);
                a5.a.a(aVar, "JsonPrimitive", new d5.m(new H3.g(22)));
                a5.a.a(aVar, "JsonNull", new d5.m(new H3.g(23)));
                a5.a.a(aVar, "JsonLiteral", new d5.m(new H3.g(24)));
                a5.a.a(aVar, "JsonObject", new d5.m(new H3.g(25)));
                a5.a.a(aVar, "JsonArray", new d5.m(new H3.g(26)));
                return x.f10867a;
            default:
                return JsonObject.toString$lambda$1((Map.Entry) obj);
        }
    }
}

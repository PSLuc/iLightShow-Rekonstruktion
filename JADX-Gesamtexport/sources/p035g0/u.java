package p035g0;

import E4.k;
import android.graphics.ColorSpace;
import java.util.function.DoubleUnaryOperator;
import p040h0.c;
import p040h0.d;
import p040h0.i;
import p040h0.p;
import p040h0.q;
import p040h0.r;
import p040h0.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public static final ColorSpace a(c cVar) {
        ColorSpace.Rgb.TransferParameters transferParameters;
        if (k.a(cVar, d.f9224c)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (k.a(cVar, d.f9235o)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (k.a(cVar, d.f9236p)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (k.a(cVar, d.f9233m)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (k.a(cVar, d.f9229h)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (k.a(cVar, d.f9228g)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (k.a(cVar, d.f9238r)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (k.a(cVar, d.f9237q)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (k.a(cVar, d.i)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (k.a(cVar, d.f9230j)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (k.a(cVar, d.f9226e)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (k.a(cVar, d.f9227f)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (k.a(cVar, d.f9225d)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (k.a(cVar, d.f9231k)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (k.a(cVar, d.f9234n)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (k.a(cVar, d.f9232l)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (!(cVar instanceof q)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        q qVar = (q) cVar;
        float[] fArrA = qVar.f9265d.a();
        r rVar = qVar.f9268g;
        if (rVar != null) {
            transferParameters = new ColorSpace.Rgb.TransferParameters(rVar.f9279b, rVar.f9280c, rVar.f9281d, rVar.f9282e, rVar.f9283f, rVar.f9284g, rVar.f9278a);
        } else {
            transferParameters = null;
        }
        if (transferParameters != null) {
            return new ColorSpace.Rgb(cVar.f9219a, qVar.f9269h, fArrA, transferParameters);
        }
        String str = cVar.f9219a;
        final p pVar = qVar.f9272l;
        final int i = 0;
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: g0.s
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d6) {
                switch (i) {
                    case 0:
                        return ((Number) ((p) pVar).invoke(Double.valueOf(d6))).doubleValue();
                    default:
                        return ((Number) ((p) pVar).invoke(Double.valueOf(d6))).doubleValue();
                }
            }
        };
        final p pVar2 = qVar.f9275o;
        final int i3 = 1;
        q qVar2 = (q) cVar;
        return new ColorSpace.Rgb(str, qVar.f9269h, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: g0.s
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d6) {
                switch (i3) {
                    case 0:
                        return ((Number) ((p) pVar2).invoke(Double.valueOf(d6))).doubleValue();
                    default:
                        return ((Number) ((p) pVar2).invoke(Double.valueOf(d6))).doubleValue();
                }
            }
        }, qVar2.f9266e, qVar2.f9267f);
    }

    public static final c b(final ColorSpace colorSpace) {
        s sVar;
        int id = colorSpace.getId();
        if (id == ColorSpace.Named.SRGB.ordinal()) {
            return d.f9224c;
        }
        if (id == ColorSpace.Named.ACES.ordinal()) {
            return d.f9235o;
        }
        if (id == ColorSpace.Named.ACESCG.ordinal()) {
            return d.f9236p;
        }
        if (id == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return d.f9233m;
        }
        if (id == ColorSpace.Named.BT2020.ordinal()) {
            return d.f9229h;
        }
        if (id == ColorSpace.Named.BT709.ordinal()) {
            return d.f9228g;
        }
        if (id == ColorSpace.Named.CIE_LAB.ordinal()) {
            return d.f9238r;
        }
        if (id == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return d.f9237q;
        }
        if (id == ColorSpace.Named.DCI_P3.ordinal()) {
            return d.i;
        }
        if (id == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return d.f9230j;
        }
        if (id == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return d.f9226e;
        }
        if (id == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return d.f9227f;
        }
        if (id == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return d.f9225d;
        }
        if (id == ColorSpace.Named.NTSC_1953.ordinal()) {
            return d.f9231k;
        }
        if (id == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return d.f9234n;
        }
        if (id == ColorSpace.Named.SMPTE_C.ordinal()) {
            return d.f9232l;
        }
        if (!(colorSpace instanceof ColorSpace.Rgb)) {
            return d.f9224c;
        }
        ColorSpace.Rgb rgb = (ColorSpace.Rgb) colorSpace;
        ColorSpace.Rgb.TransferParameters transferParameters = rgb.getTransferParameters();
        if (rgb.getWhitePoint().length == 3) {
            float f6 = rgb.getWhitePoint()[0];
            float f7 = rgb.getWhitePoint()[1];
            float f8 = f6 + f7 + rgb.getWhitePoint()[2];
            sVar = new s(f6 / f8, f7 / f8);
        } else {
            sVar = new s(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1]);
        }
        s sVar2 = sVar;
        r rVar = transferParameters != null ? new r(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f) : null;
        String name = rgb.getName();
        float[] primaries = rgb.getPrimaries();
        float[] transform = rgb.getTransform();
        final int i = 0;
        i iVar = new i() { // from class: g0.t
            @Override // p040h0.i
            public final double b(double d6) {
                switch (i) {
                    case 0:
                        return ((ColorSpace.Rgb) colorSpace).getOetf().applyAsDouble(d6);
                    default:
                        return ((ColorSpace.Rgb) colorSpace).getEotf().applyAsDouble(d6);
                }
            }
        };
        final int i3 = 1;
        return new q(name, primaries, sVar2, transform, iVar, new i() { // from class: g0.t
            @Override // p040h0.i
            public final double b(double d6) {
                switch (i3) {
                    case 0:
                        return ((ColorSpace.Rgb) colorSpace).getOetf().applyAsDouble(d6);
                    default:
                        return ((ColorSpace.Rgb) colorSpace).getEotf().applyAsDouble(d6);
                }
            }
        }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0), rVar, rgb.getId());
    }
}

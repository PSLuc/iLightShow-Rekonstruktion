package p040h0;

import E4.k;
import F.C0074p;
import java.util.Arrays;
import p035g0.H;

/* JADX INFO: loaded from: classes.dex */
public final class q extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0074p f9264r = new C0074p(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f9265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f9266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f9267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f9268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f9269h;
    public final float[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f9270j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i f9271k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f9272l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f9273m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i f9274n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p f9275o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f9276p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f9277q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:42:0x0210  */
    /* JADX WARN: Code duplicated, block: B:45:0x0215  */
    /* JADX WARN: Code duplicated, block: B:47:0x0219  */
    /* JADX WARN: Code duplicated, block: B:53:0x0237  */
    /* JADX WARN: Code duplicated, block: B:56:0x0240  */
    /* JADX WARN: Code duplicated, block: B:63:0x0254  */
    /* JADX WARN: Code duplicated, block: B:65:0x026c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0286  */
    /* JADX WARN: Code duplicated, block: B:77:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0289 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public q(String str, float[] fArr, s sVar, float[] fArr2, i iVar, i iVar2, float f6, float f7, r rVar, int i) {
        int i3;
        char c6;
        float f8;
        float f9;
        boolean z5;
        float[] fArr3;
        q qVar;
        double d6;
        int i6;
        super(i, str, b.f9214a);
        int i7 = 0;
        int i8 = 1;
        this.f9265d = sVar;
        this.f9266e = f6;
        this.f9267f = f7;
        this.f9268g = rVar;
        this.f9271k = iVar;
        this.f9272l = new p(this, i8);
        this.f9273m = new m(this, i7);
        this.f9274n = iVar2;
        this.f9275o = new p(this, i7);
        this.f9276p = new m(this, i8);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f6 >= f7) {
            throw new IllegalArgumentException("Invalid range: min=" + f6 + ", max=" + f7 + "; min must be strictly < max");
        }
        float[] fArr4 = new float[6];
        if (fArr.length == 9) {
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = f10 + f11 + fArr[2];
            fArr4[0] = f10 / f12;
            fArr4[1] = f11 / f12;
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = f13 + f14 + fArr[5];
            fArr4[2] = f13 / f15;
            fArr4[3] = f14 / f15;
            float f16 = fArr[6];
            float f17 = fArr[7];
            float f18 = f16 + f17 + fArr[8];
            fArr4[4] = f16 / f18;
            fArr4[5] = f17 / f18;
        } else {
            System.arraycopy(fArr, 0, fArr4, 0, 6);
        }
        this.f9269h = fArr4;
        if (fArr2 == null) {
            float f19 = fArr4[0];
            float f20 = fArr4[1];
            float f21 = fArr4[2];
            float f22 = fArr4[3];
            float f23 = fArr4[4];
            float f24 = fArr4[5];
            f8 = 1.0f;
            float f25 = 1;
            float f26 = (f25 - f19) / f20;
            float f27 = (f25 - f21) / f22;
            float f28 = (f25 - f23) / f24;
            i3 = 0;
            float f29 = sVar.f9285a;
            c6 = 1;
            float f30 = sVar.f9286b;
            float f31 = (f25 - f29) / f30;
            float f32 = f19 / f20;
            float f33 = (f21 / f22) - f32;
            float f34 = (f29 / f30) - f32;
            float f35 = f27 - f26;
            float f36 = (f23 / f24) - f32;
            float f37 = (((f31 - f26) * f33) - (f34 * f35)) / (((f28 - f26) * f33) - (f35 * f36));
            float f38 = (f34 - (f36 * f37)) / f33;
            float f39 = (1.0f - f38) - f37;
            float f40 = f39 / f20;
            float f41 = f38 / f22;
            float f42 = f37 / f24;
            this.i = new float[]{f40 * f19, f39, ((1.0f - f19) - f20) * f40, f41 * f21, f38, ((1.0f - f21) - f22) * f41, f42 * f23, f37, ((1.0f - f23) - f24) * f42};
        } else {
            i3 = 0;
            c6 = 1;
            f8 = 1.0f;
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.i = fArr2;
        }
        this.f9270j = j.g(this.i);
        float fB = j.b(fArr4);
        float[] fArr5 = d.f9222a;
        if (fB / j.b(d.f9223b) > 0.9f) {
            float[] fArr6 = d.f9222a;
            float f43 = fArr4[i3];
            float f44 = fArr6[i3];
            float f45 = fArr4[c6];
            float f46 = fArr6[c6];
            float f47 = fArr4[2] - fArr6[2];
            float f48 = fArr4[3] - fArr6[3];
            float f49 = fArr4[4];
            float f50 = fArr6[4];
            float f51 = fArr4[5];
            float f52 = fArr6[5];
            f9 = 0.0f;
            float[] fArr7 = new float[6];
            fArr7[i3] = f43 - f44;
            fArr7[c6] = f45 - f46;
            fArr7[2] = f47;
            fArr7[3] = f48;
            fArr7[4] = f49 - f50;
            fArr7[5] = f51 - f52;
            if (j.f(fArr7[i3], fArr7[c6], f44 - f50, f46 - f52) < 0.0f || j.f(fArr6[i3] - fArr6[2], fArr6[c6] - fArr6[3], fArr7[i3], fArr7[c6]) < 0.0f || j.f(fArr7[2], fArr7[3], fArr6[2] - fArr6[i3], fArr6[3] - fArr6[c6]) < 0.0f || j.f(fArr6[2] - fArr6[4], fArr6[3] - fArr6[5], fArr7[2], fArr7[3]) < 0.0f || j.f(fArr7[4], fArr7[5], fArr6[4] - fArr6[2], fArr6[5] - fArr6[3]) < 0.0f || j.f(fArr6[4] - fArr6[i3], fArr6[5] - fArr6[c6], fArr7[4], fArr7[5]) < 0.0f) {
            }
            if (i != 0) {
                fArr3 = d.f9222a;
                if (fArr4 == fArr3) {
                    i6 = i3;
                    while (true) {
                        if (i6 < 6) {
                            if (Float.compare(fArr4[i6], fArr3[i6]) != 0 || Math.abs(fArr4[i6] - fArr3[i6]) <= 0.001f) {
                                i6++;
                            }
                        } else if (j.d(sVar, j.f9253d)) {
                            float[] fArr8 = d.f9222a;
                            qVar = d.f9224c;
                            d6 = 0.0d;
                            while (true) {
                                if (d6 <= 1.0d) {
                                    z5 = c6;
                                } else if (Math.abs(iVar.b(d6) - qVar.f9271k.b(d6)) > 0.001d) {
                                }
                                d6 += 0.00392156862745098d;
                            }
                        }
                    }
                } else if (j.d(sVar, j.f9253d) && f6 == f9 && f7 == f8) {
                    float[] fArr9 = d.f9222a;
                    qVar = d.f9224c;
                    d6 = 0.0d;
                    while (true) {
                        if (d6 <= 1.0d) {
                            z5 = c6;
                        } else if (Math.abs(iVar.b(d6) - qVar.f9271k.b(d6)) > 0.001d && Math.abs(iVar2.b(d6) - qVar.f9274n.b(d6)) <= 0.001d) {
                            d6 += 0.00392156862745098d;
                        }
                    }
                }
                z5 = i3;
            } else {
                z5 = c6;
            }
            this.f9277q = z5;
        }
        f9 = 0.0f;
        int i9 = (f6 > f9 ? 1 : (f6 == f9 ? 0 : -1));
        if (i != 0) {
            fArr3 = d.f9222a;
            if (fArr4 == fArr3) {
                i6 = i3;
                while (true) {
                    if (i6 < 6) {
                        if (Float.compare(fArr4[i6], fArr3[i6]) != 0) {
                        }
                        i6++;
                    } else if (j.d(sVar, j.f9253d)) {
                        float[] fArr10 = d.f9222a;
                        qVar = d.f9224c;
                        d6 = 0.0d;
                        while (true) {
                            if (d6 <= 1.0d) {
                                z5 = c6;
                            } else if (Math.abs(iVar.b(d6) - qVar.f9271k.b(d6)) > 0.001d) {
                            }
                            d6 += 0.00392156862745098d;
                        }
                    }
                }
            } else if (j.d(sVar, j.f9253d)) {
                float[] fArr11 = d.f9222a;
                qVar = d.f9224c;
                d6 = 0.0d;
                while (true) {
                    if (d6 <= 1.0d) {
                        z5 = c6;
                    } else if (Math.abs(iVar.b(d6) - qVar.f9271k.b(d6)) > 0.001d) {
                    }
                    d6 += 0.00392156862745098d;
                }
            }
            z5 = i3;
        } else {
            z5 = c6;
        }
        this.f9277q = z5;
    }

    @Override // p040h0.c
    public final float a(int i) {
        return this.f9267f;
    }

    @Override // p040h0.c
    public final float b(int i) {
        return this.f9266e;
    }

    @Override // p040h0.c
    public final boolean c() {
        return this.f9277q;
    }

    @Override // p040h0.c
    public final long d(float f6, float f7, float f8) {
        double d6 = f6;
        m mVar = this.f9276p;
        float fB = (float) mVar.b(d6);
        float fB2 = (float) mVar.b(f7);
        float fB3 = (float) mVar.b(f8);
        float[] fArr = this.i;
        return (((long) Float.floatToRawIntBits((fArr[6] * fB3) + ((fArr[3] * fB2) + (fArr[0] * fB)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr[7] * fB3) + (fArr[4] * fB2) + (fArr[1] * fB))));
    }

    @Override // p040h0.c
    public final float e(float f6, float f7, float f8) {
        double d6 = f6;
        m mVar = this.f9276p;
        float fB = (float) mVar.b(d6);
        float fB2 = (float) mVar.b(f7);
        float fB3 = (float) mVar.b(f8);
        float[] fArr = this.i;
        return (fArr[8] * fB3) + (fArr[5] * fB2) + (fArr[2] * fB);
    }

    @Override // p040h0.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        q qVar = (q) obj;
        if (Float.compare(qVar.f9266e, this.f9266e) != 0 || Float.compare(qVar.f9267f, this.f9267f) != 0 || !k.a(this.f9265d, qVar.f9265d) || !Arrays.equals(this.f9269h, qVar.f9269h)) {
            return false;
        }
        r rVar = qVar.f9268g;
        r rVar2 = this.f9268g;
        if (rVar2 != null) {
            return k.a(rVar2, rVar);
        }
        if (rVar == null) {
            return true;
        }
        if (k.a(this.f9271k, qVar.f9271k)) {
            return k.a(this.f9274n, qVar.f9274n);
        }
        return false;
    }

    @Override // p040h0.c
    public final long f(float f6, float f7, float f8, float f9, c cVar) {
        float[] fArr = this.f9270j;
        float f10 = (fArr[6] * f8) + (fArr[3] * f7) + (fArr[0] * f6);
        float f11 = (fArr[7] * f8) + (fArr[4] * f7) + (fArr[1] * f6);
        float f12 = (fArr[8] * f8) + (fArr[5] * f7) + (fArr[2] * f6);
        m mVar = this.f9273m;
        return H.b((float) mVar.b(f10), (float) mVar.b(f11), (float) mVar.b(f12), f9, cVar);
    }

    @Override // p040h0.c
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f9269h) + ((this.f9265d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f6 = this.f9266e;
        int iFloatToIntBits = (iHashCode + (f6 == 0.0f ? 0 : Float.floatToIntBits(f6))) * 31;
        float f7 = this.f9267f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f7 == 0.0f ? 0 : Float.floatToIntBits(f7))) * 31;
        r rVar = this.f9268g;
        int iHashCode2 = iFloatToIntBits2 + (rVar != null ? rVar.hashCode() : 0);
        if (rVar != null) {
            return iHashCode2;
        }
        return this.f9274n.hashCode() + ((this.f9271k.hashCode() + (iHashCode2 * 31)) * 31);
    }

    public q(String str, float[] fArr, s sVar, final r rVar, int i) {
        i iVar;
        i iVar2;
        double d6 = rVar.f9283f;
        double d7 = rVar.f9284g;
        if (d6 == 0.0d && d7 == 0.0d) {
            final int i3 = 0;
            iVar = new i() { // from class: h0.o
                @Override // p040h0.i
                public final double b(double d8) {
                    switch (i3) {
                        case 0:
                            r rVar2 = rVar;
                            double d9 = rVar2.f9282e;
                            double d10 = rVar2.f9281d;
                            return d8 >= d9 * d10 ? (Math.pow(d8, 1.0d / rVar2.f9278a) - rVar2.f9280c) / rVar2.f9279b : d8 / d10;
                        case 1:
                            r rVar3 = rVar;
                            double d11 = rVar3.f9279b;
                            double d12 = rVar3.f9282e;
                            double d13 = rVar3.f9281d;
                            return d8 >= d12 * d13 ? (Math.pow(d8 - rVar3.f9283f, 1.0d / rVar3.f9278a) - rVar3.f9280c) / d11 : (d8 - rVar3.f9284g) / d13;
                        case 2:
                            r rVar4 = rVar;
                            return d8 >= rVar4.f9282e ? Math.pow((rVar4.f9279b * d8) + rVar4.f9280c, rVar4.f9278a) : rVar4.f9281d * d8;
                        default:
                            r rVar5 = rVar;
                            return d8 >= rVar5.f9282e ? Math.pow((rVar5.f9279b * d8) + rVar5.f9280c, rVar5.f9278a) + rVar5.f9283f : (rVar5.f9281d * d8) + rVar5.f9284g;
                    }
                }
            };
        } else {
            final int i6 = 1;
            iVar = new i() { // from class: h0.o
                @Override // p040h0.i
                public final double b(double d8) {
                    switch (i6) {
                        case 0:
                            r rVar2 = rVar;
                            double d9 = rVar2.f9282e;
                            double d10 = rVar2.f9281d;
                            return d8 >= d9 * d10 ? (Math.pow(d8, 1.0d / rVar2.f9278a) - rVar2.f9280c) / rVar2.f9279b : d8 / d10;
                        case 1:
                            r rVar3 = rVar;
                            double d11 = rVar3.f9279b;
                            double d12 = rVar3.f9282e;
                            double d13 = rVar3.f9281d;
                            return d8 >= d12 * d13 ? (Math.pow(d8 - rVar3.f9283f, 1.0d / rVar3.f9278a) - rVar3.f9280c) / d11 : (d8 - rVar3.f9284g) / d13;
                        case 2:
                            r rVar4 = rVar;
                            return d8 >= rVar4.f9282e ? Math.pow((rVar4.f9279b * d8) + rVar4.f9280c, rVar4.f9278a) : rVar4.f9281d * d8;
                        default:
                            r rVar5 = rVar;
                            return d8 >= rVar5.f9282e ? Math.pow((rVar5.f9279b * d8) + rVar5.f9280c, rVar5.f9278a) + rVar5.f9283f : (rVar5.f9281d * d8) + rVar5.f9284g;
                    }
                }
            };
        }
        if (d6 == 0.0d && d7 == 0.0d) {
            final int i7 = 2;
            iVar2 = new i() { // from class: h0.o
                @Override // p040h0.i
                public final double b(double d8) {
                    switch (i7) {
                        case 0:
                            r rVar2 = rVar;
                            double d9 = rVar2.f9282e;
                            double d10 = rVar2.f9281d;
                            return d8 >= d9 * d10 ? (Math.pow(d8, 1.0d / rVar2.f9278a) - rVar2.f9280c) / rVar2.f9279b : d8 / d10;
                        case 1:
                            r rVar3 = rVar;
                            double d11 = rVar3.f9279b;
                            double d12 = rVar3.f9282e;
                            double d13 = rVar3.f9281d;
                            return d8 >= d12 * d13 ? (Math.pow(d8 - rVar3.f9283f, 1.0d / rVar3.f9278a) - rVar3.f9280c) / d11 : (d8 - rVar3.f9284g) / d13;
                        case 2:
                            r rVar4 = rVar;
                            return d8 >= rVar4.f9282e ? Math.pow((rVar4.f9279b * d8) + rVar4.f9280c, rVar4.f9278a) : rVar4.f9281d * d8;
                        default:
                            r rVar5 = rVar;
                            return d8 >= rVar5.f9282e ? Math.pow((rVar5.f9279b * d8) + rVar5.f9280c, rVar5.f9278a) + rVar5.f9283f : (rVar5.f9281d * d8) + rVar5.f9284g;
                    }
                }
            };
        } else {
            final int i8 = 3;
            iVar2 = new i() { // from class: h0.o
                @Override // p040h0.i
                public final double b(double d8) {
                    switch (i8) {
                        case 0:
                            r rVar2 = rVar;
                            double d9 = rVar2.f9282e;
                            double d10 = rVar2.f9281d;
                            return d8 >= d9 * d10 ? (Math.pow(d8, 1.0d / rVar2.f9278a) - rVar2.f9280c) / rVar2.f9279b : d8 / d10;
                        case 1:
                            r rVar3 = rVar;
                            double d11 = rVar3.f9279b;
                            double d12 = rVar3.f9282e;
                            double d13 = rVar3.f9281d;
                            return d8 >= d12 * d13 ? (Math.pow(d8 - rVar3.f9283f, 1.0d / rVar3.f9278a) - rVar3.f9280c) / d11 : (d8 - rVar3.f9284g) / d13;
                        case 2:
                            r rVar4 = rVar;
                            return d8 >= rVar4.f9282e ? Math.pow((rVar4.f9279b * d8) + rVar4.f9280c, rVar4.f9278a) : rVar4.f9281d * d8;
                        default:
                            r rVar5 = rVar;
                            return d8 >= rVar5.f9282e ? Math.pow((rVar5.f9279b * d8) + rVar5.f9280c, rVar5.f9278a) + rVar5.f9283f : (rVar5.f9281d * d8) + rVar5.f9284g;
                    }
                }
            };
        }
        this(str, fArr, sVar, null, iVar, iVar2, 0.0f, 1.0f, rVar, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(String str, float[] fArr, s sVar, final double d6, float f6, float f7, int i) {
        i iVar;
        i iVar2 = f9264r;
        if (d6 == 1.0d) {
            iVar = iVar2;
        } else {
            final int i3 = 0;
            iVar = new i() { // from class: h0.n
                @Override // p040h0.i
                public final double b(double d7) {
                    switch (i3) {
                        case 0:
                            if (d7 < 0.0d) {
                                d7 = 0.0d;
                            }
                            return Math.pow(d7, 1.0d / d6);
                        default:
                            if (d7 < 0.0d) {
                                d7 = 0.0d;
                            }
                            return Math.pow(d7, d6);
                    }
                }
            };
        }
        if (d6 != 1.0d) {
            final int i6 = 1;
            iVar2 = new i() { // from class: h0.n
                @Override // p040h0.i
                public final double b(double d7) {
                    switch (i6) {
                        case 0:
                            if (d7 < 0.0d) {
                                d7 = 0.0d;
                            }
                            return Math.pow(d7, 1.0d / d6);
                        default:
                            if (d7 < 0.0d) {
                                d7 = 0.0d;
                            }
                            return Math.pow(d7, d6);
                    }
                }
            };
        }
        this(str, fArr, sVar, null, iVar, iVar2, f6, f7, new r(d6, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}

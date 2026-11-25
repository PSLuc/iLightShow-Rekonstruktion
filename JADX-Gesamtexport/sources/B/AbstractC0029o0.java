package B;

import D.C0057g;
import F.C0074p;
import F.C0080w;
import F.C0083z;
import F.InterfaceC0070l;
import G0.AbstractC0111g;
import G0.C0107c;
import G0.C0108d;
import G0.C0110f;
import L.C0189x;
import N.C0208d;
import N.C0217h0;
import N.C0222k;
import N.C0230o;
import N.C0235q0;
import N.C0245w;
import N.InterfaceC0203a0;
import N.InterfaceC0225l0;
import X.AbstractC0391h;
import android.text.Spanned;
import android.view.KeyEvent;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;
import p091r0.C0879a;
import p113v0.InterfaceC1033p;
import p123x.AbstractC1084q;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;
import p130y0.AbstractC1124c0;

/* JADX INFO: renamed from: B.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0029o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0021k0 f390a = new C0021k0(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0879a f391b = new C0879a(1008);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k1 f392c = new k1(0, 0);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(C0110f c0110f, Z.l lVar, G0.J j4, C0189x c0189x, int i, boolean z5, int i3, int i6, p089q4.v vVar, C0230o c0230o, int i7) {
        int i8;
        C0189x c0189x2;
        int i9;
        int i10;
        boolean z6;
        int i11;
        int i12 = 0;
        c0230o.X(-1064305212);
        if ((i7 & 6) == 0) {
            i8 = (c0230o.f(c0110f) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0230o.f(lVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0230o.f(j4) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i7 & 3072) == 0) {
            c0189x2 = c0189x;
            i8 |= c0230o.h(c0189x2) ? 2048 : 1024;
        } else {
            c0189x2 = c0189x;
        }
        if ((i7 & 24576) == 0) {
            i9 = i;
            i8 |= c0230o.d(i9) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            i9 = i;
        }
        if ((196608 & i7) == 0) {
            i8 |= c0230o.g(z5) ? 131072 : 65536;
        }
        if ((1572864 & i7) == 0) {
            i8 |= c0230o.d(i3) ? 1048576 : 524288;
        }
        if ((12582912 & i7) == 0) {
            i8 |= c0230o.d(i6) ? 8388608 : 4194304;
        }
        if ((100663296 & i7) == 0) {
            i8 |= c0230o.h(vVar) ? 67108864 : 33554432;
        }
        int i13 = i8 | 805306368;
        if ((306783379 & i13) == 306783378 && c0230o.B()) {
            c0230o.P();
        } else {
            w(i6, i3);
            if (c0230o.k(F.J.f1102a) != null) {
                throw new ClassCastException();
            }
            c0230o.V(-1584467526);
            c0230o.p(false);
            p084p4.h hVar = AbstractC0020k.f349a;
            int length = c0110f.f1494h.length();
            List list = c0110f.f1496k;
            if (list == null) {
                i10 = i13;
                z6 = false;
                break;
            }
            int size = list.size();
            while (true) {
                if (i12 >= size) {
                    i10 = i13;
                    z6 = false;
                    break;
                }
                i10 = i13;
                C0108d c0108d = (C0108d) list.get(i12);
                if ((c0108d.f1490a instanceof String) && "androidx.compose.foundation.text.inlineContent".equals(c0108d.f1493d) && AbstractC0111g.c(0, length, c0108d.f1491b, c0108d.f1492c)) {
                    z6 = true;
                    break;
                } else {
                    i12++;
                    i13 = i10;
                }
            }
            boolean zS = com.fasterxml.jackson.databind.deser.std.d0.s(c0110f);
            if (z6 || zS) {
                c0230o.V(-1583391888);
                boolean z7 = (i10 & 14) == 4;
                Object objK = c0230o.K();
                Object obj = C0222k.f3714a;
                if (z7 || objK == obj) {
                    objK = C0208d.K(c0110f, N.U.f3673m);
                    c0230o.f0(objK);
                }
                InterfaceC0203a0 interfaceC0203a0 = (InterfaceC0203a0) objK;
                C0110f c0110f2 = (C0110f) interfaceC0203a0.getValue();
                L0.d dVar = (L0.d) c0230o.k(AbstractC1124c0.i);
                boolean zF = c0230o.f(interfaceC0203a0);
                Object objK2 = c0230o.K();
                if (zF || objK2 == obj) {
                    i11 = 0;
                    objK2 = new r(i11, interfaceC0203a0);
                    c0230o.f0(objK2);
                } else {
                    i11 = 0;
                }
                int i14 = i10 << 6;
                f(lVar, c0110f2, c0189x, z6, vVar, j4, i, z5, i3, i6, dVar, (D4.c) objK2, c0230o, ((i10 >> 3) & 910) | ((i10 >> 12) & 57344) | ((i10 << 9) & 458752) | (3670016 & i14) | (29360128 & i14) | (234881024 & i14) | (i14 & 1879048192), (i10 >> 21) & 896);
                c0230o.p(i11);
            } else {
                c0230o.V(-1584294453);
                Z.o oVarV = v(androidx.compose.ui.graphics.a.b(lVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071), c0110f, j4, c0189x2, i9, z5, i3, i6, (L0.d) c0230o.k(AbstractC1124c0.i), null, null, null);
                C0016i c0016i = C0016i.f330c;
                int i15 = c0230o.f3744P;
                Z.o oVarC = Z.a.c(c0230o, oVarV);
                InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
                InterfaceC1102j.f14043g.getClass();
                C1106n c1106n = C1101i.f14038b;
                c0230o.Z();
                if (c0230o.f3743O) {
                    c0230o.l(c1106n);
                } else {
                    c0230o.i0();
                }
                C0208d.R(C1101i.f14041e, c0230o, c0016i);
                C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M);
                C0208d.R(C1101i.f14039c, c0230o, oVarC);
                C1100h c1100h = C1101i.f14042f;
                if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i15))) {
                    p012c.k.y(i15, c0230o, i15, c1100h);
                }
                c0230o.p(true);
                c0230o.p(false);
            }
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0035s(c0110f, lVar, j4, c0189x, i, z5, i3, i6, vVar, i7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0173  */
    /* JADX WARN: Code duplicated, block: B:104:0x017f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0191  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00be  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00db  */
    /* JADX WARN: Code duplicated, block: B:83:0x00de  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:89:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:94:0x0149  */
    /* JADX WARN: Code duplicated, block: B:95:0x014d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0165  */
    public static final void b(String str, Z.o oVar, G0.J j4, int i, boolean z5, int i3, int i6, C0230o c0230o, int i7, int i8) {
        int i9;
        G0.J j6;
        int i10;
        int i11;
        boolean z6;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z7;
        int i16;
        int i17;
        C1106n c1106n;
        C1100h c1100h;
        C0235q0 c0235q0T;
        int i18;
        c0230o.X(-1186827822);
        if ((i7 & 6) == 0) {
            i9 = (c0230o.f(str) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            i9 |= c0230o.f(oVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            j6 = j4;
            i9 |= c0230o.f(j6) ? HueLog.LogComponent.STREAMDTLS : 128;
        } else {
            j6 = j4;
        }
        if ((i8 & 8) != 0) {
            i9 |= 3072;
        } else if ((i7 & 3072) == 0) {
            i9 |= c0230o.h(null) ? 2048 : 1024;
        }
        int i19 = i8 & 16;
        if (i19 == 0) {
            if ((i7 & 24576) == 0) {
                i10 = i;
                i9 |= c0230o.d(i10) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
            }
            i11 = i8 & 32;
            if (i11 != 0) {
                if ((196608 & i7) == 0) {
                    z6 = z5;
                    if (c0230o.g(z6)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i9 |= i12;
                }
                if ((1572864 & i7) == 0) {
                    if (c0230o.d(i3)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i9 |= i18;
                }
                i13 = i8 & 128;
                if (i13 != 0) {
                    if ((12582912 & i7) == 0) {
                        i14 = i6;
                        if (c0230o.d(i14)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i9 |= i15;
                    }
                    if (((i9 | 100663296) & 38347923) == 38347922 || !c0230o.B()) {
                        if (i19 != 0) {
                            i10 = 1;
                        }
                        if (i11 != 0) {
                            z7 = true;
                        } else {
                            z7 = z6;
                        }
                        if (i13 != 0) {
                            i16 = 1;
                        } else {
                            i16 = i14;
                        }
                        w(i16, i3);
                        if (c0230o.k(F.J.f1102a) != null) {
                            throw new ClassCastException();
                        }
                        c0230o.V(-1588686502);
                        c0230o.p(false);
                        c0230o.V(-1587866335);
                        Z.o oVarK = androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071).k(new TextStringSimpleElement(str, j6, (L0.d) c0230o.k(AbstractC1124c0.i), i10, z7, i3, i16));
                        c0230o.p(false);
                        C0016i c0016i = C0016i.f330c;
                        i17 = c0230o.f3744P;
                        Z.o oVarC = Z.a.c(c0230o, oVarK);
                        InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
                        InterfaceC1102j.f14043g.getClass();
                        c1106n = C1101i.f14038b;
                        c0230o.Z();
                        if (c0230o.f3743O) {
                            c0230o.l(c1106n);
                        } else {
                            c0230o.i0();
                        }
                        C0208d.R(C1101i.f14041e, c0230o, c0016i);
                        C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M);
                        C0208d.R(C1101i.f14039c, c0230o, oVarC);
                        c1100h = C1101i.f14042f;
                        if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i17))) {
                            p012c.k.y(i17, c0230o, i17, c1100h);
                        }
                        c0230o.p(true);
                    } else {
                        c0230o.P();
                        z7 = z6;
                        i16 = i14;
                    }
                    c0235q0T = c0230o.t();
                    if (c0235q0T != null) {
                        c0235q0T.f3780d = new C0032q(str, oVar, j4, i10, z7, i3, i16, i7, i8);
                    }
                }
                i9 |= 12582912;
                i14 = i6;
                if (((i9 | 100663296) & 38347923) == 38347922) {
                    if (i19 != 0) {
                        i10 = 1;
                    }
                    if (i11 != 0) {
                        z7 = true;
                    } else {
                        z7 = z6;
                    }
                    if (i13 != 0) {
                        i16 = 1;
                    } else {
                        i16 = i14;
                    }
                    w(i16, i3);
                    if (c0230o.k(F.J.f1102a) != null) {
                        throw new ClassCastException();
                    }
                    c0230o.V(-1588686502);
                    c0230o.p(false);
                    c0230o.V(-1587866335);
                    Z.o oVarK2 = androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071).k(new TextStringSimpleElement(str, j6, (L0.d) c0230o.k(AbstractC1124c0.i), i10, z7, i3, i16));
                    c0230o.p(false);
                    C0016i c0016i2 = C0016i.f330c;
                    i17 = c0230o.f3744P;
                    Z.o oVarC2 = Z.a.c(c0230o, oVarK2);
                    InterfaceC0225l0 interfaceC0225l0M2 = c0230o.m();
                    InterfaceC1102j.f14043g.getClass();
                    c1106n = C1101i.f14038b;
                    c0230o.Z();
                    if (c0230o.f3743O) {
                        c0230o.l(c1106n);
                    } else {
                        c0230o.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o, c0016i2);
                    C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M2);
                    C0208d.R(C1101i.f14039c, c0230o, oVarC2);
                    c1100h = C1101i.f14042f;
                    if (c0230o.f3743O) {
                        p012c.k.y(i17, c0230o, i17, c1100h);
                    } else {
                        p012c.k.y(i17, c0230o, i17, c1100h);
                    }
                    c0230o.p(true);
                } else {
                    if (i19 != 0) {
                        i10 = 1;
                    }
                    if (i11 != 0) {
                        z7 = true;
                    } else {
                        z7 = z6;
                    }
                    if (i13 != 0) {
                        i16 = 1;
                    } else {
                        i16 = i14;
                    }
                    w(i16, i3);
                    if (c0230o.k(F.J.f1102a) != null) {
                        throw new ClassCastException();
                    }
                    c0230o.V(-1588686502);
                    c0230o.p(false);
                    c0230o.V(-1587866335);
                    Z.o oVarK3 = androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071).k(new TextStringSimpleElement(str, j6, (L0.d) c0230o.k(AbstractC1124c0.i), i10, z7, i3, i16));
                    c0230o.p(false);
                    C0016i c0016i3 = C0016i.f330c;
                    i17 = c0230o.f3744P;
                    Z.o oVarC3 = Z.a.c(c0230o, oVarK3);
                    InterfaceC0225l0 interfaceC0225l0M3 = c0230o.m();
                    InterfaceC1102j.f14043g.getClass();
                    c1106n = C1101i.f14038b;
                    c0230o.Z();
                    if (c0230o.f3743O) {
                        c0230o.l(c1106n);
                    } else {
                        c0230o.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o, c0016i3);
                    C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M3);
                    C0208d.R(C1101i.f14039c, c0230o, oVarC3);
                    c1100h = C1101i.f14042f;
                    if (c0230o.f3743O) {
                        p012c.k.y(i17, c0230o, i17, c1100h);
                    } else {
                        p012c.k.y(i17, c0230o, i17, c1100h);
                    }
                    c0230o.p(true);
                }
                c0235q0T = c0230o.t();
                if (c0235q0T != null) {
                    c0235q0T.f3780d = new C0032q(str, oVar, j4, i10, z7, i3, i16, i7, i8);
                }
            }
            i9 |= 196608;
            z6 = z5;
            if ((1572864 & i7) == 0) {
                if (c0230o.d(i3)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i9 |= i18;
            }
            i13 = i8 & 128;
            if (i13 != 0) {
                if ((12582912 & i7) == 0) {
                    i14 = i6;
                    if (c0230o.d(i14)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i9 |= i15;
                }
                if (((i9 | 100663296) & 38347923) == 38347922) {
                    if (i19 != 0) {
                        i10 = 1;
                    }
                    if (i11 != 0) {
                        z7 = true;
                    } else {
                        z7 = z6;
                    }
                    if (i13 != 0) {
                        i16 = 1;
                    } else {
                        i16 = i14;
                    }
                    w(i16, i3);
                    if (c0230o.k(F.J.f1102a) != null) {
                        throw new ClassCastException();
                    }
                    c0230o.V(-1588686502);
                    c0230o.p(false);
                    c0230o.V(-1587866335);
                    Z.o oVarK4 = androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071).k(new TextStringSimpleElement(str, j6, (L0.d) c0230o.k(AbstractC1124c0.i), i10, z7, i3, i16));
                    c0230o.p(false);
                    C0016i c0016i4 = C0016i.f330c;
                    i17 = c0230o.f3744P;
                    Z.o oVarC4 = Z.a.c(c0230o, oVarK4);
                    InterfaceC0225l0 interfaceC0225l0M4 = c0230o.m();
                    InterfaceC1102j.f14043g.getClass();
                    c1106n = C1101i.f14038b;
                    c0230o.Z();
                    if (c0230o.f3743O) {
                        c0230o.l(c1106n);
                    } else {
                        c0230o.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o, c0016i4);
                    C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M4);
                    C0208d.R(C1101i.f14039c, c0230o, oVarC4);
                    c1100h = C1101i.f14042f;
                    if (c0230o.f3743O) {
                        p012c.k.y(i17, c0230o, i17, c1100h);
                    } else {
                        p012c.k.y(i17, c0230o, i17, c1100h);
                    }
                    c0230o.p(true);
                } else {
                    if (i19 != 0) {
                        i10 = 1;
                    }
                    if (i11 != 0) {
                        z7 = true;
                    } else {
                        z7 = z6;
                    }
                    if (i13 != 0) {
                        i16 = 1;
                    } else {
                        i16 = i14;
                    }
                    w(i16, i3);
                    if (c0230o.k(F.J.f1102a) != null) {
                        throw new ClassCastException();
                    }
                    c0230o.V(-1588686502);
                    c0230o.p(false);
                    c0230o.V(-1587866335);
                    Z.o oVarK5 = androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071).k(new TextStringSimpleElement(str, j6, (L0.d) c0230o.k(AbstractC1124c0.i), i10, z7, i3, i16));
                    c0230o.p(false);
                    C0016i c0016i5 = C0016i.f330c;
                    i17 = c0230o.f3744P;
                    Z.o oVarC5 = Z.a.c(c0230o, oVarK5);
                    InterfaceC0225l0 interfaceC0225l0M5 = c0230o.m();
                    InterfaceC1102j.f14043g.getClass();
                    c1106n = C1101i.f14038b;
                    c0230o.Z();
                    if (c0230o.f3743O) {
                        c0230o.l(c1106n);
                    } else {
                        c0230o.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o, c0016i5);
                    C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M5);
                    C0208d.R(C1101i.f14039c, c0230o, oVarC5);
                    c1100h = C1101i.f14042f;
                    if (c0230o.f3743O) {
                        p012c.k.y(i17, c0230o, i17, c1100h);
                    } else {
                        p012c.k.y(i17, c0230o, i17, c1100h);
                    }
                    c0230o.p(true);
                }
                c0235q0T = c0230o.t();
                if (c0235q0T != null) {
                    c0235q0T.f3780d = new C0032q(str, oVar, j4, i10, z7, i3, i16, i7, i8);
                }
            }
            i9 |= 12582912;
            i14 = i6;
            if (((i9 | 100663296) & 38347923) == 38347922) {
                if (i19 != 0) {
                    i10 = 1;
                }
                if (i11 != 0) {
                    z7 = true;
                } else {
                    z7 = z6;
                }
                if (i13 != 0) {
                    i16 = 1;
                } else {
                    i16 = i14;
                }
                w(i16, i3);
                if (c0230o.k(F.J.f1102a) != null) {
                    throw new ClassCastException();
                }
                c0230o.V(-1588686502);
                c0230o.p(false);
                c0230o.V(-1587866335);
                Z.o oVarK6 = androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071).k(new TextStringSimpleElement(str, j6, (L0.d) c0230o.k(AbstractC1124c0.i), i10, z7, i3, i16));
                c0230o.p(false);
                C0016i c0016i6 = C0016i.f330c;
                i17 = c0230o.f3744P;
                Z.o oVarC6 = Z.a.c(c0230o, oVarK6);
                InterfaceC0225l0 interfaceC0225l0M6 = c0230o.m();
                InterfaceC1102j.f14043g.getClass();
                c1106n = C1101i.f14038b;
                c0230o.Z();
                if (c0230o.f3743O) {
                    c0230o.l(c1106n);
                } else {
                    c0230o.i0();
                }
                C0208d.R(C1101i.f14041e, c0230o, c0016i6);
                C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M6);
                C0208d.R(C1101i.f14039c, c0230o, oVarC6);
                c1100h = C1101i.f14042f;
                if (c0230o.f3743O) {
                    p012c.k.y(i17, c0230o, i17, c1100h);
                } else {
                    p012c.k.y(i17, c0230o, i17, c1100h);
                }
                c0230o.p(true);
            } else {
                if (i19 != 0) {
                    i10 = 1;
                }
                if (i11 != 0) {
                    z7 = true;
                } else {
                    z7 = z6;
                }
                if (i13 != 0) {
                    i16 = 1;
                } else {
                    i16 = i14;
                }
                w(i16, i3);
                if (c0230o.k(F.J.f1102a) != null) {
                    throw new ClassCastException();
                }
                c0230o.V(-1588686502);
                c0230o.p(false);
                c0230o.V(-1587866335);
                Z.o oVarK7 = androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071).k(new TextStringSimpleElement(str, j6, (L0.d) c0230o.k(AbstractC1124c0.i), i10, z7, i3, i16));
                c0230o.p(false);
                C0016i c0016i7 = C0016i.f330c;
                i17 = c0230o.f3744P;
                Z.o oVarC7 = Z.a.c(c0230o, oVarK7);
                InterfaceC0225l0 interfaceC0225l0M7 = c0230o.m();
                InterfaceC1102j.f14043g.getClass();
                c1106n = C1101i.f14038b;
                c0230o.Z();
                if (c0230o.f3743O) {
                    c0230o.l(c1106n);
                } else {
                    c0230o.i0();
                }
                C0208d.R(C1101i.f14041e, c0230o, c0016i7);
                C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M7);
                C0208d.R(C1101i.f14039c, c0230o, oVarC7);
                c1100h = C1101i.f14042f;
                if (c0230o.f3743O) {
                    p012c.k.y(i17, c0230o, i17, c1100h);
                } else {
                    p012c.k.y(i17, c0230o, i17, c1100h);
                }
                c0230o.p(true);
            }
            c0235q0T = c0230o.t();
            if (c0235q0T != null) {
                c0235q0T.f3780d = new C0032q(str, oVar, j4, i10, z7, i3, i16, i7, i8);
            }
        }
        i9 |= 24576;
        i10 = i;
        i11 = i8 & 32;
        if (i11 != 0) {
            if ((196608 & i7) == 0) {
                z6 = z5;
                if (c0230o.g(z6)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i9 |= i12;
            }
            if ((1572864 & i7) == 0) {
                if (c0230o.d(i3)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i9 |= i18;
            }
            i13 = i8 & 128;
            if (i13 != 0) {
                if ((12582912 & i7) == 0) {
                    i14 = i6;
                    if (c0230o.d(i14)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i9 |= i15;
                }
                if (((i9 | 100663296) & 38347923) == 38347922) {
                    if (i19 != 0) {
                        i10 = 1;
                    }
                    if (i11 != 0) {
                        z7 = true;
                    } else {
                        z7 = z6;
                    }
                    if (i13 != 0) {
                        i16 = 1;
                    } else {
                        i16 = i14;
                    }
                    w(i16, i3);
                    if (c0230o.k(F.J.f1102a) != null) {
                        throw new ClassCastException();
                    }
                    c0230o.V(-1588686502);
                    c0230o.p(false);
                    c0230o.V(-1587866335);
                    Z.o oVarK8 = androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071).k(new TextStringSimpleElement(str, j6, (L0.d) c0230o.k(AbstractC1124c0.i), i10, z7, i3, i16));
                    c0230o.p(false);
                    C0016i c0016i8 = C0016i.f330c;
                    i17 = c0230o.f3744P;
                    Z.o oVarC8 = Z.a.c(c0230o, oVarK8);
                    InterfaceC0225l0 interfaceC0225l0M8 = c0230o.m();
                    InterfaceC1102j.f14043g.getClass();
                    c1106n = C1101i.f14038b;
                    c0230o.Z();
                    if (c0230o.f3743O) {
                        c0230o.l(c1106n);
                    } else {
                        c0230o.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o, c0016i8);
                    C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M8);
                    C0208d.R(C1101i.f14039c, c0230o, oVarC8);
                    c1100h = C1101i.f14042f;
                    if (c0230o.f3743O) {
                        p012c.k.y(i17, c0230o, i17, c1100h);
                    } else {
                        p012c.k.y(i17, c0230o, i17, c1100h);
                    }
                    c0230o.p(true);
                } else {
                    if (i19 != 0) {
                        i10 = 1;
                    }
                    if (i11 != 0) {
                        z7 = true;
                    } else {
                        z7 = z6;
                    }
                    if (i13 != 0) {
                        i16 = 1;
                    } else {
                        i16 = i14;
                    }
                    w(i16, i3);
                    if (c0230o.k(F.J.f1102a) != null) {
                        throw new ClassCastException();
                    }
                    c0230o.V(-1588686502);
                    c0230o.p(false);
                    c0230o.V(-1587866335);
                    Z.o oVarK9 = androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071).k(new TextStringSimpleElement(str, j6, (L0.d) c0230o.k(AbstractC1124c0.i), i10, z7, i3, i16));
                    c0230o.p(false);
                    C0016i c0016i9 = C0016i.f330c;
                    i17 = c0230o.f3744P;
                    Z.o oVarC9 = Z.a.c(c0230o, oVarK9);
                    InterfaceC0225l0 interfaceC0225l0M9 = c0230o.m();
                    InterfaceC1102j.f14043g.getClass();
                    c1106n = C1101i.f14038b;
                    c0230o.Z();
                    if (c0230o.f3743O) {
                        c0230o.l(c1106n);
                    } else {
                        c0230o.i0();
                    }
                    C0208d.R(C1101i.f14041e, c0230o, c0016i9);
                    C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M9);
                    C0208d.R(C1101i.f14039c, c0230o, oVarC9);
                    c1100h = C1101i.f14042f;
                    if (c0230o.f3743O) {
                        p012c.k.y(i17, c0230o, i17, c1100h);
                    } else {
                        p012c.k.y(i17, c0230o, i17, c1100h);
                    }
                    c0230o.p(true);
                }
                c0235q0T = c0230o.t();
                if (c0235q0T != null) {
                    c0235q0T.f3780d = new C0032q(str, oVar, j4, i10, z7, i3, i16, i7, i8);
                }
            }
            i9 |= 12582912;
            i14 = i6;
            if (((i9 | 100663296) & 38347923) == 38347922) {
                if (i19 != 0) {
                    i10 = 1;
                }
                if (i11 != 0) {
                    z7 = true;
                } else {
                    z7 = z6;
                }
                if (i13 != 0) {
                    i16 = 1;
                } else {
                    i16 = i14;
                }
                w(i16, i3);
                if (c0230o.k(F.J.f1102a) != null) {
                    throw new ClassCastException();
                }
                c0230o.V(-1588686502);
                c0230o.p(false);
                c0230o.V(-1587866335);
                Z.o oVarK10 = androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071).k(new TextStringSimpleElement(str, j6, (L0.d) c0230o.k(AbstractC1124c0.i), i10, z7, i3, i16));
                c0230o.p(false);
                C0016i c0016i10 = C0016i.f330c;
                i17 = c0230o.f3744P;
                Z.o oVarC10 = Z.a.c(c0230o, oVarK10);
                InterfaceC0225l0 interfaceC0225l0M10 = c0230o.m();
                InterfaceC1102j.f14043g.getClass();
                c1106n = C1101i.f14038b;
                c0230o.Z();
                if (c0230o.f3743O) {
                    c0230o.l(c1106n);
                } else {
                    c0230o.i0();
                }
                C0208d.R(C1101i.f14041e, c0230o, c0016i10);
                C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M10);
                C0208d.R(C1101i.f14039c, c0230o, oVarC10);
                c1100h = C1101i.f14042f;
                if (c0230o.f3743O) {
                    p012c.k.y(i17, c0230o, i17, c1100h);
                } else {
                    p012c.k.y(i17, c0230o, i17, c1100h);
                }
                c0230o.p(true);
            } else {
                if (i19 != 0) {
                    i10 = 1;
                }
                if (i11 != 0) {
                    z7 = true;
                } else {
                    z7 = z6;
                }
                if (i13 != 0) {
                    i16 = 1;
                } else {
                    i16 = i14;
                }
                w(i16, i3);
                if (c0230o.k(F.J.f1102a) != null) {
                    throw new ClassCastException();
                }
                c0230o.V(-1588686502);
                c0230o.p(false);
                c0230o.V(-1587866335);
                Z.o oVarK11 = androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071).k(new TextStringSimpleElement(str, j6, (L0.d) c0230o.k(AbstractC1124c0.i), i10, z7, i3, i16));
                c0230o.p(false);
                C0016i c0016i11 = C0016i.f330c;
                i17 = c0230o.f3744P;
                Z.o oVarC11 = Z.a.c(c0230o, oVarK11);
                InterfaceC0225l0 interfaceC0225l0M11 = c0230o.m();
                InterfaceC1102j.f14043g.getClass();
                c1106n = C1101i.f14038b;
                c0230o.Z();
                if (c0230o.f3743O) {
                    c0230o.l(c1106n);
                } else {
                    c0230o.i0();
                }
                C0208d.R(C1101i.f14041e, c0230o, c0016i11);
                C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M11);
                C0208d.R(C1101i.f14039c, c0230o, oVarC11);
                c1100h = C1101i.f14042f;
                if (c0230o.f3743O) {
                    p012c.k.y(i17, c0230o, i17, c1100h);
                } else {
                    p012c.k.y(i17, c0230o, i17, c1100h);
                }
                c0230o.p(true);
            }
            c0235q0T = c0230o.t();
            if (c0235q0T != null) {
                c0235q0T.f3780d = new C0032q(str, oVar, j4, i10, z7, i3, i16, i7, i8);
            }
        }
        i9 |= 196608;
        z6 = z5;
        if ((1572864 & i7) == 0) {
            if (c0230o.d(i3)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i9 |= i18;
        }
        i13 = i8 & 128;
        if (i13 != 0) {
            if ((12582912 & i7) == 0) {
                i14 = i6;
                if (c0230o.d(i14)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i9 |= i15;
            }
            if (((i9 | 100663296) & 38347923) == 38347922) {
                if (i19 != 0) {
                    i10 = 1;
                }
                if (i11 != 0) {
                    z7 = true;
                } else {
                    z7 = z6;
                }
                if (i13 != 0) {
                    i16 = 1;
                } else {
                    i16 = i14;
                }
                w(i16, i3);
                if (c0230o.k(F.J.f1102a) != null) {
                    throw new ClassCastException();
                }
                c0230o.V(-1588686502);
                c0230o.p(false);
                c0230o.V(-1587866335);
                Z.o oVarK12 = androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071).k(new TextStringSimpleElement(str, j6, (L0.d) c0230o.k(AbstractC1124c0.i), i10, z7, i3, i16));
                c0230o.p(false);
                C0016i c0016i12 = C0016i.f330c;
                i17 = c0230o.f3744P;
                Z.o oVarC12 = Z.a.c(c0230o, oVarK12);
                InterfaceC0225l0 interfaceC0225l0M12 = c0230o.m();
                InterfaceC1102j.f14043g.getClass();
                c1106n = C1101i.f14038b;
                c0230o.Z();
                if (c0230o.f3743O) {
                    c0230o.l(c1106n);
                } else {
                    c0230o.i0();
                }
                C0208d.R(C1101i.f14041e, c0230o, c0016i12);
                C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M12);
                C0208d.R(C1101i.f14039c, c0230o, oVarC12);
                c1100h = C1101i.f14042f;
                if (c0230o.f3743O) {
                    p012c.k.y(i17, c0230o, i17, c1100h);
                } else {
                    p012c.k.y(i17, c0230o, i17, c1100h);
                }
                c0230o.p(true);
            } else {
                if (i19 != 0) {
                    i10 = 1;
                }
                if (i11 != 0) {
                    z7 = true;
                } else {
                    z7 = z6;
                }
                if (i13 != 0) {
                    i16 = 1;
                } else {
                    i16 = i14;
                }
                w(i16, i3);
                if (c0230o.k(F.J.f1102a) != null) {
                    throw new ClassCastException();
                }
                c0230o.V(-1588686502);
                c0230o.p(false);
                c0230o.V(-1587866335);
                Z.o oVarK13 = androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071).k(new TextStringSimpleElement(str, j6, (L0.d) c0230o.k(AbstractC1124c0.i), i10, z7, i3, i16));
                c0230o.p(false);
                C0016i c0016i13 = C0016i.f330c;
                i17 = c0230o.f3744P;
                Z.o oVarC13 = Z.a.c(c0230o, oVarK13);
                InterfaceC0225l0 interfaceC0225l0M13 = c0230o.m();
                InterfaceC1102j.f14043g.getClass();
                c1106n = C1101i.f14038b;
                c0230o.Z();
                if (c0230o.f3743O) {
                    c0230o.l(c1106n);
                } else {
                    c0230o.i0();
                }
                C0208d.R(C1101i.f14041e, c0230o, c0016i13);
                C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M13);
                C0208d.R(C1101i.f14039c, c0230o, oVarC13);
                c1100h = C1101i.f14042f;
                if (c0230o.f3743O) {
                    p012c.k.y(i17, c0230o, i17, c1100h);
                } else {
                    p012c.k.y(i17, c0230o, i17, c1100h);
                }
                c0230o.p(true);
            }
            c0235q0T = c0230o.t();
            if (c0235q0T != null) {
                c0235q0T.f3780d = new C0032q(str, oVar, j4, i10, z7, i3, i16, i7, i8);
            }
        }
        i9 |= 12582912;
        i14 = i6;
        if (((i9 | 100663296) & 38347923) == 38347922) {
            if (i19 != 0) {
                i10 = 1;
            }
            if (i11 != 0) {
                z7 = true;
            } else {
                z7 = z6;
            }
            if (i13 != 0) {
                i16 = 1;
            } else {
                i16 = i14;
            }
            w(i16, i3);
            if (c0230o.k(F.J.f1102a) != null) {
                throw new ClassCastException();
            }
            c0230o.V(-1588686502);
            c0230o.p(false);
            c0230o.V(-1587866335);
            Z.o oVarK14 = androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071).k(new TextStringSimpleElement(str, j6, (L0.d) c0230o.k(AbstractC1124c0.i), i10, z7, i3, i16));
            c0230o.p(false);
            C0016i c0016i14 = C0016i.f330c;
            i17 = c0230o.f3744P;
            Z.o oVarC14 = Z.a.c(c0230o, oVarK14);
            InterfaceC0225l0 interfaceC0225l0M14 = c0230o.m();
            InterfaceC1102j.f14043g.getClass();
            c1106n = C1101i.f14038b;
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n);
            } else {
                c0230o.i0();
            }
            C0208d.R(C1101i.f14041e, c0230o, c0016i14);
            C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M14);
            C0208d.R(C1101i.f14039c, c0230o, oVarC14);
            c1100h = C1101i.f14042f;
            if (c0230o.f3743O) {
                p012c.k.y(i17, c0230o, i17, c1100h);
            } else {
                p012c.k.y(i17, c0230o, i17, c1100h);
            }
            c0230o.p(true);
        } else {
            if (i19 != 0) {
                i10 = 1;
            }
            if (i11 != 0) {
                z7 = true;
            } else {
                z7 = z6;
            }
            if (i13 != 0) {
                i16 = 1;
            } else {
                i16 = i14;
            }
            w(i16, i3);
            if (c0230o.k(F.J.f1102a) != null) {
                throw new ClassCastException();
            }
            c0230o.V(-1588686502);
            c0230o.p(false);
            c0230o.V(-1587866335);
            Z.o oVarK15 = androidx.compose.ui.graphics.a.b(oVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071).k(new TextStringSimpleElement(str, j6, (L0.d) c0230o.k(AbstractC1124c0.i), i10, z7, i3, i16));
            c0230o.p(false);
            C0016i c0016i15 = C0016i.f330c;
            i17 = c0230o.f3744P;
            Z.o oVarC15 = Z.a.c(c0230o, oVarK15);
            InterfaceC0225l0 interfaceC0225l0M15 = c0230o.m();
            InterfaceC1102j.f14043g.getClass();
            c1106n = C1101i.f14038b;
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n);
            } else {
                c0230o.i0();
            }
            C0208d.R(C1101i.f14041e, c0230o, c0016i15);
            C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M15);
            C0208d.R(C1101i.f14039c, c0230o, oVarC15);
            c1100h = C1101i.f14042f;
            if (c0230o.f3743O) {
                p012c.k.y(i17, c0230o, i17, c1100h);
            } else {
                p012c.k.y(i17, c0230o, i17, c1100h);
            }
            c0230o.p(true);
        }
        c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0032q(str, oVar, j4, i10, z7, i3, i16, i7, i8);
        }
    }

    public static final void c(F.P p6, V.a aVar, C0230o c0230o, int i) {
        int i3;
        V.a aVar2;
        C0230o c0230o2;
        c0230o.X(-1985516685);
        if ((i & 6) == 0) {
            i3 = (c0230o.h(p6) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c0230o.h(aVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && c0230o.B()) {
            c0230o.P();
            aVar2 = aVar;
            c0230o2 = c0230o;
        } else {
            Object objK = c0230o.K();
            N.U u6 = C0222k.f3714a;
            if (objK == u6) {
                objK = new p107u.l();
                c0230o.f0(objK);
            }
            p107u.l lVar = (p107u.l) objK;
            Object objK2 = c0230o.K();
            if (objK2 == u6) {
                objK2 = new C0043w(1, lVar);
                c0230o.f0(objK2);
            }
            aVar2 = aVar;
            c0230o2 = c0230o;
            com.fasterxml.jackson.databind.deser.std.d0.g(lVar, (D4.a) objK2, new C0005c0(8, p6, lVar, false), null, p6.h(), aVar2, c0230o2, ((i3 << 12) & 458752) | 54);
        }
        C0235q0 c0235q0T = c0230o2.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0018j(i, 1, p6, aVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:227:0x0454  */
    /* JADX WARN: Code duplicated, block: B:263:0x055d  */
    /* JADX WARN: Code duplicated, block: B:270:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:274:0x05ee A[PHI: r26
  0x05ee: PHI (r26v5 Z.o) = (r26v0 Z.o), (r26v7 Z.o) binds: [B:273:0x05ec, B:271:0x05e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:275:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:278:0x05f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:281:0x0606  */
    /* JADX WARN: Code duplicated, block: B:284:0x062a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:285:0x062c  */
    /* JADX WARN: Code duplicated, block: B:288:0x0652  */
    /* JADX WARN: Code duplicated, block: B:289:0x0654  */
    /* JADX WARN: Code duplicated, block: B:292:0x065c  */
    /* JADX WARN: Code duplicated, block: B:293:0x065e  */
    /* JADX WARN: Code duplicated, block: B:296:0x0670 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:299:0x0676  */
    /* JADX WARN: Code duplicated, block: B:302:0x0689  */
    /* JADX WARN: Code duplicated, block: B:303:0x0694  */
    /* JADX WARN: Code duplicated, block: B:306:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:307:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:310:0x06d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:311:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:314:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:315:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:318:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:319:0x0700  */
    /* JADX WARN: Code duplicated, block: B:322:0x070d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:325:0x071d  */
    /* JADX WARN: Code duplicated, block: B:328:0x0743  */
    /* JADX WARN: Code duplicated, block: B:329:0x0745  */
    /* JADX WARN: Code duplicated, block: B:332:0x074b  */
    /* JADX WARN: Code duplicated, block: B:333:0x074d  */
    /* JADX WARN: Code duplicated, block: B:336:0x0758  */
    /* JADX WARN: Code duplicated, block: B:337:0x075a  */
    /* JADX WARN: Code duplicated, block: B:340:0x076f  */
    /* JADX WARN: Code duplicated, block: B:342:0x0775  */
    /* JADX WARN: Code duplicated, block: B:348:0x0783 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:349:0x0785  */
    /* JADX WARN: Code duplicated, block: B:354:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:362:0x07da  */
    /* JADX WARN: Code duplicated, block: B:365:0x07df  */
    /* JADX WARN: Code duplicated, block: B:366:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:369:0x0801 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:370:0x0803  */
    /* JADX WARN: Code duplicated, block: B:373:0x081e  */
    /* JADX WARN: Code duplicated, block: B:374:0x0820  */
    /* JADX WARN: Code duplicated, block: B:377:0x0826  */
    /* JADX WARN: Code duplicated, block: B:379:0x082c  */
    /* JADX WARN: Code duplicated, block: B:385:0x083a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:388:0x083f  */
    /* JADX WARN: Code duplicated, block: B:391:0x0858  */
    /* JADX WARN: Code duplicated, block: B:392:0x085a  */
    /* JADX WARN: Code duplicated, block: B:395:0x0888  */
    /* JADX WARN: Code duplicated, block: B:397:0x088e  */
    /* JADX WARN: Code duplicated, block: B:403:0x08a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:404:0x08a6  */
    /* JADX WARN: Code duplicated, block: B:407:0x0909  */
    /* JADX WARN: Code duplicated, block: B:415:0x092b  */
    public static final void d(M0.w wVar, D4.c cVar, Z.o oVar, G0.J j4, C0074p c0074p, D4.c cVar2, p117w.m mVar, p035g0.O o6, boolean z5, int i, int i3, M0.m mVar2, C0033q0 c0033q0, boolean z6, V.a aVar, C0230o c0230o, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        Object obj;
        M0.C c6;
        Object obj2;
        N.U u6;
        G0.J j6;
        boolean z7;
        C0110f c0110f;
        S0.b bVar;
        L0.d dVar;
        Object obj3;
        C0230o c0230o2;
        S0.b bVar2;
        boolean z8;
        boolean z9;
        M0.w wVarA;
        M0.m mVar3;
        p024e0.g gVar;
        M0.x xVar;
        boolean zH;
        Object l6;
        p024e0.n nVar;
        C0036s0 c0036s0;
        M0.x xVar2;
        boolean z10;
        F.P p6;
        M0.w wVar2;
        M0.m mVar4;
        C0230o c0230o3;
        Z.o oVarA;
        InterfaceC0203a0 interfaceC0203a0N;
        p084p4.x xVar3;
        Z.o oVar2;
        boolean z11;
        boolean z12;
        Object c0049z;
        F.P p7;
        p084p4.x xVar4;
        InterfaceC0203a0 interfaceC0203a0;
        boolean zH2;
        Object obj4;
        Z.o oVarA2;
        boolean z13;
        boolean z14;
        boolean zH3;
        Object objK;
        M0.q qVar;
        D4.c cVar3;
        boolean z15;
        boolean zH4;
        Object obj5;
        boolean z16;
        boolean z17;
        boolean zH5;
        Object m6;
        M0.q qVar2;
        boolean z18;
        p130y0.M0 m7;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        Object objK2;
        F.P p8;
        boolean z23;
        M0.q qVar3;
        Z.o oVarA3;
        boolean zH6;
        Object obj6;
        M0.x xVar5;
        boolean z24;
        boolean z25;
        Object objK3;
        M0.m mVar5;
        boolean z26;
        F.P p9;
        boolean z27;
        Object objK4;
        int i11;
        C0230o c0230o4;
        c0230o.X(-958708118);
        if ((i6 & 6) == 0) {
            i8 = (c0230o.f(wVar) ? 4 : 2) | i6;
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= c0230o.h(cVar) ? 32 : 16;
        }
        int i12 = i8;
        if ((i6 & 384) == 0) {
            i9 = i12 | (c0230o.f(oVar) ? 256 : 128);
        } else {
            i9 = i12;
        }
        if ((i6 & 3072) == 0) {
            i9 |= c0230o.f(j4) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i9 |= c0230o.f(c0074p) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i6 & 196608) == 0) {
            i9 |= c0230o.h(cVar2) ? 131072 : 65536;
        }
        if ((i6 & 1572864) == 0) {
            i9 |= c0230o.f(mVar) ? 1048576 : 524288;
        }
        if ((i6 & 12582912) == 0) {
            i9 |= c0230o.f(o6) ? 8388608 : 4194304;
        }
        if ((i6 & 100663296) == 0) {
            i9 |= c0230o.g(z5) ? 67108864 : 33554432;
        }
        if ((i6 & 805306368) == 0) {
            i9 |= c0230o.d(i) ? 536870912 : 268435456;
        }
        if ((i7 & 6) == 0) {
            i10 = i7 | (c0230o.d(i3) ? 4 : 2);
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= c0230o.f(mVar2) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= c0230o.f(c0033q0) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i10 |= c0230o.g(z6) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i10 |= c0230o.g(false) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i7 & 196608) == 0) {
            i10 |= c0230o.h(aVar) ? 131072 : 65536;
        }
        int i13 = i10;
        if ((i9 & 306783379) == 306783378 && (74899 & i13) == 74898 && c0230o.B()) {
            c0230o.P();
            c0230o4 = c0230o;
        } else {
            c0230o.R();
            if ((i6 & 1) != 0 && !c0230o.z()) {
                c0230o.P();
            }
            c0230o.q();
            Object objK5 = c0230o.K();
            N.U u7 = C0222k.f3714a;
            Object obj7 = objK5;
            if (objK5 == u7) {
                p024e0.n nVar2 = new p024e0.n();
                c0230o.f0(nVar2);
                obj7 = nVar2;
            }
            p024e0.n nVar3 = (p024e0.n) obj7;
            Object objK6 = c0230o.K();
            Object obj8 = objK6;
            if (objK6 == u7) {
                D.B b6 = D.C.f644a;
                C0057g c0057g = new C0057g();
                c0230o.f0(c0057g);
                obj8 = c0057g;
            }
            C0057g c0057g2 = (C0057g) obj8;
            Object objK7 = c0230o.K();
            Object obj9 = objK7;
            if (objK7 == u7) {
                M0.x xVar6 = new M0.x(c0057g2);
                c0230o.f0(xVar6);
                obj9 = xVar6;
            }
            M0.x xVar7 = (M0.x) obj9;
            S0.b bVar3 = (S0.b) c0230o.k(AbstractC1124c0.f14367f);
            L0.d dVar2 = (L0.d) c0230o.k(AbstractC1124c0.i);
            long j7 = ((F.Y) c0230o.k(F.Z.f1154a)).f1153b;
            p024e0.g gVar2 = (p024e0.g) c0230o.k(AbstractC1124c0.f14368g);
            int i14 = i9;
            p130y0.M0 m8 = (p130y0.M0) c0230o.k(AbstractC1124c0.f14378r);
            p130y0.C0 c7 = (p130y0.C0) c0230o.k(AbstractC1124c0.f14374n);
            p112v.W w6 = p112v.W.f12920h;
            Object[] objArr = {w6};
            D.x xVar8 = W0.f251f;
            boolean zF = c0230o.f(w6);
            Object objK8 = c0230o.K();
            if (zF || objK8 == u7) {
                C0043w c0043w = new C0043w(3, w6);
                c0230o.f0(c0043w);
                obj = c0043w;
            } else {
                obj = objK8;
            }
            W0 w7 = (W0) p020d2.n.H(objArr, xVar8, (D4.a) obj, c0230o, 0, 4);
            int i15 = i14 & 14;
            boolean z28 = (i15 == 4) | ((i14 & 57344) == 16384);
            Object objK9 = c0230o.K();
            G0.I i16 = wVar.f3455c;
            C0110f c0110f2 = wVar.f3453a;
            if (z28 || objK9 == u7) {
                M0.C cO = o(c0074p, c0110f2);
                if (i16 != null) {
                    M0.q qVar4 = cO.f3393b;
                    int i17 = G0.I.f1469c;
                    long j8 = i16.f1470a;
                    int iB = qVar4.b((int) (j8 >> 32));
                    int iB2 = qVar4.b((int) (j8 & 4294967295L));
                    int iMin = Math.min(iB, iB2);
                    int iMax = Math.max(iB, iB2);
                    C0107c c0107c = new C0107c(cO.f3392a);
                    c0107c.a(new G0.C(0L, 0L, (L0.k) null, (L0.i) null, (L0.j) null, (L0.p) null, (String) null, 0L, (R0.a) null, (R0.o) null, (N0.b) null, 0L, R0.j.f4747c, (p035g0.L) null, 61439), iMin, iMax);
                    c6 = new M0.C(c0107c.c(), qVar4);
                } else {
                    c6 = cO;
                }
                c0230o.f0(c6);
                obj2 = c6;
            } else {
                nVar3 = nVar3;
                gVar2 = gVar2;
                obj2 = objK9;
            }
            M0.C c8 = (M0.C) obj2;
            C0110f c0110f3 = c8.f3392a;
            C0235q0 c0235q0Y = c0230o.y();
            if (c0235q0Y == null) {
                throw new IllegalStateException("no recompose scope found");
            }
            c0235q0Y.f3777a |= 1;
            boolean zF2 = c0230o.f(c7);
            Object objK10 = c0230o.K();
            if (zF2 || objK10 == u7) {
                u6 = u7;
                C0230o c0230o5 = c0230o;
                j6 = j4;
                z7 = z5;
                c0110f = c0110f3;
                bVar = bVar3;
                dVar = dVar2;
                C0036s0 c0036s1 = new C0036s0(new C0(c0110f3, j6, z7, bVar3, dVar2, 0), c0235q0Y, c7);
                c0230o5.f0(c0036s1);
                c0230o2 = c0230o5;
                obj3 = c0036s1;
            } else {
                u6 = u7;
                c0230o2 = c0230o;
                bVar = bVar3;
                dVar = dVar2;
                j6 = j4;
                z7 = z5;
                c0110f = c0110f3;
                obj3 = objK10;
            }
            C0036s0 c0036s2 = (C0036s0) obj3;
            c0036s2.f433s = cVar;
            c0036s2.f437w = j7;
            C0031p0 c0031p0 = c0036s2.f432r;
            c0031p0.f394j = c0033q0;
            p024e0.g gVar3 = gVar2;
            c0031p0.f395k = gVar3;
            c0036s2.f424j = c0110f2;
            C0 c9 = c0036s2.f416a;
            p089q4.u uVar = p089q4.u.f11237h;
            if (E4.k.a(c9.f54a, c0110f) && E4.k.a(c9.f55b, j6) && c9.f58e == z7 && c9.f59f == 1 && c9.f56c == Integer.MAX_VALUE && c9.f57d == 1 && E4.k.a(c9.f60g, bVar) && E4.k.a(c9.i, uVar) && c9.f61h == dVar) {
                bVar2 = bVar;
            } else {
                bVar2 = bVar;
                c9 = new C0(c0110f, j6, z7, bVar2, dVar, 0);
            }
            if (c0036s2.f416a != c9) {
                c0036s2.f430p = true;
            }
            c0036s2.f416a = c9;
            M0.B b7 = c0036s2.f420e;
            D.x xVar9 = c0036s2.f419d;
            boolean zA = E4.k.a(i16, ((M0.j) xVar9.f707j).c());
            boolean zA2 = E4.k.a(((M0.w) xVar9.i).f3453a, c0110f2);
            long j9 = wVar.f3454b;
            if (zA2) {
                if (G0.I.a(((M0.w) xVar9.i).f3454b, j9)) {
                    z8 = false;
                } else {
                    ((M0.j) xVar9.f707j).f(G0.I.e(j9), G0.I.d(j9));
                    z8 = true;
                }
                z9 = false;
            } else {
                xVar9.f707j = new M0.j(c0110f2, j9);
                z9 = true;
                z8 = false;
            }
            if (i16 == null) {
                M0.j jVar = (M0.j) xVar9.f707j;
                jVar.f3427d = -1;
                jVar.f3428e = -1;
            } else {
                long j10 = i16.f1470a;
                if (!G0.I.b(j10)) {
                    ((M0.j) xVar9.f707j).e(G0.I.e(j10), G0.I.d(j10));
                }
            }
            if (z9 || !(z8 || zA)) {
                M0.j jVar2 = (M0.j) xVar9.f707j;
                jVar2.f3427d = -1;
                jVar2.f3428e = -1;
                wVarA = M0.w.a(wVar, null, 0L, 3);
            } else {
                wVarA = wVar;
            }
            M0.w wVar3 = (M0.w) xVar9.i;
            xVar9.i = wVarA;
            if (b7 != null) {
                b7.a(wVar3, wVarA);
            }
            Object objK11 = c0230o2.K();
            N.U u8 = u6;
            Object obj10 = objK11;
            if (objK11 == u8) {
                j1 j1Var = new j1();
                c0230o2.f0(j1Var);
                obj10 = j1Var;
            }
            j1 j1Var2 = (j1) obj10;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (j1Var2.f348e) {
                j1Var2.f347d = Long.valueOf(jCurrentTimeMillis);
                j1Var2.a(wVar);
            } else {
                Long l7 = j1Var2.f347d;
                if (jCurrentTimeMillis > (l7 != null ? l7.longValue() : 0L) + ((long) 5000)) {
                    j1Var2.f347d = Long.valueOf(jCurrentTimeMillis);
                    j1Var2.a(wVar);
                }
            }
            Object objK12 = c0230o2.K();
            Object obj11 = objK12;
            if (objK12 == u8) {
                F.P p10 = new F.P(j1Var2);
                c0230o2.f0(p10);
                obj11 = p10;
            }
            F.P p11 = (F.P) obj11;
            M0.q qVar5 = c8.f3393b;
            p11.f1121b = qVar5;
            p11.f1122c = c0036s2.f434t;
            p11.f1123d = c0036s2;
            p11.f1124e.setValue(wVar);
            p11.f1125f = (p130y0.Y) c0230o2.k(AbstractC1124c0.f14365d);
            p11.f1126g = (p130y0.D0) c0230o2.k(AbstractC1124c0.f14375o);
            p11.f1127h = (p069n0.a) c0230o2.k(AbstractC1124c0.f14370j);
            p024e0.n nVar4 = nVar3;
            p11.i = nVar4;
            p11.f1128j.setValue(true);
            p11.f1129k.setValue(Boolean.valueOf(z6));
            Object objK13 = c0230o2.K();
            if (objK13 == u8) {
                C0245w c0245w = new C0245w(C0208d.y(c0230o2));
                c0230o2.f0(c0245w);
                objK13 = c0245w;
            }
            U4.d dVar3 = ((C0245w) objK13).f3838h;
            Object objK14 = c0230o2.K();
            Object obj12 = objK14;
            if (objK14 == u8) {
                p129y.c cVar4 = new p129y.c();
                c0230o2.f0(cVar4);
                obj12 = cVar4;
            }
            p129y.c cVar5 = (p129y.c) obj12;
            Z.o oVarA4 = Z.l.f5957a;
            int i18 = i13 & 7168;
            int i19 = i13 & 57344;
            boolean zH7 = c0230o2.h(c0036s2) | (i18 == 2048) | (i19 == 16384) | c0230o2.h(xVar7) | (i15 == 4);
            int i20 = (i13 & 112) ^ 48;
            if (i20 > 32) {
                mVar3 = mVar2;
                if (c0230o2.f(mVar3)) {
                    xVar = xVar7;
                    gVar = gVar3;
                }
                zH = zH7 | z | c0230o2.h(qVar5) | c0230o2.h(dVar3) | c0230o2.h(cVar5) | c0230o2.h(p11);
                Object objK15 = c0230o2.K();
                if (!zH || objK15 == u8) {
                    nVar = nVar4;
                    M0.m mVar6 = mVar3;
                    c0036s0 = c0036s2;
                    C0230o c0230o6 = c0230o2;
                    xVar2 = xVar;
                    l6 = new L(c0036s0, z6, xVar2, wVar, mVar6, qVar5, p11, dVar3, cVar5);
                    z10 = z6;
                    p6 = p11;
                    wVar2 = wVar;
                    mVar4 = mVar6;
                    c0230o6.f0(l6);
                    c0230o3 = c0230o6;
                } else {
                    l6 = objK15;
                    p6 = p11;
                    nVar = nVar4;
                    mVar4 = mVar3;
                    c0036s0 = c0036s2;
                    wVar2 = wVar;
                    z10 = z6;
                    c0230o3 = c0230o2;
                    xVar2 = xVar;
                }
                oVarA = androidx.compose.foundation.c.a(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(nVar), (D4.c) l6), z10, mVar);
                interfaceC0203a0N = C0208d.N(Boolean.valueOf(z10), c0230o3);
                xVar3 = p084p4.x.f10867a;
                boolean zF3 = c0230o3.f(interfaceC0203a0N) | c0230o3.h(c0036s0) | c0230o3.h(xVar2) | c0230o3.h(p6);
                if (i20 > 32 || !c0230o3.f(mVar4)) {
                    oVar2 = oVarA;
                    if ((i13 & 48) != 32) {
                        z11 = false;
                    }
                    z12 = zF3 | z11;
                    Object objK16 = c0230o3.K();
                    if (!z12 || objK16 == u8) {
                        M0.m mVar7 = mVar4;
                        p7 = p6;
                        xVar4 = xVar3;
                        c0049z = new C0049z(c0036s0, interfaceC0203a0N, xVar2, p7, mVar7, null);
                        interfaceC0203a0 = interfaceC0203a0N;
                        c0230o3.f0(c0049z);
                    } else {
                        p7 = p6;
                        xVar4 = xVar3;
                        c0049z = objK16;
                        interfaceC0203a0 = interfaceC0203a0N;
                    }
                    C0208d.e((D4.e) c0049z, c0230o3, xVar4);
                    zH2 = c0230o3.h(c0036s0);
                    Object objK17 = c0230o3.K();
                    obj4 = objK17;
                    if (zH2 || objK17 == u8) {
                        J j11 = new J(c0036s0, 1);
                        c0230o3.f0(j11);
                        obj4 = j11;
                    }
                    oVarA2 = p091r0.u.a(oVarA4, 8675309, new C0083z((D4.c) obj4, null));
                    boolean zH8 = c0230o3.h(c0036s0);
                    if (i19 == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z29 = zH8 | z13;
                    if (i18 == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zH3 = z29 | z14 | c0230o3.h(qVar5) | c0230o3.h(p7);
                    objK = c0230o3.K();
                    if (!zH3 || objK == u8) {
                        qVar = qVar5;
                        N n6 = new N(c0036s0, nVar, z6, p7, qVar);
                        c0230o3.f0(n6);
                        objK = n6;
                    } else {
                        qVar = qVar5;
                    }
                    cVar3 = (D4.c) objK;
                    if (z6) {
                        oVarA2 = Z.a.a(oVarA2, new S0(cVar3, 0, mVar));
                    }
                    C0025m0 c0025m0 = p7.f1139u;
                    F.N n7 = p7.f1138t;
                    Z.o oVarF = p091r0.o.f(oVarA2.k(new SuspendPointerInputElement(c0025m0, n7, null, new C0080w(c0025m0, n7, null), 4)), f391b);
                    boolean zH9 = c0230o3.h(c0036s0);
                    if (i15 == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zH4 = zH9 | z15 | c0230o3.h(qVar);
                    Object objK18 = c0230o3.K();
                    obj5 = objK18;
                    if (zH4 || objK18 == u8) {
                        C0026n c0026n = new C0026n(c0036s0, wVar2, qVar, 1);
                        c0230o3.f0(c0026n);
                        obj5 = c0026n;
                    }
                    Z.o oVarA5 = androidx.compose.ui.draw.a.a(oVarA4, (D4.c) obj5);
                    boolean zH10 = c0230o3.h(c0036s0);
                    if (
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v11 ??
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 2473
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: B.AbstractC0029o0.d(M0.w, D4.c, Z.o, G0.J, F.p, D4.c, w.m, g0.O, boolean, int, int, M0.m, B.q0, boolean, V.a, N.o, int, int):void");
                }

                public static final void e(Z.o oVar, F.P p6, V.a aVar, C0230o c0230o, int i) {
                    c0230o.X(-20551815);
                    int i3 = (c0230o.f(oVar) ? 4 : 2) | i | (c0230o.h(p6) ? 32 : 16);
                    if ((i3 & 147) == 146 && c0230o.B()) {
                        c0230o.P();
                    } else {
                        p113v0.F fE = AbstractC1084q.e(Z.b.f5933h, true);
                        int i6 = c0230o.f3744P;
                        InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
                        Z.o oVarC = Z.a.c(c0230o, oVar);
                        InterfaceC1102j.f14043g.getClass();
                        C1106n c1106n = C1101i.f14038b;
                        c0230o.Z();
                        if (c0230o.f3743O) {
                            c0230o.l(c1106n);
                        } else {
                            c0230o.i0();
                        }
                        C0208d.R(C1101i.f14041e, c0230o, fE);
                        C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M);
                        C1100h c1100h = C1101i.f14042f;
                        if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i6))) {
                            p012c.k.y(i6, c0230o, i6, c1100h);
                        }
                        C0208d.R(C1101i.f14039c, c0230o, oVarC);
                        c(p6, aVar, c0230o, (i3 >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
                        c0230o.p(true);
                    }
                    C0235q0 c0235q0T = c0230o.t();
                    if (c0235q0T != null) {
                        c0235q0T.f3780d = new U(oVar, p6, aVar, i, 0);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v11 */
                /* JADX WARN: Type inference failed for: r12v12, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r12v13 */
                /* JADX WARN: Type inference failed for: r12v17 */
                /* JADX WARN: Type inference failed for: r12v18, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r12v19 */
                public static final void f(Z.l lVar, C0110f c0110f, C0189x c0189x, boolean z5, p089q4.v vVar, G0.J j4, int i, boolean z6, int i3, int i6, L0.d dVar, D4.c cVar, C0230o c0230o, int i7, int i8) {
                    int i9;
                    G0.J j6;
                    int i10;
                    f1 f1Var;
                    boolean z7;
                    Object obj;
                    D4.a aVar;
                    p084p4.h hVar;
                    InterfaceC0203a0 interfaceC0203a0;
                    D4.c cVar2;
                    ?? r12;
                    Object obj2;
                    Object g1Var;
                    boolean z8;
                    ?? r13;
                    Object obj3;
                    Object obj4;
                    c0230o.X(645129368);
                    if ((i7 & 6) == 0) {
                        i9 = (c0230o.f(lVar) ? 4 : 2) | i7;
                    } else {
                        i9 = i7;
                    }
                    if ((i7 & 48) == 0) {
                        i9 |= c0230o.f(c0110f) ? 32 : 16;
                    }
                    if ((i7 & 384) == 0) {
                        i9 |= c0230o.h(c0189x) ? HueLog.LogComponent.STREAMDTLS : 128;
                    }
                    if ((i7 & 3072) == 0) {
                        i9 |= c0230o.g(z5) ? 2048 : 1024;
                    }
                    if ((i7 & 24576) == 0) {
                        i9 |= c0230o.h(vVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
                    }
                    if ((196608 & i7) == 0) {
                        j6 = j4;
                        i9 |= c0230o.f(j6) ? 131072 : 65536;
                    } else {
                        j6 = j4;
                    }
                    if ((i7 & 1572864) == 0) {
                        i9 |= c0230o.d(i) ? 1048576 : 524288;
                    }
                    if ((i7 & 12582912) == 0) {
                        i9 |= c0230o.g(z6) ? 8388608 : 4194304;
                    }
                    if ((i7 & 100663296) == 0) {
                        i9 |= c0230o.d(i3) ? 67108864 : 33554432;
                    }
                    if ((i7 & 805306368) == 0) {
                        i9 |= c0230o.d(i6) ? 536870912 : 268435456;
                    }
                    if ((i8 & 6) == 0) {
                        i10 = i8 | (c0230o.h(dVar) ? 4 : 2);
                    } else {
                        i10 = i8;
                    }
                    if ((i8 & 48) == 0) {
                        i10 |= c0230o.h(null) ? 32 : 16;
                    }
                    if ((i8 & 384) == 0) {
                        i10 |= c0230o.h(null) ? HueLog.LogComponent.STREAMDTLS : 128;
                    }
                    if ((i8 & 3072) == 0) {
                        i10 |= c0230o.h(cVar) ? 2048 : 1024;
                    }
                    int i11 = i10;
                    if ((i9 & 306783379) == 306783378 && (i11 & 1171) == 1170 && c0230o.B()) {
                        c0230o.P();
                    } else {
                        boolean zS = com.fasterxml.jackson.databind.deser.std.d0.s(c0110f);
                        N.U u6 = C0222k.f3714a;
                        if (zS) {
                            c0230o.V(-619323167);
                            boolean z9 = (i9 & 112) == 32;
                            Object objK = c0230o.K();
                            Object obj5 = objK;
                            if (z9 || objK == u6) {
                                f1 f1Var2 = new f1(c0110f);
                                c0230o.f0(f1Var2);
                                obj5 = f1Var2;
                            }
                            f1Var = (f1) obj5;
                            c0230o.p(false);
                        } else {
                            c0230o.V(-619265198);
                            c0230o.p(false);
                            f1Var = null;
                        }
                        if (com.fasterxml.jackson.databind.deser.std.d0.s(c0110f)) {
                            c0230o.V(-619074547);
                            boolean zF = ((i9 & 112) == 32) | c0230o.f(f1Var);
                            Object objK2 = c0230o.K();
                            Object obj6 = objK2;
                            if (zF || objK2 == u6) {
                                C0024m c0024m = new C0024m(f1Var, 1, c0110f);
                                c0230o.f0(c0024m);
                                obj6 = c0024m;
                            }
                            aVar = (D4.a) obj6;
                            c0230o.p(false);
                        } else {
                            c0230o.V(-618966357);
                            boolean z10 = (i9 & 112) == 32;
                            Object objK3 = c0230o.K();
                            if (z10 || objK3 == u6) {
                                z7 = false;
                                C0043w c0043w = new C0043w(false ? 1 : 0, c0110f);
                                c0230o.f0(c0043w);
                                obj = c0043w;
                            } else {
                                z7 = false;
                                obj = objK3;
                            }
                            aVar = (D4.a) obj;
                            c0230o.p(z7);
                        }
                        if (z5) {
                            if (vVar != null) {
                                p084p4.h hVar2 = AbstractC0020k.f349a;
                            }
                            hVar = AbstractC0020k.f349a;
                        } else {
                            hVar = new p084p4.h(null, null);
                        }
                        List list = (List) hVar.f10849h;
                        List list2 = (List) hVar.i;
                        if (z5) {
                            c0230o.V(-618671702);
                            Object objK4 = c0230o.K();
                            if (objK4 == u6) {
                                C0217h0 c0217h0K = C0208d.K(null, N.U.f3673m);
                                c0230o.f0(c0217h0K);
                                obj4 = c0217h0K;
                            } else {
                                obj4 = objK4;
                            }
                            interfaceC0203a0 = (InterfaceC0203a0) obj4;
                            c0230o.p(false);
                        } else {
                            c0230o.V(-618591630);
                            c0230o.p(false);
                            interfaceC0203a0 = null;
                        }
                        if (z5) {
                            c0230o.V(-618506565);
                            boolean zF2 = c0230o.f(interfaceC0203a0);
                            Object objK5 = c0230o.K();
                            Object obj7 = objK5;
                            if (zF2 || objK5 == u6) {
                                r rVar = new r(1, interfaceC0203a0);
                                c0230o.f0(rVar);
                                obj7 = rVar;
                            }
                            c0230o.p(false);
                            cVar2 = (D4.c) obj7;
                        } else {
                            c0230o.V(-618442830);
                            c0230o.p(false);
                            cVar2 = null;
                        }
                        Z.o oVarB = androidx.compose.ui.graphics.a.b(lVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071);
                        C0110f c0110f2 = (C0110f) aVar.invoke();
                        boolean zH = c0230o.h(f1Var) | ((i9 & 896) == 256);
                        Object objK6 = c0230o.K();
                        Object obj8 = objK6;
                        if (zH || objK6 == u6) {
                            A2.e eVar = new A2.e(f1Var, 2, c0189x);
                            c0230o.f0(eVar);
                            obj8 = eVar;
                        }
                        Z.o oVarV = v(oVarB, c0110f2, j6, (D4.c) obj8, i, z6, i3, i6, dVar, list, cVar2, cVar);
                        if (z5) {
                            c0230o.V(-617202116);
                            boolean zH2 = c0230o.h(f1Var);
                            Object objK7 = c0230o.K();
                            Object obj9 = objK7;
                            if (zH2 || objK7 == u6) {
                                C0037t c0037t = new C0037t(f1Var, 1);
                                c0230o.f0(c0037t);
                                obj9 = c0037t;
                            }
                            D4.a aVar2 = (D4.a) obj9;
                            boolean zF3 = c0230o.f(interfaceC0203a0);
                            Object objK8 = c0230o.K();
                            if (zF3 || objK8 == u6) {
                                r12 = 0;
                                C0039u c0039u = new C0039u(false ? 1 : 0, interfaceC0203a0);
                                c0230o.f0(c0039u);
                                obj2 = c0039u;
                            } else {
                                r12 = 0;
                                obj2 = objK8;
                            }
                            g1Var = new g1(aVar2, r12, (D4.a) obj2);
                            c0230o.p(r12);
                        } else {
                            c0230o.V(-617362851);
                            boolean zH3 = c0230o.h(f1Var);
                            Object objK9 = c0230o.K();
                            if (zH3 || objK9 == u6) {
                                r13 = 0;
                                C0037t c0037t2 = new C0037t(f1Var, false ? 1 : 0);
                                c0230o.f0(c0037t2);
                                obj3 = c0037t2;
                            } else {
                                r13 = 0;
                                obj3 = objK9;
                            }
                            g1Var = new C0038t0(r13, (D4.a) obj3);
                            c0230o.p(r13);
                        }
                        int i12 = c0230o.f3744P;
                        InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
                        Z.o oVarC = Z.a.c(c0230o, oVarV);
                        InterfaceC1102j.f14043g.getClass();
                        C1106n c1106n = C1101i.f14038b;
                        c0230o.Z();
                        if (c0230o.f3743O) {
                            c0230o.l(c1106n);
                        } else {
                            c0230o.i0();
                        }
                        C0208d.R(C1101i.f14041e, c0230o, g1Var);
                        C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M);
                        C1100h c1100h = C1101i.f14042f;
                        if (c0230o.f3743O || !E4.k.a(c0230o.K(), Integer.valueOf(i12))) {
                            p012c.k.y(i12, c0230o, i12, c1100h);
                        }
                        C0208d.R(C1101i.f14039c, c0230o, oVarC);
                        if (f1Var == null) {
                            c0230o.V(-515480539);
                            z8 = false;
                        } else {
                            z8 = false;
                            c0230o.V(537560924);
                            f1Var.a(0, c0230o);
                        }
                        c0230o.p(z8);
                        if (list2 == null) {
                            c0230o.V(-515428893);
                        } else {
                            c0230o.V(-515428892);
                            AbstractC0020k.a(c0110f, list2, c0230o, (i9 >> 3) & 14);
                        }
                        c0230o.p(z8);
                        c0230o.p(true);
                    }
                    C0235q0 c0235q0T = c0230o.t();
                    if (c0235q0T != null) {
                        c0235q0T.f3780d = new C0041v(lVar, c0110f, c0189x, z5, vVar, j4, i, z6, i3, i6, dVar, cVar, i7, i8);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:44:0x0112  */
                public static final void g(F.P p6, C0230o c0230o, int i) {
                    int i3 = 1;
                    int i6 = 0;
                    c0230o.X(-1436003720);
                    if ((((c0230o.h(p6) ? 4 : 2) | i) & 3) == 2 && c0230o.B()) {
                        c0230o.P();
                    } else {
                        C0036s0 c0036s0 = p6.f1123d;
                        if (c0036s0 == null || !((Boolean) c0036s0.f429o.getValue()).booleanValue()) {
                            c0230o.V(-284257090);
                            c0230o.p(false);
                        } else {
                            C0036s0 c0036s1 = p6.f1123d;
                            C0110f c0110f = c0036s1 != null ? c0036s1.f416a.f54a : null;
                            if (c0110f == null || c0110f.f1494h.length() <= 0) {
                                c0230o.V(-284257090);
                                c0230o.p(false);
                            } else {
                                c0230o.V(-285446808);
                                boolean zF = c0230o.f(p6);
                                Object objK = c0230o.K();
                                Object obj = C0222k.f3714a;
                                if (zF || objK == obj) {
                                    objK = new F.N(p6, i6);
                                    c0230o.f0(objK);
                                }
                                D0 d1 = (D0) objK;
                                S0.b bVar = (S0.b) c0230o.k(AbstractC1124c0.f14367f);
                                M0.q qVar = p6.f1121b;
                                long j4 = p6.j().f3454b;
                                int i7 = G0.I.f1469c;
                                int iB = qVar.b((int) (j4 >> 32));
                                C0036s0 c0036s2 = p6.f1123d;
                                a1 a1VarD = c0036s2 != null ? c0036s2.d() : null;
                                E4.k.c(a1VarD);
                                G0.G g6 = a1VarD.f281a;
                                p030f0.d dVarC = g6.c(p081p0.c.O(iB, 0, g6.f1458a.f1449a.f1494h.length()));
                                long jY = p081p0.c.y((bVar.y(H0.f126a) / 2) + dVarC.f8839a, dVarC.f8842d);
                                boolean zE = c0230o.e(jY);
                                Object objK2 = c0230o.K();
                                if (zE || objK2 == obj) {
                                    objK2 = new W(jY);
                                    c0230o.f0(objK2);
                                }
                                InterfaceC0070l interfaceC0070l = (InterfaceC0070l) objK2;
                                Z.l lVar = Z.l.f5957a;
                                boolean zH = c0230o.h(d1) | c0230o.h(p6);
                                Object objK3 = c0230o.K();
                                if (zH || objK3 == obj) {
                                    objK3 = new C0001a0(d1, p6, null);
                                    c0230o.f0(objK3);
                                }
                                Z.o oVarA = p091r0.u.a(lVar, d1, (D4.e) objK3);
                                boolean zE2 = c0230o.e(jY);
                                Object objK4 = c0230o.K();
                                if (zE2 || objK4 == obj) {
                                    objK4 = new C0008e(i3, jY);
                                    c0230o.f0(objK4);
                                }
                                AbstractC0012g.a(interfaceC0070l, E0.i.a(oVarA, false, (D4.c) objK4), 0L, c0230o, 0);
                                c0230o.p(false);
                            }
                        }
                    }
                    C0235q0 c0235q0T = c0230o.t();
                    if (c0235q0T != null) {
                        c0235q0T.f3780d = new C0003b0(i, i6, p6);
                    }
                }

                public static final void h(F.P p6, boolean z5, C0230o c0230o, int i) {
                    int i3;
                    a1 a1VarD;
                    c0230o.X(626339208);
                    if ((i & 6) == 0) {
                        i3 = (c0230o.h(p6) ? 4 : 2) | i;
                    } else {
                        i3 = i;
                    }
                    if ((i & 48) == 0) {
                        i3 |= c0230o.g(z5) ? 32 : 16;
                    }
                    if ((i3 & 19) == 18 && c0230o.B()) {
                        c0230o.P();
                    } else if (z5) {
                        c0230o.V(-1286242594);
                        C0036s0 c0036s0 = p6.f1123d;
                        G0.G g6 = null;
                        if (c0036s0 != null && (a1VarD = c0036s0.d()) != null) {
                            G0.G g7 = a1VarD.f281a;
                            C0036s0 c0036s1 = p6.f1123d;
                            if (!(c0036s1 != null ? c0036s1.f430p : true)) {
                                g6 = g7;
                            }
                        }
                        if (g6 == null) {
                            c0230o.V(-1285984396);
                        } else {
                            c0230o.V(-1285984395);
                            if (G0.I.b(p6.j().f3454b)) {
                                c0230o.V(-1679637798);
                                c0230o.p(false);
                            } else {
                                c0230o.V(-1680616096);
                                int iB = p6.f1121b.b((int) (p6.j().f3454b >> 32));
                                int iB2 = p6.f1121b.b((int) (p6.j().f3454b & 4294967295L));
                                R0.h hVarA = g6.a(iB);
                                R0.h hVarA2 = g6.a(Math.max(iB2 - 1, 0));
                                C0036s0 c0036s2 = p6.f1123d;
                                if (c0036s2 == null || !((Boolean) c0036s2.f427m.getValue()).booleanValue()) {
                                    c0230o.V(-1679975078);
                                    c0230o.p(false);
                                } else {
                                    c0230o.V(-1680216289);
                                    p027e3.a.K(true, hVarA, p6, c0230o, ((i3 << 6) & 896) | 6);
                                    c0230o.p(false);
                                }
                                C0036s0 c0036s3 = p6.f1123d;
                                if (c0036s3 == null || !((Boolean) c0036s3.f428n.getValue()).booleanValue()) {
                                    c0230o.V(-1679655654);
                                    c0230o.p(false);
                                } else {
                                    c0230o.V(-1679895904);
                                    p027e3.a.K(false, hVarA2, p6, c0230o, ((i3 << 6) & 896) | 6);
                                    c0230o.p(false);
                                }
                                c0230o.p(false);
                            }
                            C0036s0 c0036s4 = p6.f1123d;
                            if (c0036s4 != null) {
                                boolean zA = E4.k.a(p6.f1136r.f3453a.f1494h, p6.j().f3453a.f1494h);
                                C0217h0 c0217h0 = c0036s4.f426l;
                                if (!zA) {
                                    c0217h0.setValue(Boolean.FALSE);
                                }
                                if (c0036s4.b()) {
                                    if (((Boolean) c0217h0.getValue()).booleanValue()) {
                                        p6.o();
                                    } else {
                                        p6.k();
                                    }
                                }
                            }
                        }
                        c0230o.p(false);
                        c0230o.p(false);
                    } else {
                        c0230o.V(651305535);
                        c0230o.p(false);
                        p6.k();
                    }
                    C0235q0 c0235q0T = c0230o.t();
                    if (c0235q0T != null) {
                        c0235q0T.f3780d = new V(p6, z5, i);
                    }
                }

                public static final void i(C0036s0 c0036s0) {
                    M0.B b6 = c0036s0.f420e;
                    if (b6 != null) {
                        c0036s0.f434t.invoke(M0.w.a((M0.w) c0036s0.f419d.i, null, 0L, 3));
                        M0.x xVar = b6.f3390a;
                        AtomicReference atomicReference = xVar.f3457b;
                        while (!atomicReference.compareAndSet(b6, null)) {
                            if (atomicReference.get() != b6) {
                            }
                        }
                        xVar.f3456a.e();
                    }
                    c0036s0.f420e = null;
                }

                public static final p030f0.d j(S0.b bVar, int i, M0.C c6, G0.G g6, boolean z5, int i3) {
                    p030f0.d dVarC = g6 != null ? g6.c(c6.f3393b.b(i)) : p030f0.d.f8838e;
                    int iH = bVar.H(H0.f126a);
                    float f6 = dVarC.f8839a;
                    return new p030f0.d(z5 ? (i3 - f6) - iH : f6, dVarC.f8840b, z5 ? i3 - f6 : iH + f6, dVarC.f8842d);
                }

                public static final boolean k(int i, KeyEvent keyEvent) {
                    return ((int) (p081p0.c.k0(keyEvent) >> 32)) == i;
                }

                public static final ArrayList l(List list, D4.a aVar) {
                    h1 h1Var;
                    if (!((Boolean) aVar.invoke()).booleanValue()) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList(list.size());
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        p113v0.E e6 = (p113v0.E) list.get(i);
                        Object objI = e6.i();
                        E4.k.d("null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier", objI);
                        b1 b1Var = ((i1) objI).f336a;
                        G0.G g6 = (G0.G) b1Var.f288a.f316b.getValue();
                        if (g6 == null) {
                            h1Var = new h1(0, 0, e1.f310h);
                        } else {
                            S0.i iVarA = p006b.a.A(g6.j(b1Var.f289b, b1Var.f290c).c());
                            h1Var = new h1(iVarA.f4894c - iVarA.f4892a, iVarA.f4895d - iVarA.f4893b, new C0043w(4, iVarA));
                        }
                        int i3 = h1Var.f327h;
                        int iMin = Math.min(i3, 262142);
                        int iMin2 = Integer.MAX_VALUE;
                        int iMin3 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
                        int iC = p081p0.c.C(iMin3 == Integer.MAX_VALUE ? iMin : iMin3);
                        int i6 = h1Var.i;
                        if (i6 != Integer.MAX_VALUE) {
                            iMin2 = Math.min(iC, i6);
                        }
                        arrayList.add(new p084p4.h(e6.c(p081p0.c.t(iMin, iMin3, Math.min(iC, i6), iMin2)), (E4.l) h1Var.f328j));
                    }
                    return arrayList;
                }

                public static final void m(M0.x xVar, C0036s0 c0036s0, M0.w wVar, M0.m mVar, M0.q qVar) {
                    E4.w wVar2 = new E4.w();
                    C0026n c0026n = new C0026n(c0036s0.f419d, c0036s0.f434t, wVar2, 2);
                    M0.r rVar = xVar.f3456a;
                    rVar.g(wVar, mVar, c0026n, c0036s0.f435u);
                    M0.B b6 = new M0.B(xVar, rVar);
                    xVar.f3457b.set(b6);
                    wVar2.f1074h = b6;
                    c0036s0.f420e = b6;
                    t(c0036s0, wVar, qVar);
                }

                public static final int n(float f6) {
                    return Math.round((float) Math.ceil(f6));
                }

                public static final M0.C o(C0074p c0074p, C0110f c0110f) {
                    c0074p.getClass();
                    int length = c0110f.f1494h.length();
                    int length2 = c0110f.f1494h.length();
                    int iMin = Math.min(length, 100);
                    for (int i = 0; i < iMin; i++) {
                        x(i, length2, i);
                    }
                    x(length, length2, length);
                    int iMin2 = Math.min(length2, 100);
                    for (int i3 = 0; i3 < iMin2; i3++) {
                        y(i3, length, i3);
                    }
                    y(length2, length, length2);
                    return new M0.C(c0110f, new k1(c0110f.f1494h.length(), c0110f.f1494h.length()));
                }

                /* JADX WARN: Code duplicated, block: B:19:0x0045  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r10v1, types: [java.text.BreakIterator] */
                /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, r0.d] */
                /* JADX WARN: Type inference failed for: r3v0 */
                /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r3v11 */
                /* JADX WARN: Type inference failed for: r3v12 */
                /* JADX WARN: Type inference failed for: r3v13 */
                /* JADX WARN: Type inference failed for: r3v14 */
                /* JADX WARN: Type inference failed for: r3v2 */
                /* JADX WARN: Type inference failed for: r3v3 */
                /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.CharSequence] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                public static final int p(int i, String str) {
                    p119w1.h hVarA;
                    ?? r6;
                    ?? r7;
                    int spanEnd;
                    Integer num = null;
                    if (p119w1.h.c()) {
                        hVarA = p119w1.h.a();
                        if (hVarA.b() != 1) {
                            hVarA = null;
                        }
                    } else {
                        hVarA = null;
                    }
                    if (hVarA != null) {
                        ?? r8 = hVarA.f13421e.f13413b;
                        r8.getClass();
                        if (i < 0 || i >= str.length()) {
                            r7 = str;
                            spanEnd = -1;
                        } else if (str instanceof Spanned) {
                            Spanned spanned = (Spanned) str;
                            p119w1.t[] tVarArr = (p119w1.t[]) spanned.getSpans(i, i + 1, p119w1.t.class);
                            if (tVarArr.length > 0) {
                                spanEnd = spanned.getSpanEnd(tVarArr[0]);
                                r7 = str;
                            } else {
                                ?? r9 = str;
                                spanEnd = ((p119w1.m) r8.k(r9, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new p119w1.m(i))).f13429j;
                                r7 = r9;
                            }
                        } else {
                            ?? r10 = str;
                            spanEnd = ((p119w1.m) r8.k(r10, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new p119w1.m(i))).f13429j;
                            r7 = r10;
                        }
                        Integer numValueOf = Integer.valueOf(spanEnd);
                        r6 = r7;
                        if (spanEnd != -1) {
                            num = numValueOf;
                            r6 = r7;
                        }
                    } else {
                        r6 = str;
                    }
                    if (num != null) {
                        return num.intValue();
                    }
                    ?? characterInstance = BreakIterator.getCharacterInstance();
                    characterInstance.setText(r6);
                    return characterInstance.following(i);
                }

                public static final int q(CharSequence charSequence, int i) {
                    int length = charSequence.length();
                    while (i < length) {
                        if (charSequence.charAt(i) == '\n') {
                            return i;
                        }
                        i++;
                    }
                    return charSequence.length();
                }

                public static final int r(CharSequence charSequence, int i) {
                    while (i > 0) {
                        if (charSequence.charAt(i - 1) == '\n') {
                            return i;
                        }
                        i--;
                    }
                    return 0;
                }

                /* JADX WARN: Code duplicated, block: B:19:0x004b  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r12v1, types: [java.text.BreakIterator] */
                /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, r0.d] */
                /* JADX WARN: Type inference failed for: r5v0 */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r5v11 */
                /* JADX WARN: Type inference failed for: r5v12 */
                /* JADX WARN: Type inference failed for: r5v13 */
                /* JADX WARN: Type inference failed for: r5v14 */
                /* JADX WARN: Type inference failed for: r5v2 */
                /* JADX WARN: Type inference failed for: r5v3 */
                /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.CharSequence] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                public static final int s(int i, String str) {
                    p119w1.h hVarA;
                    ?? r6;
                    ?? r7;
                    int spanStart;
                    Integer num = null;
                    if (p119w1.h.c()) {
                        hVarA = p119w1.h.a();
                        if (hVarA.b() != 1) {
                            hVarA = null;
                        }
                    } else {
                        hVarA = null;
                    }
                    if (hVarA != null) {
                        int iMax = Math.max(0, i - 1);
                        ?? r8 = hVarA.f13421e.f13413b;
                        r8.getClass();
                        if (iMax < 0 || iMax >= str.length()) {
                            r7 = str;
                            spanStart = -1;
                        } else if (str instanceof Spanned) {
                            Spanned spanned = (Spanned) str;
                            p119w1.t[] tVarArr = (p119w1.t[]) spanned.getSpans(iMax, iMax + 1, p119w1.t.class);
                            if (tVarArr.length > 0) {
                                spanStart = spanned.getSpanStart(tVarArr[0]);
                                r7 = str;
                            } else {
                                ?? r9 = str;
                                spanStart = ((p119w1.m) r8.k(r9, Math.max(0, iMax - 16), Math.min(str.length(), iMax + 16), Integer.MAX_VALUE, true, new p119w1.m(iMax))).i;
                                r7 = r9;
                            }
                        } else {
                            ?? r10 = str;
                            spanStart = ((p119w1.m) r8.k(r10, Math.max(0, iMax - 16), Math.min(str.length(), iMax + 16), Integer.MAX_VALUE, true, new p119w1.m(iMax))).i;
                            r7 = r10;
                        }
                        Integer numValueOf = Integer.valueOf(spanStart);
                        r6 = r7;
                        if (spanStart != -1) {
                            num = numValueOf;
                            r6 = r7;
                        }
                    } else {
                        r6 = str;
                    }
                    if (num != null) {
                        return num.intValue();
                    }
                    ?? characterInstance = BreakIterator.getCharacterInstance();
                    characterInstance.setText(r6);
                    return characterInstance.preceding(i);
                }

                public static final void t(C0036s0 c0036s0, M0.w wVar, M0.q qVar) {
                    AbstractC0391h abstractC0391hD = X.t.d();
                    D4.c cVarF = abstractC0391hD != null ? abstractC0391hD.f() : null;
                    AbstractC0391h abstractC0391hE = X.t.e(abstractC0391hD);
                    try {
                        a1 a1VarD = c0036s0.d();
                        if (a1VarD == null) {
                            return;
                        }
                        M0.B b6 = c0036s0.f420e;
                        if (b6 == null) {
                            return;
                        }
                        InterfaceC1033p interfaceC1033pC = c0036s0.c();
                        if (interfaceC1033pC == null) {
                            return;
                        }
                        u(wVar, c0036s0.f416a, a1VarD.f281a, interfaceC1033pC, b6, c0036s0.b(), qVar);
                    } finally {
                        X.t.g(abstractC0391hD, abstractC0391hE, cVarF);
                    }
                }

                public static void u(M0.w wVar, C0 c6, G0.G g6, InterfaceC1033p interfaceC1033p, M0.B b6, boolean z5, M0.q qVar) {
                    p030f0.d dVar;
                    if (z5) {
                        int iB = qVar.b(G0.I.d(wVar.f3454b));
                        if (iB < g6.f1458a.f1449a.f1494h.length()) {
                            dVar = g6.b(iB);
                        } else if (iB != 0) {
                            dVar = g6.b(iB - 1);
                        } else {
                            dVar = new p030f0.d(0.0f, 0.0f, 1.0f, (int) (I0.a(c6.f55b, c6.f60g, c6.f61h, I0.f143a, 1) & 4294967295L));
                        }
                        long jQ = interfaceC1033p.Q(p081p0.c.y(dVar.f8839a, dVar.f8840b));
                        p030f0.d dVarE = G4.a.e(p081p0.c.y(p030f0.c.d(jQ), p030f0.c.e(jQ)), S1.h0.f(dVar.c(), dVar.b()));
                        if (E4.k.a((M0.B) b6.f3390a.f3457b.get(), b6)) {
                            b6.f3391b.f(dVarE);
                        }
                    }
                }

                public static final Z.o v(Z.o oVar, C0110f c0110f, G0.J j4, D4.c cVar, int i, boolean z5, int i3, int i6, L0.d dVar, List list, D4.c cVar2, D4.c cVar3) {
                    return oVar.k(Z.l.f5957a).k(new TextAnnotatedStringElement(c0110f, j4, dVar, cVar, i, z5, i3, i6, list, cVar2, cVar3));
                }

                public static final void w(int i, int i3) {
                    if (i > 0 && i3 > 0) {
                        if (i > i3) {
                            throw new IllegalArgumentException(AbstractC0013g0.g("minLines ", i, i3, " must be less than or equal to maxLines ").toString());
                        }
                        return;
                    }
                    throw new IllegalArgumentException(("both minLines " + i + " and maxLines " + i3 + " must be greater than zero").toString());
                }

                public static final void x(int i, int i3, int i6) {
                    if (i < 0 || i > i3) {
                        StringBuilder sb = new StringBuilder("OffsetMapping.originalToTransformed returned invalid mapping: ");
                        sb.append(i6);
                        sb.append(" -> ");
                        sb.append(i);
                        sb.append(" is not in range of transformed text [0, ");
                        throw new IllegalStateException(AbstractC0013g0.k(sb, i3, ']').toString());
                    }
                }

                public static final void y(int i, int i3, int i6) {
                    if (i < 0 || i > i3) {
                        StringBuilder sb = new StringBuilder("OffsetMapping.transformedToOriginal returned invalid mapping: ");
                        sb.append(i6);
                        sb.append(" -> ");
                        sb.append(i);
                        sb.append(" is not in range of original text [0, ");
                        throw new IllegalStateException(AbstractC0013g0.k(sb, i3, ']').toString());
                    }
                }
            }

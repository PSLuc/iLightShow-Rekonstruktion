package p006b;

import B.AbstractC0013g0;
import B.AbstractC0029o0;
import B.C0018j;
import B.C0026n;
import B.T;
import D3.g;
import D4.c;
import E4.f;
import E4.k;
import F.C0071m;
import F.C0072n;
import F.C0073o;
import F.C0076s;
import F.InterfaceC0067i;
import F.L;
import F1.I;
import K4.b;
import L.J0;
import M4.t;
import N.C0208d;
import N.C0217h0;
import N.C0222k;
import N.C0226m;
import N.C0227m0;
import N.C0230o;
import N.C0235q0;
import N.C0245w;
import N.InterfaceC0203a0;
import N.InterfaceC0225l0;
import N.V0;
import N3.C0253a;
import N3.C0257c;
import N3.C0284p0;
import N3.C0299x0;
import N3.G;
import N3.P0;
import N3.W;
import S0.i;
import S1.V;
import V0.C0382a;
import V0.C0383b;
import V0.e;
import V0.r;
import V0.s;
import V0.v;
import X.y;
import Z.l;
import Z.o;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0458s;
import c5.AbstractC0476a0;
import c5.C0479c;
import c5.K;
import c5.S;
import c5.h0;
import c5.i0;
import c5.q0;
import com.fasterxml.jackson.databind.deser.std.d0;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import com.nanjoran.ilightshow.R;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.Http2;
import p012c.E;
import p015c2.AbstractC0473d;
import p018d.j;
import p030f0.d;
import p035g0.C0704e;
import p035g0.C0709j;
import p035g0.C0710k;
import p035g0.H;
import p035g0.O;
import p058l0.C0822e;
import p058l0.C0823f;
import p084p4.h;
import p084p4.x;
import p089q4.n;
import p090r.M;
import p091r0.A;
import p096s.AbstractC0909d;
import p096s.AbstractC0914g;
import p096s.v0;
import p113v0.C1025h;
import p113v0.C1026i;
import p113v0.F;
import p123x.AbstractC1070c;
import p123x.AbstractC1084q;
import p124x0.C1100h;
import p124x0.C1101i;
import p124x0.C1106n;
import p124x0.InterfaceC1102j;
import p130y0.AbstractC1124c0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static C0823f f7019h;
    public static C0823f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static C0823f f7020j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static C0823f f7021k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static C0823f f7022l;

    public static final i A(d dVar) {
        return new i(Math.round(dVar.f8839a), Math.round(dVar.f8840b), Math.round(dVar.f8841c), Math.round(dVar.f8842d));
    }

    public static final Y4.a B(f fVar) {
        k.f("<this>", fVar);
        Y4.a aVarC = C(fVar);
        if (aVarC != null) {
            return aVarC;
        }
        AbstractC0476a0.i(fVar);
        throw null;
    }

    public static final Y4.a C(b bVar) {
        k.f("<this>", bVar);
        Y4.a aVarD = AbstractC0476a0.d(bVar, new Y4.a[0]);
        return aVarD == null ? (Y4.a) h0.f7455a.get(bVar) : aVarD;
    }

    public static final Y4.a D(Z2.f fVar, K k3) {
        k.f("<this>", fVar);
        k.f("type", k3);
        return AbstractC0473d.R(fVar, k3, false);
    }

    public static final ArrayList E(Z2.f fVar, List list, boolean z5) {
        k.f("<this>", fVar);
        k.f("typeArguments", list);
        if (!z5) {
            ArrayList arrayList = new ArrayList(n.P(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Y4.a aVarD = D(fVar, (K) it.next());
                if (aVarD == null) {
                    return null;
                }
                arrayList.add(aVarD);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(n.P(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            K k3 = (K) it2.next();
            k.f("type", k3);
            Y4.a aVarR = AbstractC0473d.R(fVar, k3, true);
            if (aVarR == null) {
                b bVarH = AbstractC0476a0.h(k3);
                k.f("<this>", bVarH);
                AbstractC0476a0.i(bVarH);
                throw null;
            }
            arrayList2.add(aVarR);
        }
        return arrayList2;
    }

    public static void G(File file, String str) throws IllegalAccessException, IOException, InvocationTargetException {
        Charset charset = M4.a.f3520a;
        k.f("<this>", file);
        k.f("text", str);
        k.f("charset", charset);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            H(fileOutputStream, str, charset);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                S1.h0.i(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public static final void H(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        k.f("text", str);
        k.f("charset", charset);
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            k.e("getBytes(...)", bytes);
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        k.c(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        k.e("allocate(...)", byteBufferAllocate);
        int i3 = 0;
        int i6 = 0;
        while (i3 < str.length()) {
            int iMin = Math.min(8192 - i6, str.length() - i3);
            int i7 = i3 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            k.e("array(...)", cArrArray);
            str.getChars(i3, i7, cArrArray, i6);
            charBufferAllocate.limit(iMin + i6);
            i6 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i7 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i6 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i3 = i7;
        }
    }

    public static String I(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i3 = 0;
        int i6 = 0;
        while (true) {
            length = objArr.length;
            if (i3 >= length || (iIndexOf = str.indexOf("%s", i6)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i6, iIndexOf);
            sb.append(J(objArr[i3]));
            i6 = iIndexOf + 2;
            i3++;
        }
        sb.append((CharSequence) str, i6, str.length());
        if (i3 < length) {
            String str2 = " [";
            while (i3 < objArr.length) {
                sb.append(str2);
                sb.append(J(objArr[i3]));
                i3++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String J(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e6) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
            sb.append(name);
            sb.append("@");
            sb.append(hexString);
            String string = sb.toString();
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(string), (Throwable) e6);
            String name2 = e6.getClass().getName();
            StringBuilder sb2 = new StringBuilder(string.length() + 8 + name2.length() + 1);
            AbstractC0013g0.t(sb2, "<", string, " threw ", name2);
            sb2.append(">");
            return sb2.toString();
        }
    }

    public static String K(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i3 = 0;
        int i6 = 0;
        while (true) {
            length = objArr.length;
            if (i3 >= length || (iIndexOf = str.indexOf("%s", i6)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i6, iIndexOf);
            sb.append(L(objArr[i3]));
            i6 = iIndexOf + 2;
            i3++;
        }
        sb.append((CharSequence) str, i6, str.length());
        if (i3 < length) {
            String str2 = " [";
            while (i3 < objArr.length) {
                sb.append(str2);
                sb.append(L(objArr[i3]));
                i3++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String L(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e6) {
            String str = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str), (Throwable) e6);
            return AbstractC0013g0.j("<", str, " threw ", e6.getClass().getName(), ">");
        }
    }

    public static boolean M(byte b6) {
        return b6 > -65;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:42:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:52:0x010c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:53:0x010e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0125  */
    /* JADX WARN: Code duplicated, block: B:57:0x0127  */
    /* JADX WARN: Code duplicated, block: B:60:0x0130  */
    /* JADX WARN: Code duplicated, block: B:61:0x0132  */
    /* JADX WARN: Code duplicated, block: B:64:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x0143  */
    /* JADX WARN: Code duplicated, block: B:69:0x015d  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public static final void a(D4.a aVar, s sVar, V.a aVar2, C0230o c0230o, int i3, int i6) {
        int i7;
        s sVar2;
        int i8;
        s sVar3;
        View view;
        S0.b bVar;
        S0.k kVar;
        C0226m c0226mM;
        InterfaceC0203a0 interfaceC0203a0N;
        UUID uuid;
        boolean zF;
        Object objK;
        s sVar4;
        S0.k kVar2;
        r rVar;
        v vVar;
        boolean zH;
        Object objK2;
        boolean z5;
        boolean z6;
        boolean zF2;
        Object objK3;
        C0235q0 c0235q0T;
        int i9;
        c0230o.X(-2032877254);
        if ((i3 & 6) == 0) {
            i7 = (c0230o.h(aVar) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        int i10 = i6 & 2;
        if (i10 == 0) {
            if ((i3 & 48) == 0) {
                sVar2 = sVar;
                i7 |= c0230o.f(sVar2) ? 32 : 16;
            }
            if ((i3 & 384) == 0) {
                if (c0230o.h(aVar2)) {
                    i9 = HueLog.LogComponent.STREAMDTLS;
                } else {
                    i9 = 128;
                }
                i7 |= i9;
            }
            i8 = i7;
            if ((i8 & 147) == 146 || !c0230o.B()) {
                if (i10 != 0) {
                    sVar3 = new s();
                } else {
                    sVar3 = sVar2;
                }
                view = (View) c0230o.k(AndroidCompositionLocals_androidKt.f6734f);
                bVar = (S0.b) c0230o.k(AbstractC1124c0.f14367f);
                kVar = (S0.k) c0230o.k(AbstractC1124c0.f14372l);
                c0226mM = C0208d.M(c0230o);
                interfaceC0203a0N = C0208d.N(aVar2, c0230o);
                uuid = (UUID) p020d2.n.H(new Object[0], null, e.i, c0230o, 3072, 6);
                zF = c0230o.f(view) | c0230o.f(bVar);
                objK = c0230o.K();
                Object obj = C0222k.f3714a;
                if (!zF || objK == obj) {
                    sVar4 = sVar3;
                    kVar2 = kVar;
                    v vVar2 = new v(aVar, sVar4, view, kVar2, bVar, uuid);
                    V.a aVar3 = new V.a(488261145, new V0.d(1, interfaceC0203a0N), true);
                    rVar = vVar2.f5458n;
                    rVar.setParentCompositionContext(c0226mM);
                    rVar.f5444q.setValue(aVar3);
                    rVar.f5446s = true;
                    if (rVar.f14340k != null && !rVar.isAttachedToWindow()) {
                        throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
                    }
                    rVar.c();
                    c0230o.f0(vVar2);
                    objK = vVar2;
                } else {
                    sVar4 = sVar3;
                    kVar2 = kVar;
                }
                vVar = (v) objK;
                zH = c0230o.h(vVar);
                objK2 = c0230o.K();
                if (zH || objK2 == obj) {
                    objK2 = new C0382a(vVar, 0);
                    c0230o.f0(objK2);
                }
                C0208d.c(vVar, (c) objK2, c0230o);
                boolean zH2 = c0230o.h(vVar);
                if ((i8 & 14) == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z7 = zH2 | z5;
                if ((i8 & 112) == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                zF2 = z7 | z6 | c0230o.f(kVar2);
                objK3 = c0230o.K();
                if (zF2 || objK3 == obj) {
                    s sVar5 = sVar4;
                    Object t6 = new T(vVar, aVar, sVar5, kVar2, 1);
                    sVar4 = sVar5;
                    c0230o.f0(t6);
                    objK3 = t6;
                }
                C0208d.g((D4.a) objK3, c0230o);
                sVar2 = sVar4;
            } else {
                c0230o.P();
            }
            c0235q0T = c0230o.t();
            if (c0235q0T != null) {
                c0235q0T.f3780d = new C0383b(aVar, sVar2, aVar2, i3, i6, 0);
            }
        }
        i7 |= 48;
        sVar2 = sVar;
        if ((i3 & 384) == 0) {
            if (c0230o.h(aVar2)) {
                i9 = HueLog.LogComponent.STREAMDTLS;
            } else {
                i9 = 128;
            }
            i7 |= i9;
        }
        i8 = i7;
        if ((i8 & 147) == 146) {
            if (i10 != 0) {
                sVar3 = new s();
            } else {
                sVar3 = sVar2;
            }
            view = (View) c0230o.k(AndroidCompositionLocals_androidKt.f6734f);
            bVar = (S0.b) c0230o.k(AbstractC1124c0.f14367f);
            kVar = (S0.k) c0230o.k(AbstractC1124c0.f14372l);
            c0226mM = C0208d.M(c0230o);
            interfaceC0203a0N = C0208d.N(aVar2, c0230o);
            uuid = (UUID) p020d2.n.H(new Object[0], null, e.i, c0230o, 3072, 6);
            zF = c0230o.f(view) | c0230o.f(bVar);
            objK = c0230o.K();
            Object obj2 = C0222k.f3714a;
            if (zF) {
                sVar4 = sVar3;
                kVar2 = kVar;
                v vVar3 = new v(aVar, sVar4, view, kVar2, bVar, uuid);
                V.a aVar4 = new V.a(488261145, new V0.d(1, interfaceC0203a0N), true);
                rVar = vVar3.f5458n;
                rVar.setParentCompositionContext(c0226mM);
                rVar.f5444q.setValue(aVar4);
                rVar.f5446s = true;
                if (rVar.f14340k != null) {
                }
                rVar.c();
                c0230o.f0(vVar3);
                objK = vVar3;
            } else {
                sVar4 = sVar3;
                kVar2 = kVar;
                v vVar4 = new v(aVar, sVar4, view, kVar2, bVar, uuid);
                V.a aVar5 = new V.a(488261145, new V0.d(1, interfaceC0203a0N), true);
                rVar = vVar4.f5458n;
                rVar.setParentCompositionContext(c0226mM);
                rVar.f5444q.setValue(aVar5);
                rVar.f5446s = true;
                if (rVar.f14340k != null) {
                }
                rVar.c();
                c0230o.f0(vVar4);
                objK = vVar4;
            }
            vVar = (v) objK;
            zH = c0230o.h(vVar);
            objK2 = c0230o.K();
            if (zH) {
                objK2 = new C0382a(vVar, 0);
                c0230o.f0(objK2);
            } else {
                objK2 = new C0382a(vVar, 0);
                c0230o.f0(objK2);
            }
            C0208d.c(vVar, (c) objK2, c0230o);
            boolean zH3 = c0230o.h(vVar);
            if ((i8 & 14) == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z8 = zH3 | z5;
            if ((i8 & 112) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            zF2 = z8 | z6 | c0230o.f(kVar2);
            objK3 = c0230o.K();
            if (zF2) {
                s sVar6 = sVar4;
                Object t7 = new T(vVar, aVar, sVar6, kVar2, 1);
                sVar4 = sVar6;
                c0230o.f0(t7);
                objK3 = t7;
            } else {
                s sVar7 = sVar4;
                Object t8 = new T(vVar, aVar, sVar7, kVar2, 1);
                sVar4 = sVar7;
                c0230o.f0(t8);
                objK3 = t8;
            }
            C0208d.g((D4.a) objK3, c0230o);
            sVar2 = sVar4;
        } else {
            if (i10 != 0) {
                sVar3 = new s();
            } else {
                sVar3 = sVar2;
            }
            view = (View) c0230o.k(AndroidCompositionLocals_androidKt.f6734f);
            bVar = (S0.b) c0230o.k(AbstractC1124c0.f14367f);
            kVar = (S0.k) c0230o.k(AbstractC1124c0.f14372l);
            c0226mM = C0208d.M(c0230o);
            interfaceC0203a0N = C0208d.N(aVar2, c0230o);
            uuid = (UUID) p020d2.n.H(new Object[0], null, e.i, c0230o, 3072, 6);
            zF = c0230o.f(view) | c0230o.f(bVar);
            objK = c0230o.K();
            Object obj3 = C0222k.f3714a;
            if (zF) {
                sVar4 = sVar3;
                kVar2 = kVar;
                v vVar5 = new v(aVar, sVar4, view, kVar2, bVar, uuid);
                V.a aVar6 = new V.a(488261145, new V0.d(1, interfaceC0203a0N), true);
                rVar = vVar5.f5458n;
                rVar.setParentCompositionContext(c0226mM);
                rVar.f5444q.setValue(aVar6);
                rVar.f5446s = true;
                if (rVar.f14340k != null) {
                }
                rVar.c();
                c0230o.f0(vVar5);
                objK = vVar5;
            } else {
                sVar4 = sVar3;
                kVar2 = kVar;
                v vVar6 = new v(aVar, sVar4, view, kVar2, bVar, uuid);
                V.a aVar7 = new V.a(488261145, new V0.d(1, interfaceC0203a0N), true);
                rVar = vVar6.f5458n;
                rVar.setParentCompositionContext(c0226mM);
                rVar.f5444q.setValue(aVar7);
                rVar.f5446s = true;
                if (rVar.f14340k != null) {
                }
                rVar.c();
                c0230o.f0(vVar6);
                objK = vVar6;
            }
            vVar = (v) objK;
            zH = c0230o.h(vVar);
            objK2 = c0230o.K();
            if (zH) {
                objK2 = new C0382a(vVar, 0);
                c0230o.f0(objK2);
            } else {
                objK2 = new C0382a(vVar, 0);
                c0230o.f0(objK2);
            }
            C0208d.c(vVar, (c) objK2, c0230o);
            boolean zH4 = c0230o.h(vVar);
            if ((i8 & 14) == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z9 = zH4 | z5;
            if ((i8 & 112) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            zF2 = z9 | z6 | c0230o.f(kVar2);
            objK3 = c0230o.K();
            if (zF2) {
                s sVar8 = sVar4;
                Object t9 = new T(vVar, aVar, sVar8, kVar2, 1);
                sVar4 = sVar8;
                c0230o.f0(t9);
                objK3 = t9;
            } else {
                s sVar9 = sVar4;
                Object t10 = new T(vVar, aVar, sVar9, kVar2, 1);
                sVar4 = sVar9;
                c0230o.f0(t10);
                objK3 = t10;
            }
            C0208d.g((D4.a) objK3, c0230o);
            sVar2 = sVar4;
        }
        c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0383b(aVar, sVar2, aVar2, i3, i6, 0);
        }
    }

    public static final void b(int i3, C0230o c0230o) {
        c0230o.X(-576071114);
        if (i3 == 0 && c0230o.B()) {
            c0230o.P();
        } else {
            I i6 = (I) c0230o.k(P0.f4083b);
            C0208d.c(x.f10867a, new defpackage.d(7), c0230o);
            J0.b(null, V.b.c(1485654778, new C0257c(i6, 8), c0230o), null, null, null, 0, 0L, 0L, null, G.f3955c, c0230o, 805306416, 509);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0253a(i3, 6);
        }
    }

    public static final void c(final g gVar, final float f6, final float f7, final float f8, final float f9, C0230o c0230o, final int i3) {
        int i6;
        c0230o.X(571072179);
        if ((i3 & 14) == 0) {
            i6 = (c0230o.f(gVar) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 112) == 0) {
            i6 |= c0230o.c(f6) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i6 |= c0230o.c(f7) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((i3 & 7168) == 0) {
            i6 |= c0230o.c(f8) ? 2048 : 1024;
        }
        if ((57344 & i3) == 0) {
            i6 |= c0230o.c(f9) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i6 & 46811) == 9362 && c0230o.B()) {
            c0230o.P();
        } else {
            int iIntValue = ((Number) gVar.f781a.getValue()).intValue();
            int iIntValue2 = ((Number) gVar.f782b.getValue()).intValue();
            int iIntValue3 = ((Boolean) gVar.f784d.getValue()).booleanValue() ? ((Number) gVar.f783c.getValue()).intValue() : 0;
            int i7 = p035g0.r.f9086m;
            V0 v0A = M.a(Z2.f.m((iIntValue * 360.0f) / 65535.0f, iIntValue2 / 255.0f, p081p0.c.N(iIntValue3 / 255.0f, 0.0f, 1.0f)), AbstractC0909d.k(((Number) gVar.f785e.getValue()).intValue(), 6, null), "previewTriangleColor", c0230o, 384, 8);
            p053k0.b bVarZ = d0.z(R.drawable.preview_triangle, c0230o);
            C1025h c1025h = C1026i.f13168a;
            long j4 = ((p035g0.r) v0A.getValue()).f9087a;
            V.d(bVarZ, null, androidx.compose.ui.graphics.a.b(androidx.compose.foundation.layout.a.e(androidx.compose.foundation.layout.c.h(l.f5957a, 30 * f9), (f6 - 15.0f) * f9, (f7 - 15.0f) * f9), 0.0f, 0.0f, 0.0f, 0.0f, f8, null, false, 130815), null, c1025h, 0.0f, new C0709j(j4, 5, C0710k.f9071a.a(j4, 5)), c0230o, 24632, 40);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new D4.e() { // from class: N3.i1
                @Override // D4.e
                public final Object d(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    D3.g gVar2 = gVar;
                    E4.k.f("$color", gVar2);
                    p006b.a.c(gVar2, f6, f7, f8, f9, (C0230o) obj, C0208d.V(i3 | 1));
                    return p084p4.x.f10867a;
                }
            };
        }
    }

    public static final void d(boolean z5, D4.e eVar, C0230o c0230o, int i3) {
        c0230o.X(-642000585);
        if ((((c0230o.g(z5) ? 4 : 2) | i3 | (c0230o.f(eVar) ? 32 : 16)) & 19) == 18 && c0230o.B()) {
            c0230o.P();
        } else {
            InterfaceC0203a0 interfaceC0203a0N = C0208d.N(eVar, c0230o);
            c0230o.W(-723524056);
            c0230o.W(-3687241);
            Object objK = c0230o.K();
            Object obj = C0222k.f3714a;
            if (objK == obj) {
                Object c0245w = new C0245w(C0208d.y(c0230o));
                c0230o.f0(c0245w);
                objK = c0245w;
            }
            c0230o.p(false);
            U4.d dVar = ((C0245w) objK).f3838h;
            c0230o.p(false);
            c0230o.W(-1071578902);
            Object objK2 = c0230o.K();
            Object obj2 = objK2;
            if (objK2 == obj) {
                D4.e eVar2 = (D4.e) interfaceC0203a0N.getValue();
                p018d.i iVar = new p018d.i(z5);
                iVar.f8563d = dVar;
                iVar.f8564e = eVar2;
                c0230o.f0(iVar);
                obj2 = iVar;
            }
            p018d.i iVar2 = (p018d.i) obj2;
            c0230o.p(false);
            Object obj3 = (D4.e) interfaceC0203a0N.getValue();
            c0230o.W(-1071578713);
            boolean zF = c0230o.f(obj3) | c0230o.f(dVar);
            Object objK3 = c0230o.K();
            if (zF || objK3 == obj) {
                iVar2.f8564e = (D4.e) interfaceC0203a0N.getValue();
                iVar2.f8563d = dVar;
                c0230o.f0(x.f10867a);
            }
            c0230o.p(false);
            Boolean boolValueOf = Boolean.valueOf(z5);
            c0230o.W(-1071578541);
            boolean zF2 = c0230o.f(iVar2) | c0230o.g(z5);
            Object objK4 = c0230o.K();
            if (zF2 || objK4 == obj) {
                objK4 = new j(iVar2, z5, null);
                c0230o.f0(objK4);
            }
            c0230o.p(false);
            C0208d.e((D4.e) objK4, c0230o, boolValueOf);
            E eA = p018d.f.a(c0230o);
            if (eA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            Object objA = eA.a();
            Object obj4 = (InterfaceC0458s) c0230o.k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            c0230o.W(-1071578150);
            boolean zF3 = c0230o.f(objA) | c0230o.f(obj4) | c0230o.f(iVar2);
            Object objK5 = c0230o.K();
            if (zF3 || objK5 == obj) {
                objK5 = new C0026n(objA, obj4, iVar2, 7);
                c0230o.f0(objK5);
            }
            c0230o.p(false);
            C0208d.d(obj4, objA, (c) objK5, c0230o);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new t(z5, eVar, i3);
        }
    }

    public static final void e(final D3.e eVar, final float f6, final boolean z5, final o oVar, C0230o c0230o, final int i3) {
        c0230o.X(933160146);
        if (((i3 | (c0230o.f(eVar) ? 4 : 2) | (c0230o.c(f6) ? 32 : 16) | (c0230o.f(oVar) ? 2048 : 1024)) & 5851) == 1170 && c0230o.B()) {
            c0230o.P();
        } else {
            int iIntValue = ((Number) eVar.f775l.getValue()).intValue();
            int iIntValue2 = ((Number) eVar.f776m.getValue()).intValue();
            C0217h0 c0217h0 = eVar.f778o;
            boolean zBooleanValue = ((Boolean) c0217h0.getValue()).booleanValue();
            C0217h0 c0217h1 = eVar.f777n;
            int iIntValue3 = zBooleanValue ? ((Number) c0217h1.getValue()).intValue() : 0;
            float fIntValue = ((Boolean) c0217h0.getValue()).booleanValue() ? ((Number) c0217h1.getValue()).intValue() / 255.0f : 0.0f;
            C0217h0 c0217h2 = eVar.f779p;
            v0 v0VarK = AbstractC0909d.k(((Number) c0217h2.getValue()).intValue(), 6, null);
            int i6 = p035g0.r.f9086m;
            V0 v0A = M.a(Z2.f.m((iIntValue * 360.0f) / 65535.0f, iIntValue2 / 255.0f, p081p0.c.N(iIntValue3 / 255.0f, 0.0f, 1.0f)), v0VarK, "previewBeamColor", c0230o, 384, 8);
            float f7 = 150 * f6;
            G4.a.a(androidx.compose.ui.graphics.a.b(androidx.compose.foundation.layout.c.i(oVar, f7, f7), z5 ? -1.0f : 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131070), new C0299x0(AbstractC0473d.C(R.drawable.preview_beam, c0230o), AbstractC0473d.C(R.drawable.preview_beam_white, c0230o), v0A, AbstractC0914g.b(Math.max(0.2f, fIntValue), AbstractC0909d.k(((Number) c0217h2.getValue()).intValue(), 6, null), c0230o, 3072, 20), 1), c0230o, 0);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new D4.e(f6, z5, oVar, i3) { // from class: N3.h1
                public final /* synthetic */ float i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ boolean f4186j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ Z.o f4187k;

                @Override // D4.e
                public final Object d(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    D3.e eVar2 = this.f4185h;
                    int iV = C0208d.V(385);
                    boolean z6 = this.f4186j;
                    Z.o oVar2 = this.f4187k;
                    p006b.a.e(eVar2, this.i, z6, oVar2, (C0230o) obj, iV);
                    return p084p4.x.f10867a;
                }
            };
        }
    }

    public static final void f(final D3.f fVar, final float f6, final o oVar, C0230o c0230o, final int i3) {
        c0230o.X(727673813);
        int i6 = (c0230o.f(fVar) ? 4 : 2) | i3 | (c0230o.c(f6) ? 32 : 16) | (c0230o.f(oVar) ? HueLog.LogComponent.STREAMDTLS : 128);
        if ((i6 & 731) == 146 && c0230o.B()) {
            c0230o.P();
        } else {
            o oVarI = androidx.compose.foundation.layout.c.i(oVar, 98 * f6, 128 * f6);
            F fE = AbstractC1084q.e(Z.b.f5933h, false);
            int i7 = c0230o.f3744P;
            InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
            o oVarC = Z.a.c(c0230o, oVarI);
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
            if (c0230o.f3743O || !k.a(c0230o.K(), Integer.valueOf(i7))) {
                p012c.k.y(i7, c0230o, i7, c1100h);
            }
            C0208d.R(C1101i.f14039c, c0230o, oVarC);
            X.s sVar = fVar.f780l;
            int i8 = ((i6 << 9) & 57344) | 3504;
            c((g) sVar.get(0), 48.5f, 85.0f, 0.0f, f6, c0230o, i8);
            c((g) sVar.get(1), 31.25f, 79.0f, 180.0f, f6, c0230o, i8);
            c((g) sVar.get(2), 66.25f, 79.0f, 180.0f, f6, c0230o, i8);
            c((g) sVar.get(3), 48.5f, 114.5f, 180.0f, f6, c0230o, i8);
            c((g) sVar.get(4), 31.25f, 49.0f, 0.0f, f6, c0230o, i8);
            c((g) sVar.get(5), 66.25f, 49.0f, 0.0f, f6, c0230o, i8);
            c((g) sVar.get(6), 48.5f, 43.0f, 180.0f, f6, c0230o, i8);
            c((g) sVar.get(7), 48.5f, 14.0f, 0.0f, f6, c0230o, i8);
            c0230o.p(true);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new D4.e(f6, oVar, i3) { // from class: N3.g1
                public final /* synthetic */ float i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ Z.o f4180j;

                @Override // D4.e
                public final Object d(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    D3.f fVar2 = this.f4179h;
                    int iV = C0208d.V(1);
                    p006b.a.f(fVar2, this.i, this.f4180j, (C0230o) obj, iV);
                    return p084p4.x.f10867a;
                }
            };
        }
    }

    public static final void g(D3.l lVar, o oVar, C0230o c0230o, int i3) {
        k.f("room", lVar);
        c0230o.X(258205282);
        ArrayList arrayList = new ArrayList();
        X.s sVar = lVar.f810a;
        ListIterator listIterator = sVar.listIterator();
        while (true) {
            y yVar = (y) listIterator;
            if (!yVar.hasNext()) {
                break;
            }
            Object next = yVar.next();
            if (next instanceof D3.e) {
                arrayList.add(next);
            }
        }
        List listO0 = p089q4.l.o0(4, arrayList);
        ArrayList arrayList2 = new ArrayList();
        ListIterator listIterator2 = sVar.listIterator();
        while (true) {
            y yVar2 = (y) listIterator2;
            if (!yVar2.hasNext()) {
                break;
            }
            Object next2 = yVar2.next();
            if (next2 instanceof D3.f) {
                arrayList2.add(next2);
            }
        }
        AbstractC1070c.a(androidx.compose.foundation.a.b(d0.k(oVar, A.e.a(8)), p035g0.r.f9076b, H.f9016a), Z.b.f5936l, V.b.c(-54679752, new C0284p0(p089q4.l.o0(2, arrayList2), 4, listO0), c0230o), c0230o, 3120, 4);
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new W(i3, 1, lVar, oVar);
        }
    }

    public static final void h(o oVar, V.a aVar, C0230o c0230o, int i3) {
        int i6;
        c0230o.X(-1177876616);
        if ((i3 & 6) == 0) {
            i6 = (c0230o.f(oVar) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= c0230o.h(aVar) ? 32 : 16;
        }
        if ((i6 & 19) == 18 && c0230o.B()) {
            c0230o.P();
        } else {
            V0.f fVar = V0.f.f5420b;
            int i7 = c0230o.f3744P;
            InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
            o oVarC = Z.a.c(c0230o, oVar);
            InterfaceC1102j.f14043g.getClass();
            C1106n c1106n = C1101i.f14038b;
            int i8 = (((((i6 << 3) & 112) | (((i6 >> 3) & 14) | 384)) << 6) & 896) | 6;
            c0230o.Z();
            if (c0230o.f3743O) {
                c0230o.l(c1106n);
            } else {
                c0230o.i0();
            }
            C0208d.R(C1101i.f14041e, c0230o, fVar);
            C0208d.R(C1101i.f14040d, c0230o, interfaceC0225l0M);
            C1100h c1100h = C1101i.f14042f;
            if (c0230o.f3743O || !k.a(c0230o.K(), Integer.valueOf(i7))) {
                p012c.k.y(i7, c0230o, i7, c1100h);
            }
            C0208d.R(C1101i.f14039c, c0230o, oVarC);
            aVar.d(c0230o, Integer.valueOf((i8 >> 6) & 14));
            c0230o.p(true);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0018j(i3, 6, oVar, aVar);
        }
    }

    public static final C0073o i(L l6, InterfaceC0067i interfaceC0067i) {
        boolean z5 = l6.g() == 1;
        C0071m c0071m = (C0071m) l6.f1107d;
        return new C0073o(k(c0071m, z5, true, interfaceC0067i), k(c0071m, z5, false, interfaceC0067i), z5);
    }

    public static final C0072n j(L l6, C0071m c0071m, C0072n c0072n) {
        boolean z5 = l6.f1105b;
        int i3 = c0071m.f1190c;
        int i6 = c0071m.f1189b;
        int i7 = z5 ? i6 : i3;
        p084p4.g gVar = p084p4.g.i;
        p084p4.f fVarY = G4.a.y(gVar, new C0076s(c0071m, i7));
        p084p4.f fVarY2 = G4.a.y(gVar, new F.r(c0071m, i7, z5 ? i3 : i6, l6, fVarY));
        if (1 != c0072n.f1195c) {
            return (C0072n) fVarY2.getValue();
        }
        int i8 = c0071m.f1191d;
        if (i7 == i8) {
            return c0072n;
        }
        G0.G g6 = (G0.G) c0071m.f1192e;
        if (((Number) fVarY.getValue()).intValue() != g6.e(i8)) {
            return (C0072n) fVarY2.getValue();
        }
        int i9 = c0072n.f1194b;
        long jK = g6.k(i9);
        if (i8 != -1) {
            if (i7 != i8) {
                if (!(z5 ^ (i6 >= i3 && i6 > i3))) {
                }
            }
            return c0071m.b(i7);
        }
        int i10 = G0.I.f1469c;
        return (i9 == ((int) (jK >> 32)) || i9 == ((int) (4294967295L & jK))) ? (C0072n) fVarY2.getValue() : c0071m.b(i7);
    }

    public static final C0072n k(C0071m c0071m, boolean z5, boolean z6, InterfaceC0067i interfaceC0067i) {
        long j4;
        long jA = interfaceC0067i.a(c0071m, z6 ? c0071m.f1189b : c0071m.f1190c);
        if (z5 ^ z6) {
            int i3 = G0.I.f1469c;
            j4 = jA >> 32;
        } else {
            int i6 = G0.I.f1469c;
            j4 = 4294967295L & jA;
        }
        return c0071m.b((int) j4);
    }

    public static void l(StringBuilder sb, Object obj, c cVar) {
        if (cVar != null) {
            sb.append((CharSequence) cVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006f A[LOOP:0: B:22:0x0062->B:26:0x006f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x004c A[EDGE_INSN: B:31:0x004c->B:18:0x004c BREAK  A[LOOP:0: B:22:0x0062->B:26:0x006f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0056 -> B:21:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object m(p091r0.y r7, p122w4.a r8) {
        /*
            boolean r0 = r8 instanceof p112v.U
            if (r0 == 0) goto L13
            r0 = r8
            v.U r0 = (p112v.U) r0
            int r1 = r0.f12899m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12899m = r1
            goto L18
        L13:
            v.U r0 = new v.U
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f12898l
            v4.a r1 = v4.a.f13292h
            int r2 = r0.f12899m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            r0.y r7 = r0.f12897k
            S1.V.O(r8)
            goto L59
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            S1.V.O(r8)
            r0.A r8 = r7.f11548l
            r0.i r8 = r8.f11468z
            java.lang.Object r8 = r8.f11494a
            int r2 = r8.size()
            r5 = r4
        L40:
            if (r5 >= r2) goto L75
            java.lang.Object r6 = r8.get(r5)
            r0.q r6 = (p091r0.q) r6
            boolean r6 = r6.f11511d
            if (r6 == 0) goto L72
        L4c:
            r0.j r8 = p091r0.j.f11498j
            r0.f12897k = r7
            r0.f12899m = r3
            java.lang.Object r8 = r7.b(r8, r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            r0.i r8 = (p091r0.i) r8
            java.lang.Object r8 = r8.f11494a
            int r2 = r8.size()
            r5 = r4
        L62:
            if (r5 >= r2) goto L75
            java.lang.Object r6 = r8.get(r5)
            r0.q r6 = (p091r0.q) r6
            boolean r6 = r6.f11511d
            if (r6 == 0) goto L6f
            goto L4c
        L6f:
            int r5 = r5 + 1
            goto L62
        L72:
            int r5 = r5 + 1
            goto L40
        L75:
            p4.x r7 = p084p4.x.f10867a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.a.m(r0.y, w4.a):java.lang.Object");
    }

    public static final Object n(A a6, D4.e eVar, p111u4.d dVar) {
        Object objY0 = a6.y0(new p112v.V(dVar.e(), eVar, null), dVar);
        return objY0 == v4.a.f13292h ? objY0 : x.f10867a;
    }

    public static final Bundle o(h... hVarArr) {
        Bundle bundle = new Bundle(hVarArr.length);
        for (h hVar : hVarArr) {
            String str = (String) hVar.f10849h;
            Object obj = hVar.i;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                k.c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                p025e1.c.a(bundle, str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                p025e1.c.b(bundle, str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final C0072n p(C0072n c0072n, C0071m c0071m, int i3) {
        return new C0072n(((G0.G) c0071m.f1192e).a(i3), i3, c0072n.f1195c);
    }

    public static void q(int i3, int i6, int i7) {
        if (i3 >= 0 && i6 <= i7) {
            if (i3 > i6) {
                throw new IllegalArgumentException(AbstractC0013g0.g("startIndex: ", i3, i6, " > endIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("startIndex: " + i3 + ", endIndex: " + i6 + ", size: " + i7);
    }

    public static void r(int i3, int i6, int i7) {
        if (i3 >= 0 && i6 <= i7) {
            if (i3 > i6) {
                throw new IllegalArgumentException(AbstractC0013g0.g("fromIndex: ", i3, i6, " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i3 + ", toIndex: " + i6 + ", size: " + i7);
    }

    public static final void s(p044i0.d dVar, C0704e c0704e, C0709j c0709j, float f6) {
        p044i0.d.I(dVar, c0704e, AbstractC0473d.b(c0704e.f9060a.getWidth(), c0704e.f9060a.getHeight()), AbstractC0473d.b((int) p030f0.f.d(dVar.f()), (int) p030f0.f.b(dVar.f())), f6, c0709j, 0, 576);
    }

    public static final long t(long j4, boolean z5, int i3, float f6) {
        int iH = ((z5 || i3 == 2) && S0.a.d(j4)) ? S0.a.h(j4) : Integer.MAX_VALUE;
        if (S0.a.j(j4) != iH) {
            iH = p081p0.c.O(AbstractC0029o0.n(f6), S0.a.j(j4), iH);
        }
        int iG = S0.a.g(j4);
        int iMin = Math.min(0, 262142);
        int iMin2 = iH == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(iH, 262142);
        int iC = p081p0.c.C(iMin2 == Integer.MAX_VALUE ? iMin : iMin2);
        return p081p0.c.t(iMin, iMin2, Math.min(iC, 0), iG != Integer.MAX_VALUE ? Math.min(iC, iG) : Integer.MAX_VALUE);
    }

    public static final C0823f u() {
        C0823f c0823f = f7019h;
        if (c0823f != null) {
            return c0823f;
        }
        C0822e c0822e = new C0822e("AutoMirrored.Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i3 = p058l0.G.f10217a;
        O o6 = new O(p035g0.r.f9076b);
        C0227m0 c0227m0 = new C0227m0(2);
        c0227m0.i(20.0f, 11.0f);
        c0227m0.e(7.83f);
        c0227m0.h(5.59f, -5.59f);
        c0227m0.g(12.0f, 4.0f);
        c0227m0.h(-8.0f, 8.0f);
        c0227m0.h(8.0f, 8.0f);
        c0227m0.h(1.41f, -1.41f);
        c0227m0.g(7.83f, 13.0f);
        c0227m0.e(20.0f);
        c0227m0.n(-2.0f);
        c0227m0.b();
        C0822e.a(c0822e, c0227m0.f3729h, o6);
        C0823f c0823fB = c0822e.b();
        f7019h = c0823fB;
        return c0823fB;
    }

    public static final int v(int i3, int i6) {
        return (i3 >> i6) & 31;
    }

    public static L4.k w(D4.e eVar) {
        L4.k kVar = new L4.k();
        kVar.f3116j = AbstractC0473d.o(eVar, kVar, kVar);
        return kVar;
    }

    public static final Y4.a x(b bVar, ArrayList arrayList, D4.a aVar) {
        Y4.a c0479c;
        Y4.a i0Var;
        k.f("<this>", bVar);
        if (bVar.equals(E4.x.a(Collection.class)) || bVar.equals(E4.x.a(List.class)) || bVar.equals(E4.x.a(List.class)) || bVar.equals(E4.x.a(ArrayList.class))) {
            c0479c = new C0479c((Y4.a) arrayList.get(0), 0);
        } else if (bVar.equals(E4.x.a(HashSet.class))) {
            c0479c = new C0479c((Y4.a) arrayList.get(0), 1);
        } else if (bVar.equals(E4.x.a(Set.class)) || bVar.equals(E4.x.a(Set.class)) || bVar.equals(E4.x.a(LinkedHashSet.class))) {
            c0479c = new C0479c((Y4.a) arrayList.get(0), 2);
        } else if (bVar.equals(E4.x.a(HashMap.class))) {
            c0479c = new c5.E((Y4.a) arrayList.get(0), (Y4.a) arrayList.get(1), 0);
        } else if (bVar.equals(E4.x.a(Map.class)) || bVar.equals(E4.x.a(Map.class)) || bVar.equals(E4.x.a(LinkedHashMap.class))) {
            c0479c = new c5.E((Y4.a) arrayList.get(0), (Y4.a) arrayList.get(1), 1);
        } else {
            if (bVar.equals(E4.x.a(Map.Entry.class))) {
                Y4.a aVar2 = (Y4.a) arrayList.get(0);
                Y4.a aVar3 = (Y4.a) arrayList.get(1);
                k.f("keySerializer", aVar2);
                k.f("valueSerializer", aVar3);
                i0Var = new S(aVar2, aVar3, 0);
            } else if (bVar.equals(E4.x.a(h.class))) {
                Y4.a aVar4 = (Y4.a) arrayList.get(0);
                Y4.a aVar5 = (Y4.a) arrayList.get(1);
                k.f("keySerializer", aVar4);
                k.f("valueSerializer", aVar5);
                i0Var = new S(aVar4, aVar5, 1);
            } else if (bVar.equals(E4.x.a(p084p4.n.class))) {
                Y4.a aVar6 = (Y4.a) arrayList.get(0);
                Y4.a aVar7 = (Y4.a) arrayList.get(1);
                Y4.a aVar8 = (Y4.a) arrayList.get(2);
                k.f("aSerializer", aVar6);
                k.f("bSerializer", aVar7);
                k.f("cSerializer", aVar8);
                c0479c = new q0(aVar6, aVar7, aVar8);
            } else if (p020d2.n.s(bVar).isArray()) {
                Object objInvoke = aVar.invoke();
                k.d("null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>", objInvoke);
                Y4.a aVar9 = (Y4.a) arrayList.get(0);
                k.f("elementSerializer", aVar9);
                i0Var = new i0((b) objInvoke, aVar9);
            } else {
                c0479c = null;
            }
            c0479c = i0Var;
        }
        if (c0479c != null) {
            return c0479c;
        }
        Y4.a[] aVarArr = (Y4.a[]) arrayList.toArray(new Y4.a[0]);
        return AbstractC0476a0.d(bVar, (Y4.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
    }

    public static p105t3.r y(p138z3.a aVar) {
        int i3 = aVar.f14644v;
        if (i3 == 2) {
            aVar.f14644v = 1;
        }
        try {
            try {
                p105t3.r rVarI = p116v3.d.i(aVar);
                aVar.i0(i3);
                return rVarI;
            } catch (OutOfMemoryError e6) {
                throw new JsonParseException("Failed parsing JSON source: " + aVar + " to Json", e6);
            } catch (StackOverflowError e7) {
                throw new JsonParseException("Failed parsing JSON source: " + aVar + " to Json", e7);
            }
        } catch (Throwable th) {
            aVar.i0(i3);
            throw th;
        }
    }

    public static p105t3.r z(String str) {
        try {
            p138z3.a aVar = new p138z3.a(new StringReader(str));
            p105t3.r rVarY = y(aVar);
            rVarY.getClass();
            if (!(rVarY instanceof p105t3.s) && aVar.f0() != 10) {
                throw new JsonSyntaxException("Did not consume the entire document.");
            }
            return rVarY;
        } catch (MalformedJsonException e6) {
            throw new JsonSyntaxException(e6);
        } catch (IOException e7) {
            throw new JsonIOException(e7);
        } catch (NumberFormatException e8) {
            throw new JsonSyntaxException(e8);
        }
    }

    public abstract void F(byte[] bArr, int i3, int i6);
}

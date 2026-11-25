package B;

import M0.C0198a;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import com.spotify.protocol.WampClient;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class L0 extends E4.i implements D4.c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f173p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L0(int i, Object obj, Class cls, String str, String str2, int i3, int i6) {
        super(i, obj, cls, str, str2, i3);
        this.f173p = i6;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00df  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f3  */
    @Override // D4.c
    public final Object invoke(Object obj) {
        C0198a c0198a;
        int iA;
        Integer numValueOf;
        boolean zD;
        switch (this.f173p) {
            case 0:
                KeyEvent keyEvent = ((p081p0.b) obj).f10828a;
                K0 k3 = (K0) this.i;
                k3.getClass();
                boolean z5 = true;
                if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
                    c0198a = null;
                } else {
                    C0007d0 c0007d0 = k3.i;
                    c0007d0.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        c0007d0.f301a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        numValueOf = null;
                    } else {
                        Integer num = c0007d0.f301a;
                        if (num != null) {
                            c0007d0.f301a = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            numValueOf = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                numValueOf = null;
                            }
                            if (numValueOf == null) {
                                numValueOf = Integer.valueOf(unicodeChar);
                            }
                        } else {
                            numValueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (numValueOf != null) {
                        c0198a = new C0198a(new StringBuilder().appendCodePoint(numValueOf.intValue()).toString(), 1);
                    } else {
                        c0198a = null;
                    }
                }
                F.X x6 = k3.f159f;
                boolean z6 = k3.f157d;
                if (c0198a != null) {
                    if (z6) {
                        k3.a(com.fasterxml.jackson.databind.deser.std.d0.v(c0198a));
                        x6.f1151a = null;
                    } else {
                        z5 = false;
                    }
                } else if (p081p0.c.o0(keyEvent) != 2 || (iA = k3.f162j.a(keyEvent)) == 0) {
                    z5 = false;
                } else {
                    boolean z7 = true;
                    switch (iA) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case WampClient.RequestType.SUBSCRIBED /* 33 */:
                        case WampClient.RequestType.UNSUBSCRIBE /* 34 */:
                        case WampClient.RequestType.UNSUBSCRIBED /* 35 */:
                        case WampClient.RequestType.EVENT /* 36 */:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                            z7 = false;
                        case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                        case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case WampClient.RequestType.CALL /* 48 */:
                            if (z7 && !z6) {
                                z5 = false;
                            } else {
                                E4.s sVar = new E4.s();
                                sVar.f1070h = true;
                                J0 j4 = new J0(iA, k3, sVar);
                                a1 a1VarD = k3.f154a.d();
                                M0.w wVar = k3.f156c;
                                F.M m6 = new F.M(wVar, k3.f160g, a1VarD, x6);
                                j4.invoke(m6);
                                if (!G0.I.a(m6.f1113f, wVar.f3454b) || !E4.k.a(m6.f1114g, wVar.f3453a)) {
                                    k3.f163k.invoke(M0.w.a(wVar, m6.f1114g, m6.f1113f, 4));
                                }
                                j1 j1Var = k3.f161h;
                                if (j1Var != null) {
                                    j1Var.f348e = true;
                                }
                                z5 = sVar.f1070h;
                            }
                            break;
                        default:
                            throw null;
                    }
                }
                return Boolean.valueOf(z5);
            case 1:
                D4.a aVar = (D4.a) obj;
                P.d dVar = ((p130y0.r) this.i).f14513w0;
                if (!dVar.j(aVar)) {
                    dVar.c(aVar);
                }
                return p084p4.x.f10867a;
            default:
                int i = ((p024e0.b) obj).f8640a;
                p130y0.r rVar = (p130y0.r) this.i;
                rVar.getClass();
                if (i == 7 || i == 8) {
                    zD = false;
                } else {
                    Integer numH = p024e0.d.H(i);
                    if (numH == null) {
                        throw new IllegalStateException("Invalid focus direction");
                    }
                    int iIntValue = numH.intValue();
                    p030f0.d dVarT = rVar.t();
                    Rect rectT = dVarT != null ? p035g0.H.t(dVarT) : null;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View viewFindNextFocus = rectT == null ? focusFinder.findNextFocus(rVar, rVar.findFocus(), iIntValue) : focusFinder.findNextFocusFromRect(rVar, rectT, iIntValue);
                    if (viewFindNextFocus != null) {
                        zD = p024e0.d.D(viewFindNextFocus, Integer.valueOf(iIntValue), rectT);
                    } else {
                        zD = false;
                    }
                }
                return Boolean.valueOf(zD);
        }
    }
}

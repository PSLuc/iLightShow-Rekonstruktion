package p5;

import B.AbstractC0013g0;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import org.eclipse.californium.scandium.dtls.HandshakeException;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11000a;

    public S(int i) {
        if (i == 0) {
            throw new NullPointerException("extension type must not be null!");
        }
        this.f11000a = i;
    }

    public static S b(int i, m5.h hVar, InetSocketAddress inetSocketAddress) throws HandshakeException {
        int i3;
        z0 z0Var;
        int i6 = 2;
        int[] iArrE = AbstractC0916i.e(26);
        int length = iArrE.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i3 = 0;
                break;
            }
            i3 = iArrE[i7];
            if (p012c.k.f(i3) == i) {
                break;
            }
            i7++;
        }
        if (i3 != 0) {
            int iD = AbstractC0916i.d(i3);
            if (iD == 0) {
                if (!hVar.b()) {
                    return new r0(1);
                }
                t5.e eVar = new t5.e();
                try {
                    eVar.d(hVar);
                    return new r0(eVar);
                } catch (IllegalArgumentException e6) {
                    if (e6.getCause() instanceof IllegalArgumentException) {
                        throw new HandshakeException("Server Name Indication extension contains unknown name_type", new C0838c(EnumC0837b.FATAL, EnumC0835a.ILLEGAL_PARAMETER, inetSocketAddress));
                    }
                    throw new HandshakeException("malformed Server Name Indication extension", new C0838c(EnumC0837b.FATAL, EnumC0835a.DECODE_ERROR, inetSocketAddress));
                }
            }
            if (iD == 1) {
                int iE = hVar.e(8);
                if (iE == 1) {
                    i6 = 1;
                } else if (iE != 2) {
                    i6 = 3;
                    if (iE != 3) {
                        i6 = 4;
                        if (iE != 4) {
                            i6 = 0;
                        }
                    }
                }
                if (i6 != 0) {
                    return new Y(i6);
                }
                throw new HandshakeException(String.format("Peer uses unknown code [%d] in %s extension", Integer.valueOf(iE), "MAX_FRAGMENT_LENGTH"), new C0838c(EnumC0837b.FATAL, EnumC0835a.ILLEGAL_PARAMETER, inetSocketAddress));
            }
            if (iD == 10) {
                ArrayList arrayList = new ArrayList();
                m5.h hVarD = hVar.d(hVar.e(16));
                while (hVarD.b()) {
                    int iE2 = hVarD.e(16);
                    q5.w wVar = q5.w.secp256r1;
                    q5.w wVar2 = (q5.w) q5.x.f11343w.get(Integer.valueOf(iE2));
                    if (wVar2 != null) {
                        arrayList.add(wVar2);
                    }
                }
                return new y0(Collections.unmodifiableList(arrayList));
            }
            if (iD == 11) {
                A0 a6 = A0.f10885c;
                ArrayList arrayList2 = new ArrayList();
                m5.h hVarD2 = hVar.d(hVar.e(8));
                while (true) {
                    boolean zB = hVarD2.b();
                    z0Var = z0.UNCOMPRESSED;
                    if (!zB) {
                        break;
                    }
                    int iE3 = hVarD2.e(8);
                    if (iE3 != 0) {
                        if (iE3 != 1) {
                            z0Var = iE3 != 2 ? null : z0.ANSIX962_COMPRESSED_CHAR2;
                        } else {
                            z0Var = z0.ANSIX962_COMPRESSED_PRIME;
                        }
                    }
                    if (z0Var != null) {
                        arrayList2.add(z0Var);
                    }
                }
                return (arrayList2.size() == 1 && arrayList2.contains(z0Var)) ? A0.f10885c : new A0(arrayList2);
            }
            if (iD == 13) {
                ArrayList arrayList3 = new ArrayList();
                m5.h hVarD3 = hVar.d(hVar.e(16));
                while (hVarD3.b()) {
                    arrayList3.add(new x0(hVarD3.e(8), hVarD3.e(8)));
                }
                return new w0(Collections.unmodifiableList(arrayList3));
            }
            if (iD == 23) {
                int iA = hVar.a() / 8;
                if (iA == 0) {
                    throw new HandshakeException("Connection id length must be provided!", new C0838c(EnumC0837b.FATAL, EnumC0835a.ILLEGAL_PARAMETER, inetSocketAddress));
                }
                if (iA > 256) {
                    throw new HandshakeException("Connection id length too large! 255 max, but has " + (iA - 1), new C0838c(EnumC0837b.FATAL, EnumC0835a.ILLEGAL_PARAMETER, inetSocketAddress));
                }
                int iE4 = hVar.e(8);
                int i8 = iA - 1;
                if (iE4 == i8) {
                    return iE4 == 0 ? new C0856v(C0855u.f11152e) : new C0856v(new C0855u(hVar.f(iE4), 255));
                }
                throw new HandshakeException("Connection id length " + iE4 + " doesn't match " + i8 + "!", new C0838c(EnumC0837b.FATAL, EnumC0835a.ILLEGAL_PARAMETER, inetSocketAddress));
            }
            if (iD == 25) {
                int iE5 = hVar.e(16);
                if (iE5 >= 64) {
                    return new j0(iE5);
                }
                throw new HandshakeException(AbstractC0013g0.f(iE5, "record size limit must be at last 64 bytes, not only ", "!"), new C0838c(EnumC0837b.FATAL, EnumC0835a.ILLEGAL_PARAMETER, inetSocketAddress));
            }
            if (iD == 19) {
                return new C0848m(20, hVar);
            }
            if (iD == 20) {
                return new m0(21, hVar);
            }
        }
        m5.g gVar = hVar.f10448a;
        gVar.skip(gVar.available());
        hVar.f10449b = (byte) 0;
        hVar.f10450c = -1;
        return null;
    }

    public abstract void a(m5.j jVar);

    public abstract int c();

    public String toString() {
        StringBuilder sb = new StringBuilder("\t\t\tExtension: ");
        int i = this.f11000a;
        sb.append(p012c.k.C(i));
        sb.append(" (");
        sb.append(p012c.k.f(i));
        sb.append(")\n");
        return sb.toString();
    }
}

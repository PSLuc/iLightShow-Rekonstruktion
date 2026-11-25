package x5;

import E4.k;
import java.net.InetAddress;
import v5.h;
import w5.C1064w;
import w5.InterfaceC1067z;
import y5.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InetAddress f14146a;

    static {
        InetAddress byName = InetAddress.getByName("255.255.255.255");
        k.e("getByName(...)", byName);
        f14146a = byName;
    }

    public static final h a(InterfaceC1067z interfaceC1067z, int i, byte b6) {
        short sB = (short) (interfaceC1067z.b() + 36);
        short sC = (short) interfaceC1067z.c();
        C1064w c1064w = new C1064w();
        c1064w.f13664a = sB;
        c1064w.f13665b = (short) 0;
        c1064w.f13666c = i;
        c1064w.f13667d = 0L;
        c1064w.f13668e = new Byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        c1064w.f13669f = (byte) 0;
        c1064w.f13670g = b6;
        c1064w.f13671h = 0L;
        c1064w.i = sC;
        c1064w.f13672j = (short) 0;
        return new h(c1064w, interfaceC1067z);
    }

    public static final c b(InterfaceC1067z interfaceC1067z, int i, long j4, InetAddress inetAddress, byte b6) {
        k.f("address", inetAddress);
        h hVarA = a(interfaceC1067z, i, b6);
        C1064w c1064w = hVarA.f13321a;
        c1064w.f13667d = j4;
        c1064w.f13665b = (short) 5120;
        return new c(hVarA, inetAddress);
    }
}

package D3;

import N3.A0;
import java.net.InetAddress;
import java.util.Date;
import p084p4.x;
import w5.C1063v;
import w5.D;
import w5.E;
import w5.K;

/* JADX INFO: loaded from: classes.dex */
public final class c extends j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public v5.k f766l;

    @Override // D3.j
    public final void a(d dVar) {
        a aVar;
        v5.k kVar = this.f766l;
        if (kVar == null || (aVar = dVar.f767a) == null) {
            return;
        }
        C1063v c1063v = new C1063v((short) aVar.f761a, (short) (aVar.f762b * 255), (short) (aVar.f763c * 255), (short) 4000);
        int i = dVar.f768b * 100;
        D d6 = new D();
        d6.f13468a = (byte) 0;
        d6.f13469b = c1063v;
        d6.f13470c = i;
        x5.b.c(new p011b4.e(new p022d4.b(new v5.c(kVar, d6, new A0(kVar, 7, c1063v), 1)), 1, new v5.a(v5.e.f13314o)));
    }

    @Override // D3.j
    public final void e() {
        final v5.k kVar = this.f766l;
        if (kVar == null) {
            return;
        }
        E e6 = new E();
        final short s6 = -1;
        e6.f13472a = (short) -1;
        e6.f13473b = 1000;
        x5.b.c(new p011b4.e(new p022d4.b(new v5.c(kVar, e6, new D4.a() { // from class: v5.r
            @Override // D4.a
            public final Object invoke() {
                k kVar2 = kVar;
                E4.k.f("$light", kVar2);
                l[] lVarArr = l.f13347h;
                kVar2.f13335o.put(n.f13351j, Long.valueOf(new Date().getTime()));
                K.i.getClass();
                kVar2.L(q5.n.a(s6));
                return x.f10867a;
            }
        }, 1)), 1, new v5.a(v5.e.f13315p)));
    }

    public final String i() {
        InetAddress inetAddress;
        String hostAddress;
        v5.k kVar = this.f766l;
        if (kVar == null || (inetAddress = kVar.f13337q) == null || (hostAddress = inetAddress.getHostAddress()) == null || hostAddress.equals("255.255.255.255")) {
            return null;
        }
        return hostAddress;
    }
}

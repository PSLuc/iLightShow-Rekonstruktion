package I3;

import E4.k;
import P4.InterfaceC0335w;
import S1.V;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import p084p4.x;
import p122w4.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f1858l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, p111u4.d dVar) {
        super(2, dVar);
        this.f1858l = cVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new b(this.f1858l, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        b bVar = (b) b((InterfaceC0335w) obj, (p111u4.d) obj2);
        x xVar = x.f10867a;
        bVar.o(xVar);
        return xVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        c cVar = this.f1858l;
        v4.a aVar = v4.a.f13292h;
        V.O(obj);
        try {
            c cVar2 = c.f1859f;
            cVar.getClass();
            InetAddress byName = InetAddress.getByName("239.255.255.250");
            byte[] bytes = cVar.f1864e.getBytes(M4.a.f3520a);
            k.e("getBytes(...)", bytes);
            DatagramPacket datagramPacket = new DatagramPacket(bytes, cVar.f1864e.length(), byName, 1900);
            DatagramSocket datagramSocket = cVar.f1860a;
            if (datagramSocket != null) {
                datagramSocket.send(datagramPacket);
            }
        } catch (Exception unused) {
        }
        return x.f10867a;
    }
}

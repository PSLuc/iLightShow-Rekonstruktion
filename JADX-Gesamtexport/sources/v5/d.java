package v5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import p089q4.y;
import w5.AbstractC1046d;
import w5.C1064w;
import w5.InterfaceC1066y;
import w5.InterfaceC1067z;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f13307a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f13308b = new d();

    public h a(ByteBuffer byteBuffer, int i) {
        byteBuffer.mark();
        C1064w c1064w = new C1064w();
        c1064w.f13664a = byteBuffer.getShort();
        c1064w.f13665b = byteBuffer.getShort();
        c1064w.f13666c = byteBuffer.getInt();
        c1064w.f13667d = byteBuffer.getLong();
        J4.d dVarD0 = p081p0.c.D0(0, 6);
        ArrayList arrayList = new ArrayList(p089q4.n.P(dVarD0, 10));
        Iterator it = dVarD0.iterator();
        while (((J4.c) it).f1944j) {
            ((y) it).a();
            arrayList.add(Byte.valueOf(byteBuffer.get()));
        }
        c1064w.f13668e = (Byte[]) arrayList.toArray(new Byte[0]);
        c1064w.f13669f = byteBuffer.get();
        c1064w.f13670g = byteBuffer.get();
        c1064w.f13671h = byteBuffer.getLong();
        c1064w.i = byteBuffer.getShort();
        c1064w.f13672j = byteBuffer.getShort();
        InterfaceC1066y interfaceC1066y = (InterfaceC1066y) AbstractC1046d.f13576a.get(Integer.valueOf(i));
        if (interfaceC1066y != null) {
            return new h(c1064w, interfaceC1066y.a(byteBuffer));
        }
        byteBuffer.position((byteBuffer.position() + c1064w.f13664a) - 36);
        return null;
    }

    public ByteBuffer b(h hVar) {
        C1064w c1064w = hVar.f13321a;
        InterfaceC1067z interfaceC1067z = hVar.f13322b;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(interfaceC1067z.b() + 36);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        c1064w.a(byteBufferAllocate);
        interfaceC1067z.a(byteBufferAllocate);
        return byteBufferAllocate;
    }
}

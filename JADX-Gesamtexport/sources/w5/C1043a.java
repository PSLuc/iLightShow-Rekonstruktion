package w5;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: w5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1043a implements InterfaceC1066y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13562a;

    public /* synthetic */ C1043a(int i) {
        this.f13562a = i;
    }

    @Override // w5.InterfaceC1066y
    public final InterfaceC1067z a(ByteBuffer byteBuffer) {
        switch (this.f13562a) {
            case 0:
                return new C1044b();
            case 1:
                C1047e c1047e = new C1047e();
                J4.d dVarD0 = p081p0.c.D0(0, 64);
                ArrayList arrayList = new ArrayList(p089q4.n.P(dVarD0, 10));
                Iterator it = dVarD0.iterator();
                while (((J4.c) it).f1944j) {
                    ((p089q4.y) it).a();
                    arrayList.add(Byte.valueOf(byteBuffer.get()));
                }
                c1047e.f13582a = (Byte[]) arrayList.toArray(new Byte[0]);
                return c1047e;
            case 2:
                C1048f c1048f = new C1048f();
                J4.d dVarD1 = p081p0.c.D0(0, 64);
                ArrayList arrayList2 = new ArrayList(p089q4.n.P(dVarD1, 10));
                Iterator it2 = dVarD1.iterator();
                while (((J4.c) it2).f1944j) {
                    ((p089q4.y) it2).a();
                    arrayList2.add(Byte.valueOf(byteBuffer.get()));
                }
                c1048f.f13588a = (Byte[]) arrayList2.toArray(new Byte[0]);
                return c1048f;
            case 3:
                C1049g c1049g = new C1049g();
                c1049g.f13592a = byteBuffer.get();
                c1049g.f13593b = byteBuffer.get();
                return c1049g;
            case 4:
                return new C1050h();
            case 5:
                return new C1051i();
            case 6:
                return new C1052j();
            case 7:
                return new C1053k();
            case 8:
                return new C1054l();
            case 9:
                return new C1055m();
            case 10:
                return new C1056n();
            case 11:
                return new C1057o();
            case 12:
                return new C1058p();
            case 13:
                return new C1059q();
            case 14:
                r rVar = new r();
                rVar.f13651a = byteBuffer.get();
                rVar.f13652b = byteBuffer.get();
                rVar.f13653c = byteBuffer.get();
                rVar.f13654d = byteBuffer.get();
                rVar.f13655e = byteBuffer.get();
                rVar.f13656f = byteBuffer.get();
                return rVar;
            case 15:
                return new C1060s();
            case 16:
                return new C1061t();
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                return new C1062u();
            case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                return new B();
            case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                return new C();
            case 20:
                D d6 = new D();
                d6.f13468a = byteBuffer.get();
                d6.f13469b = new C1063v(byteBuffer);
                d6.f13470c = byteBuffer.getInt();
                return d6;
            case 21:
                E e6 = new E();
                e6.f13472a = byteBuffer.getShort();
                e6.f13473b = byteBuffer.getInt();
                return e6;
            case 22:
                F f6 = new F();
                f6.f13475a = byteBuffer.get();
                f6.f13476b = byteBuffer.get();
                f6.f13477c = new C1063v(byteBuffer);
                f6.f13478d = byteBuffer.getInt();
                f6.f13479e = byteBuffer.getFloat();
                f6.f13480f = byteBuffer.getShort();
                q5.n nVar = n0.i;
                byte b6 = byteBuffer.get();
                nVar.getClass();
                Object obj = n0.f13643j.get(Byte.valueOf(b6));
                if (obj == null) {
                    obj = n0.UNKNOWN;
                }
                f6.f13481g = (n0) obj;
                return f6;
            case 23:
                G g6 = new G();
                g6.f13483a = byteBuffer.get();
                g6.f13484b = byteBuffer.get();
                g6.f13485c = new C1063v(byteBuffer);
                g6.f13486d = byteBuffer.getInt();
                g6.f13487e = byteBuffer.getFloat();
                g6.f13488f = byteBuffer.getShort();
                q5.n nVar2 = n0.i;
                byte b7 = byteBuffer.get();
                nVar2.getClass();
                Object obj2 = n0.f13643j.get(Byte.valueOf(b7));
                if (obj2 == null) {
                    obj2 = n0.UNKNOWN;
                }
                g6.f13489g = (n0) obj2;
                g6.f13490h = byteBuffer.get();
                g6.i = byteBuffer.get();
                g6.f13491j = byteBuffer.get();
                g6.f13492k = byteBuffer.get();
                return g6;
            case 24:
                H h6 = new H();
                h6.f13494a = new C1063v(byteBuffer);
                h6.f13495b = byteBuffer.getShort();
                h6.f13496c = byteBuffer.getShort();
                h6.f13497d = p020d2.n.y(byteBuffer);
                h6.f13498e = byteBuffer.getLong();
                return h6;
            case 25:
                I i = new I();
                i.f13500a = byteBuffer.getShort();
                return i;
            case 26:
                M m6 = new M();
                m6.f13512a = byteBuffer.get();
                m6.f13513b = byteBuffer.get();
                m6.f13514c = new C1063v(byteBuffer);
                m6.f13515d = byteBuffer.getInt();
                p085q.b bVar = EnumC1045c.i;
                byte b8 = byteBuffer.get();
                bVar.getClass();
                Object obj3 = EnumC1045c.f13570j.get(Byte.valueOf(b8));
                if (obj3 == null) {
                    obj3 = EnumC1045c.UNKNOWN;
                }
                m6.f13516e = (EnumC1045c) obj3;
                return m6;
            case 27:
                N n6 = new N();
                J4.d dVarD2 = p081p0.c.D0(0, 16);
                ArrayList arrayList3 = new ArrayList(p089q4.n.P(dVarD2, 10));
                Iterator it3 = dVarD2.iterator();
                while (((J4.c) it3).f1944j) {
                    ((p089q4.y) it3).a();
                    arrayList3.add(Byte.valueOf(byteBuffer.get()));
                }
                n6.f13518a = (Byte[]) arrayList3.toArray(new Byte[0]);
                n6.f13519b = p020d2.n.y(byteBuffer);
                n6.f13520c = byteBuffer.getLong();
                return n6;
            case 28:
                O o6 = new O();
                o6.f13522a = byteBuffer.getShort();
                return o6;
            default:
                P p6 = new P();
                p6.f13524a = p020d2.n.y(byteBuffer);
                return p6;
        }
    }
}

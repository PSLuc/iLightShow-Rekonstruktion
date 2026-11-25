package w5;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements InterfaceC1066y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13525a;

    @Override // w5.InterfaceC1066y
    public final InterfaceC1067z a(ByteBuffer byteBuffer) {
        switch (this.f13525a) {
            case 0:
                S s6 = new S();
                J4.d dVarD0 = p081p0.c.D0(0, 16);
                ArrayList arrayList = new ArrayList(p089q4.n.P(dVarD0, 10));
                Iterator it = dVarD0.iterator();
                while (((J4.c) it).f1944j) {
                    ((p089q4.y) it).a();
                    arrayList.add(Byte.valueOf(byteBuffer.get()));
                }
                s6.f13527a = (Byte[]) arrayList.toArray(new Byte[0]);
                s6.f13528b = p020d2.n.y(byteBuffer);
                s6.f13529c = byteBuffer.getLong();
                return s6;
            case 1:
                T t6 = new T();
                t6.f13531a = byteBuffer.getShort();
                return t6;
            case 2:
                U u6 = new U();
                u6.f13532a = byteBuffer.get();
                u6.f13533b = byteBuffer.get();
                u6.f13534c = byteBuffer.get();
                u6.f13535d = byteBuffer.get();
                u6.f13536e = byteBuffer.get();
                u6.f13537f = byteBuffer.get();
                u6.f13538g = byteBuffer.getInt();
                J4.d dVarD1 = p081p0.c.D0(0, 64);
                ArrayList arrayList2 = new ArrayList(p089q4.n.P(dVarD1, 10));
                Iterator it2 = dVarD1.iterator();
                while (((J4.c) it2).f1944j) {
                    ((p089q4.y) it2).a();
                    arrayList2.add(new C1063v(byteBuffer));
                }
                u6.f13539h = (C1063v[]) arrayList2.toArray(new C1063v[0]);
                return u6;
            case 3:
                V v6 = new V();
                v6.f13541a = byteBuffer.get();
                v6.f13542b = byteBuffer.getShort();
                v6.f13543c = byteBuffer.getFloat();
                v6.f13544d = byteBuffer.getFloat();
                return v6;
            case 4:
                W w6 = new W();
                w6.f13546a = byteBuffer.get();
                J4.d dVarD2 = p081p0.c.D0(0, 16);
                ArrayList arrayList3 = new ArrayList(p089q4.n.P(dVarD2, 10));
                Iterator it3 = dVarD2.iterator();
                while (((J4.c) it3).f1944j) {
                    ((p089q4.y) it3).a();
                    m0 m0Var = new m0();
                    m0Var.f13627a = byteBuffer.getShort();
                    m0Var.f13628b = byteBuffer.getShort();
                    m0Var.f13629c = byteBuffer.getShort();
                    m0Var.f13630d = byteBuffer.getShort();
                    m0Var.f13631e = byteBuffer.getFloat();
                    m0Var.f13632f = byteBuffer.getFloat();
                    m0Var.f13633g = byteBuffer.get();
                    m0Var.f13634h = byteBuffer.get();
                    m0Var.i = byteBuffer.get();
                    m0Var.f13635j = byteBuffer.getInt();
                    m0Var.f13636k = byteBuffer.getInt();
                    m0Var.f13637l = byteBuffer.getInt();
                    m0Var.f13638m = byteBuffer.getLong();
                    m0Var.f13639n = byteBuffer.getLong();
                    m0Var.f13640o = byteBuffer.getInt();
                    m0Var.f13641p = byteBuffer.getInt();
                    arrayList3.add(m0Var);
                }
                w6.f13547b = (m0[]) arrayList3.toArray(new m0[0]);
                w6.f13548c = byteBuffer.get();
                return w6;
            case 5:
                X x6 = new X();
                J4.d dVarD3 = p081p0.c.D0(0, 16);
                ArrayList arrayList4 = new ArrayList(p089q4.n.P(dVarD3, 10));
                Iterator it4 = dVarD3.iterator();
                while (((J4.c) it4).f1944j) {
                    ((p089q4.y) it4).a();
                    arrayList4.add(Byte.valueOf(byteBuffer.get()));
                }
                x6.f13550a = (Byte[]) arrayList4.toArray(new Byte[0]);
                x6.f13551b = p020d2.n.y(byteBuffer);
                x6.f13552c = byteBuffer.getLong();
                return x6;
            case 6:
                Y y2 = new Y();
                y2.f13554a = byteBuffer.getLong();
                y2.f13555b = byteBuffer.getLong();
                y2.f13556c = byteBuffer.getInt();
                return y2;
            case 7:
                Z z5 = new Z();
                z5.f13558a = byteBuffer.getFloat();
                z5.f13559b = byteBuffer.getInt();
                z5.f13560c = byteBuffer.getInt();
                z5.f13561d = byteBuffer.getShort();
                return z5;
            case 8:
                a0 a0Var = new a0();
                a0Var.f13564a = byteBuffer.getLong();
                a0Var.f13565b = byteBuffer.getLong();
                a0Var.f13566c = byteBuffer.getLong();
                return a0Var;
            case 9:
                b0 b0Var = new b0();
                b0Var.f13569a = byteBuffer.getShort();
                return b0Var;
            case 10:
                c0 c0Var = new c0();
                c0Var.f13575a = p020d2.n.y(byteBuffer);
                return c0Var;
            case 11:
                d0 d0Var = new d0();
                J4.d dVarD4 = p081p0.c.D0(0, 16);
                ArrayList arrayList5 = new ArrayList(p089q4.n.P(dVarD4, 10));
                Iterator it5 = dVarD4.iterator();
                while (((J4.c) it5).f1944j) {
                    ((p089q4.y) it5).a();
                    arrayList5.add(Byte.valueOf(byteBuffer.get()));
                }
                d0Var.f13578a = (Byte[]) arrayList5.toArray(new Byte[0]);
                d0Var.f13579b = p020d2.n.y(byteBuffer);
                d0Var.f13580c = byteBuffer.getLong();
                return d0Var;
            case 12:
                e0 e0Var = new e0();
                e0Var.f13584a = byteBuffer.get();
                e0Var.f13585b = byteBuffer.get();
                J4.d dVarD5 = p081p0.c.D0(0, 8);
                ArrayList arrayList6 = new ArrayList(p089q4.n.P(dVarD5, 10));
                Iterator it6 = dVarD5.iterator();
                while (((J4.c) it6).f1944j) {
                    ((p089q4.y) it6).a();
                    arrayList6.add(new C1063v(byteBuffer));
                }
                e0Var.f13586c = (C1063v[]) arrayList6.toArray(new C1063v[0]);
                return e0Var;
            case 13:
                f0 f0Var = new f0();
                f0Var.f13590a = byteBuffer.getShort();
                return f0Var;
            case 14:
                g0 g0Var = new g0();
                p085q.b bVar = L.i;
                byte b6 = byteBuffer.get();
                bVar.getClass();
                Object obj = L.f13507j.get(Byte.valueOf(b6));
                if (obj == null) {
                    obj = L.UNKNOWN;
                }
                g0Var.f13595a = (L) obj;
                g0Var.f13596b = byteBuffer.getInt();
                return g0Var;
            case 15:
                h0 h0Var = new h0();
                h0Var.f13599a = byteBuffer.get();
                h0Var.f13600b = byteBuffer.get();
                h0Var.f13601c = byteBuffer.get();
                h0Var.f13602d = byteBuffer.get();
                h0Var.f13603e = byteBuffer.get();
                J4.d dVarD6 = p081p0.c.D0(0, 64);
                ArrayList arrayList7 = new ArrayList(p089q4.n.P(dVarD6, 10));
                Iterator it7 = dVarD6.iterator();
                while (((J4.c) it7).f1944j) {
                    ((p089q4.y) it7).a();
                    arrayList7.add(new C1063v(byteBuffer));
                }
                h0Var.f13604f = (C1063v[]) arrayList7.toArray(new C1063v[0]);
                return h0Var;
            case 16:
                i0 i0Var = new i0();
                i0Var.f13607a = byteBuffer.getInt();
                i0Var.f13608b = byteBuffer.getInt();
                i0Var.f13609c = byteBuffer.getInt();
                return i0Var;
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                j0 j0Var = new j0();
                j0Var.f13612a = byteBuffer.getLong();
                j0Var.f13613b = byteBuffer.getLong();
                j0Var.f13614c = byteBuffer.getInt();
                return j0Var;
            case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                k0 k0Var = new k0();
                k0Var.f13617a = byteBuffer.getFloat();
                k0Var.f13618b = byteBuffer.getInt();
                k0Var.f13619c = byteBuffer.getInt();
                k0Var.f13620d = byteBuffer.getShort();
                return k0Var;
            default:
                l0 l0Var = new l0();
                l0Var.f13623a = byteBuffer.get();
                l0Var.f13624b = byteBuffer.get();
                l0Var.f13625c = new C1063v(byteBuffer);
                return l0Var;
        }
    }
}

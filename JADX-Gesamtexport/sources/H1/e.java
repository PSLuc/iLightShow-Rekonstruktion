package H1;

import D.x;
import E4.k;
import F.C0068j;
import F1.S;
import android.os.Bundle;
import e5.o;
import java.util.LinkedHashMap;
import okhttp3.internal.http2.Settings;
import p015c2.AbstractC0473d;
import p084p4.q;
import p084p4.s;
import p084p4.v;

/* JADX INFO: loaded from: classes.dex */
public final class e extends p027e3.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1760j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Z2.f f1761k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f1762l;

    public e(Bundle bundle, LinkedHashMap linkedHashMap) {
        this.f1760j = 0;
        this.f1761k = f5.a.f9006a;
        this.f1762l = new C0068j(new x(bundle, 3, linkedHashMap));
    }

    @Override // p027e3.a, b5.c
    public Object A(Y4.a aVar) {
        switch (this.f1760j) {
            case 0:
                k.f("deserializer", aVar);
                return ((C0068j) this.f1762l).e();
            default:
                return super.A(aVar);
        }
    }

    @Override // p027e3.a
    public Object W() {
        switch (this.f1760j) {
            case 0:
                return ((C0068j) this.f1762l).e();
            default:
                return super.W();
        }
    }

    @Override // b5.a
    public final Z2.f c() {
        switch (this.f1760j) {
            case 0:
                break;
        }
        return this.f1761k;
    }

    @Override // p027e3.a, b5.c
    public long d() {
        switch (this.f1760j) {
            case 1:
                o oVar = (o) this.f1762l;
                String strJ = oVar.j();
                try {
                    k.f("<this>", strJ);
                    s sVarX = AbstractC0473d.X(strJ);
                    if (sVarX != null) {
                        return sVarX.f10862h;
                    }
                    M4.s.R(strJ);
                    throw null;
                } catch (IllegalArgumentException unused) {
                    o.m(oVar, "Failed to parse type 'ULong' for input '" + strJ + '\'', 0, null, 6);
                    throw null;
                }
            default:
                return super.d();
        }
    }

    @Override // p027e3.a, b5.c
    public boolean g() {
        switch (this.f1760j) {
            case 0:
                C0068j c0068j = (C0068j) this.f1762l;
                x xVar = (x) c0068j.f1183c;
                String str = (String) c0068j.f1184d;
                S s6 = (S) ((LinkedHashMap) xVar.f707j).get(str);
                return !((s6 != null ? s6.a(str, (Bundle) xVar.i) : null) == null);
            default:
                return super.g();
        }
    }

    @Override // b5.a
    public final int k(a5.g gVar) {
        String strF;
        x xVar;
        switch (this.f1760j) {
            case 0:
                k.f("descriptor", gVar);
                C0068j c0068j = (C0068j) this.f1762l;
                c0068j.getClass();
                int i = c0068j.f1182b;
                do {
                    i++;
                    if (i >= gVar.e()) {
                        return -1;
                    }
                    strF = gVar.f(i);
                    xVar = (x) c0068j.f1183c;
                    k.f("key", strF);
                } while (!((Bundle) xVar.i).containsKey(strF));
                c0068j.f1182b = i;
                c0068j.f1184d = strF;
                return i;
            default:
                k.f("descriptor", gVar);
                throw new IllegalStateException("unsupported");
        }
    }

    @Override // p027e3.a, b5.c
    public int q() {
        switch (this.f1760j) {
            case 1:
                o oVar = (o) this.f1762l;
                String strJ = oVar.j();
                try {
                    return AbstractC0473d.V(strJ);
                } catch (IllegalArgumentException unused) {
                    o.m(oVar, "Failed to parse type 'UInt' for input '" + strJ + '\'', 0, null, 6);
                    throw null;
                }
            default:
                return super.q();
        }
    }

    @Override // p027e3.a, b5.c
    public byte s() {
        p084p4.o oVar;
        switch (this.f1760j) {
            case 1:
                o oVar2 = (o) this.f1762l;
                String strJ = oVar2.j();
                try {
                    k.f("<this>", strJ);
                    q qVarW = AbstractC0473d.W(strJ);
                    if (qVarW != null) {
                        int i = qVarW.f10860h;
                        oVar = Integer.compareUnsigned(i, 255) > 0 ? null : new p084p4.o((byte) i);
                    }
                    if (oVar != null) {
                        return oVar.f10858h;
                    }
                    M4.s.R(strJ);
                    throw null;
                } catch (IllegalArgumentException unused) {
                    o.m(oVar2, "Failed to parse type 'UByte' for input '" + strJ + '\'', 0, null, 6);
                    throw null;
                }
            default:
                return super.s();
        }
    }

    @Override // p027e3.a, b5.c
    public short x() {
        v vVar;
        switch (this.f1760j) {
            case 1:
                o oVar = (o) this.f1762l;
                String strJ = oVar.j();
                try {
                    k.f("<this>", strJ);
                    q qVarW = AbstractC0473d.W(strJ);
                    if (qVarW != null) {
                        int i = qVarW.f10860h;
                        vVar = Integer.compareUnsigned(i, Settings.DEFAULT_INITIAL_WINDOW_SIZE) > 0 ? null : new v((short) i);
                    }
                    if (vVar != null) {
                        return vVar.f10865h;
                    }
                    M4.s.R(strJ);
                    throw null;
                } catch (IllegalArgumentException unused) {
                    o.m(oVar, "Failed to parse type 'UShort' for input '" + strJ + '\'', 0, null, 6);
                    throw null;
                }
            default:
                return super.x();
        }
    }

    public e(o oVar, d5.c cVar) {
        this.f1760j = 1;
        k.f("json", cVar);
        this.f1762l = oVar;
        this.f1761k = cVar.f8596b;
    }
}
